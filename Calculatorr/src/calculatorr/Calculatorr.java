/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorr;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

/**
 *
 * @author Nootan
 */
class MyJButton extends JFrame implements ActionListener{
    
    Container c;
    JButton b11 = new JButton("7");
    JButton b12 = new JButton("8");
    JButton b13 = new JButton("9");
    JButton b14 = new JButton("X");
    JButton b21 = new JButton("4");
    JButton b22 = new JButton("5");
    JButton b23 = new JButton("6");
    JButton b24 = new JButton("-");
    JButton b31 = new JButton("1");
    JButton b32 = new JButton("2");
    JButton b33 = new JButton("3");
    JButton b34 = new JButton("+");
    JButton b41 = new JButton("C");
    JButton b42 = new JButton("0");
    JButton b43 = new JButton("!");
    JButton b44 = new JButton("/");
    JButton b51 = new JButton("=");
   
    JLabel l1 = new JLabel("");
    JLabel lop = new JLabel("");
    JLabel l2 = new JLabel("");
    JLabel l3 = new JLabel("");
    
    MyJButton(){
    
        c = this.getContentPane();
        c.setLayout(null);
        b11.setBounds(0,80,70,40);
        b12.setBounds(90,80,70,40);
        b13.setBounds(180,80,70,40);
        b14.setBounds(270,80,70,40);
        
        b21.setBounds(0,140,70,40);
        b22.setBounds(90,140,70,40);
        b23.setBounds(180,140,70,40);
        b24.setBounds(270,140,70,40);
        
        b31.setBounds(0,200,70,40);
        b32.setBounds(90,200,70,40);
        b33.setBounds(180,200,70,40);
        b34.setBounds(270,200,70,40);
        
        
        b41.setBounds(0,260,70,40);
        b42.setBounds(90,260,70,40);
        b43.setBounds(180,260,70,40);
        b44.setBounds(270,260,70,40);
        
        b51.setBounds(0,320,340,40);
        
        
        l1.setBounds(0,0,100,50);
        lop.setBounds(0,20,100,50);
        l2.setBounds(0,40,100,50);
        l3.setBounds(300,20,100,50);
        
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
        
        b41.addActionListener(this);
        b42.addActionListener(this);
        b43.addActionListener(this);
        b44.addActionListener(this);
        
        b51.addActionListener(this);
        
        c.add(b11);
        c.add(b12);
        c.add(b13);
        c.add(b14);
        
        c.add(b21);
        c.add(b22);
        c.add(b23);
        c.add(b24);
        
        c.add(b31);
        c.add(b32);
        c.add(b33);
        c.add(b34);
        
        c.add(b41);
        c.add(b42);
        c.add(b43);
        c.add(b44);
        c.add(b51);
        
        c.add(b41);
        c.add(l1);
        c.add(lop);
        c.add(l2);
        c.add(l3);
    }
     String x1 = "";
     String x2 = "";
     String op = "";
     Boolean flag = false;
   public void actionPerformed(ActionEvent e){
       if(flag == false){
      
        if (e.getSource() == b11){
            x1 = x1+"7";
            l1.setText(x1);
        }
       if(e.getSource() == b12){
            x1=x1+"8";
            l1.setText(x1);
        }
       if(e.getSource() == b13){
            x1=x1+"9";
            l1.setText(x1);
        }
       if(e.getSource() == b21){
            x1=x1+"4";
            l1.setText(x1);
        }
        if(e.getSource() == b22){
            x1=x1+"5";
            l1.setText(x1);
        }
         if(e.getSource() == b23){
            x1=x1+"6";
            l1.setText(x1);
        }
          if(e.getSource() == b31){
            x1=x1+"1";
            l1.setText(x1);
        }
           if(e.getSource() == b32){
            x1=x1+"2";
            l1.setText(x1);
        }
            if(e.getSource() == b33){
            x1=x1+"3";
            l1.setText(x1);
        }
          if(e.getSource() == b42){
            x1=x1+"0";
            l1.setText(x1);
        }
       }
       
       
         if(e.getSource() == b14 && x1 != ""){
            flag = true;
            op="X";
            lop.setText(op);
        } 
         
         if(e.getSource() == b24 && x1 != ""){
            flag = true;
            op="-";
            lop.setText(op);
        } 
         if(e.getSource() == b34 && x1 != ""){
            flag = true;
            op="+";
            lop.setText(op);
        } 
         if(e.getSource() == b44 && x1 != ""){
            flag = true;
            op="/";
            lop.setText(op);
        } 
         
         
         if(e.getSource() == b41){
            flag = false;
            op="";
            x1 = "";
            x2 = "";
            l1.setText(x1);
            l2.setText(x2);
            lop.setText(op);
        } 
         if(e.getSource()==b43){
             flag = true;
             op ="!";
             lop.setText(op);
         }
        
         
         
         if(e.getSource() == b51){
            if(op=="+"){
                 int s = Integer.parseInt(x1)+Integer.parseInt(x2);
                 String ans = Integer.toString(s);
                 l3.setText(ans);
            }
            else if(op == "-"){
                 int s = Integer.parseInt(x1)-Integer.parseInt(x2);
                 String ans = Integer.toString(s);
                 l3.setText(ans);
            }
             else if(op == "X"){
                 int s = Integer.parseInt(x1)*Integer.parseInt(x2);
                 String ans = Integer.toString(s);
                 l3.setText(ans);
            }
             else if(op == "/"){
                int s = Integer.parseInt(x1)/Integer.parseInt(x2);
                 String ans = Integer.toString(s);
                 l3.setText(ans);   
             }
             else if(op == "!"){
                 int f=1;
                 int s = Integer.parseInt(x1);
                 for(int i =1;i<=s;i++)
                     f=f*i;
                 String ans = Integer.toString(f);
                 l3.setText(ans);
             }
            
            
            flag = false;
            x1="";
            x2="";
            op="";
            l1.setText(x1);
            lop.setText(op);
            l2.setText(x2);
           
         }
         
         
        if(flag == true && x1 != ""){
        if (e.getSource() == b11){
            x2 = x2+"7";
            l2.setText(x2);
        }
       if(e.getSource() == b12){
            x2=x2+"8";
            l2.setText(x2);
        }
       if(e.getSource() == b13){
            x2=x2+"9";
            l2.setText(x2);
        }
       if(e.getSource() == b21){
            x2=x2+"4";
            l2.setText(x2);
        }
        if(e.getSource() == b22){
            x2=x2+"5";
            l2.setText(x2);
        }
         if(e.getSource() == b23){
            x2=x2+"6";
            l2.setText(x2);
        }
          if(e.getSource() == b31){
            x2=x2+"1";
            l2.setText(x2);
        }
           if(e.getSource() == b32){
            x2=x2+"2";
            l2.setText(x2);
        }
            if(e.getSource() == b33){
            x2=x2+"3";
            l2.setText(x2);
        }
            if(e.getSource() == b42){
            x2=x2+"0";
            l2.setText(x2);
        }
        }
         
}

  

    
   
    
}


public class Calculatorr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyJButton jf = new MyJButton();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,50,390,410);
        jf.setTitle("Calculator");
        Container c = jf.getContentPane();
        c.setLayout(null);
    }
    
}
