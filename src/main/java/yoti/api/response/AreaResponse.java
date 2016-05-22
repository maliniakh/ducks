package yoti.api.response;


import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
public class AreaResponse {
    private BigDecimal area;

    private Long id;

    public AreaResponse(BigDecimal area, Long id) {
        this.area = area;
        this.id = id;
    }

    public AreaResponse() {
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}