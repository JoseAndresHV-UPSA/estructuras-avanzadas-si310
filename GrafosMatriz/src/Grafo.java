import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.LinkedList;

public class Grafo {
    private static  int max=50;      
    private int M[][];
    private int n;      
   
    public Grafo(){
       M = new int[max][max];      
       for(int i =0; i<max; i++){
           for(int j=0; j<max; j++){
               M[i][j] = 0;
           }
       }
       n = -1;
       marca = new boolean[max+1];    //Iniciar la ED para el marcado de los vértices.
    }
    
    public void crearVertice(){
        if (n == max){
            JOptionPane.showMessageDialog(null, "Numero de vertice igual a" + max+1);
            return;
        }    
        n++;
    }
    
    public int cantVertices(){
        return n+1;
    }
    
    public boolean esVerticeValido(int v){
        return (v>=0 && v<=n);
    }
    
    public void insertarArco(int u, int v){
        if (!esVerticeValido(u) || !esVerticeValido(v)){
            JOptionPane.showMessageDialog(null, "Grafo::addArista: No es un vertice valido");  
            return ;
        }
        M[u][v] = 1;
        M[v][u] = 1;
    } 
    
    public void eliminarArco(int u, int v){
        if (!esVerticeValido(u) || !esVerticeValido(v))
            return;     //No existe el vertice u o el vertice v.        
        M[u][v] = 0;
        M[v][u] = 0;
    }            


   //********* Para el marcado de los vértices
    private boolean marca[];
    
    private void desmarcarTodos(){
        for (int i = 0; i <= n; i++) {
            marca[i] = false;  
        }
    }
    
    private void marcar(int u){
        if (esVerticeValido(u))
           marca[u] = true; 
    }
    
    private void desmarcar(int u){
        if (esVerticeValido(u))
           marca[u] = false; 
    }
    
    private boolean esMarcado(int u){   //Devuelve true sii el vertice u está marcado.
        return marca[u]; 
    }     
    
    public int getArco(int i, int j){
       return M[i][j];
    }
    
    //RECORRIDOS    
    public void DFS(int vi,JTextArea jta){  //Recorrido en profundidad.
        if (!esVerticeValido(vi))
            return;  //Validación: v no existe en el Grafo.        
        desmarcarTodos();
        dfs(vi,jta);               
    }
    
    private void dfs(int v, JTextArea jta){  //mask-function 
        jta.append(String.valueOf(v) + " ");        
        marcar(v);
        
        for (int i = 0; i <= n; i++) {   //for para cada w adyacente a v
            if(M[v][i] > 0){
                int w = i;
                if (!esMarcado(w))
                dfs(w,jta);
            }
        }
    }
    
    public void BFS(int v,JTextArea jta){  //Recorrido Breadth-First Search (en anchura).
        if (!esVerticeValido(v))
            return;  //Validación v no existe en el Grafo. 
       
        desmarcarTodos();
        LinkedList <Integer> C = new LinkedList<>();  //cola = vacía
        C.add(v);     //Inserta v a la cola (al final de la list).
        marcar(v);
        do{
            int e = C.pop();       //Obtiene el 1er elemento de la cola.
            jta.append(String.valueOf(e) + " ");        
    
            for (int i = 0; i <= n; i++) {   //for (cada w adyacente a e)
                if(M[e][i] > 0){
                    int w = i;
                    if (!esMarcado(w)){
                        C.add(w);
                        marcar(w);
                    }    
                }
            }
        }while (!C.isEmpty());          
    }
    
    //METODOS DE APRENDIZAJE
    public boolean Conexo(){
        desmarcarTodos();
        JTextArea jta=new JTextArea();
        DFS(0,jta);
        for(int i =0; i<=n; i++){
            if(!esMarcado(i))
                return false;
        }
        return true;
    }
    
    public void RecorridoE(int u){   // Es igual al dfs pero no escribe nada
        marcar(u);
        for(int i=0; i<=n; i++){
            if(M[u][i] > 0){
                int w = i;
                if(!esMarcado(w))
                    RecorridoE(w);
            }
        }
    }    
    
    public boolean Alcanzable(int u, int v){
        desmarcarTodos();
        RecorridoE(u);
        return (esMarcado(v));
    }      
    
    public int CantIslas(){
        desmarcarTodos();
        int c =0;
        for(int i=0; i<=n; i++){
            if(!esMarcado(i)){
                RecorridoE(i);
                c++;
            }
        }
        return c;
    }
    
    
    public void MostrarIslas(JTextArea jta){
        desmarcarTodos();
        int c = 1;
        for(int i=0; i<=n; i++){
            if(!esMarcado(i)){
                jta.append("Isla "+ String.valueOf(c) + ": ");            
                BFS(i,jta);
                jta.append("\n");
                c++;
            }
            
        }
    }
    
    public boolean esCiclico(){
        desmarcarTodos();
        for(int i=0; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if(M[i][j] > 0){
                    eliminarArco(i, j);
                    RecorridoE(j);
                    insertarArco(i, j);
                    if(esMarcado(i))
                        return true;
                }
                desmarcarTodos();
            }
        }
        return false;
    }    
    
    public void cantidadDeArcos(JTextArea jta) {
        desmarcarTodos();
        for (int i = 0; i <= n; i++) {
            int cont = 0;
            for (int j = 0; j <= n; j++) {
                if (M[i][j] > 0)
                    cont++;
            }
            jta.append(i + "->" + cont + "\n");
        }
    }
    
    public void eliminarArcos(int v) {
        desmarcarTodos();
        for (int i = 0; i <= n; i++) {
            M[v][i] = 0;
            M[i][v] = 0;
        }
    }

}//end class
