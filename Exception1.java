public class Exception1 {
     // Перший метод  за конструкцією try/catch
    public void FirstMethod() {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Результат = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Не можна ділити на 0");
        }
    }

    // Другий метод з вкладеною конструкцією try/catch
    public void SecondMethod() {
        try {
            try {
                String a = null;
                System.out.println((a.charAt(0)));//використовується для отримання першого символу з рядка a.
            } catch (NullPointerException e) {
                System.out.println("NullPointerException...");
            }
        } catch (ArithmeticException e) {
            System.out.println("Виникла помилка в обробці NullPointerException.");
        }
    }

    // Третій метод з використанням блоку finally
    public void ThirdMethod() {
        try {
            int a []  = new int[5];
            a[6] = 9;
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Індекс масиву виходить за межі");
        } finally {
            System.out.println("Блок finally виконаний.");
        }
    }
}




