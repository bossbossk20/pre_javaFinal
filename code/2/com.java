import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class com extends JFrame implements ActionListener{
	atm a1;
	JLabel title ,name ,b ,de,wi;
	JTextField nname, balan,deposit,widthdraw;
	JButton bDe, bWi ,sDe ,sWi;
	
	public static void main(String[] args) {
		com g = new com();
		g.setSize(180,240);
		g.setVisible(true);
	}
	public com () {
		a1 = new atm();
		String nn;
		nn = a1.getName();
		System.out.println(nn);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		title = new JLabel("######    ATM   ######");
		c.add(title);
		
		name = new JLabel(" name :");
		c.add(name);
		
		nname = new JTextField(6);
		nname.setEditable(false);
		c.add(nname);
		
		b = new JLabel("balance :");
		c.add(b);
		
		balan = new JTextField(6);
		balan.setEditable(false);
		c.add(balan);
		
		de = new JLabel("deposit :");
		de.setVisible(false);
		c.add(de);
		
		deposit = new JTextField(6);
		deposit.setVisible(false);
		c.add(deposit);
		
		wi = new JLabel(" widthdraw :");
		wi.setVisible(false);
		c.add(wi);
		
		widthdraw = new JTextField(6);
		widthdraw.setVisible(false);
		c.add(widthdraw);
		
		sDe = new JButton("submit deposit");
		sDe.addActionListener(this);
		sDe.setVisible(false);
		c.add(sDe);
		
		sWi = new JButton("summit withdraw");
		sWi.addActionListener(this);
		sWi.setVisible(false);
		c.add(sWi);
		
		bDe = new JButton("deposit");
		bDe.addActionListener(this);
		c.add(bDe);
		
		bWi = new JButton("widthdraw");
		bWi.addActionListener(this);
		c.add(bWi);
		nname.setText(nn);
		balan.setText(a1.getMoney()+"");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bDe) {
			de.setVisible(true);
			deposit.setVisible(true);
			wi.setVisible(false);
			widthdraw.setVisible(false);
			sWi.setVisible(false);
			sDe.setVisible(true);
		}
		else if(e.getSource()== bWi) {
			wi.setVisible(true);
			widthdraw.setVisible(true);
			de.setVisible(false);
			deposit.setVisible(false);
			sWi.setVisible(true);
			sDe.setVisible(false);
		}
		else if (e.getSource() == sDe) {
				a1.Deposit(Integer.parseInt(deposit.getText()));
				System.out.println(a1.getMoney()+"");
				balan.setText(a1.getMoney()+"");
				de.setVisible(false);
				deposit.setVisible(false);
				sDe.setVisible(false);
				deposit.setText("");
		}
		else if (e.getSource()== sWi) {
			if (a1.getMoney() < Integer.parseInt(widthdraw.getText())){
				JOptionPane.showMessageDialog(null, "Money not enough");
				wi.setVisible(false);
				widthdraw.setVisible(false);
				sWi.setVisible(false);
				widthdraw.setText("");
			}else {
				a1.Widthdraw(Integer.parseInt(widthdraw.getText()));
				balan.setText(a1.getMoney()+"");
				wi.setVisible(false);
				widthdraw.setVisible(false);
				sWi.setVisible(false);
				widthdraw.setText("");
			}
		}
	}
}
