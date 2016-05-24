import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class pre4 extends JApplet implements ActionListener {
	String[] exAr = new String[]{"harry1", "harry2", "harry3", "harry4", "harry5", "harry6","harry7"};
	JButton se;
	JTextField tf;
	int no=0;
	String name;
	ImageIcon img1,img2,img3,img4,img5,img6,img7;
	int press = 0;
	public void init(){
		setSize(400,600);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		img1 = new ImageIcon("h1.jpg");
		img2 = new ImageIcon("h2.jpg");
		img3 = new ImageIcon("h3.jpg");
		img4 = new ImageIcon("h4.jpg");
		img5 = new ImageIcon("h5.jpg");
		img6 = new ImageIcon("h6.jpg");
		img7 = new ImageIcon("h7.jpg");
		tf = new JTextField(10);
		c.add(tf);
		
		se = new JButton("search");
		se.addActionListener(this);
		c.add(se);
	}
	public void paint(Graphics g){
		super.paint(g);
		if(press ==1) {
			if (no == 1){
				img1.paintIcon(this, g, 25, 150);
			}else if (no ==2) {
				img2.paintIcon(this, g, 25, 150);
			}else if (no ==3) {
				img3.paintIcon(this, g, 25, 150);
			}else if (no ==4) {
				img4.paintIcon(this, g, 25, 150);
			}else if (no ==5) {
				img5.paintIcon(this, g, 25, 150);
			}else if (no ==6) {
				img6.paintIcon(this, g, 25, 150);
			}else if (no ==7) {
				img7.paintIcon(this, g, 25, 150);
			}
			else {
				JOptionPane.showMessageDialog(null, "sorry not found");
			}
		}
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == se) {
			press = 1;
			for (int i=0;i<exAr.length;i++){
				if(exAr[i].equals(tf.getText())){
					System.out.print("h");
					 no = i+1;
					 repaint();
				}
			}
			if (no == 0 ){
				JOptionPane.showMessageDialog(null, "sorry not found");
			}
		}
	}
}
