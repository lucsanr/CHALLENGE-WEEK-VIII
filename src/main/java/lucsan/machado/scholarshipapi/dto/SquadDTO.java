package lucsan.machado.scholarshipapi.dto;

import java.util.List;

public class SquadDTO {
    private Long id;
    private String name;
    private List<StudentDTO> students;




    public SquadDTO() {
    }


    public SquadDTO(Long id, String name, List<StudentDTO> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }


}
