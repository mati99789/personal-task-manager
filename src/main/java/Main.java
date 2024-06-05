import enums.Priority;
import enums.Status;
import model.Task;
import model.TaskList;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		TaskList taskList = new TaskList();

		taskList.addTask(new Task("Finish Java Basics", LocalDate.of(2024, 6, 15), Priority.HIGH, Status.IN_PROGRESS));
		taskList.addTask(new Task("Read Design Patterns", LocalDate.of(2024, 7, 1), Priority.MEDIUM, Status.TODO));
		taskList.addTask(new Task("Set Up GitHub", LocalDate.of(2024, 6, 1), Priority.HIGH, Status.TODO));

	}
}
