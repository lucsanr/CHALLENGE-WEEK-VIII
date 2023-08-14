package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.ScrumMaster;

import java.util.List;

public interface ScrumMasterService {
    List<ScrumMaster> getAllScrumMasters();
    ScrumMaster findById(Long id);
    ScrumMaster createScrumMaster(ScrumMaster scrumMaster);
    ScrumMaster updateScrumMaster(Long id, ScrumMaster scrumMaster);
    void deleteScrumMaster(Long id);
}
