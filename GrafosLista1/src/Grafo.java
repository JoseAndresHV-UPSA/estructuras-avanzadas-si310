
import javax.swing.*;

public class Grafo
{
    public Lista LVertices;

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
        int i = 0,j; Vertice v; Arco a;
        while (i < LVertices.dim())
        {
            v = (Vertice)LVertices.getElem(i);
            j=0; 
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
    
    //DESDE AQUI METODOS DE ENSEÑANZA
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
    
    public void arcosSalientes()
    {
        int i = 0;
        Vertice v; 
        while (i < LVertices.dim()) {
            v = (Vertice)LVertices.getElem(i);                
            JOptionPane.showMessageDialog(null,v.getNombre() + "  " + v.LArcos.dim());                           
            i++;
        }
    }      
                 
    public void eliminarArco(String X, String Y)
    {
        Vertice v;
        v = buscarVertice(X);
        int i = 0;
        Arco a;
        while (i < v.LArcos.dim())
        {
                a = (Arco)v.LArcos.getElem(i);
                if (a.getNombreVertD().equals(Y))
                    v.LArcos.eliminar(i);
                i++;
        }
    }
        
    public void eliminarArcosSalientes(String X)
    {
        Vertice v;
        v = buscarVertice(X);
        int i = 0; int n=v.LArcos.dim();
        while (i < n ) {
             v.LArcos.eliminarUlt();     
             i++;
        }
    }
    
    public void eliminarArcosEntrantes(String X)
    {
        for (int i = 0; i < LVertices.dim(); i++) {
            Vertice v = (Vertice)LVertices.getElem(i);
            for (int j = 0; j < v.LArcos.dim(); j++) {
                Arco a = (Arco)v.LArcos.getElem(j);
                if (a.getNombreVertD().equals(X))
                    v.LArcos.eliminar(j);
            }
        }
    }

    
    public void eliminarVertice(String X)
    {
        Vertice vx=buscarVertice(X);
        if(vx==null)
           return ;
        //eliminarArcosEntrantes(X);  
        eliminarArcosSalientes(X);        
        Vertice v; int i=0;
        while(i<LVertices.dim()){
            v = (Vertice)LVertices.getElem(i);
            if(v.getNombre().equals(X)) {
                LVertices.eliminar(i);
                return ;
            }
            i++;
        }
    }

    public void esConexo() {
        for (int i = 0; i < LVertices.dim(); i++) {
            Vertice v = (Vertice)LVertices.getElem(i);
            for (int j = 0; j < LVertices.dim(); j++) {
                Vertice v1 = (Vertice)LVertices.getElem(i);
            
            }
        }
    }
        
}  //end class