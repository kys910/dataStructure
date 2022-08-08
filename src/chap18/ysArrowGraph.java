package chap18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ysArrowGraph<T, T2, T3> {
    private T t;
    private HashMap<T2, T3> hm = new HashMap<>();

    public ysArrowGraph(T a, HashMap<T2, T3> b){
        t = a;
        hm = b;
    }

    /*
    public ysArrowGraph(T a, T2[] b){
        t = a;
        for (int i = 0; i < b.length; i++) {
            t2.add(b[i]);
        }
    }
     */

    public void setData(T a, HashMap<T2, T3> b){
        t = a;
        hm = b;
    }

    /*
    public void setData(T a, T2[] b){
        t = a;
        for (int i = 0; i < b.length; i++) {
            t2.add(b[i]);
        }
    }
    */

    public void getData(){
        System.out.println("vertex : " + t);

        for(Map.Entry<T2, T3> elem : hm.entrySet()){
            System.out.println("키 : " + elem.getKey() + " | 값 : " + elem.getValue());
        }

        /*
        Iterator<T2> keys = hm.keySet().iterator();
        while(keys.hasNext()){
            T2 key = keys.next();
            System.out.println();
        }

 */
    }

    public T getT() {
        return t;
    }

    public HashMap<T2, T3> getT2() {
        return hm;
    }

    @Override
    public String toString() {
        return "ysGraph{" +
                "t=" + t +
                ", t2=" + hm +
                '}';
    }
}