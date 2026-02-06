package k3;

import Ug.K;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import androidx.compose.ui.platform.A0;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import h0.C2020d;
import i0.r;
import j3.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k3.C2157i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: k3.g  reason: case insensitive filesystem */
public abstract class C2155g {

    /* renamed from: k3.g$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2157i f23318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f23319b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2157i iVar, k kVar) {
            super(0);
            this.f23318a = iVar;
            this.f23319b = kVar;
        }

        public final void invoke() {
            this.f23318a.m(this.f23319b);
        }
    }

    /* renamed from: k3.g$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f23320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2157i f23321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2020d f23322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f23323d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2157i.b f23324e;

        /* renamed from: k3.g$b$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f23325a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k f23326b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C2157i f23327c;

            /* renamed from: k3.g$b$a$a  reason: collision with other inner class name */
            public static final class C0374a implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2157i f23328a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ k f23329b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ r f23330c;

                public C0374a(C2157i iVar, k kVar, r rVar) {
                    this.f23328a = iVar;
                    this.f23329b = kVar;
                    this.f23330c = rVar;
                }

                public void dispose() {
                    this.f23328a.p(this.f23329b);
                    this.f23330c.remove((Object) this.f23329b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, k kVar, C2157i iVar) {
                super(1);
                this.f23325a = rVar;
                this.f23326b = kVar;
                this.f23327c = iVar;
            }

            /* renamed from: a */
            public final L invoke(M m10) {
                this.f23325a.add(this.f23326b);
                return new C0374a(this.f23327c, this.f23326b, this.f23325a);
            }
        }

        /* renamed from: k3.g$b$b  reason: collision with other inner class name */
        static final class C0375b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2157i.b f23331a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k f23332b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0375b(C2157i.b bVar, k kVar) {
                super(2);
                this.f23331a = bVar;
                this.f23332b = kVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-497631156, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                    }
                    this.f23331a.Z().invoke(this.f23332b, mVar, 0);
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, C2157i iVar, C2020d dVar, r rVar, C2157i.b bVar) {
            super(2);
            this.f23320a = kVar;
            this.f23321b = iVar;
            this.f23322c = dVar;
            this.f23323d = rVar;
            this.f23324e = bVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1129586364, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
                }
                k kVar = this.f23320a;
                boolean C10 = mVar.C(this.f23320a) | mVar.S(this.f23321b);
                r rVar = this.f23323d;
                k kVar2 = this.f23320a;
                C2157i iVar = this.f23321b;
                Object A10 = mVar.A();
                if (C10 || A10 == C1500m.f10026a.a()) {
                    A10 = new a(rVar, kVar2, iVar);
                    mVar.r(A10);
                }
                P.c(kVar, (C6798l) A10, mVar, 0);
                k kVar3 = this.f23320a;
                C2158j.a(kVar3, this.f23322c, g0.c.e(-497631156, true, new C0375b(this.f23324e, kVar3), mVar, 54), mVar, 384);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.g$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1 f23334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2157i f23335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f23336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1 a12, C2157i iVar, r rVar, C6658d dVar) {
            super(2, dVar);
            this.f23334b = a12;
            this.f23335c = iVar;
            this.f23336d = rVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f23334b, this.f23335c, this.f23336d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f23333a == 0) {
                w.b(obj);
                C2157i iVar = this.f23335c;
                r rVar = this.f23336d;
                for (k kVar : C2155g.c(this.f23334b)) {
                    if (!((List) iVar.n().getValue()).contains(kVar) && !rVar.contains(kVar)) {
                        iVar.p(kVar);
                    }
                }
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: k3.g$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2157i f23337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f23338b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2157i iVar, int i10) {
            super(2);
            this.f23337a = iVar;
            this.f23338b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C2155g.a(this.f23337a, mVar, M0.a(this.f23338b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.g$e */
    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f23339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f23340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f23341c;

        /* renamed from: k3.g$e$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f23342a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1795s f23343b;

            public a(k kVar, C1795s sVar) {
                this.f23342a = kVar;
                this.f23343b = sVar;
            }

            public void dispose() {
                this.f23342a.getLifecycle().d(this.f23343b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar, boolean z10, List list) {
            super(1);
            this.f23339a = kVar;
            this.f23340b = z10;
            this.f23341c = list;
        }

        /* access modifiers changed from: private */
        public static final void c(boolean z10, List list, k kVar, C1798v vVar, C1790m.a aVar) {
            if (z10 && !list.contains(kVar)) {
                list.add(kVar);
            }
            if (aVar == C1790m.a.ON_START && !list.contains(kVar)) {
                list.add(kVar);
            }
            if (aVar == C1790m.a.ON_STOP) {
                list.remove(kVar);
            }
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            C2156h hVar = new C2156h(this.f23340b, this.f23341c, this.f23339a);
            this.f23339a.getLifecycle().a(hVar);
            return new a(this.f23339a, hVar);
        }
    }

    /* renamed from: k3.g$f */
    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f23344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Collection f23345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f23346c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list, Collection collection, int i10) {
            super(2);
            this.f23344a = list;
            this.f23345b = collection;
            this.f23346c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C2155g.d(this.f23344a, this.f23345b, mVar, M0.a(this.f23346c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(k3.C2157i r20, Y.C1500m r21, int r22) {
        /*
            r6 = r20
            r7 = r22
            r0 = 294589392(0x118f13d0, float:2.2573632E-28)
            r1 = r21
            Y.m r14 = r1.h(r0)
            r1 = r7 & 6
            r2 = 2
            r15 = 4
            if (r1 != 0) goto L_0x001f
            boolean r1 = r14.S(r6)
            if (r1 == 0) goto L_0x001b
            r1 = r15
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            r1 = r1 | r7
            r13 = r1
            goto L_0x0020
        L_0x001f:
            r13 = r7
        L_0x0020:
            r1 = r13 & 3
            if (r1 != r2) goto L_0x0030
            boolean r1 = r14.i()
            if (r1 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r14.I()
            goto L_0x013d
        L_0x0030:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x003c
            r1 = -1
            java.lang.String r2 = "androidx.navigation.compose.DialogHost (DialogHost.kt:40)"
            Y.C1506p.Q(r0, r13, r1, r2)
        L_0x003c:
            r12 = 0
            h0.d r16 = h0.C2022f.a(r14, r12)
            Xg.L r0 = r20.n()
            r11 = 0
            r10 = 1
            Y.A1 r0 = Y.p1.b(r0, r11, r14, r12, r10)
            java.util.List r1 = b(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            i0.r r1 = f(r1, r14, r12)
            java.util.List r0 = b(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            d(r1, r0, r14, r12)
            Xg.L r0 = r20.o()
            Y.A1 r9 = Y.p1.b(r0, r11, r14, r12, r10)
            java.lang.Object r0 = r14.A()
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0079
            i0.r r0 = Y.p1.f()
            r14.r(r0)
        L_0x0079:
            r8 = r0
            i0.r r8 = (i0.r) r8
            r0 = 1361037007(0x511fc6cf, float:4.2889703E10)
            r14.T(r0)
            java.util.Iterator r17 = r1.iterator()
        L_0x0086:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r17.next()
            r1 = r0
            j3.k r1 = (j3.k) r1
            j3.s r0 = r1.e()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination"
            kotlin.jvm.internal.C6496s.f(r0, r2)
            r5 = r0
            k3.i$b r5 = (k3.C2157i.b) r5
            r0 = r13 & 14
            if (r0 != r15) goto L_0x00a5
            r0 = r10
            goto L_0x00a6
        L_0x00a5:
            r0 = r12
        L_0x00a6:
            boolean r2 = r14.C(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r14.A()
            if (r0 != 0) goto L_0x00b9
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00c1
        L_0x00b9:
            k3.g$a r2 = new k3.g$a
            r2.<init>(r6, r1)
            r14.r(r2)
        L_0x00c1:
            r18 = r2
            yf.a r18 = (yf.C6787a) r18
            androidx.compose.ui.window.i r19 = r5.a0()
            k3.g$b r4 = new k3.g$b
            r0 = r4
            r2 = r20
            r3 = r16
            r11 = r4
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = 1129586364(0x43541ebc, float:212.12006)
            g0.a r0 = g0.c.e(r1, r10, r11, r14, r0)
            r1 = 384(0x180, float:5.38E-43)
            r2 = 0
            r3 = r8
            r8 = r18
            r4 = r9
            r9 = r19
            r5 = r10
            r10 = r0
            r0 = 0
            r11 = r14
            r18 = r12
            r12 = r1
            r1 = r13
            r13 = r2
            androidx.compose.ui.window.a.a(r8, r9, r10, r11, r12, r13)
            r11 = r0
            r13 = r1
            r8 = r3
            r9 = r4
            r10 = r5
            r12 = r18
            goto L_0x0086
        L_0x00fb:
            r3 = r8
            r4 = r9
            r5 = r10
            r0 = r11
            r18 = r12
            r1 = r13
            r14.M()
            java.util.Set r2 = c(r4)
            boolean r8 = r14.S(r4)
            r1 = r1 & 14
            if (r1 != r15) goto L_0x0113
            r12 = r5
            goto L_0x0115
        L_0x0113:
            r12 = r18
        L_0x0115:
            r1 = r8 | r12
            java.lang.Object r5 = r14.A()
            if (r1 != 0) goto L_0x0125
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x012d
        L_0x0125:
            k3.g$c r5 = new k3.g$c
            r5.<init>(r4, r6, r3, r0)
            r14.r(r5)
        L_0x012d:
            yf.p r5 = (yf.p) r5
            r0 = 48
            Y.P.f(r2, r3, r5, r14, r0)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x013d
            Y.C1506p.P()
        L_0x013d:
            Y.Y0 r0 = r14.k()
            if (r0 == 0) goto L_0x014b
            k3.g$d r1 = new k3.g$d
            r1.<init>(r6, r7)
            r0.a(r1)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C2155g.a(k3.i, Y.m, int):void");
    }

    private static final List b(A1 a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final Set c(A1 a12) {
        return (Set) a12.getValue();
    }

    public static final void d(List list, Collection collection, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C1500m h10 = mVar.h(1537894851);
        if ((i10 & 6) == 0) {
            if (h10.C(list)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(collection)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1537894851, i11, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean booleanValue = ((Boolean) h10.m(A0.a())).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                C1790m lifecycle = kVar.getLifecycle();
                boolean b10 = h10.b(booleanValue) | h10.C(list) | h10.C(kVar);
                Object A10 = h10.A();
                if (b10 || A10 == C1500m.f10026a.a()) {
                    A10 = new e(kVar, booleanValue, list);
                    h10.r(A10);
                }
                P.c(lifecycle, (C6798l) A10, h10, 0);
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(list, collection, i10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r1 == Y.C1500m.f10026a.a()) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final i0.r f(java.util.Collection r5, Y.C1500m r6, int r7) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            r2 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            Y.C1506p.Q(r2, r7, r0, r1)
        L_0x000f:
            Y.I0 r7 = androidx.compose.ui.platform.A0.a()
            java.lang.Object r7 = r6.m(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r0 = r6.S(r5)
            java.lang.Object r1 = r6.A()
            if (r0 != 0) goto L_0x002f
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0069
        L_0x002f:
            i0.r r1 = Y.p1.f()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x003e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r5.next()
            r3 = r2
            j3.k r3 = (j3.k) r3
            if (r7 == 0) goto L_0x004f
            r3 = 1
            goto L_0x005d
        L_0x004f:
            androidx.lifecycle.m r3 = r3.getLifecycle()
            androidx.lifecycle.m$b r3 = r3.b()
            androidx.lifecycle.m$b r4 = androidx.lifecycle.C1790m.b.STARTED
            boolean r3 = r3.b(r4)
        L_0x005d:
            if (r3 == 0) goto L_0x003e
            r0.add(r2)
            goto L_0x003e
        L_0x0063:
            r1.addAll(r0)
            r6.r(r1)
        L_0x0069:
            i0.r r1 = (i0.r) r1
            boolean r5 = Y.C1506p.H()
            if (r5 == 0) goto L_0x0074
            Y.C1506p.P()
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C2155g.f(java.util.Collection, Y.m, int):i0.r");
    }
}
