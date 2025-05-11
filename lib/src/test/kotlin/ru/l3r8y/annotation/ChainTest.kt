package ru.l3r8y.annotation

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import ru.l3r8y.runner.ChainRunner
import kotlin.test.assertNotNull

@ExtendWith(ChainRunner::class)
class ChainTest {

    @Test
    @Chain("SomeChainNameA")
    fun `runs itself A`() {
        assertNotNull("123")
    }

    @Test
    @Chain("SomeChainNameB")
    fun `runs itself B`() {
        assertNotNull("123")
    }

    @Test
    fun `doesn't run with ChainRunner`() {
        assertNotNull("321")
    }
}