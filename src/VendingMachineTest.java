import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendingMachineTest {

    VendingMachine vendor;
    VendingMachineItem item1;
    VendingMachineItem item2;
    VendingMachineItem item3;
    VendingMachineItem item4;
    VendingMachineItem item5;
    VendingMachineItem item6;
    VendingMachineItem item7;
    VendingMachineItem item8;
    VendingMachineItem item9;
    VendingMachineItem item0;

    @BeforeEach
    void setUp() {
        vendor = new VendingMachine();
        item1 = new VendingMachineItem("Cola", 2.50);
        item2 = new VendingMachineItem("Water", 1.00);
        item3 = new VendingMachineItem("Tea", 1.50);
    }

    @AfterEach
    void tearDown() {
        vendor = null;
        item1 = null;
        item2 = null;
        item3 = null;
        item4 = null;
        item5 = null;
        item6 = null;
        item7 = null;
        item8 = null;
        item9 = null;
        item0 = null;
    }

    @Test
    void testVendingConstructor() {
        assert (vendor != null);
        assert (vendor.getBalance() == 0.0);
        assert (vendor.getItem("A") == null);
        assert (vendor.getItem("B") == null);
        assert (vendor.getItem("C") == null);
        assert (vendor.getItem("D") == null);
    }

    @Test
    void testAddItem() {

    }

    @Test
    void testGetBalance() {

    }

    @Test
    void testGetItem() {

    }

    @Test
    void testInsertMoney() {

    }

    @Test
    void testMakePurchase() {

    }

    @Test
    void testRemoveItem() {

    }

    @Test
    void testReturnChange() {

    }

    @Test
    void testItemConstructor() {
        item4 = new VendingMachineItem("Scone", 2.00);
        item5 = new VendingMachineItem("Taffy", 0.75);
        item6 = new VendingMachineItem("Juicebox", 1.75);
    }

    @Test
    void testItemConstructorNegative() {
        item7 = new VendingMachineItem("Nuts", -2.25);
        item8 = new VendingMachineItem("Antimatter", -1.00);
    }

    @Test
    void testItemConstructorZero() {
        item9 = new VendingMachineItem("Spud", -0.00);
        item0 = new VendingMachineItem("NoTea", 0.00);
    }

    @Test
    void testGetName() {

    }

    @Test
    void testGetPrice() {

    }

}
