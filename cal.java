import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener {
		TextField tx1,tx2,tx3;
		Button b1,b2,b3,b4;
	Fdemo() 
	{
		setLayout(new FlowLayout());
		Font f =new Font("",Font.BOLD,20);
		setFont(f);
		tx1=new TextField(10);
		add(tx1);
		tx2=new TextField(10);
		add(tx2);
		b1=new Button("+");
		add(b1);
		b2=new Button("-");
		add(b2);
		b3=new Button("X");
		add(b3);
		b4=new Button("/");
		add(b4);
		tx3=new TextField(10);
		add(tx3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1){
			String s1=tx1.getText();
			String s2=tx2.getText();
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x+y;
			tx3.setText(""+z);
			}
			if(e.getSource()==b2){
			String s1=tx1.getText();
			String s2=tx2.getText();
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x-y;
			tx3.setText(""+z);
			}
			if(e.getSource()==b3){
			String s1=tx1.getText();
			String s2=tx2.getText();
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x*y;
			tx3.setText(""+z);
			}
			if(e.getSource()==b4){
			String s1=tx1.getText();
			String s2=tx2.getText();
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x/y;
			tx3.setText(""+z);
			}
		}
}

class cal
{
	public static void main(String ar[])
	{
		Fdemo f=new Fdemo();
     f.setVisible(true);
 
 f.setBackground(Color.black);	
 f.setSize(400,400); 
 f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	
	}
}