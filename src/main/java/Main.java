import enums.Priority;
import enums.Status;
import model.Task;
import repository.TaskList;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
	public static void main(String[] args) {
		TaskList taskList = new TaskList();

		taskList.addTask(new Task("Finish Java Basics", LocalDate.of(2024, 6, 15), Priority.HIGH, Status.IN_PROGRESS));
		taskList.addTask(new Task("Read Design Patterns", LocalDate.of(2024, 7, 1), Priority.MEDIUM, Status.TODO));
		taskList.addTask(new Task("Set Up GitHub", LocalDate.of(2024, 6, 1), Priority.HIGH, Status.TODO));

		System.out.println("All tasks: " + taskList.getTasks());

		UUID taskId = taskList.getTasks().get(0).getId();
		taskList.updateTaskStatus(taskId, Status.DONE);
		System.out.println("After updating status: " + taskList.getTaskByiD(taskId));

		System.out.println("High priority tasks: " + taskList.getHighPriorityTasksSortedBNyTitle());
		System.out.println("Task counts: " + taskList.getTaskCountByStatus());

		taskList.sortByDueDate();
		System.out.println("Sorted by due date: " + taskList.getTasks());
	}
}
