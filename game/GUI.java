package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import animal.*;
import cell.Barn;
import cell.Coop;
import cell.Grassland;
import cell.Land;
import cell.Mixer;
import cell.Truck;
import cell.Well;

import java.awt.Canvas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GUI extends JFrame {
	private final int GUI_WIDTH = 600;
	private final int GUI_LENGTH = 600;
	private final String imgLoc = "/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi'sFarm/src/img/";
	private Map m;
	private ArrayList<FarmAnimal> hewan;
	private Player p;
	private JPanel contentPane;
	private JTextField textField;
	private JButton[][] mapSquares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public GUI() throws FileNotFoundException {
		int i,j;
		String squareId;
		m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
		mapSquares = new JButton[m.getMapLength()][m.getMapWidth()];
		hewan = new ArrayList<FarmAnimal>();
		p = new Player();
		hewan.add(new Ayam());
		hewan.add(new Babi());
		hewan.add(new Bebek());
		hewan.add(new Kambing());
		hewan.add(new Kelinci());
		hewan.add(new Sapi());
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, GUI_WIDTH, GUI_LENGTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Map
		JPanel map = new JPanel();
		map.setLayout(new GridLayout(m.getMapLength(),m.getMapWidth()));
		contentPane.add(map, BorderLayout.CENTER);
		for(i = 0;i<m.getMapLength();i++)
		{
			for(j = 0;j<m.getMapWidth();j++)
			{
				squareId = "("+i/m.getMapLength()+","+i%m.getMapWidth()+")";
				mapSquares[i][j] = (new JButton(squareId));
			}
		}
		addButtons(map,mapSquares);
		update();
		m.drawMap();
		updateMap(mapSquares);
		
		//Bottom Navigations
		JPanel bottNav = new JPanel();
		contentPane.add(bottNav, BorderLayout.SOUTH);
		bottNav.setLayout(new GridLayout(1,2));
		JPanel buttonPanel = new JPanel();
		JPanel textPanel = new JPanel();
		bottNav.add(buttonPanel);
		bottNav.add(textPanel);
		
		buttonPanel.setLayout(new GridLayout(3,3));
		textPanel.setLayout(new GridLayout(4,1));
		
		JPanel infoPanel = new JPanel();
		textPanel.add(infoPanel);
		infoPanel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel moneyInfo = new JLabel("$");
		infoPanel.add(moneyInfo);
		
		JLabel waterInfo = new JLabel("Water:");
		infoPanel.add(waterInfo);
		
		JTextArea backpackInfo = new JTextArea();
		backpackInfo.setText("Backpack: ");
		backpackInfo.setEditable(false);
		textPanel.add(backpackInfo);
		
		JLabel textInfo = new JLabel("");
		textPanel.add(textInfo);
		
		JPanel inputPanel = new JPanel();
		textPanel.add(inputPanel);
		inputPanel.setLayout(new GridLayout(1, 2, 0, 0));
		
		textField = new JTextField();
		inputPanel.add(textField);
		textField.setColumns(10);
		
		JButton sbmtBtn = new JButton("Submit");
		inputPanel.add(sbmtBtn);
		
		JButton killBtn = new JButton("Kill");
		buttonPanel.add(killBtn);
		
		JButton UpBtn = new JButton("Up");
		UpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.move("UP", m);
				aniMove();
				update();
				updateMap(mapSquares);
			}
		});
		buttonPanel.add(UpBtn);
		
		JButton interactBtn = new JButton("Interact");
		buttonPanel.add(interactBtn);
		
		JButton leftBtn = new JButton("Left");
		leftBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.move("LEFT", m);
				aniMove();
				update();
				updateMap(mapSquares);
			}
		});
		buttonPanel.add(leftBtn);
		
		JButton talkBtn = new JButton("Talk");
		buttonPanel.add(talkBtn);
		
		JButton rightBtn = new JButton("Right");
		rightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.move("RIGHT", m);
				aniMove();
				update();
				updateMap(mapSquares);
			}
		});
		buttonPanel.add(rightBtn);
		
		JButton mixBtn = new JButton("Mix");
		buttonPanel.add(mixBtn);
		
		JButton downBtn = new JButton("Down");
		downBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.move("DOWN", m);
				aniMove();
				update();
				updateMap(mapSquares);
			}
		});
		buttonPanel.add(downBtn);
		
		JButton growBtn = new JButton("Grow");
		buttonPanel.add(growBtn);
		
	}
	
	private void addButtons(JPanel p,JButton[][] mapSquares)
	{
		for(int i = 0;i<m.getMapLength();i++)
		{
			for(int j = 0;j<m.getMapWidth();j++)
			{
				p.add(mapSquares[i][j]);
			}
		}
	}
	
	private void update()
	{
		m.resetMap();
		for(Land a : m.getEatb())
		{
			a.render(m);
		}
		for(FarmAnimal h : hewan)
		{
			h.render(m);
		}
		p.render(m);
	}
	
	private void aniMove()
	{
		for(FarmAnimal h : hewan)
		{
			h.move(m);
		}
	}
	
	private void updateMap(JButton[][] butts)
	{
		Image img = null;
		char c = '\0';
		for(int i = 0;i<m.getMapLength();i++)
		{
			for(int j = 0;j<m.getMapWidth();j++)
			{
				switch (m.getMapEl(i, j))
                {
                    case 'o':
                    		c = 'o';
                        img = Toolkit.getDefaultToolkit().getImage(imgLoc+"coop.png");
                        break;
                    case '-':
                    		c = '-';
                    		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"grass.png");
                        break;
                    case 'x':
                    		c = 'x';
                    		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"barn.png");
                        break;
                    case 'T':
                    		c = 'T';
                    		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"truck.png");
                        break;
                    case 'M':
                    		c = 'M';
                    		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"mixer.png");
                        break;
                    case 'W':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"well.png");
	                    break;
                    case 'C':
                    		c = 'W';
                    		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"red.JPG");
                        break;
                    case 'P':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"red.JPG");
	                    break;
                    case 'G':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"red.JPG");
	                    break;
                    case 'R':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"red.JPG");
	                    break;
                    case 'S':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"red.JPG");
	                    break;
                    case '*':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"eatGrass.png");
	                    break;
                    case 'F':
	                		c = 'W';
	                		img = Toolkit.getDefaultToolkit().getImage(imgLoc+"farmer.png");
	                    break;
                    default:
                        break;
                }
				int pos = (i*m.getMapLength())+j;
				
				/*
				String s = "(" + pos/m.getMapLength() + "," + pos%m.getMapWidth() + ")";
				System.out.print(" "+s);
				butts.get(pos).setText(s);
				*/
				butts[i][j].setIcon(new ImageIcon(img));
			}
			System.out.println();
		}
	}
	

}
