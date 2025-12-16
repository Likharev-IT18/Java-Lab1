import java.util.Random;
import java.util.Scanner;

//Решения заданий
public class Task {
    //Методы
    //2
    public int sumLastNums(int x) {
        if (x / 10 == 0){
            return -1;
        }
        int one = (x%100)/10;
        int two = x%10;
        return Math.abs(one + two);
    }
    //4
    public boolean isPositive(int x) {
        return x > 0;
    }
    //6
    public boolean isUpperCase(char x) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++) {
           if (alphabet.charAt(i) == x) {
               return true;
           }
        }
        return false;
    }
    //8
    public boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }
    //10
    public int lastNumSum(int a, int b) {
        return a%10 + b%10;
    }

    //Условия
    //2
    public double safeDiv(int x, int y) {
        if (y==0) {
            return 0;
        }
        return (double)x/y;
    }
    //4
    public String makeDecision(int x, int y) {
        String str;
        if (x>y) {
            str = x + ">" + y;
        } else if (x<y) {
            str = x + "<" + y;
        } else {
            str = x + "==" + y;
        }
        return str;
    }
    //6
    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
    //8
    public String age(int x) {
        if (x % 10 == 1 && x != 11){
            return x+" год";
        } else if ((x%10==2 || x%10==3 || x%10==4) && (x!=12 && x!=13 && x!=14)) {
            return x+" года";
        } else {
            return x+" лет";
        }
    }
    //10
    public void printDays(String x) {
        switch (x){
            case "понедельник":
                System.out.println("  понедельник");
            case "вторник":
                System.out.println("  вторник");
            case "среда":
                System.out.println("  среда");
            case "четверг":
                System.out.println("  четверг");
            case "пятница":
                System.out.println("  пятница");
            case "суббота":
                System.out.println("  суббота");
            case "воскресенье":
                System.out.println("  воскресенье");
                break;
            default:
                System.out.println("Это не день недели...");
        }
    }

    //Циклы
    //2
    public String reverseListNums(int x) {
        String str = "";
        for(int i = x; i>=0; i--){
            if (i != 0) {
                str += i + " ";
            } else {
                str += i;
            }
        }
        return str;
    }
    //4
    public int pow(int x, int y) {
        int p = 1;
        for(int i = 0; i < y; i++) {
            p *= x;
        }
        return p;
    }
    //6
    public boolean equalNum(int x) {
        int num = 10;
        int znak = x%10;
        while (x/num != 0) {
            if ( (x%(num*10))/num != znak){
                return false;
            }
            num *= 10;
        }
        return true;
    }
    //8
    public void leftTriangle(int x) {
        String str = "*";
        for (int i = 0; i < x; i++) {
            System.out.println(str);
            str += "*";
        }
    }
    //10
    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int enterNumber;
        int attempts = 0;
        boolean success = false;
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.print("Введите число от 0 до 9: ");

        while (!success) {
            enterNumber = scanner.nextInt();
            if (enterNumber < 0 || enterNumber > 9) {
                System.out.println("Число может быть от 0 до 9");
                System.out.print("Введите число от 0 до 9: ");
                continue;
            }
            attempts++;
            if (enterNumber == randomNumber) {
                System.out.println("Вы угадали число за " + attempts + " попыток!");
                success = true;
            } else {
                System.out.print("Вы не угадали число, введите число от 0 до 9:");
            }
        }
    }

    //Массивы
    //2
    public int findLast(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }
    //4
    public int[] add(int[] arr, int x, int pos) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0, i1 = 0; i < newArray.length; i++, i1++) {
            if (i != pos) {
                newArray[i] = arr[i1];
            } else {
                newArray[i] = x;
                i1--;
            }
        }
        return newArray;
    }
    //6
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    //8
    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[index] = arr2[i];
            index++;
        }
        return newArray;
    }
    //10
    public int[] deleteNegative(int[] arr) {
        int counterNegative = 0;
        for (int i = 0; i < arr.length; i++) { //Ищем колво отрицательных
            if (arr[i] < 0) {
                counterNegative++;
            }
        }

        int[] newArray = new int[arr.length-counterNegative];
        for (int i = 0, i1 = 0; i < arr.length; i++) { //Записываем только положительные
            if (arr[i] > 0) {
                newArray[i1] = arr[i];
                i1++;
            }
        }
        return newArray;
    }

    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        int size = 1;
        do {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
            if (size < 1) {
                System.out.println("Размер массива больше 0!");
            }
        } while (size < 1);
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public String arrayGetString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                str += arr[i] + ",";
            } else {
                str += arr[i] + "]";
            }
        }
        return str;
    }
}