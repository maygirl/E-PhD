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
public class CommentDAO {
    
    private CommentDAO() {
    }
    
    public static CommentDAO getInstance() {
        return CommentDAOHolder.INSTANCE;
    }
    
    private static class CommentDAOHolder {

        private static final CommentDAO INSTANCE = new CommentDAO();
    }
}
