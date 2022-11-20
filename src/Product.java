public class Product {

    private String productCode;
    private String Name;
    private String model;
    private Double cost;
    private Integer varType;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getVarType() {
        return varType;
    }

    public void setVarType(Integer varType) {
        this.varType = varType;
    }
}
