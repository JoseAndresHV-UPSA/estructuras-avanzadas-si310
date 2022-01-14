package com.eda.bitwise;

import javax.swing.JOptionPane;

public class Bitwise {

    private int x;

    public Bitwise() {
        x = 0;
    }

    public String mostrar() {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            s = getBit(i) + s;
        }
        return s;
    }

    public void encender(int pos) {
        if (pos < 0 || pos > 31) {
            JOptionPane.showMessageDialog(null, "Bitwise::encender: Fuera de rango.");
            return;
        }
        int y = 1 << pos;
        x = x | y;
    }

    public void apagar(int pos) {
        if (pos >= 0 && pos <= 31) {
            int y = ~(1 << pos);
            x = x & y;
        } else 
            JOptionPane.showMessageDialog(null, "Bitwise::apagar: Fuera de rango.");
    }

    public int getBit(int pos) {
        int y = (1 << pos) & x;
        
        if (y == 0) 
            return 0;
        return 1; 
    }
}
