package chap20;

import java.util.ArrayList;
import java.util.HashMap;

public class problem01 {
    public static void main(String[] args){
        ArrayList<player> baseballPlayer = new ArrayList<>();

        baseballPlayer.add(new player("Jill", "Huang", "Gators"));
        baseballPlayer.add(new player("Janko", "Barton", "Sharks"));
        baseballPlayer.add(new player("Wanda", "Vakulskas", "Sharks"));
        baseballPlayer.add(new player("Jill", "Moloney", "Gators"));
        baseballPlayer.add(new player("Luuk", "Watkins", "Gators"));

        ArrayList<player> footballPlayer = new ArrayList<>();

        footballPlayer.add(new player("Hanzla", "Radosti", "32ers"));
        footballPlayer.add(new player("Tina", "Watkins", "Barleycorns"));
        footballPlayer.add(new player("Alex", "Patel", "32ers"));
        footballPlayer.add(new player("Jill", "Huang", "Barleycorns"));
        footballPlayer.add(new player("Wanda", "Vakulskas", "Barleycorns"));

        System.out.println(commonPlayer(baseballPlayer, footballPlayer));
    }

        public static ArrayList<String> commonPlayer(ArrayList<player> baseball, ArrayList<player> football){
            ArrayList<String> result = new ArrayList<>();

            HashMap<String, Boolean> playerHashMap = new HashMap<>();

            for (player a:
                 baseball) {
                playerHashMap.put(a.getFullName(), true);
            }

            for (player b:
                 football) {

                if(playerHashMap.get(b.getFullName()) != null){
                    result.add(b.getFullName());
                }
            }

            return result;
        }
}
