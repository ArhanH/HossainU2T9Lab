public class CircleRunner {
    public static void main(String [] args){
        Circle circle1 = new Circle(2);
        System.out.println(circle1.getInfo());
        circle1.setRadius(5);
        System.out.println(circle1.getInfo());
    }
}

