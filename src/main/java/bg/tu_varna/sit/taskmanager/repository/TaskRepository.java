package bg.tu_varna.sit.taskmanager.repository;

import bg.tu_varna.sit.taskmanager.model.Task;

public interface TaskRepository {
    Task createTask(Task task);
}
