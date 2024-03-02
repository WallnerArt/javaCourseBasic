package lesson_33.code.lessoncode.task_01;

public class ContactApp {

    public static void main(String[] args) {
        // Создаем объект ContactManager
        ContactManager contactManager = new ContactManager();

        // Создаем несколько контактов и добавляем их в список
        Contact contact1 = new Contact("Ivan Ivanov", "1234567890");
        Contact contact2 = new Contact("Maria Petrova", "0987654321");
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);


        // Проверяем список всех контактов
        System.out.println("Список всех контактов:");
        for (Contact contact : contactManager.getContacts()) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }

        // Получаем контакт по имени и по номеру телефона
        Contact IvanIvanovContact = contactManager.getContactByName("Ivan Ivanov");
        Contact MariaPetrovaContact = contactManager.getContactByPhoneNumber("0987654321");

        // Удаляем контакт
        contactManager.removeContact(IvanIvanovContact);

        // Проверяем изменения в списке контактов
        System.out.println("Список всех контактов после удаления:");
        for (Contact contact : contactManager.getContacts()) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }
}


