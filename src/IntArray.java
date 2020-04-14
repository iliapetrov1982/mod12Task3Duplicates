import java.util.HashSet;
import java.util.Set;

public class IntArray {
    public boolean isContaintsDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        int setLength = set.size();
        for (int i : array) {
            set.add(i);
            if (setLength == set.size()) {
                return true;
            }
            setLength = set.size();
        }
        return false;
    }
}
