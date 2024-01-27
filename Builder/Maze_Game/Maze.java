package project.com;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map <Integer, Room> rooms = new HashMap <Integer, Room>();

    public void addRoom (Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo (int r) {
        return rooms.get (r);
    }
    public void listRooom(){
        System.out.println(rooms);
    }
}
   enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
}

class Room {
    private Map<Direction, Wall> sides = new HashMap<Direction, Wall>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }


    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }
    public int getRoomNo(){
        return this.roomNo;
    }
}
class Wall {
}
class DoorWall extends Wall {
    private Room r1;
    private Room r2;
    private boolean isOpen;

    public DoorWall(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.isOpen = false;
    }
}

