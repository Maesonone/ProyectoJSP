package users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AuthService implements AuthInterface{
    Connection conn = null;

    public AuthService(Connection conn){
        this.conn = conn;
    }

    @Override
    public LoggedUser login(String username, String password) throws SQLException{
        //Varible conteniendo el Individuo a devolver
        LoggedUser result = null;
        //Construimos la consulta a realizar
        Statement statement = this.conn.createStatement();    
        String sql = String.format("SELECT id, name, surname, email FROM user WHERE username='%s' AND password='%s'", username, password);
        // Ejecución de la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorrido del resultado de la consulta
        if(querySet.next()) {
            //Obtenemos los datos del Individuo
            long id = querySet.getLong("id");
            String name = querySet.getString("name");
            String surname = querySet.getString("surname");
            String email = querySet.getString("email");
            result = new LoggedUser(id, name, surname, username, email);
        }
        //Cerramos la consulta
        statement.close();    
        //Devolvemos el individuo
        return result;
    }


    

    @Override
    public void logout() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

    @Override
    public LoggedUser register(String username, String name, String surname, String password, String email) throws SQLException {
         
         Statement statement = this.conn.createStatement();    
         String sql = String.format("INSERT INTO user (name, surname, email, password, username) VALUES ('%s', '%s', '%s', '%s', '%s')",name, surname, email, password, username);
         // Ejecución de la consulta
         int affectedRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
         if (affectedRows == 0) {
             // Devolvemos una excepción si no se ha creado el individuo
             throw new SQLException("Creating user failed, no rows affected.");
         }
 
         //Aquí llegaremos si se ha creado satisfactoriamente el individuo
         try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
             if (generatedKeys.next()) {
                 //Devolvemos el identificador del individuo creado
                 long id = generatedKeys.getLong(1);
                 statement.close();
                 return new LoggedUser(id, name, surname, username, email);
             }
             else {
                 //Aquí detectamos que hemos perdido conexión con el servidor de la
                 //base de datos y devolvemos una excepción
                 statement.close();
                 throw new SQLException("Creating user failed, no ID obtained.");
             }
         }
    }

    @Override
    public LoggedUser update(String username, String email, String name, String surname, long id) throws SQLException {
        Statement statement = this.conn.createStatement();
        String sql = String.format("UPDATE user SET name = '%s', surname = '%s', email = '%s', username = '%s' WHERE id = %d;", name, surname, email, username, id);
        int affectedRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
         if (affectedRows == 0) {
             // Devolvemos una excepción si no se ha actualizado el individuo
             throw new SQLException("Creating user failed, no rows affected.");
         }
         return new LoggedUser(id, name, surname, username, email);
    }
}
