import javax.swing.JFrame;

public class Runner
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		MovePics mc = new MovePics();
		frame.add(mc);
		frame.setSize(1600,900);
		frame.setTitle("Sharkboy and Lavagirl");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
		
	}
}