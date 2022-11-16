# Charity-Running-Event

The charity organises several running events each year. There are two kinds of running event: fun runs which are over 5 km, and half-marathons. A 5 km fun
run takes place in a park whereas a half-marathon takes place at either a park or a town. A venue of either kind (park or town) may host many charity 
running events over the course of the year.
Each charity running event has a specified date and start time, with each event being on a different date. Several hundred competitors can enter for each 
event. Each competitor can enter multiple events per year but can only have a single entry per event. Each entry for an event is allocated an event number
which must be unique amongst all entries for that event. All competitors entering for a half-marathon must be 16 or over but there are no age restrictions 
on 5 km fun runs.

# Use Cases

- List Event Information. The user of the software system identifies a running event by selecting it from a list provided by the system. Once an event is 
selected, the system displays the name of the event’s venue, along with the current number of entries for that event. If the event is a half- marathon, 
the system also displays the number of water stations along the route of the race.
- List Venue Details. The user of the software system identifies a venue by selecting it from a list provided by the system. Once a venue is selected, the
system displays a list of the dates and start times of each running event taking place at that venue and, in the case of a park, the number of changing 
facilities available there. If there are no events taking place at the venue the system informs the administrator of this fact.
- Search Competitor’s Event Entries. The user of the software system identifies a competitor by entering a name, or partial name. For all competitors that
match, the system displays the competitor’s name and age. For each running event for which the competitor has an entry, the system displays the event date,
along with the event number the competitor has been allocated for that event. The system also states whether the event is a 5 km fun run or a half-marathon.

<p align="center"><img width="849" alt="Screenshot 2022-11-16 at 20 32 03" src="https://user-images.githubusercontent.com/93152488/202287983-28512760-baf9-4c23-92d3-69bbf316e11b.png"></p>
