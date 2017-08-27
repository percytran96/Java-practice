//Star class draw stars in the skyline

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Star
{
    private int x,y;
    private Color color;
    public Star(){}
    public void draw (Graphics page)
    {
        page.setColor(color.black);
        Random rand = new Random();
        x = rand.nextInt(700);
        y = rand.nextInt(500);
        page.fillRect(x,y,3,3);
    }
    
       
}
