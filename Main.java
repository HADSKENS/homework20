import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer a) {
                return a>0;
            }
        };
        System.out.println(predicate.test(2));
        Predicate<Integer> predicate1 = x -> x >0;
        System.out.println();
        System.out.println(predicate1.test(-2));
        System.out.println();
        Consumer<String> consumer= new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hi "+s);
            }
        };
        consumer.accept("Данил");
        Consumer<String> consumer1 = x -> System.out.println("Hi "+x);
        System.out.println();
        consumer1.accept("Данил");
        System.out.println();
        Function<Double,Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double a) {
                return a.longValue();
            }
        };
        System.out.println(function.apply(2.2));
        System.out.println();
        Function<Double, Long> function1 = x-> x.longValue();
        System.out.println(function1.apply(1.2));
        System.out.println();
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()*100);
            }
        };
        System.out.println(supplier.get());
        System.out.println();
        Supplier<Integer> supplier1= ()-> (int) (Math.random()*100);
        System.out.println(supplier1.get());
    }
}