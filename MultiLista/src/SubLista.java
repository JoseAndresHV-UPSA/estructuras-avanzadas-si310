
import javax.swing.JOptionPane;

class SubLista
{
        private SubNodo primero;
        private int cantidad;

       public SubLista(){
            primero = null;
            cantidad = 0;
       }

       public boolean vacia() {
           return primero == null;
       }

       public void setCant(int c) {
             cantidad=c;
       }

       public int getCant() {
            return cantidad;
       }
       public SubNodo Primero()  {
         SubNodo p=primero;
         return p;
       }

       public SubNodo crearSubNodo(int x, int y, SubNodo p) {
           SubNodo q = new SubNodo(x,y,p);
           return q;
       }

       public void insertarPrimero(int x,int y){
           SubNodo q = crearSubNodo(x, y, primero);
           primero = q;
           cantidad++;
       }


       public void insertarUltimo(int x, int y) {
           if (vacia())
               insertarPrimero(x, y);
           else
           {
               SubNodo p = primero;
               while (p.getSubProx() != null)
                   p = p.getSubProx();

               SubNodo q = crearSubNodo(x,y,null);
               p.setSubProx(q);

               cantidad++;
           }
       }
      

        public int getCODIGO(int pos) {

            SubNodo p = primero;
                int k = 1;
                while (k < pos && p!=null){
                    p = p.getSubProx();
                    k++;
                }
                return p.getCodigo();

        }
        public int getPRECIO(int pos){

            SubNodo p = primero;
                int k = 1;
                while (k < pos && p!=null){
                    p = p.getSubProx();
                    k++;
                }
                return p.getPrecio();

        }

        public int retornarPos(int codigo)
        {
            SubNodo p=primero;
            int k=1;
            while(p!=null)
            {
                if(codigo==p.getCodigo())
                {
                    return k;
                }
                else{
                    p=p.getSubProx();
                    k++;
                }
            }
            return 0;
        }
        public void eliminarPosicion(int pos)
        {
            if (pos >= 1 && pos <= getCant())
            {
                int k = 1;
                SubNodo ap = null, p = primero;
                while (k < pos && p != null)
                {
                    ap = p;
                    p = p.getSubProx();
                    k = k + 1;
                }
                if (p == null)
                    return;

                if(ap == null)
                    primero = p.getSubProx();
                else
                    ap.setSubProx(p.getSubProx());
                
                cantidad--;
                //delete p
            }
            else
                JOptionPane.showMessageDialog(null,"Fuera de posición..!!");
        }
}
