package baitap.lab8;

public final class XPoly {
    
    public static final double sum(double...a) {
        double s = 0;
        for(double x : a) {
            s += x;
        }
        return s;
    }
    
    public static final double GTLN(double...a) {
        double max = a[0];
        for(double x : a) {
            max = Math.max(max, x);
        }
        return max;
    }
    
    public static final double GTNN(double...a) {
        double min = a[0];
        for(double x : a) {
            min = Math.min(min, x);
        }
        return min;
    }
    
    public static final String ToUpperFirstChar(String s) {
        String[] words = s.toLowerCase().split(" ");
        String sFinal = "";
        for(String temp : words)
        {
             sFinal += Character.toUpperCase(temp.charAt(0)) + temp.substring(1) + " ";
        }
        return sFinal.trim();
    }
}
