public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляр класу FigureOne
        FigureOne figure = new FigureOne(50);

        // Створюємо екземпляр класу FigureTwo
        FigureTwo figureTwo = new FigureTwo();

        // Викликаємо методи класу FigureTwo і обробляємо можливі винятки
        try {
            figureTwo.methodOne(figure);
            System.out.println("Метод methodOne викликаний успішно.");
        } catch (FigureThree e) {
            System.out.println("Виняток при виклику методу methodOne: " + e);
        }

        try {
            figureTwo.methodTwo(figure);
            System.out.println("Метод methodTwo викликаний успішно.");
        } catch (FigureThree e) {
            System.out.println("Виняток при виклику методу methodTwo: " + e);
        }

        figureTwo.methodThree(figure);
        // Створення об'єкту класу Exception1
        Exception1 exception1 = new Exception1();

        // Виклик першого методу
        System.out.println("Виклик першого методу:");
        exception1.FirstMethod();

        // Виклик другого методу
        System.out.println("\nВиклик другого методу:");
        exception1.SecondMethod();

        // Виклик третього методу
        System.out.println("\nВиклик третього методу:");
        exception1.ThirdMethod();
    }

}
