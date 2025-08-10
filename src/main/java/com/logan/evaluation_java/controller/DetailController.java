package com.logan.evaluation_java.controller;

import com.logan.evaluation_java.model.Task;
import com.logan.evaluation_java.model.User;
import com.logan.evaluation_java.repository.TaskRepository;
import com.logan.evaluation_java.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class DetailController {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public DetailController(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/web/tasks/{id}")
    public String taskDetail(@PathVariable Long id, Model model) {
        Optional<Task> taskOpt = taskRepository.findById(id);
        if (taskOpt.isPresent()) {
            Task task = taskOpt.get();
            model.addAttribute("task", task);
            return "task-detail";
        } else {
            model.addAttribute("error", "Tâche non trouvée");
            return "error";
        }
    }

    @GetMapping("/web/users/{id}")
    public String userDetail(@PathVariable Long id, Model model) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            model.addAttribute("user", user);
            return "user-detail";
        } else {
            model.addAttribute("error", "Utilisateur non trouvé");
            return "error";
        }
    }
}
