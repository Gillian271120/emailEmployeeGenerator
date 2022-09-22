package com.codebay.goldeneye.model;

public class Employee {

    /**
     * Name of the employee
     */
    private String name;
    /**
     * Surname of the employee
     */
    private String surname;
    
    /**
     * Office of the employee
     */
    private String office;
    /**
     * Department of the employee
     */
    private String department;

    /*
    * Gets the name of the Employee
    *
    * @return String Name of the employee
    */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the employee
     * 
     * @param name Name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the surname of the employee
     * 
     * @return String Surname of the employee
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the employee
     * 
     * @param surname Surname of the employee
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the office of the employee
     * 
     * @return String Office of the employee
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the office of the employee
     * 
     * @param office Office of the employee
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * Gets the department of the employee
     * 
     * @return String Department of the employee
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the employee
     * 
     * @param department Department of the employee
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", office=" + office + ", department=" + department + '}';
    }
}
