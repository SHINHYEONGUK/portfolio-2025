package access.ex;

import java.io.IOException;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount > items.length) {
            System.out.println("상품이 장바구니에 가득 찼습니다.");
        }
        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());

    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }





    /*
    장바구니 상품 출력
    상품명: 마늘, 합계: 4000
    상품명: 상추, 합계: 12000
    전체 가격 합: 16000
    */




}
