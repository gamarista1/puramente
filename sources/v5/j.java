package v5;

public enum j {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART("AddToCart"),
    ADDED_TO_WISHLIST("AddToWishlist"),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT("ViewContent"),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED("Purchase"),
    RATED("Rate"),
    SEARCHED("Search"),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f48796a;

    private j(String str) {
        this.f48796a = str;
    }

    public final String b() {
        return this.f48796a;
    }
}
