import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    /*@Test
    fun calculatePay() {
    }*/

    @Test
    fun calculatePayMasterCard70000() {
        val prevPay = 0.00
        val cardT = "MasterCard"
        val currAmount = 3000.00
        val commision:Double = when(cardT){
            "Vk Pay" -> 0.00
            "MasterCard","Maestro" -> {
                when {
                    (currAmount + prevPay) < 75000 -> 10.01
                    else -> 0.06
                }
            }
            "Visa","Mir" -> 0.075
            else -> 0.00
        }
        assertEquals(11.01, commision, 0.0)
    }


    @Test
    fun calculateVkPay() {
        val prevPay = 0.00
        val cardT = "Vk Pay"
        val currAmount = 3000.00
        val commision:Double = when(cardT){
            "Vk Pay" -> 0.00
            "MasterCard","Maestro" -> {
                when {
                    (currAmount + prevPay) < 75000 -> 10.01
                    else -> 0.06
                }
            }
            "Visa","Mir" -> 0.075
            else -> 0.00
        }
        assertEquals(0.00, commision, 0.0)
    }


    @Test
    fun calculateVisa() {
        val prevPay = 0.00
        val cardT = "Visa"
        val currAmount = 3000.00
        val commision:Double = when(cardT){
            "Vk Pay" -> 0.00
            "MasterCard","Maestro" -> {
                when {
                    (currAmount + prevPay) < 75000 -> 10.01
                    else -> 0.06
                }
            }
            "Visa","Mir" -> 0.075
            else -> 0.00
        }
        assertEquals(0.075, commision, 0.0)
    }
}