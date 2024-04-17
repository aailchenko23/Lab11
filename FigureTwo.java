public class FigureTwo {
    public void methodOne(FigureOne figure) throws FigureThree {
        if (figure.getSideLength() <= 0) {
            throw new FigureThree("Довжина сторони не може бути від'ємною або нульовою");
        }
    }

    public void methodTwo(FigureOne figure) throws FigureThree {
        if (figure.getSideLength() > 100) {
            throw new FigureThree("Довжина сторони перевищує максимально допустиме значення");
        }
    }

    public void methodThree(FigureOne figure) {
        try {
            methodOne(figure);// Викликаємо метод methodOne, який може викликати виняток FigureThree
        } catch (FigureThree e) {
            System.out.println("Виняток зловлено: " + e);
        }
    }
}
