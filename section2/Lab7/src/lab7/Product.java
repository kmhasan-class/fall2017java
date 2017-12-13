/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author kmhasan
 */
class Product {
    private int productId;
    private String productName;
    private double unitPrice;
    private UnitType unitType;

    public Product(int productId, String productName, double unitPrice, UnitType unitType) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitType = unitType;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice + ", unitType=" + unitType + '}';
    }
}
