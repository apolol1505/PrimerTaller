/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;

/**
 *
 * @author sfav
 */
public class SucursalControl {

    private Sucursal sucursal;
    private Venta venta;

    public SucursalControl() {
        sucursal = new Sucursal();
    }

    public Sucursal getSucursal() {
        //Si no existe se crea una sucursal
        if (sucursal == null) {
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

}
