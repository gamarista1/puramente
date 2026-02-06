package ih;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: ih.a  reason: case insensitive filesystem */
public final class C6000a {

    /* renamed from: a  reason: collision with root package name */
    private final String f68462a;

    /* renamed from: b  reason: collision with root package name */
    private List f68463b = C6565s.n();

    /* renamed from: c  reason: collision with root package name */
    private final List f68464c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Set f68465d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final List f68466e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f68467f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List f68468g = new ArrayList();

    public C6000a(String str) {
        C6496s.h(str, "serialName");
        this.f68462a = str;
    }

    public static /* synthetic */ void b(C6000a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = C6565s.n();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final void a(String str, f fVar, List list, boolean z10) {
        C6496s.h(str, "elementName");
        C6496s.h(fVar, "descriptor");
        C6496s.h(list, "annotations");
        if (this.f68465d.add(str)) {
            this.f68464c.add(str);
            this.f68466e.add(fVar);
            this.f68467f.add(list);
            this.f68468g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f68462a).toString());
    }

    public final List c() {
        return this.f68463b;
    }

    public final List d() {
        return this.f68467f;
    }

    public final List e() {
        return this.f68466e;
    }

    public final List f() {
        return this.f68464c;
    }

    public final List g() {
        return this.f68468g;
    }

    public final void h(List list) {
        C6496s.h(list, "<set-?>");
        this.f68463b = list;
    }
}
