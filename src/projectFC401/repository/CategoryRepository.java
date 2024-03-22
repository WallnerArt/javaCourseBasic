package projectFC401.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Репозиторий для категорий
public class CategoryRepository implements InterfaceRepository<Locale.Category> {

    private List<Locale.Category> categories = new ArrayList<>(); // Список категорий

    @Override
    public void save(Locale.Category category) {
        categories.add(category);
    }

    @Override
    public Locale.Category findById(int id) {
        for (Locale.Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Locale.Category> findAll() {
        return categories;
    }

}