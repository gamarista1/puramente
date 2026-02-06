package Xf;

import Lf.o;
import fg.C5912i;
import fg.C5916k;
import fg.C5918l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import mf.Y;
import ng.c;
import yf.C6798l;

/* renamed from: Xf.b  reason: case insensitive filesystem */
public abstract class C5669b {

    /* renamed from: c  reason: collision with root package name */
    private static final a f66361c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Map f66362d;

    /* renamed from: a  reason: collision with root package name */
    private final D f66363a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f66364b = new ConcurrentHashMap();

    /* renamed from: Xf.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C5670c cVar : C5670c.values()) {
            String b10 = cVar.b();
            if (linkedHashMap.get(b10) == null) {
                linkedHashMap.put(b10, cVar);
            }
        }
        f66362d = linkedHashMap;
    }

    public C5669b(D d10) {
        C6496s.h(d10, "javaTypeEnhancementState");
        this.f66363a = d10;
    }

    private final Set b(Set set) {
        if (set.contains(C5670c.TYPE_USE)) {
            return Y.n(Y.m(C6559l.z1(C5670c.values()), C5670c.TYPE_PARAMETER_BOUNDS), set);
        }
        return set;
    }

    private final w e(Object obj) {
        C5918l i10;
        w u10 = u(obj);
        if (u10 != null) {
            return u10;
        }
        Pair w10 = w(obj);
        if (w10 == null) {
            return null;
        }
        Object a10 = w10.a();
        Set set = (Set) w10.b();
        O t10 = t(obj);
        if (t10 == null) {
            t10 = s(a10);
        }
        if (!t10.c() && (i10 = i(a10, C5668a.f66360a)) != null) {
            return new w(C5918l.b(i10, (C5916k) null, t10.e(), 1, (Object) null), set, false, 4, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean f(Object obj) {
        C6496s.h(obj, "$this$extractNullability");
        return false;
    }

    private final C5918l i(Object obj, C6798l lVar) {
        C5918l q10;
        C5918l q11 = q(obj, ((Boolean) lVar.invoke(obj)).booleanValue());
        if (q11 != null) {
            return q11;
        }
        Object v10 = v(obj);
        if (v10 == null) {
            return null;
        }
        O s10 = s(obj);
        if (!s10.c() && (q10 = q(v10, ((Boolean) lVar.invoke(v10)).booleanValue())) != null) {
            return C5918l.b(q10, (C5916k) null, s10.e(), 1, (Object) null);
        }
        return null;
    }

    private final Object j(Object obj, c cVar) {
        for (Object next : m(obj)) {
            if (C6496s.c(k(next), cVar)) {
                return next;
            }
        }
        return null;
    }

    private final boolean n(Object obj, c cVar) {
        Iterable<Object> m10 = m(obj);
        if ((m10 instanceof Collection) && ((Collection) m10).isEmpty()) {
            return false;
        }
        for (Object k10 : m10) {
            if (C6496s.c(k(k10), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.equals("ALWAYS") != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r6.equals("NEVER") == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r6.equals("MAYBE") == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r6 = fg.C5916k.f67672b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final fg.C5918l q(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            ng.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            Xf.D r2 = r5.f66363a
            yf.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            Xf.O r2 = (Xf.O) r2
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.util.Set r3 = Xf.J.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0029
            fg.k r6 = fg.C5916k.NOT_NULL
            goto L_0x008d
        L_0x0029:
            java.util.Set r3 = Xf.J.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0036
            fg.k r6 = fg.C5916k.NULLABLE
            goto L_0x008d
        L_0x0036:
            java.util.Set r3 = Xf.J.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0043
            fg.k r6 = fg.C5916k.FORCE_FLEXIBILITY
            goto L_0x008d
        L_0x0043:
            ng.c r3 = Xf.J.c()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r3)
            if (r0 == 0) goto L_0x009c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = mf.C6565s.p0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x008b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L_0x007f;
                case 74175084: goto L_0x0076;
                case 433141802: goto L_0x006a;
                case 1933739535: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0087
        L_0x0061:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0087
            goto L_0x008b
        L_0x006a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0073
            goto L_0x0087
        L_0x0073:
            fg.k r6 = fg.C5916k.FORCE_FLEXIBILITY
            goto L_0x008d
        L_0x0076:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0088
            goto L_0x0087
        L_0x007f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0088
        L_0x0087:
            return r1
        L_0x0088:
            fg.k r6 = fg.C5916k.NULLABLE
            goto L_0x008d
        L_0x008b:
            fg.k r6 = fg.C5916k.NOT_NULL
        L_0x008d:
            fg.l r0 = new fg.l
            boolean r1 = r2.e()
            if (r1 != 0) goto L_0x0097
            if (r7 == 0) goto L_0x0098
        L_0x0097:
            r4 = 1
        L_0x0098:
            r0.<init>(r6, r4)
            return r0
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.C5669b.q(java.lang.Object, boolean):fg.l");
    }

    private final O r(Object obj) {
        c k10 = k(obj);
        if (k10 == null || !x.b().containsKey(k10)) {
            return s(obj);
        }
        return (O) this.f66363a.c().invoke(k10);
    }

    private final O s(Object obj) {
        O t10 = t(obj);
        if (t10 != null) {
            return t10;
        }
        return this.f66363a.d().c();
    }

    private final O t(Object obj) {
        Iterable c10;
        String str;
        O o10 = (O) this.f66363a.d().e().get(k(obj));
        if (o10 != null) {
            return o10;
        }
        Object j10 = j(obj, J.p());
        if (j10 == null || (c10 = c(j10, false)) == null || (str = (String) C6565s.p0(c10)) == null) {
            return null;
        }
        O d10 = this.f66363a.d().d();
        if (d10 != null) {
            return d10;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return O.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return O.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return O.IGNORE;
        }
    }

    private final w u(Object obj) {
        w wVar;
        if (this.f66363a.b() || (wVar = (w) x.a().get(k(obj))) == null) {
            return null;
        }
        O r10 = r(obj);
        if (r10 == O.IGNORE) {
            r10 = null;
        }
        if (r10 == null) {
            return null;
        }
        return w.b(wVar, C5918l.b(wVar.d(), (C5916k) null, r10.e(), 1, (Object) null), (Collection) null, false, 6, (Object) null);
    }

    private final Pair w(Object obj) {
        Object j10;
        Object obj2;
        if (this.f66363a.d().f() || (j10 = j(obj, J.g())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (v(obj2) != null) {
                break;
            }
        }
        if (obj2 == null) {
            return null;
        }
        Iterable<String> c10 = c(j10, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : c10) {
            C5670c cVar = (C5670c) f66362d.get(str);
            if (cVar != null) {
                linkedHashSet.add(cVar);
            }
        }
        return new Pair(obj2, b(linkedHashSet));
    }

    /* access modifiers changed from: protected */
    public abstract Iterable c(Object obj, boolean z10);

    public final E d(E e10, Iterable iterable) {
        EnumMap enumMap;
        EnumMap b10;
        C6496s.h(iterable, "annotations");
        if (this.f66363a.b()) {
            return e10;
        }
        ArrayList<w> arrayList = new ArrayList<>();
        for (Object e11 : iterable) {
            w e12 = e(e11);
            if (e12 != null) {
                arrayList.add(e12);
            }
        }
        if (arrayList.isEmpty()) {
            return e10;
        }
        Class<C5670c> cls = C5670c.class;
        EnumMap enumMap2 = new EnumMap(cls);
        for (w wVar : arrayList) {
            for (C5670c cVar : wVar.e()) {
                if (!enumMap2.containsKey(cVar) || !o()) {
                    enumMap2.put(cVar, wVar);
                } else {
                    w wVar2 = (w) enumMap2.get(cVar);
                    if (wVar2 != null) {
                        C5918l d10 = wVar2.d();
                        C5918l d11 = wVar.d();
                        if (!C6496s.c(d11, d10) && (!d11.d() || d10.d())) {
                            wVar2 = (d11.d() || !d10.d()) ? null : wVar;
                        }
                        enumMap2.put(cVar, wVar2);
                    }
                }
            }
        }
        if (e10 == null || (b10 = e10.b()) == null) {
            enumMap = new EnumMap(cls);
        } else {
            enumMap = new EnumMap(b10);
        }
        boolean z10 = false;
        for (Map.Entry entry : enumMap2.entrySet()) {
            C5670c cVar2 = (C5670c) entry.getKey();
            w wVar3 = (w) entry.getValue();
            if (wVar3 != null) {
                enumMap.put(cVar2, wVar3);
                z10 = true;
            }
        }
        if (!z10) {
            return e10;
        }
        return new E(enumMap);
    }

    public final C5912i g(Iterable iterable) {
        C5912i iVar;
        C6496s.h(iterable, "annotations");
        C5912i iVar2 = null;
        for (Object k10 : iterable) {
            c k11 = k(k10);
            if (C6565s.e0(J.o(), k11)) {
                iVar = C5912i.READ_ONLY;
            } else if (C6565s.e0(J.l(), k11)) {
                iVar = C5912i.MUTABLE;
            } else {
                continue;
            }
            if (iVar2 != null && iVar2 != iVar) {
                return null;
            }
            iVar2 = iVar;
        }
        return iVar2;
    }

    public final C5918l h(Iterable iterable, C6798l lVar) {
        C6496s.h(iterable, "annotations");
        C6496s.h(lVar, "forceWarning");
        C5918l lVar2 = null;
        for (Object i10 : iterable) {
            C5918l i11 = i(i10, lVar);
            if (lVar2 != null) {
                if (i11 != null && !C6496s.c(i11, lVar2)) {
                    if (!i11.d() || lVar2.d()) {
                        if (i11.d() || !lVar2.d()) {
                            return null;
                        }
                    }
                }
            }
            lVar2 = i11;
        }
        return lVar2;
    }

    /* access modifiers changed from: protected */
    public abstract c k(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object l(Object obj);

    /* access modifiers changed from: protected */
    public abstract Iterable m(Object obj);

    public abstract boolean o();

    public final boolean p(Object obj) {
        C6496s.h(obj, "annotation");
        Object j10 = j(obj, o.a.f63968H);
        if (j10 == null) {
            return false;
        }
        Iterable<String> c10 = c(j10, false);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String c11 : c10) {
            if (C6496s.c(c11, "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object v(Object obj) {
        Object obj2;
        C6496s.h(obj, "annotation");
        if (this.f66363a.d().f()) {
            return null;
        }
        if (C6565s.e0(J.a(), k(obj)) || n(obj, J.f())) {
            return obj;
        }
        if (!n(obj, J.h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f66364b;
        Object l10 = l(obj);
        Object obj3 = concurrentHashMap.get(l10);
        if (obj3 != null) {
            return obj3;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = v(it.next());
            if (obj2 != null) {
                break;
            }
        }
        if (obj2 == null) {
            return null;
        }
        Object putIfAbsent = concurrentHashMap.putIfAbsent(l10, obj2);
        if (putIfAbsent == null) {
            return obj2;
        }
        return putIfAbsent;
    }
}
