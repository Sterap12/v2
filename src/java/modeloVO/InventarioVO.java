package modeloVO;

public class InventarioVO {

    private String invId;
    private String invType;
    private String invName;
    private String serial;
    private String identificador;
    private String modelo;
    private String salon;
    

    public InventarioVO() {
    }

    public InventarioVO(String invId, String invType, String invName, String serial, String identificador, String modelo, String salon) {
        this.invId = invId;
        this.invType = invType;
        this.invName = invName;
        this.serial = serial;
        this.identificador = identificador;
        this.modelo = modelo;
        this.salon = salon;
    }

    public String getinvId() {
        return invId;
    }

    public void setinvId(String invId) {
        this.invId = invId;
    }

    public String getinvType() {
        return invType;
    }

    public void setinvType(String invType) {
        this.invType = invType;
    }

    public String getinvName() {
        return invName;
    }

    public void setinvName(String invName) {
        this.invName = invName;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public String getInvName() {
        return invName;
    }

    public void setInvName(String invName) {
        this.invName = invName;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
