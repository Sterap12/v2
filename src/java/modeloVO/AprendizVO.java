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
public class AprendizVO {

    String apId,apName, apLastName,  apClassNumber, apEmail,apNIT;

    public AprendizVO(String apId,String apName, String apLastName, String apClassNumber,String apEmail,  String apNIT) {
        this.apId = apId;
        this.apName = apName;
        this.apLastName = apLastName;
        this.apClassNumber = apClassNumber;
                this.apEmail = apEmail;
        this.apNIT = apNIT;

    }

    public AprendizVO() {

    }

    public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getApLastName() {
        return apLastName;
    }

    public void setApLastName(String apLastName) {
        this.apLastName = apLastName;
    }

    public String getApClassNumber() {
        return apClassNumber;
    }

    public void setApClassNumber(String apClassNumber) {
        this.apClassNumber = apClassNumber;
    }

    public String getApEmail() {
        return apEmail;
    }

    public void setApEmail(String apEmail) {
        this.apEmail = apEmail;
    }

    public String getApNIT() {
        return apNIT;
    }

    public void setApNIT(String apNIT) {
        this.apNIT = apNIT;
    }

   
   

}
