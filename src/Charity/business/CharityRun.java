/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charity.business;

/**
 *
 * @author hamza
 */
public abstract class CharityRun {
    
    String date;
    String startTime;
    
//    ArrayList<RunEntry> entry = new ArrayList();

    public CharityRun(String date, String startTime) {
        this.date = date;
        this.startTime = startTime;
    }
    
    

    public String getDate() {
        return this.date;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    
}