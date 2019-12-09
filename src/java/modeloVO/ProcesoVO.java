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
public class ProcesoVO {
    private String idnovedad;
    private String idpro;
    private String tipo;
    private String duracion;
    private String ingreso;
    private String radicado;
    private String salon;
    

    
     public ProcesoVO() {
    }
    public ProcesoVO(String idpro,String tipo, String duracion, String ingreso,String radicado,String salon) {
        this.idpro = idpro;
        this.tipo = tipo;
        this.duracion = duracion;
        this.ingreso = ingreso;
        this.radicado = radicado;
        this.salon = salon;

    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(String idnovedad) {
        this.idnovedad = idnovedad;
    }

    public String getIdpro() {
        return idpro;
    }

    public void setIdpro(String idpro) {
        this.idpro = idpro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getRadicado() {
        return radicado;
    }

    public void setRadicado(String radicado) {
        this.radicado = radicado;
    }

    
    
}
