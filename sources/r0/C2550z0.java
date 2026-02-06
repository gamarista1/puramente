package r0;

import e1.C1943b;
import kotlin.jvm.internal.C6496s;
import lf.C6508G;
import s0.C2580b;
import s0.C2581c;
import s0.C2585g;
import s0.C2588j;
import s0.x;

/* renamed from: r0.z0  reason: case insensitive filesystem */
public abstract class C2550z0 {
    public static final long a(float f10, float f11, float f12, float f13, C2581c cVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f14;
        float f15;
        float f16;
        C2581c cVar2 = cVar;
        float f17 = 1.0f;
        float f18 = 0.0f;
        if (cVar.g()) {
            if (f13 < 0.0f) {
                f14 = 0.0f;
            } else {
                f14 = f13;
            }
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i20 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            if (f10 < 0.0f) {
                f15 = 0.0f;
            } else {
                f15 = f10;
            }
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i21 = i20 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            if (f11 < 0.0f) {
                f16 = 0.0f;
            } else {
                f16 = f11;
            }
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i22 = i21 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            if (f12 >= 0.0f) {
                f18 = f12;
            }
            if (f18 <= 1.0f) {
                f17 = f18;
            }
            return C2544x0.l(C6508G.b(C6508G.b((long) (i22 | ((int) ((f17 * 255.0f) + 0.5f)))) << 32));
        }
        if (cVar.a() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            K1.a("Color only works with ColorSpaces with 3 components");
        }
        int b10 = cVar.b();
        if (b10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            K1.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float d10 = cVar2.d(0);
        float c10 = cVar2.c(0);
        if (f10 >= d10) {
            d10 = f10;
        }
        if (d10 <= c10) {
            c10 = d10;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(c10);
        int i23 = floatToRawIntBits >>> 31;
        int i24 = (floatToRawIntBits >>> 23) & 255;
        int i25 = floatToRawIntBits & 8388607;
        int i26 = 512;
        int i27 = 31;
        if (i24 == 255) {
            if (i25 != 0) {
                i11 = 512;
            } else {
                i11 = 0;
            }
            i10 = 31;
            i12 = i11 | (i23 << 15) | (i10 << 10);
        } else {
            i10 = i24 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else if (i10 <= 0) {
                if (i10 >= -10) {
                    int i28 = (i25 | 8388608) >> (1 - i10);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i19 = i28 >> 13;
                } else {
                    i19 = 0;
                }
                i10 = 0;
            } else {
                int i29 = i25 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i12 = (((i10 << 10) | i29) + 1) | (i23 << 15);
                } else {
                    i11 = i29;
                }
            }
            i12 = i11 | (i23 << 15) | (i10 << 10);
        }
        short s10 = (short) i12;
        float d11 = cVar2.d(1);
        float c11 = cVar2.c(1);
        if (f11 >= d11) {
            d11 = f11;
        }
        if (d11 <= c11) {
            c11 = d11;
        }
        int floatToRawIntBits2 = Float.floatToRawIntBits(c11);
        int i30 = floatToRawIntBits2 >>> 31;
        int i31 = (floatToRawIntBits2 >>> 23) & 255;
        int i32 = floatToRawIntBits2 & 8388607;
        if (i31 == 255) {
            if (i32 != 0) {
                i14 = 512;
            } else {
                i14 = 0;
            }
            i13 = 31;
            i15 = i14 | (i30 << 15) | (i13 << 10);
        } else {
            i13 = i31 - 112;
            if (i13 >= 31) {
                i13 = 49;
                i14 = 0;
            } else if (i13 <= 0) {
                if (i13 >= -10) {
                    int i33 = (i32 | 8388608) >> (1 - i13);
                    if ((i33 & 4096) != 0) {
                        i33 += 8192;
                    }
                    i18 = i33 >> 13;
                } else {
                    i18 = 0;
                }
                i13 = 0;
            } else {
                int i34 = i32 >> 13;
                if ((floatToRawIntBits2 & 4096) != 0) {
                    i15 = (((i13 << 10) | i34) + 1) | (i30 << 15);
                } else {
                    i14 = i34;
                }
            }
            i15 = i14 | (i30 << 15) | (i13 << 10);
        }
        short s11 = (short) i15;
        float d12 = cVar2.d(2);
        float c12 = cVar2.c(2);
        if (f12 >= d12) {
            d12 = f12;
        }
        if (d12 <= c12) {
            c12 = d12;
        }
        int floatToRawIntBits3 = Float.floatToRawIntBits(c12);
        int i35 = floatToRawIntBits3 >>> 31;
        int i36 = (floatToRawIntBits3 >>> 23) & 255;
        int i37 = 8388607 & floatToRawIntBits3;
        if (i36 == 255) {
            if (i37 == 0) {
                i26 = 0;
            }
            i16 = i26;
            i17 = (i35 << 15) | (i27 << 10) | i16;
        } else {
            int i38 = i36 - 112;
            if (i38 >= 31) {
                i27 = 49;
            } else {
                if (i38 > 0) {
                    int i39 = i37 >> 13;
                    if ((floatToRawIntBits3 & 4096) != 0) {
                        i17 = (((i38 << 10) | i39) + 1) | (i35 << 15);
                    } else {
                        i16 = i39;
                        i27 = i38;
                    }
                } else if (i38 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i38);
                    if ((i40 & 4096) != 0) {
                        i40 += 8192;
                    }
                    i16 = i40 >> 13;
                    i27 = 0;
                } else {
                    i27 = 0;
                }
                i17 = (i35 << 15) | (i27 << 10) | i16;
            }
            i16 = 0;
            i17 = (i35 << 15) | (i27 << 10) | i16;
        }
        short s12 = (short) i17;
        if (f13 >= 0.0f) {
            f18 = f13;
        }
        if (f18 <= 1.0f) {
            f17 = f18;
        }
        return C2544x0.l(C6508G.b((((long) b10) & 63) | ((((long) ((int) ((f17 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s12)) << 16)));
    }

    public static final long b(int i10) {
        return C2544x0.l(C6508G.b(C6508G.b((long) i10) << 32));
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final long d(long j10) {
        return C2544x0.l(C6508G.b(j10 << 32));
    }

    public static /* synthetic */ long e(float f10, float f11, float f12, float f13, C2581c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            cVar = C2585g.f25794a.w();
        }
        return a(f10, f11, f12, f13, cVar);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    public static final long g(float f10, float f11, float f12, float f13, C2581c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f14 = f13;
        if (cVar.g()) {
            return C2544x0.l(C6508G.b(C6508G.b((long) ((((((int) ((f14 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32));
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i18 = floatToRawIntBits >>> 31;
        int i19 = (floatToRawIntBits >>> 23) & 255;
        int i20 = floatToRawIntBits & 8388607;
        int i21 = 512;
        int i22 = 0;
        if (i19 == 255) {
            if (i20 != 0) {
                i11 = 512;
            } else {
                i11 = 0;
            }
            i10 = 31;
            i12 = i11 | (i18 << 15) | (i10 << 10);
        } else {
            i10 = i19 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else if (i10 > 0) {
                int i23 = i20 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i12 = (((i10 << 10) | i23) + 1) | (i18 << 15);
                } else {
                    i11 = i23;
                }
            } else if (i10 >= -10) {
                int i24 = (i20 | 8388608) >> (1 - i10);
                if ((i24 & 4096) != 0) {
                    i24 += 8192;
                }
                i11 = i24 >> 13;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
            i12 = i11 | (i18 << 15) | (i10 << 10);
        }
        short s10 = (short) i12;
        int floatToRawIntBits2 = Float.floatToRawIntBits(f11);
        int i25 = floatToRawIntBits2 >>> 31;
        int i26 = (floatToRawIntBits2 >>> 23) & 255;
        int i27 = floatToRawIntBits2 & 8388607;
        if (i26 == 255) {
            if (i27 != 0) {
                i14 = 512;
            } else {
                i14 = 0;
            }
            i13 = 31;
            i15 = i14 | (i25 << 15) | (i13 << 10);
        } else {
            i13 = i26 - 112;
            if (i13 >= 31) {
                i14 = 0;
                i13 = 49;
            } else if (i13 > 0) {
                int i28 = i27 >> 13;
                if ((floatToRawIntBits2 & 4096) != 0) {
                    i15 = (((i13 << 10) | i28) + 1) | (i25 << 15);
                } else {
                    i14 = i28;
                }
            } else if (i13 >= -10) {
                int i29 = (i27 | 8388608) >> (1 - i13);
                if ((i29 & 4096) != 0) {
                    i29 += 8192;
                }
                i14 = i29 >> 13;
                i13 = 0;
            } else {
                i14 = 0;
                i13 = 0;
            }
            i15 = i14 | (i25 << 15) | (i13 << 10);
        }
        short s11 = (short) i15;
        int floatToRawIntBits3 = Float.floatToRawIntBits(f12);
        int i30 = floatToRawIntBits3 >>> 31;
        int i31 = (floatToRawIntBits3 >>> 23) & 255;
        int i32 = 8388607 & floatToRawIntBits3;
        if (i31 == 255) {
            if (i32 == 0) {
                i21 = 0;
            }
            i22 = i21;
            i16 = 31;
            i17 = (i30 << 15) | (i16 << 10) | i22;
        } else {
            i16 = i31 - 112;
            if (i16 >= 31) {
                i16 = 49;
            } else if (i16 > 0) {
                i22 = i32 >> 13;
                if ((floatToRawIntBits3 & 4096) != 0) {
                    i17 = (((i16 << 10) | i22) + 1) | (i30 << 15);
                }
            } else if (i16 >= -10) {
                int i33 = (i32 | 8388608) >> (1 - i16);
                if ((i33 & 4096) != 0) {
                    i33 += 8192;
                }
                i16 = 0;
                i22 = i33 >> 13;
            } else {
                i16 = 0;
            }
            i17 = (i30 << 15) | (i16 << 10) | i22;
        }
        return C2544x0.l(C6508G.b(((((long) s11) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i17)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63)));
    }

    public static final long h(long j10, long j11) {
        float f10;
        float f11;
        long m10 = C2544x0.m(j10, C2544x0.t(j11));
        float r10 = C2544x0.r(j11);
        float r11 = C2544x0.r(m10);
        float f12 = 1.0f - r11;
        float f13 = (r10 * f12) + r11;
        float v10 = C2544x0.v(m10);
        float v11 = C2544x0.v(j11);
        float f14 = 0.0f;
        int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            f10 = 0.0f;
        } else {
            f10 = ((v10 * r11) + ((v11 * r10) * f12)) / f13;
        }
        float u10 = C2544x0.u(m10);
        float u11 = C2544x0.u(j11);
        if (i10 == 0) {
            f11 = 0.0f;
        } else {
            f11 = ((u10 * r11) + ((u11 * r10) * f12)) / f13;
        }
        float s10 = C2544x0.s(m10);
        float s11 = C2544x0.s(j11);
        if (i10 != 0) {
            f14 = ((s10 * r11) + ((s11 * r10) * f12)) / f13;
        }
        return g(f10, f11, f14, f13, C2544x0.t(j11));
    }

    public static final long i(long j10, long j11, float f10) {
        C2581c t10 = C2585g.f25794a.t();
        long m10 = C2544x0.m(j10, t10);
        long m11 = C2544x0.m(j11, t10);
        float r10 = C2544x0.r(m10);
        float v10 = C2544x0.v(m10);
        float u10 = C2544x0.u(m10);
        float s10 = C2544x0.s(m10);
        float r11 = C2544x0.r(m11);
        float v11 = C2544x0.v(m11);
        float u11 = C2544x0.u(m11);
        float s11 = C2544x0.s(m11);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C2544x0.m(g(C1943b.b(v10, v11, f10), C1943b.b(u10, u11, f10), C1943b.b(s10, s11, f10), C1943b.b(r10, r11, f10), t10), C2544x0.t(j11));
    }

    public static final float j(long j10) {
        C2581c t10 = C2544x0.t(j10);
        if (!C2580b.e(t10.e(), C2580b.f25785a.b())) {
            K1.a("The specified color must be encoded in an RGB color space. The supplied color space is " + C2580b.h(t10.e()));
        }
        C6496s.f(t10, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        C2588j E10 = ((x) t10).E();
        float a10 = (float) ((E10.a((double) C2544x0.v(j10)) * 0.2126d) + (E10.a((double) C2544x0.u(j10)) * 0.7152d) + (E10.a((double) C2544x0.s(j10)) * 0.0722d));
        if (a10 < 0.0f) {
            a10 = 0.0f;
        }
        if (a10 > 1.0f) {
            return 1.0f;
        }
        return a10;
    }

    public static final int k(long j10) {
        return (int) C6508G.b(C2544x0.m(j10, C2585g.f25794a.w()) >>> 32);
    }
}
