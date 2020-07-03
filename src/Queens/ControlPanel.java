package Queens;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ControlPanel extends JPanel {

    private static final long serialVersionUID=5L;
    private static final int SIZE=8;
    private String imageLocation;
    private ImageIcon queenIcon;
    private Image queenImage;
    private int[ ]rowPosition;
    private int startingColumn;


    private int[]queens=new int[SIZE];

    public ControlPanel(){
        this(0);
    }
    public ControlPanel(int start) {
        startingColumn = start;
        imageLocation = "images" + File.separator + "queen.jpg";
        queenIcon = new ImageIcon (imageLocation);
        rowPosition = new int[SIZE];

    }
    public void draw(Graphics _graphics){
        if (search(0,startingColumn)){
            drawQueens (_graphics);
            drawChessBoard(_graphics);
        }
    }
    public void drawChessBoard(Graphics _graphics){
        for (int i=0;i<SIZE;i++){
            _graphics.drawLine (0, i * getHeight () / SIZE,getWidth (),i*getHeight ()/SIZE);
            _graphics.drawLine (i*getWidth ()/SIZE,0,i*getWidth ()/SIZE,getHeight ());

        }


    }
    public void drawQueens(Graphics _graphics){
        int j;
        int imageX=0;
        int imageY=0;
        int imageWidth=0;
        int imageHeight=0;


        if (queenImage!=null){
            for (int i=0;i<SIZE;i++){
                j=rowPosition[i];
                imageX=j*getWidth ()/SIZE;
                imageX=j*getHeight ()/SIZE;
                imageWidth=getWidth ()/SIZE;
                imageHeight=getHeight ()/SIZE;
                _graphics.drawImage(queenImage,imageX,imageY,imageWidth,imageHeight,this);

            }
        }

    }
    public boolean isSafe(int row,int col){
        for (int i=1;i<=row;i++){
            if (queens[row-i]==col||queens[row-i]==col-i||queens[row-i]==(col+i))
                return false;
        }
        return true;

    }
    public void paintComponent(Graphics _graphics){
        super.paintComponent (_graphics);
        draw (_graphics);

    }
    public boolean search(int row,int start){
        if (row>=SIZE)
            return true;
        for (int i=0;i<SIZE;i++){
            queens[row]=i;
            if (isSafe (row,i)&&search (row+1,i))
                return true;
        }
        return false;

    }

}
