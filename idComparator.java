import java.util.Comparator;

public class idComparator implements Comparator<Verse> {
    public int compare(Verse v1, Verse v2) {
        return v1.id - v2.id;
    }
}