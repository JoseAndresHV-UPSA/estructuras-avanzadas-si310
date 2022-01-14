
public class SubNodo
{
       private int  codigo;
        private int precio;
        private SubNodo prox;

        public SubNodo(){
            codigo = 0;
            precio=0;
            prox = null;
        }

        public SubNodo(int x, int y, SubNodo p){
            this.codigo = x;
            this.precio=y;
            this.prox = p;
        }

        public void setCodigo(int x) {
            codigo = x;
        }

        public int getCodigo() {
            return codigo;
        }
        
        public void setPrecio(int x) {
            precio = x;
        }

        public int getPrecio() {
            return precio;
        }
        public void setSubProx(SubNodo p){
            prox = p;
        }

        public SubNodo getSubProx(){
            return prox;
        }
 }