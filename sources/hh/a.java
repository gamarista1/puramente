package Hh;

import Gh.C5401b;
import Gh.C5404e;
import Gh.K;
import Gh.Q;
import Gh.a0;
import kotlin.jvm.internal.C6496s;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f63478a = a0.a("0123456789abcdef");

    public static final C5404e.a a(C5404e eVar, C5404e.a aVar) {
        C6496s.h(eVar, "<this>");
        C6496s.h(aVar, "unsafeCursor");
        C5404e.a g10 = C5401b.g(aVar);
        if (g10.f63286a == null) {
            g10.f63286a = eVar;
            g10.f63287b = true;
            return g10;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public static final byte[] b() {
        return f63478a;
    }

    public static final boolean c(Q q10, int i10, byte[] bArr, int i11, int i12) {
        C6496s.h(q10, "segment");
        C6496s.h(bArr, "bytes");
        int i13 = q10.f63243c;
        byte[] bArr2 = q10.f63241a;
        while (i11 < i12) {
            if (i10 == i13) {
                q10 = q10.f63246f;
                C6496s.e(q10);
                byte[] bArr3 = q10.f63241a;
                int i14 = q10.f63242b;
                bArr2 = bArr3;
                i10 = i14;
                i13 = q10.f63243c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C5404e eVar, long j10) {
        C6496s.h(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.I(j11) == 13) {
                String z02 = eVar.z0(j11);
                eVar.skip(2);
                return z02;
            }
        }
        String z03 = eVar.z0(j10);
        eVar.skip(1);
        return z03;
    }

    public static final int e(C5404e eVar, K k10, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        int i12;
        Q q10;
        int i13;
        C5404e eVar2 = eVar;
        C6496s.h(eVar2, "<this>");
        C6496s.h(k10, "options");
        Q q11 = eVar2.f63284a;
        if (q11 != null) {
            byte[] bArr = q11.f63241a;
            int i14 = q11.f63242b;
            int i15 = q11.f63243c;
            int[] n10 = k10.n();
            Q q12 = q11;
            int i16 = -1;
            int i17 = 0;
            loop0:
            while (true) {
                int i18 = i17 + 1;
                int i19 = n10[i17];
                int i20 = i17 + 2;
                int i21 = n10[i18];
                if (i21 != -1) {
                    i16 = i21;
                }
                if (q12 == null) {
                    break;
                }
                if (i19 < 0) {
                    int i22 = i20 + (i19 * -1);
                    while (true) {
                        int i23 = i14 + 1;
                        int i24 = i20 + 1;
                        if ((bArr[i14] & 255) != n10[i20]) {
                            return i16;
                        }
                        if (i24 == i22) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i23 == i15) {
                            C6496s.e(q12);
                            Q q13 = q12.f63246f;
                            C6496s.e(q13);
                            i13 = q13.f63242b;
                            byte[] bArr2 = q13.f63241a;
                            i12 = q13.f63243c;
                            if (q13 == q11) {
                                if (!z11) {
                                    break loop0;
                                }
                                bArr = bArr2;
                                q10 = null;
                            } else {
                                byte[] bArr3 = bArr2;
                                q10 = q13;
                                bArr = bArr3;
                            }
                        } else {
                            q10 = q12;
                            i12 = i15;
                            i13 = i23;
                        }
                        if (z11) {
                            i11 = n10[i24];
                            i10 = i13;
                            i15 = i12;
                            q12 = q10;
                            break;
                        }
                        i14 = i13;
                        i15 = i12;
                        q12 = q10;
                        i20 = i24;
                    }
                } else {
                    i10 = i14 + 1;
                    byte b10 = bArr[i14] & 255;
                    int i25 = i20 + i19;
                    while (i20 != i25) {
                        if (b10 == n10[i20]) {
                            i11 = n10[i20 + i19];
                            if (i10 == i15) {
                                q12 = q12.f63246f;
                                C6496s.e(q12);
                                i10 = q12.f63242b;
                                bArr = q12.f63241a;
                                i15 = q12.f63243c;
                                if (q12 == q11) {
                                    q12 = null;
                                }
                            }
                        } else {
                            i20++;
                        }
                    }
                    return i16;
                }
                if (i11 >= 0) {
                    return i11;
                }
                i17 = -i11;
                i14 = i10;
            }
            if (z10) {
                return -2;
            }
            return i16;
        } else if (z10) {
            return -2;
        } else {
            return -1;
        }
    }

    public static /* synthetic */ int f(C5404e eVar, K k10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(eVar, k10, z10);
    }
}
