package W;

import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: W.a  reason: case insensitive filesystem */
public abstract class C1426a {

    /* renamed from: W.a$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8269a = new b();

        b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: W.a$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1798v f8270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f8271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f8272c;

        /* renamed from: W.a$c$a  reason: collision with other inner class name */
        public static final class C0175a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6787a f8273a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1798v f8274b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1795s f8275c;

            public C0175a(C6787a aVar, C1798v vVar, C1795s sVar) {
                this.f8273a = aVar;
                this.f8274b = vVar;
                this.f8275c = sVar;
            }

            public void dispose() {
                this.f8273a.invoke();
                this.f8274b.getLifecycle().d(this.f8275c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1798v vVar, C6798l lVar, C6787a aVar) {
            super(1);
            this.f8270a = vVar;
            this.f8271b = lVar;
            this.f8272c = aVar;
        }

        /* access modifiers changed from: private */
        public static final void c(C6798l lVar, C1798v vVar, C1790m.a aVar) {
            lVar.invoke(aVar);
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            C1427b bVar = new C1427b(this.f8271b);
            this.f8270a.getLifecycle().a(bVar);
            return new C0175a(this.f8272c, this.f8270a, bVar);
        }
    }

    /* renamed from: W.a$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1798v f8276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f8277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f8278c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8279d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f8280e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C1798v vVar, C6798l lVar, C6787a aVar, int i10, int i11) {
            super(2);
            this.f8276a = vVar;
            this.f8277b = lVar;
            this.f8278c = aVar;
            this.f8279d = i10;
            this.f8280e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1426a.a(this.f8276a, this.f8277b, this.f8278c, mVar, M0.a(this.f8279d | 1), this.f8280e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: W.a$e */
    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f8281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f8282b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(p pVar, AccessibilityManager accessibilityManager) {
            super(1);
            this.f8281a = pVar;
            this.f8282b = accessibilityManager;
        }

        public final void a(C1790m.a aVar) {
            if (aVar == C1790m.a.ON_RESUME) {
                this.f8281a.q(this.f8282b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1790m.a) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: W.a$f */
    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f8283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f8284b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar, AccessibilityManager accessibilityManager) {
            super(0);
            this.f8283a = pVar;
            this.f8284b = accessibilityManager;
        }

        public final void invoke() {
            this.f8283a.s(this.f8284b);
        }
    }

    /* access modifiers changed from: private */
    public static final void a(C1798v vVar, C6798l lVar, C6787a aVar, C1500m mVar, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(-1868327245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.C(vVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.C(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (h10.C(aVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146 || !h10.i()) {
            if (i16 != 0) {
                lVar = C0174a.f8268a;
            }
            if (i17 != 0) {
                aVar = b.f8269a;
            }
            if (C1506p.H()) {
                C1506p.Q(-1868327245, i12, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            boolean z11 = false;
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean C10 = z10 | h10.C(vVar);
            if ((i12 & 896) == 256) {
                z11 = true;
            }
            boolean z12 = C10 | z11;
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new c(vVar, lVar, aVar);
                h10.r(A10);
            }
            P.c(vVar, (C6798l) A10, h10, i12 & 14);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        C6798l lVar2 = lVar;
        C6787a aVar2 = aVar;
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(vVar, lVar2, aVar2, i10, i11));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.A1 c(boolean r7, boolean r8, Y.C1500m r9, int r10, int r11) {
        /*
            r0 = r11 & 1
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r7 = r1
        L_0x0006:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x000b
            r8 = r1
        L_0x000b:
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x001a
            r11 = -1
            java.lang.String r0 = "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)"
            r2 = -1771705152(0xffffffff9665ecc0, float:-1.8573178E-25)
            Y.C1506p.Q(r2, r10, r11, r0)
        L_0x001a:
            Y.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r11 = r9.m(r11)
            android.content.Context r11 = (android.content.Context) r11
            java.lang.String r0 = "accessibility"
            java.lang.Object r11 = r11.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
            kotlin.jvm.internal.C6496s.f(r11, r0)
            android.view.accessibility.AccessibilityManager r11 = (android.view.accessibility.AccessibilityManager) r11
            r0 = r10 & 14
            r0 = r0 ^ 6
            r2 = 0
            r3 = 4
            if (r0 <= r3) goto L_0x003f
            boolean r0 = r9.b(r7)
            if (r0 != 0) goto L_0x0043
        L_0x003f:
            r0 = r10 & 6
            if (r0 != r3) goto L_0x0045
        L_0x0043:
            r0 = r1
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            r3 = r10 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x0054
            boolean r3 = r9.b(r8)
            if (r3 != 0) goto L_0x005a
        L_0x0054:
            r10 = r10 & 48
            if (r10 != r4) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            r10 = r0 | r1
            java.lang.Object r0 = r9.A()
            if (r10 != 0) goto L_0x006a
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r0 != r10) goto L_0x0072
        L_0x006a:
            W.p r0 = new W.p
            r0.<init>(r7, r8)
            r9.r(r0)
        L_0x0072:
            W.p r0 = (W.p) r0
            Y.I0 r7 = X1.a.a()
            java.lang.Object r7 = r9.m(r7)
            r1 = r7
            androidx.lifecycle.v r1 = (androidx.lifecycle.C1798v) r1
            boolean r7 = r9.S(r0)
            boolean r8 = r9.C(r11)
            r7 = r7 | r8
            java.lang.Object r8 = r9.A()
            if (r7 != 0) goto L_0x0096
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x009e
        L_0x0096:
            W.a$e r8 = new W.a$e
            r8.<init>(r0, r11)
            r9.r(r8)
        L_0x009e:
            r2 = r8
            yf.l r2 = (yf.C6798l) r2
            boolean r7 = r9.S(r0)
            boolean r8 = r9.C(r11)
            r7 = r7 | r8
            java.lang.Object r8 = r9.A()
            if (r7 != 0) goto L_0x00b8
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00c0
        L_0x00b8:
            W.a$f r8 = new W.a$f
            r8.<init>(r0, r11)
            r9.r(r8)
        L_0x00c0:
            r3 = r8
            yf.a r3 = (yf.C6787a) r3
            r5 = 0
            r6 = 0
            r4 = r9
            a(r1, r2, r3, r4, r5, r6)
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x00d2
            Y.C1506p.P()
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W.C1426a.c(boolean, boolean, Y.m, int, int):Y.A1");
    }

    /* renamed from: W.a$a  reason: collision with other inner class name */
    static final class C0174a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0174a f8268a = new C0174a();

        C0174a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1790m.a) obj);
            return C6514M.f71813a;
        }

        public final void a(C1790m.a aVar) {
        }
    }
}
