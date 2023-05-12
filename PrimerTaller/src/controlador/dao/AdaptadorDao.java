/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 *
 * @author sfav
 */
public class AdaptadorDao<T> implements InterfazDao<T> {
        private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDao(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = Conexion.URL + clazz.getSimpleName().toLowerCase() + ".json";
    }

    @Override
    public void guardar(T obj) throws IOException {
        T[] lista = (T[]) Array.newInstance(clazz, 1);

        try {
            T[] aux = listar();
            lista = (T[]) Array.newInstance(clazz, aux.length + 1);
            for (int i = 0; i < aux.length; i++) {
                lista[i] = aux[i];
            }
            lista[aux.length] = obj;
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("GG");
            lista[0]=obj;
        }
        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
        conexion.getXstream().toXML(lista, new FileWriter(url));
    }

    @Override
    public void modificar(T obj, Integer pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T[] listar() {
        //TODO: implementar con listas aqui esta con arreglos
        T[] lista = (T[]) conexion.getXstream().fromXML(url);
        return lista;

    }

    @Override
    public T obtener(Integer obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
