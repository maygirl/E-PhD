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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Publication;
import model.Student;

/**
 *
 * @author Mac
 */
public class PublicationDAO {
    
    private PublicationDAO() {
    }
    
    public static PublicationDAO getInstance() {
        return PublicationDAOHolder.INSTANCE;
    }

    public void saveToDb(Publication p) {
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "INSERT INTO publication (title, domain,student, path, date) VALUES('" + p.getTitle()+ "','" + p.getDomain()+ "','" + p.getStudent().getId()+ "','" + p.getPath()+ "', now());";
            instr.executeUpdate(sql);
            instr.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Publication> getUnlistedPublicationList(int userId){
        ArrayList<Publication> result = new ArrayList<>();
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "SELECT * FROM publication p WHERE p.student = '" + userId + "' AND p.report IS NULL AND p.thesis = '';";
            ResultSet rs = instr.executeQuery(sql);
            
            while (rs.next()) {
                Publication p = new Publication(rs.getInt("id"), rs.getString("title"), rs.getString("domain"), rs.getDate("date"), new Student(rs.getInt("student")), rs.getString("path"));
                result.add(p);
            }
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public void setReport(Publication p) {
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "UPDATE publication SET report = '" + p.getReport().getId()+ "' WHERE id = '"+ p.getId() +"';";
            System.out.println(sql);
            instr.executeUpdate(sql);
            instr.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static class PublicationDAOHolder {

        private static final PublicationDAO INSTANCE = new PublicationDAO();
    }
}
