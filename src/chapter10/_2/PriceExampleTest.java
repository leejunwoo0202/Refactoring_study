package chapter10._2;

import org.junit.jupiter.api.Test;

class PriceExampleTest {

    @Test
    void priceTest(){
        PriceExample example = new PriceExample();

        example.set_quantity(200);
        example.set_itemPrice(1000);

        double result = example.getPrice();

        System.out.println("result = " + result);
    }

}