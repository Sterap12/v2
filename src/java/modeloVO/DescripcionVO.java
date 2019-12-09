package modeloVO;

public class DescripcionVO {

    private String desId;
    private String desReason;
    private String desIdPro;
    private String desDate;

    public DescripcionVO() {
    }

    public DescripcionVO(String desId, String desReason,String desIdPro, String desDate) {
        this.desId = desId;
        this.desReason = desReason;
        this.desIdPro = desIdPro;
        this.desDate = desDate;
    }

    public String getdesId() {
        return desId;
    }

    public void setdesId(String desId) {
        this.desReason = desId;
    }

    public String getdesReason() {
        return desReason;
    }

    public void setdesReason(String desReason) {
        this.desReason = desReason;
    }
    public String getdesIdPro() {
        return desIdPro;
    }

    public void setdesIdPro(String desIdPro) {
        this.desIdPro = desIdPro;
    }
    public String getdesDate() {
        return desDate;
    }

    public void setdesDate(String desDate) {
        this.desDate = desDate;
    }
}
