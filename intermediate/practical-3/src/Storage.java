public class Storage {

    String make;
    String name;
    int storage;
    // fields to complete

    Storage(String make, String name, int storage){ // Constructor to Complete
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

    @Override
    public String toString() {
        return "Storage{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", storage=" + storage +
                '}';
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

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
