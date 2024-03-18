package lesson_44.code.lessoncode.appVariant;

import lesson_44.code.lessoncode.appVariant.repository.InMemoryRepository;
import lesson_44.code.lessoncode.appVariant.repository.TaskInMemoryRepository;
import lesson_44.code.lessoncode.appVariant.service.TaskServiceAddOrUpdate;
import lesson_44.code.lessoncode.appVariant.service.TaskServiceFind;
import lesson_44.code.lessoncode.appVariant.service.validation.ValidationRequest;
import lesson_44.code.lessoncode.appVariant.ui.UserMenu;

public class App {
    public static void main(String[] args) {
        InMemoryRepository repository = new TaskInMemoryRepository();
        ValidationRequest validationRequest = new ValidationRequest();

        TaskServiceAddOrUpdate taskServiceAddOrUpdate = new TaskServiceAddOrUpdate(repository, validationRequest);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);

        UserMenu userMenu = new UserMenu(taskServiceAddOrUpdate, taskServiceFind);
        userMenu.menu();

    }
}
