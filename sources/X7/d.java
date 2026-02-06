package X7;

import Sg.p;
import android.util.Pair;
import com.amazon.a.a.o.b;
import e7.C3499a;
import i7.C3593b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import z8.C4236a;

public final class d extends C3499a {

    /* renamed from: a  reason: collision with root package name */
    private int f35377a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f35378b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f35379c = new LinkedHashMap();

    public void a(String str, String str2) {
        C6496s.h(str, b.f37444B);
        C6496s.h(str2, "producerName");
        if (C4236a.j(0)) {
            Pair create = Pair.create(Integer.valueOf(this.f35377a), "FRESCO_PRODUCER_" + p.C(str2, ':', '_', false, 4, (Object) null));
            Object obj = create.second;
            C6496s.g(obj, "second");
            C4236a.a(0, (String) obj, this.f35377a);
            this.f35378b.put(str, create);
            this.f35377a++;
        }
    }

    public void b(C3593b bVar, String str, boolean z10) {
        Pair pair;
        C6496s.h(bVar, "request");
        C6496s.h(str, b.f37444B);
        if (C4236a.j(0) && (pair = (Pair) this.f35379c.get(str)) != null) {
            Object obj = pair.second;
            C6496s.g(obj, "second");
            Object obj2 = pair.first;
            C6496s.g(obj2, "first");
            C4236a.g(0, (String) obj, ((Number) obj2).intValue());
            this.f35379c.remove(str);
        }
    }

    public void c(C3593b bVar, Object obj, String str, boolean z10) {
        C6496s.h(bVar, "request");
        C6496s.h(obj, "callerContext");
        C6496s.h(str, b.f37444B);
        if (C4236a.j(0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRESCO_REQUEST_");
            String uri = bVar.v().toString();
            C6496s.g(uri, "toString(...)");
            sb2.append(p.C(uri, ':', '_', false, 4, (Object) null));
            Pair create = Pair.create(Integer.valueOf(this.f35377a), sb2.toString());
            Object obj2 = create.second;
            C6496s.g(obj2, "second");
            C4236a.a(0, (String) obj2, this.f35377a);
            this.f35379c.put(str, create);
            this.f35377a++;
        }
    }

    public boolean d(String str) {
        C6496s.h(str, b.f37444B);
        return false;
    }

    public void e(String str, String str2, Map map) {
        Pair pair;
        C6496s.h(str, b.f37444B);
        C6496s.h(str2, "producerName");
        if (C4236a.j(0) && (pair = (Pair) this.f35378b.get(str)) != null) {
            Object obj = pair.second;
            C6496s.g(obj, "second");
            Object obj2 = pair.first;
            C6496s.g(obj2, "first");
            C4236a.g(0, (String) obj, ((Number) obj2).intValue());
            this.f35378b.remove(str);
        }
    }

    public void f(String str, String str2, Throwable th2, Map map) {
        Pair pair;
        C6496s.h(str, b.f37444B);
        C6496s.h(str2, "producerName");
        C6496s.h(th2, "t");
        if (C4236a.j(0) && (pair = (Pair) this.f35378b.get(str)) != null) {
            Object obj = pair.second;
            C6496s.g(obj, "second");
            Object obj2 = pair.first;
            C6496s.g(obj2, "first");
            C4236a.g(0, (String) obj, ((Number) obj2).intValue());
            this.f35378b.remove(str);
        }
    }

    public void g(String str, String str2, Map map) {
        Pair pair;
        C6496s.h(str, b.f37444B);
        C6496s.h(str2, "producerName");
        if (C4236a.j(0) && (pair = (Pair) this.f35378b.get(str)) != null) {
            Object obj = pair.second;
            C6496s.g(obj, "second");
            Object obj2 = pair.first;
            C6496s.g(obj2, "first");
            C4236a.g(0, (String) obj, ((Number) obj2).intValue());
            this.f35378b.remove(str);
        }
    }

    public void i(String str, String str2, String str3) {
        C6496s.h(str, b.f37444B);
        C6496s.h(str2, "producerName");
        C6496s.h(str3, "eventName");
        if (C4236a.j(0)) {
            C4236a.n(0, "FRESCO_PRODUCER_EVENT_" + p.C(str, ':', '_', false, 4, (Object) null) + "_" + p.C(str2, ':', '_', false, 4, (Object) null) + "_" + p.C(str3, ':', '_', false, 4, (Object) null), C4236a.C0758a.THREAD);
        }
    }

    public void j(C3593b bVar, String str, Throwable th2, boolean z10) {
        Pair pair;
        C6496s.h(bVar, "request");
        C6496s.h(str, b.f37444B);
        C6496s.h(th2, "throwable");
        if (C4236a.j(0) && (pair = (Pair) this.f35379c.get(str)) != null) {
            Object obj = pair.second;
            C6496s.g(obj, "second");
            Object obj2 = pair.first;
            C6496s.g(obj2, "first");
            C4236a.g(0, (String) obj, ((Number) obj2).intValue());
            this.f35379c.remove(str);
        }
    }

    public void k(String str) {
        Pair pair;
        C6496s.h(str, b.f37444B);
        if (C4236a.j(0) && (pair = (Pair) this.f35379c.get(str)) != null) {
            Object obj = pair.second;
            C6496s.g(obj, "second");
            Object obj2 = pair.first;
            C6496s.g(obj2, "first");
            C4236a.g(0, (String) obj, ((Number) obj2).intValue());
            this.f35379c.remove(str);
        }
    }
}
