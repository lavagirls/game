import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


public class Homepage extends JPanel {

	private final Image image;

	private boolean scale;

	public Homepage(Image anImage) {
		image = Objects.requireNonNull(anImage);
	}

	public Homepage(Image anImage, LayoutManager aLayout) {
		super(aLayout);
		image = Objects.requireNonNull(anImage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		final Image toDraw = scale ? image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH) : image;
		g.drawImage(toDraw, 0, 0, this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Dimension getPreferredSize() {
		if (isPreferredSizeSet()) {
			return super.getPreferredSize();
		} else {
			return new Dimension(image.getWidth(this)/2, image.getHeight(this)/2);
		}
	}

	public boolean isScale() {
		return scale;
	}

	public void setScale(boolean scale) {
		this.scale = scale;
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					final Homepage p = new Homepage(ImageIO.read(new File("homepagebackground.jpg")),
							new FlowLayout());
					p.setScale(true);
					
					
					String[] pickLevel = { "Level 1", "Coming Soon!" };
					JComboBox level = new JComboBox(pickLevel);
					level.setLayout(null);
					level.setBounds(475, 475, 150, 75);
					p.setLayout(null);
					p.add(level);
					level.setVisible(true);
					level.setBackground(Color.pink);
					
					JButton start = new JButton("Start Game");
					// bounds layouts the size and location on the page height of the button on the
					// page,length of button,height of the button frame
					start.setLayout(null);
					start.setBounds(475, 375, 150, 75);
					// adds the button to the front of the homepage
					p.add(start,BorderLayout.CENTER);
					// to show up you need to set it to visible
					start.setVisible(true);
					// setting the color of the button
					start.setBackground(Color.magenta);
					start.addActionListener( new ActionListener()
					{
					    @Override
					    public void actionPerformed(ActionEvent e)
					    {
					    
					        Runner.main(args);
					    }
					});
					
					final JFrame frm = new JFrame("Sharkboy and Lavagirl");
					frm.add(p);
					frm.pack();
					frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					frm.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

}