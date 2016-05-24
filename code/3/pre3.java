import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pre3 extends JApplet implements ActionListener {
	JButton up,down,left,right;
	ImageIcon img;
	int x=100 , y = 100;
	public void init(){
		setSize(600,400);
		img = new ImageIcon("torres.jpeg");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		up = new JButton("up");
		up.addActionListener(this);
		c.add(up);
		
		down = new JButton("down");
		down.addActionListener(this);
		c.add(down);
		
		left = new JButton("left");
		left.addActionListener(this);
		c.add(left);
		
		right = new JButton("right");
		right.addActionListener(this);
		c.add(right);
		
	}
	public void paint(Graphics g){
		super.paint(g);
		img.paintIcon(this,g,x,y);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == up) {
			y -=20;
			repaint();
		}else if (e.getSource() == down) {
			y+=20;
			repaint();
		}else if (e.getSource() == left) {
			x+=20;
			repaint();
		}else if (e.getSource() == right) {
			x-=20;
			repaint();
		}
		
	}

}
