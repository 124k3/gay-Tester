 

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * GameUI hadles the creation of all the UI componets in the game
 * 
 * The class makes extensive use of Java Swing Gui library.
 * @version 1.1
 * @author 124k3
 *
 */
public class GameUI {
    // --------------------------instance variable(s)

    // --------------------------constructor(s)

    public GameUI() {
        createWindow();
    }


    // --------------------------method(s)

    public void createWindow()
    {
        // main parent window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720,480);
        centerWindow(frame);
        frame.setVisible(true);

    }

    /**
     * Centers the frame/ window
     * @param frame The JFrame Object i.e the parent window.
     *
     */
    private static void centerWindow(JFrame frame)
    {
        // get screen size
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenDimension = toolkit.getScreenSize();

        // get size of frame
        Dimension frameDimension = frame.getSize();

        // getting the x, y cord to center the window
        int xCord = (screenDimension.width - frameDimension.width) / 2;
        int yCord = (screenDimension.height - frameDimension.height) / 2;

        frame.setLocation(xCord, yCord);
    }


    public static void main(String[] args)
    {
        GameUI gameUI = new GameUI();

    }

}
