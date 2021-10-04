package przemek.springlearn.petclinic.services;

import org.springframework.boot.web.reactive.filter.OrderedWebFilter;
import przemek.springlearn.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
