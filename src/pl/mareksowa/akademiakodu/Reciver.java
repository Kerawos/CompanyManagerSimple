package pl.mareksowa.akademiakodu;

import java.util.Scanner;

public class Reciver {

    private Scanner sc;

    public Reciver() {
        this.sc = new Scanner(System.in);
    }

    public String getInputString(){
        return sc.nextLine();
    }
}
