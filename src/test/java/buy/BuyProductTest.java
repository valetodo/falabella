package buy;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class BuyProductTest extends BaseTest {

    @Test
    public void testComprarConGifCard() {
        MainPage mainPageFalabella = MainPage.searchPage(webDriver, "falabella colombia");
        mainPageFalabella.clickNoPopupSubscribe();
        CategoryResult categoryResult =  mainPageFalabella.searchAProduct("televisor samsung");
        categoryResult.selectProduct();
        Basket basket = categoryResult.viewProductCard();
        basket.addQuantityProduct();
        basket.getTotalProductAddedOrDeleted();
        basket.selectWarrantyDropdown();
        basket.selectTypeWarranty();
        CheckoutProduct checkoutProduct = basket.selectButtonGoToBuy();
        checkoutProduct.selectDropdownListDepartamento();
        checkoutProduct.selectDepartamento("CAQUETA");
        checkoutProduct.selectDropdownListCiudad();
        checkoutProduct.selectCiudad("FLORENCIA");
        checkoutProduct.selectDropdownListBarrio();
        checkoutProduct.selectBarrio("FLORENCIA");
        checkoutProduct.selectButtonContinuar();
        checkoutProduct.addAddress("calle 3 floristas");
        checkoutProduct.addDepartmentNumber("edificio blanco / piso 4");
        checkoutProduct.selectButtonSetDirection();
        CheckoutPayment checkoutPayment = checkoutProduct.continueCheckToBuy();

    }
}
