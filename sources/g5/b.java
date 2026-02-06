package G5;

import G5.f;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import mf.Y;
import t7.C4049a;

public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f31465m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private static final Map f31466n = O.k(C6502A.a("embedding.weight", "embed.weight"), C6502A.a("dense1.weight", "fc1.weight"), C6502A.a("dense2.weight", "fc2.weight"), C6502A.a("dense3.weight", "fc3.weight"), C6502A.a("dense1.bias", "fc1.bias"), C6502A.a("dense2.bias", "fc2.bias"), C6502A.a("dense3.bias", "fc3.bias"));

    /* renamed from: a  reason: collision with root package name */
    private final a f31467a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31468b;

    /* renamed from: c  reason: collision with root package name */
    private final a f31469c;

    /* renamed from: d  reason: collision with root package name */
    private final a f31470d;

    /* renamed from: e  reason: collision with root package name */
    private final a f31471e;

    /* renamed from: f  reason: collision with root package name */
    private final a f31472f;

    /* renamed from: g  reason: collision with root package name */
    private final a f31473g;

    /* renamed from: h  reason: collision with root package name */
    private final a f31474h;

    /* renamed from: i  reason: collision with root package name */
    private final a f31475i;

    /* renamed from: j  reason: collision with root package name */
    private final a f31476j;

    /* renamed from: k  reason: collision with root package name */
    private final a f31477k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f31478l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map b(File file) {
            Map c10 = j.c(file);
            if (c10 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a10 = b.a();
            for (Map.Entry entry : c10.entrySet()) {
                String str = (String) entry.getKey();
                if (a10.containsKey(entry.getKey()) && (str = (String) a10.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(str, entry.getValue());
            }
            return hashMap;
        }

        public final b a(File file) {
            C6496s.h(file, "file");
            Map b10 = b(file);
            if (b10 == null) {
                return null;
            }
            try {
                return new b(b10, (DefaultConstructorMarker) null);
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        Class<b> cls = b.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f31466n;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public final a b(a aVar, String[] strArr, String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(aVar, "dense");
            C6496s.h(strArr, "texts");
            C6496s.h(str, "task");
            a c10 = i.c(i.e(strArr, 128, this.f31467a), this.f31468b);
            i.a(c10, this.f31471e);
            i.i(c10);
            a c11 = i.c(c10, this.f31469c);
            i.a(c11, this.f31472f);
            i.i(c11);
            a g10 = i.g(c11, 2);
            a c12 = i.c(g10, this.f31470d);
            i.a(c12, this.f31473g);
            i.i(c12);
            a g11 = i.g(c10, c10.b(1));
            a g12 = i.g(g10, g10.b(1));
            a g13 = i.g(c12, c12.b(1));
            i.f(g11, 1);
            i.f(g12, 1);
            i.f(g13, 1);
            a d10 = i.d(i.b(new a[]{g11, g12, g13, aVar}), this.f31474h, this.f31476j);
            i.i(d10);
            a d11 = i.d(d10, this.f31475i, this.f31477k);
            i.i(d11);
            Map map = this.f31478l;
            a aVar2 = (a) map.get(str + ".weight");
            Map map2 = this.f31478l;
            a aVar3 = (a) map2.get(str + ".bias");
            if (aVar2 != null) {
                if (aVar3 != null) {
                    a d12 = i.d(d11, aVar2, aVar3);
                    i.j(d12);
                    return d12;
                }
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private b(Map map) {
        Object obj = map.get("embed.weight");
        if (obj != null) {
            this.f31467a = (a) obj;
            Object obj2 = map.get("convs.0.weight");
            if (obj2 != null) {
                this.f31468b = i.l((a) obj2);
                Object obj3 = map.get("convs.1.weight");
                if (obj3 != null) {
                    this.f31469c = i.l((a) obj3);
                    Object obj4 = map.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f31470d = i.l((a) obj4);
                        Object obj5 = map.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f31471e = (a) obj5;
                            Object obj6 = map.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f31472f = (a) obj6;
                                Object obj7 = map.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f31473g = (a) obj7;
                                    Object obj8 = map.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f31474h = i.k((a) obj8);
                                        Object obj9 = map.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f31475i = i.k((a) obj9);
                                            Object obj10 = map.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f31476j = (a) obj10;
                                                Object obj11 = map.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f31477k = (a) obj11;
                                                    this.f31478l = new HashMap();
                                                    for (String str : Y.j(f.a.MTML_INTEGRITY_DETECT.b(), f.a.MTML_APP_EVENT_PREDICTION.b())) {
                                                        String str2 = str + ".weight";
                                                        String str3 = str + ".bias";
                                                        a aVar = (a) map.get(str2);
                                                        a aVar2 = (a) map.get(str3);
                                                        if (aVar != null) {
                                                            this.f31478l.put(str2, i.k(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f31478l.put(str3, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
