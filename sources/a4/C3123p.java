package a4;

import Gh.C5406g;
import Gh.C5411l;
import Gh.H;
import Gh.M;
import a4.S;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o4.l;

/* renamed from: a4.p  reason: case insensitive filesystem */
public final class C3123p extends S {

    /* renamed from: a  reason: collision with root package name */
    private final M f36072a;

    /* renamed from: b  reason: collision with root package name */
    private final C5411l f36073b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36074c;

    /* renamed from: d  reason: collision with root package name */
    private final Closeable f36075d;

    /* renamed from: e  reason: collision with root package name */
    private final S.a f36076e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36077f;

    /* renamed from: g  reason: collision with root package name */
    private C5406g f36078g;

    public C3123p(M m10, C5411l lVar, String str, Closeable closeable, S.a aVar) {
        super((DefaultConstructorMarker) null);
        this.f36072a = m10;
        this.f36073b = lVar;
        this.f36074c = str;
        this.f36075d = closeable;
        this.f36076e = aVar;
    }

    private final void o() {
        if (this.f36077f) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized M a() {
        o();
        return this.f36072a;
    }

    public M b() {
        return a();
    }

    public synchronized void close() {
        try {
            this.f36077f = true;
            C5406g gVar = this.f36078g;
            if (gVar != null) {
                l.d(gVar);
            }
            Closeable closeable = this.f36075d;
            if (closeable != null) {
                l.d(closeable);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public S.a f() {
        return this.f36076e;
    }

    public synchronized C5406g n() {
        o();
        C5406g gVar = this.f36078g;
        if (gVar != null) {
            return gVar;
        }
        C5406g d10 = H.d(t().q(this.f36072a));
        this.f36078g = d10;
        return d10;
    }

    public final String q() {
        return this.f36074c;
    }

    public C5411l t() {
        return this.f36073b;
    }
}
