package chap18;

import java.util.*;

public class dijkstra {
    public static void main(String[] args){
        HashMap<String, ysArrowGraph> ysGraphHashMap = new HashMap<>();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("El Paso", 80);
        ysGraphHashMap.put("Chicago", new ysArrowGraph("Chicago", hm));

        hm = new HashMap<>();
        hm.put("El Paso", 140);
        hm.put("Chicago", 40);
        ysGraphHashMap.put("Denver", new ysArrowGraph("Denver", hm));

        hm = new HashMap<>();
        hm.put("Chicago", 120);
        hm.put("Denver", 180);
        ysGraphHashMap.put("Boston", new ysArrowGraph("Boston", hm));

        hm = new HashMap<>();
        hm.put("Boston", 100);
        ysGraphHashMap.put("El Paso", new ysArrowGraph("El Paso", hm));

        hm = new HashMap<>();
        hm.put("Denver", 160);
        hm.put("Boston", 100);
        ysGraphHashMap.put("Atlanta", new ysArrowGraph("Atlanta", hm));

        for(Map.Entry<String, ysArrowGraph> elem : ysGraphHashMap.entrySet()){
            System.out.println("키 : " + elem.getKey() + " | 값 : " + elem.getValue());
        }

        dijkstra(ysGraphHashMap);
    }

    static private <Interger> void dijkstra(HashMap<String, ysArrowGraph> ysGraphHashMap){
        HashMap<String, Integer> cheapest_prices_table = new HashMap<>();
        HashMap<String, String> cheapest_previous_stopover_city_table = new HashMap<>();
        HashMap<String, Boolean> visted_cities = new HashMap<>();
        ArrayList<String> unvisted_cities = new ArrayList<>();

        /*
        for (String key : ysGraphHashMap.keySet()) {
            unvisted_cities.add(key);
        }
         */
        cheapest_prices_table.put("Atlanta", 0);

        String current_city = "Atlanta";

        while(current_city != null){
            visted_cities.put(current_city, true);
            int check = unvisted_cities.indexOf(current_city);
            if(check != -1) {
                unvisted_cities.remove(check);
            }

            ysArrowGraph yg = ysGraphHashMap.get(current_city);

            for(Object key : yg.getT2().keySet()){
                String city = (String)key;
                if(visted_cities.get(city) == null){
                    unvisted_cities.add((String)key);
                }
                int price_through_current_city = 0;
                if(cheapest_prices_table.get(current_city) != null){
                    price_through_current_city = cheapest_prices_table.get(current_city) + (int)yg.getCityPrice(city);
                }

                if(cheapest_prices_table.get(city) != null){
                    if(price_through_current_city < cheapest_prices_table.get(city)){
                        cheapest_prices_table.put(city, price_through_current_city);
                        cheapest_previous_stopover_city_table.put(city, current_city);
                    }
                }

                HashMap<String, Integer> hm = yg.getT2();

                if(cheapest_prices_table.get(current_city) != null){
                    int minCity = cheapest_prices_table.get(current_city);
                    current_city = null;
                    for(Object keys : yg.getT2().keySet()) {
                        if(hm.get(keys) == minCity){
                            if(visted_cities.get(keys) == null){
                                current_city = (String)keys;
                            }
                        }
                    }
                }else{
                    current_city = null;
                }
                //current_city = cheapest_prices_table.get(current_city);
                //current_city = unvisted_cities.get()
            }
        }
        System.out.println(cheapest_prices_table.toString());
        System.out.println(cheapest_previous_stopover_city_table);
    }
}
