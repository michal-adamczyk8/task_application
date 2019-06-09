package com.tasks.application.service;

import com.tasks.application.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
