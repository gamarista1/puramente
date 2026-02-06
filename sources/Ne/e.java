package ne;

import Ff.d;
import Ff.n;
import Ff.p;
import Hf.c;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import de.C4947a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.k;
import expo.modules.kotlin.exception.w;
import expo.modules.kotlin.jni.ExpectedType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.C5052a;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6502A;
import lf.C6514M;
import lf.C6531o;
import mf.C6565s;
import qe.C5175w;
import qe.Y;
import qe.Z;
import xf.C6781a;

public final class e extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final Z f61139b;

    /* renamed from: c  reason: collision with root package name */
    private final p f61140c;

    /* renamed from: d  reason: collision with root package name */
    private final de.e f61141d = new de.e();

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f61142e = C6531o.b(new d(this));

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Y f61143a;

        /* renamed from: b  reason: collision with root package name */
        private final b f61144b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f61145c;

        /* renamed from: d  reason: collision with root package name */
        private final List f61146d;

        public a(Y y10, b bVar, boolean z10, List list) {
            C6496s.h(y10, "typeConverter");
            C6496s.h(bVar, "fieldAnnotation");
            C6496s.h(list, "validators");
            this.f61143a = y10;
            this.f61144b = bVar;
            this.f61145c = z10;
            this.f61146d = list;
        }

        public final b a() {
            return this.f61144b;
        }

        public final Y b() {
            return this.f61143a;
        }

        public final List c() {
            return this.f61146d;
        }

        public final boolean d() {
            return this.f61145c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f61143a, aVar.f61143a) && C6496s.c(this.f61144b, aVar.f61144b) && this.f61145c == aVar.f61145c && C6496s.c(this.f61146d, aVar.f61146d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f61143a.hashCode() * 31) + this.f61144b.hashCode()) * 31) + Boolean.hashCode(this.f61145c)) * 31) + this.f61146d.hashCode();
        }

        public String toString() {
            Y y10 = this.f61143a;
            b bVar = this.f61144b;
            boolean z10 = this.f61145c;
            List list = this.f61146d;
            return "PropertyDescriptor(typeConverter=" + y10 + ", fieldAnnotation=" + bVar + ", isRequired=" + z10 + ", validators=" + list + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Z z10, p pVar) {
        super(pVar.e());
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "type");
        this.f61139b = z10;
        this.f61140c = pVar;
    }

    private final c j(ReadableMap readableMap, C4464a aVar) {
        CodedException codedException;
        Ff.e b10 = this.f61140c.b();
        C6496s.f(b10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object a10 = k((d) b10).a();
        for (Map.Entry entry : l().entrySet()) {
            n nVar = (n) entry.getKey();
            a aVar2 = (a) entry.getValue();
            String key = aVar2.a().key();
            if (Sg.p.d0(key)) {
                key = null;
            }
            if (key == null) {
                key = nVar.getName();
            }
            if (readableMap.hasKey(key)) {
                Dynamic dynamic = readableMap.getDynamic(key);
                try {
                    Field b11 = c.b(nVar);
                    C6496s.e(b11);
                    Object a11 = aVar2.b().a(dynamic, aVar);
                    if (a11 != null) {
                        Iterator it = aVar2.c().iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.c.a(it.next());
                            C6496s.f((Object) null, "null cannot be cast to non-null type expo.modules.kotlin.records.FieldValidator<kotlin.Any>");
                            throw null;
                        }
                    }
                    b11.setAccessible(true);
                    b11.set(a10, a11);
                    C6514M m10 = C6514M.f71813a;
                    dynamic.recycle();
                } catch (Throwable th2) {
                    dynamic.recycle();
                    throw th2;
                }
            } else if (aVar2.d()) {
                throw new k(nVar);
            }
        }
        C6496s.f(a10, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return (c) a10;
    }

    private final C4947a k(d dVar) {
        return this.f61141d.d(dVar);
    }

    private final Map l() {
        return (Map) this.f61142e.getValue();
    }

    private final List m(n nVar) {
        Object obj;
        Iterable annotations = nVar.getAnnotations();
        ArrayList arrayList = new ArrayList(C6565s.y(annotations, 10));
        Iterator it = annotations.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            Annotation annotation = (Annotation) it.next();
            Iterator it2 = C6781a.a(annotation).getAnnotations().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((Annotation) obj) instanceof a) {
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                pair = C6502A.a(annotation, aVar);
            }
            arrayList.add(pair);
        }
        Iterable l02 = C6565s.l0(arrayList);
        ArrayList arrayList2 = new ArrayList(C6565s.y(l02, 10));
        Iterator it3 = l02.iterator();
        if (!it3.hasNext()) {
            return arrayList2;
        }
        Pair pair2 = (Pair) it3.next();
        Annotation annotation2 = (Annotation) pair2.a();
        Object c10 = Gf.e.c(O.b(((a) pair2.b()).binder()));
        C6496s.f(c10, "null cannot be cast to non-null type expo.modules.kotlin.records.ValidationBinder");
        android.support.v4.media.session.c.a(c10);
        nVar.getReturnType();
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.annotation.Annotation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: kotlin.Pair} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map n(ne.e r9) {
        /*
            Ff.p r0 = r9.f61140c
            Ff.e r0 = r0.b()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.reflect.KClass<*>"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            Ff.d r0 = (Ff.d) r0
            java.util.Collection r0 = Gf.e.e(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = mf.C6565s.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008f
            java.lang.Object r2 = r0.next()
            Ff.n r2 = (Ff.n) r2
            java.util.List r3 = r2.getAnnotations()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0038:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()
            r6 = r4
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            boolean r6 = r6 instanceof ne.b
            if (r6 == 0) goto L_0x0038
            goto L_0x004c
        L_0x004b:
            r4 = r5
        L_0x004c:
            ne.b r4 = (ne.b) r4
            if (r4 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            qe.Z r3 = r9.f61139b
            Ff.p r6 = r2.getReturnType()
            qe.Y r3 = r3.a(r6)
            java.util.List r6 = r2.getAnnotations()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0065:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0077
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.annotation.Annotation r8 = (java.lang.annotation.Annotation) r8
            boolean r8 = r8 instanceof ne.f
            if (r8 == 0) goto L_0x0065
            r5 = r7
        L_0x0077:
            ne.f r5 = (ne.f) r5
            if (r5 == 0) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            java.util.List r6 = r9.m(r2)
            ne.e$a r7 = new ne.e$a
            r7.<init>(r3, r4, r5, r6)
            kotlin.Pair r5 = lf.C6502A.a(r2, r7)
        L_0x008b:
            r1.add(r5)
            goto L_0x0022
        L_0x008f:
            java.util.List r9 = mf.C6565s.l0(r1)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Map r9 = mf.O.w(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.e.n(ne.e):java.util.Map");
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.READABLE_MAP);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: h */
    public c e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        if (obj instanceof ReadableMap) {
            return j((ReadableMap) obj, aVar);
        }
        return (c) obj;
    }

    /* renamed from: i */
    public c f(Dynamic dynamic, C4464a aVar) {
        CodedException codedException;
        C6496s.h(dynamic, "value");
        try {
            return j(dynamic.asMap(), aVar);
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else if (th2 instanceof Od.a) {
                Od.a aVar2 = th2;
                String a10 = aVar2.a();
                C6496s.g(a10, "getCode(...)");
                codedException = new CodedException(a10, aVar2.getMessage(), aVar2.getCause());
            } else {
                codedException = new UnexpectedException((Throwable) th2);
            }
            throw new w(this.f61140c, codedException);
        }
    }
}
