package o9;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4773y;
import com.google.common.collect.a0;
import com.google.common.collect.g0;
import ia.A;
import ia.w;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k9.C3702j;
import k9.C3717q0;
import l9.s0;
import o9.C3912B;
import o9.C3920g;
import o9.m;
import o9.n;
import o9.u;
import o9.v;

/* renamed from: o9.h  reason: case insensitive filesystem */
public class C3921h implements v {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f47468c;

    /* renamed from: d  reason: collision with root package name */
    private final C3912B.c f47469d;

    /* renamed from: e  reason: collision with root package name */
    private final I f47470e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f47471f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f47472g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f47473h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f47474i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g f47475j;

    /* renamed from: k  reason: collision with root package name */
    private final A f47476k;

    /* renamed from: l  reason: collision with root package name */
    private final C0711h f47477l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final long f47478m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final List f47479n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set f47480o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Set f47481p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f47482q;

    /* renamed from: r  reason: collision with root package name */
    private C3912B f47483r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C3920g f47484s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C3920g f47485t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Looper f47486u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public Handler f47487v;

    /* renamed from: w  reason: collision with root package name */
    private int f47488w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f47489x;

    /* renamed from: y  reason: collision with root package name */
    private s0 f47490y;

    /* renamed from: z  reason: collision with root package name */
    volatile d f47491z;

    /* renamed from: o9.h$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap f47492a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private UUID f47493b = C3702j.f45578d;

        /* renamed from: c  reason: collision with root package name */
        private C3912B.c f47494c = F.f47421d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f47495d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f47496e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f47497f;

        /* renamed from: g  reason: collision with root package name */
        private A f47498g = new w();

        /* renamed from: h  reason: collision with root package name */
        private long f47499h = 300000;

        public C3921h a(I i10) {
            return new C3921h(this.f47493b, this.f47494c, i10, this.f47492a, this.f47495d, this.f47496e, this.f47497f, this.f47498g, this.f47499h);
        }

        public b b(boolean z10) {
            this.f47495d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f47497f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                C3645a.a(z10);
            }
            this.f47496e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, C3912B.c cVar) {
            this.f47493b = (UUID) C3645a.e(uuid);
            this.f47494c = (C3912B.c) C3645a.e(cVar);
            return this;
        }
    }

    /* renamed from: o9.h$c */
    private class c implements C3912B.b {
        private c() {
        }

        public void a(C3912B b10, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C3645a.e(C3921h.this.f47491z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* renamed from: o9.h$d */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C3920g gVar : C3921h.this.f47479n) {
                    if (gVar.r(bArr)) {
                        gVar.z(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: o9.h$e */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: o9.h$f */
    private class f implements v.b {

        /* renamed from: b  reason: collision with root package name */
        private final u.a f47502b;

        /* renamed from: c  reason: collision with root package name */
        private n f47503c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f47504d;

        public f(u.a aVar) {
            this.f47502b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(C3717q0 q0Var) {
            if (C3921h.this.f47482q != 0 && !this.f47504d) {
                C3921h hVar = C3921h.this;
                this.f47503c = hVar.t((Looper) C3645a.e(hVar.f47486u), this.f47502b, q0Var, false);
                C3921h.this.f47480o.add(this);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g() {
            if (!this.f47504d) {
                n nVar = this.f47503c;
                if (nVar != null) {
                    nVar.i(this.f47502b);
                }
                C3921h.this.f47480o.remove(this);
                this.f47504d = true;
            }
        }

        public void e(C3717q0 q0Var) {
            ((Handler) C3645a.e(C3921h.this.f47487v)).post(new C3922i(this, q0Var));
        }

        public void release() {
            M.L0((Handler) C3645a.e(C3921h.this.f47487v), new C3923j(this));
        }
    }

    /* renamed from: o9.h$g */
    private class g implements C3920g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set f47506a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private C3920g f47507b;

        public g(C3921h hVar) {
        }

        public void a(Exception exc, boolean z10) {
            this.f47507b = null;
            C4770v z11 = C4770v.z(this.f47506a);
            this.f47506a.clear();
            g0 m10 = z11.iterator();
            while (m10.hasNext()) {
                ((C3920g) m10.next()).B(exc, z10);
            }
        }

        public void b() {
            this.f47507b = null;
            C4770v z10 = C4770v.z(this.f47506a);
            this.f47506a.clear();
            g0 m10 = z10.iterator();
            while (m10.hasNext()) {
                ((C3920g) m10.next()).A();
            }
        }

        public void c(C3920g gVar) {
            this.f47506a.add(gVar);
            if (this.f47507b == null) {
                this.f47507b = gVar;
                gVar.F();
            }
        }

        public void d(C3920g gVar) {
            this.f47506a.remove(gVar);
            if (this.f47507b == gVar) {
                this.f47507b = null;
                if (!this.f47506a.isEmpty()) {
                    C3920g gVar2 = (C3920g) this.f47506a.iterator().next();
                    this.f47507b = gVar2;
                    gVar2.F();
                }
            }
        }
    }

    /* renamed from: o9.h$h  reason: collision with other inner class name */
    private class C0711h implements C3920g.b {
        private C0711h() {
        }

        public void a(C3920g gVar, int i10) {
            if (C3921h.this.f47478m != -9223372036854775807L) {
                C3921h.this.f47481p.remove(gVar);
                ((Handler) C3645a.e(C3921h.this.f47487v)).removeCallbacksAndMessages(gVar);
            }
        }

        public void b(C3920g gVar, int i10) {
            if (i10 == 1 && C3921h.this.f47482q > 0 && C3921h.this.f47478m != -9223372036854775807L) {
                C3921h.this.f47481p.add(gVar);
                ((Handler) C3645a.e(C3921h.this.f47487v)).postAtTime(new C3924k(gVar), gVar, SystemClock.uptimeMillis() + C3921h.this.f47478m);
            } else if (i10 == 0) {
                C3921h.this.f47479n.remove(gVar);
                if (C3921h.this.f47484s == gVar) {
                    C3920g unused = C3921h.this.f47484s = null;
                }
                if (C3921h.this.f47485t == gVar) {
                    C3920g unused2 = C3921h.this.f47485t = null;
                }
                C3921h.this.f47475j.d(gVar);
                if (C3921h.this.f47478m != -9223372036854775807L) {
                    ((Handler) C3645a.e(C3921h.this.f47487v)).removeCallbacksAndMessages(gVar);
                    C3921h.this.f47481p.remove(gVar);
                }
            }
            C3921h.this.C();
        }
    }

    private n A(int i10, boolean z10) {
        C3912B b10 = (C3912B) C3645a.e(this.f47483r);
        if ((b10.f() == 2 && C3913C.f47415d) || M.A0(this.f47473h, i10) == -1 || b10.f() == 1) {
            return null;
        }
        C3920g gVar = this.f47484s;
        if (gVar == null) {
            C3920g x10 = x(C4770v.E(), true, (u.a) null, z10);
            this.f47479n.add(x10);
            this.f47484s = x10;
        } else {
            gVar.g((u.a) null);
        }
        return this.f47484s;
    }

    private void B(Looper looper) {
        if (this.f47491z == null) {
            this.f47491z = new d(looper);
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        if (this.f47483r != null && this.f47482q == 0 && this.f47479n.isEmpty() && this.f47480o.isEmpty()) {
            ((C3912B) C3645a.e(this.f47483r)).release();
            this.f47483r = null;
        }
    }

    private void D() {
        g0 m10 = C4773y.x(this.f47481p).m();
        while (m10.hasNext()) {
            ((n) m10.next()).i((u.a) null);
        }
    }

    private void E() {
        g0 m10 = C4773y.x(this.f47480o).m();
        while (m10.hasNext()) {
            ((f) m10.next()).release();
        }
    }

    private void G(n nVar, u.a aVar) {
        nVar.i(aVar);
        if (this.f47478m != -9223372036854775807L) {
            nVar.i((u.a) null);
        }
    }

    /* access modifiers changed from: private */
    public n t(Looper looper, u.a aVar, C3717q0 q0Var, boolean z10) {
        List list;
        B(looper);
        m mVar = q0Var.f45773o;
        if (mVar == null) {
            return A(ja.w.k(q0Var.f45770l), z10);
        }
        C3920g gVar = null;
        if (this.f47489x == null) {
            list = y((m) C3645a.e(mVar), this.f47468c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f47468c);
                s.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new C3911A(new n.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f47472g) {
            Iterator it = this.f47479n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3920g gVar2 = (C3920g) it.next();
                if (M.c(gVar2.f47436a, list)) {
                    gVar = gVar2;
                    break;
                }
            }
        } else {
            gVar = this.f47485t;
        }
        if (gVar == null) {
            gVar = x(list, false, aVar, z10);
            if (!this.f47472g) {
                this.f47485t = gVar;
            }
            this.f47479n.add(gVar);
        } else {
            gVar.g(aVar);
        }
        return gVar;
    }

    private static boolean u(n nVar) {
        if (nVar.getState() != 1 || (M.f44981a >= 19 && !(((n.a) C3645a.e(nVar.a())).getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    private boolean v(m mVar) {
        if (this.f47489x != null) {
            return true;
        }
        if (y(mVar, this.f47468c, true).isEmpty()) {
            if (mVar.f47521d != 1 || !mVar.e(0).d(C3702j.f45576b)) {
                return false;
            }
            s.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f47468c);
        }
        String str = mVar.f47520c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (M.f44981a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    private C3920g w(List list, boolean z10, u.a aVar) {
        C3645a.e(this.f47483r);
        List list2 = list;
        C3920g gVar = new C3920g(this.f47468c, this.f47483r, this.f47475j, this.f47477l, list2, this.f47488w, this.f47474i | z10, z10, this.f47489x, this.f47471f, this.f47470e, (Looper) C3645a.e(this.f47486u), this.f47476k, (s0) C3645a.e(this.f47490y));
        gVar.g(aVar);
        if (this.f47478m != -9223372036854775807L) {
            gVar.g((u.a) null);
        }
        return gVar;
    }

    private C3920g x(List list, boolean z10, u.a aVar, boolean z11) {
        C3920g w10 = w(list, z10, aVar);
        if (u(w10) && !this.f47481p.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (!u(w10) || !z11 || this.f47480o.isEmpty()) {
            return w10;
        }
        E();
        if (!this.f47481p.isEmpty()) {
            D();
        }
        G(w10, aVar);
        return w(list, z10, aVar);
    }

    private static List y(m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.f47521d);
        for (int i10 = 0; i10 < mVar.f47521d; i10++) {
            m.b e10 = mVar.e(i10);
            if ((e10.d(uuid) || (C3702j.f45577c.equals(uuid) && e10.d(C3702j.f45576b))) && (e10.f47526e != null || z10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        boolean z10;
        try {
            Looper looper2 = this.f47486u;
            if (looper2 == null) {
                this.f47486u = looper;
                this.f47487v = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.f(z10);
                C3645a.e(this.f47487v);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void F(int i10, byte[] bArr) {
        C3645a.f(this.f47479n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C3645a.e(bArr);
        }
        this.f47488w = i10;
        this.f47489x = bArr;
    }

    public n a(u.a aVar, C3717q0 q0Var) {
        boolean z10;
        if (this.f47482q > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        C3645a.h(this.f47486u);
        return t(this.f47486u, aVar, q0Var, true);
    }

    public void b(Looper looper, s0 s0Var) {
        z(looper);
        this.f47490y = s0Var;
    }

    public v.b c(u.a aVar, C3717q0 q0Var) {
        boolean z10;
        if (this.f47482q > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        C3645a.h(this.f47486u);
        f fVar = new f(aVar);
        fVar.e(q0Var);
        return fVar;
    }

    public int d(C3717q0 q0Var) {
        int f10 = ((C3912B) C3645a.e(this.f47483r)).f();
        m mVar = q0Var.f45773o;
        if (mVar == null) {
            if (M.A0(this.f47473h, ja.w.k(q0Var.f45770l)) != -1) {
                return f10;
            }
            return 0;
        } else if (v(mVar)) {
            return f10;
        } else {
            return 1;
        }
    }

    public final void j() {
        int i10 = this.f47482q;
        this.f47482q = i10 + 1;
        if (i10 == 0) {
            if (this.f47483r == null) {
                C3912B a10 = this.f47469d.a(this.f47468c);
                this.f47483r = a10;
                a10.m(new c());
            } else if (this.f47478m != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f47479n.size(); i11++) {
                    ((C3920g) this.f47479n.get(i11)).g((u.a) null);
                }
            }
        }
    }

    public final void release() {
        int i10 = this.f47482q - 1;
        this.f47482q = i10;
        if (i10 == 0) {
            if (this.f47478m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f47479n);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((C3920g) arrayList.get(i11)).i((u.a) null);
                }
            }
            E();
            C();
        }
    }

    private C3921h(UUID uuid, C3912B.c cVar, I i10, HashMap hashMap, boolean z10, int[] iArr, boolean z11, A a10, long j10) {
        C3645a.e(uuid);
        C3645a.b(!C3702j.f45576b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f47468c = uuid;
        this.f47469d = cVar;
        this.f47470e = i10;
        this.f47471f = hashMap;
        this.f47472g = z10;
        this.f47473h = iArr;
        this.f47474i = z11;
        this.f47476k = a10;
        this.f47475j = new g(this);
        this.f47477l = new C0711h();
        this.f47488w = 0;
        this.f47479n = new ArrayList();
        this.f47480o = a0.h();
        this.f47481p = a0.h();
        this.f47478m = j10;
    }
}
