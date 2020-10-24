package dto;

import java.math.BigDecimal;

public class PaquetesDTO {

  int id, productid, amount;
  
  String code, description;
  
  BigDecimal value;
  
  
  public void Paquetes(){
      
      this.id=id;
      this.productid=productid;
      this.amount=amount;
      
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

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
