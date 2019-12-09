    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author Masterr}
 */
public class InstructorVO {
    
    String inId,inName, inLastName, inTypeDoc, inNumber, inSpeciality, inEge, inGender, inEmail;

    public InstructorVO(String inId, String inName,String inLastName,String inTypeDoc,String inNumber,String inSpeciality,String inEge,String inGender,String inEmail) {
        this.inId = inId;
        this.inName = inName;
        this.inLastName = inLastName;
        this.inTypeDoc = inTypeDoc;
        this.inNumber = inNumber;
        this.inSpeciality = inSpeciality;
        this.inEge = inEge;
        this.inGender = inGender;
        this.inEmail = inEmail;

    }
    public InstructorVO() {
        
    }

    public String getInId() {
        return inId;
    }

    public void setInId(String inId) {
        this.inId = inId;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    public String getInLastName() {
        return inLastName;
    }

    public void setInLastName(String inLastName) {
        this.inLastName = inLastName;
    }

    public String getInTypeDoc() {
        return inTypeDoc;
    }

    public void setInTypeDoc(String inTypeDoc) {
        this.inTypeDoc = inTypeDoc;
    }

    public String getInNumber() {
        return inNumber;
    }

    public void setInNumber(String inNumber) {
        this.inNumber = inNumber;
    }

    public String getInSpeciality() {
        return inSpeciality;
    }

    public void setInSpeciality(String inSpeciality) {
        this.inSpeciality = inSpeciality;
    }

    public String getInEge() {
        return inEge;
    }

    public void setInEge(String inEge) {
        this.inEge = inEge;
    }

    public String getInGender() {
        return inGender;
    }

    public void setInGender(String inGender) {
        this.inGender = inGender;
    }

    public String getInEmail() {
        return inEmail;
    }

    public void setInEmail(String inEmail) {
        this.inEmail = inEmail;
    }

   

    
}
