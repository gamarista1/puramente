package f6;

import e6.C3498a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

/* renamed from: f6.a  reason: case insensitive filesystem */
public final class C3509a implements C3510b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3509a f43385a = new C3509a();

    private C3509a() {
    }

    public boolean a(C3498a aVar) {
        C6496s.h(aVar, "tag");
        return false;
    }

    public void b(C3498a aVar, String str, Object... objArr) {
        C6496s.h(aVar, "tag");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(objArr, "args");
    }

    public void c(C3498a aVar, String str) {
        C6496s.h(aVar, "tag");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
    }
}
