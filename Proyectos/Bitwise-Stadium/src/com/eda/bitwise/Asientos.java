package com.eda.bitwise;

import javax.swing.JOptionPane;

/**
 *
 * @author Joso
 */
public class Asientos {

    int cantidad;
    Bitwise asientos[];

    public Asientos(int cantidad) {
        this.cantidad = cantidad;

        int nbw = cantidad / 32;
        nbw = (cantidad % 32 != 0) ? nbw + 1 : nbw;
        asientos = new Bitwise[nbw];
        for (int i = 0; i < nbw; i++) {
            asientos[i] = new Bitwise();
        }
    }
    
    public int obtenerNent(int ele) {
        return (ele / 32);
    }

    public int obtenerNbit(int ele) {
        return (ele % 32);
    }

    public void sentar(int ele) {
        int nEnt = obtenerNent(ele);
        int nBit = obtenerNbit(ele);
        if (ele >= 0 && ele < cantidad) {
            asientos[nEnt].encender(nBit);
        } else {
            JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
        }
    }

    public void levantar(int ele) {
        int nEnt = obtenerNent(ele);
        int nBit = obtenerNbit(ele);
        if (ele >= 0 && ele < cantidad) {
            asientos[nEnt].apagar(nBit);
        } else {
            JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
        }
    }

    public String mostrar() {
        String resultado = "";
        int cont = 0;
        String libre = "o ";
        String ocupado = "x ";
        for (int i = 0; i < cantidad; i++) {
            int nEnt = obtenerNent(i);
            int nBit = obtenerNbit(i);
            if (cont == 40) {
                resultado += "\n";
                cont = 0;
            }
            if (asientos[nEnt].getBit(nBit) == 0) {
                resultado += libre;
            } else {
                resultado += ocupado;
            }
            cont++;
        }
        return resultado;
    }


}
