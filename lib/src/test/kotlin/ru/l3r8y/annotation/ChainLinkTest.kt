package ru.l3r8y.annotation

import kotlin.test.assertNotNull

class ChainLinkTest {

    @ChainLink("SomeChainName")
    fun `doesn't runs itself`() {
        assertNotNull("123")
    }
}