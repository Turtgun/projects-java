package ji;

import static org.junit.Assert.*;
import org.junit.Test;

public class SundaTigerTest {
    
    @Test
    public void testGetTagNumber() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        assertEquals(1, tiger.getTagNumber());
        // Assuming nextTagNumber increments with each new instance of SundaTiger
        SundaTiger tiger2 = new SundaTiger(3, 120, 2.2, "Female", "Luna");
        assertEquals(2, tiger2.getTagNumber());
    }

    @Test
    public void testGetAge() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        assertEquals(5, tiger.getAge());
    }

    @Test
    public void testGetWeight() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        assertEquals(150, tiger.getWeight());
    }

    @Test
    public void testGetLength() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        assertEquals(2.5, tiger.getLength());
    }

    @Test
    public void testGetGender() {
        SundaTiger maleTiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        assertEquals("Male", maleTiger.getGender());

        SundaTiger femaleTiger = new SundaTiger(4, 130, 2.3, "Female", "Koko");
        assertEquals("Female", femaleTiger.getGender());
    }

    @Test
    public void testGetNombre() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        assertEquals("Tigger", tiger.getNombre());
    }

    @Test
    public void testAgeOneYear() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        int initialAge = tiger.getAge();
        double initialWeight = tiger.getWeight();
        double initialLength = tiger.getLength();

        tiger.ageOneYear();

        assertEquals(initialAge + 1, tiger.getAge());
        assertTrue(tiger.getWeight() >= initialWeight); // Weight should increase
        assertTrue(tiger.getLength() >= initialLength); // Length should increase
    }

    @Test
    public void testToString() {
        SundaTiger tiger = new SundaTiger(5, 150, 2.5, "Male", "Koko");
        String expectedString = "Tag Number: 1\nName: Tigger\nAge: 5\nGender: Male";
        assertEquals(expectedString, tiger.toString());
    }
}