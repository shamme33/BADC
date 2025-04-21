package com.example.badc.Nazmun_Nahar;

public class CheckStock {
    private int productId;
    private int stockQuantity;
    private int price;


    public CheckStock(int productId, int stockQuantity, int price) {
        this.productId = productId;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CheckStock{" +
                "productId=" + productId +
                ", stockQuantity=" + stockQuantity +
                ", price=" + price +
                '}';
    }
}
