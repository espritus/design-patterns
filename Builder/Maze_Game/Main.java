package project.com;

public class Main {
    public static void main(String[] args){
        MazeGameBuilder mzb = new MazeGameBuilder();
        MazeGameDirector mgd = new MazeGameDirector();
        mgd.setMazeBuilder(mzb);
        mgd.createMaze();

        Maze aMaze = mzb.getMaze();

    }
}
