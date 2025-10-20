public class Processor {

    String make;
    String name;
    int speed;

    Processor(String make, String name, int speed){ // Constructor to Complete
        this.make = make;
        this.name = name;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
