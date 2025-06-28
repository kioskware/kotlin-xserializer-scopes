package kioskware.xserializer.scopes

/**
 * Represents the access scope of a user in the system.
 *
 * This enum defines various levels of access that can be granted to users,
 * ranging from no access to full ownership rights.
 */
enum class AccessScope {

    /**
     * No special access rights.
     */
    None,

    /**
     * Access to basic user functionalities.
     *
     * This includes the necessary operations that a regular user can perform,
     * such as viewing content or performing basic actions.
     */
    User,

    /**
     * Access to administrative functionalities.
     *
     * This includes operations that are not sensitive but require a higher level of access than a regular user.
     */
    Admin,

    /**
     * Access to super administrative functionalities.
     * This includes sensitive operations that should only be performed by trusted users.
     */
    SuperAdmin,

    /**
     * Access to all functionalities.
     *
     * Should be granted only for system providers or owners of the system.
     */
    Owner;

}