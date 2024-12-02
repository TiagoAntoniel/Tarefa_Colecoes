package sexoENome;

import java.util.Comparator;

public class ComparaSexoNomeESexo implements Comparator<Pessoas> {

    @Override
    public int compare(Pessoas o1, Pessoas o2) {
        return o1.getSexo().compareTo(o2.getSexo());
    }
}
