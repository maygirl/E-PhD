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
public class ConferenceDAO {
    
    private ConferenceDAO() {
    }
    
    public static ConferenceDAO getInstance() {
        return ConferenceDAOHolder.INSTANCE;
    }
    
    private static class ConferenceDAOHolder {

        private static final ConferenceDAO INSTANCE = new ConferenceDAO();
    }
}
