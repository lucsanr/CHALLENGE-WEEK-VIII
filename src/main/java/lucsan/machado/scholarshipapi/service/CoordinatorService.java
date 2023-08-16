package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Coordinator;

import java.util.List;

public interface CoordinatorService {
    List<Coordinator> getAllCoordinators();
    Coordinator findById(Long id);
    Coordinator createCoordinator(Coordinator coordinator);
    Coordinator updateCoordinator(Long id, Coordinator coordinator);
    void deleteCoordinator(Long id);

}
