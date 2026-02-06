package cc;

import Zb.b;
import Zb.c;
import Zb.d;
import Zb.e;
import Zb.f;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: cc.f  reason: case insensitive filesystem */
final class C4482f implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f53695f = Charset.forName(Constants.ENCODING);

    /* renamed from: g  reason: collision with root package name */
    private static final c f53696g = c.a(SubscriberAttributeKt.JSON_NAME_KEY).b(C4477a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f53697h = c.a("value").b(C4477a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final d f53698i = new C4481e();

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f53699a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53700b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f53701c;

    /* renamed from: d  reason: collision with root package name */
    private final d f53702d;

    /* renamed from: e  reason: collision with root package name */
    private final C4485i f53703e = new C4485i(this);

    /* renamed from: cc.f$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53704a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                cc.d$a[] r0 = cc.C4480d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53704a = r0
                cc.d$a r1 = cc.C4480d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53704a     // Catch:{ NoSuchFieldError -> 0x001d }
                cc.d$a r1 = cc.C4480d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53704a     // Catch:{ NoSuchFieldError -> 0x0028 }
                cc.d$a r1 = cc.C4480d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cc.C4482f.a.<clinit>():void");
        }
    }

    C4482f(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.f53699a = outputStream;
        this.f53700b = map;
        this.f53701c = map2;
        this.f53702d = dVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(d dVar, Object obj) {
        OutputStream outputStream;
        C4478b bVar = new C4478b();
        try {
            outputStream = this.f53699a;
            this.f53699a = bVar;
            dVar.a(obj, this);
            this.f53699a = outputStream;
            long a10 = bVar.a();
            bVar.close();
            return a10;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private C4482f r(d dVar, c cVar, Object obj, boolean z10) {
        long q10 = q(dVar, obj);
        if (z10 && q10 == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(q10);
        dVar.a(obj, this);
        return this;
    }

    private C4482f s(f fVar, c cVar, Object obj, boolean z10) {
        this.f53703e.b(cVar, z10);
        fVar.a(obj, this.f53703e);
        return this;
    }

    private static C4480d u(c cVar) {
        C4480d dVar = (C4480d) cVar.c(C4480d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private static int v(c cVar) {
        C4480d dVar = (C4480d) cVar.c(C4480d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new b("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, e eVar) {
        eVar.f(f53696g, entry.getKey());
        eVar.f(f53697h, entry.getValue());
    }

    private void x(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f53699a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f53699a.write(i10 & 127);
    }

    private void y(long j10) {
        while ((-128 & j10) != 0) {
            this.f53699a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f53699a.write(((int) j10) & 127);
    }

    public e d(c cVar, double d10) {
        return g(cVar, d10, true);
    }

    public e f(c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    public e g(c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f53699a.write(p(8).putDouble(d10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e h(c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f53699a.write(p(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e i(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f53695f);
            x(bytes.length);
            this.f53699a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object i10 : (Collection) obj) {
                i(cVar, i10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry r10 : ((Map) obj).entrySet()) {
                r(f53698i, cVar, r10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return g(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return h(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return m(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return o(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                x((v(cVar) << 3) | 2);
                x(bArr.length);
                this.f53699a.write(bArr);
                return this;
            }
            d dVar = (d) this.f53700b.get(obj.getClass());
            if (dVar != null) {
                return r(dVar, cVar, obj, z10);
            }
            f fVar = (f) this.f53701c.get(obj.getClass());
            if (fVar != null) {
                return s(fVar, cVar, obj, z10);
            }
            if (obj instanceof C4479c) {
                return b(cVar, ((C4479c) obj).d());
            }
            if (obj instanceof Enum) {
                return b(cVar, ((Enum) obj).ordinal());
            }
            return r(this.f53702d, cVar, obj, z10);
        }
    }

    /* renamed from: j */
    public C4482f b(c cVar, int i10) {
        return k(cVar, i10, true);
    }

    /* access modifiers changed from: package-private */
    public C4482f k(c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        C4480d u10 = u(cVar);
        int i11 = a.f53704a[u10.intEncoding().ordinal()];
        if (i11 == 1) {
            x(u10.tag() << 3);
            x(i10);
        } else if (i11 == 2) {
            x(u10.tag() << 3);
            x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            x((u10.tag() << 3) | 5);
            this.f53699a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: l */
    public C4482f c(c cVar, long j10) {
        return m(cVar, j10, true);
    }

    /* access modifiers changed from: package-private */
    public C4482f m(c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        C4480d u10 = u(cVar);
        int i10 = a.f53704a[u10.intEncoding().ordinal()];
        if (i10 == 1) {
            x(u10.tag() << 3);
            y(j10);
        } else if (i10 == 2) {
            x(u10.tag() << 3);
            y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            x((u10.tag() << 3) | 1);
            this.f53699a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: n */
    public C4482f a(c cVar, boolean z10) {
        return o(cVar, z10, true);
    }

    /* access modifiers changed from: package-private */
    public C4482f o(c cVar, boolean z10, boolean z11) {
        return k(cVar, z10 ? 1 : 0, z11);
    }

    /* access modifiers changed from: package-private */
    public C4482f t(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.f53700b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b("No encoder for " + obj.getClass());
    }
}
