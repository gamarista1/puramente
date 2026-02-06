package Hh;

import Gh.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final M f63498a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f63499b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63500c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63501d;

    /* renamed from: e  reason: collision with root package name */
    private final long f63502e;

    /* renamed from: f  reason: collision with root package name */
    private final long f63503f;

    /* renamed from: g  reason: collision with root package name */
    private final int f63504g;

    /* renamed from: h  reason: collision with root package name */
    private final long f63505h;

    /* renamed from: i  reason: collision with root package name */
    private final int f63506i;

    /* renamed from: j  reason: collision with root package name */
    private final int f63507j;

    /* renamed from: k  reason: collision with root package name */
    private final Long f63508k;

    /* renamed from: l  reason: collision with root package name */
    private final Long f63509l;

    /* renamed from: m  reason: collision with root package name */
    private final Long f63510m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f63511n;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f63512o;

    /* renamed from: p  reason: collision with root package name */
    private final Integer f63513p;

    /* renamed from: q  reason: collision with root package name */
    private final List f63514q;

    public i(M m10, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        C6496s.h(m10, "canonicalPath");
        C6496s.h(str, "comment");
        this.f63498a = m10;
        this.f63499b = z10;
        this.f63500c = str;
        this.f63501d = j10;
        this.f63502e = j11;
        this.f63503f = j12;
        this.f63504g = i10;
        this.f63505h = j13;
        this.f63506i = i11;
        this.f63507j = i12;
        this.f63508k = l10;
        this.f63509l = l11;
        this.f63510m = l12;
        this.f63511n = num;
        this.f63512o = num2;
        this.f63513p = num3;
        this.f63514q = new ArrayList();
    }

    public final i a(Integer num, Integer num2, Integer num3) {
        return new i(this.f63498a, this.f63499b, this.f63500c, this.f63501d, this.f63502e, this.f63503f, this.f63504g, this.f63505h, this.f63506i, this.f63507j, this.f63508k, this.f63509l, this.f63510m, num, num2, num3);
    }

    public final M b() {
        return this.f63498a;
    }

    public final List c() {
        return this.f63514q;
    }

    public final long d() {
        return this.f63502e;
    }

    public final int e() {
        return this.f63504g;
    }

    public final Long f() {
        Long l10 = this.f63510m;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f63513p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f63509l;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f63512o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f63508k;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f63511n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f63507j;
        if (i10 != -1) {
            return j.c(this.f63506i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f63505h;
    }

    public final long j() {
        return this.f63503f;
    }

    public final boolean k() {
        return this.f63499b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ i(Gh.M r20, boolean r21, java.lang.String r22, long r23, long r25, long r27, int r29, long r30, int r32, int r33, java.lang.Long r34, java.lang.Long r35, java.lang.Long r36, java.lang.Integer r37, java.lang.Integer r38, java.lang.Integer r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r19 = this;
            r0 = r40
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = ""
            goto L_0x0013
        L_0x0011:
            r2 = r22
        L_0x0013:
            r3 = r0 & 8
            r4 = -1
            if (r3 == 0) goto L_0x001b
            r6 = r4
            goto L_0x001d
        L_0x001b:
            r6 = r23
        L_0x001d:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0023
            r8 = r4
            goto L_0x0025
        L_0x0023:
            r8 = r25
        L_0x0025:
            r3 = r0 & 32
            if (r3 == 0) goto L_0x002b
            r10 = r4
            goto L_0x002d
        L_0x002b:
            r10 = r27
        L_0x002d:
            r3 = r0 & 64
            r12 = -1
            if (r3 == 0) goto L_0x0034
            r3 = r12
            goto L_0x0036
        L_0x0034:
            r3 = r29
        L_0x0036:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = r30
        L_0x003d:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0043
            r13 = r12
            goto L_0x0045
        L_0x0043:
            r13 = r32
        L_0x0045:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r12 = r33
        L_0x004c:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0052
            r14 = 0
            goto L_0x0054
        L_0x0052:
            r14 = r34
        L_0x0054:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x005a
            r15 = 0
            goto L_0x005c
        L_0x005a:
            r15 = r35
        L_0x005c:
            r41 = r15
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0064
            r15 = 0
            goto L_0x0066
        L_0x0064:
            r15 = r36
        L_0x0066:
            r16 = r15
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x006e
            r15 = 0
            goto L_0x0070
        L_0x006e:
            r15 = r37
        L_0x0070:
            r17 = r15
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x0078
            r15 = 0
            goto L_0x007a
        L_0x0078:
            r15 = r38
        L_0x007a:
            r18 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r39
        L_0x0085:
            r21 = r19
            r22 = r20
            r23 = r1
            r24 = r2
            r25 = r6
            r27 = r8
            r29 = r10
            r31 = r3
            r32 = r4
            r34 = r13
            r35 = r12
            r36 = r14
            r37 = r41
            r38 = r16
            r39 = r17
            r40 = r15
            r41 = r0
            r21.<init>(r22, r23, r24, r25, r27, r29, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hh.i.<init>(Gh.M, boolean, java.lang.String, long, long, long, int, long, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
