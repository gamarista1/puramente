package Lb;

import Jb.h;
import Lb.B;
import Lb.v;
import Lb.y;
import Ob.j;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.a;
import com.google.firebase.database.b;
import com.google.firebase.database.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class n implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final q f51763a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Ob.f f51764b = new Ob.f(new Ob.b(), 0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Jb.h f51765c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public u f51766d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public v f51767e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Ob.j f51768f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f51769g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Qb.g f51770h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C4373g f51771i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Sb.c f51772j;

    /* renamed from: k  reason: collision with root package name */
    private final Sb.c f51773k;

    /* renamed from: l  reason: collision with root package name */
    private final Sb.c f51774l;

    /* renamed from: m  reason: collision with root package name */
    public long f51775m = 0;

    /* renamed from: n  reason: collision with root package name */
    private long f51776n = 1;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public y f51777o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public y f51778p;

    /* renamed from: q  reason: collision with root package name */
    private com.google.firebase.database.c f51779q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f51780r = false;

    /* renamed from: s  reason: collision with root package name */
    private long f51781s = 0;

    private enum A {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    /* renamed from: Lb.n$a  reason: case insensitive filesystem */
    class C4376a implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51789a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f51790b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b.e f51791c;

        C4376a(l lVar, long j10, b.e eVar) {
            this.f51789a = lVar;
            this.f51790b = j10;
            this.f51791c = eVar;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            n.this.o0("updateChildren", this.f51789a, x10);
            n.this.B(this.f51790b, this.f51789a, x10);
            n.this.F(this.f51791c, x10, this.f51789a);
        }
    }

    class b implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Tb.n f51794b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b.e f51795c;

        b(l lVar, Tb.n nVar, b.e eVar) {
            this.f51793a = lVar;
            this.f51794b = nVar;
            this.f51795c = eVar;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            n.this.o0("onDisconnect().setValue", this.f51793a, x10);
            if (x10 == null) {
                n.this.f51767e.d(this.f51793a, this.f51794b);
            }
            n.this.F(this.f51795c, x10, this.f51793a);
        }
    }

    class c implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f51798b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b.e f51799c;

        c(l lVar, Map map, b.e eVar) {
            this.f51797a = lVar;
            this.f51798b = map;
            this.f51799c = eVar;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            n.this.o0("onDisconnect().updateChildren", this.f51797a, x10);
            if (x10 == null) {
                for (Map.Entry entry : this.f51798b.entrySet()) {
                    n.this.f51767e.d(this.f51797a.t((l) entry.getKey()), (Tb.n) entry.getValue());
                }
            }
            n.this.F(this.f51799c, x10, this.f51797a);
        }
    }

    class d implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.e f51802b;

        d(l lVar, b.e eVar) {
            this.f51801a = lVar;
            this.f51802b = eVar;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            if (x10 == null) {
                n.this.f51767e.c(this.f51801a);
            }
            n.this.F(this.f51802b, x10, this.f51801a);
        }
    }

    class e implements v.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f51804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51805b;

        e(Map map, List list) {
            this.f51804a = map;
            this.f51805b = list;
        }

        public void a(l lVar, Tb.n nVar) {
            this.f51805b.addAll(n.this.f51778p.A(lVar, t.i(nVar, n.this.f51778p.J(lVar, new ArrayList()), this.f51804a)));
            l unused = n.this.b0(n.this.e(lVar, -9));
        }
    }

    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b f51808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Gb.b f51809b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f51810c;

        g(i.b bVar, Gb.b bVar2, a aVar) {
            this.f51808a = bVar;
            this.f51809b = bVar2;
            this.f51810c = aVar;
        }

        public void run() {
            this.f51808a.b(this.f51809b, false, this.f51810c);
        }
    }

    class h implements j.c {
        h() {
        }

        public void a(Ob.j jVar) {
            n.this.i0(jVar);
        }
    }

    class i implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51814b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f51815c;

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z f51817a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.google.firebase.database.a f51818b;

            a(z zVar, com.google.firebase.database.a aVar) {
                this.f51817a = zVar;
                this.f51818b = aVar;
            }

            public void run() {
                this.f51817a.f51861b.b((Gb.b) null, true, this.f51818b);
            }
        }

        i(l lVar, List list, n nVar) {
            this.f51813a = lVar;
            this.f51814b = list;
            this.f51815c = nVar;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            n.this.o0("Transaction", this.f51813a, x10);
            ArrayList arrayList = new ArrayList();
            if (x10 == null) {
                ArrayList arrayList2 = new ArrayList();
                for (z zVar : this.f51814b) {
                    A unused = zVar.f51863d = A.COMPLETED;
                    arrayList.addAll(n.this.f51778p.s(zVar.f51868i, false, false, n.this.f51764b));
                    arrayList2.add(new a(zVar, com.google.firebase.database.e.a(com.google.firebase.database.e.c(this.f51815c, zVar.f51860a), Tb.i.b(zVar.f51871l))));
                    n nVar = n.this;
                    nVar.Z(new E(nVar, zVar.f51862c, Qb.i.a(zVar.f51860a)));
                }
                n nVar2 = n.this;
                nVar2.Y(nVar2.f51768f.k(this.f51813a));
                n.this.h0();
                this.f51815c.X(arrayList);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    n.this.W((Runnable) arrayList2.get(i10));
                }
                return;
            }
            if (x10.f() == -1) {
                for (z zVar2 : this.f51814b) {
                    if (zVar2.f51863d == A.SENT_NEEDS_ABORT) {
                        A unused2 = zVar2.f51863d = A.NEEDS_ABORT;
                    } else {
                        A unused3 = zVar2.f51863d = A.RUN;
                    }
                }
            } else {
                for (z zVar3 : this.f51814b) {
                    A unused4 = zVar3.f51863d = A.NEEDS_ABORT;
                    Gb.b unused5 = zVar3.f51867h = x10;
                }
            }
            l unused6 = n.this.b0(this.f51813a);
        }
    }

    class j implements j.c {
        j() {
        }

        public void a(Ob.j jVar) {
            n.this.Y(jVar);
        }
    }

    class k implements Runnable {
        k() {
        }

        public void run() {
            n.this.G();
        }
    }

    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f51822a;

        l(z zVar) {
            this.f51822a = zVar;
        }

        public void run() {
            n nVar = n.this;
            nVar.Z(new E(nVar, this.f51822a.f51862c, Qb.i.a(this.f51822a.f51860a)));
        }
    }

    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f51824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Gb.b f51825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f51826c;

        m(z zVar, Gb.b bVar, a aVar) {
            this.f51824a = zVar;
            this.f51825b = bVar;
            this.f51826c = aVar;
        }

        public void run() {
            this.f51824a.f51861b.b(this.f51825b, false, this.f51826c);
        }
    }

    /* renamed from: Lb.n$n  reason: collision with other inner class name */
    class C0794n implements j.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f51828a;

        C0794n(List list) {
            this.f51828a = list;
        }

        public void a(Ob.j jVar) {
            n.this.D(this.f51828a, jVar);
        }
    }

    class o implements j.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f51830a;

        o(int i10) {
            this.f51830a = i10;
        }

        public boolean a(Ob.j jVar) {
            n.this.f(jVar, this.f51830a);
            return false;
        }
    }

    class p implements j.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f51832a;

        p(int i10) {
            this.f51832a = i10;
        }

        public void a(Ob.j jVar) {
            n.this.f(jVar, this.f51832a);
        }
    }

    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f51834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Gb.b f51835b;

        q(z zVar, Gb.b bVar) {
            this.f51834a = zVar;
            this.f51835b = bVar;
        }

        public void run() {
            this.f51834a.f51861b.b(this.f51835b, false, (a) null);
        }
    }

    class r implements B.b {
        r() {
        }

        public void a(String str) {
            n.this.f51772j.b("Auth token changed, triggering auth token refresh", new Object[0]);
            n.this.f51765c.p(str);
        }
    }

    class s implements B.b {
        s() {
        }

        public void a(String str) {
            n.this.f51772j.b("App check token changed, triggering app check token refresh", new Object[0]);
            n.this.f51765c.r(str);
        }
    }

    class u implements y.r {

        class a implements Jb.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y.o f51844a;

            a(y.o oVar) {
                this.f51844a = oVar;
            }

            public void a(String str, String str2) {
                n.this.X(this.f51844a.d(n.H(str, str2)));
            }
        }

        u() {
        }

        public void a(Qb.i iVar, z zVar, Jb.g gVar, y.o oVar) {
            Long l10;
            Jb.h m10 = n.this.f51765c;
            List r10 = iVar.e().r();
            Map k10 = iVar.d().k();
            if (zVar != null) {
                l10 = Long.valueOf(zVar.a());
            } else {
                l10 = null;
            }
            m10.e(r10, k10, gVar, l10, new a(oVar));
        }

        public void b(Qb.i iVar, z zVar) {
            n.this.f51765c.g(iVar.e().r(), iVar.d().k());
        }
    }

    class v implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f51846a;

        v(C c10) {
            this.f51846a = c10;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            n.this.o0("Persisted write", this.f51846a.c(), x10);
            n.this.B(this.f51846a.d(), this.f51846a.c(), x10);
        }
    }

    class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.e f51848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Gb.b f51849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.database.b f51850c;

        w(b.e eVar, Gb.b bVar, com.google.firebase.database.b bVar2) {
            this.f51848a = eVar;
            this.f51849b = bVar;
            this.f51850c = bVar2;
        }

        public void run() {
            this.f51848a.a(this.f51849b, this.f51850c);
        }
    }

    class x implements Jb.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f51853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b.e f51854c;

        x(l lVar, long j10, b.e eVar) {
            this.f51852a = lVar;
            this.f51853b = j10;
            this.f51854c = eVar;
        }

        public void a(String str, String str2) {
            Gb.b x10 = n.H(str, str2);
            n.this.o0("setValue", this.f51852a, x10);
            n.this.B(this.f51853b, this.f51852a, x10);
            n.this.F(this.f51854c, x10, this.f51852a);
        }
    }

    class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.database.h f51856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f51857b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f51858c;

        y(com.google.firebase.database.h hVar, TaskCompletionSource taskCompletionSource, n nVar) {
            this.f51856a = hVar;
            this.f51857b = taskCompletionSource;
            this.f51858c = nVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(TaskCompletionSource taskCompletionSource, a aVar, com.google.firebase.database.h hVar, n nVar, Task task) {
            List list;
            if (!taskCompletionSource.getTask().isComplete()) {
                if (task.isSuccessful()) {
                    Tb.n a10 = Tb.o.a(task.getResult());
                    Qb.i o10 = hVar.o();
                    n.this.Q(o10, true, true);
                    if (o10.g()) {
                        list = n.this.f51778p.A(o10.e(), a10);
                    } else {
                        list = n.this.f51778p.F(o10.e(), a10, n.this.M().a0(o10));
                    }
                    nVar.X(list);
                    taskCompletionSource.setResult(com.google.firebase.database.e.a(hVar.n(), Tb.i.d(a10, hVar.o().c())));
                    n.this.Q(o10, false, true);
                } else if (aVar.b()) {
                    taskCompletionSource.setResult(aVar);
                } else {
                    Exception exception = task.getException();
                    Objects.requireNonNull(exception);
                    taskCompletionSource.setException(exception);
                }
            }
        }

        public void run() {
            Tb.n N10 = n.this.f51778p.N(this.f51856a.o());
            if (N10 != null) {
                this.f51857b.setResult(com.google.firebase.database.e.a(this.f51856a.n(), Tb.i.b(N10)));
                return;
            }
            n.this.f51778p.Y(this.f51856a.o());
            a Q10 = n.this.f51778p.Q(this.f51856a);
            if (Q10.b()) {
                n.this.f0(new o(this.f51857b, Q10), 3000);
            }
            n.this.f51765c.h(this.f51856a.m().r(), this.f51856a.o().d().k()).addOnCompleteListener((Executor) ((Ob.c) n.this.f51771i.v()).c(), new p(this, this.f51857b, Q10, this.f51856a, this.f51858c));
        }
    }

    private static class z implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public l f51860a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public i.b f51861b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Gb.j f51862c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public A f51863d;

        /* renamed from: e  reason: collision with root package name */
        private long f51864e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f51865f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f51866g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Gb.b f51867h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public long f51868i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public Tb.n f51869j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public Tb.n f51870k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public Tb.n f51871l;

        /* synthetic */ z(l lVar, i.b bVar, Gb.j jVar, A a10, boolean z10, long j10, k kVar) {
            this(lVar, bVar, jVar, a10, z10, j10);
        }

        static /* synthetic */ int r(z zVar) {
            int i10 = zVar.f51866g;
            zVar.f51866g = i10 + 1;
            return i10;
        }

        /* renamed from: A */
        public int compareTo(z zVar) {
            long j10 = this.f51864e;
            long j11 = zVar.f51864e;
            if (j10 < j11) {
                return -1;
            }
            if (j10 == j11) {
                return 0;
            }
            return 1;
        }

        private z(l lVar, i.b bVar, Gb.j jVar, A a10, boolean z10, long j10) {
            this.f51860a = lVar;
            this.f51861b = bVar;
            this.f51862c = jVar;
            this.f51863d = a10;
            this.f51866g = 0;
            this.f51865f = z10;
            this.f51864e = j10;
            this.f51867h = null;
            this.f51869j = null;
            this.f51870k = null;
            this.f51871l = null;
        }
    }

    n(q qVar, C4373g gVar, com.google.firebase.database.c cVar) {
        this.f51763a = qVar;
        this.f51771i = gVar;
        this.f51779q = cVar;
        this.f51772j = gVar.q("RepoOperation");
        this.f51773k = gVar.q("Transaction");
        this.f51774l = gVar.q("DataOperation");
        this.f51770h = new Qb.g(gVar);
        g0(new k());
    }

    /* access modifiers changed from: private */
    public void B(long j10, l lVar, Gb.b bVar) {
        boolean z10;
        if (bVar == null || bVar.f() != -25) {
            if (bVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            List s10 = this.f51778p.s(j10, !z10, true, this.f51764b);
            if (s10.size() > 0) {
                b0(lVar);
            }
            X(s10);
        }
    }

    /* access modifiers changed from: private */
    public void D(List list, Ob.j jVar) {
        List list2 = (List) jVar.g();
        if (list2 != null) {
            list.addAll(list2);
        }
        jVar.c(new C0794n(list));
    }

    private List E(Ob.j jVar) {
        ArrayList arrayList = new ArrayList();
        D(arrayList, jVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void G() {
        q qVar = this.f51763a;
        this.f51765c = this.f51771i.E(new Jb.f(qVar.f51879a, qVar.f51881c, qVar.f51880b), this);
        this.f51771i.m().b(((Ob.c) this.f51771i.v()).c(), new r());
        this.f51771i.l().b(((Ob.c) this.f51771i.v()).c(), new s());
        this.f51765c.initialize();
        Nb.e t10 = this.f51771i.t(this.f51763a.f51879a);
        this.f51766d = new u();
        this.f51767e = new v();
        this.f51768f = new Ob.j();
        this.f51777o = new y(this.f51771i, new Nb.d(), new t());
        this.f51778p = new y(this.f51771i, t10, new u());
        c0(t10);
        Tb.b bVar = C4369c.f51727c;
        Boolean bool = Boolean.FALSE;
        n0(bVar, bool);
        n0(C4369c.f51728d, bool);
    }

    /* access modifiers changed from: private */
    public static Gb.b H(String str, String str2) {
        if (str != null) {
            return Gb.b.d(str, str2);
        }
        return null;
    }

    private Ob.j I(l lVar) {
        Ob.j jVar = this.f51768f;
        while (!lVar.isEmpty() && jVar.g() == null) {
            jVar = jVar.k(new l(lVar.E()));
            lVar = lVar.N();
        }
        return jVar;
    }

    private Tb.n J(l lVar) {
        return K(lVar, new ArrayList());
    }

    private Tb.n K(l lVar, List list) {
        Tb.n J10 = this.f51778p.J(lVar, list);
        if (J10 == null) {
            return Tb.g.A();
        }
        return J10;
    }

    private long L() {
        long j10 = this.f51776n;
        this.f51776n = 1 + j10;
        return j10;
    }

    private long R() {
        long j10 = this.f51781s;
        this.f51781s = 1 + j10;
        return j10;
    }

    /* access modifiers changed from: private */
    public void X(List list) {
        if (!list.isEmpty()) {
            this.f51770h.b(list);
        }
    }

    /* access modifiers changed from: private */
    public void Y(Ob.j jVar) {
        List list = (List) jVar.g();
        if (list != null) {
            int i10 = 0;
            while (i10 < list.size()) {
                if (((z) list.get(i10)).f51863d == A.COMPLETED) {
                    list.remove(i10);
                } else {
                    i10++;
                }
            }
            if (list.size() > 0) {
                jVar.j(list);
            } else {
                jVar.j((Object) null);
            }
        }
        jVar.c(new j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0033 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a0(java.util.List r27, Lb.l r28) {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r27.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r27.iterator()
        L_0x0017:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r0.next()
            Lb.n$z r4 = (Lb.n.z) r4
            long r4 = r4.f51868i
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.add(r4)
            goto L_0x0017
        L_0x002f:
            java.util.Iterator r4 = r27.iterator()
        L_0x0033:
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r4.next()
            r6 = r0
            Lb.n$z r6 = (Lb.n.z) r6
            Lb.l r0 = r6.f51860a
            r7 = r28
            Lb.l r0 = Lb.l.I(r7, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 1
            if (r0 == 0) goto L_0x0055
            r0 = r9
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            Ob.l.f(r0)
            Lb.n$A r0 = r6.f51863d
            Lb.n$A r10 = Lb.n.A.NEEDS_ABORT
            if (r0 != r10) goto L_0x0083
            Gb.b r0 = r6.f51867h
            int r5 = r0.f()
            r10 = -25
            if (r5 == r10) goto L_0x0080
            Lb.y r11 = r1.f51778p
            long r12 = r6.f51868i
            r15 = 0
            Ob.f r5 = r1.f51764b
            r14 = 1
            r16 = r5
            java.util.List r5 = r11.s(r12, r14, r15, r16)
            r8.addAll(r5)
        L_0x0080:
            r5 = r9
            goto L_0x014e
        L_0x0083:
            Lb.n$A r0 = r6.f51863d
            Lb.n$A r10 = Lb.n.A.RUN
            r11 = 0
            if (r0 != r10) goto L_0x014d
            int r0 = r6.f51866g
            r10 = 25
            if (r0 < r10) goto L_0x00ac
            java.lang.String r0 = "maxretries"
            Gb.b r0 = Gb.b.c(r0)
            Lb.y r10 = r1.f51778p
            long r11 = r6.f51868i
            r14 = 0
            Ob.f r15 = r1.f51764b
            r13 = 1
            java.util.List r5 = r10.s(r11, r13, r14, r15)
            r8.addAll(r5)
            goto L_0x0080
        L_0x00ac:
            Lb.l r0 = r6.f51860a
            Tb.n r10 = r1.K(r0, r3)
            Tb.n unused = r6.f51869j = r10
            com.google.firebase.database.f r0 = com.google.firebase.database.e.b(r10)
            com.google.firebase.database.i$b r12 = r6.f51861b     // Catch:{ all -> 0x00c5 }
            com.google.firebase.database.i$c r0 = r12.a(r0)     // Catch:{ all -> 0x00c5 }
            r12 = r11
            goto L_0x00da
        L_0x00c5:
            r0 = move-exception
            Sb.c r12 = r1.f51772j
            java.lang.String r13 = "Caught Throwable."
            r12.c(r13, r0)
            Gb.b r0 = Gb.b.b(r0)
            com.google.firebase.database.i$c r12 = com.google.firebase.database.i.a()
            r25 = r12
            r12 = r0
            r0 = r25
        L_0x00da:
            boolean r13 = r0.b()
            if (r13 == 0) goto L_0x0135
            long r15 = r6.f51868i
            java.lang.Long r9 = java.lang.Long.valueOf(r15)
            Ob.f r12 = r1.f51764b
            java.util.Map r12 = Lb.t.c(r12)
            Tb.n r0 = r0.a()
            Tb.n r10 = Lb.t.i(r0, r10, r12)
            Tb.n unused = r6.f51870k = r0
            Tb.n unused = r6.f51871l = r10
            long r12 = r26.L()
            long unused = r6.f51868i = r12
            r3.remove(r9)
            Lb.y r9 = r1.f51778p
            Lb.l r18 = r6.f51860a
            long r21 = r6.f51868i
            boolean r23 = r6.f51865f
            r24 = 0
            r17 = r9
            r19 = r0
            r20 = r10
            java.util.List r0 = r17.I(r18, r19, r20, r21, r23, r24)
            r8.addAll(r0)
            Lb.y r14 = r1.f51778p
            r18 = 0
            Ob.f r0 = r1.f51764b
            r17 = 1
            r19 = r0
            java.util.List r0 = r14.s(r15, r17, r18, r19)
            r8.addAll(r0)
            goto L_0x014d
        L_0x0135:
            Lb.y r13 = r1.f51778p
            long r14 = r6.f51868i
            r17 = 0
            Ob.f r0 = r1.f51764b
            r16 = 1
            r18 = r0
            java.util.List r0 = r13.s(r14, r16, r17, r18)
            r8.addAll(r0)
            r5 = r9
            r0 = r12
            goto L_0x014e
        L_0x014d:
            r0 = r11
        L_0x014e:
            r1.X(r8)
            if (r5 == 0) goto L_0x0033
            Lb.n$A r5 = Lb.n.A.COMPLETED
            Lb.n.A unused = r6.f51863d = r5
            Lb.l r5 = r6.f51860a
            com.google.firebase.database.b r5 = com.google.firebase.database.e.c(r1, r5)
            Tb.n r8 = r6.f51869j
            Tb.i r8 = Tb.i.b(r8)
            com.google.firebase.database.a r5 = com.google.firebase.database.e.a(r5, r8)
            Lb.n$l r8 = new Lb.n$l
            r8.<init>(r6)
            r1.g0(r8)
            Lb.n$m r8 = new Lb.n$m
            r8.<init>(r6, r0, r5)
            r2.add(r8)
            goto L_0x0033
        L_0x017e:
            Ob.j r0 = r1.f51768f
            r1.Y(r0)
        L_0x0183:
            int r0 = r2.size()
            if (r5 >= r0) goto L_0x0195
            java.lang.Object r0 = r2.get(r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.W(r0)
            int r5 = r5 + 1
            goto L_0x0183
        L_0x0195:
            r26.h0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lb.n.a0(java.util.List, Lb.l):void");
    }

    /* access modifiers changed from: private */
    public l b0(l lVar) {
        Ob.j I10 = I(lVar);
        l f10 = I10.f();
        a0(E(I10), f10);
        return f10;
    }

    private void c0(Nb.e eVar) {
        List<C> a10 = eVar.a();
        Map c10 = t.c(this.f51764b);
        long j10 = Long.MIN_VALUE;
        for (C c11 : a10) {
            v vVar = new v(c11);
            if (j10 < c11.d()) {
                j10 = c11.d();
                this.f51776n = c11.d() + 1;
                if (c11.e()) {
                    if (this.f51772j.f()) {
                        Sb.c cVar = this.f51772j;
                        cVar.b("Restoring overwrite with id " + c11.d(), new Object[0]);
                    }
                    this.f51765c.a(c11.c().r(), c11.b().K(true), vVar);
                    this.f51778p.I(c11.c(), c11.b(), t.g(c11.b(), this.f51778p, c11.c(), c10), c11.d(), true, false);
                } else {
                    if (this.f51772j.f()) {
                        Sb.c cVar2 = this.f51772j;
                        cVar2.b("Restoring merge with id " + c11.d(), new Object[0]);
                    }
                    this.f51765c.b(c11.c().r(), c11.a().z(true), vVar);
                    this.f51778p.H(c11.c(), c11.a(), t.f(c11.a(), this.f51778p, c11.c(), c10), c11.d(), false);
                }
            } else {
                throw new IllegalStateException("Write ids were not in order.");
            }
        }
    }

    /* access modifiers changed from: private */
    public l e(l lVar, int i10) {
        l f10 = I(lVar).f();
        if (this.f51773k.f()) {
            Sb.c cVar = this.f51772j;
            cVar.b("Aborting transactions for path: " + lVar + ". Affected: " + f10, new Object[0]);
        }
        Ob.j k10 = this.f51768f.k(lVar);
        k10.a(new o(i10));
        f(k10, i10);
        k10.d(new p(i10));
        return f10;
    }

    private void e0() {
        Map c10 = t.c(this.f51764b);
        ArrayList arrayList = new ArrayList();
        this.f51767e.b(l.D(), new e(c10, arrayList));
        this.f51767e = new v();
        X(arrayList);
    }

    /* access modifiers changed from: private */
    public void f(Ob.j jVar, int i10) {
        Gb.b bVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Ob.j jVar2 = jVar;
        int i11 = i10;
        List list = (List) jVar.g();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList<Runnable> arrayList2 = new ArrayList<>();
            if (i11 == -9) {
                bVar = Gb.b.c("overriddenBySet");
            } else {
                if (i11 == -25) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Ob.l.g(z13, "Unknown transaction abort reason: " + i11);
                bVar = Gb.b.a(-25);
            }
            int i12 = -1;
            for (int i13 = 0; i13 < list.size(); i13++) {
                z zVar = (z) list.get(i13);
                A j10 = zVar.f51863d;
                A a10 = A.SENT_NEEDS_ABORT;
                if (j10 != a10) {
                    if (zVar.f51863d == A.SENT) {
                        if (i12 == i13 - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        Ob.l.f(z12);
                        A unused = zVar.f51863d = a10;
                        Gb.b unused2 = zVar.f51867h = bVar;
                        i12 = i13;
                    } else {
                        if (zVar.f51863d == A.RUN) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Ob.l.f(z10);
                        Z(new E(this, zVar.f51862c, Qb.i.a(zVar.f51860a)));
                        if (i11 == -9) {
                            arrayList.addAll(this.f51778p.s(zVar.f51868i, true, false, this.f51764b));
                        } else {
                            if (i11 == -25) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            Ob.l.g(z11, "Unknown transaction abort reason: " + i11);
                        }
                        arrayList2.add(new q(zVar, bVar));
                    }
                }
            }
            if (i12 == -1) {
                jVar2.j((Object) null);
            } else {
                jVar2.j(list.subList(0, i12 + 1));
            }
            X(arrayList);
            for (Runnable W10 : arrayList2) {
                W(W10);
            }
        }
    }

    /* access modifiers changed from: private */
    public void h0() {
        Ob.j jVar = this.f51768f;
        Y(jVar);
        i0(jVar);
    }

    /* access modifiers changed from: private */
    public void i0(Ob.j jVar) {
        boolean z10;
        if (((List) jVar.g()) != null) {
            List E10 = E(jVar);
            if (E10.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Ob.l.f(z10);
            Boolean bool = Boolean.TRUE;
            Iterator it = E10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((z) it.next()).f51863d != A.RUN) {
                        bool = Boolean.FALSE;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (bool.booleanValue()) {
                j0(E10, jVar.f());
            }
        } else if (jVar.h()) {
            jVar.c(new h());
        }
    }

    private void j0(List list, l lVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((z) it.next()).f51868i));
        }
        Tb.n K10 = K(lVar, arrayList);
        if (!this.f51769g) {
            str = K10.M();
        } else {
            str = "badhash";
        }
        Iterator it2 = list.iterator();
        while (true) {
            boolean z10 = true;
            if (it2.hasNext()) {
                z zVar = (z) it2.next();
                if (zVar.f51863d != A.RUN) {
                    z10 = false;
                }
                Ob.l.f(z10);
                A unused = zVar.f51863d = A.SENT;
                z.r(zVar);
                K10 = K10.Y(l.I(lVar, zVar.f51860a), zVar.f51870k);
            } else {
                this.f51765c.j(lVar.r(), K10.K(true), str, new i(lVar, list, this));
                return;
            }
        }
    }

    private void n0(Tb.b bVar, Object obj) {
        if (bVar.equals(C4369c.f51726b)) {
            this.f51764b.b(((Long) obj).longValue());
        }
        l lVar = new l(C4369c.f51725a, bVar);
        try {
            Tb.n a10 = Tb.o.a(obj);
            this.f51766d.c(lVar, a10);
            X(this.f51777o.A(lVar, a10));
        } catch (Gb.c e10) {
            this.f51772j.c("Failed to parse info update", e10);
        }
    }

    /* access modifiers changed from: private */
    public void o0(String str, l lVar, Gb.b bVar) {
        if (bVar != null && bVar.f() != -1 && bVar.f() != -25) {
            Sb.c cVar = this.f51772j;
            cVar.i(str + " at " + lVar.toString() + " failed: " + bVar.toString());
        }
    }

    public void C(C4375i iVar) {
        List list;
        Tb.b E10 = iVar.e().e().E();
        if (E10 == null || !E10.equals(C4369c.f51725a)) {
            list = this.f51778p.t(iVar);
        } else {
            list = this.f51777o.t(iVar);
        }
        X(list);
    }

    /* access modifiers changed from: package-private */
    public void F(b.e eVar, Gb.b bVar, l lVar) {
        com.google.firebase.database.b bVar2;
        if (eVar != null) {
            Tb.b C10 = lVar.C();
            if (C10 == null || !C10.p()) {
                bVar2 = com.google.firebase.database.e.c(this, lVar);
            } else {
                bVar2 = com.google.firebase.database.e.c(this, lVar.H());
            }
            W(new w(eVar, bVar, bVar2));
        }
    }

    /* access modifiers changed from: package-private */
    public y M() {
        return this.f51778p;
    }

    public Task N(com.google.firebase.database.h hVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g0(new y(hVar, taskCompletionSource, this));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public void O() {
        this.f51765c.k("repo_interrupt");
    }

    public void P(Qb.i iVar, boolean z10) {
        Q(iVar, z10, false);
    }

    public void Q(Qb.i iVar, boolean z10, boolean z11) {
        boolean z12;
        if (iVar.e().isEmpty() || !iVar.e().E().equals(C4369c.f51725a)) {
            z12 = true;
        } else {
            z12 = false;
        }
        Ob.l.f(z12);
        this.f51778p.O(iVar, z10, z11);
    }

    public void S(l lVar, b.e eVar) {
        this.f51765c.i(lVar.r(), new d(lVar, eVar));
    }

    public void T(l lVar, Tb.n nVar, b.e eVar) {
        this.f51765c.l(lVar.r(), nVar.K(true), new b(lVar, nVar, eVar));
    }

    public void U(l lVar, Map map, b.e eVar, Map map2) {
        this.f51765c.c(lVar.r(), map2, new c(lVar, map, eVar));
    }

    public void V(Tb.b bVar, Object obj) {
        n0(bVar, obj);
    }

    public void W(Runnable runnable) {
        this.f51771i.F();
        this.f51771i.o().b(runnable);
    }

    public void Z(C4375i iVar) {
        List list;
        if (C4369c.f51725a.equals(iVar.e().e().E())) {
            list = this.f51777o.U(iVar);
        } else {
            list = this.f51778p.U(iVar);
        }
        X(list);
    }

    public void a(List list, Object obj, boolean z10, Long l10) {
        List list2;
        l lVar = new l(list);
        if (this.f51772j.f()) {
            this.f51772j.b("onDataUpdate: " + lVar, new Object[0]);
        }
        if (this.f51774l.f()) {
            this.f51772j.b("onDataUpdate: " + lVar + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + obj, new Object[0]);
        }
        this.f51775m++;
        if (l10 != null) {
            try {
                z zVar = new z(l10.longValue());
                if (z10) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new l((String) entry.getKey()), Tb.o.a(entry.getValue()));
                    }
                    list2 = this.f51778p.E(lVar, hashMap, zVar);
                } else {
                    list2 = this.f51778p.F(lVar, Tb.o.a(obj), zVar);
                }
            } catch (Gb.c e10) {
                this.f51772j.c("FIREBASE INTERNAL ERROR", e10);
                return;
            }
        } else if (z10) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                hashMap2.put(new l((String) entry2.getKey()), Tb.o.a(entry2.getValue()));
            }
            list2 = this.f51778p.z(lVar, hashMap2);
        } else {
            list2 = this.f51778p.A(lVar, Tb.o.a(obj));
        }
        if (list2.size() > 0) {
            b0(lVar);
        }
        X(list2);
    }

    public void b(boolean z10) {
        V(C4369c.f51727c, Boolean.valueOf(z10));
    }

    public void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            n0(Tb.b.e((String) entry.getKey()), entry.getValue());
        }
    }

    public void d(List list, List list2, Long l10) {
        List list3;
        l lVar = new l(list);
        if (this.f51772j.f()) {
            this.f51772j.b("onRangeMergeUpdate: " + lVar, new Object[0]);
        }
        if (this.f51774l.f()) {
            this.f51772j.b("onRangeMergeUpdate: " + lVar + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + list2, new Object[0]);
        }
        this.f51775m++;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Tb.s((Jb.o) it.next()));
        }
        if (l10 != null) {
            list3 = this.f51778p.G(lVar, arrayList, new z(l10.longValue()));
        } else {
            list3 = this.f51778p.B(lVar, arrayList);
        }
        if (list3.size() > 0) {
            b0(lVar);
        }
        X(list3);
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        this.f51765c.n("repo_interrupt");
    }

    public void f0(Runnable runnable, long j10) {
        this.f51771i.F();
        this.f51771i.v().schedule(runnable, j10);
    }

    public void g0(Runnable runnable) {
        this.f51771i.F();
        this.f51771i.v().b(runnable);
    }

    public void k0(l lVar, Tb.n nVar, b.e eVar) {
        if (this.f51772j.f()) {
            Sb.c cVar = this.f51772j;
            cVar.b("set: " + lVar, new Object[0]);
        }
        if (this.f51774l.f()) {
            Sb.c cVar2 = this.f51774l;
            cVar2.b("set: " + lVar + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + nVar, new Object[0]);
        }
        Tb.n i10 = t.i(nVar, this.f51778p.J(lVar, new ArrayList()), t.c(this.f51764b));
        long L10 = L();
        X(this.f51778p.I(lVar, nVar, i10, L10, true, true));
        this.f51765c.a(lVar.r(), nVar.K(true), new x(lVar, L10, eVar));
        b0(e(lVar, -9));
    }

    public void l0(l lVar, i.b bVar, boolean z10) {
        Gb.b bVar2;
        i.c cVar;
        if (this.f51772j.f()) {
            this.f51772j.b("transaction: " + lVar, new Object[0]);
        }
        if (this.f51774l.f()) {
            this.f51772j.b("transaction: " + lVar, new Object[0]);
        }
        if (this.f51771i.C() && !this.f51780r) {
            this.f51780r = true;
            this.f51773k.e("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        com.google.firebase.database.b c10 = com.google.firebase.database.e.c(this, lVar);
        f fVar = new f();
        C(new E(this, fVar, c10.o()));
        z zVar = new z(lVar, bVar, fVar, A.INITIALIZING, z10, R(), (k) null);
        Tb.n J10 = J(lVar);
        Tb.n unused = zVar.f51869j = J10;
        try {
            cVar = bVar.a(com.google.firebase.database.e.b(J10));
            if (cVar != null) {
                bVar2 = null;
                if (!cVar.b()) {
                    Tb.n unused2 = zVar.f51870k = null;
                    Tb.n unused3 = zVar.f51871l = null;
                    W(new g(bVar, bVar2, com.google.firebase.database.e.a(c10, Tb.i.b(zVar.f51869j))));
                    return;
                }
                A unused4 = zVar.f51863d = A.RUN;
                Ob.j k10 = this.f51768f.k(lVar);
                List list = (List) k10.g();
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(zVar);
                k10.j(list);
                Map c11 = t.c(this.f51764b);
                Tb.n a10 = cVar.a();
                Tb.n i10 = t.i(a10, zVar.f51869j, c11);
                Tb.n unused5 = zVar.f51870k = a10;
                Tb.n unused6 = zVar.f51871l = i10;
                long unused7 = zVar.f51868i = L();
                X(this.f51778p.I(lVar, a10, i10, zVar.f51868i, z10, false));
                h0();
                return;
            }
            throw new NullPointerException("Transaction returned null as result");
        } catch (Throwable th2) {
            this.f51772j.c("Caught Throwable.", th2);
            bVar2 = Gb.b.b(th2);
            cVar = com.google.firebase.database.i.a();
        }
    }

    public void m0(l lVar, C4368b bVar, b.e eVar, Map map) {
        l lVar2 = lVar;
        Map map2 = map;
        if (this.f51772j.f()) {
            Sb.c cVar = this.f51772j;
            cVar.b("update: " + lVar2, new Object[0]);
        }
        if (this.f51774l.f()) {
            Sb.c cVar2 = this.f51774l;
            cVar2.b("update: " + lVar2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + map2, new Object[0]);
        }
        if (bVar.isEmpty()) {
            if (this.f51772j.f()) {
                this.f51772j.b("update called with no changes. No-op", new Object[0]);
            }
            F(eVar, (Gb.b) null, lVar2);
            return;
        }
        C4368b bVar2 = bVar;
        C4368b f10 = t.f(bVar2, this.f51778p, lVar2, t.c(this.f51764b));
        long L10 = L();
        X(this.f51778p.H(lVar, bVar, f10, L10, true));
        this.f51765c.b(lVar.r(), map2, new C4376a(lVar, L10, eVar));
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            b0(e(lVar2.t((l) ((Map.Entry) it.next()).getKey()), -9));
        }
    }

    public void onConnect() {
        V(C4369c.f51728d, Boolean.TRUE);
    }

    public void onDisconnect() {
        V(C4369c.f51728d, Boolean.FALSE);
        e0();
    }

    public String toString() {
        return this.f51763a.toString();
    }

    class f implements Gb.j {
        f() {
        }

        public void a(Gb.b bVar) {
        }

        public void b(a aVar) {
        }
    }

    class t implements y.r {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Qb.i f51840a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ y.o f51841b;

            a(Qb.i iVar, y.o oVar) {
                this.f51840a = iVar;
                this.f51841b = oVar;
            }

            public void run() {
                Tb.n a10 = n.this.f51766d.a(this.f51840a.e());
                if (!a10.isEmpty()) {
                    n.this.X(n.this.f51777o.A(this.f51840a.e(), a10));
                    this.f51841b.d((Gb.b) null);
                }
            }
        }

        t() {
        }

        public void a(Qb.i iVar, z zVar, Jb.g gVar, y.o oVar) {
            n.this.g0(new a(iVar, oVar));
        }

        public void b(Qb.i iVar, z zVar) {
        }
    }
}
