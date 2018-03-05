public class Car {

    public Intersection intersection;
    public int currentStep;
    public boolean isFree;
    public Ride currentRide;

    Car() {
        isFree = true;
        currentStep = 0;
    }

    Car(Intersection intersection) {
        isFree = true;
        currentStep = 0;
        this.intersection = intersection;
    }

    Car(Ride currentRide) {
        isFree = true;
        currentStep = 0;
        this.currentRide = currentRide;
    }

    public Intersection getIntersection() {
        return this.intersection;
    }

    public int getCurrentStep() {
        return this.currentStep;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public Ride getRide() {
        return this.currentRide;
    }

    public void setIntersection(Intersection newIntersection) {
        this.intersection = newIntersection;
    }

    public void setCurrentStep(int newCurrentStep) {
        this.currentStep = newCurrentStep;
    }

    public void setFree() {
        this.isFree = true;
    }
    public void setBusy() {
        this.isFree = false;
    }

    public void getIsFree() {
        return this.isFree();
    }
}
