package bg.tu_varna.sit.taskmanager.repository.impl;

import bg.tu_varna.sit.taskmanager.model.Task;
import bg.tu_varna.sit.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    private static TaskRepositoryImpl instance;
    private List<Task> taskList;

    private static Long id;

    private TaskRepositoryImpl() {
        taskList = new ArrayList<>();
        id = 1L;
    }

    public static TaskRepositoryImpl getInstance() {
        if(instance==null) {
            instance = new TaskRepositoryImpl();
        }
        return instance;
    }

    @Override
    public Task createTask(Task task) {
        task.setId(id++);
        taskList.add(task);
        return task;
    }
}
