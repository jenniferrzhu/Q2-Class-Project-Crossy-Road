import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Chicken {
	public double x, y; //position of the chicken
	public double vy; //velocity in the y
	public double vx;
	public int score = 0;
	private Image img; 	
	private AffineTransform tx; 

	public Chicken(double x, double y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/ChickenFinal.png");  

		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
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
	public void move() {
		if(score >= 33) { //chicken stops moving after reaching end
			vx = 0.0;
			vy = 0.0;
		}else {
			vx = 2.0;
			vy = 2.0;
		}
		
		y += vy;
		x -= vx;
	}
	public void moveFor() { //moves forward
		vx = 33.5;
		vy = 33.5;
		
		y -= vy; 
		x += vx;
	}
	public void moveBack() { //moves backward
		vx = 16.75;
		vy = 16.75;
		
		y += vy; 
		x -= vx;
	}
	
	public void reset() {
		x = 180.0;
		y = 410.0;
	}

	/* update the picture variable location */
	private void update() {
		
		tx.setToTranslation(x, y);
	
		
		//to scale it up or down to change size, .5 means 50% of original file
		tx.scale(1.0, 1.0);
	}

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		
		//to scale it up or down to change size, .5 means 50% of original file
		tx.scale(1.0, 1.0);
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
