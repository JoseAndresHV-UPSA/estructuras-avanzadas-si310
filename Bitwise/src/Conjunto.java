import java.util.Random;
import javax.swing.*;

public class Conjunto {
 private bitwise v[];
 private int n;
 
 public Conjunto(int cant)
 {
  int nbw=cant/32;
  if(cant % 32 != 0){
      nbw=nbw + 1;  
  }
  v=new bitwise[nbw];
  for(int i=0; i< nbw; i++){
    v[i]=new bitwise();  
  }
  n=cant;
 }
 
public void insertar(int ele){
  if((ele>=0 && ele<n)){
   int nEnt=obtenerNent(ele);
   int nBit=obtenerNbit(ele);
   v[nEnt].encender(nBit);
  }  
  else
      JOptionPane.showMessageDialog(null, "Conjunto::Insertar: Fuera de rango.!!!");
}
public void eliminar(int ele){
  if(ele>=0 && ele<n) {
   int nEnt=obtenerNent(ele);
   int nBit=obtenerNbit(ele);
   v[nEnt].apagar(nBit);
  }
  else
   JOptionPane.showMessageDialog(null, "Conjunto::Eliminar: Fuera de rango.!!!");
}
public int obtenerNent(int ele){
  return (ele/32);  
}

public int obtenerNbit(int ele){
 return  (ele % 32);   
}

public boolean pertenece(int ele){
 if(ele<n){  
  int nEnt=obtenerNent(ele);
  int nBit=obtenerNbit(ele);
  return (v[nEnt].getBit(nBit)==1); 
 }
 return false;
}

public String mostrar(){
 String s="";
 int aux = 0;
 int cont = 1;
  for (int i=0; i<n ; i++) {
  int nEnt=obtenerNent(i); // i / 32
  int nBit=obtenerNbit(i); // i % 32
    if(aux != nEnt) {
       s=s + "\n";
       aux = nEnt;
    }
     s=s + v[nEnt].getBit(nBit);   
     cont++;
  }
  s=s+"";
  return s;
}

public String mostrar2(){
 String s="<";
  for (int i=0; i<n ; i++) {
  int nEnt=obtenerNent(i);
  int nBit=obtenerNbit(i);
    if ( v[nEnt].getBit(nBit)==1){
     s=s + i+ ",";
     }
  }
  s=s + ">";
  return s;
}

public void union(Conjunto a,Conjunto b){
 for (int i=0; i <a.n-1; i++) {
   if(a.pertenece(i))
       insertar(i);    
 }   
 for (int i=0; i <b.n-1; i++) {
  if(b.pertenece(i))
      insertar(i);     
 }   
}

public void interseccion(Conjunto a,Conjunto b){
    //int x=a.obtenerNent(a.n);
    for (int i=0; i<=a.n-1; i++) 
    {
      if ((a.pertenece(i)) && (b.pertenece(i))) 
            insertar(i);      
    }
}

    void sentarPersonas(int p) {
        Random rand = new Random();
        int sentados = 0;
        
        for (int i = 0; i < n; i++) {
            int nEnt=obtenerNent(i);
            int nBit=obtenerNbit(i);
            int r = rand.nextInt(2);
            if (r == 1) {
                v[nEnt].encender(nBit);  
                sentados++;
            }
            if (sentados == p)
                break;
        }
    }
    
    void sentarPersonas2 (int p) {
        Random rand = new Random();
        int sentados = 0;
        while (sentados < p) {
            int r = rand.nextInt(n);
            int nEnt = obtenerNent(r);
            int nBit = obtenerNbit(r);
            if(v[nEnt].getBit(nBit) == 0) {
                v[nEnt].encender(nBit);
                sentados ++;
            }
        }
    }

}//end class
