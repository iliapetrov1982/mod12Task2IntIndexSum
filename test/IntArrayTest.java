import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class IntArrayTest {
    IntArray intArray;

    @Before
    public void setUp() throws Exception {
        intArray = new IntArray();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSumElemenr23() {
        Set<Integer> validationSet = new HashSet<>();
        validationSet.add(1);
        validationSet.add(2);
        int[] incomeList = {17, 15, 8, 4};
        int number = 23;
        Set<Integer> resultSet = new HashSet<>(intArray.sumElement(incomeList, number));
        assertTrue(validationSet.containsAll(resultSet));
        assertTrue(resultSet.containsAll(validationSet));
    }

    @Test
    public void testSumElemenr12() {
        Set<Integer> validationSet = new HashSet<>();
        validationSet.add(2);
        validationSet.add(3);
        int[] incomeList = {17, 15, 8, 4};
        int number = 12;
        Set<Integer> resultSet = new HashSet<>(intArray.sumElement(incomeList, number));
        assertTrue(validationSet.containsAll(resultSet));
        assertTrue(resultSet.containsAll(validationSet));
    }

    @Test
    public void testSumElemenr32() {
        Set<Integer> validationSet = new HashSet<>();
        validationSet.add(0);
        validationSet.add(1);
        int[] incomeList = {17, 15, 8, 4};
        int number = 32;
        Set<Integer> resultSet = new HashSet<>(intArray.sumElement(incomeList, number));
        assertTrue(validationSet.containsAll(resultSet));
        assertTrue(resultSet.containsAll(validationSet));
    }
}