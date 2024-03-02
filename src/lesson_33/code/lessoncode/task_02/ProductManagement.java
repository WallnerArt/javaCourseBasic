package lesson_33.code.lessoncode.task_02;

public class ProductManagement {

    public static void main(String[] args) {
        // Пример использования классов Product и ProductCatalog
        ProductCatalog catalog = new ProductCatalog();

        // Добавляем продукты в каталог
        catalog.addProduct(1, new Product("Молоко", 1.5));
        catalog.addProduct(2, new Product("Хлеб", 1.0));
        catalog.addProduct(1, new Product("Масло", 2.0)); // Попытка добавить продукт с существующим идентификатором

        // Ищем продукты по идентификатору
        Product product1 = catalog.findProduct(1);
        if (product1 != null) {
            System.out.println("Найден продукт: " + product1.getName() + ", Цена: " + product1.getPrice());
        }

        Product product3 = catalog.findProduct(3); // Попытка найти несуществующий продукт

        // Удаляем продукт из каталога
        catalog.deleteProduct(2);

        // Пытаемся найти удаленный продукт
        Product deletedProduct = catalog.findProduct(2);
    }
}

