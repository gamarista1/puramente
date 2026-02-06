package lh;

import kotlin.jvm.internal.C6496s;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71977a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f71978b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f71979c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f71980d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f71981e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f71982f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71983g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f71984h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f71985i;

    /* renamed from: j  reason: collision with root package name */
    private final String f71986j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f71987k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f71988l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f71989m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f71990n;

    /* renamed from: o  reason: collision with root package name */
    private C6537a f71991o;

    public g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, s sVar, boolean z20, boolean z21, C6537a aVar) {
        C6537a aVar2 = aVar;
        C6496s.h(str, "prettyPrintIndent");
        C6496s.h(str2, "classDiscriminator");
        C6496s.h(aVar2, "classDiscriminatorMode");
        this.f71977a = z10;
        this.f71978b = z11;
        this.f71979c = z12;
        this.f71980d = z13;
        this.f71981e = z14;
        this.f71982f = z15;
        this.f71983g = str;
        this.f71984h = z16;
        this.f71985i = z17;
        this.f71986j = str2;
        this.f71987k = z18;
        this.f71988l = z19;
        this.f71989m = z20;
        this.f71990n = z21;
        this.f71991o = aVar2;
    }

    public final boolean a() {
        return this.f71987k;
    }

    public final boolean b() {
        return this.f71980d;
    }

    public final boolean c() {
        return this.f71990n;
    }

    public final String d() {
        return this.f71986j;
    }

    public final C6537a e() {
        return this.f71991o;
    }

    public final boolean f() {
        return this.f71984h;
    }

    public final boolean g() {
        return this.f71989m;
    }

    public final boolean h() {
        return this.f71977a;
    }

    public final boolean i() {
        return this.f71982f;
    }

    public final boolean j() {
        return this.f71978b;
    }

    public final s k() {
        return null;
    }

    public final boolean l() {
        return this.f71981e;
    }

    public final String m() {
        return this.f71983g;
    }

    public final boolean n() {
        return this.f71988l;
    }

    public final boolean o() {
        return this.f71985i;
    }

    public final boolean p() {
        return this.f71979c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f71977a + ", ignoreUnknownKeys=" + this.f71978b + ", isLenient=" + this.f71979c + ", allowStructuredMapKeys=" + this.f71980d + ", prettyPrint=" + this.f71981e + ", explicitNulls=" + this.f71982f + ", prettyPrintIndent='" + this.f71983g + "', coerceInputValues=" + this.f71984h + ", useArrayPolymorphism=" + this.f71985i + ", classDiscriminator='" + this.f71986j + "', allowSpecialFloatingPointValues=" + this.f71987k + ", useAlternativeNames=" + this.f71988l + ", namingStrategy=" + null + ", decodeEnumsCaseInsensitive=" + this.f71989m + ", allowTrailingComma=" + this.f71990n + ", classDiscriminatorMode=" + this.f71991o + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ g(boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, java.lang.String r24, boolean r25, boolean r26, java.lang.String r27, boolean r28, boolean r29, lh.s r30, boolean r31, boolean r32, lh.C6537a r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r19
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r20
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r22
        L_0x002a:
            r7 = r0 & 32
            r8 = 1
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0033
        L_0x0031:
            r7 = r23
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            java.lang.String r9 = "    "
            goto L_0x003c
        L_0x003a:
            r9 = r24
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r25
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r26
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0053
            java.lang.String r12 = "type"
            goto L_0x0055
        L_0x0053:
            r12 = r27
        L_0x0055:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005b
            r13 = 0
            goto L_0x005d
        L_0x005b:
            r13 = r28
        L_0x005d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r8 = r29
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = 0
            goto L_0x006c
        L_0x006a:
            r14 = r30
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            r15 = 0
            goto L_0x0074
        L_0x0072:
            r15 = r31
        L_0x0074:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007a
            r2 = 0
            goto L_0x007c
        L_0x007a:
            r2 = r32
        L_0x007c:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0086
            lh.a r0 = lh.C6537a.POLYMORPHIC
            goto L_0x0088
        L_0x0086:
            r0 = r33
        L_0x0088:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r8
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.g.<init>(boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, lh.s, boolean, boolean, lh.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
