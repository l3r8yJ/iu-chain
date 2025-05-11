package ru.l3r8y.annotation

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
annotation class ChainLink(val name: String)