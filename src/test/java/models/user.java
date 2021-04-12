package models;

public class user {
    private String username;
    private String password;

    public user(String uname, String pw) {
        this.username = uname;
        this.password = pw;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }


}
