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
import model.Report;
import model.Student;

/**
 *
 * @author Mac
 */
public class ReportDAO {
    
    private ReportDAO() {
    }
    
    public static ReportDAO getInstance() {
        return ReportDAOHolder.INSTANCE;
    }

    public void saveToDb(Report report) {
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "INSERT INTO report (student,content, date) VALUES('" + report.getStudent().getId()+ "','" + report.getContent()+ "', now());";
            instr.executeUpdate(sql);
            instr.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public int getLastReportId(int studentId){
        int id = 0;
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "SELECT id FROM report r WHERE r.student = '" + studentId + "' ORDER BY date DESC LIMIT 1";
            ResultSet rs = instr.executeQuery(sql);
            rs.next();
            id = rs.getInt("id");
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public ArrayList<Report> getReportsByCoordinator(int coordinatorId) {
        ArrayList<Report> result = new ArrayList<>();
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "SELECT r.* FROM report r INNER JOIN student s ON s.id = r.student WHERE s.coordinator = '" + coordinatorId + "' AND validated = '0';";
            ResultSet rs = instr.executeQuery(sql);
            
            while (rs.next()) {
                Report r = new Report(rs.getInt("id"), new Student(rs.getInt("student")),false, rs.getDate("date"), rs.getString("content"));
                result.add(r);
            }
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;    }

    public Report loadReportById(int reportId) {
        Report result = new Report();
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "SELECT r.* FROM report r WHERE r.id = '" + reportId + "';";
            ResultSet rs = instr.executeQuery(sql);
            rs.next();
            result = new Report(rs.getInt("id"), new Student(rs.getInt("student")),false, rs.getDate("date"), rs.getString("content"));
            
            rs.close();
            instr.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return result;
    }

    public void validateReport(int reportId) {
        try {
            Connection con = ConnectionPool.getInstance().getConnection();
            Statement instr = con.createStatement();
            String sql = "UPDATE report SET validated = '1' WHERE id = '"+ reportId +"';";
            System.out.println(sql);
            instr.executeUpdate(sql);
            instr.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Publication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static class ReportDAOHolder {

        private static final ReportDAO INSTANCE = new ReportDAO();
    }
}
