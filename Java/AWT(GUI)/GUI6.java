//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(300,600);
        fobj.setVisible(true);

        JButton bobj = new JButton("Submit");
        fobj.add(bobj);
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj){}
}   

class GUI6
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA49");
    }
}