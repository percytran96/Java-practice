/*RandomSkyline program draw a picture of some random buildings and skyline
   *@author Khang Tran
   *@version 1.0
    *@since 03/10/2017
    *@course CS111B Spring 2017
    */
  /*Algorithms
    *create Building class
    *create Star class
    *create SkylinePanel class
    *create driver program Skyline
    */

import java.awt.*;
import javax.swing.*;

//Driver program uses to execute other classes
public class RandomSkyline
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Skyline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SkylinePanel());

        frame.pack();
        frame.setVisible(true);
    }
}
