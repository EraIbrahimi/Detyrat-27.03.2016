import javax.swing.*;
/**Detyra5_3dhe4 ka metoden factorial,
  *me parametrin int n, i cili do te llogarise n!
  *metoden sine dhe cosin qe marrin nje vlere dhe e shenderrojne ne cos apo sin me formulat
  *perkatese sin(x) = x - (x^3/3!) + (x^5/5!) - (x^7/7!) + ... - (x^19/19!)
  * dhe  cosin(x) = 1 - (x^2/2!) + (x^4/4!) - (x^6/6!) + ... - (x^20/20!)
  *
  *author: EIbrahimi*/
public class Detyra5_3dhe4
{ public Detyra5_3dhe4()
  {}
  
  public long factorial(int n)
  { long sum= 1;
    if (n<0)
       {sum = -1;}//Wrong
    else{if (n==0)
            {JOptionPane.showMessageDialog(null, sum);
             System.exit(0);}//close program
         else{ int count =0;
               while(count <n)
                    { count++;
                      sum=sum*count;
                    }
             }
        }
    return sum;  
  }
 
 
  public double sine(double x)
  { double sin = x;
    int count = 3;
    while ( count <= 19 )
          { double d = Math.pow(x, count) / factorial(count); 
            if ((count % 4) == 3 )
                { sin = sin - d; }
            else{ sin = sin + d; }
            count = count + 2;
          }
    return sin;
   }
    
  public double cosin(double x)
  { double cos= 1;
    int count = 2;
    while( count<=20)
          { double c = Math.pow(x, count)/factorial(count);
            if((count%4) == 2)
              { cos = cos - c;}
            else{cos = cos + c;}
            count = count + 2 ;
          }
    return cos;
  }
  
    

  public static void main(String[] args)
  { Detyra5_3dhe4 klasa = new Detyra5_3dhe4();
    int num = new Integer(JOptionPane.showInputDialog("Type the number.")).intValue();
    JOptionPane.showMessageDialog(null, +num+"! is ="+ klasa.factorial(num));
    JOptionPane.showMessageDialog(null, "Sine of "+num+" is "+ klasa.sine(num));
    JOptionPane.showMessageDialog(null, "Cosine of "+ num+ " is "+ klasa.cosin(num));
  }
}