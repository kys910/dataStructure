package chap18;

import java.util.ArrayList;

public class ysGraph<T, T2> {
    private T t;
    private ArrayList<T2> t2 = new ArrayList<>();

    public ysGraph(T a, ArrayList<T2> b){
        t = a;
        t2 = b;
    }

    public ysGraph(T a, T2[] b){
        t = a;
        for (int i = 0; i < b.length; i++) {
            t2.add(b[i]);
        }
    }

    public void setData(T a, ArrayList<T2> b){
        t = a;
        t2 = b;
    }

    public void setData(T a, T2[] b){
        t = a;
        for (int i = 0; i < b.length; i++) {
            t2.add(b[i]);
        }
    }

    public void getData(){
        System.out.println("vertex : " + t);

        for (T2 edge : t2) {
            System.out.println("edge : " + edge);
        }
    }

    public T getT() {
        return t;
    }

    public ArrayList<T2> getT2() {
        return t2;
    }
}