package pl.mareksowa.akademiakodu;

public class Menu {

    private Printer pr;
    private Reciver rc;

    public Menu() {
        this.pr = new Printer();
        this.rc = new Reciver();
    }

    public void startMenu(){
        displayWelcomeMessage();


    }

    private void displayWelcomeMessage(){
        getPrinter().displayToUser("Witaj w aplikacji 'TWOJA FIRMA'");
    }



    public Printer getPrinter() {
        return pr;
    }

    public Reciver getReciver() {
        return rc;
    }
}
