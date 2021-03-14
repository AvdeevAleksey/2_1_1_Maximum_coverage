import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun printMyAmountСommission_MasterMaestroTest() {
        val expected = 2018
        val cardType:Int = 1
        val amountPreviousTransfer:Int = 200
        val amount:Int = 3000
        val result = printMyAmountСommission(cardType,amountPreviousTransfer,amount)
        assertEquals(expected, result)
    }
//
//    @Test
//    fun printMyAmountСommission_VisaMirTest() {
//        val expected = 3500
//        val cardType:Int = 2
//        val amountPreviousTransfer:Int = 200
//        val amount:Int = 46666
//        val result = printMyAmountСommission(cardType,amountPreviousTransfer,amount)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun printMyAmountСommission_VKTest() {
//        val expected = 0
//        val cardType:Int = 0
//        val amountPreviousTransfer:Int = 0
//        val amount:Int = 466666
//        val result = printMyAmountСommission(cardType,amountPreviousTransfer,amount)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun giveMyMasterCardMaestro_testOutOfRange() {
//        val expected = 0
//        val amountPreviousTransfer:Int = 200
//        val amount:Int = 2000
//        val result = giveMyMasterCardMaestro(amountPreviousTransfer,amount)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun giveMyMasterCardMaestro_testInRange() {
//        val expected =2018
//        val amountPreviousTransfer:Int = 500
//        val amount:Int = 2000
//        val result = giveMyMasterCardMaestro(amountPreviousTransfer,amount)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun giveMyVisaMir_testInRange() {
//        val expected = 3500
//        val amountPreviousTransfer:Int = 500
//        val amount:Int = 2000
//        val result = giveMyVisaMir(amountPreviousTransfer,amount)
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun giveMyVisaMir_testOutOfRange() {
//        val expected = 5025
//        val amountPreviousTransfer:Int = 500
//        val amount:Int = 670000
//        val result = giveMyVisaMir(amountPreviousTransfer,amount)
//        assertEquals(expected, result)
//    }

}