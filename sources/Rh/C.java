package rh;

import Sg.p;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import rh.u;
import rh.v;
import sh.C6726e;
import xh.f;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final v f73134a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73135b;

    /* renamed from: c  reason: collision with root package name */
    private final u f73136c;

    /* renamed from: d  reason: collision with root package name */
    private final D f73137d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f73138e;

    /* renamed from: f  reason: collision with root package name */
    private C6707d f73139f;

    public C(v vVar, String str, u uVar, D d10, Map map) {
        C6496s.h(vVar, "url");
        C6496s.h(str, "method");
        C6496s.h(uVar, "headers");
        C6496s.h(map, "tags");
        this.f73134a = vVar;
        this.f73135b = str;
        this.f73136c = uVar;
        this.f73137d = d10;
        this.f73138e = map;
    }

    public final D a() {
        return this.f73137d;
    }

    public final C6707d b() {
        C6707d dVar = this.f73139f;
        if (dVar != null) {
            return dVar;
        }
        C6707d b10 = C6707d.f73247n.b(this.f73136c);
        this.f73139f = b10;
        return b10;
    }

    public final Map c() {
        return this.f73138e;
    }

    public final String d(String str) {
        C6496s.h(str, "name");
        return this.f73136c.a(str);
    }

    public final List e(String str) {
        C6496s.h(str, "name");
        return this.f73136c.z(str);
    }

    public final u f() {
        return this.f73136c;
    }

    public final boolean g() {
        return this.f73134a.j();
    }

    public final String h() {
        return this.f73135b;
    }

    public final a i() {
        return new a(this);
    }

    public final Object j() {
        return k(Object.class);
    }

    public final Object k(Class cls) {
        C6496s.h(cls, "type");
        return cls.cast(this.f73138e.get(cls));
    }

    public final v l() {
        return this.f73134a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f73135b);
        sb2.append(", url=");
        sb2.append(this.f73134a);
        if (this.f73136c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object next : this.f73136c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.a();
                String str2 = (String) pair.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f73138e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f73138e);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private v f73140a;

        /* renamed from: b  reason: collision with root package name */
        private String f73141b;

        /* renamed from: c  reason: collision with root package name */
        private u.a f73142c;

        /* renamed from: d  reason: collision with root package name */
        private D f73143d;

        /* renamed from: e  reason: collision with root package name */
        private Map f73144e;

        public a() {
            this.f73144e = new LinkedHashMap();
            this.f73141b = "GET";
            this.f73142c = new u.a();
        }

        public a a(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            this.f73142c.a(str, str2);
            return this;
        }

        public C b() {
            v vVar = this.f73140a;
            if (vVar != null) {
                return new C(vVar, this.f73141b, this.f73142c.f(), this.f73143d, C6726e.W(this.f73144e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(C6707d dVar) {
            C6496s.h(dVar, "cacheControl");
            String dVar2 = dVar.toString();
            if (dVar2.length() == 0) {
                return i("Cache-Control");
            }
            return e("Cache-Control", dVar2);
        }

        public a d() {
            return g("GET", (D) null);
        }

        public a e(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            this.f73142c.j(str, str2);
            return this;
        }

        public a f(u uVar) {
            C6496s.h(uVar, "headers");
            this.f73142c = uVar.n();
            return this;
        }

        public a g(String str, D d10) {
            C6496s.h(str, "method");
            if (str.length() > 0) {
                if (d10 == null) {
                    if (f.e(str)) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!f.b(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f73141b = str;
                this.f73143d = d10;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        public a h(D d10) {
            C6496s.h(d10, "body");
            return g("POST", d10);
        }

        public a i(String str) {
            C6496s.h(str, "name");
            this.f73142c.i(str);
            return this;
        }

        public a j(Class cls, Object obj) {
            C6496s.h(cls, "type");
            if (obj == null) {
                this.f73144e.remove(cls);
            } else {
                if (this.f73144e.isEmpty()) {
                    this.f73144e = new LinkedHashMap();
                }
                Map map = this.f73144e;
                Object cast = cls.cast(obj);
                C6496s.e(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(String str) {
            C6496s.h(str, "url");
            if (p.H(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = str.substring(3);
                C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                str = sb2.toString();
            } else if (p.H(str, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String substring2 = str.substring(4);
                C6496s.g(substring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                str = sb3.toString();
            }
            return n(v.f73477k.d(str));
        }

        public a m(URL url) {
            C6496s.h(url, "url");
            v.b bVar = v.f73477k;
            String url2 = url.toString();
            C6496s.g(url2, "url.toString()");
            return n(bVar.d(url2));
        }

        public a n(v vVar) {
            C6496s.h(vVar, "url");
            this.f73140a = vVar;
            return this;
        }

        public a(C c10) {
            Map map;
            C6496s.h(c10, "request");
            this.f73144e = new LinkedHashMap();
            this.f73140a = c10.l();
            this.f73141b = c10.h();
            this.f73143d = c10.a();
            if (c10.c().isEmpty()) {
                map = new LinkedHashMap();
            } else {
                map = O.B(c10.c());
            }
            this.f73144e = map;
            this.f73142c = c10.f().n();
        }
    }
}
