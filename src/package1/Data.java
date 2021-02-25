package package1;

/* As the part of the sepration of concern, we must separate business and model structure
* */

/**
 * @author yucelzengin
 * @version 1.0
 */
public class Data {
    private boolean a;
    private String b;
    private int c;
    private final long id;

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getId() {
        return id;
    }

    public Data(boolean a, String b, int c, long id) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.id = id;
    }
}