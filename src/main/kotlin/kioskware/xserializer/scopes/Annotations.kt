@file:Suppress("OPT_IN_USAGE")

package kioskware.xserializer.scopes

import kotlinx.serialization.SerialInfo

/**
 * Excludes property from serialization if accessor scope is less than [AccessScope.User]
 */
@SerialInfo
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
annotation class User

/**
 * Excludes property from serialization if accessor scope is less than [AccessScope.Admin]
 */
@SerialInfo
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
annotation class Admin

/**
 * Excludes property from serialization if accessor scope is less than [AccessScope.SuperAdmin]
 */
@SerialInfo
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
annotation class SuperAdmin

/**
 * Excludes property from serialization if accessor scope is less than [AccessScope.Owner]
 */
@SerialInfo
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
annotation class Owner