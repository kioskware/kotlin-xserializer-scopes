package kioskware.xserializer.kioskware.xserializer.scopes

import kioskware.xserializer.PropertyFilter
import kioskware.xserializer.scopes.*
import kotlin.math.max

/**
 * Filters properties based on provided access scope.
 *
 * @param scope The access scope to filter properties by.
 * Only properties with lower or equal access scope will be included in serialization.
 *
 *
 * Usage example:
 *
 * ```kotlin
 * serializer.filtered(forScope(AccessScope.User))
 * ```
 */
fun forScope(scope: AccessScope) : PropertyFilter = {
    val maxScope = annotations.maxOf {
        when(it) {
            is User -> AccessScope.User
            is Admin -> AccessScope.Admin
            is SuperAdmin -> AccessScope.SuperAdmin
            is Owner -> AccessScope.Owner
            else -> AccessScope.None
        }.ordinal
    }
    // If the scope of the property is less than the maximum required scope, exclude it
    scope.ordinal >= maxScope
}