//a new class uses to define the drawing of buidings and their windows

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Building
{
   private int x, y, width, height;
   private Color color;


   public Building(int upperX, int upperY, int twidth, int theight)
   {
       x = upperX;
       y = upperY;
       width = twidth;
       height = theight;
   }
   public void draw (Graphics page)
   {
      page.setColor(color.black);
      page.fillRect(x, y, width, height);
      Random rand = new Random();
      for(int i=0;i <= rand.nextInt(176);i++)          //draw windows
      {
      int a= x+rand.nextInt(50)+5;
      int b= y+rand.nextInt(250);
      page.setColor (color.yellow);
      page.fillRect (a,b,3,3);
      }  
  }

   public int getWidth()
   {
      return width;
   }

   public int getHeight()
   {
      return height;
   }

   public void setWidth(int w)
   {
      width = w;
   }

   public void setHeight(int h)
   {
      height = h;
   }

}
