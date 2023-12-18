package ji;

public class SundaTiger {
    private static int nextTagNumber = 1;
    private int tagNumber;
    private int age;
    private double weight;
    private double length;
    private boolean hombre;
    private String nombre;

    public SundaTiger(int age, double weight, double length, String gender, String nombre) {
        tagNumber = nextTagNumber;
        nextTagNumber++;

        this.age = age;
        this.weight = weight;
        this.length = length;
        this.hombre = switch (gender) {
            case "Male" -> true;
            case "Female" -> false;
            default -> true;
        };
        
        this.nombre = nombre;
    }

    public int getTagNumber() {
        return tagNumber;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public String getGender() {
        return (hombre)? "Male" : "Female";
    }

    public String getNombre() {
        return nombre;
    }

    public void ageOneYear() {
        age++;
        weight += (age < 5)? (Math.random()*15 + 40) : (Math.random() * 10) + 60;
    	length += (Math.random() * 0.1);
    }

    public String toString() {
	    return "Tag Number: " + tagNumber + "\nName: " + nombre + "\nAge: " + age + "\nGender: " + getGender();
    }
}