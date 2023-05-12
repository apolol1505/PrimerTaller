/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import java.io.IOException;

/**
 *
 * @author sfav
 */
public interface InterfazDao<T> {

    public void guardar(T obj) throws IOException;

    public void modificar(T obj, Integer pos);

    public T[] listar();

    public T obtener(Integer obj);
}
