import javax.swing.*;
/** Detyra5_2 ka metoden Product e cila ka dy parametra, ku
  * a eshte me e vogel se b,
  * dhe jep rezultatin e shumezimit a*(a+1)*(a+2)*...*b 
  *
  *
  *author: EIbrahimi*/
public class Detyra5_2
{ public Detyra5_2()
  {}
  
  
  public int Product(int a, int b)
  { int sum = 1;
    if(b<0|| a<0)//make sure that numbers aren't negative
      { JOptionPane.showMessageDialog(null, "Error. Negative numbers.");}
    else{ if(b>a)
            { sum = a;
              int count=a;
              while(count!=b)
                   { count= count+1;
                     sum=sum*count;
                   }
              }
           else{sum=a*b;}               
         }
   return sum;
  }     
                
  public static void main(String[] args)
  { Detyra5_2 klasa = new Detyra5_2();
    int a = new Integer(JOptionPane.showInputDialog("Type the first number.")).intValue();
    int b = new Integer(JOptionPane.showInputDialog("Type the second number.")).intValue();
    JOptionPane.showMessageDialog(null, "Product is: "+ klasa.Product(a, b)+".");
    
  }
}