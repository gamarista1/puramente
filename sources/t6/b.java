package T6;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.C3298d;
import com.facebook.imagepipeline.producers.C3300f;
import com.facebook.imagepipeline.producers.C3308n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.O;
import rh.C;
import rh.C6707d;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;
import wf.C6763c;

public class b extends C3298d {

    /* renamed from: d  reason: collision with root package name */
    private static final a f34183d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C6708e.a f34184a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f34185b;

    /* renamed from: c  reason: collision with root package name */
    private final C6707d f34186c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: T6.b$b  reason: collision with other inner class name */
    public static final class C0555b extends C {

        /* renamed from: f  reason: collision with root package name */
        public long f34187f;

        /* renamed from: g  reason: collision with root package name */
        public long f34188g;

        /* renamed from: h  reason: collision with root package name */
        public long f34189h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0555b(C3308n nVar, e0 e0Var) {
            super(nVar, e0Var);
            C6496s.h(nVar, "consumer");
            C6496s.h(e0Var, "producerContext");
        }
    }

    public static final class c extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6708e f34190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f34191b;

        c(C6708e eVar, b bVar) {
            this.f34190a = eVar;
            this.f34191b = bVar;
        }

        /* access modifiers changed from: private */
        public static final void f(C6708e eVar) {
            eVar.cancel();
        }

        public void b() {
            if (!C6496s.c(Looper.myLooper(), Looper.getMainLooper())) {
                this.f34190a.cancel();
            } else {
                this.f34191b.f34185b.execute(new c(this.f34190a));
            }
        }
    }

    public static final class d implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0555b f34192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f34193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ X.a f34194c;

        d(C0555b bVar, b bVar2, X.a aVar) {
            this.f34192a = bVar;
            this.f34193b = bVar2;
            this.f34194c = aVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            C6496s.h(eVar, "call");
            C6496s.h(iOException, "e");
            this.f34193b.m(eVar, iOException, this.f34194c);
        }

        public void onResponse(C6708e eVar, E e10) {
            int i10;
            C6496s.h(eVar, "call");
            C6496s.h(e10, "response");
            this.f34192a.f34188g = SystemClock.elapsedRealtime();
            F a10 = e10.a();
            if (a10 != null) {
                b bVar = this.f34193b;
                X.a aVar = this.f34194c;
                C0555b bVar2 = this.f34192a;
                try {
                    if (!e10.m0()) {
                        bVar.m(eVar, bVar.n("Unexpected HTTP code " + e10, e10), aVar);
                    } else {
                        W6.b c10 = W6.b.f34867c.c(e10.v("Content-Range"));
                        if (!(c10 == null || (c10.f34869a == 0 && c10.f34870b == Integer.MAX_VALUE))) {
                            bVar2.j(c10);
                            bVar2.i(8);
                        }
                        if (a10.o() < 0) {
                            i10 = 0;
                        } else {
                            i10 = (int) a10.o();
                        }
                        aVar.c(a10.a(), i10);
                    }
                } catch (Exception e11) {
                    try {
                        bVar.m(eVar, e11, aVar);
                    } catch (Throwable th2) {
                        C6763c.a(a10, th);
                        throw th2;
                    }
                }
                C6514M m10 = C6514M.f71813a;
                C6763c.a(a10, (Throwable) null);
                return;
            }
            b bVar3 = this.f34193b;
            bVar3.m(eVar, bVar3.n("Response body null: " + e10, e10), this.f34194c);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C6708e.a aVar, Executor executor, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executor, (i10 & 4) != 0 ? true : z10);
    }

    /* access modifiers changed from: private */
    public final void m(C6708e eVar, Exception exc, X.a aVar) {
        if (eVar.isCanceled()) {
            aVar.b();
        } else {
            aVar.a(exc);
        }
    }

    /* access modifiers changed from: private */
    public final IOException n(String str, E e10) {
        return new IOException(str, d.f34196c.a(e10));
    }

    /* renamed from: i */
    public C0555b e(C3308n nVar, e0 e0Var) {
        C6496s.h(nVar, "consumer");
        C6496s.h(e0Var, "context");
        return new C0555b(nVar, e0Var);
    }

    /* renamed from: j */
    public void a(C0555b bVar, X.a aVar) {
        C6496s.h(bVar, "fetchState");
        C6496s.h(aVar, "callback");
        bVar.f34187f = SystemClock.elapsedRealtime();
        Uri g10 = bVar.g();
        C6496s.g(g10, "getUri(...)");
        try {
            C.a d10 = new C.a().l(g10.toString()).d();
            C6707d dVar = this.f34186c;
            if (dVar != null) {
                d10.c(dVar);
            }
            W6.b b10 = bVar.b().F().b();
            if (b10 != null) {
                d10.a("Range", b10.f());
            }
            rh.C b11 = d10.b();
            C6496s.g(b11, "build(...)");
            k(bVar, aVar, b11);
        } catch (Exception e10) {
            aVar.a(e10);
        }
    }

    /* access modifiers changed from: protected */
    public void k(C0555b bVar, X.a aVar, rh.C c10) {
        C6496s.h(bVar, "fetchState");
        C6496s.h(aVar, "callback");
        C6496s.h(c10, "request");
        C6708e a10 = this.f34184a.a(c10);
        bVar.b().b(new c(a10, this));
        FirebasePerfOkHttpClient.enqueue(a10, new d(bVar, this, aVar));
    }

    /* renamed from: l */
    public Map d(C0555b bVar, int i10) {
        C6496s.h(bVar, "fetchState");
        return O.l(C6502A.a("queue_time", String.valueOf(bVar.f34188g - bVar.f34187f)), C6502A.a("fetch_time", String.valueOf(bVar.f34189h - bVar.f34188g)), C6502A.a("total_time", String.valueOf(bVar.f34189h - bVar.f34187f)), C6502A.a("image_size", String.valueOf(i10)));
    }

    /* renamed from: o */
    public void b(C0555b bVar, int i10) {
        C6496s.h(bVar, "fetchState");
        bVar.f34189h = SystemClock.elapsedRealtime();
    }

    public b(C6708e.a aVar, Executor executor, boolean z10) {
        C6496s.h(aVar, "callFactory");
        C6496s.h(executor, "cancellationExecutor");
        this.f34184a = aVar;
        this.f34185b = executor;
        this.f34186c = z10 ? new C6707d.a().e().a() : null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(rh.C6703A r8) {
        /*
            r7 = this;
            java.lang.String r0 = "okHttpClient"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            rh.p r0 = r8.q()
            java.util.concurrent.ExecutorService r3 = r0.c()
            java.lang.String r0 = "executorService(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.b.<init>(rh.A):void");
    }
}
