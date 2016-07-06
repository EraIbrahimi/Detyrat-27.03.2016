import javax.swing.*;
/**Detyra5_1 ka metoden summation me parameter i, i cili do te kthehet ne rezultat si
  *summation(i) = 0 + 1 + 2 + ... + i*/
public class Detyra5_1
{ public Detyra5_1()
  {}
  
  public int summation(int i)
  { if (i<=0)
        { JOptionPane.showMessageDialog(null, "Error. Negative number not allowed.");
          System.exit(0);
        }
    else{ int count=0;
          int sum = 0;
          while (count !=i)
                { count++;
                  sum= sum +count;
                }
          i = sum;
        }
    return i;
  }
  
  public static void main(String[] args)
  { Detyra5_1 klasa = new Detyra5_1();
    int num = new Integer(JOptionPane.showInputDialog("Type the number.")).intValue();
    System.out.println(klasa.summation(num));
  }
}