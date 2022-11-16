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
public class Park extends Venue {
    int numChangingFacilitise = 5;
    
    public Park(Venues name, int numChangingFacilitise) {
        super(name);
        this.numChangingFacilitise=numChangingFacilitise;
    }

    public int getNumChangingFacilitise() {
        return this.numChangingFacilitise;
    }

    public void setNumChangingFacilitise(int numChangingFacilitise) {
        this.numChangingFacilitise = numChangingFacilitise;
    }
    
        public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.name);

        return sb.toString();
    }
    
}
