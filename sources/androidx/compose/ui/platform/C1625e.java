package androidx.compose.ui.platform;

import Ef.m;
import O0.n;
import Q0.L;
import android.graphics.Rect;
import b1.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.e  reason: case insensitive filesystem */
public final class C1625e extends C1616b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13710f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f13711g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static C1625e f13712h;

    /* renamed from: i  reason: collision with root package name */
    private static final i f13713i = i.Rtl;

    /* renamed from: j  reason: collision with root package name */
    private static final i f13714j = i.Ltr;

    /* renamed from: c  reason: collision with root package name */
    private L f13715c;

    /* renamed from: d  reason: collision with root package name */
    private n f13716d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f13717e;

    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1625e a() {
            if (C1625e.f13712h == null) {
                C1625e.f13712h = new C1625e((DefaultConstructorMarker) null);
            }
            C1625e g10 = C1625e.f13712h;
            C6496s.f(g10, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return g10;
        }

        private a() {
        }
    }

    public /* synthetic */ C1625e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, i iVar) {
        L l10 = this.f13715c;
        L l11 = null;
        if (l10 == null) {
            C6496s.v("layoutResult");
            l10 = null;
        }
        int u10 = l10.u(i10);
        L l12 = this.f13715c;
        if (l12 == null) {
            C6496s.v("layoutResult");
            l12 = null;
        }
        if (iVar != l12.y(u10)) {
            L l13 = this.f13715c;
            if (l13 == null) {
                C6496s.v("layoutResult");
            } else {
                l11 = l13;
            }
            return l11.u(i10);
        }
        L l14 = this.f13715c;
        if (l14 == null) {
            C6496s.v("layoutResult");
            l14 = null;
        }
        return L.p(l14, i10, false, 2, (Object) null) - 1;
    }

    public int[] a(int i10) {
        int n10;
        L l10 = null;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            n nVar = this.f13716d;
            if (nVar == null) {
                C6496s.v("node");
                nVar = null;
            }
            int round = Math.round(nVar.i().h());
            int d10 = m.d(0, i10);
            L l11 = this.f13715c;
            if (l11 == null) {
                C6496s.v("layoutResult");
                l11 = null;
            }
            int q10 = l11.q(d10);
            L l12 = this.f13715c;
            if (l12 == null) {
                C6496s.v("layoutResult");
                l12 = null;
            }
            float v10 = l12.v(q10) + ((float) round);
            L l13 = this.f13715c;
            if (l13 == null) {
                C6496s.v("layoutResult");
                l13 = null;
            }
            L l14 = this.f13715c;
            if (l14 == null) {
                C6496s.v("layoutResult");
                l14 = null;
            }
            if (v10 < l13.v(l14.n() - 1)) {
                L l15 = this.f13715c;
                if (l15 == null) {
                    C6496s.v("layoutResult");
                } else {
                    l10 = l15;
                }
                n10 = l10.r(v10);
            } else {
                L l16 = this.f13715c;
                if (l16 == null) {
                    C6496s.v("layoutResult");
                } else {
                    l10 = l16;
                }
                n10 = l10.n();
            }
            return c(d10, i(n10 - 1, f13714j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int[] b(int i10) {
        int i11;
        L l10 = null;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            n nVar = this.f13716d;
            if (nVar == null) {
                C6496s.v("node");
                nVar = null;
            }
            int round = Math.round(nVar.i().h());
            int h10 = m.h(d().length(), i10);
            L l11 = this.f13715c;
            if (l11 == null) {
                C6496s.v("layoutResult");
                l11 = null;
            }
            int q10 = l11.q(h10);
            L l12 = this.f13715c;
            if (l12 == null) {
                C6496s.v("layoutResult");
                l12 = null;
            }
            float v10 = l12.v(q10) - ((float) round);
            if (v10 > 0.0f) {
                L l13 = this.f13715c;
                if (l13 == null) {
                    C6496s.v("layoutResult");
                } else {
                    l10 = l13;
                }
                i11 = l10.r(v10);
            } else {
                i11 = 0;
            }
            if (h10 == d().length() && i11 < q10) {
                i11++;
            }
            return c(i(i11, f13713i), h10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, L l10, n nVar) {
        f(str);
        this.f13715c = l10;
        this.f13716d = nVar;
    }

    private C1625e() {
        this.f13717e = new Rect();
    }
}
