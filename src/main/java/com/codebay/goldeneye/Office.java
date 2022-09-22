package com.codebay.goldeneye;

public class Office {
    /**
     * Name of the office
     */
    private String name;

    /**
     * Department that the office contains
     */
    private String departments[];
    
    /**
     * Gets the name of the office
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the office
     *
     * @param name Name of the office
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the departments of the office
     *
     * @return array
     */
    public String[] getDepartments() {
        return departments;
    }

    /**
     * Sets the departments of the office
     *
     * @param departments Departments of the office
     */
    public void setDepartments(String[] departments) {
        this.departments = departments;
    }
    
}
