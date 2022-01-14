package com.eda.bitwise;
import Datos.DAC;
import java.util.ArrayList;
import java.util.List;

public class Estadio extends DAC{
    private String nombreEstadio;
    private List<Seccion> secciones;
    private List<Partido> partidos;
    private List<Cliente> clientes;
    private Partido partidoActual;
    
    public Estadio() {
        nombreEstadio = "";
        secciones = new ArrayList<>();
        partidos = new ArrayList<>();
        partidoActual = null;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
    
    public Partido getPartidoActual() {
        return partidoActual;
    }

    public void setPartidoActual(Partido partidoActual) {
        this.partidoActual = partidoActual;
    }
    
    public void cargarSecciones() {
        Seccion seccion = new Seccion();
        secciones = seccion.cargarSecciones();
    }
    
    public void cargarPartidos() {
        Partido partido = new Partido();
        partidos = partido.cargarPartidos();
    }
    
    public int getIndicePartido(int id){
        for(int i=0; i < partidos.size(); i++){
            if(partidos.get(i).getIdPartido() == id){
                return i;
            }
        }
        return -1;
    }
    
    public void cargarClientes() {
        Cliente cliente = new Cliente();
        clientes = cliente.cargarClientes();
    }
    
}
