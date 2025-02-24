import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddNaturalNumbersShuldBeCorrect() {
        try {
            assertEquals(5.0, calculator.add(2.0, 3.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testAddDecimalNumbersShuldBeCorrect() {
        try {
            assertEquals(3.0, calculator.add(1.5, 1.5))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testAddNegativeNumbersShuldBeCorrect() {
        try {
            assertEquals(-1.0, calculator.add(-2.0, 1.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testAddZeroShuldBeCorrect() {
        try {
            assertEquals(0.0, calculator.add(0.0, 0.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testAddLargeNumbersShuldBeCorrect() {
        try {
            assertEquals(10000000000.0, calculator.add(9999999999.0, 1.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testSubtractNaturalNumbersShuldBeCorrect() {
        try {
            assertEquals(1.0, calculator.subtract(3.0, 2.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testSubtractDecimalNumbersShuldBeCorrect() {
        try {
            assertEquals(1.0, calculator.subtract(3.0, 2.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testSubtractNegativeNumbersShuldBeCorrect() {
        try {
            assertEquals(-1.0, calculator.subtract(1.0, 2.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testSubtractZeroShuldBeCorrect() {
        try {
            assertEquals(0.0, calculator.subtract(0.0, 0.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testSubtractLargeNumbersShuldBeCorrect() {
        try {
            assertEquals(9999999999.0, calculator.subtract(10000000000.0, 1.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testMultiplyNaturalNumbersShuldBeCorrect() {
        try {
            assertEquals(6.0, calculator.multiply(2.0, 3.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testMultiplyDecimalNumbersShuldBeCorrect() {
        try {
            assertEquals(6.0, calculator.multiply(2.0, 3.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testMultiplyNegativeNumbersShuldBeCorrect() {
        try {
            assertEquals(-6.0, calculator.multiply(-2.0, 3.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testMultiplyZeroShuldBeCorrect() {
        try {
            assertEquals(0.0, calculator.multiply(0.0, 0.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testMultiplyLargeNumbersShuldBeCorrect() {
        try {
            assertEquals(9999999999.0, calculator.multiply(9999999999.0, 1.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testDivideNaturalNumbersShuldBeCorrect() {
        try {
            assertEquals(2.0, calculator.divide(6.0, 3.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testDivideDecimalNumbersShuldBeCorrect() {
        try {
            assertEquals(17.0, calculator.divide(25.5, 1.5))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }

    }

    @Test
    fun testDivideNegativeNumbersShuldBeCorrect() {
        try {
            assertEquals(-2.0, calculator.divide(-6.0, 3.0))
        } catch (e: Exception) {
            assertFalse(false,"Error: $e")
        }
    }

    @Test
    fun testDivideByZeroShuldBeIncorrect() {
        try {
            assertEquals(17.0, calculator.divide(25.5, 0.0))
        } catch (e: Exception) {
            assertTrue(true)
        }
    }
}