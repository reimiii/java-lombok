package franxx.code.lombok;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonTest {

    @Test
    void allConstructor() {
        Person person = new Person(
                "id", "name", 18, List
                .of("Game", "Travel", "Sleep")
        );

        System.out.println(person);
    }

    @Test
    void setter() {
        Person person = new Person();

        person.setId("id");
        person.setName("mee");
        person.setAge(122);

        person.setHobbies(List.of("eat", "sleep", "game"));
    }

    @Test
    void viaBuilder() {
        Person build = Person.builder()
                .id("id")
                .name("name")
                .age(12)
                .hobbies(List.of("eat", "sleep", "game"))
                .build();

        System.out.println(build);
    }

    @Test
    void singularCollection() {

        Person build = Person.builder()
                .id("id")
                .name("name")
                .age(12)
                .hobby("eat")
                .hobby("sleep")
                .hobby("manga")
                .hobby("anime")
                .build();

        System.out.println(build);
    }
}
