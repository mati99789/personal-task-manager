package model;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Represent a task in the Personal Task Manager
 * Each task has a unique identifier, title, description,
 * due date, priority level, and current status.
 */
public class Task {
	private UUID id;
	private String title;
	private String description;
	private LocalDate dueDate;
	private Priority priority;
	private Status Status;

	public Task() {
	}

	public Task(String title, String description, LocalDate dueDate) {
		this(title, description, dueDate, Priority.MEDIUM, model.Status.TODO);
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
	}

	public Task(String title, String description, LocalDate dueDate, Priority priority, model.Status status) {
		this.id = UUID.randomUUID();
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		Status = status;
	}

	public UUID getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if(description == null || description.trim().isEmpty()) {
			throw new IllegalArgumentException("Description cannot be null or empty");
		}
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		if(dueDate == null || dueDate.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Due date cannot be null or in the past");
		}
		this.dueDate = dueDate;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public model.Status getStatus() {
		return Status;
	}

	public void setStatus(model.Status status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Task{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", dueDate=" + dueDate +
				", priority=" + priority +
				", Status=" + Status +
				'}';
	}
}
