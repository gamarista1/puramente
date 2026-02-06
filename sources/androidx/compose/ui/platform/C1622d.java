package androidx.compose.ui.platform;

import Q0.L;
import b1.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.d  reason: case insensitive filesystem */
public final class C1622d extends C1616b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13703d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f13704e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static C1622d f13705f;

    /* renamed from: g  reason: collision with root package name */
    private static final i f13706g = i.Rtl;

    /* renamed from: h  reason: collision with root package name */
    private static final i f13707h = i.Ltr;

    /* renamed from: c  reason: collision with root package name */
    private L f13708c;

    /* renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1622d a() {
            if (C1622d.f13705f == null) {
                C1622d.f13705f = new C1622d((DefaultConstructorMarker) null);
            }
            C1622d g10 = C1622d.f13705f;
            C6496s.f(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C1622d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, i iVar) {
        L l10 = this.f13708c;
        L l11 = null;
        if (l10 == null) {
            C6496s.v("layoutResult");
            l10 = null;
        }
        int u10 = l10.u(i10);
        L l12 = this.f13708c;
        if (l12 == null) {
            C6496s.v("layoutResult");
            l12 = null;
        }
        if (iVar != l12.y(u10)) {
            L l13 = this.f13708c;
            if (l13 == null) {
                C6496s.v("layoutResult");
            } else {
                l11 = l13;
            }
            return l11.u(i10);
        }
        L l14 = this.f13708c;
        if (l14 == null) {
            C6496s.v("layoutResult");
            l14 = null;
        }
        return L.p(l14, i10, false, 2, (Object) null) - 1;
    }

    public int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            L l10 = this.f13708c;
            if (l10 == null) {
                C6496s.v("layoutResult");
                l10 = null;
            }
            i11 = l10.q(0);
        } else {
            L l11 = this.f13708c;
            if (l11 == null) {
                C6496s.v("layoutResult");
                l11 = null;
            }
            int q10 = l11.q(i10);
            if (i(q10, f13706g) == i10) {
                i11 = q10;
            } else {
                i11 = q10 + 1;
            }
        }
        L l12 = this.f13708c;
        if (l12 == null) {
            C6496s.v("layoutResult");
            l12 = null;
        }
        if (i11 >= l12.n()) {
            return null;
        }
        return c(i(i11, f13706g), i(i11, f13707h) + 1);
    }

    public int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            L l10 = this.f13708c;
            if (l10 == null) {
                C6496s.v("layoutResult");
                l10 = null;
            }
            i11 = l10.q(d().length());
        } else {
            L l11 = this.f13708c;
            if (l11 == null) {
                C6496s.v("layoutResult");
                l11 = null;
            }
            int q10 = l11.q(i10);
            if (i(q10, f13707h) + 1 == i10) {
                i11 = q10;
            } else {
                i11 = q10 - 1;
            }
        }
        if (i11 < 0) {
            return null;
        }
        return c(i(i11, f13706g), i(i11, f13707h) + 1);
    }

    public final void j(String str, L l10) {
        f(str);
        this.f13708c = l10;
    }

    private C1622d() {
    }
}
