/*Display list of magazine
 *@author Khang Trab
 *@version 1.0
 *@since 05/12/2017
 */

/*Algorithms
 *Modify MagazineList.java
 *Create MagazineViewPanel
 *Create MagazineView driver
 */

import javax.swing.*;
public class MagazineView {

    public static void main (String[] args)
        {
            JFrame frame = new JFrame ("Magazine View");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.getContentPane().add(new MagazineViewPanel());

            frame.pack();
            frame.setVisible(true);
        }
}
