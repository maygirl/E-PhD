/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Mac
 */
public class ConnectionPool {
    DataSource ds;
    Context ctx;
    
    private ConnectionPool() {
        try {
            ctx = new InitialContext();
            ds = (DataSource)ctx.lookup("myDatasourceTravelPhd");
        } catch (NamingException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ConnectionPool getInstance() {
        return ConnectionPoolHolder.INSTANCE;
    }
    
    private static class ConnectionPoolHolder {

        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }
    
    public Connection getConnection(){
        Connection con = null;
        try {
            con = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
