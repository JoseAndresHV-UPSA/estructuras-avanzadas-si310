
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    private boolean esHoja(Nodo pr) {
        return pr.getHI() == null && pr.getHD() == null;
    }

    public void insertar(int x) {
        Nodo q = new Nodo(x);
        if (raiz == null) {
            raiz = q;
            return;
        }
        Nodo pr = raiz;
        Nodo ant = null;
        while (pr != null) {
            ant = pr;
            if (x < pr.getElem()) {
                pr = pr.getHI();
            } else if (x > pr.getElem()) {
                pr = pr.getHD();
            } else {
                return;
            }
        }
        if (x < ant.getElem()) {
            ant.setHI(q);
        } else {
            ant.setHD(q);
        }
    }

    private Nodo insertarRec(Nodo pr, int x) {
        if (pr == null) {
            Nodo q = new Nodo(x);
            return q;
        }

        if (x < pr.getElem()) {
            pr.setHI(insertarRec(pr.getHI(), x));
        } else {
            pr.setHD(insertarRec(pr.getHD(), x));
        }

        return pr;
    }

    public void insertarR(int x) {
        raiz = insertarRec(raiz, x);
    }

    public void eliminarR(int x) {
        raiz = eliminarR(raiz, x);
    }

    //nfun
    public Nodo eliminarR(Nodo p, int x) {
        if (p == null) {
            return null;
        }

        if (x < p.getElem()) {
            p.setHI(eliminarR(p.getHI(), x));
        } else if (x > p.getElem()) {
            p.setHD(eliminarR(p.getHD(), x));
        } else {
            p = eliminarR(p, x);
        }

        return p;
    }

    private void preOrden(Nodo pr, JTextArea rt) {
        if (pr != null) {
            rt.append(String.valueOf(pr.getElem() + "  "));
            preOrden(pr.getHI(), rt);
            preOrden(pr.getHD(), rt);
        }
    }

    public void preOrden(JTextArea rt) {
        preOrden(raiz, rt);
    }

    private void InOrden(Nodo pr, JTextArea rt) {
        if (pr != null) {
            InOrden(pr.getHI(), rt);
            rt.append(String.valueOf(pr.getElem() + "  "));
            InOrden(pr.getHD(), rt);
        }
    }

    public void InOrden(JTextArea rt) {
        InOrden(raiz, rt);
    }

    private void PostOrden(Nodo pr, JTextArea rt) {
        if (pr != null) {
            PostOrden(pr.getHI(), rt);
            PostOrden(pr.getHD(), rt);
            rt.append(String.valueOf(pr.getElem() + "  "));
        }
    }

    public void PostOrden(JTextArea rt) {
        PostOrden(raiz, rt);
    }

    private int suma(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) // no es necesario
        {
            return pr.getElem();
        } else {
            int hi = suma(pr.getHI());
            int hd = suma(pr.getHD());

            return hi + hd + pr.getElem();
        }
    }

    public int suma() {
        return suma(raiz);
    }

    private int sumaPares(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //no es necesario
        {
            if (pr.getElem() % 2 == 0) {
                return pr.getElem();
            } else {
                return 0;
            }
        } else {
            int hi = sumaPares(pr.getHI());
            int hd = sumaPares(pr.getHD());
            if (pr.getElem() % 2 == 0) {
                return hi + hd + pr.getElem();
            } else {
                return hi + hd;
            }
        }
    }

    public int sumaPares() {
        return sumaPares(raiz);
    }

    private int contarPares(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //no es necesario
        {
            if (pr.getElem() % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int hi = contarPares(pr.getHI());
            int hd = contarPares(pr.getHD());
            if (pr.getElem() % 2 == 0) {
                return hi + hd + 1;
            } else {
                return hi + hd;
            }
        }
    }

    public int contarPares() {
        return contarPares(raiz);
    }

    private int cantidad(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //no es necesario
        {
            return 1;
        } else {
            int hi = cantidad(pr.getHI());
            int hd = cantidad(pr.getHD());
            return hi + hd + 1;
        }
    }

    public int cantidad() {
        return cantidad(raiz);
    }

    private int altura(Nodo ptr) {
        if (ptr == null) {
            return 0;
        } else if (esHoja(ptr)) //no es necesario
        {
            return 1;
        } else {
            int hi = altura(ptr.getHI());
            int hd = altura(ptr.getHD());
            if (hi > hd) {
                return hi + 1;
            } else {
                return hd + 1;
            }
        }
    }

    public int altura() {
        return altura(raiz);
    }

    private int menor(Nodo ptr) {
        if (ptr == null) {
            return 0;
        } else if (esHoja(ptr)) {
            return ptr.getElem();
        } else if (ptr.getHI() != null) //Validar
        {
            return menor(ptr.getHI());
        } else {
            return ptr.getElem();
        }
    }

    public int menor() {
        return menor(raiz);
    }

    private int mayor(Nodo ptr) {
        if (ptr == null) {
            return 0;
        } else if (esHoja(ptr)) {
            return ptr.getElem();
        } else { //Validar
            int hd = mayor(ptr.getHD());
            return hd;
        }
    }

    public int mayor() {
        return mayor(raiz);
    }

    private int incompletos(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //no es necesario
        {
            return 0;
        } else {
            int hi = incompletos(pr.getHI());
            int hd = incompletos(pr.getHD());
            if (pr.getHI() != null && pr.getHD() == null || pr.getHI() == null && pr.getHD() != null) {
                return hi + hd + 1; //el padre es incompleto
            } else {
                return hi + hd;
            }
        }
    }

    public int incompletos() {
        return incompletos(raiz);
    }

    private boolean existe(Nodo pr, int x) {
        if (pr == null) {
            return false;
        } else /*if (esHoja(pr))
                    return pr.getElem() == x;
                else*/ {
            if (pr.getElem() == x) {
                return true;
            } else if (x < pr.getElem()) {
                return existe(pr.getHI(), x);
            } else {
                return existe(pr.getHD(), x);
            }
        }
    }

    public boolean existe1(int x) {
        return existe1(raiz, x);
    }

    private boolean existe1(Nodo pr, int x) {
        if (pr == null) {
            return false;
        } else {
            if (existe(pr.getHI(), x) || existe(pr.getHD(), x)) {
                return true;
            } else {
                return pr.getElem() == x;
            }
        }
    }

    private int cantHojas(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //necesario
        {
            return 1;
        } else {
            int hi = cantHojas(pr.getHI());
            int hd = cantHojas(pr.getHD());
            return hi + hd;   //aqui el padre no es hoja
        }
    }

    //otra version en vez del caso base: esHoja lo hace en el general
    private int cantHojas1(Nodo pr) {
        if (pr == null) {
            return 0;
        } else /*if (esHoja(pr)) //necesario
                    return 1;
                else*/ {
            int hi = cantHojas1(pr.getHI());
            int hd = cantHojas1(pr.getHD());
            if (pr.getHI() == null && pr.getHD() == null) {
                return hi + hd + 1;
            } else {
                return hi + hd;
            }
        }
    }

    public int cantHojas() {
        return cantHojas(raiz);
    }

    //estudiar y modificar igual que el anterior, sin el caso base: esHoja
    private int cantPadres(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //necesario
        {
            return 0;
        } else {
            int hi = cantPadres(pr.getHI());
            int hd = cantPadres(pr.getHD());
            return hi + hd + 1;
        }
    }

    public int cantPadres() {
        return cantPadres(raiz);
    }
    //Otra forma sin esHoja, xq no es necesario

    private int cantPadres1(Nodo pr) {
        if (pr == null) {
            return 0;
        } else {
            int hi = cantPadres1(pr.getHI());
            int hd = cantPadres1(pr.getHD());
            if (pr.getHI() != null || pr.getHD() != null) {
                return hi + hd + 1;
            } else {
                return hi + hd;
            }
        }
    }

    private void mostrarPadres(Nodo p, JTextArea jta) {
        if (p == null) {
            return;
        } else /* if (esHoja(p))
                    return ;
                else*/ {
            mostrarPadres(p.getHI(), jta);
            mostrarPadres(p.getHD(), jta);
            if (p.getHI() != null || p.getHD() != null) {
                jta.append(p.getElem() + "  ");
            }
        }
    }

    public void mostrarPadres(JTextArea jta) {
        mostrarPadres(raiz, jta);
    }

    public void mostrarPadre1(int x) {
        Nodo ap = null;
        Nodo p = raiz;
        while (p != null && p.getElem() != x) {
            if (x < p.getElem()) {
                ap = p;
                p = p.getHI();
            } else if (x > p.getElem()) {
                ap = p;
                p = p.getHD();
            }
        }

        if (p == null) {
            JOptionPane.showMessageDialog(null, "No se encontro el elemento");
        } else {
            if (ap != null) {
                JOptionPane.showMessageDialog(null, ap.getElem());
            } else {
                JOptionPane.showMessageDialog(null, "No tiene padre");
            }
        }
    }

    private void mostrarPares(Nodo pr, JTextArea rt) {
        if (pr == null) {
            return;
        } else if (esHoja(pr)) {
            if (pr.getElem() % 2 == 0) {
                rt.append(pr.getElem() + " ");
            }
        } else {
            mostrarPares(pr.getHI(), rt);
            mostrarPares(pr.getHD(), rt);
            if (pr.getElem() % 2 == 0) {
                rt.append(pr.getElem() + " ");
            }
        }
    }

    public void mostrarPares(JTextArea jta) {
        mostrarPares(raiz, jta);
    }

    private void mostrarPrimos(Nodo pr, JTextArea rt) {
        if (pr == null) {
            return;
        } else if (esHoja(pr)) {
            if (esPrimo(pr.getElem())) {
                rt.append(pr.getElem() + " ");
            }
        } else {
            mostrarPrimos(pr.getHI(), rt);
            mostrarPrimos(pr.getHD(), rt);
            if (esPrimo(pr.getElem())) {
                rt.append(pr.getElem() + " ");
            }
        }
    }

    public void mostrarPrimos(JTextArea jta) {
        mostrarPrimos(raiz, jta);
    }

    //imprime en postOrden
    private void mostrarMayoresX(Nodo pr, JTextArea rt, int x) {
        if (pr == null) {
            return;
        } else if (esHoja(pr)) {
            if (pr.getElem() > x) {
                rt.append(pr.getElem() + " ");
            }
        } else {
            mostrarMayoresX(pr.getHI(), rt, x);
            mostrarMayoresX(pr.getHD(), rt, x);
            if (pr.getElem() > x) {
                rt.append(pr.getElem() + " ");
            }
        }
    }

    public void mostrarMayoresX(JTextArea rt, int x) {
        mostrarMayoresX(raiz, rt, x);
    }

    private boolean brother(Nodo p, int x, int y) {
        if (p == null) {
            return false;
        } else if (esHoja(p) || incompleto(p)) {
            return false;
        } else {
            if (brother(p.getHI(), x, y) || brother(p.getHD(), x, y)) {
                return true;
            } else {  //Para la forma como meta los hnos
                if (p.getHI().getElem() == x && p.getHD().getElem() == y || p.getHI().getElem() == y && p.getHD().getElem() == x) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public boolean brother(int x, int y) {
        return brother(raiz, x, y);
    }

    public void descendientes(int x, JTextArea rt) {
        Nodo ant = null;
        Nodo pr = raiz;
        if (pr.getElem() == x) {
            preOrden(pr, rt);
        } else {
            while (pr != null) {
                ant = pr;
                if (x < pr.getElem()) {
                    pr = pr.getHI();
                } else if (x > pr.getElem()) {
                    pr = pr.getHD();
                } else {
                    pr = null;
                }
            }
            preOrden(ant, rt);
        }
    }

//Otros extras        
    public boolean Padre(Nodo pr) {
        return pr.getHD() != null && pr.getHI() != null;
    }

    private boolean Hermanos(Nodo pr, int x, int y) {
        if (pr == null) {
            return false;
        }
        if (Padre(pr) && pr.getHI().getElem() == x && pr.getHD().getElem() == y) {
            return true;
        }
        if (Hermanos(pr.getHD(), x, y) || Hermanos(pr.getHI(), x, y)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Hermanos(int x, int y) {
        return Hermanos(raiz, x, y);
    }

    private boolean incompleto(Nodo T) {
        return (T.getHD() != null && T.getHI() == null) || (T.getHD() == null && T.getHI() != null);
    }

    private boolean Hermanos1(Nodo T, int x, int y) {
        if (T == null || esHoja(T) || incompleto(T)) {
            return false;
        } else {
            int a = T.getHI().getElem();
            int b = T.getHD().getElem();
            if ((a == x && b == y) || (a == y && b == x)) {
                return true;
            }

            if (Hermanos(T.getHD(), x, y) || Hermanos(T.getHI(), x, y)) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean TieneNietos(int abu, Nodo pr) {
        if (pr == null) {
            return false;
        }
        if (pr.getElem() == abu && altura(pr) >= 3) {
            return true;
        }
        boolean ai = TieneNietos(abu, pr.getHD());
        boolean ad = TieneNietos(abu, pr.getHD());
        if (ai || ad) {
            return true;
        } else {
            return false;
        }
    }

    public boolean TieneNietos(int abu) {
        return TieneNietos(abu, raiz);
    }

    public boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int contarPrimos(Nodo pr) {
        if (pr == null) {
            return 0;
        }
        if (esHoja(pr) && esPrimo(pr.getElem())) {
            return 1;
        } else {
            int ai = contarPrimos(pr.getHD());
            int ad = contarPrimos(pr.getHI());
            if (esPrimo(pr.getElem())) {
                return ai + ad + 1;
            } else {
                return ai + ad;
            }
        }
    }

    public int contarPrimos() {
        return contarPrimos(raiz);
    }

    private boolean esSuHijo(Nodo pr, int hijo) {
        if (pr == null) {
            return false;
        }
        if (!esHoja(pr)) {
            if (pr.getHD() != null && pr.getHD().getElem() == hijo) {
                return true;
            }
            if (pr.getHI() != null && pr.getHI().getElem() == hijo) {
                return true;
            }
        }
        return false;
    }

    //cuando no tiene abuelo devuelve 0
    private int retornaAbuelo(Nodo pr, int x) {
        if (pr == null) {
            return 0;
        }
        if (altura(pr) >= 3) {
            if (pr.getHI() != null && esSuHijo(pr.getHI(), x)) {
                return pr.getElem();
            }
            if (pr.getHD() != null && esSuHijo(pr.getHD(), x)) {
                return pr.getElem();
            }
        }

        int ai = retornaAbuelo(pr.getHI(), x);
        int ad = retornaAbuelo(pr.getHD(), x);
        if (ai != 0) {
            return ai;
        } else if (ad != 0) {
            return ad;
        } else {
            return 0;
        }
    }

    public int retornaAbuelo(int x) {
        return retornaAbuelo(raiz, x);
    }
    
    private void MostrarNivel(Nodo pr, int n, int nivel, JTextArea ta) {
        if (pr == null) {
            return;
        }
        if (n == nivel) {
            ta.append(pr.getElem() + " ");
            return;
        } else {
            MostrarNivel(pr.getHI(), n, nivel + 1, ta);
            MostrarNivel(pr.getHD(), n, nivel + 1, ta);
            nivel = 1;
        }
    }

    public void MostrarNivel(int nivel, JTextArea rtb) {
        MostrarNivel(raiz, nivel, 1, rtb);
    }

    //no funca para los nietos del medio del arbol
    private void MostrarNietos(Nodo p, int x, JTextArea jta) {
        if (p == null) {
        }
        if (x == p.getElem()) {
            if (p.getHD() != null) {
                if (p.getHD().getHI() != null) {
                    jta.append(p.getHD().getHI().getElem() + " ");
                }
                if (p.getHD().getHD() != null) {
                    jta.append(p.getHD().getHD().getElem() + " ");
                }
            }
            if (p.getHI() != null) {
                if (p.getHD().getHI() != null) {
                    jta.append(p.getHI().getHI().getElem() + " ");
                }
                if (p.getHD().getHD() != null) {
                    jta.append(p.getHI().getHD().getElem() + " ");
                }
            }
            return;
        }
        if (x > p.getElem()) {
            MostrarNietos(p.getHD(), x, jta);
        } else {
            MostrarNietos(p.getHI(), x, jta);
        }
    }

    public void MostrarNietos(int x, JTextArea jta) {
        MostrarNietos(raiz, x, jta);
    }

    //lo mismo que descendientes, pero recursivo
    private void ImprimirDescendientes(Nodo p, JTextArea ta, int x) {
        if (p == null) {
            return;
        }
        if (p.getElem() == x) {
            preOrden(p, ta);
            return;
        }
        if (p.getElem() < x) {
            ImprimirDescendientes(p.getHD(), ta, x);
        } else {
            ImprimirDescendientes(p.getHI(), ta, x);
        }
    }

    public void ImprimirDescendientes(JTextArea ta, int x) {
        ImprimirDescendientes(raiz, ta, x);
    }

    //OTROS METODOS      
    public void eliminar(int x) {
        Nodo p = raiz;
        Nodo ap = null;
        while (p != null && p.getElem() != x) {
            ap = p;
            if (x > p.getElem()) {
                p = p.getHD();
            } else {
                p = p.getHI();
            }
        }
        if (p == null) {
            return;
        }
        if (esHoja(p)) {
            elimCaso1(ap, p);
        } else if ((p.getHD() != null && p.getHI() == null) || (p.getHD() == null && p.getHI() != null)) {
            elimCaso2(ap, p);
        } else {
            elimCaso3(p);
        }
    }

    private void elimCaso1(Nodo ap, Nodo p) {
        if (ap == null) {
            raiz = null;
        } else {
            if (p == ap.getHD()) {
                ap.setHD(null);
            } else {
                ap.setHI(null);
            }
        }
    }

    private void elimCaso2(Nodo ap, Nodo p) {
        if (ap == null) {
            if (p.getHD() != null) {
                raiz = p.getHD();
            } else {
                raiz = p.getHI();
            }
        } else {
            if (p == ap.getHD()) {
                if (p.getHD() != null) {
                    ap.setHD(p.getHD());
                } else {
                    ap.setHD(p.getHI());
                }
            } else if (p.getHD() != null) {
                ap.setHD(p.getHD());
            } else {
                ap.setHI(p.getHI());
            }
        }
    }

    private void elimCaso3(Nodo p) {
        Nodo s = p.getHD();
        Nodo ant = null;
        while (s.getHI() != null) {
            ant = s;
            s = s.getHI();
        }
        int aux = p.getElem();
        p.setElem(s.getElem());
        s.setElem(aux);
        if (ant == null) {
            p.setHD(null);
        } else {
            ant.setHI(null);
        }
    }

    private Nodo devolverHermano(Nodo p, int x) {
        if (p == null || esHoja(p)) {
            return null;
        } else {
            if (p.getHI() != null) {
                if (p.getHI().getElem() == x) 
                    return p.getHD();
            }
            if (p.getHD() != null) {
                if (p.getHD().getElem() == x) 
                    return p.getHI();
            }

            Nodo ni = devolverHermano(p.getHI(), x);
            Nodo nd = devolverHermano(p.getHD(), x);
            if (ni != null) 
                return ni;
          
            if (nd != null)
                return nd;
            
            return null;
        }
    }

    public void devolverHermano(int x) {
        Nodo p = devolverHermano(raiz, x);
        if (!existe1(x)) {
            return;
        }
        if (p == null) {
            JOptionPane.showMessageDialog(null, "NO tiene hermano");
        } else {
            JOptionPane.showMessageDialog(null, p.getElem());
        }
    }

    private Nodo devolverPadre(Nodo p, int x) {
        if (p == null || esHoja(p)) {
            return null;
        } else {
            if (p.getHI() != null) {
                if (p.getHI().getElem() == x) {
                    return p;
                }
            }

            if (p.getHD() != null) {
                if (p.getHD().getElem() == x) {
                    return p;
                }
            }

            Nodo I = devolverPadre(p.getHI(), x);
            Nodo D = devolverPadre(p.getHD(), x);
            if (I != null) {
                return I;
            } else {
                return D;
            }
        }
    }

    public void devolverPadre(int x) {
        Nodo p = devolverPadre(raiz, x);
        if (!existe1(x)) {
            return;
        }
        if (p == null && existe1(x)) {
            JOptionPane.showMessageDialog(null, "NO tiene Padre");
        } else {
            JOptionPane.showMessageDialog(null, p.getElem());
        }
    }

    private Nodo sucInOrden(Nodo T) {
        if (T == null || esHoja(T)) {
            return null;
        }
        if (T.getHI() == null && T.getHD() != null) {
            return T.getHD();
        }
        if (T.getHI() != null && T.getHD() == null) {
            return T.getHI();
        }

        Nodo P = T.getHD();
        while (P.getHI() != null) {
            P = P.getHI();
        }
        return P;
    }

    public void sucInOrden() {
        Nodo p = sucInOrden(raiz);
        if (p == null) {
            JOptionPane.showMessageDialog(null, "NO tiene sucInOrden");
        } else {
            JOptionPane.showMessageDialog(null, p.getElem());
        }
    }

    public boolean existe(int x) {
        Nodo p = raiz;
        while (p != null) {
            if (p.getElem() == x) {
                return true;
            } else if (p.getElem() < x) {
                p = p.getHD();
            } else {
                p = p.getHI();
            }
        }

        return false;
    }

    public void mostrarHijos(int x) {
        Nodo p = raiz;
        while (p != null) {
            if (p.getElem() == x) {
                if (p.getHI() != null) {
                    JOptionPane.showMessageDialog(null, "Hijo izquierdo: " + p.getHI().getElem());
                }

                if (p.getHD() != null) {
                    JOptionPane.showMessageDialog(null, "Hijo derecho: " + p.getHD().getElem());
                }

                if (p.getHI() == null && p.getHD() == null) {
                    JOptionPane.showMessageDialog(null, "No tiene hijos");
                }

                return;
            } else if (p.getElem() < x) {
                p = p.getHD();
            } else {
                p = p.getHI();
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el elemento");
    }

    public void cantidadHijos(int x) {
        Nodo p = raiz;
        while (p != null) {
            if (p.getElem() < x) {
                p = p.getHD();
            } else if (p.getElem() > x) {
                p = p.getHI();
            } else if (p.getElem() == x) {
                int cont = 0;

                if (p.getHI() != null) {
                    cont++;
                }

                if (p.getHD() != null) {
                    cont++;
                }
                JOptionPane.showMessageDialog(null, "Numero de hijos de " + x + ": " + cont);

                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el elemento");
    }

    public int sumarPrimos() {
        return sumarPrimos(raiz);
    }

    private int sumarPrimos(Nodo pr) {
        if (pr == null) {
            return 0;
        }
        if (esHoja(pr) && esPrimo(pr.getElem())) {
            return pr.getElem();
        } else {
            int ai = sumarPrimos(pr.getHD());
            int ad = sumarPrimos(pr.getHI());

            if (esPrimo(pr.getElem())) {
                return ai + ad + pr.getElem();
            } else {
                return ai + ad;
            }
        }
    }

    //1. Dado un árbol binario, mostrar los nietos de un elemento X introducido por parámetro.
    public void mostrarNietos(int x) {
        Nodo p = raiz;
        while (p != null) {
            if (p.getElem() == x) {
                Nodo hi = p.getHI();
                Nodo hd = p.getHD();
                if (hi != null) {
                    if (hi.getHI() != null) {
                        JOptionPane.showMessageDialog(null, "Izquierda: Nieto izquierdo: " + hi.getHI().getElem());
                    }
                    if (hi.getHD() != null) {
                        JOptionPane.showMessageDialog(null, "Izquierda: Nieto derecho: " + hi.getHD().getElem());
                    }
                }

                if (hd != null) {
                    if (hd.getHI() != null) {
                        JOptionPane.showMessageDialog(null, "Derecha: Nieto izquierdo: " + hd.getHI().getElem());
                    }
                    if (hd.getHD() != null) {
                        JOptionPane.showMessageDialog(null, "Derecha: Nieto derecho: " + hd.getHD().getElem());
                    }
                }

                if (hi == null && hd == null || hi.getHI() == null && hi.getHD() == null && hd.getHI() == null && hd.getHD() == null) {
                    JOptionPane.showMessageDialog(null, "No tiene nietos");
                }

                return;
            } else if (p.getElem() < x) {
                p = p.getHD();
            } else {
                p = p.getHI();
            }

        }
        JOptionPane.showMessageDialog(null, "No existe el elemento");
    }

    //2. Dado un árbol binario, mostrar el abuelo de un elemento X introducido por parámetro.
    public void mostrarAbuelo(int x) {
        Nodo ap = null;
        Nodo pp = null;
        Nodo p = raiz;
        while (p != null) {
            if (p.getElem() == x) {
                if (ap != null) {
                    JOptionPane.showMessageDialog(null, "Abuelo: " + ap.getElem());
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene abuelo");
                }
                return;
            } else if (x < p.getElem()) {
                ap = pp;
                pp = p;
                p = p.getHI();
            } else if (x > p.getElem()) {
                ap = pp;
                pp = p;
                p = p.getHD();
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el elemento");
    }

    //3. Dado un árbol binario, mostrar los descendientes de un elemento X (Al decir descendientes se refiere a: hijos, nietos, bisnietos, etc).
    public void mostrarDescendencia(int x) {
        Nodo p = raiz;
        while (p != null) {
            if (p.getElem() == x) {
                descendencia(p.getHI());
                descendencia(p.getHD());
                if (p.getHI() == null && p.getHD() == null)
                    JOptionPane.showMessageDialog(null, "No tiene descendencia");
                return;
            } else if (x < p.getElem()) {
                p = p.getHI();
            } else if (x > p.getElem()) {
                p = p.getHD();
            }

        }
        JOptionPane.showMessageDialog(null, "No existe el elemento");
    }
    
    private void descendencia(Nodo p) {
        if (p != null) {
            JOptionPane.showMessageDialog(null, p.getElem());
            descendencia(p.getHI());
            descendencia(p.getHD());
        }
    }

    //4. Diseñar un método que permita verificar que 2 árboles son iguales (en tamaño y elementos)
    public boolean iguales(Arbol a1) {
        if (cantidad(raiz) != cantidad(a1.raiz))
            return false;
        return iguales(raiz, a1.raiz);
    }
    
    private boolean iguales (Nodo p, Nodo q) {
        if (p != null && q != null) {
            if (p.getElem() != q.getElem())
                return false;
            iguales(p.getHI(), q.getHI());
            iguales(p.getHD(), q.getHD());
        }
        return true;
    }
    
    //5. Verificar que un árbol es una lista enlazada simple (El árbol es lista, si el nodo padre solo tiene hijos izquierdo o hijos derechos)
    public boolean esListaSimple() {
        Nodo p = raiz;
        while (p.getHI() != null) {
            if (p.getHD() != null)
                return false;
            p = p.getHI();
        }
        while (p.getHD() != null) {
            if (p.getHI() != null)
                return false;
            p = p.getHD();
        }
        return true;
    }
    
    //6. Implementar un método que permita mostrar por niveles los elementos de un árbol binario
   
    public void mostrarNiveles() {
        String niveles[] = new String[altura()];
        mostrarNiveles(raiz, 0, niveles);
        int i = 1;
        for (String nivel: niveles) {
            JOptionPane.showMessageDialog(null, "Nivel " + i + ": " + nivel);
            i++;
        }
    }
    
    private void mostrarNiveles(Nodo p, int nivel, String niveles[]) {
        if (p != null) {
            niveles[nivel] = p.getElem() + " " + ((niveles[nivel] != null) ? niveles[nivel] : "");
            mostrarNiveles(p.getHD(), nivel + 1, niveles);
            mostrarNiveles(p.getHI(), nivel + 1, niveles);
        }
    }
    
    //7. Implementar un método que permita mostrar por niveles los elementos pares de un árbol binario
    public void mostrarElemPares() {
        String niveles[] = new String[altura()];
        mostrarElemPares(raiz, 0, niveles);
        int i = 1;
        for (String nivel: niveles) {
            if (nivel.isEmpty()) 
                JOptionPane.showMessageDialog(null, "Nivel " + i + ": No tiene elementos pares");
            else
                JOptionPane.showMessageDialog(null, "Nivel " + i + ": " + nivel);
            i++;
        }
    }
    
    private void mostrarElemPares(Nodo p, int nivel, String niveles[]) {
        if (p != null) {
            String elem = ((p.getElem() % 2 == 0) ? (p.getElem() + " ") : "");
            niveles[nivel] = elem + ((niveles[nivel] != null) ? niveles[nivel] : "");
            mostrarElemPares(p.getHD(), nivel + 1, niveles);
            mostrarElemPares(p.getHI(), nivel + 1, niveles);
        }
    }
    
    //8. Hacer una función para calcular la suma de cada nivel de un árbol
    public void sumaPorNivel() {
        String niveles[] = new String[altura()];
        sumaPorNivel(raiz, 0, niveles);
        int i = 1;
        for (String nivel: niveles) {
            int suma = 0;
            String[] elems = nivel.split(",");
            for(String elem: elems) {
                suma += Integer.parseInt(elem);
            }
            JOptionPane.showMessageDialog(null, "Suma nivel " + i + ": " + suma);
            i++;
        }
    }
    
    private void sumaPorNivel(Nodo p, int nivel, String niveles[]) {
        if (p != null) {
            niveles[nivel] = p.getElem() + "," + ((niveles[nivel] != null) ? niveles[nivel] : "");
            sumaPorNivel(p.getHD(), nivel + 1, niveles);
            sumaPorNivel(p.getHI(), nivel + 1, niveles);
        }
    }
    
    //Examen Practico - Realizar un método que devuelva la suma de sus elementos de los nietos de un elemento x introducido por parámetro
    public int sumarNietos(int x) {
        Nodo p = raiz;
        boolean flag = false;
        while (p != null) {
            if (p.getElem() == x) {
                Nodo hi = p.getHI();
                Nodo hd = p.getHD();
                int suma = 0;
                if (hi != null) {
                    if (hi.getHI() != null) {
                        suma += hi.getHI().getElem();
                        flag = true;
                    }
                    if (hi.getHD() != null) {
                        suma += hi.getHD().getElem();
                        flag = true;
                    }
                }

                if (hd != null) {
                    if (hd.getHI() != null) {
                        suma += hd.getHI().getElem();
                        flag = true;
                    }
                    if (hd.getHD() != null) {
                        suma += hd.getHD().getElem();
                        flag = true;
                    }
                }
                
                if (!flag)
                    JOptionPane.showMessageDialog(null, "El elemento no tiene nietos");
                
                return suma;
                
            } else if (p.getElem() < x) 
                p = p.getHD();
            else 
                p = p.getHI();
            
        }
        JOptionPane.showMessageDialog(null, "No existe el elemento");
        return 0;
        
    }
    public boolean iguales1(Arbol B) {
       return iguales1(this.raiz,B.raiz);
    }
    
    private boolean iguales1(Nodo A, Nodo B)
    {
      if(A==null && B==null)
          return true;
      
      if(A==null && B!=null ||   A != null && B==null)
          return false;      //uno es vacio y el otro no
      
      if(esHoja(A) && esHoja(B)) {
         return A.getElem()==B.getElem();
      }
      
      if(iguales1(A.getHI(),B.getHI()) && iguales1(A.getHD(),B.getHD()))
         return true;
      else
         return false;      
    }
    
    
    
}//end class

