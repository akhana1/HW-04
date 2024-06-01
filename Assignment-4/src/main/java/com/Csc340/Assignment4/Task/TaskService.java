package com.Csc340.Assignment4.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public void addNewTask(Task task) {
        taskRepository.save(task);
    }

    public Task getTaskById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void Updatetask (Task task) {
        taskRepository.save(task);
    }

    public void deletebytaskid(int id) {
        taskRepository.deleteById(id);
    }
}
