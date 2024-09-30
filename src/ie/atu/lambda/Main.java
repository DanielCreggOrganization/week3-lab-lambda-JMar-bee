package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new Addition();
        //StringOperation ToUpper = new ToUpperCase();
            StringOperation ToUpper = s-> s.toUpperCase();

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println(ToUpper.apply("Jenny"));
    }
}