public class Nodo
 {
        private SubLista LL1;
        private Nodo prox;

        public Nodo(){
            LL1=new SubLista();
            prox = null;
        }

        public Nodo(SubLista x, Nodo p){
            this.LL1=x;
            this.prox = p;
        }

        public void setListaDeLista(SubLista x) {
            LL1 = x;
        }

        public SubLista getListaDeLista() {
            return LL1;
        }
        
   
        public void setProx(Nodo p){
            prox = p;
        }

        public Nodo getProx(){
            return prox;
        }
 }

