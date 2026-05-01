public class Circle {
    
    private double radius;

    //con
    public Circle(double radius){
        this.radius = radius;
    }
    //get
    public double getRadius(){
        return this.radius;

    }

    //func
    public double area(){
        return radius*radius*3.14;
    }

    public double circumference(){
        return 2*3.14*radius;
    }
}
