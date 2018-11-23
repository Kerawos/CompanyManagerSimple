package pl.mareksowa.akademiakodu;

public class Employee {

    private String name;
    private int experiance;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int experiance, int salary) {
        this.name = name;
        this.experiance = experiance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
