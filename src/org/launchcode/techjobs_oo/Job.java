package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null)
            return "OOPS! This job does not seem to exist.";
        if (name == "") {
            return "\n" +
                    "ID:" + id +"\n"+
            "Name:" + "Data not available" +"\n" +
                    "Employer:" + employer +"\n" +
                    "Location:" + location +"\n" +
                    "PositionType:" + positionType +"\n" +
                    "CoreCompetency:" + coreCompetency  +
                    "\n";
        }
        if (employer.getValue() == "") {
            return "\n" +
                    "ID:" + id +"\n" +
                    "Name:" + name +"\n" +
                    "Employer:" + "Data not available" +"\n" +
                    "Location:" + location +"\n" +
                    "PositionType:" + positionType +"\n" +
                    "CoreCompetency:" + coreCompetency +
                    "\n";
        }
        if (location.getValue() == "") {
            return "\n" +
                    "ID:" + id +"\n" +
                    "Name:" + name +"\n" +
                    "Employer:" + employer +"\n" +
                    "Location:" + "Data not available" +"\n" +
                    "PositionType:" + positionType +"\n" +
                    "CoreCompetency:" + coreCompetency +
                    "\n";
        }

        if (positionType.getValue() == "") {
            return "\n" +
                    "ID:" + id +"\n" +
                    "Name:" + name +"\n" +
                    "Employer:" + employer +"\n" +
                    "Location:" + location +"\n" +
                    "PositionType:" + "Data not available" +"\n" +
                    "CoreCompetency:" + coreCompetency +
                    "\n";
        }
        if (coreCompetency.getValue() == "") {
            return "\n" +
                    "ID:" + id +"\n" +
                    "Name:" + name +"\n" +
                    "Employer:" + employer +"\n" +
                    "Location:" + location +"\n" +
                    "PositionType:" + positionType +"\n"  +
                    "CoreCompetency:" + "Data not available"+
                    "\n";
        }
        else{
            return "\n" +
                    "ID:" + id +"\n" +
                    "Name:" + name +"\n" +
                    "Employer:" + employer +"\n" +
                    "Location:" + location +"\n" +
                    "PositionType:" + positionType +"\n" +
                    "CoreCompetency:" + coreCompetency +
                    "\n";

        }
    }
}







    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


