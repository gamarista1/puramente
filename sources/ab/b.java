package Ab;

import com.google.android.gms.common.internal.C4536s;
import ub.m;
import zb.C5299a;
import zb.C5300b;

public final class b extends C5300b {

    /* renamed from: a  reason: collision with root package name */
    private final String f50174a;

    /* renamed from: b  reason: collision with root package name */
    private final m f50175b;

    private b(String str, m mVar) {
        C4536s.f(str);
        this.f50174a = str;
        this.f50175b = mVar;
    }

    public static b c(C5299a aVar) {
        C4536s.l(aVar);
        return new b(aVar.b(), (m) null);
    }

    public static b d(m mVar) {
        return new b("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (m) C4536s.l(mVar));
    }

    public Exception a() {
        return this.f50175b;
    }

    public String b() {
        return this.f50174a;
    }
}
