package Queens;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class Viewer {
    private static final int Width=400;
    private static final int Height=400;
    private static final int LEFT_X=250;
    private static final int TOP_Y=250;

    public static void main(String[] args) {
        int startingColumn=2;
        ControlPanel panel=new ControlPanel(startingColumn);
        JFrame frame=  new JFrame ("Viewer");

    }
}
