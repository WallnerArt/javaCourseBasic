package lesson_39.code.lessoncode.task_01;

public class AnonymousClassExample {

    public static void main(String[] args) {
        // Создание анонимного класса, реализующего интерфейс
        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                // Выполнение действия внутри анонимного класса
                // Здесь вы можете описать свое действие
                // Например, вывод текста в консоль
                System.out.println("Выполняю действие внутри анонимного класса");
            }
        };
        myInterface.doSomething(); // Вызов метода внутри анонимного класса
    }
}

interface MyInterface {
    void doSomething();
}