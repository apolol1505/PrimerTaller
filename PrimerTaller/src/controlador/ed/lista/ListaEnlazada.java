/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.lista;

import controlador.ed.lista.exception.VacioException;
import controlador.ed.lista.exception.PosicionException;

/**
 *
 * @author sfav
 */
public class ListaEnlazada <E> /*E de elemento*/{
    
    private NodoLista cabecera;
    private Integer size=0; //se define el tamaño 

    public NodoLista getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista cabecera) {
        this.cabecera = cabecera;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public boolean insertar(E informacion) /*Recibe como parametro la informacion*/ {
        
        return true;
    }
    
    public void imprimir () throws VacioException{
                
    }
    
    public void insertarInicio(){
        
    }
    
    public void insertarPosicion(E informacion, Integer size) throws PosicionException /*Recibe como parametro la informacion y una posicion*/{
        
    }
    
    public E get(Integer pos) throws VacioException {
        E dato = null;
        
        return dato;
    
    }
    
     public E delete(Integer pos) throws VacioException, PosicionException {
         E dato = null;
         return dato;
     }
     
     public void deleteAll() {
        this.cabecera = null;
    }
}
