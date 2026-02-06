package bc;

import Zb.b;
import Zb.c;
import Zb.d;
import Zb.e;
import Zb.f;
import Zb.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: bc.e  reason: case insensitive filesystem */
final class C4472e implements e, g {

    /* renamed from: a  reason: collision with root package name */
    private C4472e f53673a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f53674b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f53675c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f53676d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f53677e;

    /* renamed from: f  reason: collision with root package name */
    private final d f53678f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f53679g;

    C4472e(Writer writer, Map map, Map map2, d dVar, boolean z10) {
        this.f53675c = new JsonWriter(writer);
        this.f53676d = map;
        this.f53677e = map2;
        this.f53678f = dVar;
        this.f53679g = z10;
    }

    private boolean t(Object obj) {
        if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
            return true;
        }
        return false;
    }

    private C4472e w(String str, Object obj) {
        y();
        this.f53675c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f53675c.nullValue();
        return this;
    }

    private C4472e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f53675c.name(str);
        return k(obj, false);
    }

    private void y() {
        if (this.f53674b) {
            C4472e eVar = this.f53673a;
            if (eVar != null) {
                eVar.y();
                this.f53673a.f53674b = false;
                this.f53673a = null;
                this.f53675c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public e a(c cVar, boolean z10) {
        return q(cVar.b(), z10);
    }

    public e b(c cVar, int i10) {
        return n(cVar.b(), i10);
    }

    public e c(c cVar, long j10) {
        return o(cVar.b(), j10);
    }

    public e d(c cVar, double d10) {
        return m(cVar.b(), d10);
    }

    public e f(c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    public C4472e h(double d10) {
        y();
        this.f53675c.value(d10);
        return this;
    }

    public C4472e i(int i10) {
        y();
        this.f53675c.value((long) i10);
        return this;
    }

    public C4472e j(long j10) {
        y();
        this.f53675c.value(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C4472e k(Object obj, boolean z10) {
        Class<?> cls;
        if (z10 && t(obj)) {
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            throw new b(String.format("%s cannot be encoded inline", new Object[]{cls}));
        } else if (obj == null) {
            this.f53675c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f53675c.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    return s((byte[]) obj);
                }
                this.f53675c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        this.f53675c.value((long) iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        j(jArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        this.f53675c.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        this.f53675c.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    for (Number k10 : (Number[]) obj) {
                        k(k10, false);
                    }
                } else {
                    for (Object k11 : (Object[]) obj) {
                        k(k11, false);
                    }
                }
                this.f53675c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f53675c.beginArray();
                for (Object k12 : (Collection) obj) {
                    k(k12, false);
                }
                this.f53675c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f53675c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                this.f53675c.endObject();
                return this;
            } else {
                d dVar = (d) this.f53676d.get(obj.getClass());
                if (dVar != null) {
                    return v(dVar, obj, z10);
                }
                f fVar = (f) this.f53677e.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (!(obj instanceof Enum)) {
                    return v(this.f53678f, obj, z10);
                } else {
                    if (obj instanceof C4473f) {
                        i(((C4473f) obj).d());
                    } else {
                        e(((Enum) obj).name());
                    }
                    return this;
                }
            }
        }
    }

    /* renamed from: l */
    public C4472e e(String str) {
        y();
        this.f53675c.value(str);
        return this;
    }

    public C4472e m(String str, double d10) {
        y();
        this.f53675c.name(str);
        return h(d10);
    }

    public C4472e n(String str, int i10) {
        y();
        this.f53675c.name(str);
        return i(i10);
    }

    public C4472e o(String str, long j10) {
        y();
        this.f53675c.name(str);
        return j(j10);
    }

    public C4472e p(String str, Object obj) {
        if (this.f53679g) {
            return x(str, obj);
        }
        return w(str, obj);
    }

    public C4472e q(String str, boolean z10) {
        y();
        this.f53675c.name(str);
        return g(z10);
    }

    /* renamed from: r */
    public C4472e g(boolean z10) {
        y();
        this.f53675c.value(z10);
        return this;
    }

    public C4472e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f53675c.nullValue();
        } else {
            this.f53675c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        y();
        this.f53675c.flush();
    }

    /* access modifiers changed from: package-private */
    public C4472e v(d dVar, Object obj, boolean z10) {
        if (!z10) {
            this.f53675c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f53675c.endObject();
        }
        return this;
    }
}
