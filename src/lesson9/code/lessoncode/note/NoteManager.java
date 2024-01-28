package lesson9.code.lessoncode.note;

import lesson6.code.lessoncode.scanner.UserInput;

public class NoteManager {

    UserInput ui = new UserInput();


    public Note createNote(){

        Note note = new Note(
                ui.inputInteger("Введите номер заметки: "),
                ui.inputText("Введите текст заметки: ")
        );
        return note;
    }
}

