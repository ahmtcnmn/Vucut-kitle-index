import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double boy,kg,index;

        System.out.print("Lüften boyunuzu giriniz (Metre cinsinden) : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuuz giriniz (Kilogram cinsinden) : ");
        kg = input.nextDouble();

        index = kg/(boy*boy);
        System.out.print("Vücut kitle indexsiniz : " + index);

    }
}