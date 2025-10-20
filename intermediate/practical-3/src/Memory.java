public class Memory {

    String make;
    String name;
    int storage;
    //fields to complete

    Memory(String make, String name, int storage){ // Constructor to Complete
        this.make = make;
        this.name = name;
        this.storage = storage;
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

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", storage=" + storage +
                '}';
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
