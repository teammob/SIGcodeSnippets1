package package1;

/* As the part of the sepration of concern, we must separate business and model structure
* */

/**
 * @author yucelzengin
 * @version 1.0
 */
public class Data {
    private boolean aValue;
    private String bValue;
    private int cValue;
    private final long id;

    public boolean isaValue() {
        return aValue;
    }

    public void setaValue(boolean aValue) {
        this.aValue = aValue;
    }

    public String getbValue() {
        return bValue;
    }

    public void setbValue(String bValue) {
        this.bValue = bValue;
    }

    public int getcValue() {
        return cValue;
    }

    public void setcValue(int cValue) {
        this.cValue = cValue;
    }

    public long getId() {
        return id;
    }

    public Data(boolean aValue, String bValue, int cValue, long id) {
        this.aValue = aValue;
        this.bValue = bValue;
        this.cValue = cValue;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "aValue=" + aValue +
                ", bValue='" + bValue + '\'' +
                ", cValue=" + cValue +
                ", id=" + id +
                '}';
    }
}