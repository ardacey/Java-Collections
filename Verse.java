public class Verse {
    int id;
    String text;

    Verse(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return this.id + "\t" + this.text;
    }
}
