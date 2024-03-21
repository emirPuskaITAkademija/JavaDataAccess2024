package org.example.one;

import org.example.one.persistence.DaoException;
import org.example.one.persistence.person.PersonDao;
import org.example.one.persistence.person.file.FilePersonDao;
import org.example.one.persistence.person.ser.PersonSerializableDao;

import java.util.List;

public class Main {
    public static void main(String[] args) throws DaoException {
        Person person = new Person("012345678", "Ismet", "Omerović", 23);
        Person person2 = new Person("012345672", "Kanita", "Berbić", 13);
        Person person3 = new Person("012345674", "Arman", "Kovačević", 23);
        Person person4 = new Person("012345676", "Adis", "Sućeska", 33);
        Person person5 = new Person("012345670", "Mile", "Vukajlović", 18);
        Person person6 = new Person("012345650", "Alen", "Botić", 28);
        Person person7 = new Person("012345120", "Nejra", "Kadrić", 14);
        Person person8 = new Person("012345674", "Arman", "Kovačević", 23);

        List<Person> personList = List.of(person, person2, person3, person4, person5, person8);
        PersonDao personDao = new FilePersonDao();
        personDao = new PersonSerializableDao();
        personDao.writeElements(personList);
        personDao.readElements().forEach(System.out::println);
//        personDao.writeElements(personList);
//        personDao.writeElements(personList);
//        personDao.writeElements(personList);
//        List<Person> readedElements =  personDao.readElements();
//        for(Person p : readedElements){
//            if(p.getName().equals("Arman")){
//                p.setSurname("Ženino");
//            }
//        }
//        List<Person> readedElements = personDao.readElements();
//        List<Person> changedElements =  readedElements
//                .stream()
//                .filter(it->it.getName().equals("Arman"))
//                .map(Main::personMapper)
//                .toList();
//        changedElements.forEach(System.out::println);
    }

    private static Person personMapper(Person person){
        person.setSurname("Ženino2");
        return person;
    }

    private static void handlePerson(Person person) {
        System.out.println(person.getName());
    }
}
