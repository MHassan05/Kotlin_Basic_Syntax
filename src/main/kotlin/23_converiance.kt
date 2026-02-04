/*
    ===========================
    COVARIANCE & CONTRAVARIANCE
    ===========================

    This entire file explains variance using ONLY code comments.
    Read top to bottom. Do not skip comments.

    Core idea first (no sugarcoating):

    - Variance answers ONE question:
      "Can Generic<TypeA> be used where Generic<TypeB> is expected?"

    - This has NOTHING to do with memory or performance.
      It is purely a TYPE-SAFETY rule checked at COMPILE TIME.

    - Kotlin uses:
        out  -> Covariance  (produce / return)
        in   -> Contravariance (consume / accept)

    If you ignore variance, the compiler WILL block you.
*/

// Base notification type
open class Notification(val msg: String)

// Specific notification
class EmailNotification(msg: String) : Notification(msg)

// Sender: ONLY accepts notifications (consumes T)
class NotificationSender<in T> {
    fun send(notification: T) {
        // sending logic
    }
}

// Provider: ONLY returns notifications (produces T)
class NotificationProvider<out T>(
    private val notification: T
) {
    fun get(): T {
        return notification
    }
}

fun main() {
    val emailProvider = NotificationProvider(
        EmailNotification("Welcome Email")
    )
    val notificationProvider: NotificationProvider<Notification> = emailProvider

    val notificationSender = NotificationSender<Notification>()
    val emailSender: NotificationSender<EmailNotification> =
        notificationSender

}

/*
    ------------------------------------
         FINAL RULES (BURN THIS IN)
    ------------------------------------

    1) Use `out` when:
       - You ONLY return T
       - Example: List<T>, Flow<T>, Producer<T>

    2) Use `in` when:
       - You ONLY accept T
       - Example: Comparator<T>, Consumer<T>

    3) Use NO keyword when:
       - You both read AND write T

    4) Variance is:
       - NOT performance-related
       - NOT memory-related
       - ONLY about compile-time type safety

    If variance feels "extra":
    That's because Kotlin prevents bugs
    that Java allows and crashes at runtime.
*/
