package org.example.shapes;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super.setWidth(side);
    }

    public Square(String color, boolean filled,  double side) {
        super.setColor(color);
        super.setFilled(filled);
        super.setWidth(side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
    }

//    Method getArea() dan getPerimeter perlu di override karena
//    attribut yang digunakan untuk side hanya width,
//    sehingga harus ada penanganan logic karena perbedaan skema antara 2 object Rectangle dan Square

    @Override
    public double getArea() {
        return Math.pow(super.getWidth(),2);
    }

    @Override
    public double getPerimeter() {
        return super.getWidth()*4;
    }
}
