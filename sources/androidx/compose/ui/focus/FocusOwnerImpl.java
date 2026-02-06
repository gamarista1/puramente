package androidx.compose.ui.focus;

import B0.c;
import J0.C1231a0;
import J0.C1239e0;
import J0.C1244j;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import a0.C1538b;
import android.view.KeyEvent;
import androidx.collection.F;
import androidx.compose.ui.focus.o;
import c1.t;
import java.util.ArrayList;
import k0.i;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6514M;
import p0.h;
import p0.l;
import p0.m;
import p0.q;
import q0.C2423i;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class FocusOwnerImpl implements p0.g {

    /* renamed from: a  reason: collision with root package name */
    private final p f13283a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13284b;

    /* renamed from: c  reason: collision with root package name */
    private final C6787a f13285c;

    /* renamed from: d  reason: collision with root package name */
    private final C6787a f13286d;

    /* renamed from: e  reason: collision with root package name */
    private final C6787a f13287e;

    /* renamed from: f  reason: collision with root package name */
    private FocusTargetNode f13288f = new FocusTargetNode();

    /* renamed from: g  reason: collision with root package name */
    private final p0.d f13289g;

    /* renamed from: h  reason: collision with root package name */
    private final q f13290h;

    /* renamed from: i  reason: collision with root package name */
    private final i f13291i;

    /* renamed from: j  reason: collision with root package name */
    private F f13292j;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13293a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                p0.a[] r0 = p0.C2384a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.a r1 = p0.C2384a.Redirected     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.a r1 = p0.C2384a.Cancelled     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                p0.a r1 = p0.C2384a.RedirectCancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                p0.a r1 = p0.C2384a.None     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f13293a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13294a = new b();

        b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* synthetic */ class c extends C6494p implements C6787a {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        public final void invoke() {
            ((FocusOwnerImpl) this.receiver).u();
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f13296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f13297c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, C6798l lVar) {
            super(1);
            this.f13295a = focusTargetNode;
            this.f13296b = focusOwnerImpl;
            this.f13297c = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean z10;
            if (C6496s.c(focusTargetNode, this.f13295a)) {
                z10 = false;
            } else if (!C6496s.c(focusTargetNode, this.f13296b.t())) {
                z10 = ((Boolean) this.f13297c.invoke(focusTargetNode)).booleanValue();
            } else {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13298a = new e();

        e() {
            super(1);
        }

        public final void a(k kVar) {
            kVar.h(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f13299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f13300b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(N n10, int i10) {
            super(1);
            this.f13299a = n10;
            this.f13300b = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean z10;
            this.f13299a.f71759a = s.k(focusTargetNode, this.f13300b);
            Boolean bool = (Boolean) this.f13299a.f71759a;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f13301a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i10) {
            super(1);
            this.f13301a = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean z10;
            Boolean k10 = s.k(focusTargetNode, this.f13301a);
            if (k10 != null) {
                z10 = k10.booleanValue();
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public FocusOwnerImpl(C6798l lVar, p pVar, C6798l lVar2, C6787a aVar, C6787a aVar2, C6787a aVar3) {
        this.f13283a = pVar;
        this.f13284b = lVar2;
        this.f13285c = aVar;
        this.f13286d = aVar2;
        this.f13287e = aVar3;
        this.f13289g = new p0.d(lVar, new c(this));
        this.f13290h = new q();
        this.f13291i = m.a(i.f23074a, e.f13298a).h(new FocusOwnerImpl$modifier$2(this));
    }

    /* access modifiers changed from: private */
    public final void u() {
        if (this.f13288f.s2() == m.Inactive) {
            this.f13285c.invoke();
        }
    }

    private final i.c v(C1244j jVar) {
        int a10 = C1239e0.a(1024) | C1239e0.a(8192);
        if (!jVar.v0().S1()) {
            G0.a.b("visitLocalDescendants called on an unattached node");
        }
        i.c v02 = jVar.v0();
        i.c cVar = null;
        if ((v02.I1() & a10) != 0) {
            for (i.c J12 = v02.J1(); J12 != null; J12 = J12.J1()) {
                if ((J12.N1() & a10) != 0) {
                    if ((C1239e0.a(1024) & J12.N1()) != 0) {
                        return cVar;
                    }
                    cVar = J12;
                }
            }
        }
        return cVar;
    }

    private final boolean x(KeyEvent keyEvent) {
        long a10 = B0.d.a(keyEvent);
        int b10 = B0.d.b(keyEvent);
        c.a aVar = B0.c.f765a;
        if (B0.c.e(b10, aVar.a())) {
            F f10 = this.f13292j;
            if (f10 == null) {
                f10 = new F(3);
                this.f13292j = f10;
            }
            f10.l(a10);
        } else if (B0.c.e(b10, aVar.b())) {
            F f11 = this.f13292j;
            if (f11 == null || !f11.a(a10)) {
                return false;
            }
            F f12 = this.f13292j;
            if (f12 != null) {
                f12.m(a10);
            }
        }
        return true;
    }

    public Boolean b(int i10, C2423i iVar, C6798l lVar) {
        FocusTargetNode b10 = t.b(this.f13288f);
        if (b10 != null) {
            o a10 = t.a(b10, i10, (t) this.f13287e.invoke());
            o.a aVar = o.f13345b;
            if (C6496s.c(a10, aVar.a())) {
                return null;
            }
            if (!C6496s.c(a10, aVar.b())) {
                return Boolean.valueOf(a10.c(lVar));
            }
        } else {
            b10 = null;
        }
        return t.e(this.f13288f, i10, (t) this.f13287e.invoke(), iVar, new d(b10, this, lVar));
    }

    public q d() {
        return this.f13290h;
    }

    public boolean e(int i10) {
        N n10 = new N();
        n10.f71759a = Boolean.FALSE;
        Boolean b10 = b(i10, (C2423i) this.f13286d.invoke(), new f(n10, i10));
        if (b10 == null || n10.f71759a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (C6496s.c(b10, bool) && C6496s.c(n10.f71759a, bool)) {
            return true;
        }
        if (!j.a(i10)) {
            return ((Boolean) this.f13284b.invoke(d.i(i10))).booleanValue();
        }
        if (!l(false, true, false, i10) || !w(i10, (C2423i) null)) {
            return false;
        }
        return true;
    }

    public boolean f(KeyEvent keyEvent) {
        C1231a0 j02;
        if (this.f13289g.b()) {
            System.out.println("FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode b10 = t.b(this.f13288f);
        if (b10 != null) {
            int a10 = C1239e0.a(131072);
            if (b10.v0().S1()) {
                i.c v02 = b10.v0();
                G m10 = C1245k.m(b10);
                while (m10 != null) {
                    if ((m10.j0().k().I1() & a10) != 0) {
                        while (v02 != null) {
                            if ((v02.N1() & a10) != 0) {
                                i.c cVar = v02;
                                C1538b bVar = null;
                                while (cVar != null) {
                                    if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                        int i10 = 0;
                                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = m22;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new C1538b(new i.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar.b(m22);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    cVar = C1245k.g(bVar);
                                }
                            }
                            v02 = v02.P1();
                        }
                    }
                    m10 = m10.n0();
                    if (m10 == null || (j02 = m10.j0()) == null) {
                        v02 = null;
                    } else {
                        v02 = j02.o();
                    }
                }
                android.support.v4.media.session.c.a((Object) null);
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
        }
        return false;
    }

    public void g(p0.b bVar) {
        this.f13289g.f(bVar);
    }

    public boolean h(KeyEvent keyEvent, C6787a aVar) {
        i.c cVar;
        C1231a0 j02;
        i.c cVar2;
        C1231a0 j03;
        i.c cVar3;
        C1231a0 j04;
        KeyEvent keyEvent2 = keyEvent;
        if (this.f13289g.b()) {
            System.out.println("FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            return false;
        } else if (!x(keyEvent)) {
            return false;
        } else {
            FocusTargetNode b10 = t.b(this.f13288f);
            if (b10 == null || (cVar = v(b10)) == null) {
                if (b10 != null) {
                    int a10 = C1239e0.a(8192);
                    if (b10.v0().S1()) {
                        i.c v02 = b10.v0();
                        G m10 = C1245k.m(b10);
                        loop0:
                        while (true) {
                            if (m10 == null) {
                                cVar3 = null;
                                break;
                            }
                            if ((m10.j0().k().I1() & a10) != 0) {
                                while (v02 != null) {
                                    if ((v02.N1() & a10) != 0) {
                                        C1538b bVar = null;
                                        cVar3 = v02;
                                        while (cVar3 != null) {
                                            if (cVar3 instanceof B0.e) {
                                                break loop0;
                                            }
                                            if ((cVar3.N1() & a10) != 0 && (cVar3 instanceof C1247m)) {
                                                int i10 = 0;
                                                for (i.c m22 = ((C1247m) cVar3).m2(); m22 != null; m22 = m22.J1()) {
                                                    if ((m22.N1() & a10) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            cVar3 = m22;
                                                        } else {
                                                            if (bVar == null) {
                                                                bVar = new C1538b(new i.c[16], 0);
                                                            }
                                                            if (cVar3 != null) {
                                                                bVar.b(cVar3);
                                                                cVar3 = null;
                                                            }
                                                            bVar.b(m22);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            cVar3 = C1245k.g(bVar);
                                        }
                                        continue;
                                    }
                                    v02 = v02.P1();
                                }
                            }
                            m10 = m10.n0();
                            if (m10 == null || (j04 = m10.j0()) == null) {
                                v02 = null;
                            } else {
                                v02 = j04.o();
                            }
                        }
                        B0.e eVar = (B0.e) cVar3;
                        if (eVar != null) {
                            cVar = eVar.v0();
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                }
                FocusTargetNode focusTargetNode = this.f13288f;
                int a11 = C1239e0.a(8192);
                if (focusTargetNode.v0().S1()) {
                    i.c P12 = focusTargetNode.v0().P1();
                    G m11 = C1245k.m(focusTargetNode);
                    loop4:
                    while (true) {
                        if (m11 == null) {
                            cVar2 = null;
                            break;
                        }
                        if ((m11.j0().k().I1() & a11) != 0) {
                            while (P12 != null) {
                                if ((P12.N1() & a11) != 0) {
                                    C1538b bVar2 = null;
                                    cVar2 = P12;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof B0.e) {
                                            break loop4;
                                        }
                                        if ((cVar2.N1() & a11) != 0 && (cVar2 instanceof C1247m)) {
                                            int i11 = 0;
                                            for (i.c m23 = ((C1247m) cVar2).m2(); m23 != null; m23 = m23.J1()) {
                                                if ((m23.N1() & a11) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVar2 = m23;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new C1538b(new i.c[16], 0);
                                                        }
                                                        if (cVar2 != null) {
                                                            bVar2.b(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        bVar2.b(m23);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        cVar2 = C1245k.g(bVar2);
                                    }
                                    continue;
                                }
                                P12 = P12.P1();
                            }
                        }
                        m11 = m11.n0();
                        if (m11 == null || (j03 = m11.j0()) == null) {
                            P12 = null;
                        } else {
                            P12 = j03.o();
                        }
                    }
                    B0.e eVar2 = (B0.e) cVar2;
                    if (eVar2 != null) {
                        cVar = eVar2.v0();
                    } else {
                        cVar = null;
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
            }
            if (cVar != null) {
                int a12 = C1239e0.a(8192);
                if (cVar.v0().S1()) {
                    i.c P13 = cVar.v0().P1();
                    G m12 = C1245k.m(cVar);
                    ArrayList arrayList = null;
                    while (m12 != null) {
                        if ((m12.j0().k().I1() & a12) != 0) {
                            while (P13 != null) {
                                if ((P13.N1() & a12) != 0) {
                                    i.c cVar4 = P13;
                                    C1538b bVar3 = null;
                                    while (cVar4 != null) {
                                        if (cVar4 instanceof B0.e) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(cVar4);
                                        } else if ((cVar4.N1() & a12) != 0 && (cVar4 instanceof C1247m)) {
                                            int i12 = 0;
                                            for (i.c m24 = ((C1247m) cVar4).m2(); m24 != null; m24 = m24.J1()) {
                                                if ((m24.N1() & a12) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        cVar4 = m24;
                                                    } else {
                                                        if (bVar3 == null) {
                                                            bVar3 = new C1538b(new i.c[16], 0);
                                                        }
                                                        if (cVar4 != null) {
                                                            bVar3.b(cVar4);
                                                            cVar4 = null;
                                                        }
                                                        bVar3.b(m24);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        cVar4 = C1245k.g(bVar3);
                                    }
                                }
                                P13 = P13.P1();
                            }
                        }
                        m12 = m12.n0();
                        if (m12 == null || (j02 = m12.j0()) == null) {
                            P13 = null;
                        } else {
                            P13 = j02.o();
                        }
                    }
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i13 = size - 1;
                                if (((B0.e) arrayList.get(size)).T0(keyEvent2)) {
                                    return true;
                                }
                                if (i13 < 0) {
                                    break;
                                }
                                size = i13;
                            }
                        }
                        C6514M m13 = C6514M.f71813a;
                    }
                    i.c v03 = cVar.v0();
                    C1538b bVar4 = null;
                    while (v03 != null) {
                        if (v03 instanceof B0.e) {
                            if (((B0.e) v03).T0(keyEvent2)) {
                                return true;
                            }
                        } else if ((v03.N1() & a12) != 0 && (v03 instanceof C1247m)) {
                            int i14 = 0;
                            for (i.c m25 = ((C1247m) v03).m2(); m25 != null; m25 = m25.J1()) {
                                if ((m25.N1() & a12) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        v03 = m25;
                                    } else {
                                        if (bVar4 == null) {
                                            bVar4 = new C1538b(new i.c[16], 0);
                                        }
                                        if (v03 != null) {
                                            bVar4.b(v03);
                                            v03 = null;
                                        }
                                        bVar4.b(m25);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        v03 = C1245k.g(bVar4);
                    }
                    if (((Boolean) aVar.invoke()).booleanValue()) {
                        return true;
                    }
                    i.c v04 = cVar.v0();
                    C1538b bVar5 = null;
                    while (v04 != null) {
                        if (v04 instanceof B0.e) {
                            if (((B0.e) v04).e1(keyEvent2)) {
                                return true;
                            }
                        } else if ((v04.N1() & a12) != 0 && (v04 instanceof C1247m)) {
                            int i15 = 0;
                            for (i.c m26 = ((C1247m) v04).m2(); m26 != null; m26 = m26.J1()) {
                                if ((m26.N1() & a12) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        v04 = m26;
                                    } else {
                                        if (bVar5 == null) {
                                            bVar5 = new C1538b(new i.c[16], 0);
                                        }
                                        if (v04 != null) {
                                            bVar5.b(v04);
                                            v04 = null;
                                        }
                                        bVar5.b(m26);
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                        v04 = C1245k.g(bVar5);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            if (((B0.e) arrayList.get(i16)).e1(keyEvent2)) {
                                return true;
                            }
                        }
                        C6514M m14 = C6514M.f71813a;
                    }
                    C6514M m15 = C6514M.f71813a;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
            }
            return false;
        }
    }

    public void i(FocusTargetNode focusTargetNode) {
        this.f13289g.e(focusTargetNode);
    }

    public boolean j(d dVar, C2423i iVar) {
        return ((Boolean) this.f13283a.invoke(dVar, iVar)).booleanValue();
    }

    public i k() {
        return this.f13291i;
    }

    public boolean l(boolean z10, boolean z11, boolean z12, int i10) {
        boolean z13;
        q d10 = d();
        b bVar = b.f13294a;
        try {
            if (d10.f25116c) {
                d10.g();
            }
            d10.f();
            if (bVar != null) {
                d10.f25115b.b(bVar);
            }
            if (!z10) {
                int i11 = a.f13293a[s.e(this.f13288f, i10).ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    z13 = false;
                    if (z13 && z12) {
                        this.f13285c.invoke();
                    }
                    return z13;
                }
            }
            z13 = s.c(this.f13288f, z10, z11);
            this.f13285c.invoke();
            return z13;
        } finally {
            d10.h();
        }
    }

    public l m() {
        return this.f13288f.s2();
    }

    public void n(h hVar) {
        this.f13289g.g(hVar);
    }

    public C2423i o() {
        FocusTargetNode b10 = t.b(this.f13288f);
        if (b10 != null) {
            return t.d(b10);
        }
        return null;
    }

    public void p() {
        q d10 = d();
        if (d10.f25116c) {
            s.c(this.f13288f, true, true);
            return;
        }
        try {
            d10.f();
            s.c(this.f13288f, true, true);
        } finally {
            d10.h();
        }
    }

    public boolean q(F0.b bVar) {
        F0.a aVar;
        int i10;
        C1231a0 j02;
        i.c cVar;
        C1231a0 j03;
        if (!this.f13289g.b()) {
            FocusTargetNode b10 = t.b(this.f13288f);
            if (b10 != null) {
                int a10 = C1239e0.a(16384);
                if (b10.v0().S1()) {
                    i.c v02 = b10.v0();
                    G m10 = C1245k.m(b10);
                    loop0:
                    while (true) {
                        if (m10 == null) {
                            cVar = null;
                            break;
                        }
                        if ((m10.j0().k().I1() & a10) != 0) {
                            while (v02 != null) {
                                if ((v02.N1() & a10) != 0) {
                                    C1538b bVar2 = null;
                                    cVar = v02;
                                    while (cVar != null) {
                                        if (cVar instanceof F0.a) {
                                            break loop0;
                                        }
                                        if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                            int i11 = 0;
                                            for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                                if ((m22.N1() & a10) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVar = m22;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new C1538b(new i.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            bVar2.b(cVar);
                                                            cVar = null;
                                                        }
                                                        bVar2.b(m22);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        cVar = C1245k.g(bVar2);
                                    }
                                    continue;
                                }
                                v02 = v02.P1();
                            }
                        }
                        m10 = m10.n0();
                        if (m10 == null || (j03 = m10.j0()) == null) {
                            v02 = null;
                        } else {
                            v02 = j03.o();
                        }
                    }
                    aVar = (F0.a) cVar;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                int a11 = C1239e0.a(16384);
                if (aVar.v0().S1()) {
                    i.c P12 = aVar.v0().P1();
                    G m11 = C1245k.m(aVar);
                    ArrayList arrayList = null;
                    while (m11 != null) {
                        if ((m11.j0().k().I1() & a11) != 0) {
                            while (P12 != null) {
                                if ((P12.N1() & a11) != 0) {
                                    i.c cVar2 = P12;
                                    C1538b bVar3 = null;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof F0.a) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(cVar2);
                                        } else if ((cVar2.N1() & a11) != 0 && (cVar2 instanceof C1247m)) {
                                            int i12 = 0;
                                            for (i.c m23 = ((C1247m) cVar2).m2(); m23 != null; m23 = m23.J1()) {
                                                if ((m23.N1() & a11) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        cVar2 = m23;
                                                    } else {
                                                        if (bVar3 == null) {
                                                            bVar3 = new C1538b(new i.c[16], 0);
                                                        }
                                                        if (cVar2 != null) {
                                                            bVar3.b(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        bVar3.b(m23);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        cVar2 = C1245k.g(bVar3);
                                    }
                                }
                                P12 = P12.P1();
                            }
                        }
                        m11 = m11.n0();
                        if (m11 == null || (j02 = m11.j0()) == null) {
                            P12 = null;
                        } else {
                            P12 = j02.o();
                        }
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i13 = i10 - 1;
                            if (((F0.a) arrayList.get(i10)).s0(bVar)) {
                                return true;
                            }
                            if (i13 < 0) {
                                break;
                            }
                            i10 = i13;
                        }
                    }
                    i.c v03 = aVar.v0();
                    C1538b bVar4 = null;
                    while (v03 != null) {
                        if (v03 instanceof F0.a) {
                            if (((F0.a) v03).s0(bVar)) {
                                return true;
                            }
                        } else if ((v03.N1() & a11) != 0 && (v03 instanceof C1247m)) {
                            int i14 = 0;
                            for (i.c m24 = ((C1247m) v03).m2(); m24 != null; m24 = m24.J1()) {
                                if ((m24.N1() & a11) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        v03 = m24;
                                    } else {
                                        if (bVar4 == null) {
                                            bVar4 = new C1538b(new i.c[16], 0);
                                        }
                                        if (v03 != null) {
                                            bVar4.b(v03);
                                            v03 = null;
                                        }
                                        bVar4.b(m24);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        v03 = C1245k.g(bVar4);
                    }
                    i.c v04 = aVar.v0();
                    C1538b bVar5 = null;
                    while (v04 != null) {
                        if (v04 instanceof F0.a) {
                            if (((F0.a) v04).J0(bVar)) {
                                return true;
                            }
                        } else if ((v04.N1() & a11) != 0 && (v04 instanceof C1247m)) {
                            int i15 = 0;
                            for (i.c m25 = ((C1247m) v04).m2(); m25 != null; m25 = m25.J1()) {
                                if ((m25.N1() & a11) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        v04 = m25;
                                    } else {
                                        if (bVar5 == null) {
                                            bVar5 = new C1538b(new i.c[16], 0);
                                        }
                                        if (v04 != null) {
                                            bVar5.b(v04);
                                            v04 = null;
                                        }
                                        bVar5.b(m25);
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                        v04 = C1245k.g(bVar5);
                    }
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            if (((F0.a) arrayList.get(i16)).J0(bVar)) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
            }
            return false;
        }
        throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
    }

    public void r(boolean z10) {
        l(z10, true, true, d.f13315b.c());
    }

    public final FocusTargetNode t() {
        return this.f13288f;
    }

    public boolean w(int i10, C2423i iVar) {
        Boolean b10 = b(i10, iVar, new g(i10));
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }
}
