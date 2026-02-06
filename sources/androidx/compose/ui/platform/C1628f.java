package androidx.compose.ui.platform;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.f  reason: case insensitive filesystem */
public final class C1628f extends C1616b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13738c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static C1628f f13739d;

    /* renamed from: androidx.compose.ui.platform.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1628f a() {
            if (C1628f.f13739d == null) {
                C1628f.f13739d = new C1628f((DefaultConstructorMarker) null);
            }
            C1628f g10 = C1628f.f13739d;
            C6496s.f(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C1628f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || d().charAt(i10 - 1) == 10 || (i10 != d().length() && d().charAt(i10) != 10)) {
            return false;
        }
        return true;
    }

    private final boolean j(int i10) {
        if (d().charAt(i10) == 10 || (i10 != 0 && d().charAt(i10 - 1) != 10)) {
            return false;
        }
        return true;
    }

    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && d().charAt(i10) == 10 && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == 10 && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }

    private C1628f() {
    }
}
