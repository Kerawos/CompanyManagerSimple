package pl.mareksowa.akademiakodu;

import java.util.Scanner;

public class Receiver {

    private Scanner sc;

    public Receiver() {
        this.sc = new Scanner(System.in);
    }

    public String getInputString(){
        return sc.nextLine();
    }
}
