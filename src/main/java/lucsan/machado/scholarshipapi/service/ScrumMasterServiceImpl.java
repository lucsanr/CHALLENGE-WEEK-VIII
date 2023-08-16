package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.ScrumMaster;
import lucsan.machado.scholarshipapi.repository.ScrumMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrumMasterServiceImpl implements ScrumMasterService {

    private final ScrumMasterRepository scrumMasterRepository;

    @Autowired
    public ScrumMasterServiceImpl(ScrumMasterRepository scrumMasterRepository) {
        this.scrumMasterRepository = scrumMasterRepository;
    }

    @Override
    public List<ScrumMaster> getAllScrumMasters() {
        return scrumMasterRepository.findAll();
    }

    @Override
    public ScrumMaster findById(Long id) {
        return scrumMasterRepository.findById(id).orElse(null);
    }

    @Override
    public ScrumMaster createScrumMaster(ScrumMaster scrumMaster) {
        return scrumMasterRepository.save(scrumMaster);
    }

    @Override
    public ScrumMaster updateScrumMaster(Long id, ScrumMaster newScrumMaster) {
        ScrumMaster existingScrumMaster = scrumMasterRepository.findById(id).orElse(null);

        if (existingScrumMaster != null) {
            existingScrumMaster.setName(newScrumMaster.getName());

            return scrumMasterRepository.save(existingScrumMaster);
        } else {
            return null;
        }
    }

    @Override
    public void deleteScrumMaster(Long id) {
        scrumMasterRepository.deleteById(id);
    }

}
