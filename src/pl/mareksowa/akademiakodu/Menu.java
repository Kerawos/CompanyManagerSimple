package pl.mareksowa.akademiakodu;

public class Menu {

    private UserPrompt up;
    private Receiver rc;


    public Menu() {
        this.up = new UserPrompt();
        this.rc = new Receiver();
    }

    public void startMenu(){
        boolean working = true;
        String command;
        getUp().displayWelcomeMessage();

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

    private void subMenuEmployee(){

    }

    private void subMenuAsset(){

    }

    private void subMenuCompany(){

    }





    public UserPrompt getUp() {
        return up;
    }

    public Receiver getReceiver() {
        return rc;
    }

}
