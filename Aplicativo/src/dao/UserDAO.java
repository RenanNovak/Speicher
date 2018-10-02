package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import entity.User;

public class UserDAO {


    public void insert(User user) {
        try {

            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("insert into user(nameuser,passworduser,emailuser) values(?, ?,?) ");
            p.setString(1, user.getNameuser());
            p.setString(2, user.getPassworduser());
            p.setString(3, user.getEmailuser());
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User getUserByAuthentication(User user) {
        try {

            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("select * from user where (nameuser = ? or emailuser = ?) and  passworduser = ?");
            p.setString(1, user.getNameuser());
            p.setString(2, user.getEmailuser());
            p.setString(3, user.getPassworduser());

            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                user  = new User();
                user.setNameuser(rs.getString("nameuser"));
                user.setEmailuser(rs.getString("emailuser"));
                user.setPassworduser(rs.getString("passworduser"));
                user.setIduser(rs.getLong("iduser"));
                return user;
            }
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

