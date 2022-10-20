public class User
{
    //Atributos

    String userId;
    String userName;
    String userSurname;

    //Contructor
    public User(String s, String name, String surname) {
        this.userId=s;
        this.userName=name;
        this.userSurname=surname;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
