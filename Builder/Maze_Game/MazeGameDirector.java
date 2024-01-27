package project.com;

public class MazeGameDirector {
    private MazeBuilder mz;

   public void setMazeBuilder(MazeBuilder mz){
       this.mz = mz;
   }

   public void createMaze(){
       this.mz.buildMaze();
       this.mz.buildRoom(3);
       Room r1 = new Room(1);
       Room r2 = new Room(2);
       this.mz.buildDoorWall(r1,r2);

       r1.setSide(Direction.EAST,	new Wall());
       r1.setSide(Direction.SOUTH,	new Wall());
       r1.setSide(Direction.WEST,	new Wall());
       r2.setSide(Direction.NORTH,	new Wall());
       r2.setSide(Direction.EAST,	new Wall());
   }

}
