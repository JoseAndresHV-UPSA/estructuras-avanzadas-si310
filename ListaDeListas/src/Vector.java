
import javax.swing.JOptionPane;

class Vector
{
        private Lista[] v;
        private int n;

        public Vector(){
            v = new Lista[100];
            n = 0;
        }

        public void setDim(int d){
            n = d;
        }

        public int getDim() {
            return n;
        }

        public void setElem(Lista x, int pos) {
            v[pos] = x;
        }

        public Lista getElem(int pos)
        {
            return v[pos];
        }

        private boolean  vacia()
        {
            return n == 0;
        }

        private boolean llena()
        {
            return n == 100;
        }

        public void insertar(Lista x, int p)
        {
            if (llena())  {
                JOptionPane.showMessageDialog(null, "Vector lleno..!!!");
                return;
            }

            if (p < 0 || p > n)
            {
                JOptionPane.showMessageDialog(null,"Posición no válida..!!!");
                return;
            }
            else
            {
                int k = n - 1;
                while (k >= p)
                {
                    v[k + 1] = v[k];
                    k = k - 1;
                }
                v[p] = x;
                n=n+1;
            }
        }

        public void insertarPri(Lista x)
        {
            insertar(x, 0);
        }

        public void insertarUlt(Lista x)
        {
            insertar(x, n);
        }

        public void eliminar(int pos)
        {
            if (vacia())
            {
                JOptionPane.showMessageDialog(null, "Vector vacio...!!");
                return;
            }

            int k = pos + 1;
            while (k < n)
            {
                v[k - 1] = v[k];
                k = k + 1;
            }
            n = n - 1;
        }

        public void eliminarPri()
        {
            eliminar(0);
        }

        public void eliminarUlt()
        {
            eliminar(n - 1);
        }
        
        public int obtenerMayorPosicion(int pos) {
            if (pos > 0 && pos <= n)
                return v[pos - 1].mayorRecursivo();
            else
                return 0;
        }
        
        public void eliminarSubLista(int posV, int posL) {
            Lista list = getElem(posV - 1);
            list.eliminarPosicion(posL);
        }
        
        public void invertirSubListas() {
            invertirSubListas(0, n);
        }
        
        private void invertirSubListas(int a, int b) {
            if (a < b) {
                getElem(a).invertirRecursivo();
                invertirSubListas(a + 1, b);
            }
        }
        
        
              
}//end class
