import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int first_symbol;
    public static int second_symbol;
    public static String symbol;
    public static int final_int;
    public static boolean endless;

    public static void main(String[] args) throws IOException {
        while (endless==false){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\"Калькулятор 3000\" готов к технической революции. Погнали");
        System.out.println("Введите первое значение:");
        first_symbol = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе значение:");
        second_symbol = Integer.parseInt(reader.readLine());
        System.out.println("Введите символ математической операции:");
        symbol = reader.readLine();
        switch (symbol) {
            case "+":
                if (symbol.equals("+")) {
                    final_int = addition.addition(first_symbol, second_symbol);
                }
            case "-":
                if (symbol.equals("-")) {
                    final_int = subtraction.subtraction(first_symbol, second_symbol);
                }
            case "*":
                if (symbol.equals("*")) {
                    final_int = multiplication.multiplication(first_symbol, second_symbol);
                }
            case "/":
                try {
                    int alternative_int = final_int;
                    alternative_int = first_symbol / second_symbol;

                } catch (ArithmeticException exception) {
                    System.out.println("Ты чё творишь чертила?");
                } finally {
                    if (second_symbol > 0 && symbol.equals("/")) {
                        final_int = divison.division(first_symbol, second_symbol);
                       /* if (second_symbol > 0 && symbol.equals("/") && first_symbol < second_symbol) {
                            System.out.println("Хлопа-хлопа дурачок. Введи делимое побольше");
                        }*/
                    }
                }
                if (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("*") && !symbol.equals("/")) {
                    System.out.println("Пошёл нахрен, козёл!");
                }
                System.out.println("Нелёгкими страданиями написания кода, написанный мною алгоритм вывел:\n + final_int\n" +
                        "Не очко обычно губит, а к одиннадцати туз. Продолжаем?");

        }
    }}}


//||symbol!="-"||symbol!="*"||symbol!="/" !="+"

