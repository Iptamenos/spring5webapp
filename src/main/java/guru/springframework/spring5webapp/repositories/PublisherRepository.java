package guru.springframework.spring5webapp.repositories;
/*
 * Athens 2021
 *
 * Created on : 2021-03-19
 * Author     : Christos Kormaris
 */

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
