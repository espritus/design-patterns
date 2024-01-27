package project.com;

public class MazeGameBuilder implements MazeBuilder{
    private Maze mz;
    private Room r;
    private DoorWall d;


    @Override
    public void buildMaze() {
      this.mz = new Maze();
    }

    @Override
    public void buildRoom(int roomNo) {
        this.r = new Room(roomNo);
        this.mz.addRoom(this.r);
    }

    @Override
    public void buildDoorWall(Room roomFrom, Room roomTo) {
     this.d = new DoorWall(roomFrom,roomTo);

    }

    @Override
    public Maze getMaze() {
        return this.mz;
    }
}
