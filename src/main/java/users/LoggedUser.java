package users;

public class LoggedUser {
    private long id;
    private String name;
    private String surname;
    private String username;
    private String email;


    public LoggedUser(long id, String name, String surname, String username, String email){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s (%s)",getName(), getSurname(), getEmail(), getUsername());
    }
    
}
