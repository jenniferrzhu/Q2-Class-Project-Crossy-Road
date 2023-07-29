import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {

	//CREATE THE OBJECT (STEP 1) -- roads/elements 
	
	Tree[] endTree1 = new Tree[15];
	Tree[] endTree2 = new Tree[15];
	Tree[] endTree3 = new Tree[15];
	Tree[] endTree4 = new Tree[15];
	Tree[] endTree5 = new Tree[15];

	Grass2 grass1 = new Grass2(-20.0, -400.0);
	Grass grass2 = new Grass(-20.0, -440.0);
	Grass2 grass3 = new Grass2 (-20.0, -480.0); 
	Grass grass4 = new Grass(-20.0, -520.0);//start
		Tree tree1 = new Tree(grass4.x + 80, grass4.y + 850);
		Tree tree2 = new Tree(grass4.x + 290, grass4.y + 895);
		Pagoda pagoda1 = new Pagoda(grass4.x - 280, grass4.y + 590);
		Pagoda pagoda2 = new Pagoda(grass4.x + 270, grass4.y + 690);
	Background road5 = new Background(-20.0, -560.0);
		Car2 car1 = new Car2(road5.x, road5.y + 890); 
	Background road6 = new Background(-20.0, -600.0);
		Car car2 = new Car(road6.x + 600, road6.y + 1000);
	Grass grass7 = new Grass(-20.0, -640.0);
		Tree tree3 = new Tree(grass7.x + 40, grass7.y + 840);
	Background road8 = new Background(-20.0, -680.0);
		Car car3 = new Car(road8.x + 850, road8.y + 1050);
	Background road9 = new Background(-20.0, -720.0); 
		Car car4 = new Car(road9.x + 725, road9.y + 1025);
	Background road10 = new Background(-20.0, -760.0);
		Car2 car5 = new Car2(road10.x - 125, road10.y + 865);
	Grass grass11 = new Grass(-20.0, -800.0);
	Grass2 grass12 = new Grass2(-20.0, -840.0);
		Tree tree4 = new Tree(grass12.x + 190, grass12.y + 880);
	Grass grass13 = new Grass(-20.0, -880.0);
		Tree tree5 = new Tree(grass13.x + 580, grass13.y + 945);
	Background road14 = new Background(-20.0, -920.0);
		Car2 car6 = new Car2(road14.x - 250, road14.y + 840);
	Grass grass15 = new Grass(-20.0, -960.0);
	Grass2 grass16 = new Grass2(-20.0, -1000.0);
	Grass grass17 = new Grass(-20.0, -1040.0);
		Tree tree6 = new Tree(grass17.x + 190, grass17.y + 880);
	Grass2 grass18 = new Grass2(-20.0, -1080.0);
		Tree tree7 = new Tree(grass18.x + 360, grass18.y + 910);
	Background road19 = new Background(-20.0, -1120.0);
		Car car7 = new Car(road19.x + 850, road19.y + 1050);
	Background road20 = new Background(-20.0, -1160.0);
		Car2 car8 = new Car2(road20.x - 250, road20.y + 840);
	Background road21 = new Background(-20.0, -1200.0);
		Car car9 = new Car(road21.x + 975, road21.y + 1075);
	Background road22 = new Background(-20.0, -1240.0);
		Car2 car10 = new Car2(road22.x - 250, road22.y + 840);
	Grass2 grass23 = new Grass2(-20.0, -1280.0);
		Tree tree8 = new Tree(grass23.x + 660, grass23.y + 965);
	Grass grass24 = new Grass(-20.0, -1320.0);
		Pagoda pagoda3 = new Pagoda(grass24.x + 300, grass24.y + 620);
	Grass2 grass25 = new Grass2(-20.0, -1360.0);
	Background road26 = new Background(-20.0, -1400.0);
		Car car11 = new Car(road26.x + 850, road26.y + 1050);
	Grass grass27 = new Grass(-20.0, -1440.0);
	Background road28 = new Background(-20.0, -1480.0);
		Car2 car12 = new Car2(road28.x - 250, road28.y + 840);
	Grass2 grass29 = new Grass2(-20.0, -1520.0);
		Tree tree9 = new Tree(grass29.x + 660, grass29.y + 965);
		Tree tree10 = new Tree(grass29.x + 1200, grass29.y + 1045);
	Grass grass30 = new Grass(-20.0, -1560.0);
		Pagoda pagoda4 = new Pagoda(grass30.x + 700, grass30.y + 660);
	Grass2 grass31 = new Grass2(-20.0, -1600.0);
	Grass grass32 = new Grass(-20.0, -1640.0);
	Background road33 = new Background(-20.0, -1680.0);
		Car car13 = new Car(road33.x + 850, road33.y + 1050);
	Background road34 = new Background(-20.0, -1720.0);
		Car2 car14 = new Car2(road34.x - 250, road34.y + 840);
	Background road35 = new Background(-20.0, -1760.0);
		Car car15 = new Car(road35.x + 850, road35.y + 1050);
	Grass2 grass36 = new Grass2(-20.0, -1800.0);
	Grass grass37 = new Grass(-20.0, -1840.0);
		Pagoda pagoda5 = new Pagoda(grass37.x + 1150, grass37.y + 760);
	Grass2 grass38 = new Grass2(-20.0, -1880.0);
	Grass grass39 = new Grass(-20.0, -1920.0);
	Grass2 grass40 = new Grass2(-20.0, -1960.0);
	Grass grass41 = new Grass(-20.0, -2000.0);
	Grass2 grass42 = new Grass2(-20.0, -2040.0);
	Grass grass43 = new Grass(-20.0, -2080.0);
	Grass2 grass44 = new Grass2(-20.0, -2120.0);
	Grass grass45 = new Grass(-20.0, -2160.0);
	Grass2 grass46 = new Grass2(-20.0, -2200.0);
	Grass grass47 = new Grass(-20.0, -2240.0);
	Grass2 grass48 = new Grass2(-20.0, -2280.0);
	Grass grass49 = new Grass(-20.0, -2320.0);
	Grass2 grass50 = new Grass2(-20.0, -2360.0);
	Grass grass51 = new Grass(-20.0, -2400.0);
	Grass2 grass52 = new Grass2(-20.0, -2440.0);
	Grass grass53 = new Grass(-20.0, -2480.0);
	

	Chicken chicken = new Chicken(180.0, 410.0);


	public void paint(Graphics g) { //paints all roads/elements
		super.paintComponent(g);
		grass1.paint(g);
		grass2.paint(g);
		grass3.paint(g);
		grass4.paint(g);
		road5.paint(g);
		road6.paint(g);
		grass7.paint(g);
		road8.paint(g);
		road9.paint(g);
		road10.paint(g);
		grass11.paint(g);
		grass12.paint(g);
		grass13.paint(g);
		road14.paint(g);
		grass15.paint(g);
		grass16.paint(g);
		grass17.paint(g);
		grass18.paint(g);
		road19.paint(g);
		road20.paint(g);
		road21.paint(g);
		road22.paint(g);
		grass23.paint(g);
		grass24.paint(g);
		grass25.paint(g);
		road26.paint(g);
		grass27.paint(g);
		road28.paint(g);
		grass29.paint(g);
		grass30.paint(g);
		grass31.paint(g);
		grass32.paint(g);
		road33.paint(g);
		road34.paint(g);
		road35.paint(g);
		grass36.paint(g);
		grass37.paint(g);
		grass38.paint(g);
		grass39.paint(g);
		grass40.paint(g);
		grass41.paint(g);
		grass42.paint(g);
		grass43.paint(g);
		grass44.paint(g);
		grass45.paint(g);
		grass46.paint(g);
		grass47.paint(g);
		grass48.paint(g);
		grass49.paint(g);
		grass50.paint(g);
		grass51.paint(g);
		grass52.paint(g);
		grass53.paint(g);
		
		car15.paint(g);
		car14.paint(g);
		car13.paint(g);
		car12.paint(g);
		car11.paint(g);
		car10.paint(g);
		car9.paint(g);
		car8.paint(g);
		car7.paint(g);
		car6.paint(g);
		car5.paint(g);
		car4.paint(g);
		car3.paint(g);
		tree3.paint(g);
		car2.paint(g);
		car1.paint(g);
		
		//painting arrays
		for(int i = 0; i < endTree1.length; i++) {
			endTree5[i].paint(g);
			endTree4[i].paint(g);
			endTree3[i].paint(g);
			endTree2[i].paint(g);
			endTree1[i].paint(g);
		}	
		
		//non-moving objects
		pagoda5.paint(g);
		chicken.paint(g);
		tree10.paint(g);
		pagoda4.paint(g);
		tree9.paint(g);
		pagoda3.paint(g);
		tree8.paint(g);
		tree7.paint(g);
		tree6.paint(g);
		tree5.paint(g);
		tree4.paint(g);
		tree1.paint(g);
		pagoda1.paint(g);
		tree2.paint(g);
		pagoda2.paint(g);
		
		//call to methods below
		collide();
		chicken.move();
		carRepeat();
		
		//scoring
		g.setFont(new Font("TimesRoman", Font.PLAIN, 60));
		g.setColor(Color.WHITE);
		g.drawString(chicken.score + "", 280, 120);
		
		//once chicken is within final pagoda, a pink screen saying
		//"you won" will pop up with the score (will be 33 for every win)
		if(chicken.x > pagoda5.x + 150) {
			g.setColor(Color.PINK);
			g.fillRect(0, 0, 600, 600);
			g.setColor(Color.white);
			g.drawString("You won!", 200, 250);
			g.drawString("33", 280, 320);
			g.drawString("Press Space to restart", 50, 390);
		}
	}
 
	public void reset() { 
		//method to restart at same position 
		//(setting coordinates to starting ones)
		grass1.x = -20.0; grass1.y = -400.0;
		grass2.x = -20.0; grass2.y = -440.0;
		grass3.x = -20.0; grass3.y = -480.0;
		grass4.x = -20.0; grass4.y = -520.0;
		road5.x = -20.0; road5.y = -560.0;
		road6.x = -20.0; road6.y = -600.0;
		grass7.x = -20.0; grass7.y = -640.0;
		road8.x = -20.0; road8.y = -680.0;
		road9.x = -20.0; road9.y = -720.0;
		road10.x = -20.0; road10.y = -760.0;
		grass11.x = -20.0; grass11.y = -800.0;
		grass12.x = -20.0; grass12.y = -840.0;
		grass13.x = -20.0; grass13.y = -880.0;
		road14.x = -20.0; road14.y = -920.0;
		grass15.x = -20.0; grass15.y = -960.0;
		grass16.x = -20.0; grass16.y = -1000.0;
		grass17.x = -20.0; grass17.y = -1040.0;
		grass18.x = -20.0; grass18.y = -1080.0;
		road19.x = -20.0; road19.y = -1120.0;
		road20.x = -20.0; road20.y = -1160.0;
		road21.x = -20.0; road21.y = -1200.0;
		road22.x = -20.0; road22.y = -1240.0;
		grass23.x = -20.0; grass23.y = -1280.0;
		grass24.x = -20.0; grass24.y = -1320.0;
		grass25.x = -20.0; grass25.y = -1360.0;
		road26.x = -20.0; road26.y = -1400.0;
		grass27.x = -20.0; grass27.y = -1440.0;
		road28.x = -20.0; road28.y = -1480.0;
		grass29.x = -20.0; grass29.y = -1520.0;
		grass30.x = -20.0; grass30.y = -1560.0;
		grass31.x = -20.0; grass31.y = -1600.0;
		grass32.x = -20.0; grass32.y = -1640.0;
		road33.x = -20.0; road33.y = -1680.0;
		road34.x = -20.0; road34.y = -1720.0;
		road35.x = -20.0; road35.y = -1760.0;
		grass36.x = -20.0; grass36.y = -1800.0;
		grass37.x = -20.0; grass37.y = -1840.0;
		grass38.x = -20.0; grass38.y = -1880.0;
		grass39.x = -20.0; grass39.y = -1920.0;
		grass40.x = -20.0; grass40.y = -1960.0;
		grass41.x = -20.0; grass41.y = -2000.0;
		grass42.x = -20.0; grass42.y = -2040.0;
		grass43.x = -20.0; grass43.y = -2080.0;
		grass44.x = -20.0; grass44.y = -2120.0;
		grass45.x = -20.0; grass45.y = -2160.0;
		grass46.x = -20.0; grass46.y = -2200.0;
		grass47.x = -20.0; grass47.y = -2240.0;
		grass48.x = -20.0; grass48.y = -2280.0;
		grass49.x = -20.0; grass49.y = -2320.0;
		grass50.x = -20.0; grass50.y = -2360.0;
		grass51.x = -20.0; grass51.y = -2400.0;
		grass52.x = -20.0; grass52.y = -2440.0;
		grass53.x = -20.0; grass53.y = -2480.0;
		
		
		tree1.x = grass4.x + 80; tree1.y = grass4.y + 850;
		tree2.x = grass4.x + 290; tree2.y = grass4.y + 895;
		tree3.x = grass7.x + 40; tree3.y = grass7.y + 840;
		tree4.x = grass12.x + 190; tree4.y = grass12.y + 880;
		tree5.x = grass13.x + 580; tree5.y = grass13.y + 945;
		tree6.x = grass17.x + 190; tree6.y = grass17.y + 880;
		tree7.x = grass18.x + 360; tree7.y = grass18.y + 910;
		tree8.x = grass23.x + 660; tree8.y = grass23.y + 965;
		tree9.x = grass29.x + 660; tree9.y = grass29.y + 965;
		tree10.x = grass29.x + 1200; tree10.y = grass29.y + 1045;
		
		car1.x = road5.x; car1.y = road5.y + 890;
		car2.x = road6.x + 600; car2.y = road6.y + 1000;
		car3.x = road8.x + 850; car3.y = road8.y + 1050;
		car4.x = road9.x + 725; car4.y = road9.y + 1025;
		car5.x = road10.x - 125; car5.y = road10.y + 865;
		car6.x = road14.x - 250; car6.y = road14.y + 840;
		car7.x = road19.x + 850; car7.y = road19.y + 1050;
		car8.x = road20.x - 250; car8.y = road20.y + 840;
		car9.x = road21.x + 975; car9.y = road21.y + 1075;
		car10.x = road22.x - 250; car10.y = road22.y + 840;
		car11.x = road26.x + 850; car11.y = road26.y + 1050;
		car12.x = road28.x - 250; car12.y = road28.y + 840;
		car13.x = road33.x + 850; car13.y = road33.y + 1050;
		car14.x = road34.x - 250; car14.y = road34.y + 840;
		car15.x = road35.x + 850; car15.y = road35.y + 1050;
		
		pagoda1.x = grass4.x - 280; pagoda1.y = grass4.y + 590;
		pagoda2.x = grass4.x + 270; pagoda2.y = grass4.y + 690;
		pagoda3.x = grass24.x + 300; pagoda3.y = grass24.y + 620;
		pagoda4.x = grass30.x + 700; pagoda4.y = grass30.y + 660;
		pagoda5.x = grass37.x + 1150; pagoda5.y = grass37.y + 760;
		
		double resetX = grass40.x + 950;
		double resetY1 = grass40.x + 980;
		double resetY2 = grass40.x + 880;
		double resetY3 = grass40.x + 780;
		double resetY4 = grass40.x + 680;
		double resetY5 = grass40.x + 580;
		for(int i = 0; i < endTree1.length; i++) {
			endTree1[i].x = resetX;
			endTree2[i].x = resetX;
			endTree3[i].x = resetX;
			endTree4[i].x = resetX;
			endTree5[i].x = resetX;
			endTree1[i].y = resetY1;
			endTree2[i].y = resetY2;
			endTree3[i].y = resetY3;
			endTree4[i].y = resetY4;
			endTree5[i].y = resetY5;
			resetX += 80;
			resetY1 += 20;
			resetY2 += 20;
			resetY3 += 20;
			resetY4 += 20;
			resetY5 += 20;
		}
		
		chicken.score = 0;
	}
	public void carRepeat() {
		/*once the car reaches a certain x value and meets the 
		if statement requirement, it will go back to a certain 
		x and y so it can pass by the frame again */
		if(car1.x > 650) {
			car1.x = road5.x -200;
			car1.y = road5.y + 850;
		}
		if(car2.x < -150) {
			car2.x = road6.x + 600;
			car2.y = road6.y + 1000;
		}
		if(car3.x < -150) {
			car3.x = road8.x + 700;
			car3.y = road8.y + 1020;
		}
		if(car4.x < -150) {
			car4.x = road9.x + 700;
			car4.y = road9.y + 1020;
		}  
		if(car5.x > 650) {
			car5.x = road10.x -100;
			car5.y = road10.y + 870;
		}
		if(car6.x > 650) {
			car6.x = road14.x -100;
			car6.y = road14.y + 870;
		}
		if(car7.x < -150) {
			car7.x = road19.x + 1100;
			car7.y = road19.y + 1100;
		}  
		if(car8.x > 650) {
			car8.x = road20.x;
			car8.y = road20.y + 890;
		}
		if(car9.x < -150) {
			car9.x = road21.x + 1200;
			car9.y = road21.y + 1120;
		}
		if(car10.x > 650) {
			car10.x = road22.x + 100;
			car10.y = road22.y + 900;
		}
		if(car11.x < -150) {
			car11.x = road26.x + 1400;
			car11.y = road26.y + 1160;
		}  
		if(car12.x > 650) {
			car12.x = road28.x + 200;
			car12.y = road28.y + 930;
		}
		if(car13.x < -150) {
			car13.x = road33.x + 1600;
			car13.y = road33.y + 1200;
		}  
		if(car14.x > 650) {
			car14.x = road34.x + 300;
			car14.y = road34.y + 950;
		}
		if(car15.x < -150) {
			car15.x = road35.x + 1700;
			car15.y = road35.y + 1220;
		}
	}
	public void collide() { 
		/* checks to see if chicken collides with any objects 
		 * (if x or y intercepts the x or y of the object
		 * and it will reset if it does overlap */
		if(chicken.y < -10 || chicken.x < 50) {
			chicken.reset();
			reset();
		}  
		
		if(chicken.x >= car1.x && chicken.x <= car1.x + 70) {
			if(chicken.y <= car1.y + 30 && chicken.y + 30 >= car1.y + 15) {
				chicken.reset();
				reset();

			}
		}
		
		if(chicken.x >= car2.x && chicken.x <= car2.x + 70) {
			if(chicken.y <= car2.y + 30 && chicken.y + 30 >= car2.y + 15) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car3.x && chicken.x <= car3.x + 70) {
			if(chicken.y <= car3.y + 30 && chicken.y + 30 >= car3.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car4.x && chicken.x <= car4.x + 70) {
			if(chicken.y <= car4.y + 30 && chicken.y + 30 >= car4.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car5.x && chicken.x <= car5.x + 70) {
			if(chicken.y <= car5.y + 30 && chicken.y + 30 >= car5.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car6.x && chicken.x <= car6.x + 70) {
			if(chicken.y <= car6.y + 30 && chicken.y + 30 >= car6.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car7.x && chicken.x <= car7.x + 70) {
			if(chicken.y <= car7.y + 30 && chicken.y + 30 >= car7.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car8.x && chicken.x <= car8.x + 70) {
			if(chicken.y <= car8.y + 30 && chicken.y + 30 >= car8.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car9.x && chicken.x <= car9.x + 70) {
			if(chicken.y <= car9.y + 30 && chicken.y + 30 >= car9.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car10.x && chicken.x <= car10.x + 70) {
			if(chicken.y <= car10.y + 30 && chicken.y + 30 >= car10.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car11.x && chicken.x <= car11.x + 70) {
			if(chicken.y <= car11.y + 30 && chicken.y + 30 >= car11.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car12.x && chicken.x <= car12.x + 70) {
			if(chicken.y <= car12.y + 30 && chicken.y + 30 >= car12.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car13.x && chicken.x <= car13.x + 70) {
			if(chicken.y <= car13.y + 30 && chicken.y + 30 >= car13.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car14.x && chicken.x <= car14.x + 70) {
			if(chicken.y <= car14.y + 30 && chicken.y + 30 >= car14.y + 20) {
				chicken.reset();
				reset();

			}
		}
		if(chicken.x >= car15.x && chicken.x <= car15.x + 70) {
			if(chicken.y <= car15.y + 30 && chicken.y + 30 >= car15.y + 20) {
				chicken.reset();
				reset();

			}
		}
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	
	public Frame() {
		JFrame f = new JFrame("Crossy Japan");
		f.setSize(new Dimension(600, 600));
		f.setBackground(Color.blue);
		f.add(this);
		
		//creation of tree objects in endTree1, endTree2, endTree3, endTree4, and endTree5 arrays
		double treeX = grass40.x + 990;
		double treeY1 = grass40.y + 980;
		double treeY2 = grass40.y + 880;
		double treeY3 = grass40.y + 780;
		double treeY4 = grass40.y + 680;
		double treeY5 = grass40.y + 580;
		for(int i = 0; i < endTree1.length; i++) {
			Tree newTree1 = new Tree(treeX, treeY1);
			Tree newTree2 = new Tree(treeX, treeY2);
			Tree newTree3 = new Tree(treeX, treeY3);
			Tree newTree4 = new Tree(treeX, treeY4);
			Tree newTree5 = new Tree(treeX, treeY5);
			endTree1[i] = newTree1;
			endTree2[i] = newTree2;
			endTree3[i] = newTree3;
			endTree4[i] = newTree4;
			endTree5[i] = newTree5;
			treeX += 80;
			treeY1 += 20;
			treeY2 += 20;
			treeY3 += 20;
			treeY4 += 20;
			treeY5 += 20;
		}
		
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
			//increment score depending on key code for forward and back
			//will also move chicken forward or back
			System.out.println(arg0.getKeyCode());
			if(arg0.getKeyCode() == 38) {
				chicken.moveFor();
				chicken.score++;
			}
			
			if(arg0.getKeyCode() == 40) {
				chicken.moveBack();
				chicken.score--;
			}
			
			//game restarts when space is pressed
			if(arg0.getKeyCode() == 32) {
				reset();
				chicken.reset();
				chicken.score = 0;
			}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
