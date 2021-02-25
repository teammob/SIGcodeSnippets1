package package1;

public class Data2 {

    private int cData;
    private final long id;

    public int getcData() {
        return cData;
    }

    public void setcData(int cData) {
        this.cData = cData;
    }

    public long getId() {
        return id;
    }

    public Data2(int cData, long id) {
        this.cData = cData;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "cData=" + cData +
                ", id=" + id +
                '}';
    }
}