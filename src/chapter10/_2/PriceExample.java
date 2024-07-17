package chapter10._2;

public class PriceExample {

    private int _quantity = 150;
    private int _itemPrice = 10000;

    public int get_quantity() {
        return _quantity;
    }

    public void set_quantity(int _quantity) {
        this._quantity = _quantity;
    }

    public int get_itemPrice() {
        return _itemPrice;
    }

    public void set_itemPrice(int _itemPrice) {
        this._itemPrice = _itemPrice;
    }

    public double getPrice(){
        return discountPrice();
    }

    private int getBasePrice() {
        int basePrice = _quantity * _itemPrice;
        return basePrice;
    }


    private double discountPrice(){
        if(getDiscountLevel() == 2) return getBasePrice() * 0.90;
        else return getBasePrice() * 0.95;
    }


    private int getDiscountLevel() {
        if (_quantity > 100) return 2;
        else return 1;
    }


}
