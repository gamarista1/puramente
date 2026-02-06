package j3;

import android.support.v4.media.session.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private final C2128E f22980a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22981b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22982c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f22983d;

    /* renamed from: e  reason: collision with root package name */
    private Map f22984e;

    /* renamed from: f  reason: collision with root package name */
    private List f22985f;

    /* renamed from: g  reason: collision with root package name */
    private Map f22986g;

    public t(C2128E e10, int i10, String str) {
        C6496s.h(e10, "navigator");
        this.f22980a = e10;
        this.f22981b = i10;
        this.f22982c = str;
        this.f22984e = new LinkedHashMap();
        this.f22985f = new ArrayList();
        this.f22986g = new LinkedHashMap();
    }

    public final void a(String str, C2137h hVar) {
        C6496s.h(str, "name");
        C6496s.h(hVar, "argument");
        this.f22984e.put(str, hVar);
    }

    public s b() {
        s e10 = e();
        e10.Q(this.f22983d);
        for (Map.Entry entry : this.f22984e.entrySet()) {
            e10.b((String) entry.getKey(), (C2137h) entry.getValue());
        }
        for (p g10 : this.f22985f) {
            e10.g(g10);
        }
        for (Map.Entry entry2 : this.f22986g.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            c.a(entry2.getValue());
            e10.N(intValue, (C2136g) null);
        }
        String str = this.f22982c;
        if (str != null) {
            e10.S(str);
        }
        int i10 = this.f22981b;
        if (i10 != -1) {
            e10.P(i10);
        }
        return e10;
    }

    public final void c(p pVar) {
        C6496s.h(pVar, "navDeepLink");
        this.f22985f.add(pVar);
    }

    public final String d() {
        return this.f22982c;
    }

    /* access modifiers changed from: protected */
    public s e() {
        return this.f22980a.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(C2128E e10, String str) {
        this(e10, -1, str);
        C6496s.h(e10, "navigator");
    }
}
