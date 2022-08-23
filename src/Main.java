import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println(sqrt().apply(16.0));
    }


    public  static UnaryOperator<Double> sqrt () {
        UnaryOperator<Double> s = x -> Math.sqrt(x) ;
        return s;
    }
}