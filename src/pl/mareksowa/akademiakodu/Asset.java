package pl.mareksowa.akademiakodu;

public class Asset {

    private String name;
    private int value;
    private String buyTime;

    public Asset(String name, int value, String buyTime) {
        this.name = name;
        this.value = value;
        this.buyTime = buyTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }
}
