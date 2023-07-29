import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Grass {
	//variables that will be used
	public double x, y;  //position of grass
	private double vx = 2.0; //velocity of grass
	private double vy = 2.0; //velocity of grass
	private Image img; 	
	private AffineTransform tx; 

	public Grass(double x, double y) {
		//constructor for creating grass object
		this.x = x; 
		this.y = y;
		img = getImage("/imgs/Flower Road.png"); 

		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y);  
	}
	
	public void changePicture(String newFileName) {
		img = getImage(newFileName);
		init(x, y);
	}
	
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;

		//call update to update the actually picture location
		update();
		g2.drawImage(img, tx, null);
		

	}
	
	/* update the picture variable location */
	private void update() {
		
		x -= vx;
		y += vy;
		tx.setToTranslation(x, y);
		
		//to scale it up or down to change size, .5 means 50% of original file
		tx.scale(4.5, 4.5);
		
	}

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		
		//to scale it up or down to change size, .5 means 50% of original file
		tx.scale(4.5, 4.5);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Chicken.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
}
