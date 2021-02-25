package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Snippet1 {

    //List<Data2> theArray;
    int total=0;
    private static final String DEFAULT="default";

    public boolean update(List<Data> data, String s) {
       List<Data2> theArray= new ArrayList<Data2>();
        //List<Data> filtered= new ArrayList<Data>();
        int total = 0;
        boolean isValidResult;
        final int halfDataSize=data.size()/2;
        int bValueSize=data.stream()
                .filter(d -> d.getB()==s)
                .collect(Collectors.toList()).size();
        if(bValueSize>halfDataSize){
            theArray= getFilteredData(data,s);
            isValidResult= isValid(theArray, s, total);
        }
        else {
            theArray= getFilteredData(data,DEFAULT);
            isValidResult=isValid(theArray, DEFAULT);
        }
        return isValidResult;
    }

    private List<Data2> getFilteredData( List<Data> data,String s){
        List<Data2> theArray= new ArrayList<Data2>();
        data.stream().filter(d -> d.isA() && d.getB()==s)
                .map(d -> new Data2(d.getC(),d.getId()))
                .forEach(d2 -> theArray.add(d2));
        List<Data> filtered = data.stream().filter(d -> d.getB() == s &&
                d.isA()).collect(Collectors.toList());
        for (int i = 0; i < filtered.size() - 1; i++) {
            total += filtered.get(i).getC();
        }
        return theArray;
    }


    boolean isValid(List<Data2> a, String b) {
        if (a.size() == 0 || b.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}