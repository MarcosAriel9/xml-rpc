package mx.edu.utez.client;

public class User {
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String date_registered;
    private int status;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDate_registered() {
        return date_registered;
    }

    public int getStatus() {
        return status;
    }

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate_registered(String date_registered) {
        this.date_registered = date_registered;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User(int id, String name, String lastname, String email, String password, String date_registered, int status) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.date_registered = date_registered;
        this.status = status;
    }
}
