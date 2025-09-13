package LW_1;

public class Q5 {
    private double radius;

    public Q5(double r){
        radius = r;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }

    public double computeCircumference(){
        return 2 * Math.PI * radius;
    }
}

class CircularRegion {

    public static double computeShadedArea(double ri, double ro) {
        Q5 inner = new Q5(ri);
        Q5 outer = new Q5(ro);
        return outer.computeArea() - inner.computeArea();
    }

    public static void displayResults(double ri, double ro) {
        Q5 inner = new Q5(ri);
        Q5 outer = new Q5(ro);

        System.out.println("Inner Circle Area = " + inner.computeArea());
        System.out.println("Outer Circle Area = " + outer.computeArea());
        System.out.println("Shaded Region Area = " + computeShadedArea(ri, ro));
        System.out.println("Inner Circle Circumference = " + inner.computeCircumference());
        System.out.println("Outer Circle Circumference = " + outer.computeCircumference());
    }

    public static void main(String[] args) {
        double ri = 8.0;
        double ro = 15.0;

        displayResults(ri, ro);
    }
}
