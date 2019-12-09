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
public class NovedadesVO {

    String nvid, usuDescri, usuType, usuFecha, usuEntrada, usuSalida, usuSalon, usuInstructor, usuproceso, usuAprendiz;

    public NovedadesVO(String nvid, String usuDescri, String usuType, String usuFecha, String usuEntrada, String usuSalida, String usuSalon, String usuInstructor, String usuproceso, String usuAprendiz) {
        this.nvid = nvid;
        this.usuDescri = usuDescri;
        this.usuType = usuType;
        this.usuFecha = usuFecha;
        this.usuEntrada = usuEntrada;
        this.usuSalida = usuSalida;
        this.usuSalon = usuSalon;
        this.usuInstructor = usuInstructor;
        this.usuproceso = usuproceso;
        this.usuAprendiz = usuAprendiz;

    }

    public NovedadesVO() {

    }

    public NovedadesVO(String nvid) {
        this.nvid = nvid;
    }

    public String getNvid() {
        return nvid;
    }

    public void setNvid(String nvid) {
        this.nvid = nvid;
    }

    public String getUsuDescri() {
        return usuDescri;
    }

    public void setUsuDescri(String usuDescri) {
        this.usuDescri = usuDescri;
    }

    public String getUsuType() {
        return usuType;
    }

    public void setUsuType(String usuType) {
        this.usuType = usuType;
    }

    public String getUsuFecha() {
        return usuFecha;
    }

    public void setUsuFecha(String usuFecha) {
        this.usuFecha = usuFecha;
    }

    public String getUsuEntrada() {
        return usuEntrada;
    }

    public void setUsuEntrada(String usuEntrada) {
        this.usuEntrada = usuEntrada;
    }

    public String getUsuSalida() {
        return usuSalida;
    }

    public void setUsuSalida(String usuSalida) {
        this.usuSalida = usuSalida;
    }

    public String getUsuSalon() {
        return usuSalon;
    }

    public void setUsuSalon(String usuSalon) {
        this.usuSalon = usuSalon;
    }

    public String getUsuInstructor() {
        return usuInstructor;
    }

    public void setUsuInstructor(String usuInstructor) {
        this.usuInstructor = usuInstructor;
    }

    public String getUsuproceso() {
        return usuproceso;
    }

    public void setUsuproceso(String usuproceso) {
        this.usuproceso = usuproceso;
    }

    public String getUsuAprendiz() {
        return usuAprendiz;
    }

    public void setUsuAprendiz(String usuAprendiz) {
        this.usuAprendiz = usuAprendiz;
    }



}
