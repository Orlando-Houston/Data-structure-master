package Recursion;

public class MazeSolver {
    private Maze maze;

    public MazeSolver(Maze maze) {
        this.maze = maze;

    }

    public boolean traverse(int row, int column) {
        boolean done = false;
        if (maze.validPosition (row, column)) {
            maze.tryPosition (row, column);
            if (row == maze.getRows () - 1 && column == maze.getColumns () - 1)
                done = true;
         else {
            done = traverse (row + 1, column);//down
            if (!done)
                done = traverse (row + 1, column + 1);//right
            if (!done)
                done = traverse (row - 1, column);//up
            if (!done)
                done = traverse (row, column - 1);//left

        }
        if (done)//this location is part of the final path
            maze.markPath (row, column);

    }
        return done;

} }


