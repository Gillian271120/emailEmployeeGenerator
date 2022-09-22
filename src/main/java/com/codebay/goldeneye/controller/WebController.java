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
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        
        Office.clearOffices();
        ArrayList<String> departments = new ArrayList<>(
                Arrays.asList("Research & development","Business")
        );
        Office spain = new Office("Spain",departments);
        
        departments.clear();
        departments.addAll(Arrays.asList("Research & development","Business"));
        Office milan = new Office("Milan",departments);
        
        departments.clear();
        departments.addAll(Arrays.asList("Business", "Advertising"));
        Office newYork = new Office("New York",departments);
        
        System.out.println(Office.getOffices());
        
        //for (int i = 0; i < departments.size(); i++) {
        //    System.out.println(departments.get(i));
        //    for (int j = 0; j < departments.indexOf(i); j++) {
        //        System.out.println(departments.get(i).get(j));
        //    }
        //}
        System.out.println(spain.departments);
        model.addAttribute("spain", spain.departments);
        //model.addAttribute("offices", Office.getOffices());
        return "index";
    }

    @PostMapping("/")
    public String showGeneratedAddress(@ModelAttribute Employee employee) {
        System.out.println(employee);
        
        return "index";
    }
}
