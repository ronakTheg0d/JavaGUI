import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class BankGUI implements ActionListener
{
JFrame frame;
JPanel panel;
JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
JTextField f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11;
JComboBox <String> c1, c2, c3, c4, c5, c6;
JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
ArrayList<Bankcard> Rounak_li = new ArrayList<Bankcard>();


    public BankGUI()
    {
        
     frame = new JFrame("Bank GUI");
     panel = new JPanel();
     
     l1 = new JLabel("Debit Card");
     l2 = new JLabel("Card id");
          f1 = new JTextField(); 

         l3 = new JLabel("Client name");
         f2 = new JTextField();
         l4 = new JLabel("Balance amount");
         f3 = new JTextField();
         l5 = new JLabel("PIN Number");
         f4 = new JTextField();
         l6 = new JLabel("Issuer bank");
         f5 = new JTextField();
         l7 = new JLabel("Bank account");
         f6 = new JTextField();
      
          l8= new JLabel("Withdrawal amount");
         f7 = new JTextField();
        l9 = new JLabel("Withdrawal date ");
        String[] Year = {"1999","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        String[] Month ={"Jan","Feb","Mar","apr","May","Jun","July","Aug","Sep","Oc","Nov","Dec"};    
        String[] Day = {"1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
         c1 =new JComboBox<>(Year);
         c2 =new JComboBox<>(Month);
         c3 =new JComboBox<>(Day);
          b1 =new JButton("Add Debit Card");
          b2 =new JButton("Display");
          b3 =new JButton("Clear");
          b4 =new JButton("Withdraw");
         
         
          l10 = new JLabel("Credit Card");
          l11 = new JLabel("CVC number");
          f8 = new JTextField();
          l12 = new JLabel("Grace Period");
          f9 = new JTextField();
          l13 = new JLabel("Credit Limit");
          f10 = new JTextField();
          l14 = new JLabel("Interest Rate");
          f11 = new JTextField();
          l15 = new JLabel("Expiration Date");
         String[] year1 = {"1999","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        String[] Day1 = {"1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
        String[] Month1 ={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
         c4 =new JComboBox<>(year1);
         c5 =new JComboBox<>(Month1);
         c6 =new JComboBox<>(Day1);
         b5 =new JButton("Set the credit");
         b6 =new JButton("Cancel Credit Card");
         b7 =new JButton("Display");
         b8 =new JButton("Add Credit Card");
         b9 =new JButton("Clear");
    
        frame.add(l1);  
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(l10);
        frame.add(l11);
        frame.add(l12);
        frame.add(l13);
        frame.add(l14);
        frame.add(l15);
        frame.add(f1);
        frame.add(f2);
        frame.add(f3);
        frame.add(f4);
        frame.add(f5);
        frame.add(f6);
        frame.add(f7);
        frame.add(f8);
        frame.add(f9);
        frame.add(f10);
        frame.add(f11);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        frame.add(c6);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        
        
        
        
        l11.setBounds(20,420,200,40);
        f8.setBounds(120,425,150,30);
        l12.setBounds(20,470,200,40);
        f9.setBounds(120,470,150,30);
        l13.setBounds(600,410,200,40);
        f10.setBounds(680,410,150,30);
        l14.setBounds(600,460,200,40);
        f11.setBounds(680,462,150,30);
        
        
        l15.setBounds(20,520,200,40);
        c4.setBounds(120,527,80,25);
        c5.setBounds(230,527,50,25);
        c6.setBounds(300,527,50,25);
        
        
        b5.setBounds(18,569,150,40);
        b6.setBounds(218,569,150,40);
        b7.setBounds(418,569,150,40);
        b9.setBounds(618,569,150,40);
        b8.setBounds(318,640,150,40);
        
        
        
        l1.setBounds(350,15,200,40);
        l10.setBounds(350,400,200,40);
        l2.setBounds(20,70,100,20);
        f1.setBounds(120,70,150,30);
        l3.setBounds(600,70,200,40);
        f2.setBounds(680,75,150,30);
        l4.setBounds(20,120,100,20);
        f3.setBounds(120,120,150,30);
        l5.setBounds(600,170,200,40);
        f4.setBounds(680,175,150,30);
        l6.setBounds(600,120,200,40);
        f5.setBounds(680,125,150,30);
        l7.setBounds(20,170,200,40);
        f6.setBounds(120,180,150,30);
         l8.setBounds(20,280,200,40);
        f7.setBounds(130,290,150,30);
              
         l9.setBounds(20,330,200,40);
        c1.setBounds(120,340,80,25);
        c2.setBounds(230,340,50,25);
        c3.setBounds(300,340,50,25);
        
        b1.setBounds(200,230,150,40);
           b2.setBounds(600,230,150,40);
           b3.setBounds(600,280,150,40);
           b3.setBounds(800,280,150,40);
           b4.setBounds(600,280,150,40);
           
           
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1150,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

}
public void actionPerformed(ActionEvent a)
 {
        // clear button
        if (a.getSource() == b3) {
            f1.setText("");
            f2.setText("");
            f3.setText("");
            f4.setText("");
            f5.setText("");
            f6.setText("");
            f7.setText("");
            
            
            c1.setSelectedIndex(0);
            c2.setSelectedIndex(0);
            c3.setSelectedIndex(0);
           
            
        }
        else if (a.getSource() == b9) {
            f8.setText("");
            f9.setText("");
            f10.setText("");
            f11.setText("");
            f5.setText("");
            f6.setText("");
            f7.setText("");
            f8.setText("");
            f9.setText("");
            f10.setText("");
            f11.setText("");
            
            c4.setSelectedIndex(0);
            c5.setSelectedIndex(0);
            c6.setSelectedIndex(0);
            
            
        }
        
        else if (a.getSource() == b2) 
        {
            for (Bankcard R : Rounak_li)
            {
                if(R instanceof Debitcard){
                    Debitcard object = (Debitcard) R;
                    object.display();
                }
            }
        }
        else if (a.getSource() == b7)
        {
            for (Bankcard R : Rounak_li)
            {
                if(R instanceof Creditcard){
                    Creditcard object = (Creditcard) R;
                    object.display();
                }
            }
        }
        else if (a.getSource() == b6) 
        {
            if (f1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill up the textfield with appropriate data.","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
              try
              {
                 int Cardid = Integer.parseInt(f1.getText());
                 boolean x = false;
                 
                 for (Bankcard R : Rounak_li)
                {
                    if(R instanceof Creditcard){
                        Creditcard object = (Creditcard) R;
                        if ( Cardid == object.getcard_Id())
                        {
                            object.cancelCreditcard();
                            x = true;
                            JOptionPane.showMessageDialog(frame, "Credit card cancelled","Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else 
                        {
                            x = false;
                        }
                    }
                }
                if (x = false)
                {
                   JOptionPane.showMessageDialog(frame, "Card id not found", "Error",JOptionPane.ERROR_MESSAGE); 
                }
              }catch (NumberFormatException b) {
                    JOptionPane.showMessageDialog(frame, "Please enter the appropriate values in the textfield", "Error",JOptionPane.ERROR_MESSAGE);
                        }
            }
        }
        else if (a.getSource() == b4)
        {
            if (f1.getText().isEmpty() || f4.getText().isEmpty() || f7.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill up the textfield with appropriate data.","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
              try
              {
                 int Cardid = Integer.parseInt(f1.getText());
                 int withdraw = Integer.parseInt(f7.getText());
                 int pin = Integer.parseInt(f4.getText());
                 String year = (String) c1.getSelectedItem();
                 String month = (String) c2.getSelectedItem();
                 String day = (String) c3.getSelectedItem();
                 String time = year+month+day;
                 boolean x = false;
                 
                 for (Bankcard R : Rounak_li)
                {
                    if(R instanceof Debitcard){
                        Debitcard object = (Debitcard) R;
                        if ( Cardid == object.getcard_Id())
                        {
                            if (pin == object.getPINnumber())
                            {
                                x = true;
                                if (withdraw <= object.getbalance_amount())
                                {
                                    object.withdraw(withdraw, time, pin);
                                    JOptionPane.showMessageDialog(frame, "Successfully withdrawn","Message", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else 
                                {
                                    JOptionPane.showMessageDialog(frame, "Low Balance Amount", "Error",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else 
                            {
                                JOptionPane.showMessageDialog(frame, "Wrong Pin number", "Error",JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                        else 
                        {
                            x = false;
                        }
                    }
                }
                if (x = false)
                {
                   JOptionPane.showMessageDialog(frame, "Card id not found", "Error",JOptionPane.ERROR_MESSAGE); 
                }
              }catch (NumberFormatException b)
              {
                    JOptionPane.showMessageDialog(frame, "Please enter the appropriate values in the textfield", "Error",JOptionPane.ERROR_MESSAGE);
              }
        }
        }
        else if (a.getSource() == b5)
        {
            if (f1.getText().isEmpty() || f10.getText().isEmpty() || f9.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please fill up the textfield with appropriate data.","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                try
                {
                     int Cardid = Integer.parseInt(f1.getText()); 
                     boolean x = false;
                     double credit = Double.parseDouble(f10.getText());
                     int Grace = Integer.parseInt(f9.getText());
                    for (Bankcard R : Rounak_li)
                    {
                        if(R instanceof Creditcard)
                        {
                            Creditcard object = (Creditcard) R;
                            if ( Cardid == object.getcard_Id())
                            {
                                x = true;
                                if ( credit <= 2.5*object.getbalance_amount())
                                {
                                    object.setcreditLimit(credit, Grace);
                                    JOptionPane.showMessageDialog(frame, "Set Credit Limit","Message", JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                                else 
                                {
                                    JOptionPane.showMessageDialog(frame, "Credit limit too high", "Error",JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            }
                            else 
                            {
                                x = false;
                            }
                        }
                    }
                    if (x = false)
                    {
                       JOptionPane.showMessageDialog(frame, "Card id not found", "Error",JOptionPane.ERROR_MESSAGE); 
                    }
                }catch (NumberFormatException b)
              {
                    JOptionPane.showMessageDialog(frame, "Please enter the appropriate values in the textfield", "Error",JOptionPane.ERROR_MESSAGE);
              }
            }
        }
        else if (a.getSource() == b1)
        {
            if (f1.getText().isEmpty() || f2.getText().isEmpty() || f3.getText().isEmpty() || f4.getText().isEmpty() || f5.getText().isEmpty() || f6.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(frame, "Please fill up the textfield with appropriate data.","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    double balanceamt = Double.parseDouble(f3.getText());
                    int Cardid = Integer.parseInt(f1.getText()); 
                    int pin = Integer.parseInt(f4.getText());
                    String Clientname = f2.getText();
                    String issuerbank = f5.getText();
                    String Bankacc = f6.getText();
                    boolean x = true;
                    for (Bankcard R : Rounak_li)
                    {
                        if(R instanceof Debitcard){
                            Debitcard object = (Debitcard) R;
                            if ( Cardid == object.getcard_Id())
                            {
                                x = false;
                            }
                        }
                    }
                    if ( x == true) 
                    {
                        Debitcard apple = new Debitcard(balanceamt, Cardid, Bankacc, issuerbank, Clientname, pin);
                        Rounak_li.add(apple);
                        JOptionPane.showMessageDialog(frame, "Debit card succesfully added","Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(frame, "Card id already exist", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch (NumberFormatException b)
                  {
                    JOptionPane.showMessageDialog(frame, "Please enter the appropriate values in the textfield", "Error",JOptionPane.ERROR_MESSAGE);
                  }
                
            }
        }
        else if (a.getSource() == b8)
        {
            if (f1.getText().isEmpty() || f2.getText().isEmpty() || f3.getText().isEmpty() || f8.getText().isEmpty() || f5.getText().isEmpty() || f6.getText().isEmpty() || f11.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(frame, "Please fill up the textfield with appropriate data.","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    double balanceamt = Double.parseDouble(f3.getText());
                    int Cardid = Integer.parseInt(f1.getText()); 
                    int cvcnum = Integer.parseInt(f8.getText());
                    String Clientname = f2.getText();
                    String issuerbank = f5.getText();
                    String Bankacc = f6.getText();
                    double interest = Double.parseDouble(f11.getText());
                    String year = (String) c4.getSelectedItem();
                    String month = (String) c5.getSelectedItem();
                    String day = (String) c6.getSelectedItem();
                    String time = year+month+day;
                    boolean x = true;
                    for (Bankcard R : Rounak_li)
                    {
                        if(R instanceof Debitcard){
                            Creditcard object = (Creditcard) R;
                            if ( Cardid == object.getcard_Id())
                            {
                                x = false;
                            }
                        }
                    }
                    if ( x == true) 
                    {
                        Creditcard apple = new Creditcard(balanceamt, Cardid, Bankacc, issuerbank, Clientname, cvcnum, interest, time );
                        Rounak_li.add(apple);
                        JOptionPane.showMessageDialog(frame, "Credit card succesfully added","Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(frame, "Card id already exist", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch (NumberFormatException b)
                  {
                    JOptionPane.showMessageDialog(frame, "Please enter the appropriate values in the textfield", "Error",JOptionPane.ERROR_MESSAGE);
                  }
                
            }
        }
}
        
public static void main(String args[]) {
        new BankGUI();
    }

}

