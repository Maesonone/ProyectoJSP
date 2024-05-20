package crud;

import java.sql.SQLException;
import java.util.ArrayList;

import views.equipos;

/** CRUD
 * Interfaz que contiene los métodos necesarios para
 * obtener y modificar información de Jugadores en la base de datos
 */
public interface CRUD<T> {

    public ArrayList<T> requestAll(String tabla, String sortedBy) throws SQLException;
    public equipos requestById(int id, String tabla) throws SQLException;
    public equipos create(equipos e, String tabla) throws SQLException;
    public int update(equipos e, String tabla) throws SQLException;
    public boolean delete(int id, String tabla) throws SQLException;
    public String serialize(equipos e);
    public equipos deserialize(String e);
}
