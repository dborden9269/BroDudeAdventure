package finalProject;

	import javax.swing.*;

	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.event.*;

	public class GameWorld extends JPanel implements ActionListener
	{
		BroDude player;
		public Image img;
		Timer time;
		

		public GameWorld()
		{
			player = new BroDude();
			addKeyListener(new AL());
			setFocusable(true);
			ImageIcon background = new ImageIcon("BroDudeBackground.png");
			img = background.getImage();
			time = new Timer(5, this);
			time.start();
		}
		
		public void actionPerformed(ActionEvent e)
		{
			repaint();
			player.move();
		}
		
		public void paint(Graphics g)
		{
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(img, 0, 0, null);
			g2d.drawImage(player.getImage(), player.getX(), player.getY(), null);
		}
		
		private class AL extends KeyAdapter
		{
			public void keyReleased(KeyEvent e)
			{
				player.keyReleased(e);
			}
			
			public void keyPressed(KeyEvent e)
			{
				player.keyPressed(e);
			}

		}

}
