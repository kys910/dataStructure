package chap18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bfsGraph {
    public static void main(String[] args) {
        ArrayList<ysGraph> gral = new ArrayList<>();

        gral.add(new ysGraph("A", new String[]{"B", "C", "D"}));
        gral.add(new ysGraph("B", new String[]{"E", "F"}));
        gral.add(new ysGraph("C", new String[]{"G"}));
        gral.add(new ysGraph("D", new String[]{"H", "I"}));
        gral.add(new ysGraph("E", new String[]{"B", "J"}));
        gral.add(new ysGraph("F", new String[]{"J", "B"}));
        gral.add(new ysGraph("G", new String[]{"K"}));
        gral.add(new ysGraph("H", new String[]{"D", "M", "L"}));
        gral.add(new ysGraph("I", new String[]{"N"}));
        gral.add(new ysGraph("J", new String[]{"O"}));
        gral.add(new ysGraph("K", new String[]{"G"}));
        gral.add(new ysGraph("L", new String[]{"H"}));
        gral.add(new ysGraph("M", new String[]{"H", "I"}));
        gral.add(new ysGraph("N", new String[]{"P"}));
        gral.add(new ysGraph("O", new String[]{"J"}));
        gral.add(new ysGraph("P", new String[]{"N"}));

        System.out.println(bfs(gral));
        System.out.println(bfs(gral, "Z").toString());
    }

    public static String bfs(ArrayList<ysGraph> ys) {
        ArrayList<ysGraph> gral = ys;
        HashMap<String, ysGraph> hashYsGraph = new HashMap<>();
        HashMap<String, Boolean> grHm = new HashMap<>();
        Queue<ysGraph> queue = new LinkedList<ysGraph>();
        String result = "";

        queue.add(gral.get(0));
        grHm.put((String) gral.get(0).getT(), true);

        for (ysGraph ysGraph : ys) {
            hashYsGraph.put((String) ysGraph.getT(), ysGraph);
        }

        while (!queue.isEmpty()) {
            ysGraph yg = queue.poll();
            result = result + yg.getT() + " | ";

            ArrayList<String> al = yg.getT2();

            for (int i = 0; i < al.size(); i++) {
                if (grHm.get(al.get(i)) == null) {
                    queue.add(hashYsGraph.get(al.get(i)));
                    grHm.put(al.get(i), true);
                }
            }
        }
        return result;
    }

    public static ysGraph bfs(ArrayList<ysGraph> ys, String vertex) {
        ArrayList<ysGraph> gral = ys;
        HashMap<String, ysGraph> hashYsGraph = new HashMap<>();
        HashMap<String, Boolean> grHm = new HashMap<>();
        Queue<ysGraph> queue = new LinkedList<ysGraph>();
        ysGraph result = null;

        queue.add(gral.get(0));
        grHm.put((String) gral.get(0).getT(), true);

        for (ysGraph ysGraph : ys) {
            hashYsGraph.put((String) ysGraph.getT(), ysGraph);
        }

        while (!queue.isEmpty()) {
            ysGraph yg = queue.poll();
            if(yg.getT().equals(vertex)){
                result = yg;
                break;
            }
            //result = result + yg.getT() + " | ";

            ArrayList<String> al = yg.getT2();

            for (int i = 0; i < al.size(); i++) {
                if (grHm.get(al.get(i)) == null) {
                    queue.add(hashYsGraph.get(al.get(i)));
                    grHm.put(al.get(i), true);
                }
            }
        }
        return result;
    }
}
