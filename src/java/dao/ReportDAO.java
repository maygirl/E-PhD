/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
    
    private static class ReportDAOHolder {

        private static final ReportDAO INSTANCE = new ReportDAO();
    }
}
