package lesson_33.code.lessoncode.homeWork.task_01.task_02;

import java.util.HashMap;
import java.util.Map;

class ProductCatalog {
    private Map<Integer, Product> catalog; // Используем HashMap для хранения продуктов по их идентификатору

    // Конструктор для инициализации каталога
    public ProductCatalog() {
        catalog = new HashMap<>();
    }

    // Метод для добавления продукта в каталог
    public void addProduct(int productId, Product product) {
        if (catalog.containsKey(productId)) {
            System.out.println("Продукт с данным идентификатором уже есть в каталоге.");
        } else {
            catalog.put(productId, product);
        }
    }

    // Метод для удаления продукта из каталога
    public void deleteProduct(int productId) {
        if (catalog.containsKey(productId)) {
            catalog.remove(productId);
        } else {
            System.out.println("Продукт с таким идентификатором не найден в каталоге.");
        }
    }

    // Метод для поиска продукта по идентификатору
    public Product findProduct(int productId) {
        if (catalog.containsKey(productId)) {
            return catalog.get(productId);
        } else {
            System.out.println("Продукт с таким идентификатором не найден в каталоге.");
            return null;
        }
    }
}

