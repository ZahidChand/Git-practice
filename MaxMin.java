import java.awt.*;
import java.awt.event.*;

public class MaxMin extends Frame implements ActionListener 
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	MaxMin()
	{
		l1 = new Label("n01");
		l2 = new Label("n02");
		l3 = new Label("Ans");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		b1 = new Button();
		b2 = new Button();
		setLayout(new GridLayout(4,3));
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(b1); add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		int a,b;
		if(e.getSource()== b1)
		{
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			if(a>b)
			{
				t3.setText(a+" ");
			}
			else
			{
				t3.setText(b+" ");
			}
			
		}
		else
		{
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			if(a<b)
			{
				t3.setText(a+" ");
			}
			else
			{
				t3.setText(b+" ");
			}
			
		}
	}
		public static void main(String args[], boolean True)
		{
			MaxMin x = new MaxMin();
			x.setVisible(True);
			x.setSize(300,400);
		}
	
}










