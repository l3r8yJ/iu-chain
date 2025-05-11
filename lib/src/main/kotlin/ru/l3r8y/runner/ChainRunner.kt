package ru.l3r8y.runner

import java.lang.reflect.Method
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.InvocationInterceptor
import org.junit.jupiter.api.extension.ReflectiveInvocationContext
import ru.l3r8y.annotation.Chain

class ChainRunner : InvocationInterceptor {

    override fun interceptTestMethod(
        invocation: InvocationInterceptor.Invocation<Void>,
        invocationContext: ReflectiveInvocationContext<Method>,
        extensionContext: ExtensionContext,
    ) {
        val test = invocationContext.executable
        val present: Boolean = test?.isAnnotationPresent(Chain::class.java) ?: run {
            super.interceptTestMethod(invocation, invocationContext, extensionContext)
            false
        }
        if (!present) {
            super.interceptTestMethod(invocation, invocationContext, extensionContext)
            return
        }
        invocation.proceed()

        TODO(
            """
            1. On fail find all chain links with same name
            2. Run each chain link
            3. Add an opportunity to run chain links without a failing of main chain
            4. Find way to test this thing??
            5. Write some readme maybe?
            """.trimIndent()
        )
    }
}