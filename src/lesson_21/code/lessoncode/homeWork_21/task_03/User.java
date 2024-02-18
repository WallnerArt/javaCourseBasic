package lesson_21.code.lessoncode.homeWork_21.task_03;
public class User {
    private String login;
    private String password;
    private String email;

    // Конструктор для инициализации данных пользователя
    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // Геттер для получения логина пользователя
    public String getLogin() {
        return login;
    }

    // Сеттер для установки логина пользователя
    public void setLogin(String login) {
        this.login = login;
    }

    // Геттер для получения email пользователя
    public String getEmail() {
        return email;
    }

    // Сеттер для установки email пользователя
    public void setEmail(String email) {
        this.email = email;
    }

    // Метод для изменения пароля пользователя
    public boolean changePassword(String oldPassword, String newPassword) {
        // Проверяем, совпадает ли старый пароль с текущим
        if (password.equals(oldPassword)) {
            // Проверяем, соответствует ли новый пароль требованиям безопасности (например, длина)
            if (newPassword.length() >= 8) {
                // Устанавливаем новый пароль
                password = newPassword;
                System.out.println("Password changed successfully.");
                return true;
            } else {
                System.out.println("New password does not meet security requirements.");
                return false;
            }
        } else {
            System.out.println("Incorrect old password.");
            return false;
        }
    }
}

