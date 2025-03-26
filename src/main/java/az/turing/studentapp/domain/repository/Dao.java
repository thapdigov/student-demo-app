package az.turing.studentapp.domain.repository;

import java.util.Collection;

public interface Dao<E, I> {


    Collection<E> getAll();

    E save(E e);

    E getByIndex(I i);

}
