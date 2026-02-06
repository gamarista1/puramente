package C4;

import B4.d;
import android.graphics.Paint;
import java.util.List;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.t;

public class s implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f30006a;

    /* renamed from: b  reason: collision with root package name */
    private final B4.b f30007b;

    /* renamed from: c  reason: collision with root package name */
    private final List f30008c;

    /* renamed from: d  reason: collision with root package name */
    private final B4.a f30009d;

    /* renamed from: e  reason: collision with root package name */
    private final d f30010e;

    /* renamed from: f  reason: collision with root package name */
    private final B4.b f30011f;

    /* renamed from: g  reason: collision with root package name */
    private final b f30012g;

    /* renamed from: h  reason: collision with root package name */
    private final c f30013h;

    /* renamed from: i  reason: collision with root package name */
    private final float f30014i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f30015j;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30016a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f30017b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                C4.s$c[] r0 = C4.s.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30017b = r0
                r1 = 1
                C4.s$c r2 = C4.s.c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f30017b     // Catch:{ NoSuchFieldError -> 0x001d }
                C4.s$c r3 = C4.s.c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f30017b     // Catch:{ NoSuchFieldError -> 0x0028 }
                C4.s$c r4 = C4.s.c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                C4.s$b[] r3 = C4.s.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f30016a = r3
                C4.s$b r4 = C4.s.b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f30016a     // Catch:{ NoSuchFieldError -> 0x0043 }
                C4.s$b r3 = C4.s.b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f30016a     // Catch:{ NoSuchFieldError -> 0x004d }
                C4.s$b r1 = C4.s.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C4.s.a.<clinit>():void");
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i10 = a.f30016a[ordinal()];
            if (i10 == 1) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i10 = a.f30017b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, B4.b bVar, List list, B4.a aVar, d dVar, B4.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f30006a = str;
        this.f30007b = bVar;
        this.f30008c = list;
        this.f30009d = aVar;
        this.f30010e = dVar;
        this.f30011f = bVar2;
        this.f30012g = bVar3;
        this.f30013h = cVar;
        this.f30014i = f10;
        this.f30015j = z10;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new t(l10, bVar, this);
    }

    public b b() {
        return this.f30012g;
    }

    public B4.a c() {
        return this.f30009d;
    }

    public B4.b d() {
        return this.f30007b;
    }

    public c e() {
        return this.f30013h;
    }

    public List f() {
        return this.f30008c;
    }

    public float g() {
        return this.f30014i;
    }

    public String h() {
        return this.f30006a;
    }

    public d i() {
        return this.f30010e;
    }

    public B4.b j() {
        return this.f30011f;
    }

    public boolean k() {
        return this.f30015j;
    }
}
