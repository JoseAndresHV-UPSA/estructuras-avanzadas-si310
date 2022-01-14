
 public class Nodo
 {
        private int  elem;
        private Nodo prox;

        public Nodo(){
            elem = 0;
            prox = null;
        }

        public Nodo(int x, Nodo p){
            this.elem = x;
            this.prox = p;
        }

        public void setElem(int x) {
            elem = x;
        }

        public int getElem() {
            return elem;
        }

        public void setProx(Nodo p){
            prox = p;
        }

        public Nodo getProx(){
            return prox;
        }
 }