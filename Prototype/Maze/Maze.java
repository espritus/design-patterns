package project.com;

import java.util.*;

public class Maze implements Prototype{
    private Map<Integer, Room> rooms = new HashMap<Integer, Room>();
    public Maze(Map<Integer,Room> room){
        rooms = room;
    }
    public Maze(){
    }
    public int getSize(){
        return rooms.size();
    }
    public int listing() {
        Set<Integer> keys = rooms.keySet();
        for (Integer key : keys){
            System.out.println(key);
        }
        return 777;
    }
    public void addRoom (Room r) { rooms.put (r.getRoomNo(), r); }
    public Room roomNo(int r) { return rooms.get (r); }
    public Maze clone(){
      //  System.out.println(rooms);
        return new Maze();
    }
}