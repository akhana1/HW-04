package com.Csc340.Assignment4.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping("/create")
    public String addNewTask(Task task) {
        taskService.addNewTask(task);
        return "redirect:/task";
    }

    @GetMapping("/{taskId}")
    public String viewTask(@PathVariable int taskId, Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        return "taskById";
    }

    @PutMapping("/update/{id}")
    public String updatedTaskById(@PathVariable int id, Model model) {
        model.addAttribute("task", taskService.getTaskById(id));
        return "UserTask-Update";
    }

    @PostMapping("update")
    public String taskUpdated(Task task) {
        taskService.Updatetask(task);
        return "Updated-task";
    }

    @GetMapping("delete/{id}")
    public String deleteTask(@PathVariable int id, @PathVariable int goalId) {
        taskService.deletebytaskid(id);
        return "redirect:/task";
    }
}
