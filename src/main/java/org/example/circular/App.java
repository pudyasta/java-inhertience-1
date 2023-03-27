package org.example.circular;

public class App {
    public static void main(String[] args) {
        Cylinder ling1 = new Cylinder();
        Cylinder ling2 = new Cylinder(10);
        Cylinder ling3 = new Cylinder(10,5);

        System.out.println("Cylinder 1");
        System.out.println("Radius : "+ling1.getRadius());
        System.out.println("color : "+ling1.getColor());
        System.out.println("Height : "+ ling1.getHeight());
        System.out.println("Area : "+ling1.getArea());
        System.out.println("Volume : "+ling1.getVolume());
        ling1.setHeight(20);
        ling1.setColor("blue");
        ling1.setRadius(9);
        System.out.println("===========After set===========");
        System.out.println("Radius : "+ling1.getRadius());
        System.out.println("color : "+ling1.getColor());
        System.out.println("Height : "+ ling1.getHeight());
        System.out.println("Area : "+ling1.getArea());
        System.out.println("Volume : "+ling1.getVolume());
        System.out.println(ling1.toString()+"\n");

        System.out.println("Cylinder 2");
        System.out.println("Radius : "+ling2.getRadius());
        System.out.println("color : "+ling2.getColor());
        System.out.println("Height : "+ ling2.getHeight());
        System.out.println("Area : "+ling2.getArea());
        System.out.println("Volume : "+ling2.getVolume());
        ling2.setHeight(11);
        ling2.setColor("blue");
        ling2.setRadius(5);
        System.out.println("===========After set===========");
        System.out.println("Radius : "+ling2.getRadius());
        System.out.println("color : "+ling2.getColor());
        System.out.println("Height : "+ ling2.getHeight());
        System.out.println("Area : "+ling2.getArea());
        System.out.println("Volume : "+ling2.getVolume());
        System.out.println(ling2.toString()+"\n");

        System.out.println("Cylinder 3");
        System.out.println("Radius : "+ling3.getRadius());
        System.out.println("color : "+ling3.getColor());
        System.out.println("Height : "+ ling3.getHeight());
        System.out.println("Area : "+ling3.getArea());
        System.out.println("Volume : "+ling3.getVolume());
        ling3.setHeight(100);
        ling3.setColor("blue");
        ling3.setRadius(11);
        System.out.println("===========After set===========");
        System.out.println("Radius : "+ling3.getRadius());
        System.out.println("color : "+ling3.getColor());
        System.out.println("Height : "+ ling3.getHeight());
        System.out.println("Area : "+ling3.getArea());
        System.out.println("Volume : "+ling3.getVolume());
        System.out.println(ling3.toString()+"\n");

    }
}
