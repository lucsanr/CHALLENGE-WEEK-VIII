package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Squad;
import lucsan.machado.scholarshipapi.repository.SquadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquadServiceImpl implements SquadService {

    private final SquadRepository squadRepository;

    @Autowired
    public SquadServiceImpl(SquadRepository squadRepository) {
        this.squadRepository = squadRepository;
    }

    @Override
    public List<Squad> getAllSquads() {
        return squadRepository.findAll();
    }

    @Override
    public Squad findById(Long id) {
        return squadRepository.findById(id).orElse(null);
    }

    @Override
    public Squad createSquad(Squad squad) {
        return squadRepository.save(squad);
    }

    @Override
    public Squad updateSquad(Long id, Squad newSquad) {
        Squad existingSquad = squadRepository.findById(id).orElse(null);

        if (existingSquad != null) {
            existingSquad.setName(newSquad.getName());

            return squadRepository.save(existingSquad);
        } else {
            return null;
        }
    }

    @Override
    public void deleteSquad(Long id) {
        squadRepository.deleteById(id);
    }

}
