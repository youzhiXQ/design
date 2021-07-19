package com.company.design.factory.construction.fruit;

public class FruitMeal {

    private Pear pear;
    private WaterMelon waterMelon;
    private int discount;
    private int total;

    public void setPear(Pear pear) {
        this.pear = pear;
    }

    public void setWaterMelon(WaterMelon waterMelon) {
        this.waterMelon = waterMelon;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    private void sum() {
        if (pear != null) {
            total += pear.price();
            System.out.println(total);
            System.out.println(pear.price);
            System.out.println(pear.price());
            System.out.println(pear.getPrice());
        }
        if (waterMelon != null) {
            total += waterMelon.price();
        }
        if (discount > 0) {
            total -= discount;
        }
        System.out.printf("这是总数：", total);
    }

    public void cost() {
        this.sum();
        // System.out.printf("这是总数：", this.total);
    }


}
