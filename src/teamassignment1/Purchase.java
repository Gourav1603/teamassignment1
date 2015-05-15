package teamassignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0655617
 */
class Purchase {
    private String productID;
    private int quantity;

    public Purchase(String productId, int quantity) {
        this.productID = productId;
        this.quantity = quantity;
    }
    
    public String getProductId() {
        return productID;
    }

    public void setProductId(String productId) {
        this.productID = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

