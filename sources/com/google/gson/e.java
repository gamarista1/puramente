package com.google.gson;

import Pc.G;
import Pc.t;
import Pc.u;
import Pc.z;
import com.google.gson.internal.bind.g;
import com.google.gson.internal.bind.i;
import com.google.gson.internal.bind.j;
import com.google.gson.internal.bind.k;
import com.google.gson.internal.bind.l;
import com.google.gson.internal.bind.m;
import com.google.gson.internal.bind.o;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class e {

    /* renamed from: A  reason: collision with root package name */
    static final d f58142A = d.f58137d;

    /* renamed from: B  reason: collision with root package name */
    static final String f58143B = null;

    /* renamed from: C  reason: collision with root package name */
    static final c f58144C = b.IDENTITY;

    /* renamed from: D  reason: collision with root package name */
    static final s f58145D = r.DOUBLE;

    /* renamed from: E  reason: collision with root package name */
    static final s f58146E = r.LAZILY_PARSED_NUMBER;

    /* renamed from: z  reason: collision with root package name */
    static final q f58147z = null;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal f58148a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f58149b;

    /* renamed from: c  reason: collision with root package name */
    private final t f58150c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.gson.internal.bind.e f58151d;

    /* renamed from: e  reason: collision with root package name */
    final List f58152e;

    /* renamed from: f  reason: collision with root package name */
    final u f58153f;

    /* renamed from: g  reason: collision with root package name */
    final c f58154g;

    /* renamed from: h  reason: collision with root package name */
    final Map f58155h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f58156i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f58157j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f58158k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f58159l;

    /* renamed from: m  reason: collision with root package name */
    final d f58160m;

    /* renamed from: n  reason: collision with root package name */
    final q f58161n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f58162o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f58163p;

    /* renamed from: q  reason: collision with root package name */
    final String f58164q;

    /* renamed from: r  reason: collision with root package name */
    final int f58165r;

    /* renamed from: s  reason: collision with root package name */
    final int f58166s;

    /* renamed from: t  reason: collision with root package name */
    final o f58167t;

    /* renamed from: u  reason: collision with root package name */
    final List f58168u;

    /* renamed from: v  reason: collision with root package name */
    final List f58169v;

    /* renamed from: w  reason: collision with root package name */
    final s f58170w;

    /* renamed from: x  reason: collision with root package name */
    final s f58171x;

    /* renamed from: y  reason: collision with root package name */
    final List f58172y;

    class a extends t {
        a() {
        }

        /* renamed from: a */
        public Double read(Sc.a aVar) {
            if (aVar.I0() != Sc.b.NULL) {
                return Double.valueOf(aVar.f0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(Sc.c cVar, Number number) {
            if (number == null) {
                cVar.T();
                return;
            }
            double doubleValue = number.doubleValue();
            e.d(doubleValue);
            cVar.B0(doubleValue);
        }
    }

    class b extends t {
        b() {
        }

        /* renamed from: a */
        public Float read(Sc.a aVar) {
            if (aVar.I0() != Sc.b.NULL) {
                return Float.valueOf((float) aVar.f0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(Sc.c cVar, Number number) {
            if (number == null) {
                cVar.T();
                return;
            }
            float floatValue = number.floatValue();
            e.d((double) floatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(floatValue);
            }
            cVar.L0(number);
        }
    }

    class c extends t {
        c() {
        }

        /* renamed from: a */
        public Number read(Sc.a aVar) {
            if (aVar.I0() != Sc.b.NULL) {
                return Long.valueOf(aVar.h0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(Sc.c cVar, Number number) {
            if (number == null) {
                cVar.T();
            } else {
                cVar.P0(number.toString());
            }
        }
    }

    class d extends t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f58175a;

        d(t tVar) {
            this.f58175a = tVar;
        }

        /* renamed from: a */
        public AtomicLong read(Sc.a aVar) {
            return new AtomicLong(((Number) this.f58175a.read(aVar)).longValue());
        }

        /* renamed from: b */
        public void write(Sc.c cVar, AtomicLong atomicLong) {
            this.f58175a.write(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.e$e  reason: collision with other inner class name */
    class C0863e extends t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f58176a;

        C0863e(t tVar) {
            this.f58176a = tVar;
        }

        /* renamed from: a */
        public AtomicLongArray read(Sc.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.M()) {
                arrayList.add(Long.valueOf(((Number) this.f58176a.read(aVar)).longValue()));
            }
            aVar.t();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: b */
        public void write(Sc.c cVar, AtomicLongArray atomicLongArray) {
            cVar.n();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f58176a.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.t();
        }
    }

    static class f extends m {

        /* renamed from: a  reason: collision with root package name */
        private t f58177a = null;

        f() {
        }

        private t b() {
            t tVar = this.f58177a;
            if (tVar != null) {
                return tVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public t a() {
            return b();
        }

        public void c(t tVar) {
            if (this.f58177a == null) {
                this.f58177a = tVar;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }

        public Object read(Sc.a aVar) {
            return b().read(aVar);
        }

        public void write(Sc.c cVar, Object obj) {
            b().write(cVar, obj);
        }
    }

    public e() {
        this(u.f52215g, f58144C, Collections.emptyMap(), false, false, false, true, f58142A, f58147z, false, true, o.DEFAULT, f58143B, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f58145D, f58146E, Collections.emptyList());
    }

    private static void a(Object obj, Sc.a aVar) {
        if (obj != null) {
            try {
                if (aVar.I0() != Sc.b.END_DOCUMENT) {
                    throw new n("JSON document was not fully consumed.");
                }
            } catch (Sc.d e10) {
                throw new n((Throwable) e10);
            } catch (IOException e11) {
                throw new i((Throwable) e11);
            }
        }
    }

    private static t b(t tVar) {
        return new d(tVar).nullSafe();
    }

    private static t c(t tVar) {
        return new C0863e(tVar).nullSafe();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private t e(boolean z10) {
        if (z10) {
            return o.f58320v;
        }
        return new a();
    }

    private t f(boolean z10) {
        if (z10) {
            return o.f58319u;
        }
        return new b();
    }

    private static t r(o oVar) {
        if (oVar == o.DEFAULT) {
            return o.f58318t;
        }
        return new c();
    }

    public void A(Object obj, Type type, Sc.c cVar) {
        t o10 = o(com.google.gson.reflect.a.get(type));
        q E10 = cVar.E();
        q qVar = this.f58161n;
        if (qVar != null) {
            cVar.t0(qVar);
        } else if (cVar.E() == q.LEGACY_STRICT) {
            cVar.t0(q.LENIENT);
        }
        boolean F10 = cVar.F();
        boolean y10 = cVar.y();
        cVar.j0(this.f58159l);
        cVar.o0(this.f58156i);
        try {
            o10.write(cVar, obj);
            cVar.t0(E10);
            cVar.j0(F10);
            cVar.o0(y10);
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.13.0): " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            cVar.t0(E10);
            cVar.j0(F10);
            cVar.o0(y10);
            throw th2;
        }
    }

    public void B(Object obj, Type type, Appendable appendable) {
        try {
            A(obj, type, t(G.b(appendable)));
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        throw new java.lang.AssertionError("AssertionError (GSON 2.13.0): " + r9.getMessage(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        throw new com.google.gson.n((java.lang.Throwable) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        throw new com.google.gson.n((java.lang.Throwable) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r8.n1(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        throw new com.google.gson.n((java.lang.Throwable) r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c A[ExcHandler: AssertionError (r9v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:6:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e A[ExcHandler: IOException (r9v4 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:6:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[ExcHandler: IllegalStateException (r9v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:6:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8 A[SYNTHETIC, Splitter:B:36:0x00a8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(Sc.a r8, com.google.gson.reflect.a r9) {
        /*
            r7 = this;
            com.google.gson.q r0 = r8.I()
            com.google.gson.q r1 = r7.f58161n
            if (r1 == 0) goto L_0x000c
            r8.n1(r1)
            goto L_0x0019
        L_0x000c:
            com.google.gson.q r1 = r8.I()
            com.google.gson.q r2 = com.google.gson.q.LEGACY_STRICT
            if (r1 != r2) goto L_0x0019
            com.google.gson.q r1 = com.google.gson.q.LENIENT
            r8.n1(r1)
        L_0x0019:
            r8.I0()     // Catch:{ EOFException -> 0x009f, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            r1 = 0
            com.google.gson.t r2 = r7.o(r9)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.Object r3 = r2.read(r8)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.Class r4 = r9.getRawType()     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.Class r4 = Pc.E.b(r4)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            if (r3 == 0) goto L_0x0074
            boolean r4 = r4.isInstance(r3)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            if (r4 == 0) goto L_0x0036
            goto L_0x0074
        L_0x0036:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            r5.<init>()     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.String r6 = "Type adapter '"
            r5.append(r6)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            r5.append(r2)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.String r2 = "' returned wrong type; requested "
            r5.append(r2)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.Class r9 = r9.getRawType()     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            r5.append(r9)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.String r9 = " but got instance of "
            r5.append(r9)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.Class r9 = r3.getClass()     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            r5.append(r9)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.String r9 = "\nVerify that the adapter was registered for the correct type."
            r5.append(r9)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            java.lang.String r9 = r5.toString()     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            r4.<init>(r9)     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
            throw r4     // Catch:{ EOFException -> 0x0072, IllegalStateException -> 0x0070, IOException -> 0x006e, AssertionError -> 0x006c }
        L_0x006a:
            r9 = move-exception
            goto L_0x00ae
        L_0x006c:
            r9 = move-exception
            goto L_0x0078
        L_0x006e:
            r9 = move-exception
            goto L_0x0093
        L_0x0070:
            r9 = move-exception
            goto L_0x0099
        L_0x0072:
            r9 = move-exception
            goto L_0x00a1
        L_0x0074:
            r8.n1(r0)
            return r3
        L_0x0078:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r2.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "AssertionError (GSON 2.13.0): "
            r2.append(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r3 = r9.getMessage()     // Catch:{ all -> 0x006a }
            r2.append(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006a }
            r1.<init>(r2, r9)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x0093:
            com.google.gson.n r1 = new com.google.gson.n     // Catch:{ all -> 0x006a }
            r1.<init>((java.lang.Throwable) r9)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x0099:
            com.google.gson.n r1 = new com.google.gson.n     // Catch:{ all -> 0x006a }
            r1.<init>((java.lang.Throwable) r9)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x009f:
            r9 = move-exception
            r1 = 1
        L_0x00a1:
            if (r1 == 0) goto L_0x00a8
            r8.n1(r0)
            r8 = 0
            return r8
        L_0x00a8:
            com.google.gson.n r1 = new com.google.gson.n     // Catch:{ all -> 0x006a }
            r1.<init>((java.lang.Throwable) r9)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x00ae:
            r8.n1(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.e.g(Sc.a, com.google.gson.reflect.a):java.lang.Object");
    }

    public Object h(h hVar, com.google.gson.reflect.a aVar) {
        if (hVar == null) {
            return null;
        }
        return g(new g(hVar), aVar);
    }

    public Object i(h hVar, Class cls) {
        return h(hVar, com.google.gson.reflect.a.get(cls));
    }

    public Object j(Reader reader, com.google.gson.reflect.a aVar) {
        Sc.a s10 = s(reader);
        Object g10 = g(s10, aVar);
        a(g10, s10);
        return g10;
    }

    public Object k(Reader reader, Class cls) {
        return j(reader, com.google.gson.reflect.a.get(cls));
    }

    public Object l(String str, com.google.gson.reflect.a aVar) {
        if (str == null) {
            return null;
        }
        return j(new StringReader(str), aVar);
    }

    public Object m(String str, Class cls) {
        return l(str, com.google.gson.reflect.a.get(cls));
    }

    public Object n(String str, Type type) {
        return l(str, com.google.gson.reflect.a.get(type));
    }

    public t o(com.google.gson.reflect.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        t tVar = (t) this.f58149b.get(aVar);
        if (tVar != null) {
            return tVar;
        }
        Map map = (Map) this.f58148a.get();
        if (map == null) {
            map = new HashMap();
            this.f58148a.set(map);
            z10 = true;
        } else {
            t tVar2 = (t) map.get(aVar);
            if (tVar2 != null) {
                return tVar2;
            }
            z10 = false;
        }
        try {
            f fVar = new f();
            map.put(aVar, fVar);
            Iterator it = this.f58152e.iterator();
            t tVar3 = null;
            while (true) {
                if (it.hasNext()) {
                    tVar3 = ((u) it.next()).create(this, aVar);
                    if (tVar3 != null) {
                        fVar.c(tVar3);
                        map.put(aVar, tVar3);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (tVar3 != null) {
                if (z10) {
                    this.f58149b.putAll(map);
                }
                return tVar3;
            }
            throw new IllegalArgumentException("GSON (2.13.0) cannot handle " + aVar);
        } finally {
            if (z10) {
                this.f58148a.remove();
            }
        }
    }

    public t p(Class cls) {
        return o(com.google.gson.reflect.a.get(cls));
    }

    public t q(u uVar, com.google.gson.reflect.a aVar) {
        Objects.requireNonNull(uVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f58151d.d(aVar, uVar)) {
            uVar = this.f58151d;
        }
        boolean z10 = false;
        for (u uVar2 : this.f58152e) {
            if (z10) {
                t create = uVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (uVar2 == uVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return o(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public Sc.a s(Reader reader) {
        Sc.a aVar = new Sc.a(reader);
        q qVar = this.f58161n;
        if (qVar == null) {
            qVar = q.LEGACY_STRICT;
        }
        aVar.n1(qVar);
        return aVar;
    }

    public Sc.c t(Writer writer) {
        if (this.f58158k) {
            writer.write(")]}'\n");
        }
        Sc.c cVar = new Sc.c(writer);
        cVar.h0(this.f58160m);
        cVar.j0(this.f58159l);
        q qVar = this.f58161n;
        if (qVar == null) {
            qVar = q.LEGACY_STRICT;
        }
        cVar.t0(qVar);
        cVar.o0(this.f58156i);
        return cVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f58156i + ",factories:" + this.f58152e + ",instanceCreators:" + this.f58150c + "}";
    }

    public String u(h hVar) {
        StringWriter stringWriter = new StringWriter();
        y(hVar, stringWriter);
        return stringWriter.toString();
    }

    public String v(Object obj) {
        if (obj == null) {
            return u(j.f58350a);
        }
        return w(obj, obj.getClass());
    }

    public String w(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        B(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void x(h hVar, Sc.c cVar) {
        q E10 = cVar.E();
        boolean F10 = cVar.F();
        boolean y10 = cVar.y();
        cVar.j0(this.f58159l);
        cVar.o0(this.f58156i);
        q qVar = this.f58161n;
        if (qVar != null) {
            cVar.t0(qVar);
        } else if (cVar.E() == q.LEGACY_STRICT) {
            cVar.t0(q.LENIENT);
        }
        try {
            G.a(hVar, cVar);
            cVar.t0(E10);
            cVar.j0(F10);
            cVar.o0(y10);
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.13.0): " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            cVar.t0(E10);
            cVar.j0(F10);
            cVar.o0(y10);
            throw th2;
        }
    }

    public void y(h hVar, Appendable appendable) {
        try {
            x(hVar, t(G.b(appendable)));
        } catch (IOException e10) {
            throw new i((Throwable) e10);
        }
    }

    public void z(Object obj, Appendable appendable) {
        if (obj != null) {
            B(obj, obj.getClass(), appendable);
        } else {
            y(j.f58350a, appendable);
        }
    }

    e(u uVar, c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, d dVar, q qVar, boolean z14, boolean z15, o oVar, String str, int i10, int i11, List list, List list2, List list3, s sVar, s sVar2, List list4) {
        Map map2 = map;
        boolean z16 = z11;
        boolean z17 = z14;
        boolean z18 = z15;
        List list5 = list4;
        this.f58148a = new ThreadLocal();
        this.f58149b = new ConcurrentHashMap();
        this.f58153f = uVar;
        this.f58154g = cVar;
        this.f58155h = map2;
        t tVar = new t(map2, z18, list5);
        this.f58150c = tVar;
        this.f58156i = z10;
        this.f58157j = z16;
        this.f58158k = z12;
        this.f58159l = z13;
        this.f58160m = dVar;
        this.f58161n = qVar;
        this.f58162o = z17;
        this.f58163p = z18;
        this.f58167t = oVar;
        this.f58164q = str;
        this.f58165r = i10;
        this.f58166s = i11;
        this.f58168u = list;
        this.f58169v = list2;
        this.f58170w = sVar;
        this.f58171x = sVar2;
        this.f58172y = list5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o.f58297W);
        arrayList.add(k.a(sVar));
        arrayList.add(uVar);
        arrayList.addAll(list3);
        arrayList.add(o.f58277C);
        arrayList.add(o.f58311m);
        arrayList.add(o.f58305g);
        arrayList.add(o.f58307i);
        arrayList.add(o.f58309k);
        t r10 = r(oVar);
        arrayList.add(o.b(Long.TYPE, Long.class, r10));
        arrayList.add(o.b(Double.TYPE, Double.class, e(z17)));
        arrayList.add(o.b(Float.TYPE, Float.class, f(z17)));
        arrayList.add(j.a(sVar2));
        arrayList.add(o.f58313o);
        arrayList.add(o.f58315q);
        arrayList.add(o.a(AtomicLong.class, b(r10)));
        arrayList.add(o.a(AtomicLongArray.class, c(r10)));
        arrayList.add(o.f58317s);
        arrayList.add(o.f58322x);
        arrayList.add(o.f58279E);
        arrayList.add(o.f58281G);
        arrayList.add(o.a(BigDecimal.class, o.f58324z));
        arrayList.add(o.a(BigInteger.class, o.f58275A));
        arrayList.add(o.a(z.class, o.f58276B));
        arrayList.add(o.f58283I);
        arrayList.add(o.f58285K);
        arrayList.add(o.f58289O);
        arrayList.add(o.f58291Q);
        arrayList.add(o.f58295U);
        arrayList.add(o.f58287M);
        arrayList.add(o.f58302d);
        arrayList.add(com.google.gson.internal.bind.c.f58205c);
        arrayList.add(o.f58293S);
        if (com.google.gson.internal.sql.d.f58344a) {
            arrayList.add(com.google.gson.internal.sql.d.f58348e);
            arrayList.add(com.google.gson.internal.sql.d.f58347d);
            arrayList.add(com.google.gson.internal.sql.d.f58349f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f58199c);
        arrayList.add(o.f58300b);
        arrayList.add(new com.google.gson.internal.bind.b(tVar));
        arrayList.add(new i(tVar, z16));
        com.google.gson.internal.bind.e eVar = new com.google.gson.internal.bind.e(tVar);
        this.f58151d = eVar;
        arrayList.add(eVar);
        arrayList.add(o.f58298X);
        arrayList.add(new l(tVar, cVar, uVar, eVar, list4));
        this.f58152e = Collections.unmodifiableList(arrayList);
    }
}
