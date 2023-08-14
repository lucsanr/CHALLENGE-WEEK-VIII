package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Coordinator;
import lucsan.machado.scholarshipapi.repository.CoordinatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordinatorServiceImpl implements CoordinatorService {

    private final CoordinatorRepository coordinatorRepository;

    @Autowired
    public CoordinatorServiceImpl(CoordinatorRepository coordinatorRepository) {
        this.coordinatorRepository = coordinatorRepository;
    }

    @Override
    public List<Coordinator> getAllCoordinators() {
        return coordinatorRepository.findAll();
    }

    @Override
    public Coordinator findById(Long id) {
        return coordinatorRepository.findById(id).orElse(null);
    }

    @Override
    public Coordinator createCoordinator(Coordinator coordinator) {
        return coordinatorRepository.save(coordinator);
    }

    @Override
    public Coordinator updateCoordinator(Long id, Coordinator newCoordinator) {

        Coordinator existingCoordinator = coordinatorRepository.findById(id).orElse(null);

        if (existingCoordinator != null) {

            existingCoordinator.setName(newCoordinator.getName());
            existingCoordinator.setEmail(newCoordinator.getEmail());


            return coordinatorRepository.save(existingCoordinator);
        } else {
            return null;
        }
    }


    @Override
    public void deleteCoordinator(Long id) {
        coordinatorRepository.deleteById(id);
    }

}
