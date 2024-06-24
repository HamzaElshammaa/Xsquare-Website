public class Busta {

    abstract class Shape {
        String color;

        abstract double area();

        public abstract String toString();

        public Shape(String color){
            this.color=color;
            System.out.println("Shape color constructed")
        }
    }

    class circle extends Shape {
        double radius;

        @Override
        double area() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'area'");
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'toString'");
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        return;
    }

}