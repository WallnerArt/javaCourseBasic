package lesson_44.code.lessoncode.applicationStructure.backEnd.dto;

public class CatFromUser {

    private String catName;

    public CatFromUser(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }
}
