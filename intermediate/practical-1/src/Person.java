import java.util.Scanner;

public class Person {
    private String name;

    private Double height = 0.0;
    private Double weight = 0.0;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if(height <= 0.0) {
            throw new RuntimeException("Height cannot be negative");
        }
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if(weight <= 0.0) {
            throw new RuntimeException("Weight cannot be negative");
        }
        this.weight = weight;
    }

    public String format(){
        return String.format( "Name:%s,Height:%.2fm,Weight:%.2fkg", name,height,weight);
    }

    public void display(){
        System.out.println( format() );
    }

    public double getBmi(){
        return weight / (height*height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void convertInches(Double inches) {
        if(inches <= 0.0) {
            throw new RuntimeException("Inches cannot be negative");
        }
        this.height = inches * 2.54;
    }

    public void bmiStatus(Double bmi) {
        if(bmi <-18.5){
            System.out.println("underweight");
        }else if(bmi > 18.5 && bmi <=25) {
            System.out.println("normal");
        }else {
            System.out.println("overweight");
        }
    }

    public void convertStones(Double stones) {
        if(stones <= 0.0) {
            throw new RuntimeException("Inches cannot be negative");
        }
        this.weight = stones * 6.35029;
    }

    public static void main(String[] args){
        Person p = new Person();
        p.setName("Harry Potter");
        p.convertInches(0.7);
        p.convertStones(11.5);
        // call the display function here
        p.display();
        p.getBmi();
    }
}
