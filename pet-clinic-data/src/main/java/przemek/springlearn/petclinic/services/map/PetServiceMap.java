package przemek.springlearn.petclinic.services.map;


import org.springframework.stereotype.Service;
import przemek.springlearn.petclinic.model.Pet;
import przemek.springlearn.petclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
