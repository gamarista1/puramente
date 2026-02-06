package w;

import Ef.m;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.L;

public final class z0 implements y0 {

    /* renamed from: a  reason: collision with root package name */
    private final C2807s f27650a;

    /* renamed from: b  reason: collision with root package name */
    private C2805q f27651b;

    /* renamed from: c  reason: collision with root package name */
    private C2805q f27652c;

    /* renamed from: d  reason: collision with root package name */
    private C2805q f27653d;

    public static final class a implements C2807s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2764H f27654a;

        a(C2764H h10) {
            this.f27654a = h10;
        }

        public C2764H get(int i10) {
            return this.f27654a;
        }
    }

    public z0(C2807s sVar) {
        this.f27650a = sVar;
    }

    public long b(C2805q qVar, C2805q qVar2, C2805q qVar3) {
        Iterator it = m.u(0, qVar.b()).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            int a10 = ((L) it).a();
            j10 = Math.max(j10, this.f27650a.get(a10).e(qVar.a(a10), qVar2.a(a10), qVar3.a(a10)));
        }
        return j10;
    }

    public C2805q c(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        if (this.f27651b == null) {
            this.f27651b = C2806r.g(qVar);
        }
        C2805q qVar4 = this.f27651b;
        if (qVar4 == null) {
            C6496s.v("valueVector");
            qVar4 = null;
        }
        int b10 = qVar4.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar5 = this.f27651b;
            if (qVar5 == null) {
                C6496s.v("valueVector");
                qVar5 = null;
            }
            qVar5.e(i10, this.f27650a.get(i10).c(j10, qVar.a(i10), qVar2.a(i10), qVar3.a(i10)));
        }
        C2805q qVar6 = this.f27651b;
        if (qVar6 != null) {
            return qVar6;
        }
        C6496s.v("valueVector");
        return null;
    }

    public C2805q d(long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        if (this.f27652c == null) {
            this.f27652c = C2806r.g(qVar3);
        }
        C2805q qVar4 = this.f27652c;
        if (qVar4 == null) {
            C6496s.v("velocityVector");
            qVar4 = null;
        }
        int b10 = qVar4.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar5 = this.f27652c;
            if (qVar5 == null) {
                C6496s.v("velocityVector");
                qVar5 = null;
            }
            qVar5.e(i10, this.f27650a.get(i10).d(j10, qVar.a(i10), qVar2.a(i10), qVar3.a(i10)));
        }
        C2805q qVar6 = this.f27652c;
        if (qVar6 != null) {
            return qVar6;
        }
        C6496s.v("velocityVector");
        return null;
    }

    public C2805q g(C2805q qVar, C2805q qVar2, C2805q qVar3) {
        if (this.f27653d == null) {
            this.f27653d = C2806r.g(qVar3);
        }
        C2805q qVar4 = this.f27653d;
        if (qVar4 == null) {
            C6496s.v("endVelocityVector");
            qVar4 = null;
        }
        int b10 = qVar4.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar5 = this.f27653d;
            if (qVar5 == null) {
                C6496s.v("endVelocityVector");
                qVar5 = null;
            }
            qVar5.e(i10, this.f27650a.get(i10).b(qVar.a(i10), qVar2.a(i10), qVar3.a(i10)));
        }
        C2805q qVar6 = this.f27653d;
        if (qVar6 != null) {
            return qVar6;
        }
        C6496s.v("endVelocityVector");
        return null;
    }

    public z0(C2764H h10) {
        this((C2807s) new a(h10));
    }
}
