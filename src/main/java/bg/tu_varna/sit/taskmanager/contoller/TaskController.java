package bg.tu_varna.sit.taskmanager.contoller;

import bg.tu_varna.sit.taskmanager.model.Task;
import bg.tu_varna.sit.taskmanager.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /*  @GetMapping("/hello/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name;
    }*/
    @PostMapping("/api/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task addedTask = taskService.createTask(task);
        return new ResponseEntity<>(addedTask, HttpStatus.CREATED);
    }
}
