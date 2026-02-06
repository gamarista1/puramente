package P3;

import Ef.m;
import android.support.v4.media.session.c;
import androidx.work.C1834a;
import androidx.work.C1838e;
import androidx.work.C1840g;
import androidx.work.D;
import androidx.work.s;
import androidx.work.x;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import q.C2414a;

public final class u {

    /* renamed from: x  reason: collision with root package name */
    public static final a f5088x = new a((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    private static final String f5089y;

    /* renamed from: z  reason: collision with root package name */
    public static final C2414a f5090z = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f5091a;

    /* renamed from: b  reason: collision with root package name */
    public D f5092b;

    /* renamed from: c  reason: collision with root package name */
    public String f5093c;

    /* renamed from: d  reason: collision with root package name */
    public String f5094d;

    /* renamed from: e  reason: collision with root package name */
    public C1840g f5095e;

    /* renamed from: f  reason: collision with root package name */
    public C1840g f5096f;

    /* renamed from: g  reason: collision with root package name */
    public long f5097g;

    /* renamed from: h  reason: collision with root package name */
    public long f5098h;

    /* renamed from: i  reason: collision with root package name */
    public long f5099i;

    /* renamed from: j  reason: collision with root package name */
    public C1838e f5100j;

    /* renamed from: k  reason: collision with root package name */
    public int f5101k;

    /* renamed from: l  reason: collision with root package name */
    public C1834a f5102l;

    /* renamed from: m  reason: collision with root package name */
    public long f5103m;

    /* renamed from: n  reason: collision with root package name */
    public long f5104n;

    /* renamed from: o  reason: collision with root package name */
    public long f5105o;

    /* renamed from: p  reason: collision with root package name */
    public long f5106p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5107q;

    /* renamed from: r  reason: collision with root package name */
    public x f5108r;

    /* renamed from: s  reason: collision with root package name */
    private int f5109s;

    /* renamed from: t  reason: collision with root package name */
    private final int f5110t;

    /* renamed from: u  reason: collision with root package name */
    private long f5111u;

    /* renamed from: v  reason: collision with root package name */
    private int f5112v;

    /* renamed from: w  reason: collision with root package name */
    private final int f5113w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z10, int i10, C1834a aVar, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            long j16;
            long j17;
            int i12 = i10;
            C1834a aVar2 = aVar;
            long j18 = j10;
            long j19 = j15;
            C6496s.h(aVar, "backoffPolicy");
            if (j19 == Long.MAX_VALUE || !z11) {
                if (z10) {
                    if (aVar2 == C1834a.LINEAR) {
                        j17 = ((long) i12) * j18;
                    } else {
                        j17 = (long) Math.scalb((float) j18, i12 - 1);
                    }
                    return j11 + m.i(j17, 18000000);
                } else if (z11) {
                    if (i11 == 0) {
                        j16 = j11 + j12;
                    } else {
                        j16 = j11 + j14;
                    }
                    if (j13 != j14 && i11 == 0) {
                        j16 += j14 - j13;
                    }
                    return j16;
                } else if (j11 == -1) {
                    return Long.MAX_VALUE;
                } else {
                    return j11 + j12;
                }
            } else if (i11 == 0) {
                return j19;
            } else {
                return m.e(j19, 900000 + j11);
            }
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f5114a;

        /* renamed from: b  reason: collision with root package name */
        public D f5115b;

        public b(String str, D d10) {
            C6496s.h(str, "id");
            C6496s.h(d10, "state");
            this.f5114a = str;
            this.f5115b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C6496s.c(this.f5114a, bVar.f5114a) && this.f5115b == bVar.f5115b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f5114a.hashCode() * 31) + this.f5115b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f5114a + ", state=" + this.f5115b + ')';
        }
    }

    static {
        String i10 = s.i("WorkSpec");
        C6496s.g(i10, "tagWithPrefix(\"WorkSpec\")");
        f5089y = i10;
    }

    public u(String str, D d10, String str2, String str3, C1840g gVar, C1840g gVar2, long j10, long j11, long j12, C1838e eVar, int i10, C1834a aVar, long j13, long j14, long j15, long j16, boolean z10, x xVar, int i11, int i12, long j17, int i13, int i14) {
        C1840g gVar3 = gVar;
        C1840g gVar4 = gVar2;
        C1838e eVar2 = eVar;
        C1834a aVar2 = aVar;
        x xVar2 = xVar;
        C6496s.h(str, "id");
        C6496s.h(d10, "state");
        C6496s.h(str2, "workerClassName");
        C6496s.h(str3, "inputMergerClassName");
        C6496s.h(gVar3, MetricTracker.Object.INPUT);
        C6496s.h(gVar4, "output");
        C6496s.h(eVar2, "constraints");
        C6496s.h(aVar2, "backoffPolicy");
        C6496s.h(xVar2, "outOfQuotaPolicy");
        this.f5091a = str;
        this.f5092b = d10;
        this.f5093c = str2;
        this.f5094d = str3;
        this.f5095e = gVar3;
        this.f5096f = gVar4;
        this.f5097g = j10;
        this.f5098h = j11;
        this.f5099i = j12;
        this.f5100j = eVar2;
        this.f5101k = i10;
        this.f5102l = aVar2;
        this.f5103m = j13;
        this.f5104n = j14;
        this.f5105o = j15;
        this.f5106p = j16;
        this.f5107q = z10;
        this.f5108r = xVar2;
        this.f5109s = i11;
        this.f5110t = i12;
        this.f5111u = j17;
        this.f5112v = i13;
        this.f5113w = i14;
    }

    /* access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        c.a(it.next());
        throw null;
    }

    public static /* synthetic */ u e(u uVar, String str, D d10, String str2, String str3, C1840g gVar, C1840g gVar2, long j10, long j11, long j12, C1838e eVar, int i10, C1834a aVar, long j13, long j14, long j15, long j16, boolean z10, x xVar, int i11, int i12, long j17, int i13, int i14, int i15, Object obj) {
        u uVar2 = uVar;
        int i16 = i15;
        String str4 = (i16 & 1) != 0 ? uVar2.f5091a : str;
        D d11 = (i16 & 2) != 0 ? uVar2.f5092b : d10;
        String str5 = (i16 & 4) != 0 ? uVar2.f5093c : str2;
        String str6 = (i16 & 8) != 0 ? uVar2.f5094d : str3;
        C1840g gVar3 = (i16 & 16) != 0 ? uVar2.f5095e : gVar;
        C1840g gVar4 = (i16 & 32) != 0 ? uVar2.f5096f : gVar2;
        long j18 = (i16 & 64) != 0 ? uVar2.f5097g : j10;
        long j19 = (i16 & 128) != 0 ? uVar2.f5098h : j11;
        long j20 = (i16 & 256) != 0 ? uVar2.f5099i : j12;
        C1838e eVar2 = (i16 & 512) != 0 ? uVar2.f5100j : eVar;
        return uVar.d(str4, d11, str5, str6, gVar3, gVar4, j18, j19, j20, eVar2, (i16 & 1024) != 0 ? uVar2.f5101k : i10, (i16 & 2048) != 0 ? uVar2.f5102l : aVar, (i16 & 4096) != 0 ? uVar2.f5103m : j13, (i16 & 8192) != 0 ? uVar2.f5104n : j14, (i16 & 16384) != 0 ? uVar2.f5105o : j15, (i16 & 32768) != 0 ? uVar2.f5106p : j16, (i16 & 65536) != 0 ? uVar2.f5107q : z10, (131072 & i16) != 0 ? uVar2.f5108r : xVar, (i16 & 262144) != 0 ? uVar2.f5109s : i11, (i16 & 524288) != 0 ? uVar2.f5110t : i12, (i16 & 1048576) != 0 ? uVar2.f5111u : j17, (i16 & 2097152) != 0 ? uVar2.f5112v : i13, (i16 & 4194304) != 0 ? uVar2.f5113w : i14);
    }

    public final long c() {
        a aVar = f5088x;
        return aVar.a(l(), this.f5101k, this.f5102l, this.f5103m, this.f5104n, this.f5109s, m(), this.f5097g, this.f5099i, this.f5098h, this.f5111u);
    }

    public final u d(String str, D d10, String str2, String str3, C1840g gVar, C1840g gVar2, long j10, long j11, long j12, C1838e eVar, int i10, C1834a aVar, long j13, long j14, long j15, long j16, boolean z10, x xVar, int i11, int i12, long j17, int i13, int i14) {
        String str4 = str;
        C6496s.h(str4, "id");
        C6496s.h(d10, "state");
        C6496s.h(str2, "workerClassName");
        C6496s.h(str3, "inputMergerClassName");
        C6496s.h(gVar, MetricTracker.Object.INPUT);
        C6496s.h(gVar2, "output");
        C6496s.h(eVar, "constraints");
        C6496s.h(aVar, "backoffPolicy");
        C6496s.h(xVar, "outOfQuotaPolicy");
        return new u(str4, d10, str2, str3, gVar, gVar2, j10, j11, j12, eVar, i10, aVar, j13, j14, j15, j16, z10, xVar, i11, i12, j17, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (C6496s.c(this.f5091a, uVar.f5091a) && this.f5092b == uVar.f5092b && C6496s.c(this.f5093c, uVar.f5093c) && C6496s.c(this.f5094d, uVar.f5094d) && C6496s.c(this.f5095e, uVar.f5095e) && C6496s.c(this.f5096f, uVar.f5096f) && this.f5097g == uVar.f5097g && this.f5098h == uVar.f5098h && this.f5099i == uVar.f5099i && C6496s.c(this.f5100j, uVar.f5100j) && this.f5101k == uVar.f5101k && this.f5102l == uVar.f5102l && this.f5103m == uVar.f5103m && this.f5104n == uVar.f5104n && this.f5105o == uVar.f5105o && this.f5106p == uVar.f5106p && this.f5107q == uVar.f5107q && this.f5108r == uVar.f5108r && this.f5109s == uVar.f5109s && this.f5110t == uVar.f5110t && this.f5111u == uVar.f5111u && this.f5112v == uVar.f5112v && this.f5113w == uVar.f5113w) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f5110t;
    }

    public final long g() {
        return this.f5111u;
    }

    public final int h() {
        return this.f5112v;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f5091a.hashCode() * 31) + this.f5092b.hashCode()) * 31) + this.f5093c.hashCode()) * 31) + this.f5094d.hashCode()) * 31) + this.f5095e.hashCode()) * 31) + this.f5096f.hashCode()) * 31) + Long.hashCode(this.f5097g)) * 31) + Long.hashCode(this.f5098h)) * 31) + Long.hashCode(this.f5099i)) * 31) + this.f5100j.hashCode()) * 31) + Integer.hashCode(this.f5101k)) * 31) + this.f5102l.hashCode()) * 31) + Long.hashCode(this.f5103m)) * 31) + Long.hashCode(this.f5104n)) * 31) + Long.hashCode(this.f5105o)) * 31) + Long.hashCode(this.f5106p)) * 31;
        boolean z10 = this.f5107q;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.f5108r.hashCode()) * 31) + Integer.hashCode(this.f5109s)) * 31) + Integer.hashCode(this.f5110t)) * 31) + Long.hashCode(this.f5111u)) * 31) + Integer.hashCode(this.f5112v)) * 31) + Integer.hashCode(this.f5113w);
    }

    public final int i() {
        return this.f5109s;
    }

    public final int j() {
        return this.f5113w;
    }

    public final boolean k() {
        return !C6496s.c(C1838e.f18716j, this.f5100j);
    }

    public final boolean l() {
        if (this.f5092b != D.ENQUEUED || this.f5101k <= 0) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        if (this.f5098h != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "{WorkSpec: " + this.f5091a + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ u(java.lang.String r35, androidx.work.D r36, java.lang.String r37, java.lang.String r38, androidx.work.C1840g r39, androidx.work.C1840g r40, long r41, long r43, long r45, androidx.work.C1838e r47, int r48, androidx.work.C1834a r49, long r50, long r52, long r54, long r56, boolean r58, androidx.work.x r59, int r60, int r61, long r62, int r64, int r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
            r34 = this;
            r0 = r66
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.D r1 = androidx.work.D.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r36
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            java.lang.Class<androidx.work.OverwritingInputMerger> r1 = androidx.work.OverwritingInputMerger.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "OverwritingInputMerger::class.java.name"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            r6 = r1
            goto L_0x001f
        L_0x001d:
            r6 = r38
        L_0x001f:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x002c
            androidx.work.g r1 = androidx.work.C1840g.f18737c
            kotlin.jvm.internal.C6496s.g(r1, r2)
            r7 = r1
            goto L_0x002e
        L_0x002c:
            r7 = r39
        L_0x002e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0039
            androidx.work.g r1 = androidx.work.C1840g.f18737c
            kotlin.jvm.internal.C6496s.g(r1, r2)
            r8 = r1
            goto L_0x003b
        L_0x0039:
            r8 = r40
        L_0x003b:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0043
            r9 = r2
            goto L_0x0045
        L_0x0043:
            r9 = r41
        L_0x0045:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004b
            r11 = r2
            goto L_0x004d
        L_0x004b:
            r11 = r43
        L_0x004d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0053
            r13 = r2
            goto L_0x0055
        L_0x0053:
            r13 = r45
        L_0x0055:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005d
            androidx.work.e r1 = androidx.work.C1838e.f18716j
            r15 = r1
            goto L_0x005f
        L_0x005d:
            r15 = r47
        L_0x005f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x0067
            r16 = r5
            goto L_0x0069
        L_0x0067:
            r16 = r48
        L_0x0069:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0072
            androidx.work.a r1 = androidx.work.C1834a.EXPONENTIAL
            r17 = r1
            goto L_0x0074
        L_0x0072:
            r17 = r49
        L_0x0074:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x007b
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x007d
        L_0x007b:
            r18 = r50
        L_0x007d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r20 = -1
            if (r1 == 0) goto L_0x0086
            r22 = r20
            goto L_0x0088
        L_0x0086:
            r22 = r52
        L_0x0088:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x008f
            r24 = r2
            goto L_0x0091
        L_0x008f:
            r24 = r54
        L_0x0091:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            r26 = r20
            goto L_0x009c
        L_0x009a:
            r26 = r56
        L_0x009c:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a3
            r1 = r5
            goto L_0x00a5
        L_0x00a3:
            r1 = r58
        L_0x00a5:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00af
            androidx.work.x r2 = androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r28 = r2
            goto L_0x00b1
        L_0x00af:
            r28 = r59
        L_0x00b1:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b9
            r29 = r5
            goto L_0x00bb
        L_0x00b9:
            r29 = r60
        L_0x00bb:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00c3
            r30 = r5
            goto L_0x00c5
        L_0x00c3:
            r30 = r61
        L_0x00c5:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = r2
            goto L_0x00d4
        L_0x00d2:
            r31 = r62
        L_0x00d4:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00dc
            r33 = r5
            goto L_0x00de
        L_0x00dc:
            r33 = r64
        L_0x00de:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00e6
            r0 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x00e8
        L_0x00e6:
            r0 = r65
        L_0x00e8:
            r2 = r34
            r3 = r35
            r5 = r37
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r1
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r32 = r33
            r33 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29, r30, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.u.<init>(java.lang.String, androidx.work.D, java.lang.String, java.lang.String, androidx.work.g, androidx.work.g, long, long, long, androidx.work.e, int, androidx.work.a, long, long, long, long, boolean, androidx.work.x, int, int, long, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(String str, String str2) {
        this(str, (D) null, str2, (String) null, (C1840g) null, (C1840g) null, 0, 0, 0, (C1838e) null, 0, (C1834a) null, 0, 0, 0, 0, false, (x) null, 0, 0, 0, 0, 0, 8388602, (DefaultConstructorMarker) null);
        C6496s.h(str, "id");
        C6496s.h(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r38, P3.u r39) {
        /*
            r37 = this;
            r0 = r39
            r1 = r37
            r2 = r38
            java.lang.String r3 = "newId"
            r4 = r38
            kotlin.jvm.internal.C6496s.h(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.C6496s.h(r0, r3)
            java.lang.String r4 = r0.f5093c
            androidx.work.D r3 = r0.f5092b
            java.lang.String r5 = r0.f5094d
            androidx.work.g r7 = new androidx.work.g
            r6 = r7
            androidx.work.g r8 = r0.f5095e
            r7.<init>((androidx.work.C1840g) r8)
            androidx.work.g r8 = new androidx.work.g
            r7 = r8
            androidx.work.g r9 = r0.f5096f
            r8.<init>((androidx.work.C1840g) r9)
            long r8 = r0.f5097g
            long r10 = r0.f5098h
            long r12 = r0.f5099i
            androidx.work.e r15 = new androidx.work.e
            r14 = r15
            r35 = r1
            androidx.work.e r1 = r0.f5100j
            r15.<init>(r1)
            int r15 = r0.f5101k
            androidx.work.a r1 = r0.f5102l
            r16 = r1
            r36 = r2
            long r1 = r0.f5103m
            r17 = r1
            long r1 = r0.f5104n
            r19 = r1
            long r1 = r0.f5105o
            r21 = r1
            long r1 = r0.f5106p
            r23 = r1
            boolean r1 = r0.f5107q
            r25 = r1
            androidx.work.x r1 = r0.f5108r
            r26 = r1
            int r1 = r0.f5109s
            r27 = r1
            long r1 = r0.f5111u
            r29 = r1
            int r1 = r0.f5112v
            r31 = r1
            int r0 = r0.f5113w
            r32 = r0
            r33 = 524288(0x80000, float:7.34684E-40)
            r34 = 0
            r28 = 0
            r1 = r35
            r2 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.u.<init>(java.lang.String, P3.u):void");
    }
}
