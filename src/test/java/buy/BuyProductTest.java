package buy;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Basket;
import pages.CategoryResult;
import pages.MainPage;

public class BuyProductTest extends BaseTest {

    @Test
    public void testComprarConGifCard() {
        MainPage mainPageFalabella = MainPage.searchPage(webDriver, "falabella colombia");
        mainPageFalabella.clickNoPopupSubscribe();
        CategoryResult categoryResult =  mainPageFalabella.searchAProduct("televisor samsung");
        categoryResult.selectProduct();
        Basket basket = categoryResult.viewProductCard();

    }
}
