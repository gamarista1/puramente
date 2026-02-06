package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.c;
import androidx.datastore.preferences.protobuf.r0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
final class C1736i implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1735h f16381a;

    /* renamed from: b  reason: collision with root package name */
    private int f16382b;

    /* renamed from: c  reason: collision with root package name */
    private int f16383c;

    /* renamed from: d  reason: collision with root package name */
    private int f16384d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16385a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.r0$b[] r0 = androidx.datastore.preferences.protobuf.r0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16385a = r0
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f16385a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1736i.a.<clinit>():void");
        }
    }

    private C1736i(C1735h hVar) {
        C1735h hVar2 = (C1735h) C1751y.b(hVar, MetricTracker.Object.INPUT);
        this.f16381a = hVar2;
        hVar2.f16341d = this;
    }

    public static C1736i O(C1735h hVar) {
        C1736i iVar = hVar.f16341d;
        if (iVar != null) {
            return iVar;
        }
        return new C1736i(hVar);
    }

    private Object P(r0.b bVar, Class cls, C1742o oVar) {
        switch (a.f16385a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return p();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(x());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(q());
            case 9:
                return Long.valueOf(M());
            case 10:
                return S(cls, oVar);
            case 11:
                return Integer.valueOf(J());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return Long.valueOf(C());
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return N();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(v());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object Q(e0 e0Var, C1742o oVar) {
        int i10 = this.f16383c;
        this.f16383c = r0.c(r0.a(this.f16382b), 4);
        try {
            Object b10 = e0Var.b();
            e0Var.h(b10, this, oVar);
            e0Var.e(b10);
            if (this.f16382b == this.f16383c) {
                return b10;
            }
            throw C1752z.g();
        } finally {
            this.f16383c = i10;
        }
    }

    private Object R(e0 e0Var, C1742o oVar) {
        int C10 = this.f16381a.C();
        C1735h hVar = this.f16381a;
        if (hVar.f16338a < hVar.f16339b) {
            int l10 = hVar.l(C10);
            Object b10 = e0Var.b();
            this.f16381a.f16338a++;
            e0Var.h(b10, this, oVar);
            e0Var.e(b10);
            this.f16381a.a(0);
            C1735h hVar2 = this.f16381a;
            hVar2.f16338a--;
            hVar2.k(l10);
            return b10;
        }
        throw C1752z.h();
    }

    private void U(int i10) {
        if (this.f16381a.d() != i10) {
            throw C1752z.k();
        }
    }

    private void V(int i10) {
        if (r0.b(this.f16382b) != i10) {
            throw C1752z.d();
        }
    }

    private void W(int i10) {
        if ((i10 & 3) != 0) {
            throw C1752z.g();
        }
    }

    private void X(int i10) {
        if ((i10 & 7) != 0) {
            throw C1752z.g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (I() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw new androidx.datastore.preferences.protobuf.C1752z(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A(java.util.Map r8, androidx.datastore.preferences.protobuf.H.a r9, androidx.datastore.preferences.protobuf.C1742o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f16381a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f16381a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f16275b
            java.lang.Object r3 = r9.f16277d
        L_0x0014:
            int r4 = r7.E()     // Catch:{ all -> 0x003a }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005e
            androidx.datastore.preferences.protobuf.h r5 = r7.f16381a     // Catch:{ all -> 0x003a }
            boolean r5 = r5.e()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0026
            goto L_0x005e
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0049
            if (r4 == r0) goto L_0x003c
            boolean r4 = r7.I()     // Catch:{ a -> 0x0051 }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch:{ a -> 0x0051 }
            r4.<init>(r6)     // Catch:{ a -> 0x0051 }
            throw r4     // Catch:{ a -> 0x0051 }
        L_0x003a:
            r8 = move-exception
            goto L_0x0067
        L_0x003c:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f16276c     // Catch:{ a -> 0x0051 }
            java.lang.Object r5 = r9.f16277d     // Catch:{ a -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x0051 }
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0049:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f16274a     // Catch:{ a -> 0x0051 }
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            boolean r4 = r7.I()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0058
            goto L_0x0014
        L_0x0058:
            androidx.datastore.preferences.protobuf.z r8 = new androidx.datastore.preferences.protobuf.z     // Catch:{ all -> 0x003a }
            r8.<init>(r6)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x005e:
            r8.put(r2, r3)     // Catch:{ all -> 0x003a }
            androidx.datastore.preferences.protobuf.h r8 = r7.f16381a
            r8.k(r1)
            return
        L_0x0067:
            androidx.datastore.preferences.protobuf.h r9 = r7.f16381a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1736i.A(java.util.Map, androidx.datastore.preferences.protobuf.H$a, androidx.datastore.preferences.protobuf.o):void");
    }

    public void B(List list) {
        int B10;
        if (list instanceof C1750x) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 2) {
                W(this.f16381a.C());
                this.f16381a.d();
                this.f16381a.q();
                throw null;
            } else if (b10 != 5) {
                throw C1752z.d();
            } else {
                this.f16381a.q();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 2) {
                int C10 = this.f16381a.C();
                W(C10);
                int d10 = this.f16381a.d() + C10;
                do {
                    list.add(Integer.valueOf(this.f16381a.q()));
                } while (this.f16381a.d() < d10);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16381a.q()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else {
                throw C1752z.d();
            }
        }
    }

    public long C() {
        V(0);
        return this.f16381a.y();
    }

    public String D() {
        V(2);
        return this.f16381a.z();
    }

    public int E() {
        int i10 = this.f16384d;
        if (i10 != 0) {
            this.f16382b = i10;
            this.f16384d = 0;
        } else {
            this.f16382b = this.f16381a.B();
        }
        int i11 = this.f16382b;
        if (i11 == 0 || i11 == this.f16383c) {
            return a.e.API_PRIORITY_OTHER;
        }
        return r0.a(i11);
    }

    public void F(List list) {
        T(list, false);
    }

    public void G(List list) {
        int B10;
        if (list instanceof C1747u) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 2) {
                W(this.f16381a.C());
                this.f16381a.d();
                this.f16381a.s();
                throw null;
            } else if (b10 != 5) {
                throw C1752z.d();
            } else {
                this.f16381a.s();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 2) {
                int C10 = this.f16381a.C();
                W(C10);
                int d10 = this.f16381a.d() + C10;
                do {
                    list.add(Float.valueOf(this.f16381a.s()));
                } while (this.f16381a.d() < d10);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f16381a.s()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else {
                throw C1752z.d();
            }
        }
    }

    public void H(List list, e0 e0Var, C1742o oVar) {
        int B10;
        if (r0.b(this.f16382b) == 3) {
            int i10 = this.f16382b;
            do {
                list.add(Q(e0Var, oVar));
                if (!this.f16381a.e() && this.f16384d == 0) {
                    B10 = this.f16381a.B();
                } else {
                    return;
                }
            } while (B10 == i10);
            this.f16384d = B10;
            return;
        }
        throw C1752z.d();
    }

    public boolean I() {
        int i10;
        if (this.f16381a.e() || (i10 = this.f16382b) == this.f16383c) {
            return false;
        }
        return this.f16381a.E(i10);
    }

    public int J() {
        V(5);
        return this.f16381a.v();
    }

    public void K(List list) {
        int B10;
        if (r0.b(this.f16382b) == 2) {
            do {
                list.add(p());
                if (!this.f16381a.e()) {
                    B10 = this.f16381a.B();
                } else {
                    return;
                }
            } while (B10 == this.f16382b);
            this.f16384d = B10;
            return;
        }
        throw C1752z.d();
    }

    public void L(List list) {
        int B10;
        if (list instanceof C1739l) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 1) {
                this.f16381a.o();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                X(this.f16381a.C());
                this.f16381a.d();
                this.f16381a.o();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f16381a.o()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int C10 = this.f16381a.C();
                X(C10);
                int d10 = this.f16381a.d() + C10;
                do {
                    list.add(Double.valueOf(this.f16381a.o()));
                } while (this.f16381a.d() < d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public long M() {
        V(0);
        return this.f16381a.u();
    }

    public String N() {
        V(2);
        return this.f16381a.A();
    }

    public Object S(Class cls, C1742o oVar) {
        V(2);
        return R(a0.a().c(cls), oVar);
    }

    public void T(List list, boolean z10) {
        String str;
        int B10;
        int B11;
        if (r0.b(this.f16382b) != 2) {
            throw C1752z.d();
        } else if (!(list instanceof D) || z10) {
            do {
                if (z10) {
                    str = N();
                } else {
                    str = D();
                }
                list.add(str);
                if (!this.f16381a.e()) {
                    B10 = this.f16381a.B();
                } else {
                    return;
                }
            } while (B10 == this.f16382b);
            this.f16384d = B10;
        } else {
            D d10 = (D) list;
            do {
                d10.X(p());
                if (!this.f16381a.e()) {
                    B11 = this.f16381a.B();
                } else {
                    return;
                }
            } while (B11 == this.f16382b);
            this.f16384d = B11;
        }
    }

    public Object a(e0 e0Var, C1742o oVar) {
        V(2);
        return R(e0Var, oVar);
    }

    public long b() {
        V(1);
        return this.f16381a.r();
    }

    public void c(List list) {
        int B10;
        if (list instanceof C1750x) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 2) {
                W(this.f16381a.C());
                this.f16381a.d();
                this.f16381a.v();
                throw null;
            } else if (b10 != 5) {
                throw C1752z.d();
            } else {
                this.f16381a.v();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 2) {
                int C10 = this.f16381a.C();
                W(C10);
                int d10 = this.f16381a.d() + C10;
                do {
                    list.add(Integer.valueOf(this.f16381a.v()));
                } while (this.f16381a.d() < d10);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16381a.v()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else {
                throw C1752z.d();
            }
        }
    }

    public void d(List list) {
        int B10;
        if (list instanceof F) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.y();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.y();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f16381a.y()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Long.valueOf(this.f16381a.y()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public boolean e() {
        V(0);
        return this.f16381a.m();
    }

    public long f() {
        V(1);
        return this.f16381a.w();
    }

    public void g(List list) {
        int B10;
        if (list instanceof F) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.D();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.D();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f16381a.D()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Long.valueOf(this.f16381a.D()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public int h() {
        V(0);
        return this.f16381a.C();
    }

    public void i(List list) {
        int B10;
        if (list instanceof F) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.u();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.u();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f16381a.u()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Long.valueOf(this.f16381a.u()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public void j(List list) {
        int B10;
        if (list instanceof C1750x) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.p();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.p();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16381a.p()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Integer.valueOf(this.f16381a.p()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public int k() {
        V(0);
        return this.f16381a.p();
    }

    public int l() {
        V(0);
        return this.f16381a.x();
    }

    public int m() {
        return this.f16382b;
    }

    public void n(List list) {
        int B10;
        if (list instanceof C1732e) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.m();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.m();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f16381a.m()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Boolean.valueOf(this.f16381a.m()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public void o(List list) {
        T(list, true);
    }

    public C1734g p() {
        V(2);
        return this.f16381a.n();
    }

    public int q() {
        V(0);
        return this.f16381a.t();
    }

    public void r(List list, e0 e0Var, C1742o oVar) {
        int B10;
        if (r0.b(this.f16382b) == 2) {
            int i10 = this.f16382b;
            do {
                list.add(R(e0Var, oVar));
                if (!this.f16381a.e() && this.f16384d == 0) {
                    B10 = this.f16381a.B();
                } else {
                    return;
                }
            } while (B10 == i10);
            this.f16384d = B10;
            return;
        }
        throw C1752z.d();
    }

    public double readDouble() {
        V(1);
        return this.f16381a.o();
    }

    public float readFloat() {
        V(5);
        return this.f16381a.s();
    }

    public void s(List list) {
        int B10;
        if (list instanceof F) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 1) {
                this.f16381a.r();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                X(this.f16381a.C());
                this.f16381a.d();
                this.f16381a.r();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f16381a.r()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int C10 = this.f16381a.C();
                X(C10);
                int d10 = this.f16381a.d() + C10;
                do {
                    list.add(Long.valueOf(this.f16381a.r()));
                } while (this.f16381a.d() < d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public Object t(e0 e0Var, C1742o oVar) {
        V(3);
        return Q(e0Var, oVar);
    }

    public void u(List list) {
        int B10;
        if (list instanceof C1750x) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.x();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.x();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16381a.x()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Integer.valueOf(this.f16381a.x()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public long v() {
        V(0);
        return this.f16381a.D();
    }

    public void w(List list) {
        int B10;
        if (list instanceof C1750x) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.C();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.C();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16381a.C()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Integer.valueOf(this.f16381a.C()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public int x() {
        V(5);
        return this.f16381a.q();
    }

    public void y(List list) {
        int B10;
        if (list instanceof F) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 1) {
                this.f16381a.w();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                X(this.f16381a.C());
                this.f16381a.d();
                this.f16381a.w();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f16381a.w()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int C10 = this.f16381a.C();
                X(C10);
                int d10 = this.f16381a.d() + C10;
                do {
                    list.add(Long.valueOf(this.f16381a.w()));
                } while (this.f16381a.d() < d10);
            } else {
                throw C1752z.d();
            }
        }
    }

    public void z(List list) {
        int B10;
        if (list instanceof C1750x) {
            c.a(list);
            int b10 = r0.b(this.f16382b);
            if (b10 == 0) {
                this.f16381a.t();
                throw null;
            } else if (b10 != 2) {
                throw C1752z.d();
            } else {
                this.f16381a.C();
                this.f16381a.d();
                this.f16381a.t();
                throw null;
            }
        } else {
            int b11 = r0.b(this.f16382b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16381a.t()));
                    if (!this.f16381a.e()) {
                        B10 = this.f16381a.B();
                    } else {
                        return;
                    }
                } while (B10 == this.f16382b);
                this.f16384d = B10;
            } else if (b11 == 2) {
                int d10 = this.f16381a.d() + this.f16381a.C();
                do {
                    list.add(Integer.valueOf(this.f16381a.t()));
                } while (this.f16381a.d() < d10);
                U(d10);
            } else {
                throw C1752z.d();
            }
        }
    }
}
