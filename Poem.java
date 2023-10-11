import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Poem {
    public static void PoemSorter(String input) throws FileNotFoundException {
        ArrayList<Verse> versesList = new ArrayList<Verse>();
        HashSet<Verse> versesSet = new HashSet<Verse>();
        TreeSet<Verse> versesTreeSet = new TreeSet<Verse>(new idComparator());
        HashMap<Integer, String> versesMap = new HashMap<Integer, String>();
        String[] poem = Io.readFile(input);
        for (String text : poem){
            String[] verse_parts = text.split("\t");
            int id = Integer.parseInt(verse_parts[0]);
            String line = verse_parts[1];
            Verse verse = new Verse(id, line);
            versesList.add(verse);
            versesSet.add(verse);
            versesTreeSet.add(verse);
            versesMap.put(id, line);
        }

        PrintWriter out1 = new PrintWriter("poemArrayList.txt");
        for (Verse verse : versesList) {
            out1.println(verse);
        }
        out1.close();

        Collections.sort(versesList, new idComparator());
        PrintWriter out2 = new PrintWriter("poemArrayListOrderByID.txt");
        for (Verse verse : versesList) {
            out2.println(verse);
        }
        out2.close();

        PrintWriter out3 = new PrintWriter("poemHashSet.txt");
        for (Verse verse : versesSet) {
            out3.println(verse);
        }
        out3.close();

        PrintWriter out4 = new PrintWriter("poemTreeSet.txt");
        for (Verse verse : versesTreeSet) {
            out4.println(verse);
        }
        out4.close();

        PrintWriter out5 = new PrintWriter("poemTreeSetOrderByID.txt");
        for (Verse verse : versesTreeSet) {
            out5.println(verse);
        }
        out5.close();

        PrintWriter out6 = new PrintWriter("poemHashMap.txt");
        for (Integer id : versesMap.keySet()) {
            String text = versesMap.get(id);
            out6.println(id + "\t" + text);
        }
        out6.close();
    }
}
