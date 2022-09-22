package com.codebay.goldeneye;

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
    public String index() {
        
        ArrayList<String> spain = new ArrayList<>(
            Arrays.asList("Research & development", "Business")
        );
        ArrayList<String> milan = new ArrayList<>(
            Arrays.asList("Design", "Business", "Advertising")
        );
        ArrayList<String> newYork = new ArrayList<>(
            Arrays.asList("Business", "Advertising")
        );
        ArrayList<ArrayList<String>> departments = new ArrayList<>(Arrays.asList(spain, milan, newYork));
        Offices.setDepartments(departments);
        
        //for (int i = 0; i < departments.size(); i++) {
        //    System.out.println(departments.get(i));
        //    for (int j = 0; j < departments.indexOf(i); j++) {
        //        System.out.println(departments.get(i).get(j));
        //    }
        //
        return "index";
    }

    @PostMapping("/")
    public String showGeneratedAddress(@ModelAttribute Employee employee) {
        System.out.println(employee);
        
        return "index";
    }
}
