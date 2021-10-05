package przemek.springlearn.petclinic.services;
import przemek.springlearn.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
