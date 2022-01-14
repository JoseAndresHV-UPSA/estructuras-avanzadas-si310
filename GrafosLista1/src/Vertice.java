
public class Vertice
{
        String nombre;
        public Lista LArcos;     

        public Vertice(String nom)   {
            nombre = nom;
            LArcos = new Lista();
        }      

        public void setNombre(String nom) {
            nombre = nom;
        }

        public String getNombre() {
            return this.nombre;
        }

        public int getCantArcos() {
            return LArcos.dim();
        }

        //Inserta el arco q ya viene creado
        public void insertarArco(Arco arco) {
            LArcos.insertarUlt(arco);
        }     

    }