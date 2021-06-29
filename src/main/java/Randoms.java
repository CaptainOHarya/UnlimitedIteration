import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Randoms implements Iterable<Integer> {

    List<Integer> randoms = new ArrayList<>();

    public Randoms addRandoms(int max, int min) {
        while (true) {
            int r = (int) ((Math.random() * ((max - min) + 1)) + min);
            randoms.add(r);
            if (r == 100) {
                break;
            }
        }
        return this;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = 1;

            @Override
            public boolean hasNext() {
                if (next < randoms.size()) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (next < randoms.size()) {
                    Integer rand = randoms.get(next);
                    next++;
                    return rand;
                }
                return null;
            }
        };
    }
}
