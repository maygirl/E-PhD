/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Comment{

    private Integer id;
    private String content;
    private Publication thesis;

    public Comment() {
    }

    public Comment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Publication getThesis() {
        return thesis;
    }

    public void setThesis(Publication thesis) {
        this.thesis = thesis;
    }

    public Comment(String content, Publication thesis) {
        this.content = content;
        this.thesis = thesis;
    }

    public Comment(Integer id, String content, Publication thesis) {
        this.id = id;
        this.content = content;
        this.thesis = thesis;
    }

}
