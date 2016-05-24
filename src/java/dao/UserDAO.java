/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import application.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.*;
import java.math.*;
import model.Person;
import model.Professor;
import model.Student;

/**
 *
 * @author Mac
 */
public class UserDAO {
   

    private UserDAO() {

    }
    
    public static UserDAO getInstance() {
        return UserDAOHolder.INSTANCE;
    }
    
    private static class UserDAOHolder {

        private static final UserDAO INSTANCE = new UserDAO();
    }
    
    // make this private and in the same package as User?
    public boolean userExists(String username){
        boolean resp = false;
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "SELECT * FROM person u where u.username='"+username+"'";
            ResultSet rs = instr.executeQuery(sql);
            resp = rs.next();
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;

    }
    
    public int getIdFromDb(Person p){
        int i = 0;
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "SELECT u.id FROM person u where u.username='"+p.getUsername()+"'";
            ResultSet rs = instr.executeQuery(sql);
            rs.next();
            i = rs.getInt("id");
            
            rs.close();
            instr.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public boolean passwordMatch(Student p) {
        boolean resp = false;
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String pass = "";
            MessageDigest m;
            try {
                m = MessageDigest.getInstance("MD5");
                m.update(p.getPassword().getBytes(),0,p.getPassword().length());
                pass = new BigInteger(1,m.digest()).toString(16);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "SELECT p.id FROM person p INNER JOIN student s ON p.id = s.id WHERE p.username='"+p.getUsername()+"' AND p.password='"+pass+"';";
            System.out.println(sql);
            ResultSet rs = instr.executeQuery(sql);
            resp = rs.next();
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }
    
    public boolean passwordMatch(Professor p) {
        boolean resp = false;
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String pass = "";
            MessageDigest m;
            try {
                m = MessageDigest.getInstance("MD5");
                m.update(p.getPassword().getBytes(),0,p.getPassword().length());
                pass = new BigInteger(1,m.digest()).toString(16);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "SELECT p.id FROM person p INNER JOIN proffesor prof ON p.id = prof.id WHERE p.username='"+p.getUsername()+"' AND p.password='"+pass+"';";
            ResultSet rs = instr.executeQuery(sql);
            resp = rs.next();
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }
    
}
