package Ie;

public enum a {
    ADD_TO_CART("ADD_TO_CART"),
    ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
    VIEW_CART("VIEW_CART"),
    INITIATE_PURCHASE("INITIATE_PURCHASE"),
    ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
    PURCHASE("PURCHASE"),
    SPEND_CREDITS("SPEND_CREDITS"),
    SEARCH("SEARCH"),
    VIEW_ITEM("VIEW_ITEM"),
    VIEW_ITEMS("VIEW_ITEMS"),
    RATE("RATE"),
    SHARE("SHARE"),
    INITIATE_STREAM("INITIATE_STREAM"),
    COMPLETE_STREAM("COMPLETE_STREAM"),
    COMPLETE_REGISTRATION("COMPLETE_REGISTRATION"),
    COMPLETE_TUTORIAL("COMPLETE_TUTORIAL"),
    ACHIEVE_LEVEL("ACHIEVE_LEVEL"),
    UNLOCK_ACHIEVEMENT("UNLOCK_ACHIEVEMENT"),
    INVITE("INVITE"),
    LOGIN("LOGIN"),
    RESERVE("RESERVE"),
    SUBSCRIBE("SUBSCRIBE"),
    START_TRIAL("START_TRIAL"),
    CLICK_AD("CLICK_AD"),
    VIEW_AD("VIEW_AD");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f31851a;

    private a(String str) {
        this.f31851a = str;
    }

    public String b() {
        return this.f31851a;
    }
}
