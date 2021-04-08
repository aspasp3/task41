import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    /*@Test
    fun calculatePay() {
    }*/

    @Test
    fun calculatePayMasterCardless75000() {
        val prevPay = 0.00
        val cardT = "MasterCard"
        val currAmount = 3000.00
        val commision = calculatePay(prevPay, cardT, currAmount)
        assertEquals(0.0, commision, 0.0)
    }

    @Test
    fun calculatePayMasterCardAbove75000() {
        val prevPay = 0.00
        val cardT = "MasterCard"
        val currAmount = 80000.00
        val commision = calculatePay(prevPay, cardT, currAmount)
        assertEquals(0.06, commision, 0.0)
    }

    @Test
    fun calculateVkPay() {
        val prevPay = 0.00
        val cardT = "Vk Pay"
        val currAmount = 3000.00
        val commision = calculatePay(prevPay, cardT, currAmount)
        assertEquals(0.00, commision, 0.0)
    }


    @Test
    fun calculateVisa() {
        val prevPay = 0.00
        val cardT = "Visa"
        val currAmount = 3000.00
        val commision = calculatePay(prevPay, cardT, currAmount)
        assertEquals(0.075, commision, 0.0)
    }

    @Test
    fun calculateMir() {
        val prevPay = 0.00
        val cardT = "Mir"
        val currAmount = 3000.00
        val commision = calculatePay(prevPay, cardT, currAmount)
        assertEquals(0.075, commision, 0.0)
    }
}