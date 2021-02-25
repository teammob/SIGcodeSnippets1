package main.java.snippets.app;

import main.java.snippets.model.BaseData;
import main.java.snippets.model.MultiData;

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
        List<BaseData> theArray= new ArrayList<BaseData>();
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
    private List<BaseData> getFilteredData(List<MultiData> data, String s){
        List<BaseData> theArray= new ArrayList<BaseData>();
        data.stream().filter(d -> d.isaValue() && d.getbValue()==s)
                .map(d -> new BaseData(d.getcValue(),d.getId()))
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
    boolean isValid(List<BaseData> a, String b) {
        if (a.size() == 0 || b.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
