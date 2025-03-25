package com.onepercentbetter.api.service;

import com.onepercentbetter.api.domain.task.Task;
import com.onepercentbetter.api.domain.task.TaskRequestDTO;
import com.onepercentbetter.api.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(TaskRequestDTO data) {
        Task task = new Task();
        task.setName(data.name());
        task.setDescription(data.description());
//        task.setCategoryList(data.categoryList());
        task.setState(data.state());
        task.setCreationDate(data.creationDate());
        task.setLastUpdateDate(data.lastUpdateDate());
        task.setReminderDate(data.reminderDate());

        taskRepository.save(task);
        return task;
    }

    public Optional<Task> getTask(UUID id) {
        return taskRepository.findById(id);
    }

    public List<Task> getTaskList() {
        return taskRepository.findAll();
    }

    public Task updateTask(UUID id, TaskRequestDTO data) {
        Optional<Task> olderTask = taskRepository.findById(id);

        if (olderTask.isPresent()) {
            Task newTask = olderTask.get();
            newTask.setName(data.name());
            newTask.setDescription(data.description());
//          task.setCategoryList(data.categoryList());
            newTask.setState(data.state());
            newTask.setCreationDate(data.creationDate());
            newTask.setLastUpdateDate(data.lastUpdateDate());
            newTask.setReminderDate(data.reminderDate());

            taskRepository.save(newTask);
            return newTask;
        }

        return null;
    }

    public void deleteTask(UUID id) {
        taskRepository.deleteById(id);
    }
}
