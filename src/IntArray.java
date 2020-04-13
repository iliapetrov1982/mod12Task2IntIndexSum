import java.util.*;

public class IntArray {
    ArrayList<Integer> sumElement(int[] array, int number) {
        Map<Integer, Integer> incomeMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            incomeMap.put(array[i], i);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int element : array) {
            if (element == number) {
                resultList.add(incomeMap.get(element));
                break;
            } else if (incomeMap.containsKey(number - element)) {
                resultList.add(incomeMap.get(element));
                resultList.add(incomeMap.get(number - element));
                break;
            }
        }
        return resultList;
    }
}
