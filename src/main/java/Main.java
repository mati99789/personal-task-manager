import model.Priority;
import model.Status;
import model.Task;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Task task = new Task("Complete Java Task", "Finish Exercise 1 of Java course", LocalDate.of(2024, 6,10), Priority.HIGH, Status.TODO);

		System.out.println(task);

		task.setStatus(Status.IN_PROGRESS);

		System.out.println("Update status: " + task.getStatus());
	}
}
