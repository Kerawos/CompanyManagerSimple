package pl.mareksowa.akademiakodu;

public class Menu {

    private UserPrompt up;
    private Receiver rc;
    private Accounting acc;
    private Company company;



    public Menu() {
        this.up = new UserPrompt();
        this.rc = new Receiver();
        this.acc = new Accounting();
    }

    public void startMenu(){
        boolean working = true;
        String command;
        getUp().displayWelcomeMessage();
        createCompany();
        do {
            getUp().displayOptionsMessage();
            command = getReceiver().getInputString();
            switch (command){
                case "1":{
                    subMenuEmployee();
                    break;
                }
                case "2":{
                    subMenuAsset();
                    break;
                }
                case "3":{
                    subMenuCompany();
                    break;
                }
                case "4":{
                    getUp().displayGoodbyeMessage();
                    working = false;
                    break;
                }
                default:{
                    getUp().displayUnknownCommand();
                    break;
                }
            }
        }while (working);

    }

    private void createCompany(){
        String command;
        getUp().displayCompanyNewCompany();
        getUp().displayCompanNewName();
        String name = getReceiver().getInputString();
        getUp().displayCompanyNewHeadQuaters();
        String headQuaters = getReceiver().getInputString();
        getUp().displayCompanyNewValue();
        int value = Integer.parseInt(getReceiver().getInputString());
        getUp().displayCompanyNewEmployLimit();
        int employeeLimit = Integer.parseInt(getReceiver().getInputString());
        getUp().displayCompanyNewAssetLimit();
        int assetLimit = Integer.parseInt(getReceiver().getInputString());
        setCompany(getAcc().buildCompany(name, value, headQuaters, employeeLimit, assetLimit));
        getUp().displayCompanySucces();
    }



    private void subMenuEmployee(){
        String command;
        boolean working = true;
        do {
            getUp().displayOptionsEmployeMessage();
            command = getReceiver().getInputString();
            switch (command) {
                case "1": {
                    subMenuEmployeeAdd();
                    break;
                }
                case "2": {
                    subMenuEmployeeDelete();
                    break;
                }
                case "3":{
                    subMenuEmployeeEdit();
                    break;
                }
                case "4": {
                    getUp().displayGettingBack();
                    working = false;
                    break;
                }
                default: {
                    getUp().displayUnknownCommand();
                    break;
                }
            }
        } while (working);

    }

    private void subMenuEmployeeAdd(){

    }

    private void subMenuEmployeeDelete(){

    }

    private void subMenuEmployeeEdit(){

    }

    private void subMenuAsset(){

    }


    private void subMenuCompany(){
        String command;
        boolean working = true;
        do {
            getUp().displayOptionsCompanyMessage();
            command = getReceiver().getInputString();
            switch (command) {
                case "1": {
                    getUp().displayCompanyNewHeadQuaters();
                    getCompany().setHeadquaters(getReceiver().getInputString());
                    getUp().displayCompanySucces();
                    break;
                }
                case "2": {
                    //limit pracownikow
                    break;
                }
                case "3":{
                    //limit assetow
                    break;
                }
                case "4": {
                    getUp().displayGettingBack();
                    working = false;
                    break;
                }
                default: {
                    getUp().displayUnknownCommand();
                    break;
                }
            }
        } while (working);

    }






    public UserPrompt getUp() {
        return up;
    }

    public Accounting getAcc() {
        return acc;
    }

    public Receiver getReceiver() {
        return rc;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
