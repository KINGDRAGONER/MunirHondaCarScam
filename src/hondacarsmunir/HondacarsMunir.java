
package hondacarsmunir;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.Box;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
///////BEFORE ANYTHING IM SORRY FOR DOING THIS IN ONE CLASS MAJORITY OF KEY SECTIONS ARE COMENTED with //// or !!!!!! or ------- or some other special character
public class HondacarsMunir extends JFrame implements ActionListener
{
  private JRadioButton ix, sport, ex,red,black,blue; 
  private JButton order;
 
  private JCheckBox HeatedSeat, rgb, gps;
  private ArrayList<String> top;
  private JTextField display;
  
    private JLabel image;
    private int smoney,smoney2,csmoney1,csmoney2,csmoney3;
    private JTextArea pic;
    private String cars,colors,acc1,acc2,acc3;
    JFrame frame = new JFrame();
  public HondacarsMunir()
  {
       super("Munir's car scam");
    CompoundBorder border = new CompoundBorder(
        new EmptyBorder(6, 6, 6, 6),     // 6 pixels on top, left, bottom, right
        new LineBorder(Color.black, 1)); // outside, 1 pixel thick

    
    ix = new JRadioButton("IX+$100");
    sport = new JRadioButton("Sport+$200");
    ex = new JRadioButton("EX+$100", true);

    ButtonGroup gr = new ButtonGroup();
    gr.add(ix);
    gr.add(sport);
    gr.add(ex);
    
    
     pic = new JTextArea(5,10);
   pic.setBackground(Color.RED);
    pic.setEditable(false);
   
    
    /////////////////////STRINGS for the recipt/////////////////////////////////////////
    
    cars="";
    colors="";
    acc1="";
    acc2="";
    acc3="";
    
    /////////////////////////////////////////////////////////////
    ///////////////////////////////SETTING UP THE FRAME aka NEW WINDOW///////////////////////////////////////

    image = new JLabel();
    
    image.setOpaque(true);
    
    JPanel l = new JPanel();
    
    l.add(image);
    
    l.setBounds(0,0,700,700);
    frame.setBackground(Color.RED);
    frame.add(l);
    frame.setSize(700,425);
    frame.setLayout(null);
   
    //////////////////////////////////////////////////////////////////////////
    JPanel sizes  = new JPanel();
    sizes.setBorder(border);
    sizes.setLayout(new GridLayout(3, 1, 10, 10));
    sizes.add(ix);
    sizes.add(sport);
    sizes.add(ex);
    
    
    
     Box hbox = Box.createHorizontalBox();
    hbox.add(Box.createHorizontalStrut(5));
    hbox.add(sizes);
    hbox.add(Box.createHorizontalStrut(5));
    
    hbox.add(Box.createHorizontalStrut(5));
   
    Box vbox = Box.createVerticalBox();
    vbox.add(Box.createVerticalStrut(5));
    
    ////////////--------------------------------COLORS--------------------------
    
     red = new JRadioButton("red+ $100");
    blue = new JRadioButton("blue+$100");
    black = new JRadioButton("black+$200", true);
    ButtonGroup ss = new ButtonGroup();
    ss.add(red);
    ss.add(blue);
    ss.add(black);
    JPanel s  = new JPanel();
    s.setBorder(border);
    s.setLayout(new GridLayout(3, 4, 10, 10));
    s.add(red);
    s.add(blue);
    s.add(black);
     hbox.add(s);
    ////////////----------ACCESORIES------------------------------------
    

    HeatedSeat = new JCheckBox("Heated Seat+$200");
    rgb = new JCheckBox("rgb+$100");
    gps = new JCheckBox("gps+$100");

    JPanel accesories  = new JPanel();
    accesories.setBorder(border);
    accesories.setLayout(new GridLayout(3, 1, 10, 10));
    accesories.add(HeatedSeat);
    accesories.add(rgb);
    accesories.add(gps);
    
     hbox.add(accesories);
    
    ////////////////////////////////////////////////////////////
    order = new JButton("Order");

    
    order.addActionListener(this);
    ////---------------TEXT FIELD------------------------------------------
    display = new JTextField(10);
    display.setBackground(Color.BLUE);
    display.setEditable(false);
    //////////////////////////////////////////////////////////////////////
    JPanel disp = new JPanel();
    disp.setBorder(border);
    disp.setLayout(new GridLayout(1,2,5,5));
    disp.add(display);
     //////////////////////////////////////////////////////////////////////
    
    JPanel buttons = new JPanel();
    buttons.setBorder(border);
    buttons.setLayout(new GridLayout(3,1,10,10));
    
    buttons.add(order);
     hbox.add(buttons);
    vbox.add(disp);
   
    
  

   
  JPanel bottomleft = new JPanel();
    
  bottomleft.setLayout(new GridLayout(2,2,3,4));
  bottomleft.add(pic);
   vbox.add(bottomleft);
  
    

    Container c = getContentPane();
    c.setLayout(new GridLayout(2,1, 10,10));
    c.add(hbox, BorderLayout.NORTH);
    c.add(vbox, BorderLayout.CENTER);
    
    
    /////////////CASH////////////////////
     smoney =0;
     smoney2 =0;
     csmoney1=0;
     csmoney2=0;
     csmoney3=0;
     
     
     ///////////////////////////////////////
  }
  
   ///////////////// ///////////////// ///////******  ACTUAL IMAGES********////////// ///////////////// ///////////////// /////////////////
  ////!!!!!RED
  ImageIcon lxpic = new ImageIcon("lxr.png");
    ImageIcon expic = new ImageIcon("exr.png");
    ImageIcon sportpic = new ImageIcon("sport.png");
    
   ////!!!!!BLUE 
    ImageIcon lxpicb = new ImageIcon("lx.png");
    ImageIcon expicb = new ImageIcon("exb.png");
    ImageIcon sportpicb = new ImageIcon("sportb.png");
    
   ////!!!!!BLACK
     ImageIcon lxpicbl = new ImageIcon("lxbl.png");
    ImageIcon expicbl = new ImageIcon("ex.png");
    ImageIcon sportpicbl = new ImageIcon("sportbl.png");
    ///////////////// ///////////////// ///////////////// ///////////////// ///////////////// /////////////////
   public void actionPerformed(ActionEvent e)
   {
       
       JButton click = (JButton)e.getSource();
       String car = "";
       String color="";
       
       top = new ArrayList<>();
       //// THIS is where selections are chosen and recorded
       
       if(ix.isSelected())
       {
           car = "LX";
           smoney= 100;
           cars = "LX                      +$100";
       }
       else if(sport.isSelected())
       {
           car= "Sport";
           smoney=200;
           cars = "Sport                 +$200";
       }
       else 
       {
           car = "EX";
           smoney=100;
           cars = "EX                      +$100";
       }
       
       if(red.isSelected())
       {
           color = "red";
           smoney2=100;
           colors = "red                    +$100";
       }
       else if(blue.isSelected())
       {
           color= "blue";
           smoney2=100;
           colors = "blue                   +$100";
       }
       else 
       {
           color = "black";
           smoney2=200;
           colors = "black                 +$200";
       }
       
       
       if(HeatedSeat.isSelected())
       { top.add("heated seat");
        csmoney1=200;
        acc1= "HeatedSeat        +$200";
       }
       if(rgb.isSelected())
       { top.add("rgb");
        csmoney2=100;
        acc2= "rgb                    +$100";
       }
       if(gps.isSelected())
       { top.add("gps");
        csmoney3=100;
        acc3= "gps                    +$100";
       }
        String totallist ="";

       int csmoneytotal=0;
       csmoneytotal = csmoney1+csmoney2+csmoney3;
       
       String tops = "";
       int totalsmoney =smoney+smoney2+csmoneytotal;
       for(String t : top)
           tops = tops +","+ t ;
       //////////////////////////////////?REGRET/////// THE LIST/////////////////////////////////
        if(gps.isSelected()&&!rgb.isSelected()&&HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc3+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }if(!gps.isSelected()&&rgb.isSelected()&&!HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc2+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
        if(!gps.isSelected()&&!rgb.isSelected()&&HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc1+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
        
        if(gps.isSelected()&&rgb.isSelected()&&!HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc2+"\n"+acc3+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
        if(gps.isSelected()&&!rgb.isSelected()&&HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc1+"\n"+acc3+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
       if(!gps.isSelected()&&rgb.isSelected()&&HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc1+"\n"+acc2+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
       if(gps.isSelected()&&rgb.isSelected()&&HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+acc1+"\n"+acc2+"\n"+acc3+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
       if(!gps.isSelected()&&!rgb.isSelected()&&!HeatedSeat.isSelected())
       { 
           totallist = cars+"\n"+colors+"\n"+"\n"+"\n"+"\n"+"TOTAL"+"-----------------"+"\n"+totalsmoney;
       }
       
       /////////////////////////////////////////////////////////////////////////////
       String total = "You ordered a " + car + " car with the color "+color +" with the accesories " +tops+" for"+totalsmoney;       
      
       if(click == order)
       {
     ///////////////////////////////// SETING THE WINDOW IMAGES WITH IF STATMENTS /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           if(ix.isSelected()&&red.isSelected())
           {
             image.setIcon(lxpic);  
           frame.setVisible(true);
           }
           if(ex.isSelected()&&red.isSelected())
           {
             image.setIcon(expic);  
           frame.setVisible(true);
           }
           if(sport.isSelected()&&red.isSelected())
           {
             image.setIcon(sportpic);  
           frame.setVisible(true);
           }
           
           if(ix.isSelected()&&blue.isSelected())
           {
             image.setIcon(lxpicb);  
           frame.setVisible(true);
           }
           if(ex.isSelected()&&blue.isSelected())
           {
             image.setIcon(expicb);  
           frame.setVisible(true);
           }
           if(sport.isSelected()&&blue.isSelected())
           {
             image.setIcon(sportpicb);  
           frame.setVisible(true);
           }
           if(ix.isSelected()&&black.isSelected())
           {
             image.setIcon(lxpicbl);  
           frame.setVisible(true);
           }
           if(ex.isSelected()&&black.isSelected())
           {
             image.setIcon(expicbl);  
           frame.setVisible(true);
           }
           if(sport.isSelected()&&black.isSelected())
           {
             image.setIcon(sportpicbl);  
           frame.setVisible(true);
           }
           
           
       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
       ////DISPLAY AND pic =LIST OF ITEMS
            display.setText(total);
           pic.setText(totallist);
           JOptionPane.showMessageDialog(HondacarsMunir.this, "The cost was:$"+totalsmoney);
       }
       
      
   }
   
    

  public static void main(String[] args)
  {
    HondacarsMunir window = new HondacarsMunir();
    window.setSize(1000,700);
    
    
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
    
  }
}


   