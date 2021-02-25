package package1.app;

import package1.model.MultiData;
import package1.model.cBaseData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Snippet1 {

    int total=0;
    private static final String DEFAULT="default";

    /***
     *
     * @param data
     * @param sValue
     * @return
     */
    public boolean update(List<MultiData> data, String sValue) {
        List<cBaseData> theArray= new ArrayList<cBaseData>();
        int total = 0;
        boolean isValidResult;
        final int halfDataSize=data.size()/2;
        int bValueSize=data.stream()
                .filter(d -> d.getbValue()==sValue)
                .collect(Collectors.toList()).size();
        if(bValueSize>halfDataSize){
            theArray= getFilteredData(data,sValue);
            isValidResult= isValid(theArray, sValue);
        }
        else {
            theArray= getFilteredData(data,DEFAULT);
            isValidResult=isValid(theArray, DEFAULT);
        }
        return isValidResult;
    }

    /***
     *
     * @param data
     * @param s
     * @return
     */
    private List<cBaseData> getFilteredData(List<MultiData> data, String s){
        List<cBaseData> theArray= new ArrayList<cBaseData>();
        data.stream().filter(d -> d.isaValue() && d.getbValue()==s)
                .map(d -> new cBaseData(d.getcValue(),d.getId()))
                .forEach(d2 -> theArray.add(d2));
        List<MultiData> filtered = data.stream().filter(d -> d.getbValue() == s &&
                d.isaValue()).collect(Collectors.toList());
        for (int i = 0; i < filtered.size() - 1; i++) {
            total += filtered.get(i).getcValue();
        }
        return theArray;
    }

    /***
     *
     * @param a
     * @param b
     * @return
     */
    boolean isValid(List<cBaseData> a, String b) {
        if (a.size() == 0 || b.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
