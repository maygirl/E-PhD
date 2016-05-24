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
public class PaymentDAO {
    
    private PaymentDAO() {
    }
    
    public static PaymentDAO getInstance() {
        return PaymentDAOHolder.INSTANCE;
    }
    
    private static class PaymentDAOHolder {

        private static final PaymentDAO INSTANCE = new PaymentDAO();
    }
}
