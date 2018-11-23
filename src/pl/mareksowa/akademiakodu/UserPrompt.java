package pl.mareksowa.akademiakodu;

public class UserPrompt {
    private Printer printer;


    public UserPrompt() {
        this.printer = new Printer();
    }

    public void displayCompanyNewCompany(){
        getPrinter().displayToUser("Nie stworzono firmy!");
    }

    public void displayCompanNewName(){
        getPrinter().displayToUser("Wprowadz nowa nazwe firmy i potwierdz enterem: ");
    }

    public void displayCompanyNewHeadQuaters(){
        getPrinter().displayToUser("Wprowadz nowa siedzibe firmy i potwierdz enterem: ");
    }

    public void displayCompanyNewValue(){
        getPrinter().displayToUser("Wprowadz nowy stan majatkowy firmy i potwierdz enterem: ");
    }

    public void displayCompanyNewEmployLimit(){
        getPrinter().displayToUser("Wprowadz nowy stan liczby pracownikow i potwierdz enterem: ");
    }

    public void displayCompanyNewAssetLimit(){
        getPrinter().displayToUser("Wprowadz nowy stan liczby assetow i potwierdz enterem: ");
    }

    public void displayCompanySucces(){
        getPrinter().displayToUser("Zmiany w firmie zakonczone sukcesem");
    }

    public void displayEmployeeAddName(){
        getPrinter().displayToUser("wprowadz imie i nazwisko pracownika");
    }

    public void displayEmployeeAddExc(){
        getPrinter().displayToUser("wprowadz doswiadczenie pracownika");
    }

    public void displayEmployeeAddSalary(){
        getPrinter().displayToUser("wprowadz wynagrodzenie pracownika");
    }

    public void displayEmployeeAddSuccess(){
        getPrinter().displayToUser("nie udalo sie dokonac zmian pracownika");
    }

    public void displayEmployeeAddFail(){
        getPrinter().displayToUser("wprowadz imie nowego pracownika");
    }



    public void displayWelcomeMessage(){
        getPrinter().displayToUser( "Witaj w aplikacji 'TWOJA FIRMA'");
    }


    public void displayOptionsMessage(){
        getPrinter().displayToUser("\n" + "wprowadz cyfre i zatwierdz enterem by: \n" +
                "'1' zarzadzanie pracownikami \n" +
                "'2' zarzadzanie aktywami \n" +
                "'3' zarzadzanie firma \n" +
                "'4' wyjscie z programu");
    }

    public void displayOptionsEmployeMessage(){
        getPrinter().displayToUser("\n" + "wprowadz cyfre i zatwierdz enterem by: \n" +
                "'1' zatrudnij pracownika \n" +
                "'2' zwolnij pracownika \n" +
                "'3' edycja pracownika \n" +
                "'4' powrót");
    }

    public void displayUnknownCommand(){
        getPrinter().displayToUser("nierozpoznano komendy");
    }

    public void displayGettingBack(){
        getPrinter().displayToUser("powrót");
    }

    public void displayGoodbyeMessage(){
        getPrinter().displayToUser("Dziekujemy ze skozystales z naszej apliakcji, do zobaczenia!");
    }

    public void displayEmployeeSizeError(){
        getPrinter().displayToUser("Niestety nie mozna zmodyfikowac ilosci miejsc pracownikow, " +
                "sprawdz ilosc pracownikow.");
    }

    public Printer getPrinter() {
        return printer;
    }

    public void displayOptionsCompanyMessage() {
        getPrinter().displayToUser("\n" + "wprowadz cyfre i zatwierdz enterem by: \n" +
                "'1' wyswietl dane firmy \n" +
                "'2' zmien siedzibe firmy \n" +
                "'3' zmien limit pracownikow\n" +
                "'4' zmien limit assetow \n" +
                "'5' powrot \n");
    }

    public void displayCompanyStats(Company company){
        getPrinter().displayToUser("Firma: " + company.getName() +
                "\n Siedziba: " + company.getHeadquaters() +
                "\n Majatek: " + company.getMoney());
    }
}
