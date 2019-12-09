package modeloVO;
public class EstacionVO {
    
    private String  PA_Id_Sta , PA_type_Sta,PA_quantity_Sta , PA_Id_Cla,PA_Id_inv , PA_object_Sta;

    public EstacionVO(String PA_Id_Sta, String PA_type_Sta, String PA_quantity_Sta, String PA_Id_Cla, String PA_Id_inv, String PA_object_Sta) {
        this.PA_Id_Sta = PA_Id_Sta;
        this.PA_type_Sta = PA_type_Sta;
        this.PA_quantity_Sta = PA_quantity_Sta;
        this.PA_Id_Cla = PA_Id_Cla;
        this.PA_Id_inv = PA_Id_inv;
        this.PA_object_Sta = PA_object_Sta;
    }

    public EstacionVO() {
    }

    public String getPA_Id_Sta() {
        return PA_Id_Sta;
    }

    public void setPA_Id_Sta(String PA_Id_Sta) {
        this.PA_Id_Sta = PA_Id_Sta;
    }

    public String getPA_type_Sta() {
        return PA_type_Sta;
    }

    public void setPA_type_Sta(String PA_type_Sta) {
        this.PA_type_Sta = PA_type_Sta;
    }

    public String getPA_quantity_Sta() {
        return PA_quantity_Sta;
    }

    public void setPA_quantity_Sta(String PA_quantity_Sta) {
        this.PA_quantity_Sta = PA_quantity_Sta;
    }

    public String getPA_Id_Cla() {
        return PA_Id_Cla;
    }

    public void setPA_Id_Cla(String PA_Id_Cla) {
        this.PA_Id_Cla = PA_Id_Cla;
    }

    public String getPA_Id_inv() {
        return PA_Id_inv;
    }

    public void setPA_Id_inv(String PA_Id_inv) {
        this.PA_Id_inv = PA_Id_inv;
    }

    public String getPA_object_Sta() {
        return PA_object_Sta;
    }

    public void setPA_object_Sta(String PA_object_Sta) {
        this.PA_object_Sta = PA_object_Sta;
    }

    
    
}
