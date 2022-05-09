import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    @Test
    void myFiestTest() {
        assertEquals(2, 1 + 1);
    }

    @RepeatedTest(10)
    void repeatedTest() {
        assertEquals(2, 1+1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "orange"})
    void parameterizedTest(String fruit) {
        List<String> fruits = new ArrayList<String>(Arrays.asList("apple", "orange", "melon"));
        assertTrue(fruits.contains(fruit));
    }

    @Test
    void allTest() {
        assertAll(
                () -> { assertEquals(1, 1);},
                () -> { assertEquals(1, 1);}
        );
    }

    @Test
    public void testAssertions() {
        String str = new String("sage");
        String str1 = new String("sage");
        String str2 = null;
        String str3 = "sage";
        String str4 = "sage";

        int val = 5;
        int val1 = 6;
        String[] exceptedArray = { "one", "two", "three" };
        String[] resultArray = { "one", "two", "three" };

        assertEquals(str, str1);

        assertTrue(val < val1);

        assertFalse(val > val1);

        assertNotNull(str);

        assertNull(str2);

        assertSame(str3, str4);

        assertNotSame(str, str1);

        assertArrayEquals(exceptedArray, resultArray);
    }
}