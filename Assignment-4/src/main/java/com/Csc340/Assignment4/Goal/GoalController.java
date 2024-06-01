package com.Csc340.Assignment4.Goal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/goal")
public class GoalController {

    @Autowired
    GoalService goalService;

    @GetMapping("/all")
    public String getAllGoals (Model model) {
        model.addAttribute("goalList", goalService.getAllGoals());
        return "goal-list";
    }

    @PostMapping("/create")
    public String addNewGoal(Goal goal){
        goalService.addNewGoal(goal);
        return"redirect:/goal/all";

    }

    @GetMapping("/{id}")
    public String getGoalById(@PathVariable int id, Model model){
        model.addAttribute("goal", goalService.getGoalById(id));
        return "goal-detail";

    }

    @PutMapping("/update")
    public String updateGoal(Goal goal){
        goalService.addNewGoal(goal);
        return "redirect:/goal/all";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model){
        model.addAttribute("goal",goalService.getGoalById(id));
        return "goal-update";
    }

    @DeleteMapping("delete/{id}")
    public String deleteGoalById(@PathVariable int id){
        goalService.deleteGoalbyId(id);
        return "redirect:/goal/update";
    }
}
