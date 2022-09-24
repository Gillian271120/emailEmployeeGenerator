package com.codebay.goldeneye.controller;

import com.codebay.goldeneye.model.Employee;
import com.codebay.goldeneye.model.Office;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        
        
        new Office("Spain", new ArrayList<>(
                Arrays.asList("Research & development","Business")
        ));
        
        
        new Office("Milan",new ArrayList<>(
                Arrays.asList("Research & development","Business", "Design")
        ));
        
        new Office("New York",new ArrayList<>(
                Arrays.asList("Business", "Advertising")
        ));

                
        model.addAttribute("offices", Office.getOffices());
        return "index";
    }

    @PostMapping("/")
    public String showGeneratedAddress(@ModelAttribute Employee employee, Model model) {;
        if (
            employee.getName().length() == 0 ||
            employee.getSurname().length() == 0 || 
            employee.getDepartment().length() == 0 ||
            employee.getOffice().length() == 0
            )
        {
            model.addAttribute("error", "All fieds are required and must not be empty");
            model.addAttribute("offices", Office.getOffices());
        } else {
        
            String email = 
                employee.getName().charAt(0) +
                employee.getSurname().replaceAll(" ", "")+
                "." +
                employee.getDepartment().replaceAll(" ", "") +
                "@" +
                employee.getOffice() +
                "." +
                "goldeneye.com";

            email = email.toLowerCase();

            // Set your API request here
        
            email = "The Email is: " + email;
            model.addAttribute("email", email);
            model.addAttribute("offices", Office.getOffices());
        }
        
        
        return "index";
    }
}
