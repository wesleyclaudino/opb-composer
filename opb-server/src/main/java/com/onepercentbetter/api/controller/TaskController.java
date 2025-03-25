package com.onepercentbetter.api.controller;

import com.onepercentbetter.api.domain.task.Task;
import com.onepercentbetter.api.domain.task.TaskRequestDTO;
import com.onepercentbetter.api.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskRequestDTO body) {
        return ResponseEntity.ok(taskService.createTask(body));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Task>> getTask(@PathVariable UUID id) {
        return ResponseEntity.ok(taskService.getTask(id));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTaskList() {
        return ResponseEntity.ok(taskService.getTaskList());
    }
}
