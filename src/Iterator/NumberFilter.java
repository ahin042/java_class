package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberFilter {
    private List<Integer> numbers = new ArrayList<>();

    public void add(int num) {
       numbers.add(num);
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 != 1) {
                result.add(n);
            }
        }
        return result;
    }
}