package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.h  reason: case insensitive filesystem */
public final class C1634h extends C1616b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13744d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f13745e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static C1634h f13746f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f13747c;

    /* renamed from: androidx.compose.ui.platform.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1634h a(Locale locale) {
            if (C1634h.f13746f == null) {
                C1634h.f13746f = new C1634h(locale, (DefaultConstructorMarker) null);
            }
            C1634h g10 = C1634h.f13746f;
            C6496s.f(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C1634h(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || !j(i10 - 1) || (i10 != d().length() && j(i10))) {
            return false;
        }
        return true;
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        if (!j(i10) || (i10 != 0 && j(i10 - 1))) {
            return false;
        }
        return true;
    }

    private final void l(Locale locale) {
        this.f13747c = BreakIterator.getWordInstance(locale);
    }

    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f13747c;
            if (breakIterator == null) {
                C6496s.v("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f13747c;
        if (breakIterator2 == null) {
            C6496s.v("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i10);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i10, following);
    }

    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f13747c;
            if (breakIterator == null) {
                C6496s.v("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f13747c;
        if (breakIterator2 == null) {
            C6496s.v("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i10);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i10);
    }

    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f13747c;
        if (breakIterator == null) {
            C6496s.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C1634h(Locale locale) {
        l(locale);
    }
}
