package uz.jtscorp.microservicechild1;

public class MessageFrom2DTO {
    private Long id;

    public MessageFrom2DTO() {
    }

    public MessageFrom2DTO(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
