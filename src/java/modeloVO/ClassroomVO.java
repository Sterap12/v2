/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author sroja
 */
public class ClassroomVO {

    String ClId, Cltype, ClNumber;

    public ClassroomVO(String ClId, String Cltype, String ClNumber) {
        this.ClId = ClId;
        this.Cltype = Cltype;
        this.ClNumber = ClNumber;

    }

    public ClassroomVO() {

    }

    public String getClId() {
        return ClId;
    }

    public void setClId(String ClId) {
        this.ClId = ClId;
    }

    public String getCltype() {
        return Cltype;
    }

    public void setCltype(String Cltype) {
        this.Cltype = Cltype;
    }

    public String getClNumber() {
        return ClNumber;
    }

    public void setClNumber(String ClNumber) {
        this.ClNumber = ClNumber;
    }
    

}
