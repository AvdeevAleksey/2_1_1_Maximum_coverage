import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun main() {
        val expected = 2018
        val cardType:Int = 1
        val amountPreviousTransfer:Int = 200
        val amount:Int = 3000

        val result = printMyAmountСommission(cardType, amountPreviousTransfer, amount)

        assertEquals(expected, result)

    }

    @Test
    fun printMyAmountСommission(cardType: Int, amountPreviousTransfer: Int, amount: Int):Int {
        return when (cardType) {
            1 -> giveMyMasterCardMaestro(amountPreviousTransfer, amount)
            2 -> giveMyVisaMir(amount)
            else -> 0
        }
    }

    @Test
    fun giveMyMasterCardMaestro(amountPreviousTransfer:Int, amount: Int):Int {
        return when (amountPreviousTransfer) {
            in 300 until 75000 -> 0
            else -> (amount * 0.006 + 2000).toInt()
        }
    }

    @Test
    fun giveMyVisaMir(amount: Int, minCommission: Int = 3500):Int {
        return if (amount*0.0075<=minCommission) minCommission else (amount*0.0075).toInt()
    }
}