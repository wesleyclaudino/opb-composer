package com.onepercentbetter.api.service;

import com.onepercentbetter.api.domain.task.Task;
import com.onepercentbetter.api.domain.task.TaskRequestDTO;
import com.onepercentbetter.api.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(TaskRequestDTO data) {
        Task task = new Task();
        task.setName(data.name());
        task.setDescription(data.description());
        task.setCategoryList(data.categoryList());
        task.setState(data.state());
        task.setCreationDate(data.creationDate());
        task.setLastUpdateDate(data.lastUpdateDate());
        task.setReminderDate(data.reminderDate());

        taskRepository.save(task);
        return task;
    }
}
