package baitap.lab8;

public class Bai4 {
    public static void main(String[] args) {
        XPoly objPoly = new XPoly();
        
        System.out.println("Sum: " + objPoly.sum(6,7,8,9));
        System.out.println("GTNN: " + objPoly.GTNN(3,6,2,8,5));
        System.out.println("GTLN: " + objPoly.GTLN(3,6,2,8,5));
        System.out.println("Capitalize: " + objPoly.ToUpperFirstChar("vIet naM vo diCh"));
    }
}
