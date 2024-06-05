package model;

import java.time.LocalDate;

public class Task {
	 private long id;
	private String title;
	private String description;
	private LocalDate dueDate;
	private Priority priority;
	private Status Status;

	public Task() {
	}

	public Task(String title, String description, LocalDate dueDate, Priority priority, model.Status status) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		Status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
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
