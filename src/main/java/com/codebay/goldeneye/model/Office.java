package com.codebay.goldeneye.model;

import java.util.ArrayList;

public class Office {
    
    
    /**
     * Name of the offices
     */
    private String name;

    /**
     * Gets the office name
     * 
     * @return string
     */
    public String getName() {
        return name;
    }

    public Office(String name, ArrayList<String> departments) {
        this.name = name;
        this.departments = departments;
        Office.setOffice(this);
    }

    /**
     * Departments of the office
     */
    public ArrayList<String> departments;
    
    /**
     * Sets the office name
     *
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets all inserted Offices
     */
    //private static String departments[];
    
    private static ArrayList<Office> allOffices = new ArrayList<>();

    /**
     * Gets the departments of the offices
     *
     * @return array
     */
    public static ArrayList<Office> getOffices() {
        return Office.allOffices;
    }

    /**
     * Sets the departments of the offices
     *
     * @param office Departments of the office
     */
    private static void setOffice(Office office) {
        Office.allOffices.add(office);
    }
    
    /**
     * Clears all the offices
     * 
     * 
     */
    public static void clearOffices() {
        Office.allOffices.clear();
    }
}
