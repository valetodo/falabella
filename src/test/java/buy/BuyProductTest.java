package buy;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class BuyProductTest extends BaseTest {

    @Test
    public void testComprarConGifCard() {
        MainPage mainPageFalabella = MainPage.searchPage(webDriver, "falabella colombia");
        mainPageFalabella.clickNoPopupSubscribe();
        CategoryResult categoryResult =  mainPageFalabella.searchAProduct("televisor samsung");
        categoryResult.selectProduct();
        categoryResult.closeAddProductPopup();
        Assert.assertEquals(mainPageFalabella.getQuantityProductInBasket(), "1");
//        basket.addQuantityProduct();
//        basket.getTotalProductAddedOrDeleted();
//        basket.selectWarrantyDropdown();
//        basket.selectTypeWarranty();
//        CheckoutProduct checkoutProduct = basket.selectButtonGoToBuy();
//        checkoutProduct.selectDropdownListDepartamento();
//        checkoutProduct.selectDepartamento("CAQUETA");
//        checkoutProduct.selectDropdownListCiudad();
//        checkoutProduct.selectCiudad("FLORENCIA");
//        checkoutProduct.selectDropdownListBarrio();
//        checkoutProduct.selectBarrio("FLORENCIA");
//        checkoutProduct.selectButtonContinuar();
//        checkoutProduct.addAddress("calle 3 floristas");
//        checkoutProduct.addDepartmentNumber("edificio blanco / piso 4");
//        checkoutProduct.selectButtonSetDirection();
//        CheckoutPayment checkoutPayment = checkoutProduct.continueCheckToBuy();

    }
}
