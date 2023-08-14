package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Squad;

import java.util.List;

public interface SquadService {
    List<Squad> getAllSquads();
    Squad findById(Long id);
    Squad createSquad(Squad squad);
    Squad updateSquad(Long id, Squad squad);
    void deleteSquad(Long id);
}
