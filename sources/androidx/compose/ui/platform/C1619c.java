package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.c  reason: case insensitive filesystem */
public class C1619c extends C1616b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13691d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f13692e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static C1619c f13693f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f13694c;

    /* renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1619c a(Locale locale) {
            if (C1619c.f13693f == null) {
                C1619c.f13693f = new C1619c(locale, (DefaultConstructorMarker) null);
            }
            C1619c g10 = C1619c.f13693f;
            C6496s.f(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C1619c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f13694c = BreakIterator.getCharacterInstance(locale);
    }

    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f13694c;
            if (breakIterator == null) {
                C6496s.v("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f13694c;
                if (breakIterator2 == null) {
                    C6496s.v("impl");
                    breakIterator2 = null;
                }
                i10 = breakIterator2.following(i10);
            } else {
                BreakIterator breakIterator3 = this.f13694c;
                if (breakIterator3 == null) {
                    C6496s.v("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i10);
                if (following == -1) {
                    return null;
                }
                return c(i10, following);
            }
        } while (i10 != -1);
        return null;
    }

    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        do {
            BreakIterator breakIterator = this.f13694c;
            if (breakIterator == null) {
                C6496s.v("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f13694c;
                if (breakIterator2 == null) {
                    C6496s.v("impl");
                    breakIterator2 = null;
                }
                i10 = breakIterator2.preceding(i10);
            } else {
                BreakIterator breakIterator3 = this.f13694c;
                if (breakIterator3 == null) {
                    C6496s.v("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i10);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i10);
            }
        } while (i10 != -1);
        return null;
    }

    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f13694c;
        if (breakIterator == null) {
            C6496s.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C1619c(Locale locale) {
        i(locale);
    }
}
