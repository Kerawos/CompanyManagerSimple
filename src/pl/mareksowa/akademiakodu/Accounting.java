package pl.mareksowa.akademiakodu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Accounting {
    private UserPrompt up;

    public Accounting() {
        this.up = new UserPrompt();
    }

    public Company buildCompany(String nameCompany, int valueCompany, String hedquaters, int employeeSize, int assetSize){
        return new Company(nameCompany, hedquaters, assetSize, employeeSize, valueCompany);
    }

    public boolean employeeCanEditLimit(Company company, int newLimit){
        if (newLimit<0){
            return false;
        } else if (newLimit>=company.getEmployes().length){
            return true;
        } else {
            for (int i = 0; i < company.getEmployes().length; i++) {
                if (newLimit>=i-1) {
                    if (company.getEmployes()[i] != null) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } return true;
    }

    public void employeeEditLimit(Company company, int newLimit){
        Employee[] newEmployee = new Employee[newLimit];
        for (int i = 0; i < newEmployee.length; i++) {
            newEmployee[i]=company.getEmployes()[i];
        }
        company.setEmployes(newEmployee);
    }

    public boolean employeeCanHire(Company company, Employee employeeToHire){
        for (int i = 0; i < company.getEmployes().length; i++) {
            if (company.getEmployes()[i].getName().equals(employeeToHire.getName())) {
                return false;
            } else if (company.getEmployes()[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void employeeHire(Company company, Employee employeeToHire){
         for (int i = 0; i < company.getEmployes().length; i++) {
            if (company.getEmployes()[i]==null){
                company.getEmployes()[i]=employeeToHire;
                break;
            }
        }
    }

    public boolean employeeCanHire(Company company){
        for (int i = 0; i < company.getEmployes().length; i++) {
            if (company.getEmployes()[i]==null){
                return true;
            }
        }
        return false;
    }

    public boolean employyeCanDelete(Company company, int employeeIndex){
        if (employeeIndex<0 || employeeIndex>=company.getEmployes().length){
            return false;
        }
        if (company.getEmployes()[employeeIndex]!=null){
            return false;
        }
        return true;
    }

    public void employeeDelete(Company company, int employeeIndex){
        company.getEmployes()[employeeIndex] = null;
        Employee[] newEmployees = new Employee[company.getEmployes().length-1];
        for (int i = 0; i < newEmployees.length; i++) {
            if (i>=employeeIndex){
                newEmployees[i]=company.getEmployes()[i+1];
            }
        }
    }






    public UserPrompt getUp() {
        return up;
    }
}
