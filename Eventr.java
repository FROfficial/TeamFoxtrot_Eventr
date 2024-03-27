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
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main extends JFrame {
    public Main() {
        initUI();
    }

    private void initUI() {
        setTitle("Eventr");
        setSize(400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            ImageIcon image;
            image = new ImageIcon(getClass().getResource("image.jpg"));
            JLabel displayField = new Jlabel(image);
            add(displayField);
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.pack();
        frame.setVisible(true);

        addMouseListener(new ButtonClickListener());
    }

    private class ButtonClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Handle mouse click event here
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main program = new Main();
            program.setVisible(true);
        });
    }
}


