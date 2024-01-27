package project.com;

class PrototypeDemo {
    public static void main(String[] argv) throws CloneNotSupportedException {
        Maze game1 = createMaze();
        Maze game2 = game1.clone();
    }

    static Maze createMaze ()  {
        Maze aMaze;
        aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        DoorWall d = new DoorWall (r1, r2);
        aMaze.addRoom (r1);
        aMaze.addRoom (r2);
        r1.setSide(Direction.NORTH, new Wall());
        r1.setSide(Direction.EAST, d);
        r1.setSide(Direction.SOUTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, new Wall());
        r2.setSide(Direction.WEST, d);
        return aMaze;
    }
}
