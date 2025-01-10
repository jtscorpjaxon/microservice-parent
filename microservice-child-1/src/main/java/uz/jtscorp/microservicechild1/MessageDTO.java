package uz.jtscorp.microservicechild1;

public class MessageDTO extends MessageFrom2DTO {
    private Long createdDate;

    public MessageDTO(Long id, String body, Long createdDate) {
        super(id, body);
        this.createdDate = createdDate;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
}
