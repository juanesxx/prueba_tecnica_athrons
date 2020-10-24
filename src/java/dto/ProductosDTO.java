
package dto;

import java.math.BigDecimal;

public class ProductosDTO {
    
    int id, warehouseid;
    
    String code, description;
    
    BigDecimal value;
    
    public void Productos(){
        
        this.id=id;
        this.warehouseid=warehouseid;
        
        code=null;
        description=null;
        value=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(int warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
 
    
    
}
