import java.util.Scanner;

//Менюшки заданий
public class ChildMenus {
    public void methods() {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task(); //Подключаем решения заданий
        int taskNum = 1;

        //Переменные
        int xInt;
        int aInt;
        int bInt;
        char xChar;
        String xStr;
        boolean ret;

        while (taskNum != 0) {
            System.out.print("Методы->Задача(2,4,6,8,10)(0 - выход):");
            taskNum = scanner.nextInt();
            switch (taskNum) {
                case 0:
                    break;
                case 2:
                    System.out.print("\n2. Сумма знаков. \n" +
                            "Дана сигнатура метода: public int sumLastNums (int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал результат \n" +
                                "сложения двух последних знаков числах, предполагая, что знаков в числе не \n" +
                                  "менее двух. Подсказки:\n" +
                                    "int x=123%10; // х будет иметь значение 3\n" +
                                      "int у=123/10; // у будет иметь значение 12\nПример: x=4568\nРезультат: 14\n\nВведите x:");
                    xInt = scanner.nextInt(); //просим x
                    xInt = task.sumLastNums(xInt); //вычисляем сумму
                    if (xInt != -1) {
                        System.out.println("Сумма: " + xInt);
                    } else {
                        System.out.println("Знаков должно быть не меньше двух!");
                    }
                    break;
                case 4:
                    System.out.print("\n4. Есть ли позитив.\n" +
                            "Дана сигнатура метода: public bool isPositive (int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он принимал число x и \n" +
                                "возвращал true, если оно положительное. \n" +
                                  "Пример 1: x=3\nрезультат: true\nПример 2: x=-5\nрезультат: false\n\nВведите x:");
                    xInt = scanner.nextInt();
                    if (xInt == 0) {
                        System.out.println("0 низяяя оно не положит. и не отриц.");
                        break;
                    }
                    ret = task.isPositive(xInt);
                    if (ret) {
                        System.out.println("X положительное(true)");
                    } else {
                        System.out.println("X отрицальное(false)");
                    }
                    break;
                case 6:
                    System.out.print("\n6. Большая буква.\n" +
                            "Дана сигнатура метода: public bool isUpperCase(char x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он принимал символ x и \n" +
                                "возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’. \n" +
                                  "Пример 1: x='D'\nрезультат: true\nПример 2: x='q'\nрезультат: false\n\nВведите x:");
                    xStr = scanner.next();
                    if (xStr.length() == 1) {
                        xChar = xStr.charAt(0);
                    } else {
                        System.out.println("Введите одну букву!!!");
                        break;
                    }

                    ret = task.isUpperCase(xChar);
                    System.out.println("Результат: " + ret);
                    break;
                case 8:
                    System.out.println("\n8. Делитель.\n" +
                            "Дана сигнатура метода: public bool isDivisor (int a, int b);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал true, если \n" +
                                "любое из принятых чисел делит другое нацело.\n" +
                                  "Пример 1:\na=3 b=6\nрезультат: true\nПример 2:\na=2 b=15\nрезультат: false\n");
                    System.out.print("Введите a:");
                    aInt = scanner.nextInt();
                    System.out.print("Введите b:");
                    bInt = scanner.nextInt();

                    ret = task.isDivisor(aInt, bInt);
                    System.out.println("Результат: " + ret);
                    break;
                case 10:
                    System.out.println("10. Многократный вызов.\n" +
                            "Дана сигнатура метода: public int lastNumSum(int a, int b)\n" +
                              "Необходимо реализовать метод таким образом, чтобы он считал сумму цифр \n" +
                                "двух чисел из разряда единиц. Выполните с его помощью последовательное \n" +
                                  "сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить \n" +
                                    "задачу, используя минимально возможное количество вспомогательных \nпеременных.\n" +
                                      "Пример:\n  5+11 это 6\n  6+123 это 9\n  9+14 это 13\n  13+1 это 4\nИтого 4\n");
                    System.out.print("Введите число 1:");
                    aInt = scanner.nextInt();
                    for (int i = 2; i <= 5; i++) {
                        System.out.print("Введите число " + i + ":");
                        bInt = scanner.nextInt();
                        aInt = task.lastNumSum(aInt, bInt);
                        System.out.println("Сумма :" + aInt);
                    }

                    break;
                default:
                    System.out.println("Неправильная задача...");
            }
        }
    }

    public void conditions() {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task(); //Подключаем решения заданий
        int taskNum = 1;

        //Переменные
        int xInt;
        int yInt;
        int zInt;
        String xStr;
        boolean ret;
        double xDouble;

        while (taskNum != 0) {
            System.out.print("Условия->Задача(2,4,6,8,10)(0 - выход):");
            taskNum = scanner.nextInt();
            switch (taskNum) {
                case 0:
                    break;
                case 2:
                    System.out.println("\n2. Безопасное деление.\n" +
                            "Дана сигнатура метода: public double safeDiv(int x, int y);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал деление x\n" +
                                "на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0.\n" +
                                  "При делении на 0 следует вернуть из метода число 0. Подсказка: смотри \nограничения на операции типов данных." +
                                    "\nПример 1:\n  x=5 y=0\nрезультат: 0\nПример 2:\n  x=8 y=2\nрезультат: 4\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    System.out.print("Введите y:");
                    yInt = scanner.nextInt();

                    xDouble = task.safeDiv(xInt, yInt);
                    if (xDouble != 0) {
                        System.out.println("Деление: " + xDouble);
                    } else {
                        System.out.println("Деление: 0");
                    }
                    break;
                case 4:
                    System.out.println("\n4. Строка сравнения.\n" +
                            "Дана сигнатура метода: public String makeDecision(int x, int y);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал строку,\n" +
                                "которая включает два принятых методом числа и корректно выставленный\n" +
                                  "знак операции сравнения (больше, меньше, или равно).\n" +
                                    "Пример 1:  x=5 y=7 \nРезультат: “5<7”\n" +
                                      "Пример 2:  x=8 y=-1 \nРезультат: “8>-1”\nПример 3:  x=4 y=4\nРезультат: “4==4”\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    System.out.print("Введите y:");
                    yInt = scanner.nextInt();

                    xStr = task.makeDecision(xInt, yInt);
                    System.out.println("Результат:" + xStr);
                    break;
                case 6:
                    System.out.println("\n6. Тройная сумма.\n" +
                            "Дана сигнатура метода: public bool sum3(int x, int y, int z);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал true, если \n" +
                                "два любых числа (из трех принятых) можно сложить так, чтобы получить третье.\n" +
                                  "Пример 1:\n  x=5 y=7 z=2\nрезультат: true\nПример 2:\n  x=8 y=-1 z=4\nрезультат: false\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    System.out.print("Введите y:");
                    yInt = scanner.nextInt();
                    System.out.print("Введите z:");
                    zInt = scanner.nextInt();

                    ret = task.sum3(xInt, yInt, zInt);
                    System.out.println("Результат: " + ret);
                    break;
                case 8:
                    System.out.println("\n8.Возраст.\n" +
                            "Дана сигнатура метода: public String age(int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n" +
                                "которой сначала будет число х, а затем одно из слов: “год”, “года”, “лет”\n" +
                                  "Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.\n" +
                                    "Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел 12,13,14.\n" +
                                      "Слово “лет” добавляется во всех остальных случаях.\n" +
                                        "Подсказка: оператор % позволяет получить остаток от деления.\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();

                    xStr = task.age(xInt);
                    System.out.println(xStr);
                    break;
                case 10:
                    System.out.println("\nВывод дней недели.\n" +
                            "Дана сигнатура метода: public void printDays (String x);\n" +
                              "В качестве параметра метод принимает строку, в которой записано название\n" +
                                "дня недели. Необходимо реализовать метод таким образом, чтобы он выводил\n" +
                                  "на экран название переданного в него дня и всех последующих до конца недели\n" +
                                    "на экран название переданного в него дня и всех последующих до конца недели\n" +
                                      "дней. Если в качестве строки передан не день, то выводится текст “это не день\n" +
                                        "недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной\n" +
                                          "задаче используйте switch.\n");
                    System.out.print("Введите x:");
                    xStr = scanner.next();
                    task.printDays(xStr);
                    break;
                default:
                    System.out.println("Неправильная задача...");
            }
        }
    }

    public void cycles() {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task(); //Подключаем решения заданий
        int taskNum = 1;

        //Переменные
        int xInt;
        int yInt;
        String xStr;
        boolean ret;

        while (taskNum != 0) {
            System.out.print("Циклы->Задача(2,4,6,8,10)(0 - выход):");
            taskNum = scanner.nextInt();
            switch (taskNum) {
                case 0:
                    break;
                case 2:
                    System.out.println("\n2. Числа наоборот.\n" +
                            "Дана сигнатура метода: public String reverseListNums(int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал строку, в \n" +
                                "которой будут записаны все числа от x до 0 (включительно).\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    if (xInt < 0){
                        System.out.println("Введите положительное число!");
                        break;
                    }
                    xStr = task.reverseListNums(xInt);
                    System.out.println("Результат: " + xStr);
                    break;
                case 4:
                    System.out.println("\n4. Степень числа.\n" +
                            "Дана сигнатура метода: public int pow(int x, int y);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал результат\n" +
                                "возведения x в степень y.\n" +
                                  "Подсказка: для получения степени необходимо умножить единицу на число x, и\n" +
                                    "сделать это y раз, т.е. два в третьей степени это 1*2*2*2\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    System.out.print("Введите y:");
                    yInt = scanner.nextInt();

                    xInt = task.pow(xInt, yInt);
                    System.out.println("Результат: " + xInt);
                    break;
                case 6:
                    System.out.println("\n6. Одинаковость.\n" +
                            "Дана сигнатура метода: public bool equalNum (int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n" +
                                "все знаки числа одинаковы, и false в ином случае.\n" +
                                  "Подсказки:\nintx=123%10; // х будет иметь значение 3\nintу=123/10; // у будет иметь значение 12\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();

                    ret = task.equalNum(xInt);
                    System.out.println("Результат: " + ret);
                    break;
                case 8:
                    System.out.println("\n8. Левый треугольник.\n" +
                            "Дана сигнатура метода: public void leftTriangle(int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он выводил на экран\n" +
                                "треугольник из символов ‘*’ у которого х символов в высоту, а количество\n" +
                                  "символов в ряду совпадает с номером строки.\n");
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    if (xInt < 1) {
                        System.out.println("Введите значение больше 1");
                        break;
                    }

                    System.out.println("Результат:");
                    task.leftTriangle(xInt);
                    break;
                case 10:
                    System.out.println("\n10. Угадайка.\n" +
                            "Дана сигнатура метода: public void guessGame()\n" +
                              "Необходимо реализовать метод таким образом, чтобы он генерировал\n" +
                                "случайное число от 0 до 9, далее считывал с консоли введенное пользователем\n" +
                                  "число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод\n" +
                                    "запускается до тех пор, пока пользователь не угадает число. После этого\n" +
                                      "выведите на экран количество попыток, которое потребовалось пользователю,\n" +
                                        "чтобы угадать число.\n");
                    task.guessGame();
                    break;
                default:
                    System.out.println("Неправильная задача...");
            }
        }
    }

    public void arrays() {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task(); //Подключаем решения заданий
        int taskNum = 1;

        //Переменные
        int xInt;
        int pos;
        int[] array;
        int[] arr1;
        int[] arr2;

        while (taskNum != 0) {
            System.out.print("Массивы->Задача(2,4,6,8,10)(0 - выход):");
            taskNum = scanner.nextInt();
            switch (taskNum) {
                case 0:
                    break;
                case 2:
                    System.out.println("\n2. Поиск последнего значения.\n" +
                            "Дана сигнатура метода: public int findLast(int[] arr, int x);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" +
                                "последнего вхождения числа x в массив arr. Если число не входит в массив –\n" +
                                  "возвращается -1.\n");
                    array = task.createArray();
                    System.out.println("array=" + task.arrayGetString(array));
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();

                    xInt = task.findLast(array, xInt);
                    System.out.println("Результат: " + xInt);
                    break;
                case 4:
                    System.out.println("\n4. Добавление в массив.\n" +
                            "Дана сигнатура метода: public int[]add(int[] arr, int x, int pos);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
                                "массив, который будет содержать все элементы массива arr, однако в позицию\n" +
                                  "pos будет вставлено значение x.\n");
                    array = task.createArray();
                    System.out.println("array=" + task.arrayGetString(array));
                    System.out.print("Введите x:");
                    xInt = scanner.nextInt();
                    System.out.print("Введите pos:");
                    pos = scanner.nextInt();
                    if (pos < 0 || pos > array.length) {
                        System.out.println("Невалидная позиция вставки");
                        break;
                    }

                    array = task.add(array, xInt, pos);
                    System.out.println("Результат: " + task.arrayGetString(array));
                    break;
                case 6:
                    System.out.println("\n6. Реверс.\n" +
                            "Дана сигнатура метода: public void reverse(int[] arr);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он изменял массив arr.\n" +
                                "После проведенных изменений массив должен быть записан задом-наперед.\n");
                    array = task.createArray();
                    System.out.println("array=" + task.arrayGetString(array));
                    task.reverse(array);
                    System.out.println("Результат: " + task.arrayGetString(array));
                    break;
                case 8:
                    System.out.println("\n8. Объединение.\n" +
                            "Дана сигнатура метода: public int[] concat(int[] arr1,int[] arr2);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
                                "массив, в котором сначала идут элементы первого массива (arr1), а затем\n" +
                                  "второго (arr2).\n");
                    arr1 = task.createArray();
                    System.out.println("arr1=" + task.arrayGetString(arr1));
                    arr2 = task.createArray();
                    System.out.println("arr2=" + task.arrayGetString(arr2));
                    array = task.concat(arr1, arr2);
                    System.out.println("Результат: " + task.arrayGetString(array));
                    break;
                case 10:
                    System.out.println("\n10. Удалить негатив.\n" +
                            "Дана сигнатура метода: public int[] deleteNegative(int[] arr);\n" +
                              "Необходимо реализовать метод таким образом, чтобы он возвращал новый \n" +
                                "массив, в котором записаны все элементы массива arr кроме отрицательных.\n");
                    array = task.createArray();
                    System.out.println("array=" + task.arrayGetString(array));
                    array = task.deleteNegative(array);
                    System.out.println("Результат: " + task.arrayGetString(array));
                    break;
                default:
                    System.out.println("Неправильная задача...");
            }
        }
    }
}
