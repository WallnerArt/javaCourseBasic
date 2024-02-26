package homeWorks.homeWork_21.task_01;

// Пример использования
public class Main {

    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();
        Shape[] shapes = shapeService.createRandomShapesArray(10, 20);
        shapeService.fillRandomShapesArray(shapes, 1, 10);
        shapeService.printTotalInfo(shapes);
    }
}


