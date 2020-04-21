import java.util.HashSet;
import java.util.Set;

public class IntArray {
    public boolean isContainsDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
