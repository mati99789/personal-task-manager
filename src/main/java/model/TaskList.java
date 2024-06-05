package model;

import enums.Priority;
import enums.Status;

import java.util.*;
import java.util.stream.Collectors;

public class TaskList {
	private List<Task> tasks;

	public TaskList() {
		this.tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		if(task != null) {
			throw new IllegalArgumentException("Task cannot be null");
		}

		tasks.add(task);
	}

	public List<Task> getTasks() {
		return new ArrayList<>(tasks);
	}

	public Task getTaskByiD(UUID iD) {
		for(Task task : tasks) {
			if(task.getId().equals(iD)) {
				return task;
			}
		}
		return null;
	}

	public boolean removeTask(UUID id) {
		return tasks.removeIf(task -> task.getId().equals(id));
	}

	public boolean updateTaskStatus(UUID id, Status newStatus) {
		var task = getTaskByiD(id);

		if(task != null) {
			task.setStatus(newStatus);
			return true;
		}

		return false;
	}

	public List<Task> getTasksByStatus(Status status) {
		var result = new ArrayList<Task>();

		for(Task task : tasks) {
			if(task.getStatus().equals(status)) {
				result.add(task);
			}
		}

		return result;
	}

	public List<Task> getOverdueTasks() {
		return tasks.stream().filter(Task::isOverdue).collect(Collectors.toList());
	}

	public void sortByDueDate() {
		tasks.sort(Comparator.comparing(Task::getDueDate));
	}

	public List<Task> getHighPriorityTasksSortedBNyTitle() {
		return tasks.stream()
				.filter(task -> task.getPriority() == Priority.HIGH)
				.sorted(Comparator.comparing(Task::getTitle))
				.collect(Collectors.toList());
	}

	public Map<Status, Long> getTaskCountByStatus() {
		return tasks.stream().collect(Collectors.groupingBy(Task::getStatus, Collectors.counting()));
	}

}
