package przemek.springlearn.petclinic.services.map;

import com.sun.xml.bind.v2.model.core.ID;
import przemek.springlearn.petclinic.model.Owner;
import przemek.springlearn.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
