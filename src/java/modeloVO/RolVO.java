
package modeloVO;

public class RolVO {
    
   private String rolID, usuID;

    public RolVO() {
    }

    public RolVO(String rolID, String usuID) {
        this.rolID = rolID;
        this.usuID = usuID;
    }

    public String getRolID() {
        return rolID;
    }

    public void setRolID(String rolID) {
        this.rolID = rolID;
    }

    public String getUsuID() {
        return usuID;
    }

    public void setUsuID(String usuID) {
        this.usuID = usuID;
    }
   
   
    
}
