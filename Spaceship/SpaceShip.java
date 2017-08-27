/*Spaceship program draws a spaceship that moves by user cursor and shoots laser at each mouse press
 *@author Khang Tran
 *@version 1.0
 *@since 04/08/2017
 *Tools used: IntelliJ IDE, Atom editor
 */

import javax.swing.JFrame;

public class SpaceShip
{
    //-----------------------------------------------------------------
    //  Creates and displays the application frame.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("SpaceShip");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add (new SpaceshipPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
