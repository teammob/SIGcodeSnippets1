package package1.model;

/* As the part of the sepration of concern, we must separate business and model structure
* */

/**
 * @author yucelzengin
 * @version 1.0
 */
public class MultiData extends cBaseData{
    private boolean aValue;
    private String bValue;


    public MultiData(int cData, long id, boolean aValue, String bValue) {
        super(cData, id);
        this.aValue = aValue;
        this.bValue = bValue;
    }

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
}