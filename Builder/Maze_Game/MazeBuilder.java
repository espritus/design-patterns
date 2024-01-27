package project.com;

public interface MazeBuilder {
    public void buildMaze();
    public void buildRoom(int roomNo);
    public void buildDoorWall(Room roomFrom, Room roomTo);
    public Maze getMaze();
}
