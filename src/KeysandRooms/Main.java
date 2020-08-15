package KeysandRooms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        if(rooms == null || rooms.size() == 0 || rooms.get(0).size() == 0) return true;

        HashSet<Integer> visited = new HashSet();
        dfs(rooms, 0, visited);
        System.out.println("result");
        System.out.println(visited.size());
        System.out.println(rooms.size());

        return visited.size() == rooms.size();
    }

    private static void dfs(List<List<Integer>> rooms, int cur, HashSet<Integer> visited){
        if(visited.contains(cur)) return;
        visited.add(cur);

        for(int key : rooms.get(cur)){
            dfs(rooms, key, visited);
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        rooms.add(temp);

        temp = new ArrayList<>();
        temp.add(1); temp.add(1);
        rooms.add(temp);

        temp = new ArrayList<>();
        temp.add(2); temp.add(2);
        rooms.add(temp);

        canVisitAllRooms(rooms);



    }


}
