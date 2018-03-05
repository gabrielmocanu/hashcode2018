
public class Ride {
    private Intersection startIntersection, finishIntersection;
    private int earliestStart, latestFinish;
    Ride() { }
    
    Ride(Intersection sI, Intersection fI, int eS, int lF) {
        this.startIntersection = sI;
        this.finishIntersection = fI;
        this.earliestStart = eS;
        this.latestFinish = lF;   
    }
    
    Intersection getstartIntersection() {
        return this.startIntersection;
    }
    
    Intersection getfinistIntersection() {
        return this.finishIntersection;
    }
    
    int getearliestStart() {
        return this.earliestStart;
    }
    
    int getlatestFinish() {
        return this.latestFinish;
    }
    
    boolean canRide(Car c) {
        //TODO
        return false;
    }
    

}
