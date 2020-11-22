package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    private LeapYear ly = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1996, 2108, 2104 })
    void TestingLeapYears(int x){
        assertTrue(ly.isLeap(x));
    }

    @ParameterizedTest
    @ValueSource( ints = {100, 2100, 2001})
    void TestingNotLeapYears(int x){
        assertFalse(ly.isLeap(x));
    }
}
