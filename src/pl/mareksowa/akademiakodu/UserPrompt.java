package pl.mareksowa.akademiakodu;

public class UserPrompt {
    private Printer printer;
    private String ls; // line starter

    public UserPrompt() {
        this.printer = new Printer();
        ls = ">";
    }

    public void displayWelcomeMessage(){
        getPrinter().displayToUser(ls+ "Witaj w aplikacji 'TWOJA FIRMA'");
    }


    public void displayOptionsMessage(){
        getPrinter().displayToUser("\n" + ls + "wprowadz cyfre i zatwierdz enterem by: \n" +
                "'1' zarzadzanie pracownikami \n" +
                "'2' zarzadzanie aktywami \n" +
                "'3' zarzadzanie firma \n" +
                "'4' wyjscie z programu");
    }

    public void displayOptionsEmployeMessage(){
        getPrinter().displayToUser("\n" + ls + "wprowadz cyfre i zatwierdz enterem by: \n" +
                "'1' zatrudnij pracownika \n" +
                "'2' zwolnij pracownika \n" +
                "'3' edycja pracownika \n" +
                "'4' powrót");
    }

    public void displayUnknownCommand(){
        getPrinter().displayToUser(ls + "nierozpoznano komendy");
    }

    public void displayGettingBack(){
        getPrinter().displayToUser(ls + "powrót");
    }

    public void displayGoodbyeMessage(){
        getPrinter().displayToUser(ls+"Dziekujemy ze skozystales z naszej apliakcji, do zobaczenia!");
    }

    public Printer getPrinter() {
        return printer;
    }
}
