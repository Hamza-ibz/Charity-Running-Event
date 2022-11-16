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
public class FiveKmRun extends CharityRun{
    
    Park park;
    
    public FiveKmRun(String date, String startTime, Park park) {
        super(date, startTime);
        this.park=park;
    }

    public String getDate() {
        return this.date;
    }

    public Park getPark() {
        return this.park;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    
    
    
}
