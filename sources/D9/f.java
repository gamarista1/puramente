package D9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ja.C3645a;
import ja.M;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k9.C3694f;
import k9.C3717q0;
import k9.C3718r0;
import k9.b1;

public final class f extends C3694f implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    private final c f30616n;

    /* renamed from: o  reason: collision with root package name */
    private final e f30617o;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f30618p;

    /* renamed from: q  reason: collision with root package name */
    private final d f30619q;

    /* renamed from: r  reason: collision with root package name */
    private b f30620r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f30621s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f30622t;

    /* renamed from: u  reason: collision with root package name */
    private long f30623u;

    /* renamed from: v  reason: collision with root package name */
    private long f30624v;

    /* renamed from: w  reason: collision with root package name */
    private a f30625w;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f30614a);
    }

    private void X(a aVar, List list) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            C3717q0 m10 = aVar.c(i10).m();
            if (m10 == null || !this.f30616n.a(m10)) {
                list.add(aVar.c(i10));
            } else {
                b b10 = this.f30616n.b(m10);
                byte[] bArr = (byte[]) C3645a.e(aVar.c(i10).t());
                this.f30619q.i();
                this.f30619q.x(bArr.length);
                ((ByteBuffer) M.j(this.f30619q.f46950c)).put(bArr);
                this.f30619q.y();
                a a10 = b10.a(this.f30619q);
                if (a10 != null) {
                    X(a10, list);
                }
            }
        }
    }

    private void Y(a aVar) {
        Handler handler = this.f30618p;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            Z(aVar);
        }
    }

    private void Z(a aVar) {
        this.f30617o.u(aVar);
    }

    private boolean a0(long j10) {
        boolean z10;
        a aVar = this.f30625w;
        if (aVar == null || this.f30624v > j10) {
            z10 = false;
        } else {
            Y(aVar);
            this.f30625w = null;
            this.f30624v = -9223372036854775807L;
            z10 = true;
        }
        if (this.f30621s && this.f30625w == null) {
            this.f30622t = true;
        }
        return z10;
    }

    private void b0() {
        if (!this.f30621s && this.f30625w == null) {
            this.f30619q.i();
            C3718r0 I10 = I();
            int U10 = U(I10, this.f30619q, 0);
            if (U10 == -4) {
                if (this.f30619q.p()) {
                    this.f30621s = true;
                    return;
                }
                d dVar = this.f30619q;
                dVar.f30615i = this.f30623u;
                dVar.y();
                a a10 = ((b) M.j(this.f30620r)).a(this.f30619q);
                if (a10 != null) {
                    ArrayList arrayList = new ArrayList(a10.d());
                    X(a10, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f30625w = new a((List) arrayList);
                        this.f30624v = this.f30619q.f46952e;
                    }
                }
            } else if (U10 == -5) {
                this.f30623u = ((C3717q0) C3645a.e(I10.f45824b)).f45774p;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void N() {
        this.f30625w = null;
        this.f30624v = -9223372036854775807L;
        this.f30620r = null;
    }

    /* access modifiers changed from: protected */
    public void P(long j10, boolean z10) {
        this.f30625w = null;
        this.f30624v = -9223372036854775807L;
        this.f30621s = false;
        this.f30622t = false;
    }

    /* access modifiers changed from: protected */
    public void T(C3717q0[] q0VarArr, long j10, long j11) {
        this.f30620r = this.f30616n.b(q0VarArr[0]);
    }

    public int a(C3717q0 q0Var) {
        int i10;
        if (!this.f30616n.a(q0Var)) {
            return b1.o(0);
        }
        if (q0Var.f45757E == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return b1.o(i10);
    }

    public boolean b() {
        return this.f30622t;
    }

    public boolean d() {
        return true;
    }

    public void g(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            b0();
            z10 = a0(j10);
        }
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            Z((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        Handler handler;
        this.f30617o = (e) C3645a.e(eVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = M.v(looper, this);
        }
        this.f30618p = handler;
        this.f30616n = (c) C3645a.e(cVar);
        this.f30619q = new d();
        this.f30624v = -9223372036854775807L;
    }
}
