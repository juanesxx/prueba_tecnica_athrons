package dto;

import java.math.BigDecimal;

public class TransportistasDTO {
    int id, type;
    BigDecimal servicevalue;
 
    String code, name;

    public TransportistasDTO() {
    }
    


    public void Transportistas(){
        this.id=id;
        this.type=type;
        code=null;
        name=null;
         servicevalue=null;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getServicevalue() {
        return servicevalue;
    }

    public void setServicevalue(BigDecimal servicevalue) {
        this.servicevalue = servicevalue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
