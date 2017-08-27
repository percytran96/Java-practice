// Panel class contains content of the skyline program panel
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SkylinePanel extends JPanel
{
    private Building build;
    private Star sky = new Star();
    private Color color;
    public SkylinePanel()
    {
        setPreferredSize (new Dimension(700,550));
        setBackground (Color.cyan);
    }

    public void paintComponent (Graphics page)
    {
       super.paintComponent(page);
       Random rand = new Random();
       int number = rand.nextInt(9)+7;
       int star = rand.nextInt(275)+220;
       int x = 30, y = 100;
       int currentX = 0;
       int gap = rand.nextInt(35)+20;       //gap between building
       for (int j = 0; j < star; j++)         // draw stars
            sky.draw(page); 
       page.setFont(new Font("default", Font.BOLD, 17));
       page.drawString("Khang Tran's City", 260,30);               //draw names
       
       for (int i = 1; i < number; i++)
         { 
            int width = rand.nextInt(70)+50;
            int height = rand.nextInt(550)+450;
            
            while ( (x + width) < 690 )                            //buildings stay within view
            {
            build = new Building(x,y,width,height);           //draw building
            build.draw(page);
            currentX += 30 + width;
            x = currentX + gap;
            y = rand.nextInt(120)+90;
            }
         }
    }       
}
