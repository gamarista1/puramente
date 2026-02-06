package C;

import Ef.m;
import H0.E;
import H0.G;
import H0.H;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public abstract class U {
    public static final G a(T t10, int i10, int i11, int i12, int i13, int i14, H h10, List list, H0.U[] uArr, int i15, int i16, int[] iArr, int i17) {
        int[] iArr2;
        int i18;
        int i19;
        int i20;
        int i21;
        Integer num;
        int i22;
        int i23;
        String str;
        String str2;
        String str3;
        long j10;
        String str4;
        long j11;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        float f10;
        long j12;
        float f11;
        int i24;
        long j13;
        int i25;
        String str13;
        int i26;
        String str14;
        float f12;
        int i27;
        int i28;
        float f13;
        int i29;
        String str15;
        int i30;
        String str16;
        long j14;
        float f14;
        int i31;
        float f15;
        String str17;
        int i32;
        char c10;
        long j15;
        int i33;
        int i34;
        float f16;
        int i35;
        int[] iArr3;
        int i36;
        int i37;
        int i38;
        int[] iArr4;
        int i39;
        T t11 = t10;
        int i40 = i10;
        int i41 = i12;
        int i42 = i13;
        int i43 = i14;
        List list2 = list;
        int i44 = i16;
        int i45 = i44 - i15;
        int i46 = 0;
        int i47 = i15;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int[] iArr5 = new int[i45];
        long j16 = (long) i43;
        float f17 = 0.0f;
        int i52 = 0;
        while (true) {
            int i53 = a.e.API_PRIORITY_OTHER;
            if (i47 >= i44) {
                break;
            }
            int i54 = i52;
            E e10 = (E) list2.get(i47);
            V c11 = S.c(e10);
            float e11 = S.e(c11);
            i51 = (i51 != 0 || S.f(c11)) ? 1 : i46;
            if (e11 > 0.0f) {
                i50++;
                i33 = i47;
                j15 = j16;
                iArr3 = iArr5;
                i34 = i45;
                f16 = f17 + e11;
                i35 = i46;
            } else {
                if (!(i42 == Integer.MAX_VALUE || c11 == null)) {
                    c11.c();
                }
                int i55 = i41 - i49;
                H0.U u10 = uArr[i47];
                if (u10 == null) {
                    if (i41 != Integer.MAX_VALUE) {
                        i53 = m.d(i55, i46);
                    }
                    i36 = i55;
                    i37 = i49;
                    i38 = i50;
                    i33 = i47;
                    int i56 = i53;
                    int i57 = i46;
                    iArr4 = iArr5;
                    j15 = j16;
                    i39 = i54;
                    i34 = i45;
                    f16 = f17;
                    u10 = e10.v0(T.o(t10, 0, 0, i56, i13, false, 16, (Object) null));
                } else {
                    i36 = i55;
                    i37 = i49;
                    i38 = i50;
                    i33 = i47;
                    j15 = j16;
                    iArr4 = iArr5;
                    i39 = i54;
                    i34 = i45;
                    f16 = f17;
                }
                H0.U u11 = u10;
                int d10 = t11.d(u11);
                int i58 = t11.i(u11);
                iArr3 = iArr4;
                iArr3[i33 - i15] = d10;
                i35 = 0;
                int min = Math.min(i43, m.d(i36 - d10, 0));
                i49 = d10 + min + i37;
                int max = Math.max(i39, i58);
                uArr[i33] = u11;
                i54 = max;
                i48 = min;
                i50 = i38;
            }
            i47 = i33 + 1;
            iArr5 = iArr3;
            i46 = i35;
            f17 = f16;
            i45 = i34;
            i52 = i54;
            j16 = j15;
        }
        int i59 = i52;
        long j17 = j16;
        int[] iArr6 = iArr5;
        int i60 = i45;
        float f18 = f17;
        int i61 = i46;
        int i62 = i49;
        int i63 = i50;
        if (i63 == 0) {
            i21 = i62 - i48;
            iArr2 = iArr6;
            i20 = i61;
            i18 = i40;
            i19 = i59;
            num = null;
        } else {
            int i64 = i41 != Integer.MAX_VALUE ? i41 : i40;
            iArr2 = iArr6;
            long j18 = j17;
            long j19 = ((long) (i63 - 1)) * j18;
            long e12 = m.e(((long) (i64 - i62)) - j19, 0);
            float f19 = ((float) e12) / f18;
            int i65 = i15;
            long j20 = e12;
            float f20 = f18;
            while (true) {
                str = "weightedSize ";
                str2 = "weightUnitSpace ";
                str3 = "totalWeight ";
                j10 = e12;
                str4 = "remainingToTarget ";
                j11 = j19;
                str5 = "arrangementSpacingPx ";
                str6 = "targetSpace ";
                str7 = "arrangementSpacingTotal ";
                if (i65 >= i44) {
                    break;
                }
                float e13 = S.e(S.c((E) list2.get(i65)));
                float f21 = f19 * e13;
                try {
                    j20 -= (long) Math.round(f21);
                    i65++;
                    list2 = list;
                    i44 = i16;
                    e12 = j10;
                    j19 = j11;
                } catch (IllegalArgumentException e14) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i41 + "mainAxisMin " + i10 + str6 + i64 + str5 + j18 + "weightChildrenCount " + i63 + "fixedSpace " + i62 + str7 + j11 + str4 + j10 + str3 + f20 + str2 + f19 + "itemWeight " + e13 + str + f21).initCause(e14);
                }
            }
            i18 = i10;
            float f22 = f20;
            String str18 = str;
            String str19 = str2;
            String str20 = str3;
            long j21 = j10;
            String str21 = str4;
            long j22 = j11;
            String str22 = str7;
            long j23 = j18;
            int i66 = i59;
            int i67 = 0;
            int i68 = i15;
            int i69 = i16;
            while (i68 < i69) {
                if (uArr[i68] == null) {
                    E e15 = (E) list.get(i68);
                    V c12 = S.c(e15);
                    E e16 = e15;
                    float e17 = S.e(c12);
                    String str23 = str5;
                    int i70 = i64;
                    if (!(i13 == Integer.MAX_VALUE || c12 == null)) {
                        c12.c();
                    }
                    if (e17 > 0.0f) {
                        int b10 = Af.a.b(j20);
                        String str24 = str6;
                        j20 -= (long) b10;
                        float f23 = f19 * e17;
                        int i71 = b10;
                        int max2 = Math.max(0, Math.round(f23) + b10);
                        try {
                            if (S.b(c12)) {
                                c10 = 65535;
                                if (max2 != Integer.MAX_VALUE) {
                                    i32 = max2;
                                    j14 = j22;
                                    str16 = str23;
                                    i30 = i71;
                                    i31 = max2;
                                    str15 = str24;
                                    int i72 = i32;
                                    f13 = f23;
                                    i29 = i70;
                                    i28 = i63;
                                    i27 = i62;
                                    f12 = e17;
                                    f14 = f19;
                                    str17 = str18;
                                    E e18 = e16;
                                    char c13 = c10;
                                    f15 = f22;
                                    j13 = j23;
                                    H0.U v02 = e18.v0(t10.e(i72, 0, i31, i13, true));
                                    int d11 = t11.d(v02);
                                    int i73 = t11.i(v02);
                                    iArr2[i68 - i15] = d11;
                                    i67 += d11;
                                    int max3 = Math.max(i66, i73);
                                    uArr[i68] = v02;
                                    i66 = max3;
                                    str12 = str17;
                                    f11 = f15;
                                    f10 = f14;
                                    j12 = j21;
                                    str11 = str19;
                                    str10 = str20;
                                    str9 = str21;
                                    str8 = str22;
                                    j22 = j14;
                                    str13 = str16;
                                    str14 = str15;
                                    i26 = i29;
                                    i25 = i28;
                                    i24 = i27;
                                }
                            } else {
                                c10 = 65535;
                            }
                            i32 = 0;
                            j14 = j22;
                            str16 = str23;
                            i30 = i71;
                            i31 = max2;
                            str15 = str24;
                            int i722 = i32;
                            f13 = f23;
                            i29 = i70;
                            i28 = i63;
                            i27 = i62;
                            f12 = e17;
                            f14 = f19;
                            str17 = str18;
                            E e182 = e16;
                            char c132 = c10;
                            f15 = f22;
                            j13 = j23;
                            try {
                                H0.U v022 = e182.v0(t10.e(i722, 0, i31, i13, true));
                                int d112 = t11.d(v022);
                                int i732 = t11.i(v022);
                                iArr2[i68 - i15] = d112;
                                i67 += d112;
                                int max32 = Math.max(i66, i732);
                                uArr[i68] = v022;
                                i66 = max32;
                                str12 = str17;
                                f11 = f15;
                                f10 = f14;
                                j12 = j21;
                                str11 = str19;
                                str10 = str20;
                                str9 = str21;
                                str8 = str22;
                                j22 = j14;
                                str13 = str16;
                                str14 = str15;
                                i26 = i29;
                                i25 = i28;
                                i24 = i27;
                            } catch (IllegalArgumentException e19) {
                                e = e19;
                                throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i41 + "mainAxisMin " + i18 + str15 + i29 + str16 + j13 + "weightChildrenCount " + i28 + "fixedSpace " + i27 + str22 + j14 + str21 + j21 + str20 + f15 + str19 + f14 + "weight " + f12 + str17 + f13 + "crossAxisDesiredSize " + null + "remainderUnit " + i30 + "childMainAxisSize " + i31).initCause(e);
                            }
                        } catch (IllegalArgumentException e20) {
                            e = e20;
                            f13 = f23;
                            i28 = i63;
                            i27 = i62;
                            f12 = e17;
                            str17 = str18;
                            j14 = j22;
                            i29 = i70;
                            str16 = str23;
                            str15 = str24;
                            i30 = i71;
                            i31 = max2;
                            f14 = f19;
                            f15 = f22;
                            j13 = j23;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i41 + "mainAxisMin " + i18 + str15 + i29 + str16 + j13 + "weightChildrenCount " + i28 + "fixedSpace " + i27 + str22 + j14 + str21 + j21 + str20 + f15 + str19 + f14 + "weight " + f12 + str17 + f13 + "crossAxisDesiredSize " + null + "remainderUnit " + i30 + "childMainAxisSize " + i31).initCause(e);
                        }
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                } else {
                    str13 = str5;
                    i24 = i62;
                    f10 = f19;
                    str12 = str18;
                    f11 = f22;
                    j13 = j23;
                    j12 = j21;
                    str11 = str19;
                    str10 = str20;
                    str9 = str21;
                    str8 = str22;
                    i26 = i64;
                    i25 = i63;
                    int i74 = i67;
                    str14 = str6;
                    int i75 = i66;
                }
                i68++;
                str6 = str14;
                i64 = i26;
                str5 = str13;
                i63 = i25;
                i62 = i24;
                j21 = j12;
                f19 = f10;
                str19 = str11;
                str20 = str10;
                str21 = str9;
                str22 = str8;
                i69 = i16;
                j23 = j13;
                f22 = f11;
                str18 = str12;
            }
            int i76 = i62;
            num = null;
            i19 = i66;
            i20 = m.l((int) (((long) i67) + j22), 0, i41 - i76);
            i21 = i76;
        }
        if (i51 != 0) {
            int i77 = i16;
            int i78 = 0;
            int i79 = 0;
            for (int i80 = i15; i80 < i77; i80++) {
                H0.U u12 = uArr[i80];
                C6496s.e(u12);
                C1095m a10 = S.a(S.d(u12));
                Integer b11 = a10 != null ? a10.b(u12) : num;
                if (b11 != null) {
                    int intValue = b11.intValue();
                    int i81 = t11.i(u12);
                    i78 = Math.max(i78, intValue != Integer.MIN_VALUE ? b11.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = i81;
                    }
                    i79 = Math.max(i79, i81 - intValue);
                }
            }
            i23 = i79;
            i22 = i78;
        } else {
            int i82 = i16;
            i23 = 0;
            i22 = 0;
        }
        int max4 = Math.max(m.d(i21 + i20, 0), i18);
        int max5 = Math.max(i19, Math.max(i11, i23 + i22));
        int i83 = i60;
        int[] iArr7 = new int[i83];
        for (int i84 = 0; i84 < i83; i84++) {
            iArr7[i84] = 0;
        }
        t11.c(max4, iArr2, iArr7, h10);
        return t10.f(uArr, h10, i22, iArr7, max4, max5, iArr, i17, i15, i16);
    }

    public static /* synthetic */ G b(T t10, int i10, int i11, int i12, int i13, int i14, H h10, List list, H0.U[] uArr, int i15, int i16, int[] iArr, int i17, int i18, Object obj) {
        int[] iArr2;
        int i19;
        int i20 = i18;
        if ((i20 & 1024) != 0) {
            iArr2 = null;
        } else {
            iArr2 = iArr;
        }
        if ((i20 & 2048) != 0) {
            i19 = 0;
        } else {
            i19 = i17;
        }
        return a(t10, i10, i11, i12, i13, i14, h10, list, uArr, i15, i16, iArr2, i19);
    }
}
