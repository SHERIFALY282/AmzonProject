package Scenario2;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AddToCart extends BaseTest {
    @Test
    public void checkItem(){
        var TodayPage=homePage.clickTodaysDeal();
        var ProductPage=TodayPage.ClickToProduct();
        var AddedToCard=ProductPage.AddedToCartPage();
        var Cart=AddedToCard.goToCartPage();

        String ExpectedSubTotal = AddedToCard.getExpectedSubTotal();
        String ExpectedPrice = AddedToCard.getExpectedPrice();


        String ActualSubTotal = Cart.getSubTotal();
        String ActualPrice = Cart.getPrice();
        String Qty =Cart.getQty();


        assertEquals(ActualSubTotal,ExpectedSubTotal , "Subtotal is incorrect");
        assertEquals(ActualPrice, ExpectedPrice, "Price is incorrect");
        assertTrue(Qty.contains("2 items"),"Qty is incorrect");

        System.out.println("The Actual sub total "+ActualSubTotal+ " " +"The expected sub total" + ExpectedSubTotal);
        System.out.println("The Actual price "+ ActualPrice + " " +"The expected price"+ ExpectedPrice);

    }

}
