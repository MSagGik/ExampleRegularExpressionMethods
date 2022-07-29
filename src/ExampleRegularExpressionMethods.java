import java.util.Arrays;

public class ExampleRegularExpressionMethods {
    public static void main(String[] args) {
        // разделение строки на массив слов
        String a = "Hello there hey";
        String[] wordsA = a.split(" ");
        System.out.println(Arrays.toString(wordsA)); // [Hello, there, hey]


        String b = "Hello.there.hey";
        String[] wordsB = b.split("\\.");
        System.out.println(Arrays.toString(wordsB)); // [Hello, there, hey]

        String c = "Hello12345there6789hey";
        String[] wordsC = c.split("\\d+");
        System.out.println(Arrays.toString(wordsC)); // [Hello, there, hey]

        // замена символов в строке
        String d = "Hello there hey";
        String modifiedD = d.replace(" ", ".");
        System.out.println(modifiedD); // Hello.there.hey

        String e = "Hello12345there6789hey";
        String modifiedA = e.replaceAll("\\d+", "-");
        System.out.println(modifiedA); // Hello-there-hey
        String modifiedF = e.replaceFirst("\\d+", "-");
        System.out.println(modifiedF); // Hello-there6789hey
    }
}
