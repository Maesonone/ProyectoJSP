package views;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import crud.CRUD;

public class tablas implements CRUD<equipos> {
    Connection conn;

    public tablas(Connection conn){
        this.conn = conn;
    }

    
    @Override
    public ArrayList<equipos> requestAll(String tabla, String sortedBy) throws SQLException {
        Statement statement = null;
        ArrayList<equipos> result = new ArrayList<equipos>();
        statement = this.conn.createStatement();   
        String sql = String.format("SELECT record, teamname, coach, id FROM %s", tabla);
        if (sortedBy!=null) {
            sql += " ORDER BY "+sortedBy+" DESC";
        }
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        while(querySet.next()) {
            String record = querySet.getString("record");
            String nombre = querySet.getString("teamname");
            String coach = querySet.getString("coach");
            int id = querySet.getInt("id");
            result.add(new equipos(record, nombre, coach, id));
        } 
        statement.close();    
        return result;
    }


    @Override
    public equipos create(equipos model, String tabla) throws SQLException {
        String record = model.getRecord();
        String nombre = model.getNombre();
        String coach = model.getEntrenador();
        int id = model.getid();
        
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("INSERT INTO %s (record, teamname, coach, id) VALUES ('%s', '%s', '%s', '%d')", tabla, record, nombre, coach, id);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
        if (affectedRows == 0) {
            throw new SQLException("Creating group failed, no rows affected.");
        }else{
            return new equipos(record, nombre, coach, id);
        }
    }

    @Override
    public int update(equipos model, String tabla) throws SQLException {
        String nombre = model.getNombre();
        String coach = model.getEntrenador();
        String record = model.getRecord();
        int id = model.getid();
        
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("UPDATE %s SET teamname = '%s', coach = '%s', record= '%s' WHERE id=%d", tabla, nombre, coach, record, id);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        statement.close();
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }

    @Override
    public boolean delete(int id, String tabla) throws SQLException {
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("DELETE FROM %s WHERE id=%d", tabla, id);
        // Ejecución de la consulta
        int result = statement.executeUpdate(sql);
        statement.close();
        return result==1;
    }


    @Override
    public String serialize(equipos e) {
        return String.format("%d;%s;%s;%S", e.getid(), e.getNombre(), e.getEntrenador(), e.getRecord());
    }


    @Override
    public equipos deserialize(String e) {
        String[] x = new String[4];
        x = e.split(";");
        int id = Integer.parseInt(x[0]);
        String nombre = x[1];
        String entrenador = x[2];
        String record = x[3];

        return new equipos(record, nombre, entrenador, id);
    }


    @Override
    public equipos requestById(int id, String tabla) throws SQLException {
        Statement statement = null;
        equipos result = null;
        statement = this.conn.createStatement();    
        String sql = String.format("SELECT id, teamname, coach, record FROM %s WHERE id=%d", tabla, id);
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        if(querySet.next()) {
            String record = querySet.getString("record");
            String nombre = querySet.getString("teamname");
            String coach = querySet.getString("coach");
            int codigo = querySet.getInt("id");
            result = new equipos(record, nombre, coach, codigo);
        }
        statement.close();    
        return result;
    }


}
