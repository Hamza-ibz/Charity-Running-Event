
package Charity.data;

import Charity.business.FiveKmRun;
import Charity.business.HalfMarathon;
import Charity.business.Competitor;
import Charity.business.RunEntry;
import Charity.business.numCompetitor;
import java.util.ArrayList;


public interface DAO {
    
public ArrayList<FiveKmRun> getFiveKmRun();
public ArrayList<HalfMarathon> getHalfMarathon();
public ArrayList<Competitor> getCompetitor();
public ArrayList<RunEntry> getRunEntry();
public ArrayList<numCompetitor> getnumCompetitor();
public ArrayList<Competitor> getCompetitors();

}
