package s;

import android.os.Bundle;

/* renamed from: s.a  reason: case insensitive filesystem */
public final class C2573a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f25748a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f25749b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f25750c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f25751d;

    /* renamed from: s.a$a  reason: collision with other inner class name */
    public static final class C0431a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f25752a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f25753b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f25754c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f25755d;

        public C2573a a() {
            return new C2573a(this.f25752a, this.f25753b, this.f25754c, this.f25755d);
        }
    }

    C2573a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f25748a = num;
        this.f25749b = num2;
        this.f25750c = num3;
        this.f25751d = num4;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f25748a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f25749b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f25750c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f25751d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
