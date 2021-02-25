package package1.model;

public class cBaseData {

    private int cValue;
    private final long id;

    public int getcValue() {
        return cValue;
    }

    public void setcValue(int cValue) {
        this.cValue = cValue;
    }

    public long getId() {
        return id;
    }

    public cBaseData(int cValue, long id) {
        this.cValue = cValue;
        this.id = id;
    }

}