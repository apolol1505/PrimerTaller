/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ed.lista.ListaEnlazada;

/**
 *
 * @author sfav
 */
public class Sucursal {
    private Integer id;
    private String nombre;
    private ListaEnlazada <Venta> venta= new ListaEnlazada<>();
    
}
