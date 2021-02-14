import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.util.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class CalculatorClient { 

    public static double cal(int val, String str){
        double result = 0;
        try { 
            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService"); 
        result = c.con(val, str);
        } 
        catch (MalformedURLException murle) { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) { 
            System.out.println(); 
            System.out.println(
                        "RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println(
                       "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException
                                      ae) { 
            System.out.println(); 
            System.out.println(
             "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    return result;
    }

    public static void makeGUI(){
        String s1[] = {"Kuwait (KWD)", "Bahrain (BHD)", "Oman (OMR)", "Jordan (JOD)", "Gibraltar (GIP)", "Great Britain (GBP)", "The Cayman Islands (KYD)", "The European Union (EUR)", "Switzerland (CHF)", "USA (USD)"}; 
        JFrame f = new JFrame("Welcome to Currency Converter"); 
        f.setBackground(Color.MAGENTA);
        f.getContentPane().setBackground(Color.GREEN);
        JLabel l1, l2 , l3, l4; 
        JTextField t1; 
        JComboBox j1;
        JButton b1;

    

        l1 = new JLabel("Select Currency"); 
        l1.setBounds(200, 10, 150, 30);  // x,y,w,h
        l2 = new JLabel("Enter Amount"); 
        l2.setBounds(10, 10, 150, 30);

        t1 = new JTextField("0"); 
        t1.setBounds(100, 10, 50, 30); 
        j1 = new JComboBox(s1); 

        j1.setBounds(310, 10, 250, 30); 
        

        b1 = new JButton("Convert to INR"); 
        b1.setBounds(200, 60, 120, 20);
        
        //b1.setBackground(Color.ORANGE);
        //b1.setOpaque(true);
        //b1.setForeground(Color.WHITE);

        l3 = new JLabel("Result = ");
        l3.setBounds(200, 100, 80, 30); 

        l4 = new JLabel("");
        l4.setBounds(260, 100, 80, 30); 

        b1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                double res = 0;
                int amount 
                    = Integer.parseInt(t1.getText()); 
                String str = j1.getSelectedItem().toString();
                res = cal(amount, str);
                String result = String.valueOf(res); 
                l4.setText(result); 
            } 
        }); 

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(j1);
        f.add(b1);
        f.add(l3);
        f.add(l4);

        f.setLayout(null); 
        f.setSize(600, 400); 
        f.setVisible(true); 
    }
 
    public static void main(String[] args) { 
        makeGUI();
    } 
}