public class RightTriangle{

    // instance variables
    double base;
    double height;

    // constructor
    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    // hypotnuse method
    public double hypotnuse(){
        double hyp = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return hyp;
    }
}
