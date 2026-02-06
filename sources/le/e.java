package le;

import ae.C4465b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ge.f;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final C6787a f61052a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f61053b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f61054c;

    /* renamed from: d  reason: collision with root package name */
    private final f f61055d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f61056e;

    public e(C6787a aVar, Map map, Map map2, f fVar, Map map3) {
        C6496s.h(aVar, "constantsProvider");
        C6496s.h(map, "syncFunctions");
        C6496s.h(map2, "asyncFunctions");
        C6496s.h(map3, DiagnosticsEntry.PROPERTIES_KEY);
        this.f61052a = aVar;
        this.f61053b = map;
        this.f61054c = map2;
        this.f61055d = fVar;
        this.f61056e = map3;
    }

    public final Map a() {
        return this.f61054c;
    }

    public final C6787a b() {
        return this.f61052a;
    }

    public final f c() {
        return this.f61055d;
    }

    public final C4465b d() {
        return new C4465b(this.f61053b.values().iterator(), this.f61054c.values().iterator());
    }

    public final Map e() {
        return this.f61056e;
    }

    public final Map f() {
        return this.f61053b;
    }
}
