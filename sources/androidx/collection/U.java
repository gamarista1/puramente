package androidx.collection;

import com.amazon.a.a.o.b.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.C2664a;

public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public long[] f12123a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f12124b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f12125c;

    /* renamed from: d  reason: collision with root package name */
    public int f12126d;

    /* renamed from: e  reason: collision with root package name */
    public int f12127e;

    public /* synthetic */ U(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12126d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f12123a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12124b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.C6496s.c(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0075
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            return r2
        L_0x0075:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.U.a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f12126d
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.f12123a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x0043:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0062
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f12124b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 == 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0043
        L_0x0062:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0075
            r10 = -1
        L_0x006c:
            if (r10 < 0) goto L_0x0073
            java.lang.Object[] r14 = r13.f12125c
            r14 = r14[r10]
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            return r14
        L_0x0075:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.U.b(java.lang.Object):java.lang.Object");
    }

    public final int c() {
        return this.f12126d;
    }

    public final int d() {
        return this.f12127e;
    }

    public final boolean e() {
        if (this.f12127e == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.U
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.U r1 = (androidx.collection.U) r1
            int r3 = r1.d()
            int r5 = r18.d()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f12124b
            java.lang.Object[] r5 = r0.f12125c
            long[] r6 = r0.f12123a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0078
            r8 = r4
        L_0x0027:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0073
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x0071
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x006d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L_0x0062
            java.lang.Object r14 = r1.b(r15)
            if (r14 != 0) goto L_0x0061
            boolean r14 = r1.a(r15)
            if (r14 != 0) goto L_0x006d
        L_0x0061:
            return r4
        L_0x0062:
            java.lang.Object r15 = r1.b(r15)
            boolean r14 = kotlin.jvm.internal.C6496s.c(r14, r15)
            if (r14 != 0) goto L_0x006d
            return r4
        L_0x006d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L_0x0041
        L_0x0071:
            if (r11 != r12) goto L_0x0078
        L_0x0073:
            if (r8 == r7) goto L_0x0078
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.U.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        if (this.f12127e != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        Object[] objArr = this.f12124b;
        Object[] objArr2 = this.f12125c;
        long[] jArr = this.f12123a;
        int length = jArr.length - 2;
        int i12 = 0;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j10 = jArr[i13];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j10) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = objArr[i17];
                            Object obj2 = objArr2[i17];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            if (obj2 != null) {
                                i11 = obj2.hashCode();
                            } else {
                                i11 = 0;
                            }
                            i14 += i11 ^ i10;
                        }
                        j10 >>= 8;
                    }
                    if (i15 != 8) {
                        return i14;
                    }
                }
                if (i13 == length) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
        }
        return i12;
    }

    public String toString() {
        if (e()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Object[] objArr = this.f12124b;
        Object[] objArr2 = this.f12125c;
        long[] jArr = this.f12123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(f.f37530b);
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i11++;
                            if (i11 < this.f12127e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "s.append('}').toString()");
        return sb3;
    }

    private U() {
        this.f12123a = V.f12128a;
        Object[] objArr = C2664a.f26375c;
        this.f12124b = objArr;
        this.f12125c = objArr;
    }
}
