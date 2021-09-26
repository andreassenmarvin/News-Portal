package models;

import java.util.Objects;

public class Department {
    private String name;
    private String description;
    private int employees;
    private int id;

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
        this.employees = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return employees == that.employees &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, employees);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int totalEmployees) {
        this.employees = totalEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void incrementEmployees(){
        this.employees += 1;

    }
    public void decrementEmployees(){
        this.employees -= 1;
    }

}