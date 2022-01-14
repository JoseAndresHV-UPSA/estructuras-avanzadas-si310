import javax.swing.*;

public class bitwise 
{
 private int x; 
 public bitwise(){
  x=0;
 }
 
 public String mostrar()
 {
  String s="";
  for(int i=0;i<=31;i++)
      s=getBit(i) + s; 
  return s;
 }
 
 public void encender(int pos)
 {
  if(pos<0 || pos > 31){    
      JOptionPane.showMessageDialog(null, "BitWise::Insertar: Fuera de rango.!!!");
      return;
  }
    int y=1;
    y=y<<pos;
    x=x|y;   
 }
 
 public void apagar(int pos)
 {
  if(pos>=0 && pos <=31){    
    int y=1;
    y=y<<pos;
    y=~y;
    x=x&y;   
  }
  else
      JOptionPane.showMessageDialog(null, "BitWise::Eliminar: Fuera de rango.!!!");     
 }
  
 public int getBit(int pos)
 {
   int y=1;
   y=y<<pos;
   y= y & x;
   return y;
   /*
   if(y==0)
     return 0;
   else
     return 1;
*/
 }
 
}//end class


