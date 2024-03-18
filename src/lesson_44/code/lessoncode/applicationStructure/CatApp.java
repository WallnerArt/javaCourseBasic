package lesson_44.code.lessoncode.applicationStructure;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.lessoncode.applicationStructure.backEnd.repository.CatRepository2;
import lesson_44.code.lessoncode.applicationStructure.backEnd.repository.CatRepositoryInterface;
import lesson_44.code.lessoncode.applicationStructure.backEnd.service.CatService;
import lesson_44.code.lessoncode.applicationStructure.backEnd.service.PrintCatService;
import lesson_44.code.lessoncode.applicationStructure.frontMenu.UserMenu;

public class CatApp {
    public static void main(String[] args) {
        CatRepositoryInterface repository = new CatRepository2();
        UserInput ui = new UserInput();
        PrintCatService printCatService = new PrintCatService(repository);
        CatService catService = new CatService(repository, ui);

        UserMenu userMenu = new UserMenu(printCatService, catService, ui);

        userMenu.start();

    }
}
