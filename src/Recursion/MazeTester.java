package Recursion;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan=new Scanner (System.in);
        System.out.println ("enter the name of the file containing the maze");
        String fileName=scan.nextLine ();


        Maze labyrinth=new Maze (fileName);//throws file exc
        System.out.println (labyrinth);
        MazeSolver solver=new MazeSolver (labyrinth);

        if (solver.traverse (0,0))
            System.out.println ("The maze was succesfly traversed");
        else
            System.out.println ("There is no posibble path");
        System.out.println (labyrinth);


    }
}
