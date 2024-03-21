package org.example.one.persistence;

import java.util.List;

public interface Dao<E> {
    /**
     * <p>
     * Ova metoda treba da pročita trajno snimljene elemente i da nam
     * vrati listu učitanih elemenata.
     * </p>
     *
     * @return elements
     * @throws DaoException
     */
    List<E> readElements() throws DaoException;

    /**
     * <p>
     *     Ova metoda treba da snimi trajno elemente u neki medij(JSON, file, XML, MySQL)
     * </p>
     *
     * @param elements
     * @throws DaoException
     */
    void writeElements(List<E> elements) throws DaoException;
}
