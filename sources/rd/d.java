package Rd;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List f52352a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52353b = 4;

    public d(List list) {
        C6496s.h(list, "logHandlers");
        this.f52352a = list;
    }

    public static /* synthetic */ void b(d dVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        dVar.a(str, th2);
    }

    private final void d(c cVar, String str, Throwable th2) {
        if (c.f52339b.a(cVar) >= this.f52353b) {
            for (a a10 : this.f52352a) {
                a10.a(cVar, str, th2);
            }
        }
    }

    static /* synthetic */ void e(d dVar, c cVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        dVar.d(cVar, str, th2);
    }

    public static /* synthetic */ void g(d dVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        dVar.f(str, th2);
    }

    public final void a(String str, Throwable th2) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        d(c.Error, str, th2);
    }

    public final void c(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        e(this, c.Info, str, (Throwable) null, 4, (Object) null);
    }

    public final void f(String str, Throwable th2) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        d(c.Warn, str, th2);
    }
}
