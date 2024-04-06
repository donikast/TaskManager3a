package bg.tu_varna.sit.taskmanager.service.impl;

import bg.tu_varna.sit.taskmanager.model.Task;
import bg.tu_varna.sit.taskmanager.repository.TaskRepository;
import bg.tu_varna.sit.taskmanager.repository.impl.TaskRepositoryImpl;
import bg.tu_varna.sit.taskmanager.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl() {
        taskRepository = TaskRepositoryImpl.getInstance();
    }

    @Override
    public Task createTask(Task task) {
        Task createdTask = taskRepository.createTask(task);
        return createdTask;
    }
}
