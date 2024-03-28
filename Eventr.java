/* Code Authors:
		Fabian Ramirez - framir2@clemson.edu
    Colin Wunch -
    Tien Nguyen -
    Nick Bunge -
    Jing Siong Yu -
*/


/*
	Purpose:
  	Eventr is program that will simulate a mobile application and our prototype.

  Functions:

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main extends JFrame {
    // create an array which we will use to randomize events.
    private int counter = 0;
    private String[] imageNames = {"eventr_birdwatching_info.png","eventr_birdwatching.png","eventr_volleyball.png","eventr_volleyball_info.png"};
		private JLabel displayField;
    public Main() {
        initUI();
    }

    private void initUI() {
        setTitle("Eventr");
        setSize(400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            ImageIcon image = new ImageIcon(getClass().getResource(imageNames[counter]));
            displayField = new JLabel(image);
            add(displayField);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pack();
        setVisible(true);

        addMouseListener(new ButtonClickListener());
    }

    private class ButtonClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            counter = (counter + 1);
            try {
                ImageIcon image = new ImageIcon(getClass().getResource(imageNames[counter]));
                displayField.setIcon(image);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main program = new Main();
            program.setVisible(true);
        });
    }
}


