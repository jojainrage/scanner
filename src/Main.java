import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Введите ваше имя : ");
        System.out.println("Привет " + name.nextLine() + "!");
        Scanner age = new Scanner(System.in);
        System.out.println("Введите ваш возраст:");
        System.out.println("Ура вам " + age.nextInt() + " лет");

    }
}