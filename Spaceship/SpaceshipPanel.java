
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;


public class SpaceshipPanel extends JPanel
{
    private Point clickPoint = null,  mouseClick = null; // for the mouse actions
    public Random rand;  // generate random numbers
    public int randomX, randomY; // random point
    public boolean laserDone, sound = false; // the flags
    public int laserCount = 0; // counter for clicks
    public Button butn1 = new Button("Reset"); // buttons
    public Button butn2 = new Button("Sound On/Off");
    public AudioClip soundfile;
    //-----------------------------------------------------------------
    //  Constructor: Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public SpaceshipPanel()
    {

        addMouseListener (new DotsListener());
        addMouseMotionListener(new DotsListener());

        setBackground (Color.black);
        setPreferredSize (new Dimension(900, 700));

        butn1.addActionListener(new Butn1Handler());
        butn1.setBackground(Color.white);
        add(butn1);

        butn2.addActionListener(new Butn2Handler());
        butn2.setBackground(Color.white);
        add(butn2);

        //soundfile = getAudioClip(getDocumentBase(), "bonk.au");
        // cannot get the path to work, was using IDE
    }

    //-----------------------------------------------------------------
    //  Draws the spaceship and laser.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        if (clickPoint != null) {
            page.setColor(Color.orange);
            page.fillOval(clickPoint.x + 20, clickPoint.y - 15, 30, 30);
            page.setColor(Color.blue);
            page.fillOval(clickPoint.x, clickPoint.y, 70, 30);
        }
        if ( laserDone != true)
        {
            rand = new Random();           //gets numbers for random laser lines
            randomX = rand.nextInt(800);
            randomY = rand.nextInt(600);
            page.setColor(Color.cyan);
            page.drawLine(mouseClick.x+20, mouseClick.y, (randomX + 70), (randomY + 90));
            laserCount++;            // count of clicks
            laserDone = true;       // keeps the laser off when you move the spaceship
        }
        page.setColor(Color.white);
        page.drawString ("Count: " + laserCount, 5, 595);
    }

        //*****************************************************************
    //  Represents the listener for mouse events.
    //*****************************************************************
      private class DotsListener implements MouseListener, MouseMotionListener
    {
        //--------------------------------------------------------------
        //  Adds the current point to the list of points and redraws
        //  the panel whenever the mouse button is pressed.
        //--------------------------------------------------------------
        private int mX, mY;
        public void mouseMoved (MouseEvent event)
        {
            clickPoint = event.getPoint();
            repaint();
        }

        //--------------------------------------------------------------
        //  Provide empty definitions for unused event methods.
        //--------------------------------------------------------------
        public void mouseDragged (MouseEvent event) {}
        public void mousePressed (MouseEvent event)
        {
            mouseClick = event.getPoint();
            if (sound != false)
                soundfile.play();
            repaint();
            laserDone = false;
        }
        public void mouseClicked (MouseEvent event) {}
        public void mouseReleased (MouseEvent event) {}
        public void mouseEntered (MouseEvent event) {}
        public void mouseExited (MouseEvent event) {}
    }
    //-----------------------------------------------------
    //  Button 1 Listener and instructions
    //-----------------------------------------------------
    public class Butn1Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            laserCount = 0;
        }
    }
    //-----------------------------------------------------
    //   Button 2 Listener and instructions
    //------------------------------------------------------
    public class Butn2Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ( sound == false)
                sound = true;
            else
                sound = false;
        }
    }
}
