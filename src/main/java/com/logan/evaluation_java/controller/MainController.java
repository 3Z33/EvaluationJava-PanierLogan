package com.logan.evaluation_java.controller;

import com.logan.evaluation_java.model.Task;
import com.logan.evaluation_java.model.User;
import com.logan.evaluation_java.repository.TaskRepository;
import com.logan.evaluation_java.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public MainController(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Task> tasks = taskRepository.findAll();
        List<User> users = userRepository.findAll();
        
        model.addAttribute("tasks", tasks);
        model.addAttribute("users", users);
        model.addAttribute("totalTasks", tasks.size());
        model.addAttribute("totalUsers", users.size());
        
        return "index";
    }

    @GetMapping("/web/tasks")
    public String tasksList(Model model) {
        List<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @GetMapping("/web/users")
    public String usersList(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }
}
