/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charity.presentation;

import Charity.business.Coordinator;
import Charity.business.Park;
import Charity.business.RunEntry;
import Charity.business.Town;
import Charity.business.numCompetitor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hamza
 */
public class View {

    private Coordinator coord;

    public View(Coordinator c) {
        coord = c;
    }

    public void startUI() {
        coord.getCompetitor();
        coord.getCompetitors();
        Scanner scanner = new Scanner(System.in);

        Set<String> s = new HashSet<>();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                ISSUES");
        System.out.println("                         --------------------");
        for (int i = 0; i < coord.getCompetitor().size(); i++) {
            if (s.add(coord.getCompetitor().get(i).getName() + coord.getCompetitor().get(i).getAge() + coord.getCompetitor().get(i).getEvents()) == false) {
                System.out.println(" " + coord.getCompetitor().get(i).getName() + " has multiple entery for " + coord.getCompetitor().get(i).getEvents() + " event");
                System.out.println(" reduced " + coord.getCompetitor().get(i).getName() + " to 1 entry on the " + coord.getCompetitor().get(i).getEvents() + " event");
                System.out.println("-------------------------------------------------------------------------");
            }
            if (coord.getCompetitor().get(i).getAge() < 16 && coord.getCompetitor().get(i).getEvents().equals("half marathon")) {
                System.out.println(" " + coord.getCompetitor().get(i).getName() + " is too young to enter half marathon");
                System.out.println(" " + coord.getCompetitor().get(i).getName() + " removed from half marathon");
                System.out.println("-------------------------------------------------------------------------");
            }

        }

        for (int i = 0; i < coord.getCompetitors().size(); i++) {
            coord.getRunEntry().add(new RunEntry(coord.getCompetitors().get(i)));
            coord.getnumCompetitor().add(new numCompetitor(coord.getRunEntry().get(i).getEventnumber(), coord.getRunEntry().get(i).getCompetitors()));
        }

        int count = 0;
        int countt = 0;

        while (true) {
            System.out.println("|-------------------------------------------------------------------------|");
            System.out.println("|                           RUNNING EVENTS                                |");
            System.out.println("|                         --------------------                            |");
            System.out.println("|1) 5km                                                                   |");
            System.out.println("|2) half marathon                                                         |");
            System.out.println("|-------------------------------------------------------------------------|");
            System.out.println("|3) Search Competitor’s Event Entries.                                    |");
            System.out.println("|4) Quit System                                                           |");
            System.out.println("|-------------------------------------------------------------------------|");
            System.out.print(" select from above > ");

            String nq = scanner.next();
            switch (nq) {
                case "1":
                    count=0;
                    for (int i = 0; i < coord.getnumCompetitor().size(); i++) {
                        if (coord.getnumCompetitor().get(i).getNum() < 1000000) {
                            count++;
                        };
                    }

                    System.out.println("|-------------------------------|");
                    System.out.println("|      CHOOSE EVENT VENUE       |");
                    System.out.println("|-------------------------------|");
                    System.out.println("|            1)PARK             |");
                    System.out.print("|   NUMBER OF TOTAL ENTRIES: ");
                    System.out.println(count + "  |");
                    System.out.println("|-------------------------------|");

                    System.out.print(" select from above > ");
                    String choice = scanner.next();

                    if (choice.equals("1")) {
                        if (coord.getFiveKmRun().isEmpty()) {
                            System.out.println(" NO EVENTS TAKING PLACE");
                        }
                        System.out.println("|------------------------------------------------|");
                        for (int i = 0; i < coord.getFiveKmRun().size(); i++) {
                            System.out.println(" Number of changing facilities in the event: " + coord.getFiveKmRun().get(i).getPark().getNumChangingFacilitise());
                            System.out.println(" Event: " + coord.getFiveKmRun().get(i).getPark().getName());
                            System.out.println(" Date: " + coord.getFiveKmRun().get(i).getDate());
                            System.out.println(" Time: " + coord.getFiveKmRun().get(i).getStartTime());
                            System.out.println("|------------------------------------------------|");

//                            }
                        }

//                        }
                        System.out.println();
                    } else {
                        System.out.println("-----------------------------------");
                        System.out.println("choose from above menu.");
                    }
//                    return;
                    continue;
                case "2":
                    countt = 0;
                    for (int i = 0; i < coord.getnumCompetitor().size(); i++) {
                        if (coord.getnumCompetitor().get(i).getNum() > 1000000) {
                            countt++;
                        };
                    }

                    System.out.println("|-------------------------------|");
                    System.out.println("|      CHOOSE EVENT VENUE       |");
                    System.out.println("|-------------------------------|");
                    System.out.println("|            1)PARK             |");
                    System.out.println("|            2)TOWN             |");
                    System.out.println("|-------------------------------|");
                    System.out.print("|   NUMBER OF TOTAL ENTRIES: ");

                    System.out.println(countt + "  |");
                    System.out.print("|   NUMBER OF WATER STATION: ");
                    System.out.println("5  |");
                    System.out.println("|-------------------------------|");
                    System.out.print(" select from above > ");
                    String choice2 = scanner.next();

                    if (choice2.equals("1")) {
                        int Parkhere = 0;
                        for (int i = 0; i < coord.getHalfMarathon().size(); i++) {
                            if (coord.getHalfMarathon().get(i).getPt().getName().toString() == "PARK") {
                                Parkhere++;
                            }
                        }
                        if (Parkhere == 0) {
                            System.out.println("|------------------------------------------------|");
                            System.out.println(" NO EVENTS TAKING PLACE");
                        }
                        System.out.println("|------------------------------------------------|");
                        for (int i = 0; i < coord.getHalfMarathon().size(); i++) {
                            if (coord.getHalfMarathon().get(i).getPt() instanceof Park) {
                                Park p = (Park) coord.getHalfMarathon().get(i).getPt();
                                System.out.println(" Number of changing facilities in the event " + p.getNumChangingFacilitise());
                                System.out.println(" Event: " + coord.getHalfMarathon().get(i).getPt().getName());
                                System.out.println(" Date: " + coord.getHalfMarathon().get(i).getDate());
                                System.out.println(" Time: " + coord.getHalfMarathon().get(i).getStartTime());
                                System.out.println("|------------------------------------------------|");
                            }
                        }

                        System.out.println();
                    } else if (choice2.equals("2")) {
                        int Townhere = 0;
                        for (int i = 0; i < coord.getHalfMarathon().size(); i++) {
                            if (coord.getHalfMarathon().get(i).getPt().getName().toString() == "TOWN") {
                                Townhere++;
                            }
                        }
                        if (Townhere == 0) {
                            System.out.println("|------------------------------------------------|");
                            System.out.println(" NO EVENTS TAKING PLACE");
                        }
                        System.out.println("|------------------------------------------------|");
                        for (int i = 0; i < coord.getHalfMarathon().size(); i++) {
                            if (coord.getHalfMarathon().get(i).getPt() instanceof Town) {
                                System.out.println(" Event: " + coord.getHalfMarathon().get(i).getPt().getName());
                                System.out.println(" Date: " + coord.getHalfMarathon().get(i).getDate());
                                System.out.println(" Time: " + coord.getHalfMarathon().get(i).getStartTime());
                                System.out.println("|------------------------------------------------|");
                            }
                        }
                    } else {
                        System.out.println("-----------------------------------");
                    }
//                    return;
                    continue;
                case "3":
                    System.out.println("Enter name >");
                    String nam = scanner.next();
                    String ms = nam.toLowerCase();
                    boolean enter = false;

                    for (int i = 0; i < coord.getCompetitors().size(); i++) {
                        if (coord.getCompetitors().get(i).getName().toLowerCase().contains(ms)) {
                            System.out.println("----------------------------");
                            System.out.println("Name: " + coord.getCompetitors().get(i).getName());
                            System.out.println("Age: " + coord.getCompetitors().get(i).getAge());
                            System.out.println("Event: " + coord.getCompetitors().get(i).getEvents());
                            System.out.println("Event Venue: " + coord.getCompetitors().get(i).getVenue());
                            System.out.println("Event Date: " + coord.getCompetitors().get(i).getType().getDate());
                            System.out.println("Event Start Time: " + coord.getCompetitors().get(i).getType().getStartTime());
                            System.out.println("Competitor Number: " + coord.getnumCompetitor().get(i).getNum());
                            enter = true;
                        }
                    }
                    if (enter == false) {
                        System.out.println("----------------------------");
                        System.out.println("Competitor did not enter any events.");
                    }
//                    return;
                    continue;
                case "4":
                    return;
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("Please enter input from menu");
                    System.out.println("");

            }
        }
    }

}
