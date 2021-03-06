package przemek.springlearn.petclinic.services.map;


import org.springframework.stereotype.Service;
import przemek.springlearn.petclinic.model.Vet;
import przemek.springlearn.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
