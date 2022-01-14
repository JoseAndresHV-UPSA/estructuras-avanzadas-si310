
public class Arco {
    private Vertice verticeD;
    private float costo;
    
    public Arco(Vertice vd, float co) {
        this.costo = co;
        this.verticeD = vd;
    }
   
    public void setCosto(float co) {
        this.costo = co;
    }

    public float getCosto()  {
       return costo;
    }

    //Devuelve el nombre del vertice destino
    public String getNombreVertD() {
        return verticeD.getNombre();
    }

    public void setNombreVertD(Vertice vd) {
        this.verticeD = vd;
    }
        

        
 }