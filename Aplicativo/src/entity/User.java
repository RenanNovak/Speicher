package entity;

public class User {

    private long iduser;
    private String nameuser;
    private String emailuser;
    private String passworduser;


    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getPassworduser() {
        return passworduser;
    }

    public void setPassworduser (String passworduser) {
        this.passworduser = passworduser;
    }

    public String getEmailuser () {
        return emailuser;
    }

    public void setEmailuser(String emailuser) {
        this.emailuser = emailuser;
    }

}