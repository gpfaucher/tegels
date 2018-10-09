import tegels.Tegel;
public class Tegels {
    public static void main(String[] args) {
        Tegel tegel;
        tegel = new Tegel(11, "00", "..");
        tegel.toonErnaast(tegel);
        tegel.toonErnaast(tegel);
    }
}
