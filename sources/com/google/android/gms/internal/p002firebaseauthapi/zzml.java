package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzml  reason: invalid package */
public final class zzml {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    /* JADX WARNING: type inference failed for: r44v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void zzb(long[] r44, long[] r45, long[] r46) {
        /*
            r0 = 0
            r1 = r45[r0]
            r3 = r46[r0]
            long r1 = r1 * r3
            r44[r0] = r1
            r1 = r45[r0]
            r3 = 1
            r4 = r46[r3]
            long r4 = r4 * r1
            r6 = r45[r3]
            r8 = r46[r0]
            long r6 = r6 * r8
            long r4 = r4 + r6
            r44[r3] = r4
            r4 = r45[r3]
            r6 = 2
            long r10 = r4 * r6
            r12 = r46[r3]
            long r10 = r10 * r12
            r0 = 2
            r14 = r46[r0]
            long r14 = r14 * r1
            long r10 = r10 + r14
            r14 = r45[r0]
            long r14 = r14 * r8
            long r10 = r10 + r14
            r44[r0] = r10
            r10 = r46[r0]
            long r14 = r4 * r10
            r16 = r45[r0]
            long r18 = r16 * r12
            long r14 = r14 + r18
            r0 = 3
            r18 = r46[r0]
            long r18 = r18 * r1
            long r14 = r14 + r18
            r18 = r45[r0]
            long r18 = r18 * r8
            long r14 = r14 + r18
            r44[r0] = r14
            long r14 = r16 * r10
            r18 = r46[r0]
            long r20 = r4 * r18
            r22 = r45[r0]
            long r24 = r22 * r12
            long r20 = r20 + r24
            long r20 = r20 * r6
            long r14 = r14 + r20
            r0 = 4
            r20 = r46[r0]
            long r20 = r20 * r1
            long r14 = r14 + r20
            r20 = r45[r0]
            long r20 = r20 * r8
            long r14 = r14 + r20
            r44[r0] = r14
            long r14 = r16 * r18
            long r20 = r22 * r10
            long r14 = r14 + r20
            r20 = r46[r0]
            long r24 = r4 * r20
            long r14 = r14 + r24
            r24 = r45[r0]
            long r26 = r24 * r12
            long r14 = r14 + r26
            r0 = 5
            r26 = r46[r0]
            long r26 = r26 * r1
            long r14 = r14 + r26
            r26 = r45[r0]
            long r26 = r26 * r8
            long r14 = r14 + r26
            r44[r0] = r14
            long r14 = r22 * r18
            r26 = r46[r0]
            long r28 = r4 * r26
            long r14 = r14 + r28
            r28 = r45[r0]
            long r30 = r28 * r12
            long r14 = r14 + r30
            long r14 = r14 * r6
            long r30 = r16 * r20
            long r14 = r14 + r30
            long r30 = r24 * r10
            long r14 = r14 + r30
            r0 = 6
            r30 = r46[r0]
            long r30 = r30 * r1
            long r14 = r14 + r30
            r30 = r45[r0]
            long r30 = r30 * r8
            long r14 = r14 + r30
            r44[r0] = r14
            long r14 = r22 * r20
            long r30 = r24 * r18
            long r14 = r14 + r30
            long r30 = r16 * r26
            long r14 = r14 + r30
            long r30 = r28 * r10
            long r14 = r14 + r30
            r30 = r46[r0]
            long r32 = r4 * r30
            long r14 = r14 + r32
            r32 = r45[r0]
            long r34 = r32 * r12
            long r14 = r14 + r34
            r0 = 7
            r34 = r46[r0]
            long r34 = r34 * r1
            long r14 = r14 + r34
            r34 = r45[r0]
            long r34 = r34 * r8
            long r14 = r14 + r34
            r44[r0] = r14
            long r14 = r24 * r20
            long r34 = r22 * r26
            long r36 = r28 * r18
            long r34 = r34 + r36
            r36 = r46[r0]
            long r38 = r4 * r36
            long r34 = r34 + r38
            r38 = r45[r0]
            long r40 = r38 * r12
            long r34 = r34 + r40
            long r34 = r34 * r6
            long r14 = r14 + r34
            long r34 = r16 * r30
            long r14 = r14 + r34
            long r34 = r32 * r10
            long r14 = r14 + r34
            r0 = 8
            r34 = r46[r0]
            long r34 = r34 * r1
            long r14 = r14 + r34
            r34 = r45[r0]
            long r34 = r34 * r8
            long r14 = r14 + r34
            r44[r0] = r14
            long r14 = r24 * r26
            long r34 = r28 * r20
            long r14 = r14 + r34
            long r34 = r22 * r30
            long r14 = r14 + r34
            long r34 = r32 * r18
            long r14 = r14 + r34
            long r34 = r16 * r36
            long r14 = r14 + r34
            long r34 = r38 * r10
            long r14 = r14 + r34
            r34 = r46[r0]
            long r40 = r4 * r34
            long r14 = r14 + r40
            r40 = r45[r0]
            long r42 = r40 * r12
            long r14 = r14 + r42
            r0 = 9
            r42 = r46[r0]
            long r1 = r1 * r42
            long r14 = r14 + r1
            r1 = r45[r0]
            long r1 = r1 * r8
            long r14 = r14 + r1
            r44[r0] = r14
            long r1 = r28 * r26
            long r8 = r22 * r36
            long r1 = r1 + r8
            long r8 = r38 * r18
            long r1 = r1 + r8
            r8 = r46[r0]
            long r4 = r4 * r8
            long r1 = r1 + r4
            r3 = r45[r0]
            long r12 = r12 * r3
            long r1 = r1 + r12
            long r1 = r1 * r6
            long r12 = r24 * r30
            long r1 = r1 + r12
            long r12 = r32 * r20
            long r1 = r1 + r12
            long r12 = r16 * r34
            long r1 = r1 + r12
            long r12 = r40 * r10
            long r1 = r1 + r12
            r0 = 10
            r44[r0] = r1
            long r0 = r28 * r30
            long r12 = r32 * r26
            long r0 = r0 + r12
            long r12 = r24 * r36
            long r0 = r0 + r12
            long r12 = r38 * r20
            long r0 = r0 + r12
            long r12 = r22 * r34
            long r0 = r0 + r12
            long r12 = r40 * r18
            long r0 = r0 + r12
            long r16 = r16 * r8
            long r0 = r0 + r16
            long r10 = r10 * r3
            long r0 = r0 + r10
            r2 = 11
            r44[r2] = r0
            long r0 = r32 * r30
            long r10 = r28 * r36
            long r12 = r38 * r26
            long r10 = r10 + r12
            long r22 = r22 * r8
            long r10 = r10 + r22
            long r18 = r18 * r3
            long r10 = r10 + r18
            long r10 = r10 * r6
            long r0 = r0 + r10
            long r10 = r24 * r34
            long r0 = r0 + r10
            long r10 = r40 * r20
            long r0 = r0 + r10
            r2 = 12
            r44[r2] = r0
            long r0 = r32 * r36
            long r10 = r38 * r30
            long r0 = r0 + r10
            long r10 = r28 * r34
            long r0 = r0 + r10
            long r10 = r40 * r26
            long r0 = r0 + r10
            long r24 = r24 * r8
            long r0 = r0 + r24
            long r20 = r20 * r3
            long r0 = r0 + r20
            r2 = 13
            r44[r2] = r0
            long r0 = r38 * r36
            long r28 = r28 * r8
            long r0 = r0 + r28
            long r26 = r26 * r3
            long r0 = r0 + r26
            long r0 = r0 * r6
            long r10 = r32 * r34
            long r0 = r0 + r10
            long r10 = r40 * r30
            long r0 = r0 + r10
            r2 = 14
            r44[r2] = r0
            long r0 = r38 * r34
            long r10 = r40 * r36
            long r0 = r0 + r10
            long r32 = r32 * r8
            long r0 = r0 + r32
            long r30 = r30 * r3
            long r0 = r0 + r30
            r2 = 15
            r44[r2] = r0
            long r0 = r40 * r34
            long r38 = r38 * r8
            long r36 = r36 * r3
            long r38 = r38 + r36
            long r38 = r38 * r6
            long r0 = r0 + r38
            r2 = 16
            r44[r2] = r0
            long r40 = r40 * r8
            long r34 = r34 * r3
            long r40 = r40 + r34
            r0 = 17
            r44[r0] = r40
            long r3 = r3 * r6
            long r3 = r3 * r8
            r0 = 18
            r44[r0] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzml.zzb(long[], long[], long[]):void");
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i10;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = copyOf[i12];
                int i13 = zzd[i12 & 1];
                int i14 = -((int) (((j10 >> 31) & j10) >> i13));
                copyOf[i12] = j10 + ((long) (i14 << i13));
                i12++;
                copyOf[i12] = copyOf[i12] - ((long) i14);
            }
            long j11 = copyOf[9];
            int i15 = -((int) (((j11 >> 31) & j11) >> 25));
            copyOf[9] = j11 + ((long) (i15 << 25));
            copyOf[0] = copyOf[0] - (((long) i15) * 19);
            i11++;
        }
        long j12 = copyOf[0];
        int i16 = -((int) (((j12 >> 31) & j12) >> 26));
        copyOf[0] = j12 + ((long) (i16 << 26));
        copyOf[1] = copyOf[1] - ((long) i16);
        int i17 = 0;
        for (i10 = 2; i17 < i10; i10 = 2) {
            int i18 = 0;
            while (i18 < 9) {
                long j13 = copyOf[i18];
                int i19 = i18 & 1;
                copyOf[i18] = j13 & ((long) zzc[i19]);
                i18++;
                copyOf[i18] = copyOf[i18] + ((long) ((int) (j13 >> zzd[i19])));
            }
            i17++;
        }
        long j14 = copyOf[9];
        copyOf[9] = j14 & 33554431;
        long j15 = copyOf[0] + (((long) ((int) (j14 >> 25))) * 19);
        copyOf[0] = j15;
        int i20 = ~((((int) j15) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) copyOf[i21]) ^ zzc[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i20));
        long j16 = (long) (33554431 & i20);
        copyOf[1] = copyOf[1] - j16;
        for (int i27 = 2; i27 < 10; i27 += 2) {
            copyOf[i27] = copyOf[i27] - ((long) (67108863 & i20));
            int i28 = i27 + 1;
            copyOf[i28] = copyOf[i28] - j16;
        }
        for (int i29 = 0; i29 < 10; i29++) {
            copyOf[i29] = copyOf[i29] << zzb[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = 0; i30 < 10; i30++) {
            int i31 = zza[i30];
            long j17 = copyOf[i30];
            bArr[i31] = (byte) ((int) (((long) bArr[i31]) | (j17 & 255)));
            int i32 = i31 + 1;
            bArr[i32] = (byte) ((int) (((long) bArr[i32]) | ((j17 >> 8) & 255)));
            int i33 = i31 + 2;
            bArr[i33] = (byte) ((int) (((long) bArr[i33]) | ((j17 >> 16) & 255)));
            int i34 = i31 + 3;
            bArr[i34] = (byte) ((int) (((long) bArr[i34]) | ((j17 >> 24) & 255)));
        }
        return bArr;
    }

    static void zzb(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + (j39 << 1);
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    static void zzb(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[1];
        long j12 = jArr2[2];
        long j13 = jArr2[3];
        long j14 = jArr2[4];
        long j15 = jArr2[5];
        long j16 = jArr2[6];
        long j17 = jArr2[7];
        long j18 = jArr2[8];
        long j19 = jArr2[9];
        zze(new long[]{j10 * j10, j10 * 2 * j11, ((j11 * j11) + (j10 * j12)) * 2, ((j11 * j12) + (j10 * j13)) * 2, (j12 * j12) + (j11 * 4 * j13) + (j10 * 2 * j14), ((j12 * j13) + (j11 * j14) + (j10 * j15)) * 2, ((j13 * j13) + (j12 * j14) + (j10 * j16) + (j11 * 2 * j15)) * 2, ((j13 * j14) + (j12 * j15) + (j11 * j16) + (j10 * j17)) * 2, (j14 * j14) + (((j12 * j16) + (j10 * j18) + (((j11 * j17) + (j13 * j15)) * 2)) * 2), ((j14 * j15) + (j13 * j16) + (j12 * j17) + (j11 * j18) + (j10 * j19)) * 2, ((j15 * j15) + (j14 * j16) + (j12 * j18) + (((j13 * j17) + (j11 * j19)) * 2)) * 2, ((j15 * j16) + (j14 * j17) + (j13 * j18) + (j12 * j19)) * 2, (j16 * j16) + (((j14 * j18) + (((j15 * j17) + (j13 * j19)) * 2)) * 2), ((j16 * j17) + (j15 * j18) + (j14 * j19)) * 2, ((j17 * j17) + (j16 * j18) + (j15 * 2 * j19)) * 2, ((j17 * j18) + (j16 * j19)) * 2, (j18 * j18) + (j17 * 4 * j19), j18 * 2 * j19, 2 * j19 * j19}, jArr);
    }

    static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    static void zza(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    static void zza(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zza[i10];
            jArr[i10] = ((((((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8)) | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> zzb[i10]) & ((long) zzc[i10 & 1]);
        }
        return jArr;
    }
}
