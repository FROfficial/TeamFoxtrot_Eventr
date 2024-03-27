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
import java.io.IOException;


public class Main extends JFrame {
    private JPanel image;

    public Main(){
        initUI();
    }

    private void initUI(){
        setTitle("Eventr");
        setSize(400,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
           Main program = new Main();
           program.setVisible(true);
        });
    }
}


