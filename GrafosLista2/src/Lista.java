
 import javax.swing.JOptionPane;
 
 public class Lista
 {      private static  int max=50; 
        private Object[] v;
        private int n;

        public Lista() {
            v = new Object[max];
            n = 0;
        }

        public void dim(int d){
            n = d;
        }

        public int dim(){
            return n;
        }

        public void setElem(Object x, int pos){
            v[pos] = x;
        }

        public Object getElem(int pos){
            return v[pos];
        }

        boolean vacia() {
            return n == 0;
        }

        boolean llena() {
            return n == max;
        }

        public void insertar(Object x, int p){
            if (llena())
                JOptionPane.showConfirmDialog(null, "Lista::Lista llena...!!!");
            if (p < 0 || p > n)
                JOptionPane.showConfirmDialog(null, "Lista::Posicion no valida..!!!!!");
            else
            {
                int m = n - 1;
                while (m >= p){
                    v[m + 1] = v[m];
                    m = m - 1;
                }
                v[p] = x;
                n++;
            }
        }

        public void insertarPri(Object x) {
            insertar(x, 0);
        }

        public void insertarUlt(Object x) {
            insertar(x, n);
        }

        public void eliminar(int pos)
        {
            if (vacia())
                JOptionPane.showConfirmDialog(null, "Lista::Lista vacia...!!!");

            int k = pos + 1;
            while (k < n)
            {
                v[k - 1] = v[k];
                k = k + 1;
            }
            n = n - 1;
        }

        public void eliminarPri()  {
            eliminar(0);
        }

        public void eliminarUlt()  {
            eliminar(n - 1);
        }
    }