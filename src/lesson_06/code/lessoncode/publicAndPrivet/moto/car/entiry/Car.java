package lesson_06.code.lessoncode.publicAndPrivet.moto.car.entiry;

public class Car {
    public String color;

    public String model;

    private final String producer;



    public Car(String producer) {
        this.producer = producer;
    }

    /*
    модификаторы доступа к переменным (полям класса)
    1) default - или по умолчанию - предоставляет доступ к полю для класса который находится В ТОМ ЖЕ package
    2) public - предоставляет доступ к полю для класса который находится В ЛЮБОМ package
    3) private - предоставляет доступ к полю класса только для методов этого класса (внутренний доступ)
    4) protected (изучим позже)
     */

    public String getProducer() {
        return producer;
    }
}

