package lesson_36.code.lessoncode.pecs;

public class ZooDemo {
    public static void main(String[] args) {
        ZooUtil util = new ZooUtil();

        util.printZoo(util.animalZoo);
        util.printZoo(util.catZoo);
        util.printZoo(util.dogZoo);
        util.printZoo(util.dogSmallZoo);

        util.addZooDog(util.dogSmallZoo);


    }
}