package Midterm;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class midtermQ41 extends JFrame implements ActionListener,MouseListener {

   private static final long serialVersionUID = 1L;

   private JButton right,left,up,down;
   private JRadioButton red,green,blue;
   private ButtonGroup group;
   private int xPosition,yPosition;

   public midtermQ41() {

       xPosition=yPosition=350;
       setSize(600, 500);
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Question 41");

       right=new JButton(" > ");
       left=new JButton(" < ");
       up=new JButton(" ^ ");
       down=new JButton(" v ");

       red=new JRadioButton("Red",true);
       green=new JRadioButton("Green");
       blue=new JRadioButton("Blue");

       group=new ButtonGroup();

       group.add(red);
       group.add(green);
       group.add(blue);

       red.setBounds(500,20,100,30);
       green.setBounds(500,60,100,30);
       blue.setBounds(500,100,100,30);

       left.setBounds(480,160,100,30);
       right.setBounds(480,190,100,30);
       up.setBounds(480,220,100,30);
       down.setBounds(480,250,100,30);

       add(red);
       add(green);
       add(blue);

       add(left);
       add(right);
       add(up);
       add(down);

       red.addActionListener(this);
       green.addActionListener(this);
       blue.addActionListener(this);

       left.addActionListener(this);
       right.addActionListener(this);
       up.addActionListener(this);
       down.addActionListener(this);

       addMouseListener(this);
       setVisible(true);

   }


   @Override

   public void paint(Graphics g) {

       super.paint(g);
       if(red.isSelected()) {
           g.setColor(Color.RED);
       }
       else if(green.isSelected()){
               g.setColor(Color.GREEN);
           }
           else if(blue.isSelected()) {
                   g.setColor(Color.BLUE);
               }

       g.fillOval(xPosition-30, yPosition-30, 60, 60);
       g.setColor(Color.BLACK);
       g.drawLine(xPosition, yPosition-60, xPosition, yPosition+60);
       g.drawLine(xPosition-60, yPosition, xPosition+60, yPosition);

   }


   @Override

   public void actionPerformed(ActionEvent action) {

       if(action.getSource()==right) {
           xPosition+=5;
       }else
           if(action.getSource()==left) {
               xPosition-=5;
           }else
               if(action.getSource()==up) {
                   yPosition-=5;
               }else
                   if(action.getSource()==down) {
                       yPosition+=5;
                   }
       repaint();

   }
  
   @Override

   public void mouseClicked(MouseEvent e) {

       xPosition=e.getX();
       yPosition=e.getY();
       repaint();
   }
   
   @Override

   public void mouseEntered(MouseEvent e) {}

   @Override

   public void mouseExited(MouseEvent e) {}

   @Override

   public void mousePressed(MouseEvent e) {}

   @Override

   public void mouseReleased(MouseEvent e) {}

   public static void main(String[] args) {

       new midtermQ41();

   }
}
