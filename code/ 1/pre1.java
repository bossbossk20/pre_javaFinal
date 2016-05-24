import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class pre1 extends JApplet implements KeyListener , ActionListener{
	Timer t;
	int ck=0;
	int xMin = 1 , xMax = 500;
	int yMin = 1, yMax = 500;
	int ySpeed=10,xspeed = 10, x=120,y=160, size=40;
	JButton btnStart;
	ImageIcon img1,  myLogo;
	public void init(){
		setSize(600,600);
		img1 = new ImageIcon("img.png");
		myLogo = new ImageIcon("bg.png");
		addKeyListener(this);
		setFocusable(true);
		t = new Timer(500,this);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		btnStart = new JButton("start ");
		btnStart.setVisible(false);
		btnStart.addActionListener(this);
		c.add(btnStart);
		
	}
	public void paint(Graphics g){
		super.paint(g);
//		g.drawRect(x, y, y+50, y+50);
		myLogo.paintIcon(this,g,0,0);
		img1.paintIcon(this,g,x,y);
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='d')
		{
			System.out.print("press :  d\n");
			t.start();
			ck=1;
			move();
			repaint();
		}
		else if(e.getKeyChar()=='a')
		{
			System.out.print("press :  a\n");
			t.start();
			ck=2;
			move();
			repaint();
		}
		else if(e.getKeyChar()=='w')
		{
			System.out.print("press :  w\n");
			t.start();
			ck=3;
			move();
			repaint();
		}
		else if(e.getKeyChar()=='s')
		{
			System.out.print("press :  s\n");
			t.start();
			ck=4;
			move();
			repaint();
		}
	}
	public void move(){
//		System.out.print(ck);
		if(ck==1){
			x+=20;
		}else if(ck==2){
			x-=20;
		}else if(ck==3){
			y-=20;
		}else if(ck==4){
			y+=20;
		}
	}
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnStart){
			System.out.println("press");
			t.start();
		}else{
			move();
			repaint();
		}
		
	}

}
