package guru.springframework.spring5webapp.repositories;
/*
 * Athens 2021
 *
 * Created on : 2021-03-19
 * Author     : Christos Kormaris
 */

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
