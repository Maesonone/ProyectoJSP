package users;

import java.sql.SQLException;

public interface AuthInterface {
    public LoggedUser login(String username, String password) throws SQLException;
    public void logout() throws SQLException;
    public LoggedUser register(String username, String name, String surname, String password, String email) throws SQLException;
    public LoggedUser update(String username, String name, String email, String surname, long id) throws SQLException;
}
