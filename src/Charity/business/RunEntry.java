/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charity.business;

import java.util.Random;

/**
 *
 * @author hamza
 */
public class RunEntry {

    int eventnumber;
    Competitor competitors;
//    ArrayList<String> entry = new ArrayList();

    public RunEntry(Competitor competitors) {
        this.competitors = competitors;
        this.eventnumber = setEventnumber(competitors);
//        entry.add(new numCompetitor(this.eventnumber,this.competitors));
    }

    public Competitor getCompetitors() {
        return this.competitors;
    }

//    public ArrayList<numCompetitor> getEntry() {
//        return this.entry;
//    }
    public int getEventnumber() {
        return this.eventnumber;
    }

    public int setEventnumber(Competitor competitors) {

        Random random = new Random();

        if (competitors.events.equals("5km")) {
            this.eventnumber = random.nextInt(1000000 - 1 + 1) + 1;
        } else if (competitors.events.equals("half marathon")) {
            this.eventnumber = random.nextInt(2000000 - 1000000 + 1) + 1000000;
        }

        return this.eventnumber;
    }

}
