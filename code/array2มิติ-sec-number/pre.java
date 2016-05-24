import java.awt.*;
import javax.swing.*;
import java.util.*;
public class pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ;
		String sec = JOptionPane.showInputDialog(null, "Enter Section  :");
		String num = JOptionPane.showInputDialog(null, "Enter Number  :");
		int std[][] = new int[Integer.parseInt(sec)][Integer.parseInt(num)];
		
		for(int i=0;i<Integer.parseInt(sec);i++){
			for(int j=0;j<Integer.parseInt(num);j++){
				s = JOptionPane.showInputDialog(null, "Enter score section "+(i+1)+" "+"std no "+(j+1)+" :");
				 std[i][j] = Integer.parseInt(s);
			}
		}
		
		for(int i=0;i<Integer.parseInt(sec);i++){
			for(int j=0;j<Integer.parseInt(num);j++){
				System.out.print(std[i][j]+ " ");
			}
			System.out.println("");
		}
		
		String menu = JOptionPane.showInputDialog(null, "Enter menu   \n1 show min \n2show max\n3 exit");
		if(Integer.parseInt(menu)==1){
			int min = Integer.MAX_VALUE;
			for(int i=0;i<Integer.parseInt(sec);i++){
				for(int j=0;j<Integer.parseInt(num);j++){
					if(std[i][j] < min) {
				         min = std[i][j];
				      }
				}
			}
			System.out.println(min);
			JOptionPane.showMessageDialog(null, "Min score is :"+min);
			
		}else if(Integer.parseInt(menu)==2){
			int max = Integer.MIN_VALUE;
			for(int i=0;i<Integer.parseInt(sec);i++){
				for(int j=0;j<Integer.parseInt(num);j++){
					if(std[i][j] > max) {
				         max = std[i][j];
				      }
				}
			}
			System.out.println(max);
			JOptionPane.showMessageDialog(null, "Max score is :"+max);
			}else if(Integer.parseInt(menu)==3){
				JOptionPane.showMessageDialog(null, "Bye ");
			}else {
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
	
	}

