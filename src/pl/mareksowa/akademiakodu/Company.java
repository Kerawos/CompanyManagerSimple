package pl.mareksowa.akademiakodu;

public class Company {

    private String name;
    private String headquaters;
    private Employee[] employes;
    private Asset[] assets;
    private int money;

    public Company(String name, String headquaters, int assetSize, int employeeSize, int money) {
        this.name = name;
        this.headquaters = headquaters;
        this.employes = new Employee[employeeSize];
        this.assets = new Asset[assetSize];
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadquaters() {
        return headquaters;
    }

    public void setHeadquaters(String headquaters) {
        this.headquaters = headquaters;
    }

    public Employee[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employee[] employes) {
        this.employes = employes;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
