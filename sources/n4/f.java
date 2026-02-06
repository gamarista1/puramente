package N4;

import N4.j;
import N4.k;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.w3c.dom.Element;

public class f implements u, s {

    /* renamed from: E  reason: collision with root package name */
    private static final Charset f32719E = Charset.forName(Constants.ENCODING);

    /* renamed from: F  reason: collision with root package name */
    private static final Object f32720F = new Object();

    /* renamed from: G  reason: collision with root package name */
    private static final Iterator f32721G = new d();

    /* renamed from: H  reason: collision with root package name */
    private static final k.a f32722H = new g();

    /* renamed from: I  reason: collision with root package name */
    private static final byte[] f32723I = {110, 117, 108, 108};

    /* renamed from: A  reason: collision with root package name */
    private final ConcurrentMap f32724A = new ConcurrentHashMap();

    /* renamed from: B  reason: collision with root package name */
    private final k.a f32725B = new e();

    /* renamed from: C  reason: collision with root package name */
    private final k.a f32726C = new C0539f();

    /* renamed from: D  reason: collision with root package name */
    private final k.a f32727D = new h();

    /* renamed from: a  reason: collision with root package name */
    public final Object f32728a;

    /* renamed from: b  reason: collision with root package name */
    protected final i f32729b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32730c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f32731d;

    /* renamed from: e  reason: collision with root package name */
    protected final q f32732e;

    /* renamed from: f  reason: collision with root package name */
    protected final q f32733f;

    /* renamed from: g  reason: collision with root package name */
    protected final List f32734g;

    /* renamed from: h  reason: collision with root package name */
    private final int f32735h;

    /* renamed from: i  reason: collision with root package name */
    protected final List f32736i;

    /* renamed from: j  reason: collision with root package name */
    private final int f32737j;

    /* renamed from: k  reason: collision with root package name */
    protected final List f32738k;

    /* renamed from: l  reason: collision with root package name */
    private final int f32739l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final j.d f32740m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final j.b f32741n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final j.g f32742o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final int f32743p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final int f32744q;

    /* renamed from: r  reason: collision with root package name */
    protected final ThreadLocal f32745r;

    /* renamed from: s  reason: collision with root package name */
    protected final ThreadLocal f32746s;

    /* renamed from: t  reason: collision with root package name */
    private final g f32747t;

    /* renamed from: u  reason: collision with root package name */
    private final Map f32748u;

    /* renamed from: v  reason: collision with root package name */
    private final Map f32749v = new ConcurrentHashMap();

    /* renamed from: w  reason: collision with root package name */
    private final ConcurrentMap f32750w = new ConcurrentHashMap();

    /* renamed from: x  reason: collision with root package name */
    private final ConcurrentMap f32751x = new ConcurrentHashMap();

    /* renamed from: y  reason: collision with root package name */
    private final ConcurrentMap f32752y = new ConcurrentHashMap();

    /* renamed from: z  reason: collision with root package name */
    private final ConcurrentMap f32753z = new ConcurrentHashMap();

    class a extends ThreadLocal {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f32754a;

        a(f fVar) {
            this.f32754a = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public k initialValue() {
            return new k(4096, (u) this.f32754a);
        }
    }

    class b extends ThreadLocal {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f32756a;

        b(f fVar) {
            this.f32756a = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public j initialValue() {
            f fVar = this.f32756a;
            return new j(new byte[4096], 4096, fVar.f32728a, new char[64], fVar.f32732e, fVar.f32733f, (s) fVar, fVar.f32740m, this.f32756a.f32741n, this.f32756a.f32742o, this.f32756a.f32743p, this.f32756a.f32744q);
        }
    }

    class c implements k.a {
        c() {
        }

        /* renamed from: b */
        public void a(k kVar, Map map) {
            if (map == null) {
                kVar.n();
                return;
            }
            try {
                f.this.y(map, kVar);
            } catch (IOException e10) {
                throw new p((Throwable) e10);
            }
        }
    }

    class e implements k.a {
        e() {
        }

        public /* bridge */ /* synthetic */ void a(k kVar, Object obj) {
            android.support.v4.media.session.c.a(obj);
            b(kVar, (i) null);
        }

        public void b(k kVar, i iVar) {
            if (iVar == null) {
                kVar.n();
            } else {
                iVar.a(kVar, f.this.f32730c);
            }
        }
    }

    /* renamed from: N4.f$f  reason: collision with other inner class name */
    class C0539f implements k.a {
        C0539f() {
        }

        public void a(k kVar, Object obj) {
            f.this.v(kVar, (i[]) obj);
        }
    }

    class g implements k.a {
        g() {
        }

        public void a(k kVar, Object obj) {
            r.a(new String((char[]) obj), kVar);
        }
    }

    class h implements k.a {
        h() {
        }

        public void a(k kVar, Object obj) {
            kVar.n();
        }
    }

    public interface i {
        void a(Object obj, OutputStream outputStream);

        Object b(Object obj, Type type, InputStream inputStream);
    }

    public static class k {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Object f32766a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f32767b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public i f32768c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f32769d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f32770e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public q f32771f = new l();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public q f32772g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f32773h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public j.d f32774i = j.d.WITH_STACK_TRACE;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public j.b f32775j = j.b.DEFAULT;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public j.g f32776k = j.g.LONG_AND_BIGDECIMAL;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public int f32777l = 512;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f32778m = 134217728;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public final List f32779n = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public final List f32780o = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public final List f32781p = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public final List f32782q = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public final Set f32783r = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public final Map f32784s = new HashMap();

        public k t(i iVar) {
            this.f32768c = iVar;
            return this;
        }
    }

    public static class l implements q {

        /* renamed from: a  reason: collision with root package name */
        private final int f32785a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f32786b;

        public l() {
            this(10);
        }

        private String b(int i10, char[] cArr, int i11) {
            String str = new String(cArr, 0, i11);
            this.f32786b[i10] = str;
            return str;
        }

        public String a(char[] cArr, int i10) {
            long j10 = -2128831035;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 ^ ((long) ((byte) cArr[i11]))) * 16777619;
            }
            int i12 = ((int) j10) & this.f32785a;
            String str = this.f32786b[i12];
            if (str == null) {
                return b(i12, cArr, i10);
            }
            if (str.length() != i10) {
                return b(i12, cArr, i10);
            }
            for (int i13 = 0; i13 < str.length(); i13++) {
                if (str.charAt(i13) != cArr[i13]) {
                    return b(i12, cArr, i10);
                }
            }
            return str;
        }

        public l(int i10) {
            int i11 = 2;
            for (int i12 = 1; i12 < i10; i12++) {
                i11 *= 2;
            }
            this.f32785a = i11 - 1;
            this.f32786b = new String[i11];
        }
    }

    public f(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f32734g = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f32736i = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.f32738k = copyOnWriteArrayList3;
        if (kVar != null) {
            this.f32745r = new a(this);
            this.f32746s = new b(this);
            this.f32728a = kVar.f32766a;
            this.f32729b = kVar.f32768c;
            this.f32730c = kVar.f32769d;
            this.f32731d = kVar.f32770e;
            this.f32732e = kVar.f32771f;
            this.f32733f = kVar.f32772g;
            this.f32742o = kVar.f32776k;
            this.f32740m = kVar.f32774i;
            this.f32741n = kVar.f32775j;
            this.f32743p = kVar.f32777l;
            this.f32744q = kVar.f32778m;
            copyOnWriteArrayList.addAll(kVar.f32780o);
            this.f32735h = kVar.f32780o.size();
            copyOnWriteArrayList2.addAll(kVar.f32781p);
            this.f32737j = kVar.f32781p.size();
            copyOnWriteArrayList3.addAll(kVar.f32782q);
            this.f32739l = kVar.f32782q.size();
            this.f32747t = new g(kVar.f32783r);
            this.f32748u = new HashMap(kVar.f32784s);
            Class<byte[]> cls = byte[].class;
            s(cls, b.f32711a);
            t(cls, b.f32712b);
            Class cls2 = Boolean.TYPE;
            s(cls2, c.f32714b);
            k.a aVar = c.f32716d;
            t(cls2, aVar);
            q(cls2, Boolean.FALSE);
            Class<boolean[]> cls3 = boolean[].class;
            s(cls3, c.f32717e);
            t(cls3, c.f32718f);
            Class<Boolean> cls4 = Boolean.class;
            s(cls4, c.f32715c);
            t(cls4, aVar);
            if (kVar.f32767b) {
                r(this);
            }
            j.f fVar = n.f32917b;
            s(LinkedHashMap.class, fVar);
            s(HashMap.class, fVar);
            Class<Map> cls5 = Map.class;
            s(cls5, fVar);
            t(cls5, new c());
            Class<URI> cls6 = URI.class;
            s(cls6, l.f32863a);
            t(cls6, l.f32864b);
            Class<InetAddress> cls7 = InetAddress.class;
            s(cls7, l.f32865c);
            t(cls7, l.f32866d);
            Class cls8 = Double.TYPE;
            s(cls8, m.f32903p);
            k.a aVar2 = m.f32905r;
            t(cls8, aVar2);
            q(cls8, Double.valueOf(0.0d));
            Class<double[]> cls9 = double[].class;
            s(cls9, m.f32906s);
            t(cls9, m.f32907t);
            Class<Double> cls10 = Double.class;
            s(cls10, m.f32904q);
            t(cls10, aVar2);
            Class cls11 = Float.TYPE;
            s(cls11, m.f32908u);
            k.a aVar3 = m.f32910w;
            t(cls11, aVar3);
            q(cls11, Float.valueOf(0.0f));
            Class<float[]> cls12 = float[].class;
            s(cls12, m.f32911x);
            t(cls12, m.f32912y);
            Class<Float> cls13 = Float.class;
            s(cls13, m.f32909v);
            t(cls13, aVar3);
            Class cls14 = Integer.TYPE;
            s(cls14, m.f32913z);
            k.a aVar4 = m.f32868B;
            t(cls14, aVar4);
            q(cls14, 0);
            Class<int[]> cls15 = int[].class;
            s(cls15, m.f32869C);
            t(cls15, m.f32870D);
            Class<Integer> cls16 = Integer.class;
            s(cls16, m.f32867A);
            t(cls16, aVar4);
            Class cls17 = Short.TYPE;
            s(cls17, m.f32871E);
            k.a aVar5 = m.f32873G;
            t(cls17, aVar5);
            q(cls17, (short) 0);
            Class<short[]> cls18 = short[].class;
            s(cls18, m.f32874H);
            t(cls18, m.f32875I);
            Class<Short> cls19 = Short.class;
            s(cls19, m.f32872F);
            t(cls19, aVar5);
            Class cls20 = Long.TYPE;
            s(cls20, m.f32876J);
            k.a aVar6 = m.f32878L;
            t(cls20, aVar6);
            q(cls20, 0L);
            Class<long[]> cls21 = long[].class;
            s(cls21, m.f32879M);
            t(cls21, m.f32880N);
            Class<Long> cls22 = Long.class;
            s(cls22, m.f32877K);
            t(cls22, aVar6);
            Class<BigDecimal> cls23 = BigDecimal.class;
            s(cls23, m.f32881O);
            t(cls23, m.f32882P);
            Class<String> cls24 = String.class;
            s(cls24, r.f32918a);
            t(cls24, r.f32919b);
            Class<UUID> cls25 = UUID.class;
            s(cls25, t.f32924b);
            t(cls25, t.f32925c);
            s(Number.class, m.f32883Q);
            t(CharSequence.class, r.f32920c);
            s(StringBuilder.class, r.f32921d);
            s(StringBuffer.class, r.f32922e);
            Iterator it = kVar.f32779n.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            } else if (!kVar.f32783r.isEmpty() && kVar.f32773h == 0) {
                n(this, kVar.f32783r, "dsl_json_Annotation_Processor_External_Serialization");
                n(this, kVar.f32783r, "dsl_json.json.ExternalSerialization");
                n(this, kVar.f32783r, "dsl_json_ExternalSerialization");
            }
        } else {
            throw new IllegalArgumentException("settings can't be null");
        }
    }

    private void f(Type type, ConcurrentMap concurrentMap) {
        Type k10;
        if (type instanceof Class) {
            this.f32747t.b((Class) type, this);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.f32747t.b((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentMap.containsKey(type2) && (k10 = k(type2)) != type2 && !concurrentMap.containsKey(k10)) {
                    f(k10, concurrentMap);
                }
            }
        }
    }

    private static Object g(Class cls, List list) {
        int i10 = 0;
        if (cls.isPrimitive()) {
            if (Boolean.TYPE.equals(cls)) {
                boolean[] zArr = new boolean[list.size()];
                while (i10 < list.size()) {
                    zArr[i10] = ((Boolean) list.get(i10)).booleanValue();
                    i10++;
                }
                return zArr;
            } else if (Integer.TYPE.equals(cls)) {
                int[] iArr = new int[list.size()];
                while (i10 < list.size()) {
                    iArr[i10] = ((Integer) list.get(i10)).intValue();
                    i10++;
                }
                return iArr;
            } else if (Long.TYPE.equals(cls)) {
                long[] jArr = new long[list.size()];
                while (i10 < list.size()) {
                    jArr[i10] = ((Long) list.get(i10)).longValue();
                    i10++;
                }
                return jArr;
            } else if (Short.TYPE.equals(cls)) {
                short[] sArr = new short[list.size()];
                while (i10 < list.size()) {
                    sArr[i10] = ((Short) list.get(i10)).shortValue();
                    i10++;
                }
                return sArr;
            } else if (Byte.TYPE.equals(cls)) {
                byte[] bArr = new byte[list.size()];
                while (i10 < list.size()) {
                    bArr[i10] = ((Byte) list.get(i10)).byteValue();
                    i10++;
                }
                return bArr;
            } else if (Float.TYPE.equals(cls)) {
                float[] fArr = new float[list.size()];
                while (i10 < list.size()) {
                    fArr[i10] = ((Float) list.get(i10)).floatValue();
                    i10++;
                }
                return fArr;
            } else if (Double.TYPE.equals(cls)) {
                double[] dArr = new double[list.size()];
                while (i10 < list.size()) {
                    dArr[i10] = ((Double) list.get(i10)).doubleValue();
                    i10++;
                }
                return dArr;
            } else if (Character.TYPE.equals(cls)) {
                char[] cArr = new char[list.size()];
                while (i10 < list.size()) {
                    cArr[i10] = ((Character) list.get(i10)).charValue();
                    i10++;
                }
                return cArr;
            }
        }
        return list.toArray((Object[]) Array.newInstance(cls, 0));
    }

    private static Type k(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) {
            return wildcardType.getUpperBounds()[0];
        }
        return type;
    }

    private static void l(Class cls, ArrayList arrayList) {
        if (!arrayList.contains(cls)) {
            arrayList.add(cls);
            Class<Object> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                l(superclass, arrayList);
            }
            for (Class l10 : cls.getInterfaces()) {
                l(l10, arrayList);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void n(N4.f r1, java.util.Set r2, java.lang.String r3) {
        /*
            java.util.Iterator r1 = r2.iterator()
        L_0x0004:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Object r2 = r1.next()
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            java.lang.Class r2 = r2.loadClass(r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x0004 }
            r0 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x0004 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x0004 }
            android.support.v4.media.session.c.a(r2)     // Catch:{ Exception | NoClassDefFoundError -> 0x0004 }
            throw r0     // Catch:{  }
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.f.n(N4.f, java.util.Set, java.lang.String):void");
    }

    private Object o(Type type, Type type2, List list, ConcurrentMap concurrentMap) {
        if (type2 instanceof Class) {
            this.f32747t.b((Class) type2, this);
            Object obj = concurrentMap.get(type2);
            if (obj != null) {
                return obj;
            }
        } else if (type2 instanceof ParameterizedType) {
            f(type2, concurrentMap);
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        android.support.v4.media.session.c.a(it.next());
        throw null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private N4.j.e p(java.lang.Class r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "JSON_READER"
            r1 = 0
            java.lang.reflect.Field r2 = r4.getField(r0)     // Catch:{ Exception -> 0x000b }
            r2.get(r5)     // Catch:{ Exception -> 0x000b }
            goto L_0x001c
        L_0x000b:
            java.lang.reflect.Method r0 = r4.getMethod(r0, r1)     // Catch:{ Exception -> 0x0013 }
            r0.invoke(r5, r1)     // Catch:{ Exception -> 0x0013 }
            goto L_0x001c
        L_0x0013:
            java.lang.String r0 = "getJSON_READER"
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch:{ Exception -> 0x001c }
            r4.invoke(r5, r1)     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.f.p(java.lang.Class, java.lang.Object):N4.j$e");
    }

    static void r(f fVar) {
        Class<Element> cls = Element.class;
        fVar.s(cls, v.f32928a);
        fVar.t(cls, v.f32929b);
    }

    public j.f A(Type type) {
        j.f fVar;
        j.f fVar2 = (j.f) this.f32751x.get(type);
        if (fVar2 != null) {
            return fVar2;
        }
        Type k10 = k(type);
        if (k10 == type || (fVar = (j.f) this.f32751x.get(k10)) == null) {
            if (k10 instanceof Class) {
                Class cls = (Class) k10;
                if (i.class.isAssignableFrom(cls)) {
                    m(cls);
                }
            }
            return (j.f) o(type, k10, this.f32736i, this.f32751x);
        }
        this.f32751x.putIfAbsent(type, fVar);
        return fVar;
    }

    public k.a B(Class cls) {
        return C(cls);
    }

    public k.a C(Type type) {
        k.a aVar;
        k.a aVar2 = (k.a) this.f32753z.get(type);
        if (aVar2 != null) {
            return aVar2;
        }
        Type k10 = k(type);
        if (k10 == type || (aVar = (k.a) this.f32753z.get(k10)) == null) {
            boolean z10 = k10 instanceof Class;
            if (z10) {
                if (i.class.isAssignableFrom((Class) k10)) {
                    this.f32753z.putIfAbsent(type, this.f32725B);
                    return this.f32725B;
                }
            }
            k.a aVar3 = (k.a) o(type, k10, this.f32734g, this.f32753z);
            if (aVar3 != null) {
                return aVar3;
            }
            if (!z10) {
                return null;
            }
            Class cls = (Class) this.f32724A.get(k10);
            if (cls != null) {
                return (k.a) this.f32753z.get(cls);
            }
            Class cls2 = (Class) k10;
            ArrayList arrayList = new ArrayList();
            l(cls2, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Class cls3 = (Class) it.next();
                k.a aVar4 = (k.a) this.f32753z.get(cls3);
                if (aVar4 == null) {
                    aVar4 = (k.a) o(type, cls3, this.f32734g, this.f32753z);
                    continue;
                }
                if (aVar4 != null) {
                    this.f32724A.putIfAbsent(cls2, cls3);
                    return aVar4;
                }
            }
            return null;
        }
        this.f32753z.putIfAbsent(type, aVar);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public IOException h(Class cls) {
        ArrayList arrayList = new ArrayList();
        l(cls, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (this.f32751x.containsKey(cls2)) {
                if (cls2.equals(cls)) {
                    return new IOException("Reader for provided type: " + cls + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + cls);
                }
                return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nFound reader for: " + cls2 + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + getClass());
            }
        }
        return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
    }

    /* access modifiers changed from: protected */
    public Object i(Class cls, j jVar, InputStream inputStream) {
        jVar.h();
        j.f z10 = z(cls);
        if (z10 != null) {
            return z10.a(jVar);
        }
        if (cls.isArray()) {
            if (jVar.K()) {
                return null;
            }
            if (jVar.l() == 91) {
                Class<?> componentType = cls.getComponentType();
                if (jVar.h() == 93) {
                    return Array.newInstance(componentType, 0);
                }
                if (i.class.isAssignableFrom(componentType)) {
                    m(componentType);
                }
                j.f z11 = z(componentType);
                if (z11 != null) {
                    return g(componentType, jVar.f(z11));
                }
            } else {
                throw jVar.n("Expecting '[' for array start");
            }
        }
        i iVar = this.f32729b;
        if (iVar != null) {
            return iVar.b(this.f32728a, cls, new j(jVar.f32822h, inputStream));
        }
        throw h(cls);
    }

    public Object j(Class cls, InputStream inputStream) {
        if (cls == null) {
            throw new IllegalArgumentException("manifest can't be null");
        } else if (inputStream != null) {
            j z10 = ((j) this.f32746s.get()).z(inputStream);
            try {
                return i(cls, z10, inputStream);
            } finally {
                z10.H();
            }
        } else {
            throw new IllegalArgumentException("stream can't be null");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final N4.j.e m(java.lang.Class r3) {
        /*
            r2 = this;
            r0 = 0
            java.util.concurrent.ConcurrentMap r1 = r2.f32750w     // Catch:{ Exception -> 0x001e }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x001e }
            android.support.v4.media.session.c.a(r1)     // Catch:{ Exception -> 0x001e }
            r2.p(r3, r0)     // Catch:{ Exception -> 0x001e }
            java.lang.String r1 = "Companion"
            java.lang.reflect.Field r3 = r3.getField(r1)     // Catch:{  }
            java.lang.Object r3 = r3.get(r0)     // Catch:{  }
            java.lang.Class r1 = r3.getClass()     // Catch:{  }
            r2.p(r1, r3)     // Catch:{  }
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.f.m(java.lang.Class):N4.j$e");
    }

    public void q(Class cls, Object obj) {
        this.f32749v.put(cls, obj);
    }

    public void s(Class cls, j.f fVar) {
        if (fVar == null) {
            this.f32751x.remove(cls);
        } else {
            this.f32751x.put(cls, fVar);
        }
    }

    public void t(Class cls, k.a aVar) {
        if (aVar == null) {
            this.f32724A.remove(cls);
            this.f32753z.remove(cls);
            return;
        }
        this.f32724A.put(cls, cls);
        this.f32753z.put(cls, aVar);
    }

    public final void u(k kVar, Object obj) {
        if (kVar == null) {
            throw new IllegalArgumentException("writer can't be null");
        } else if (obj == null) {
            kVar.n();
        } else {
            Class<?> cls = obj.getClass();
            if (x(kVar, cls, obj)) {
                return;
            }
            if (this.f32729b != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                this.f32729b.a(obj, byteArrayOutputStream);
                kVar.j(byteArrayOutputStream.toByteArray());
                return;
            }
            throw new e("Unable to serialize provided object. Failed to find serializer for: " + cls);
        }
    }

    public void v(k kVar, i[] iVarArr) {
        if (iVarArr == null) {
            kVar.n();
            return;
        }
        kVar.l((byte) 91);
        if (iVarArr.length != 0) {
            i iVar = iVarArr[0];
            kVar.n();
            for (int i10 = 1; i10 < iVarArr.length; i10++) {
                kVar.l((byte) 44);
                i iVar2 = iVarArr[i10];
                kVar.n();
            }
        }
        kVar.l((byte) 93);
    }

    public final void w(Object obj, OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream can't be null");
        } else if (obj == null) {
            outputStream.write(f32723I);
        } else {
            k kVar = (k) this.f32745r.get();
            kVar.e(outputStream);
            Class<?> cls = obj.getClass();
            if (!x(kVar, cls, obj)) {
                i iVar = this.f32729b;
                if (iVar != null) {
                    iVar.a(obj, outputStream);
                    return;
                }
                throw new e("Unable to serialize provided object. Failed to find serializer for: " + cls);
            }
            kVar.d();
            kVar.e((OutputStream) null);
        }
    }

    public boolean x(k kVar, Type type, Object obj) {
        Class cls;
        List list;
        if (kVar == null) {
            throw new IllegalArgumentException("writer can't be null");
        } else if (obj == null) {
            try {
                kVar.n();
                return true;
            } catch (ClassCastException unused) {
                return false;
            }
        } else if (obj instanceof i[]) {
            v(kVar, (i[]) obj);
            return true;
        } else {
            k.a C10 = C(type);
            if (C10 != null) {
                C10.a(kVar, obj);
                return true;
            }
            Class<?> cls2 = null;
            if (type instanceof Class) {
                cls = (Class) type;
            } else {
                cls = null;
            }
            if (cls != null) {
                if (cls.isArray()) {
                    if (Array.getLength(obj) == 0) {
                        kVar.i("[]");
                        return true;
                    }
                    Class<?> componentType = cls.getComponentType();
                    if (Character.TYPE == componentType) {
                        r.a(new String((char[]) obj), kVar);
                        return true;
                    }
                    k.a B10 = B(componentType);
                    if (B10 != null) {
                        kVar.g((Object[]) obj, B10);
                        return true;
                    }
                }
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                if (collection.isEmpty()) {
                    kVar.i("[]");
                    return true;
                }
                Iterator it = collection.iterator();
                boolean z10 = collection instanceof List;
                if (z10) {
                    list = (List) collection;
                } else {
                    list = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                Class<?> cls3 = null;
                k.a aVar = null;
                do {
                    Object next = it.next();
                    if (!z10) {
                        list.add(next);
                    }
                    if (next != null) {
                        Class<?> cls4 = next.getClass();
                        if (cls4 != cls2 && (cls2 == null || cls4.isAssignableFrom(cls2))) {
                            cls2 = cls4;
                        }
                        if (cls3 != cls4) {
                            aVar = B(cls4);
                            cls3 = cls4;
                        }
                        arrayList.add(aVar);
                        if (!z11) {
                            if (aVar != null) {
                                z11 = false;
                            }
                        }
                        z11 = true;
                    } else {
                        arrayList.add(this.f32727D);
                    }
                } while (it.hasNext());
                if (cls2 != null && i.class.isAssignableFrom(cls2)) {
                    kVar.l((byte) 91);
                    Iterator it2 = list.iterator();
                    android.support.v4.media.session.c.a(it2.next());
                    kVar.n();
                    while (it2.hasNext()) {
                        kVar.l((byte) 44);
                        android.support.v4.media.session.c.a(it2.next());
                        kVar.n();
                    }
                    kVar.l((byte) 93);
                    return true;
                } else if (!z11) {
                    kVar.l((byte) 91);
                    Iterator it3 = list.iterator();
                    ((k.a) arrayList.get(0)).a(kVar, it3.next());
                    int i10 = 1;
                    while (it3.hasNext()) {
                        kVar.l((byte) 44);
                        ((k.a) arrayList.get(i10)).a(kVar, it3.next());
                        i10++;
                    }
                    kVar.l((byte) 93);
                    return true;
                } else {
                    k.a B11 = B(cls2);
                    if (B11 != null) {
                        kVar.f(collection, B11);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void y(Map map, k kVar) {
        kVar.l((byte) 123);
        int size = map.size();
        if (size > 0) {
            Iterator it = map.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            kVar.q((String) entry.getKey());
            kVar.l((byte) 58);
            u(kVar, entry.getValue());
            for (int i10 = 1; i10 < size; i10++) {
                kVar.l((byte) 44);
                Map.Entry entry2 = (Map.Entry) it.next();
                kVar.q((String) entry2.getKey());
                kVar.l((byte) 58);
                u(kVar, entry2.getValue());
            }
        }
        kVar.l((byte) 125);
    }

    public j.f z(Class cls) {
        return A(cls);
    }

    static class j extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f32762a;

        /* renamed from: b  reason: collision with root package name */
        private final InputStream f32763b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32764c = true;

        /* renamed from: d  reason: collision with root package name */
        private int f32765d;

        j(byte[] bArr, InputStream inputStream) {
            this.f32762a = bArr;
            this.f32763b = inputStream;
        }

        public int read() {
            if (this.f32764c) {
                int i10 = this.f32765d;
                byte[] bArr = this.f32762a;
                if (i10 < bArr.length) {
                    this.f32765d = i10 + 1;
                    return bArr[i10];
                }
                this.f32764c = false;
            }
            return this.f32763b.read();
        }

        public int read(byte[] bArr) {
            if (this.f32764c) {
                return super.read(bArr);
            }
            return this.f32763b.read(bArr);
        }

        public int read(byte[] bArr, int i10, int i11) {
            if (this.f32764c) {
                return super.read(bArr, i10, i11);
            }
            return this.f32763b.read(bArr, i10, i11);
        }
    }

    class d implements Iterator {
        d() {
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }

        public void remove() {
        }
    }
}
