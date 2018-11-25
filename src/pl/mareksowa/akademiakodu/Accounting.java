package pl.mareksowa.akademiakodu;

public class Accounting {
    private UserPrompt up;

    public Accounting() {
        this.up = new UserPrompt();
    }

    public Company buildCompany(String nameCompany, int valueCompany, String hedquaters, int employeeSize, int assetSize){
        return new Company(nameCompany, hedquaters, assetSize, employeeSize, valueCompany);
    }

    public void employeeEditLimit(Company company, int newLimit){
        if (newLimit<0){
            getUp().displayEmployeeSizeError();
            return;
        }
        Employee[] newEmployee = new Employee[newLimit];
        if (newLimit>=company.getEmployes().length){
            for (int i = 0; i < company.getEmployes().length; i++) {
                if (company.getEmployes()[i]!=null){
                    newEmployee[i] = company.getEmployes()[i];
                }
            }
        } else {
            for (int i = 0; i < company.getEmployes().length; i++) {
                if (newLimit>=i-1) {
                    if (company.getEmployes()[i] != null) {
                        getUp().displayEmployeeSizeError();
                    }
                } else {
                    newEmployee[i] = company.getEmployes()[i];
                }
                break;
            }
        }
        company.setEmployes(newEmployee);
    }

    public void employeeHire(Company company, Employee employee){
         for (int i = 0; i < company.getEmployes().length; i++) {
            if (company.getEmployes()[i]==null){
                company.getEmployes()[i]=employee;
                getUp().displayEmployeHireSucces(employee);
                return;
            }
        }
        getUp().displayEmployeHireError(employee);
    }






    public UserPrompt getUp() {
        return up;
    }
}
