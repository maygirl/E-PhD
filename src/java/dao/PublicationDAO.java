/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import application.ConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Publication;

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
            String sql = "INSERT INTO publication (title, domain,student, path) VALUES('" + p.getTitle()+ "','" + p.getDomain()+ "','" + p.getStudent().getId()+ "','" + p.getPath()+ "');";
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
