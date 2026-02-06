package l3;

import gh.C5978b;
import gh.C5987k;
import ih.f;
import j3.C2126C;
import j3.C2132c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.b;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import nh.C6624e;
import nh.g;

/* renamed from: l3.b  reason: case insensitive filesystem */
public final class C2172b extends b {

    /* renamed from: a  reason: collision with root package name */
    private final C5978b f23554a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f23555b;

    /* renamed from: c  reason: collision with root package name */
    private final C6624e f23556c = g.a();

    /* renamed from: d  reason: collision with root package name */
    private final Map f23557d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private int f23558e = -1;

    public C2172b(C5978b bVar, Map map) {
        C6496s.h(bVar, "serializer");
        C6496s.h(map, "typeMap");
        this.f23554a = bVar;
        this.f23555b = map;
    }

    private final void K(Object obj) {
        List list;
        String e10 = this.f23554a.getDescriptor().e(this.f23558e);
        C2126C c10 = (C2126C) this.f23555b.get(e10);
        if (c10 != null) {
            if (c10 instanceof C2132c) {
                list = ((C2132c) c10).b(obj);
            } else {
                list = C6565s.e(c10.serializeAsValue(obj));
            }
            this.f23557d.put(e10, list);
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + e10 + ". Please provide NavType through typeMap.").toString());
    }

    public boolean G(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        this.f23558e = i10;
        return true;
    }

    public void I(Object obj) {
        C6496s.h(obj, "value");
        K(obj);
    }

    public final Map J(Object obj) {
        C6496s.h(obj, "value");
        super.m(this.f23554a, obj);
        return O.y(this.f23557d);
    }

    public C6624e a() {
        return this.f23556c;
    }

    public jh.f j(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (C2173c.d(fVar)) {
            this.f23558e = 0;
        }
        return super.j(fVar);
    }

    public void m(C5987k kVar, Object obj) {
        C6496s.h(kVar, "serializer");
        K(obj);
    }

    public void r() {
        K((Object) null);
    }
}
