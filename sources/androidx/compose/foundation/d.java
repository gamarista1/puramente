package androidx.compose.foundation;

import B.k;
import B.l;
import J0.C0;
import O0.g;
import Y.C1500m;
import Y.C1506p;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import lf.C6514M;
import x.C2843G;
import x.C2845I;
import yf.C6787a;
import yf.C6798l;
import yf.q;
import z.w;

public abstract class d {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f12524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f12526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f12527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, g gVar, C6787a aVar) {
            super(3);
            this.f12524a = z10;
            this.f12525b = str;
            this.f12526c = gVar;
            this.f12527d = aVar;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            l lVar;
            mVar.T(-756081143);
            if (C1506p.H()) {
                C1506p.Q(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            C2843G g10 = (C2843G) mVar.m(j.a());
            if (g10 instanceof C2845I) {
                mVar.T(617140216);
                mVar.M();
                lVar = null;
            } else {
                mVar.T(617248189);
                Object A10 = mVar.A();
                if (A10 == C1500m.f10026a.a()) {
                    A10 = k.a();
                    mVar.r(A10);
                }
                lVar = (l) A10;
                mVar.M();
            }
            i a10 = d.a(i.f23074a, lVar, g10, this.f12524a, this.f12525b, this.f12526c, this.f12527d);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2843G f12528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f12530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f12531d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6787a f12532e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C2843G g10, boolean z10, String str, g gVar, C6787a aVar) {
            super(3);
            this.f12528a = g10;
            this.f12529b = z10;
            this.f12530c = str;
            this.f12531d = gVar;
            this.f12532e = aVar;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            mVar.T(-1525724089);
            if (C1506p.H()) {
                C1506p.Q(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = k.a();
                mVar.r(A10);
            }
            l lVar = (l) A10;
            i h10 = j.b(i.f23074a, lVar, this.f12528a).h(new ClickableElement(lVar, (C2845I) null, this.f12529b, this.f12530c, this.f12531d, this.f12532e, (DefaultConstructorMarker) null));
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f12533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12534b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f12535c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f12536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, g gVar, C6787a aVar) {
            super(1);
            this.f12533a = z10;
            this.f12534b = str;
            this.f12535c = gVar;
            this.f12536d = aVar;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.foundation.d$d  reason: collision with other inner class name */
    public static final class C0232d extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2843G f12537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12538b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f12539c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f12540d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6787a f12541e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f12542f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6787a f12543g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6787a f12544h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0232d(C2843G g10, boolean z10, String str, g gVar, C6787a aVar, String str2, C6787a aVar2, C6787a aVar3) {
            super(3);
            this.f12537a = g10;
            this.f12538b = z10;
            this.f12539c = str;
            this.f12540d = gVar;
            this.f12541e = aVar;
            this.f12542f = str2;
            this.f12543g = aVar2;
            this.f12544h = aVar3;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            mVar.T(-1525724089);
            if (C1506p.H()) {
                C1506p.Q(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = k.a();
                mVar.r(A10);
            }
            l lVar = (l) A10;
            i h10 = j.b(i.f23074a, lVar, this.f12537a).h(new CombinedClickableElement(lVar, (C2845I) null, this.f12538b, this.f12539c, this.f12540d, this.f12541e, this.f12542f, this.f12543g, this.f12544h, (DefaultConstructorMarker) null));
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f12545a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(J j10) {
            super(1);
            this.f12545a = j10;
        }

        /* renamed from: a */
        public final Boolean invoke(J0.B0 b02) {
            boolean z10;
            J j10 = this.f12545a;
            if (!j10.f71755a) {
                C6496s.f(b02, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                if (!((w) b02).l2()) {
                    z10 = false;
                    j10.f71755a = z10;
                    return Boolean.valueOf(!this.f12545a.f71755a);
                }
            }
            z10 = true;
            j10.f71755a = z10;
            return Boolean.valueOf(!this.f12545a.f71755a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: k0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: k0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [k0.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final k0.i a(k0.i r10, B.l r11, x.C2843G r12, boolean r13, java.lang.String r14, O0.g r15, yf.C6787a r16) {
        /*
            r1 = r11
            r2 = r12
            boolean r0 = r2 instanceof x.C2845I
            if (r0 == 0) goto L_0x0017
            x.I r2 = (x.C2845I) r2
            androidx.compose.foundation.ClickableElement r8 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r0 = r8
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0015:
            r0 = r10
            goto L_0x0058
        L_0x0017:
            if (r2 != 0) goto L_0x0028
            androidx.compose.foundation.ClickableElement r8 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r2 = 0
            r0 = r8
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0015
        L_0x0028:
            if (r1 == 0) goto L_0x0043
            k0.i$a r0 = k0.i.f23074a
            k0.i r8 = androidx.compose.foundation.j.b(r0, r11, r12)
            androidx.compose.foundation.ClickableElement r9 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r2 = 0
            r0 = r9
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            k0.i r8 = r8.h(r9)
            goto L_0x0015
        L_0x0043:
            k0.i$a r6 = k0.i.f23074a
            androidx.compose.foundation.d$b r7 = new androidx.compose.foundation.d$b
            r0 = r7
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            k0.i r8 = k0.h.c(r6, r1, r7, r0, r1)
            goto L_0x0015
        L_0x0058:
            k0.i r0 = r10.h(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.a(k0.i, B.l, x.G, boolean, java.lang.String, O0.g, yf.a):k0.i");
    }

    public static /* synthetic */ i b(i iVar, l lVar, C2843G g10, boolean z10, String str, g gVar, C6787a aVar, int i10, Object obj) {
        String str2;
        g gVar2;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i10 & 16) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        return a(iVar, lVar, g10, z11, str2, gVar2, aVar);
    }

    public static final i c(i iVar, boolean z10, String str, g gVar, C6787a aVar) {
        C6798l lVar;
        if (C1676z0.b()) {
            lVar = new c(z10, str, gVar, aVar);
        } else {
            lVar = C1676z0.a();
        }
        return h.b(iVar, lVar, new a(z10, str, gVar, aVar));
    }

    public static /* synthetic */ i d(i iVar, boolean z10, String str, g gVar, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return c(iVar, z10, str, gVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: k0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: k0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX WARNING: type inference failed for: r11v4, types: [k0.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final k0.i e(k0.i r13, B.l r14, x.C2843G r15, boolean r16, java.lang.String r17, O0.g r18, java.lang.String r19, yf.C6787a r20, yf.C6787a r21, yf.C6787a r22) {
        /*
            r1 = r14
            r2 = r15
            boolean r0 = r2 instanceof x.C2845I
            if (r0 == 0) goto L_0x0021
            x.I r2 = (x.C2845I) r2
            androidx.compose.foundation.CombinedClickableElement r11 = new androidx.compose.foundation.CombinedClickableElement
            r10 = 0
            r0 = r11
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x001e:
            r0 = r13
            goto L_0x007d
        L_0x0021:
            if (r2 != 0) goto L_0x003b
            androidx.compose.foundation.CombinedClickableElement r11 = new androidx.compose.foundation.CombinedClickableElement
            r10 = 0
            r2 = 0
            r0 = r11
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x001e
        L_0x003b:
            if (r1 == 0) goto L_0x005f
            k0.i$a r0 = k0.i.f23074a
            k0.i r11 = androidx.compose.foundation.j.b(r0, r14, r15)
            androidx.compose.foundation.CombinedClickableElement r12 = new androidx.compose.foundation.CombinedClickableElement
            r10 = 0
            r2 = 0
            r0 = r12
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            k0.i r11 = r11.h(r12)
            goto L_0x001e
        L_0x005f:
            k0.i$a r9 = k0.i.f23074a
            androidx.compose.foundation.d$d r10 = new androidx.compose.foundation.d$d
            r0 = r10
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r22
            r6 = r19
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
            r1 = 0
            k0.i r11 = k0.h.c(r9, r1, r10, r0, r1)
            goto L_0x001e
        L_0x007d:
            k0.i r0 = r13.h(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.e(k0.i, B.l, x.G, boolean, java.lang.String, O0.g, java.lang.String, yf.a, yf.a, yf.a):k0.i");
    }

    public static /* synthetic */ i f(i iVar, l lVar, C2843G g10, boolean z10, String str, g gVar, String str2, C6787a aVar, C6787a aVar2, C6787a aVar3, int i10, Object obj) {
        boolean z11;
        String str3;
        g gVar2;
        String str4;
        C6787a aVar4;
        C6787a aVar5;
        int i11 = i10;
        if ((i11 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i11 & 16) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i11 & 32) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i11 & 64) != 0) {
            aVar4 = null;
        } else {
            aVar4 = aVar;
        }
        if ((i11 & 128) != 0) {
            aVar5 = null;
        } else {
            aVar5 = aVar2;
        }
        return e(iVar, lVar, g10, z11, str3, gVar2, str4, aVar4, aVar5, aVar3);
    }

    public static final boolean g(J0.B0 b02) {
        J j10 = new J();
        C0.c(b02, w.f29060p, new e(j10));
        return j10.f71755a;
    }
}
