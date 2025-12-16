import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taskMenu = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите задание:\n  1.Методы\n  2.Условия\n  3.Циклы\n  4.Массивы\nЗадание:");
            taskMenu = scanner.nextInt();
            ChildMenus childMenus = new ChildMenus();
            switch (taskMenu) {
                case 1:
                    childMenus.methods();
                    break;
                case 2:
                    childMenus.conditions();
                    break;
                case 3:
                    childMenus.cycles();
                    break;
                case 4:
                    childMenus.arrays();
                    break;
                default:
                    System.out.println("Ввод не норм ок пон, надо чтоб был норм(1-4)");
            }
        }
    }
}