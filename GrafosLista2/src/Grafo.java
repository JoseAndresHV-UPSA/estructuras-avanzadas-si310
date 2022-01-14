import javax.swing.*;
import java.util.LinkedList;

public class Grafo
{
    private Lista LVertices;
    
    public Grafo() {
        LVertices = new Lista();
    }
    
    public void crearVertice(String nomV){
        LVertices.insertarUlt(new Vertice(nomV));
    }

    public Vertice buscarVertice(String nomV)
    {
        Vertice vertice;
        int i=0;
        while (i<LVertices.dim())
        {
            vertice =(Vertice)LVertices.getElem(i);
            if (vertice.getNombre().equals(nomV))
                 return vertice;
             i++;
        }
          return null;
    }
    
    public void insertarArco(String X,String Y, float co)
    {
        Vertice vo = buscarVertice(X);
        Vertice vd = buscarVertice(Y);
        vo.insertarArco(new Arco(vd, co));        
    }
            
    public void imprimir(JTextArea jta){
        int i = 0; Vertice v; Arco a;
        while (i < LVertices.dim())
        {
            v = (Vertice)LVertices.getElem(i);
            int j=0; 
            while (j<v.LArcos.dim())
            {
                jta.append(v.getNombre());
                jta.append("-->");
                a = (Arco)v.LArcos.getElem(j); //Muestra el arco donde apunto
                jta.append(a.getNombreVertD() + "  " + a.getCosto());
                jta.append("\n");
                j++;
            }
                i++;                    
        }
    }     
    
    //METODOS DE ENSEÑANZA    
    public float peso()
    {
        int i = 0;
        Vertice v; float s = 0;
        while (i < LVertices.dim())
        {
                v = (Vertice)LVertices.getElem(i);
                int j=0; Arco a;
                while(j < v.LArcos.dim())
                {
                  a=(Arco)v.LArcos.getElem(j);
                  s = s + a.getCosto();
                  j++;
                }
                i++;
            }
            return s;
        }

   
    
    public void desmarcarTodos() 
    {
       for(int i=0;i<this.LVertices.dim();i++){
          Vertice v=(Vertice)this.LVertices.getElem(i);
          v.marcado=false;
       }
    }
    //Necesita ordenar los vertices y arcos
    public boolean iguales(Grafo G2)
    {
        if(this.LVertices.dim()!= G2.LVertices.dim())
           return false;
        int i=0,j; 
        while (i < this.LVertices.dim()) 
        {   Vertice v1 = (Vertice)this.LVertices.getElem(i);
            Vertice v2 = (Vertice)G2.LVertices.getElem(i);
            if(! v1.getNombre().equals(v2.getNombre()) || v1.LArcos.dim() !=v2.LArcos.dim())
                return false;
            else
            {   j=0;  
                while(j < v1.LArcos.dim()) {
                    Arco a1=(Arco)v1.LArcos.getElem(j);
                    Arco a2=(Arco)v2.LArcos.getElem(j);
                    if(!a1.getNombreVertD().equals(a2.getNombreVertD()) || a1.getCosto()!=a2.getCosto() )
                        return false;           
                 j++;
               }
           }            
           i++;
        } 
      return true;
    }      
         
    public void ordenarVerticesAlf() {
      Vertice aux; Vertice v1; Vertice v2;
      for(int i=0;i<LVertices.dim();i++){
        for(int j=0;j<LVertices.dim()-1;j++){
            v1=(Vertice)LVertices.getElem(j);
            v2=(Vertice)LVertices.getElem(j+1);
            if(v1.getNombre().compareTo(v2.getNombre())>0){             
                aux=(Vertice)LVertices.getElem(j);                
                LVertices.setElem(v2, j);
                LVertices.setElem(aux, j+1);                                                   
            }      
        }  
      }
      for(int i=0;i<LVertices.dim();i++){
        Vertice v=(Vertice)LVertices.getElem(i);
        v.ordenarArcosAlf();
      }          
    }   
    
    public void DFS(String A, JTextArea jta){
        jta.append("DFS: ");
        desmarcarTodos();
        ordenarVerticesAlf();
        Vertice v = buscarVertice(A);
        dfs(v,  jta);
        jta.append("\n");
    }

    private void dfs(Vertice v, JTextArea jta){
        jta.append(v.getNombre() + " ");
        v.marcado=true;
        Arco a;
        for (int i = 0; i < v.LArcos.dim(); i++) {
            a = (Arco) v.LArcos.getElem(i);
            Vertice w = buscarVertice(a.getNombreVertD());
            if(!w.marcado)
              dfs(w, jta);
        }
    }
       

    public void BFS(String s,JTextArea jta)  {  
       desmarcarTodos();
       ordenarVerticesAlf();     Arco a;
       Vertice v = buscarVertice(s), w;
       LinkedList <Vertice> C;
       C=new LinkedList<Vertice>();
       C.add(v);    
       v.marcado=true;      jta.append("BFS: ");
       do{
           v = C.pop();
           jta.append(v.getNombre() + " ");
           for (int i = 0; i < v.LArcos.dim(); i++) { 
               a = (Arco) v.LArcos.getElem(i);
               w = buscarVertice(a.getNombreVertD());
               if (!w.marcado) {
                   C.add(w);
                   w.marcado=true;
               }
           }
       }while (!C.isEmpty());   
       jta.append("\n");
    }     
 
   
    public boolean existeCamino(String X, String Y)
    {
        if( buscarVertice(X)!=null && buscarVertice(Y)!=null ){
          desmarcarTodos();
          Vertice v=buscarVertice(X);
          return existeCamino(v,Y);
        }    
        return false;
    }    
        
    private boolean existeCamino(Vertice v, String Y)
    {    
        v.marcado=true;
        for(int i=0;i<v.LArcos.dim();i++)
        {    
            Arco a = (Arco)v.LArcos.getElem(i);
            Vertice v2 = buscarVertice(a.getNombreVertD());
            if(! v2.marcado ){ //sino esta marcado (marcado==false)
                if(v2.getNombre().equals(Y)) 
                     return true;
                else                
                   if(existeCamino(v2,Y))     
                      return true;                
            }
            else
            if(v2.getNombre().equals(Y))   //Cuando se quiera a traves de otros vertices llegar al mismo vertice o del mismo al mismo
              return true;
        }
        return false;
    } 
      
    public boolean esConexo()
    {   int i=0;
        while(i<LVertices.dim())
        {
            Vertice vo=(Vertice)LVertices.getElem(i);
            int j=0;
            while(j<LVertices.dim()){
                Vertice vd=(Vertice)LVertices.getElem(j);
                   if(!existeCamino(vo.getNombre(), vd.getNombre()))
                        return false;                
                j++;
            }
            i++;
        }
        return true;
    }       

    public int cantidadCaminos(String X, String Y)
    {
        if( buscarVertice(X)!=null && buscarVertice(Y)!=null )
        {
          desmarcarTodos();
          Vertice v=buscarVertice(X);          
          return cantidadCaminos(v,Y);
        }
        else
          return -1;
    } 
    
    private int cantidadCaminos(Vertice v, String y)
    {   int i=0, c=0;
        v.marcado = true;         
        while(i < v.LArcos.dim())
        {   
            Arco a = (Arco)v.LArcos.getElem(i);
            Vertice v2 = buscarVertice(a.getNombreVertD());
            if(!v2.marcado)
            {   
                if(v2.getNombre().equals(y)) {
                    c = c + 1;                                    
                }   
                else                 
                {                      
                    c = c +  cantidadCaminos(v2, y);
                    v2.marcado = false;
                } 
            }
            i++;
        }
        return c;
    }
 
   
//primera versión
public boolean existeCaminoBFS(String X, String Y) {
        desmarcarTodos();
        ordenarVerticesAlf();
        boolean aux=false;        
        Vertice v = buscarVertice(X);
        LinkedList<Vertice> C;
        C = new LinkedList<Vertice>();
        C.add(v);
        v.marcado = true;
        do {
            v = C.pop();
            for (int i = 0; i < v.LArcos.dim(); i++) {
                Arco a = (Arco) v.LArcos.getElem(i);
                Vertice w = buscarVertice(a.getNombreVertD());
                if (!w.marcado) {
                    C.add(w);
                    w.marcado = true;
                    if(w.getNombre().equals(Y))
                        aux=true;
                }
            }
        } while (!C.isEmpty());
        return aux;
    }    
    
    //Segunda versión
    public boolean existeCaminoBFS1(String X, String Y) {
        desmarcarTodos();
        ordenarVerticesAlf();
        Vertice v = buscarVertice(X);
        LinkedList<Vertice> C;
        C = new LinkedList<Vertice>();
        C.add(v);
        v.marcado = true;
        do {
            v = C.pop();
            for (int i = 0; i < v.LArcos.dim(); i++) {
                Arco a = (Arco) v.LArcos.getElem(i);
                Vertice w = buscarVertice(a.getNombreVertD());
                if (!w.marcado) {
                    C.add(w);
                    w.marcado = true;
                }
            }
        } while (!C.isEmpty());
        if(buscarVertice(Y).marcado)
           return true;
        else
           return false;
    }  
    
    public boolean unicoCamino(String X, String Y) {
        return cantidadCaminos(X,Y) == 1;
    }
    
    public void mostrarCaminos(String o, String d, JTextArea jta) {
        if(existeCamino(o, d)) {
            desmarcarTodos();
            ordenarVerticesAlf();
            LinkedList<Vertice> C = new LinkedList<>();
            Vertice vo = buscarVertice(o);
            Vertice vd = buscarVertice(d);
            mostrarCaminos(vo, vd, C, jta);
        }
        else
            jta.append("No existe camino\n");
    }


    private void mostrarCaminos(Vertice vo, Vertice vd, LinkedList<Vertice> C, JTextArea jta) {
        C.add(vo);
        vo.marcado = true;

        if (vo == vd) {
            int i = 0;
            while (i < C.size() - 1) {
                jta.append(C.get(i).nombre + " - ");
                i++;
            }
            jta.append(C.get(i).nombre + "\n");
        } else {
            for (int i = 0; i < vo.getCantArcos(); i++) {
                Arco a = (Arco) vo.LArcos.getElem(i);
                String prox = a.getNombreVertD();
                Vertice vp = buscarVertice(prox);
                if (!vp.marcado) {
                    mostrarCaminos(vp, vd, C, jta);
                }
            }
        }
        C.removeLast();
        vo.marcado = false;
    }
    
    public void mostrarUnicoCamino(String X, String Y, JTextArea jta)
    {
        if (cantidadCaminos(X,Y) == 1) 
            mostrarCaminos(X, Y, jta);
        else
            JOptionPane.showMessageDialog(null, "No tiene o tiene mas de un camino");
    } 
    
    public void mostrarUnicoCamino2(String o, String d, JTextArea jta) {
        if(existeCamino(o, d)) {
            desmarcarTodos();
            ordenarVerticesAlf();
            
            LinkedList<Vertice> C = new LinkedList<>();
            LinkedList<String> caminos = new LinkedList<>();
            
            Vertice vo = buscarVertice(o);
            Vertice vd = buscarVertice(d);
            
            mostrarUnicoCamino2(vo, vd, C, caminos);
            
            if (caminos.size() == 1)
                jta.append(caminos.getFirst() + "\n");
            else
                jta.append("Tiene mas de un camino\n");
        }
        else
            jta.append("No existe camino\n");
    }


    private void mostrarUnicoCamino2(Vertice vo, Vertice vd, LinkedList<Vertice> C, LinkedList<String> caminos) {
        C.add(vo);
        vo.marcado = true;

        if (vo == vd) {
            int i = 0;
            String camino = "";
            while (i < C.size() - 1) {
                camino += C.get(i).nombre + " - ";
                i++;
            }
            
            camino += C.get(i).nombre;
            caminos.add(camino);
            
        } else {
            for (int i = 0; i < vo.getCantArcos(); i++) {
                Arco a = (Arco) vo.LArcos.getElem(i);
                String prox = a.getNombreVertD();
                Vertice vp = buscarVertice(prox);
                
                if (!vp.marcado) {
                    mostrarUnicoCamino2(vp, vd, C, caminos);
                }
            }
        }
        
        C.removeLast();
        vo.marcado = false;
    }
    
    public boolean esArbolBinario(String or){
        if(LVertices == null || buscarVertice(or) == null)
            return false;
        
        desmarcarTodos();
        ordenarVerticesAlf();
        
        Vertice origen = buscarVertice(or);
        LinkedList<Vertice> C = new LinkedList<Vertice>();
        C.add(origen);
        origen.marcado = true;
        while(!C.isEmpty()){
            origen = C.pop();
            for(int i=0; i<origen.LArcos.dim(); i++){
                Arco a = (Arco) origen.LArcos.getElem(i);
                Vertice w = buscarVertice(a.getNombreVertD());
                if(!w.marcado){
                    C.add(w);
                    w.marcado = true;
                } else 
                    return false;
            }
        }
        
        return true;
    }
    
    private boolean revisarMarcados(){
        for(int i=0; i<LVertices.dim(); i++){
            Vertice v = (Vertice) LVertices.getElem(i);
            if(!v.marcado)
                return false;
        }
        return true;
    }
    
    public void caminoMasCorto(String o, String d, JTextArea jta) {
        if(existeCamino(o, d)) {
            desmarcarTodos();
            ordenarVerticesAlf();
            
            LinkedList<Vertice> C = new LinkedList<>();
            LinkedList<String> caminos = new LinkedList<>();
            LinkedList<Float> pesos = new LinkedList<>();
            
            Vertice vo = buscarVertice(o);
            Vertice vd = buscarVertice(d);
            int peso = 0;
            
            caminoMasCorto(vo, vd, C, caminos, pesos, peso);
            
            float menor = Float.MAX_VALUE;
            int p = 0;
            for (int i = 0; i < caminos.size(); i++) {
                if(pesos.get(i) < menor)
                {
                    p = i;
                    menor = pesos.get(i);
                }
            }
            jta.append(caminos.get(p) + " Costo: " + menor + "\n");
        }
        else
            jta.append("No existe camino\n");
    }


    private void caminoMasCorto(Vertice vo, Vertice vd, LinkedList<Vertice> C, LinkedList<String> caminos, LinkedList<Float> pesos, float peso) {
        C.add(vo);
        vo.marcado = true;

        if (vo == vd) {
            int i = 0;
            String camino = "";
            while (i < C.size() - 1) {
                camino += C.get(i).nombre + " - ";
                i++;
            }
            
            camino += C.get(i).nombre;
            caminos.add(camino);
            pesos.add(peso);
            
        } else {
            for (int i = 0; i < vo.getCantArcos(); i++) {
                Arco a = (Arco) vo.LArcos.getElem(i);
                String prox = a.getNombreVertD();
                Vertice vp = buscarVertice(prox);
                
                if (!vp.marcado) {
                    peso += a.getCosto();
                    caminoMasCorto(vp, vd, C, caminos, pesos, peso);
                } 
                peso -= a.getCosto(); 
            }
        }
        
        C.removeLast();
        vo.marcado = false;
    }
    
    public void caminoMasLargo(String o, String d, JTextArea jta) {
        if(existeCamino(o, d)) {
            desmarcarTodos();
            ordenarVerticesAlf();
            
            LinkedList<Vertice> C = new LinkedList<>();
            LinkedList<String> caminos = new LinkedList<>();
            LinkedList<Float> pesos = new LinkedList<>();
            
            Vertice vo = buscarVertice(o);
            Vertice vd = buscarVertice(d);
            int peso = 0;
            
            caminoMasLargo(vo, vd, C, caminos, pesos, peso);
            
            float mayor = Float.MIN_VALUE;
            int p = 0;
            for (int i = 0; i < caminos.size(); i++) {
                if(pesos.get(i) > mayor)
                {
                    p = i;
                    mayor = pesos.get(i);
                }
            }
            jta.append(caminos.get(p) + " Costo: " + mayor + "\n");
        }
        else
            jta.append("No existe camino\n");
    }


    private void caminoMasLargo(Vertice vo, Vertice vd, LinkedList<Vertice> C, LinkedList<String> caminos, LinkedList<Float> pesos, float peso) {
        C.add(vo);
        vo.marcado = true;

        if (vo == vd) {
            int i = 0;
            String camino = "";
            while (i < C.size() - 1) {
                camino += C.get(i).nombre + " - ";
                i++;
            }
            
            camino += C.get(i).nombre;
            caminos.add(camino);
            pesos.add(peso);
            
        } else {
            for (int i = 0; i < vo.getCantArcos(); i++) {
                Arco a = (Arco) vo.LArcos.getElem(i);
                String prox = a.getNombreVertD();
                Vertice vp = buscarVertice(prox);
                
                if (!vp.marcado) {
                    peso += a.getCosto();
                    caminoMasLargo(vp, vd, C, caminos, pesos, peso);
                } 
                peso -= a.getCosto(); 
            }
        }
        
        C.removeLast();
        vo.marcado = false;
    }
   
    
    
  
    
}  //end class