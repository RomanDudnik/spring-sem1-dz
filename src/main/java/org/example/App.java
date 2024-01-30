package org.example;

import com.google.gson.Gson;
import org.example.models.Person;

/**
 * Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
 * Пример решения:
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 */

public class App {

    public static void main(String[] args) {

        Person person = new Person("Ivan", "Ivanov", 25);
        System.out.println("Before: " + person);


        String jsonPerson = new Gson().toJson(person);
        System.out.println("After serialization: " + jsonPerson);

        Person deserializedPerson  = new Gson().fromJson(jsonPerson, Person.class);
        System.out.println("After deserialization: " + deserializedPerson);

    }
}
