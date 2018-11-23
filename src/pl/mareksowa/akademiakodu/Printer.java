package pl.mareksowa.akademiakodu;

public class Printer {
    private String ls; // line starter

    public Printer() {
        this.ls = ">";;
    }

    public void displayToUser(String toDisplay){
        System.out.println(ls+toDisplay);
    }
}
