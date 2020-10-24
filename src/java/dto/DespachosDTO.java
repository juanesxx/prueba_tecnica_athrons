package dto;
public class DespachosDTO {
   
    int id, saleid, carrierid;
    
    String code, date, guide, courier, remision, status;

    public DespachosDTO() {
    }
    
    
    public void Despachos(){
        this.id=id;
        this.saleid=saleid;
        this.carrierid=carrierid;
        code=null;
        date=null;
        guide=null;
        courier=null;
        remision=null;
        status=null;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public int getCarrierid() {
        return carrierid;
    }

    public void setCarrierid(int carrierid) {
        this.carrierid = carrierid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getRemision() {
        return remision;
    }

    public void setRemision(String remision) {
        this.remision = remision;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
