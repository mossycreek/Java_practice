import javax.swing.*;

//Hellow World type program to get started in Java.

    public class Hello{
	public static void main(String[] args){
	    JFrame frame=new JFrame("Hello, World!");
	    JLabel label=new JLabel("Hello, World!",JLabel.CENTER);
	    frame.getContentPane().add(label);
		frame.setSize(300,300);
	    frame.setVisible(true);    
	    
	}
    }