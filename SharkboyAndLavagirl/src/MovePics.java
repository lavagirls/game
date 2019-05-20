import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;



public class MovePics extends JPanel implements ActionListener, KeyListener{

	Timer t = new Timer(5, this);
	double x = 0, y = 0, x1 = 1360, y1 = 0, velX = 0, velY = 0, velX1 = 0, velY1 = 0;

	public MovePics()
	{

		t.start();
		infoBox("Reach the Bottom of the Maze!", "Rules");
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		
	}

	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		Graphics2D g4 = (Graphics2D) g;
		g4.setColor(Color.BLACK);
		g4.fill(new Rectangle2D.Double(0,0, 1600, 1600));
		g.setColor(Color.BLUE);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(new Ellipse2D.Double(x,y,40,40));
		g.setColor(Color.RED);
		Graphics2D g3 = (Graphics2D) g;
		g3.fill(new Ellipse2D.Double(x1,y1,40,40));
		
		Graphics2D maze = (Graphics2D) g;
		
		//left maze outline 
		Point2D.Double point1 = new Point2D.Double(200, 200);
		Point2D.Double point2 = new Point2D.Double(200, 800);
		
		//enter
		Point2D.Double point3 = new Point2D.Double(200, 800);
		Point2D.Double point4 = new Point2D.Double(600,800);
		
		//right enter
		Point2D.Double point5 = new Point2D.Double(700, 800);
		Point2D.Double point6 = new Point2D.Double(800,800);
		
		//right down
		Point2D.Double point7 = new Point2D.Double(800, 200);
		Point2D.Double point8 = new Point2D.Double(800,800);
		
		//exit
		Point2D.Double point9 = new Point2D.Double(200, 200);
		Point2D.Double point10 = new Point2D.Double(650,200);
		
		//right exit
		Point2D.Double point11 = new Point2D.Double(750, 200);
		Point2D.Double point12 = new Point2D.Double(800,200);
		
		
		 
		
		// inside maze 
		Point2D.Double point13 = new Point2D.Double(250, 300);
		Point2D.Double point14 = new Point2D.Double(600,300);
		
		Point2D.Double point15 = new Point2D.Double(450, 250);
		Point2D.Double point16 = new Point2D.Double(450,300);
//		
		Point2D.Double point17 = new Point2D.Double(250, 450);
		Point2D.Double point18 = new Point2D.Double(200,450);
		
		Point2D.Double point19 = new Point2D.Double(250, 350);
		Point2D.Double point20 = new Point2D.Double(250,550);
//
		Point2D.Double point21 = new Point2D.Double(450, 800);
		Point2D.Double point22 = new Point2D.Double(450,750);
		
		Point2D.Double point23 = new Point2D.Double(400, 750);
		Point2D.Double point24 = new Point2D.Double(550,750);
		
//		
		Point2D.Double point25 = new Point2D.Double(750, 200);
		Point2D.Double point26 = new Point2D.Double(750, 375);
		
		Point2D.Double point27 = new Point2D.Double(750, 375);
		Point2D.Double point28 = new Point2D.Double(375, 375);
		
//		
		Point2D.Double point29 = new Point2D.Double(375, 375);
		Point2D.Double point30 = new Point2D.Double(375, 500);
		
		//Point2D.Double point31 = new Point2D.Double(350, 500);
		//Point2D.Double point32 = new Point2D.Double(425, 500);
		
//      
		Point2D.Double point33 = new Point2D.Double(425, 500);
		Point2D.Double point34 = new Point2D.Double(425, 425);
		
		Point2D.Double point35 = new Point2D.Double(425, 425);
		Point2D.Double point36 = new Point2D.Double(750, 425);
		
		Point2D.Double point37 = new Point2D.Double(750, 425);
		Point2D.Double point38 = new Point2D.Double(750, 600);
//		
		Point2D.Double point39 = new Point2D.Double(800, 600);
		Point2D.Double point40 = new Point2D.Double(650, 600);
		
		Point2D.Double point41 = new Point2D.Double(650, 600);
		Point2D.Double point42 = new Point2D.Double(650, 650);
		
		//Point2D.Double point43 = new Point2D.Double(650, 650);
		//Point2D.Double point44 = new Point2D.Double(775, 650);
//
		Point2D.Double point45 = new Point2D.Double(700, 700);
		Point2D.Double point46 = new Point2D.Double(700, 800);
		
		Point2D.Double point47 = new Point2D.Double(700, 700);
		Point2D.Double point48 = new Point2D.Double(300, 700);
//		
		
		Point2D.Double point49 = new Point2D.Double(200, 600);
		Point2D.Double point50 = new Point2D.Double(550, 600);
		
		//new line
		Point2D.Double point51 = new Point2D.Double(700, 500);
		Point2D.Double point52 = new Point2D.Double(500, 500);
		
		Point2D.Double point53 = new Point2D.Double(600, 450);
		Point2D.Double point54 = new Point2D.Double(600, 500);

		
		maze.setColor(Color.WHITE);
		
		//left outline
		Line2D.Double line1 = new Line2D.Double(point1, point2);
		maze.draw(line1);
		
		Line2D.Double line2 = new Line2D.Double(point3, point4);
		maze.draw(line2);
		
		Line2D.Double line3 = new Line2D.Double(point5, point6);
		maze.draw(line3);
		
		Line2D.Double line4 = new Line2D.Double(point7, point8);
		maze.draw(line4);
		
		Line2D.Double line5 = new Line2D.Double(point9, point10);
		maze.draw(line5);
		
		Line2D.Double line6 = new Line2D.Double(point11, point12);
		maze.draw(line6);
		
		//inside
		Line2D.Double line7 = new Line2D.Double(point13, point14);
		maze.draw(line7);
		
		Line2D.Double line8 = new Line2D.Double(point15, point16);
		maze.draw(line8);
		
		Line2D.Double line9 = new Line2D.Double(point17, point18);
		maze.draw(line9);
		
		Line2D.Double line10 = new Line2D.Double(point19, point20);
		maze.draw(line10);
		
		Line2D.Double line11 = new Line2D.Double(point21, point22);
		maze.draw(line11);
		
		Line2D.Double line12= new Line2D.Double(point23, point24);
		maze.draw(line12);	

		Line2D.Double line13 = new Line2D.Double(point25, point26);
		maze.draw(line13);
		
		Line2D.Double line14= new Line2D.Double(point27, point28);
		maze.draw(line14);
		
		Line2D.Double line15 = new Line2D.Double(point29, point30);
		maze.draw(line15);
		
		//Line2D.Double line16= new Line2D.Double(point31, point32);
		//maze.draw(line16);
		
		Line2D.Double line17 = new Line2D.Double(point33, point34);
		maze.draw(line17);
		
		Line2D.Double line18= new Line2D.Double(point35, point36);
		maze.draw(line18);

		Line2D.Double line19 = new Line2D.Double(point37, point38);
		maze.draw(line19);
		
		Line2D.Double line20= new Line2D.Double(point39, point40);
		maze.draw(line20);

		Line2D.Double line21= new Line2D.Double(point41, point42);
		maze.draw(line21);
		
		//Line2D.Double line22 = new Line2D.Double(point43, point44);
		//maze.draw(line22);
		
		Line2D.Double line23= new Line2D.Double(point45, point46);
		maze.draw(line23);

		Line2D.Double line24 = new Line2D.Double(point47, point48);
		maze.draw(line24);
		
		Line2D.Double line25= new Line2D.Double(point49, point50);
		maze.draw(line25);
		
		//new line
		Line2D.Double line26= new Line2D.Double(point51, point52);
		maze.draw(line26);
		
		Line2D.Double line27= new Line2D.Double(point53, point54);
		maze.draw(line27);
		
		
		
		//right maze outline 
		Point2D.Double point101 = new Point2D.Double(800, 200);
		Point2D.Double point102 = new Point2D.Double(850, 200);
		
		//enter
		Point2D.Double point103 = new Point2D.Double(950, 200);
		Point2D.Double point104 = new Point2D.Double(1400,200);
		
		//right enter
		Point2D.Double point105 = new Point2D.Double(1400, 200);
		Point2D.Double point106 = new Point2D.Double(1400,800);
		
		//right down
		Point2D.Double point107 = new Point2D.Double(1400, 800);
		Point2D.Double point108 = new Point2D.Double(1000,800);
		
		//exit
		Point2D.Double point109 = new Point2D.Double(900, 800);
		Point2D.Double point110 = new Point2D.Double(800,800);
		
		//right exit
		Point2D.Double point111 = new Point2D.Double(800, 800);
		Point2D.Double point112 = new Point2D.Double(800,200);
		
		
		 
		
		// inside maze 
		Point2D.Double point113 = new Point2D.Double(850, 200);
		Point2D.Double point114 = new Point2D.Double(850,375);
		
		Point2D.Double point115 = new Point2D.Double(850, 375);
		Point2D.Double point116 = new Point2D.Double(1250,375);
		
		Point2D.Double point117 = new Point2D.Double(1250, 375);
		Point2D.Double point118 = new Point2D.Double(1250,500);
//		
		
		Point2D.Double point119 = new Point2D.Double(1000, 300);
		Point2D.Double point120 = new Point2D.Double(1350,300);

		Point2D.Double point121 = new Point2D.Double(1150, 300);
		Point2D.Double point122 = new Point2D.Double(1150,250);
//
		
		Point2D.Double point123 = new Point2D.Double(1350, 350);
		Point2D.Double point124 = new Point2D.Double(1350,550);
					
		Point2D.Double point125 = new Point2D.Double(1350, 450);
		Point2D.Double point126 = new Point2D.Double(1400, 450);
//
		
		Point2D.Double point127 = new Point2D.Double(1050, 600);
		Point2D.Double point128 = new Point2D.Double(1400, 600);
					
		//Point2D.Double point129 = new Point2D.Double(1350, 600);
		//Point2D.Double point130 = new Point2D.Double(1350, 700);
//		
		      
		Point2D.Double point131 = new Point2D.Double(1150, 800);
		Point2D.Double point132 = new Point2D.Double(1150, 750);
		
		Point2D.Double point133 = new Point2D.Double(1050, 750);
		Point2D.Double point134 = new Point2D.Double(1200, 750);
//
		
		Point2D.Double point135 = new Point2D.Double(900, 800);
		Point2D.Double point136 = new Point2D.Double(900, 700);
		
		Point2D.Double point137 = new Point2D.Double(900, 700);
		Point2D.Double point138 = new Point2D.Double(1300, 700);
//
		
		Point2D.Double point139 = new Point2D.Double(950, 650);
		Point2D.Double point140 = new Point2D.Double(950, 600);
		
		Point2D.Double point141 = new Point2D.Double(950, 600);
		Point2D.Double point142 = new Point2D.Double(800, 600);
//		
		
		Point2D.Double point143 = new Point2D.Double(850, 600);
		Point2D.Double point144 = new Point2D.Double(850, 425);
		
		Point2D.Double point145 = new Point2D.Double(850, 425);
		Point2D.Double point146 = new Point2D.Double(1175, 425);
		
		Point2D.Double point147 = new Point2D.Double(1175, 425);
		Point2D.Double point148 = new Point2D.Double(1175, 475);
//
		Point2D.Double point149 = new Point2D.Double(900, 500);
		Point2D.Double point150 = new Point2D.Double(1100, 500);

		Point2D.Double point151 = new Point2D.Double(1000, 500);
		Point2D.Double point152 = new Point2D.Double(1000, 455);
		

		
		maze.setColor(Color.WHITE);
		
		//left outline
		Line2D.Double line101 = new Line2D.Double(point101, point102);
		maze.draw(line101);
		
		Line2D.Double line102 = new Line2D.Double(point103, point104);
		maze.draw(line102);
		
		Line2D.Double line103 = new Line2D.Double(point105, point106);
		maze.draw(line103);
		
		Line2D.Double line104 = new Line2D.Double(point107, point108);
		maze.draw(line104);
		
		Line2D.Double line105 = new Line2D.Double(point109, point110);
		maze.draw(line105);
		
		Line2D.Double line106 = new Line2D.Double(point111, point112);
		maze.draw(line106);
		
		//inside
		Line2D.Double line107 = new Line2D.Double(point113, point114);
		maze.draw(line107);
		
		Line2D.Double line108 = new Line2D.Double(point115, point116);
		maze.draw(line108);
		
		Line2D.Double line109 = new Line2D.Double(point117, point118);
		maze.draw(line109);
		
		Line2D.Double line110 = new Line2D.Double(point119, point120);
		maze.draw(line110);
		
		Line2D.Double line111 = new Line2D.Double(point121, point122);
		maze.draw(line111);
		
		Line2D.Double line112= new Line2D.Double(point123, point124);
		maze.draw(line112);	

		Line2D.Double line113 = new Line2D.Double(point125, point126);
		maze.draw(line113);
		
		Line2D.Double line114= new Line2D.Double(point127, point128);
		maze.draw(line114);
		
		//Line2D.Double line115 = new Line2D.Double(point129, point130);
		//maze.draw(line115);
		
		Line2D.Double line116 = new Line2D.Double(point131, point132);
		maze.draw(line116);
		
		Line2D.Double line117= new Line2D.Double(point133, point134);
		maze.draw(line117);

		Line2D.Double line118 = new Line2D.Double(point135, point136);
		maze.draw(line118);
		
		Line2D.Double line119= new Line2D.Double(point137, point138);
		maze.draw(line119);

		Line2D.Double line120= new Line2D.Double(point139, point140);
		maze.draw(line120);
		
		Line2D.Double line121= new Line2D.Double(point141, point142);
		maze.draw(line121);

		Line2D.Double line122 = new Line2D.Double(point143, point144);
		maze.draw(line122);
		
		Line2D.Double line123= new Line2D.Double(point145, point146);
		maze.draw(line123);
		
		Line2D.Double line124= new Line2D.Double(point147, point148);
		maze.draw(line124);
		
		Line2D.Double line125= new Line2D.Double(point149, point150);
		maze.draw(line125);
		
		Line2D.Double line126= new Line2D.Double(point151, point152);
		maze.draw(line126);
		
		
	}
	
	
	 @Override
     public void actionPerformed(ActionEvent e) 
     {
		 System.out.println("Calling AC Performed");
         // Set the new x and y coordinates, depending on which direction we have moved
         //    x +=  velX;
         //    x1 += velX1;
         //    y += velY;
         //    y1 += velY1;


         if(x >= 710)
         {
             x = 710;
         }
         else if(x >= 600 && x <= 710 && y <= 350)
         {
             if(y >= 335)
                     y = 335;
         }
         else if(x >= 350 && x <= 600 && y >= 295 && y <= 350)
         {
             if(y >= 335)
                     y = 335;
             if(y <= 300)
                     y = 300;

         }
         else if(x >= 245 && x <= 350 && y >= 295 && y <= 600)
         {
             if(y <= 300)
                     y = 300;
             if(y >= 560)
                     y = 560;

         }
         else if(x > 250 && x <= 350 && y >= 350 && y <= 500)
         {
             if(x >= 350)
                     x = 350;
         }
         else if(x >= 200 && x <= 249 && y <= 545 && y >= 350)
         {
             if(x >= 210)
                     x = 210;
         }
         else if(x >= 200 && x <= 249 && y <= 600 && y >= 445)
         {
             if(y <= 450)
                     y = 450;
             if(y >= 560)
                     y = 560;
         }
         else if(x >= 200 && x <= 249 && y <= 444 && y >= 350)
         {
             if(y >= 410)
                     y = 410;
         }

             if (x < 200) {
             x = 200;
         }
         else if (y < 200) {
             y = 200;
         }
         else if(x >= 800)
         {
             x = 800;
         }
         else if(y >= 775)
         {
             y = 775;
         }

         if (x1 < 800) {
             x1 = 800;
         }

         if (y1 < 200) {
             y1 = 200;
         }

         if(x1 >= 1360)
         {
             x1 = 1360;
         }

         if(y1 >= 775)
         {
             y1 = 775;
         }
         
         else if(x1 >=890  && x1 <=1000 && y1 <= 350)
         {
             if(y1 >= 335)
                     y1 = 335;
         }
         else if(x1 >= 820+180 && x1 <=800+450  && y1 >= 295 && y1 <= 350)
         {
             if(y1 >= 335)
                     y1 = 335;
             if(y1 <= 300)
                     y1 = 300;

         }
         else if(x1 >=800+450  && x1 <= 800+555 && y1 >= 295 && y1 <= 600)
         {
             if(y1 <= 300)
                     y1 = 300;
             if(y1 >= 560)
                     y1 = 560;

         }
         else if(x1 >800+450  && x1 <= 800 + 550 && y1 >= 350 && y1 <= 500)
         {
             if(x1 >= 800+450)
                     x1 = 800+450;
         }
         else if(x1 >= 800+550 && x1 <= 800 + 600 && y1 <= 545 && y1 >= 350)
         {
             if(x1 >= 800 + 590)
                     x1 = 800 + 590;
         }
         else if(x1 >= 800+550 && x1 <= 800 + 600 && y1 <= 600 && y1 >= 445)
         {
             if(y1 <= 450)
                     y1 = 450;
             if(y1 >= 560)
                     y1 = 560;
         }
         else if(x1 >= 800+550 && x1 <= 800 + 600 && y1 <= 444 && y1 >= 350)
         {
             if(y1 >= 410)
                     y1 = 410;
         }
         
        
 		
         // Redraw the square when something happens
         repaint();
     }

     public void up()
     {
             velY = -2.5;
             velX = 0;
              x +=  velX;
              
               y += velY;
               
     }

     public void up1()
     {
             velY1 = -2.5;
             velX1 = 0;
             
              
              x1 += velX1;
               
               y1 += velY1;
     }

     public void down()
     {
             velY = 2.5;
             velX = 0;
              x +=  velX;
             
               y += velY;
               
     }

     public void down1()
     {
             velY1 = 2.5;
             velX1 = 0;
          
              x1 += velX1;
             
               y1 += velY1; 
 
     }

     public void left()
     {
             velX = -2.5;
             velY = 0;
              x +=  velX;
          
               y += velY;
            
     }

     public void left1()
     {
             velX1 = -2.5;
             velY1 = 0;
           
              x1 += velX1;
              
               y1 += velY1;
     }

     public void right()
     {
             velX = 2.5;
             velY = 0;
              x +=  velX;
          
               y += velY;
              
     }

     public void right1()
     {
             velX1 = 2.5;
             velY1 = 0;
           
              x1 += velX1;
         
               y1 += velY1;
     }

     public void keyPressed(KeyEvent e)
     {
             int code = e.getKeyCode();
             int code1 = e.getKeyCode();
             
             if(code == KeyEvent.VK_UP)
                     up1();
             else if(code == KeyEvent.VK_DOWN)
                     down1();
             else if(code == KeyEvent.VK_RIGHT)
                     right1();
             else if(code == KeyEvent.VK_LEFT)
                     left1();
             
             
             else if(code1 == KeyEvent.VK_W)
                 up();
             else if(code1 == KeyEvent.VK_S)
                 down();
             else if(code1 == KeyEvent.VK_D)
                 right();
             else if(code1 == KeyEvent.VK_A)
                 left();

             if(y >= 750 && y1 >= 750 && x >= 600 && x <= 700 && x1 >= 900 && x1 <= 1000) {
            	 infoBox("Congratulations! You found Max!", "Congratulations!");
            	 
            	 
             }
     }
     public static void infoBox(String infoMessage, String titleBar)
     {
         JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.PLAIN_MESSAGE);
     }

     public void keyTyped(KeyEvent e) {}
     public void keyReleased(KeyEvent e) {}

}