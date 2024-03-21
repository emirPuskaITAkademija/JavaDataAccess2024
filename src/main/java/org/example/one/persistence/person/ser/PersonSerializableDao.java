package org.example.one.persistence.person.ser;

import org.example.one.Person;
import org.example.one.persistence.DaoException;
import org.example.one.persistence.person.PersonDao;

import java.io.*;
import java.util.List;

public class PersonSerializableDao implements PersonDao{

    public static final String PERSON_SER = "person.ser";

    @Override
    public List<Person> readElements() throws DaoException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PERSON_SER))){
            List<Person> personList = (List<Person>) ois.readObject();
            return personList;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            throw new DaoException(e.getMessage());
        }
    }

    @Override
    public void writeElements(List<Person> elements) throws DaoException {
        if(elements == null || elements.isEmpty()){
            return;
        }
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(PERSON_SER))){
            ous.writeObject(elements);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new DaoException(e.getMessage());
        }
    }
}
