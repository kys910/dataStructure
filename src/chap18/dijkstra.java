package chap18;

import java.util.ArrayList;
import java.util.HashMap;

public class dijkstra {
    public static void main(String[] args){
        ArrayList<ysArrowGraph> dsGraph = new ArrayList<>();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("El Paso", 80);
        dsGraph.add(new ysArrowGraph("Chicago", hm));

        hm = new HashMap<>();
        hm.put("El Paso", 140);
        hm.put("Chicago", 40);
        dsGraph.add(new ysArrowGraph("Denver", hm));

        hm = new HashMap<>();
        hm.put("Chicago", 120);
        hm.put("Denver", 180);
        dsGraph.add(new ysArrowGraph("Boston", hm));

        hm = new HashMap<>();
        hm.put("Boston", 100);
        dsGraph.add(new ysArrowGraph("El Paso", hm));

        hm = new HashMap<>();
        hm.put("Denver", 160);
        hm.put("Boston", 100);
        dsGraph.add(new ysArrowGraph("Atlanta", hm));

        for (int i = 0; i < dsGraph.size(); i++) {
            dsGraph.get(i).getData();
        }
    }

    private void dijkstra(ArrayList<ysArrowGraph> dsGraph){
        HashMap<String, ysArrowGraph> hm = new HashMap<>();
        for (int i = 0; i < dsGraph.size(); i++){
            hm.put((String)dsGraph.get(i).getT(), dsGraph.get(i));
        }


    }
}
