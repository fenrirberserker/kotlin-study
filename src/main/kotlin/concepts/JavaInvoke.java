package concepts;

public class JavaInvoke {

    public static void main(String[] args) {
        int result = KotlinFunctions.max(5,3);
        System.out.println(result);
        KotlinFunctions.log("Hello world ");
        KotlinFunctions.log("Hello world ",2);
    }
}
