import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первую сторону прямоугольника: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("Введите вторую сторону прямоугольника: ");
        int x2 = sc.nextInt();
        System.out.println("Периметр прямоугольника = " + (2*(x1+x2)));
        System.out.println("Площадь прямоугольника = " + (x1*x2));
        System.out.println("Введите первую сторону треугольника: ");
        int a1 = sc.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int a2 = sc.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int a3 = sc.nextInt();
        sc.close();
        System.out.println("Периметр треугольника = " + (a1+a2+a3));
        int p = (a1 + a2 + a3) / 2;
        System.out.println("Площадь треугольника = " + (Math.sqrt(p*((p-a1)*(p-a2)*(p-a3)))));



    }
}