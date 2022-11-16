/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charity.business;

import Charity.data.DAO;
import Charity.data.DAOImplementation;
import java.util.ArrayList;

/**
 *
 * @author hamza
 */
public class Coordinator {
    
    private DAO dao;

    public Coordinator() {
         dao = new DAOImplementation();
    }
    
    public ArrayList<FiveKmRun> getFiveKmRun(){
    return dao.getFiveKmRun();
    }
    
    public ArrayList<HalfMarathon> getHalfMarathon(){
    return dao.getHalfMarathon();
    }
    
    public ArrayList<Competitor> getCompetitor(){
    return dao.getCompetitor();
    }
    
        public ArrayList<Competitor> getCompetitors(){
    return dao.getCompetitors();
    }
        
        public ArrayList<RunEntry> getRunEntry(){
        return dao.getRunEntry();
        }
        
        public ArrayList<numCompetitor> getnumCompetitor(){
        return dao.getnumCompetitor();
        }
    
        
}
