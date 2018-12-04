package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import gui.Screen.Grid;



// ********** 2er SCHIFF : 		Waka
// ********** 3er SCHIFF :		Tentacle
// ********** 4er SCHIFF :		Crab
// ********** 5er SCHIFF :		Ghost
// ********** 6er SCHIFF : 		Rose
// ********** 7er SCHIFF :		Dragon
 


public class Ships extends JPanel  implements  MouseMotionListener {
	
	
	// JPANEL BUILT FOR ALL SHIPS SHOWN ON BOARD
	JPanel shipUi;
	int boardsize;
	int count;
	Grid spielfeld;
	schiffliste schifftyp;
	
	public Ships(int boardsize) {
		JPanel shipUi = new JPanel(new GridLayout(7,2));
		this.boardsize = boardsize;
		shipUi.setSize(new Dimension(100,550));
		
	      schiffliste p = new schiffliste();
	      schiffliste[] schifftyp = (p.getship(boardsize));
	      //System.out.println(schifftyp[5].schiffname);
	
		JPanel waka = new Waka(schifftyp);
		JPanel tentacle = new Tentacle(schifftyp);
		JPanel crab = new Crab(schifftyp);
		JPanel ghost = new Ghost(schifftyp);
		JPanel rose = new Rose(schifftyp);
		JPanel dragon = new Dragon(schifftyp);
		shipUi.add(waka);
		shipUi.add(tentacle);
		shipUi.add(crab);
		if(boardsize >=7) shipUi.add(ghost);
		if(boardsize >=15)shipUi.add(rose);
		if(boardsize >=23)shipUi.add(dragon);
		add(shipUi);
		System.out.println(boardsize);
	}

	public void mouseMoved(MouseEvent e) {
        shipUi.setLocation(e.getX()-shipUi.getWidth()/2,
                              e.getY()-shipUi.getHeight()/2);
    }


	public void mouseDragged(MouseEvent arg0) {
		shipUi.repaint();
		
	}

		

	
	
	public int getShipCount() {
		
		
		return count;
	}
	
	 
	
	public void buildShips() {
		
	}

	
	 

	@SuppressWarnings("serial")
	public class Waka extends JPanel{
		
		
		
		Font fontShip = new Font("SansSerif", Font.BOLD, 12);
		public Waka(schiffliste [] schifftyp) {
			JPanel panel = new JPanel(new GridLayout(1,2));
			Object[][] ob = new Object[1][2];
			for (int i = 0; i < ob.length; i++) {
				for (int j = 0; j < ob[i].length; j++) {
					JLabel label = new JLabel();
				    label.setPreferredSize(new Dimension (550/boardsize,550/boardsize));;
				    label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				    label.setBackground(Color.GREEN);
				    label.setOpaque(true);
				    panel.add(label);
				    add(panel);
				}
			}
			add(panel);
			int anzahl = schifftyp[0].anzahl;
			JLabel count= new JLabel("WAKA : " + "0" + "  of  " + anzahl );
			count.setFont(fontShip);
			add(count);
		}
	}
	
	public class Tentacle extends JPanel{
		
		Font fontShip = new Font("SansSerif", Font.BOLD, 12);
		public Tentacle(schiffliste [] schifftyp) {
			JPanel panel = new JPanel(new GridLayout(1,3));
			Object[][] ob = new Object[1][3];
			for (int i = 0; i < ob.length; i++) {
				for (int j = 0; j < ob[i].length; j++) {
					JLabel label = new JLabel();
				    label.setPreferredSize(new Dimension (550/boardsize,550/boardsize));;
				    label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				    label.setBackground(Color.BLUE);
				    label.setOpaque(true);
				    panel.add(label);
				    add(panel);
				}
			}
			add(panel);
			int anzahl = schifftyp[1].anzahl;
			JLabel count= new JLabel("TENTACLE : " + "2" + "  of  " + anzahl );
			count.setFont(fontShip);
			add(count);
		}
	}
	
	public class Crab extends JPanel{
		
		Font fontShip = new Font("SansSerif", Font.BOLD, 12);
		public Crab(schiffliste [] schifftyp) {
			JPanel panel = new JPanel(new GridLayout(1,4));
			Object[][] ob = new Object[1][4];
			for (int i = 0; i < ob.length; i++) {
				for (int j = 0; j < ob[i].length; j++) {
					JLabel label = new JLabel();
				    label.setPreferredSize(new Dimension (550/boardsize,550/boardsize));;
				    label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				    label.setBackground(Color.RED);
				    label.setOpaque(true);
				    panel.add(label);
				    add(panel);
				}
			}
			add(panel);
			int anzahl = schifftyp[2].anzahl;
			JLabel count= new JLabel("CRAB : " + "2" + "  of  " + anzahl );
			count.setFont(fontShip);
			add(count);
		}
	}

	
	public class Ghost extends JPanel{
		
		Font fontShip = new Font("SansSerif", Font.BOLD, 12);
		public Ghost(schiffliste [] schifftyp) {
			JPanel panel = new JPanel(new GridLayout(1,5));
			Object[][] ob = new Object[1][5];
			for (int i = 0; i < ob.length; i++) {
				for (int j = 0; j < ob[i].length; j++) {
					JLabel label = new JLabel();
				    label.setPreferredSize(new Dimension (550/boardsize,550/boardsize));;
				    label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				    label.setBackground(Color.DARK_GRAY);
				    label.setOpaque(true);
				    panel.add(label);
				    add(panel);
				}
			}
			add(panel);
			int anzahl = schifftyp[3].anzahl;
			JLabel count= new JLabel("GHOST : " + "2" + "  of  " + anzahl );
			count.setFont(fontShip);
			add(count);
		}
	}

	public class Rose extends JPanel{
		
		Font fontShip = new Font("SansSerif", Font.BOLD, 12);
		public Rose(schiffliste [] schifftyp) {
			JPanel panel = new JPanel(new GridLayout(1,6));
			Object[][] ob = new Object[1][6];
			for (int i = 0; i < ob.length; i++) {
				for (int j = 0; j < ob[i].length; j++) {
					JLabel label = new JLabel();
				    label.setPreferredSize(new Dimension (550/boardsize,550/boardsize));;
				    label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				    label.setBackground(Color.MAGENTA);
				    label.setOpaque(true);
				    panel.add(label);
				    add(panel);
				}
			}
			add(panel);
			int anzahl = schifftyp[4].anzahl;
			JLabel count= new JLabel("ROSE : " + "2" + "  of  " + anzahl );
			count.setFont(fontShip);
			add(count);
		}
	}
	
	public class Dragon extends JPanel{
		
		Font fontShip = new Font("SansSerif", Font.BOLD, 12);
		public Dragon(schiffliste [] schifftyp) {
			JPanel panel = new JPanel(new GridLayout(1,7));
			Object[][] ob = new Object[1][7];
			for (int i = 0; i < ob.length; i++) {
				for (int j = 0; j < ob[i].length; j++) {
					JLabel label = new JLabel();
				    label.setPreferredSize(new Dimension (550/boardsize,550/boardsize));;
				    label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				    label.setBackground(Color.GRAY);
				    label.setOpaque(true);
				    panel.add(label);
				    add(panel);
				}
			}
			add(panel);
			int anzahl = schifftyp[5].anzahl;
			JLabel count= new JLabel("DRAGON : " + "2" + "  of  " + anzahl );
			count.setFont(fontShip);
			add(count);
		}
	}


	
}
