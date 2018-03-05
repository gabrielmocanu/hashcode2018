import java.util.LinkedList;
public class Intersection {
    public int coordX;
    public int coordY;

    LinkedList<Car>cars;

    Intersection() {
        this.coordX = 0;
        this.coordY = 0;
        this.cars = new LinkedList();
    }

    Intersection(int x, int y) {
        this.coordX = x;
        this.coordY = y;
        this.cars = new LinkedList();
    }


    Intersection(int x, int y, LinkedList<Car>newCarsList) {
        this.coordX = x;
        this.coordY = y;
        this.cars = newCarsList;
    }

    public int getX() {
        return this.coordX;
    }

    public int getY() {
        return this.coordY;
    }

    public LinkedList<Car>getCars() {
        return this.cars;
    }

    public void setX(int newX) {
        this.coordX = newX;
    }

    public void setY(int newY) {
        this.coordY = newY;
    }

    public void setCars(LinkedList<Car>newCars) {
        this.cars = newCars;
    }
}
