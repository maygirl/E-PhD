/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class PaymentProof {

    private Integer id;
    private int receiptNo;
    private String details;
    private String path;

    public PaymentProof() {
    }

    public PaymentProof(Integer id) {
        this.id = id;
    }

    public PaymentProof(Integer id, int receiptNo) {
        this.id = id;
        this.receiptNo = receiptNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PaymentProof(int receiptNo, String details, String path) {
        this.receiptNo = receiptNo;
        this.details = details;
        this.path = path;
    }

    public PaymentProof(Integer id, int receiptNo, String details, String path) {
        this.id = id;
        this.receiptNo = receiptNo;
        this.details = details;
        this.path = path;
    }
    
}
