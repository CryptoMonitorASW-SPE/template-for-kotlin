package it.unibo

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun testHelloWorld() {
        // Verify that our greeting is correct.
        val greeting = "Hello, World!"
        assertEquals("Hello, World!", greeting)
    }
}
