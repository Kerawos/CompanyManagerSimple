package pl.mareksowa.akademiakodu;

public class Accounting {

    public Company buildCompany(String nameCompany, int valueCompany, String hedquaters, int employeeSize, int assetSize){
        return new Company(nameCompany, hedquaters, assetSize, employeeSize, valueCompany);
    }





}
