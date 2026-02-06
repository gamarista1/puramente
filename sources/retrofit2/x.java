package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import rh.D;
import rh.u;
import rh.z;

abstract class x {

    class a extends x {
        a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, Iterable iterable) {
            if (iterable != null) {
                for (Object a10 : iterable) {
                    x.this.a(d10, a10);
                }
            }
        }
    }

    class b extends x {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    x.this.a(d10, Array.get(obj, i10));
                }
            }
        }
    }

    static final class c extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72951a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72952b;

        /* renamed from: c  reason: collision with root package name */
        private final C6675h f72953c;

        c(Method method, int i10, C6675h hVar) {
            this.f72951a = method;
            this.f72952b = i10;
            this.f72953c = hVar;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            if (obj != null) {
                try {
                    d10.l((D) this.f72953c.convert(obj));
                } catch (IOException e10) {
                    Method method = this.f72951a;
                    int i10 = this.f72952b;
                    throw K.q(method, e10, i10, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                }
            } else {
                throw K.p(this.f72951a, this.f72952b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class d extends x {

        /* renamed from: a  reason: collision with root package name */
        private final String f72954a;

        /* renamed from: b  reason: collision with root package name */
        private final C6675h f72955b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f72956c;

        d(String str, C6675h hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f72954a = str;
            this.f72955b = hVar;
            this.f72956c = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f72955b.convert(obj)) != null) {
                d10.a(this.f72954a, str, this.f72956c);
            }
        }
    }

    static final class e extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72957a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72958b;

        /* renamed from: c  reason: collision with root package name */
        private final C6675h f72959c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f72960d;

        e(Method method, int i10, C6675h hVar, boolean z10) {
            this.f72957a = method;
            this.f72958b = i10;
            this.f72959c = hVar;
            this.f72960d = z10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f72959c.convert(value);
                            if (str2 != null) {
                                d10.a(str, str2, this.f72960d);
                            } else {
                                Method method = this.f72957a;
                                int i10 = this.f72958b;
                                throw K.p(method, i10, "Field map value '" + value + "' converted to null by " + this.f72959c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f72957a;
                            int i11 = this.f72958b;
                            throw K.p(method2, i11, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw K.p(this.f72957a, this.f72958b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw K.p(this.f72957a, this.f72958b, "Field map was null.", new Object[0]);
        }
    }

    static final class f extends x {

        /* renamed from: a  reason: collision with root package name */
        private final String f72961a;

        /* renamed from: b  reason: collision with root package name */
        private final C6675h f72962b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f72963c;

        f(String str, C6675h hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f72961a = str;
            this.f72962b = hVar;
            this.f72963c = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f72962b.convert(obj)) != null) {
                d10.b(this.f72961a, str, this.f72963c);
            }
        }
    }

    static final class g extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72964a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72965b;

        /* renamed from: c  reason: collision with root package name */
        private final C6675h f72966c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f72967d;

        g(Method method, int i10, C6675h hVar, boolean z10) {
            this.f72964a = method;
            this.f72965b = i10;
            this.f72966c = hVar;
            this.f72967d = z10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            d10.b(str, (String) this.f72966c.convert(value), this.f72967d);
                        } else {
                            Method method = this.f72964a;
                            int i10 = this.f72965b;
                            throw K.p(method, i10, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw K.p(this.f72964a, this.f72965b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw K.p(this.f72964a, this.f72965b, "Header map was null.", new Object[0]);
        }
    }

    static final class h extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72968a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72969b;

        h(Method method, int i10) {
            this.f72968a = method;
            this.f72969b = i10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, u uVar) {
            if (uVar != null) {
                d10.c(uVar);
                return;
            }
            throw K.p(this.f72968a, this.f72969b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class i extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72970a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72971b;

        /* renamed from: c  reason: collision with root package name */
        private final u f72972c;

        /* renamed from: d  reason: collision with root package name */
        private final C6675h f72973d;

        i(Method method, int i10, u uVar, C6675h hVar) {
            this.f72970a = method;
            this.f72971b = i10;
            this.f72972c = uVar;
            this.f72973d = hVar;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            if (obj != null) {
                try {
                    d10.d(this.f72972c, (D) this.f72973d.convert(obj));
                } catch (IOException e10) {
                    Method method = this.f72970a;
                    int i10 = this.f72971b;
                    throw K.p(method, i10, "Unable to convert " + obj + " to RequestBody", e10);
                }
            }
        }
    }

    static final class j extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72974a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72975b;

        /* renamed from: c  reason: collision with root package name */
        private final C6675h f72976c;

        /* renamed from: d  reason: collision with root package name */
        private final String f72977d;

        j(Method method, int i10, C6675h hVar, String str) {
            this.f72974a = method;
            this.f72975b = i10;
            this.f72976c = hVar;
            this.f72977d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            d10.d(u.t("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f72977d), (D) this.f72976c.convert(value));
                        } else {
                            Method method = this.f72974a;
                            int i10 = this.f72975b;
                            throw K.p(method, i10, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw K.p(this.f72974a, this.f72975b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw K.p(this.f72974a, this.f72975b, "Part map was null.", new Object[0]);
        }
    }

    static final class k extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72978a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72979b;

        /* renamed from: c  reason: collision with root package name */
        private final String f72980c;

        /* renamed from: d  reason: collision with root package name */
        private final C6675h f72981d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f72982e;

        k(Method method, int i10, String str, C6675h hVar, boolean z10) {
            this.f72978a = method;
            this.f72979b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f72980c = str;
            this.f72981d = hVar;
            this.f72982e = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            if (obj != null) {
                d10.f(this.f72980c, (String) this.f72981d.convert(obj), this.f72982e);
                return;
            }
            Method method = this.f72978a;
            int i10 = this.f72979b;
            throw K.p(method, i10, "Path parameter \"" + this.f72980c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends x {

        /* renamed from: a  reason: collision with root package name */
        private final String f72983a;

        /* renamed from: b  reason: collision with root package name */
        private final C6675h f72984b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f72985c;

        l(String str, C6675h hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f72983a = str;
            this.f72984b = hVar;
            this.f72985c = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f72984b.convert(obj)) != null) {
                d10.g(this.f72983a, str, this.f72985c);
            }
        }
    }

    static final class m extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72986a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72987b;

        /* renamed from: c  reason: collision with root package name */
        private final C6675h f72988c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f72989d;

        m(Method method, int i10, C6675h hVar, boolean z10) {
            this.f72986a = method;
            this.f72987b = i10;
            this.f72988c = hVar;
            this.f72989d = z10;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f72988c.convert(value);
                            if (str2 != null) {
                                d10.g(str, str2, this.f72989d);
                            } else {
                                Method method = this.f72986a;
                                int i10 = this.f72987b;
                                throw K.p(method, i10, "Query map value '" + value + "' converted to null by " + this.f72988c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f72986a;
                            int i11 = this.f72987b;
                            throw K.p(method2, i11, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw K.p(this.f72986a, this.f72987b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw K.p(this.f72986a, this.f72987b, "Query map was null", new Object[0]);
        }
    }

    static final class n extends x {

        /* renamed from: a  reason: collision with root package name */
        private final C6675h f72990a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f72991b;

        n(C6675h hVar, boolean z10) {
            this.f72990a = hVar;
            this.f72991b = z10;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            if (obj != null) {
                d10.g((String) this.f72990a.convert(obj), (String) null, this.f72991b);
            }
        }
    }

    static final class o extends x {

        /* renamed from: a  reason: collision with root package name */
        static final o f72992a = new o();

        private o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(D d10, z.c cVar) {
            if (cVar != null) {
                d10.e(cVar);
            }
        }
    }

    static final class p extends x {

        /* renamed from: a  reason: collision with root package name */
        private final Method f72993a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72994b;

        p(Method method, int i10) {
            this.f72993a = method;
            this.f72994b = i10;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            if (obj != null) {
                d10.m(obj);
                return;
            }
            throw K.p(this.f72993a, this.f72994b, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class q extends x {

        /* renamed from: a  reason: collision with root package name */
        final Class f72995a;

        q(Class cls) {
            this.f72995a = cls;
        }

        /* access modifiers changed from: package-private */
        public void a(D d10, Object obj) {
            d10.h(this.f72995a, obj);
        }
    }

    x() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(D d10, Object obj);

    /* access modifiers changed from: package-private */
    public final x b() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public final x c() {
        return new a();
    }
}
