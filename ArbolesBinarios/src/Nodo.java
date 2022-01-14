
/**
 *
 * @author edwin
 */
class Nodo {

    private Nodo hijoIzq;
    private int elem;
    private Nodo hijoDer;

    public Nodo(int ele) {
        hijoIzq = null;
        elem = ele;
        hijoDer = null;
    }

    public void setHI(Nodo izq) {
        hijoIzq = izq;
    }

    public void setElem(int e) {
        elem = e;
    }

    public void setHD(Nodo der) {
        hijoDer = der;
    }

    public Nodo getHI() {
        return hijoIzq;
    }

    public int getElem() {
        return elem;
    }

    public Nodo getHD() {
        return hijoDer;
    }

}//end class
