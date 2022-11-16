
package Charity.business;



public class Competitor {
    String name;
    int age;
    String events;
    Venues p;
    CharityRun fkm;
//    ArrayList<RunEntry> entry = new ArrayList();

    public Competitor(String name, int age, String events, Venues p, CharityRun fkm) {
        this.name = name;
        this.age = age;
        this.events = events;
        this.p = p;
        this.fkm=fkm;
    }

    public Venues getVenue() {
        return this.p;
    }

    public CharityRun getType() {
        return this.fkm;
    }

    

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    
    
    public String getEvents() {
        return this.events;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setevents(String events) {
        this.events = events;
    }
}
