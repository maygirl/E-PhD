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
public class CourseDAO {
    
    private CourseDAO() {
    }
    
    public static CourseDAO getInstance() {
        return CourseDAOHolder.INSTANCE;
    }
    
    private static class CourseDAOHolder {

        private static final CourseDAO INSTANCE = new CourseDAO();
    }
}
