package pl.mareksowa.akademiakodu;

public class Menu {

    private Printer pr;
    private Reciver rc;
    private String ls; // line starter

    public Menu() {
        this.pr = new Printer();
        this.rc = new Reciver();
        ls = ">";
    }

    public void startMenu(){
        boolean working = true;
        String command;
        displayWelcomeMessage();
        do {
            displayOptionsMessage();
            command = getReciver().getInputString();
            switch (command){
                case "1":{
                    break;
                }
                case "2":{
                    break;
                }
                case "3":{
                    break;
                }
                case "4":{
                    displayGoodbyeMessage();
                    working = false;
                    break;
                }
                default:{
                    break;
                }
            }
        }while (working);

    }

    private void displayWelcomeMessage(){
        getPrinter().displayToUser(ls+ "Witaj w aplikacji 'TWOJA FIRMA'");
    }

    private void displayOptionsMessage(){
        getPrinter().displayToUser(ls+"wprowadz cyfre i zatwierdz enterem by: /ln" +
                "'1' zarzadzanie pracownikami /ln" +
                "'2' zarzadzanie aktywami /ln" +
                "'3' zarzadzanie firma /ln" +
                "'4' wyjscie z programu");
    }

    private void displayUnknownCommand(){
        getPrinter().displayToUser(ls + "nierozpoznano komendy");
    }

    private void displayGoodbyeMessage(){
        getPrinter().displayToUser(ls+"Dziekujemy ze skozystales z naszej apliakcji, do zobaczenia!");
    }



    public Printer getPrinter() {
        return pr;
    }

    public Reciver getReciver() {
        return rc;
    }
}
