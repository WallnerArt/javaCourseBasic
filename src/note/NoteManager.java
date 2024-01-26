package note;

import scanner.UserInput;

public class NoteManager {

    private UserInput ui  = new UserInput();

    public Note createNote() {


        String number = ui.inputText("numberNote: ");
        String content = ui.inputText("content: ");


        Note newNote = new Note(number, content);
        return newNote;

    }

}