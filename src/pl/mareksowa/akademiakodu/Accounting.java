package pl.mareksowa.akademiakodu;

public class Accounting {
    private UserPrompt up;

    public Accounting() {
        this.up = new UserPrompt();
    }

    public Company buildCompany(String nameCompany, int valueCompany, String hedquaters, int employeeSize, int assetSize){
        return new Company(nameCompany, hedquaters, assetSize, employeeSize, valueCompany);
    }

    public void editEmployeeLimit(Company company, int newLimit){
        Employee[] newEmployee = new Employee[newLimit];
        if (newLimit>=company.getEmployes().length){
            for (int i = 0; i < company.getEmployes().length; i++) {
                if (company.getEmployes()[i]!=null){
                    newEmployee[i] = company.getEmployes()[i];
                }
            }
            company.setEmployes(newEmployee);
        } else {
            for (int i = 0; i < company.getEmployes().length; i++) {
                if (company.getEmployes()[i]!=null){
                    if (newLimit<i){
                        getUp().displayEmployeeSizeError();
                        break;
                    } else {
                        newEmployee[i] = company.getEmployes()[i];
                    }
                }
            }
        }
    }


    public UserPrompt getUp() {
        return up;
    }
}
