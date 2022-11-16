/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charity.data;

import Charity.business.Competitor;
import Charity.business.FiveKmRun;
import Charity.business.HalfMarathon;
import Charity.business.Park;
import Charity.business.Venues;
import Charity.business.Town;
import Charity.business.RunEntry;
import java.util.ArrayList;
import Charity.business.numCompetitor;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hamza
 */
public class DAOImplementation implements DAO {
    ArrayList<Competitor> com;
    public ArrayList<FiveKmRun> getFiveKmRun() {
        ArrayList<FiveKmRun> five = new ArrayList();
        five.add(new FiveKmRun("27/08/2021", "5:00pm", new Park(Venues.PARK, 8)));
        five.add(new FiveKmRun("27/10/2021", "2:00pm", new Park(Venues.PARK, 10)));
        five.add(new FiveKmRun("27/11/2021", "9:00pm", new Park(Venues.PARK, 4)));
        five.add(new FiveKmRun("27/12/2021", "8:00pm", new Park(Venues.PARK, 12)));
        five.add(new FiveKmRun("27/09/2021", "1:00pm", new Park(Venues.PARK, 14)));
        return five;
    }

    public ArrayList<HalfMarathon> getHalfMarathon() {
        ArrayList<HalfMarathon> hm = new ArrayList();
        hm.add(new HalfMarathon("28/08/2021", "5:00pm", new Park(Venues.PARK, 1)));
        hm.add(new HalfMarathon("28/09/2021", "4:00pm", new Town(Venues.TOWN)));
        hm.add(new HalfMarathon("28/10/2021", "3:00pm", new Town(Venues.TOWN)));
        hm.add(new HalfMarathon("28/11/2021", "2:00pm", new Town(Venues.TOWN)));
        hm.add(new HalfMarathon("28/12/2021", "1:00pm", new Park(Venues.PARK, 5)));
        return hm;
    }

    public ArrayList<Competitor> getCompetitor() {

        com = new ArrayList();
        com.add(new Competitor("hamza", 19, "half marathon", Venues.TOWN, getHalfMarathon().get(0)));
        com.add(new Competitor("bob", 11, "half marathon", Venues.TOWN, getHalfMarathon().get(0)));
        com.add(new Competitor("peter", 11, "5km", Venues.PARK, getFiveKmRun().get(1)));
        com.add(new Competitor("hamza", 19, "half marathon", Venues.PARK, getHalfMarathon().get(0)));
        com.add(new Competitor("jon", 10, "5km", Venues.PARK, getFiveKmRun().get(2)));
        com.add(new Competitor("kate", 19, "half marathon", Venues.TOWN, getHalfMarathon().get(1)));
        com.add(new Competitor("killy", 19, "5km", Venues.PARK, getFiveKmRun().get(1)));
        com.add(new Competitor("hamza", 19, "5km", Venues.PARK, getFiveKmRun().get(0)));
        
        return com;
    }

    public ArrayList<RunEntry> getRunEntry() {

        ArrayList<RunEntry> run = new ArrayList();
        for (int i = 0; i < getCompetitors().size(); i++) {
            run.add(new RunEntry(getCompetitors().get(i)));
        }
        return run;
    }
    
    public ArrayList<Competitor> getCompetitors() {

        Set<String> s = new HashSet<>();
        for (int i = 0; i < com.size(); i++) {
            if (com.get(i).getAge() < 16 && com.get(i).getEvents().equals("half marathon")) {
                com.remove(i);
            }
            if (s.add(com.get(i).getName() + com.get(i).getAge() + com.get(i).getEvents()) == false) {
                com.remove(i);
            }
        }
        return com;
    }

    public ArrayList<numCompetitor> getnumCompetitor() {

        ArrayList<numCompetitor> entry = new ArrayList();
        for (int i = 0; i < getCompetitors().size(); i++) {
            entry.add(new numCompetitor(getRunEntry().get(i).getEventnumber(), getRunEntry().get(i).getCompetitors()));
        }
        return entry;
    }

}
