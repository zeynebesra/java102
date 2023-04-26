package com.patikadev.Model;
import com.patikadev.Helper.DBConnector;
import com.patikadev.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name, uname, pass, type;

    public User() {
    }

    public User(int id, String name, String uname, String pass, String type) {
        this.id = id;
        this.name = name;
        this.uname = uname;
        this.pass = pass;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList(){
        ArrayList<User> userList = new ArrayList<>();

        String query = "SELECT * From user ";
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) { //iterator mantığı
                obj= new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
                userList.add(obj);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }


    //ekleme gerçekleşip gerçekleşmemesi olayı için boolean döndürecek.
    public static boolean add(String name, String uname, String pass, String type)
    {
        User findUser = User.getFetch(uname);
        String query = "INSERT INTO user (name,uname,pass,type) VALUES (?,?,?,?)";

        //farlı kullanıcı adı alımı uyarı !

        if (findUser != null) {
            Helper.showMessage("Kullanıcı adı sistemde kayıtlı.");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, uname);
            pr.setString(3, pass);
            pr.setString(4, type);
            return pr.executeUpdate() != -1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }

    // name kontrol
    public static User getFetch(String uname){
        User obj = null;
        String query = "SELECT * FROM user WHERE uname = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, uname);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type")); }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }

    public static User getFetch(int id){
        User obj = null;
        String query = "SELECT * FROM user WHERE id = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return obj;
    }

    public static User getFetch(String uname,String pass){
        User obj = null;
        String query = "SELECT * FROM user WHERE uname = ? AND pass = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,uname);
            pr.setString(2,pass);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUname(rs.getString("uname"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return obj;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM user WHERE id = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);

            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return true;
    }

    public static boolean update(int id, String name,String uname,String pass, String type)
    {
        User findUser = User.getFetch(uname);
        String query = "UPDATE  user SET name = ?,uname = ?,pass = ?,type =? WHERE id = ?";
        if (findUser!=null && findUser.getId() != id){
            Helper.showMessage("Kullanıcı adı sistemde kayıtlı.");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,uname);
            pr.setString(3,pass);
            pr.setString(4,type);
            pr.setInt(5,id);

            return pr.executeUpdate() != -1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }





}
