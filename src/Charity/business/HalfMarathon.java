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
public class HalfMarathon extends CharityRun{
    
    Venue pt;
    int numWaterStation = 5;
    
    public HalfMarathon(String date, String startTime, Venue pt) {
        super(date, startTime);
        this.pt = pt;

    }

    public Venue getPt() {
        return this.pt;
    }

    public int getNumWaterStation() {
        return this.numWaterStation;
    }

    public void setNumWaterStation(int numWaterStation) {
        this.numWaterStation = numWaterStation;
    }
    
    
    
}
