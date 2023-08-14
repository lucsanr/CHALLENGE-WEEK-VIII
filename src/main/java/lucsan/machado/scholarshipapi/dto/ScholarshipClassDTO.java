package lucsan.machado.scholarshipapi.dto;

public class ScholarshipClassDTO {
    private Long id;
    private String className;
    private String status;
    private String startDate;
    private String endDate;




    public ScholarshipClassDTO() {
    }


    public ScholarshipClassDTO(Long id, String className, String status, String startDate, String endDate) {
        this.id = id;
        this.className = className;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


}
