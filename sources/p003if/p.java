package p003if;

import java.util.Arrays;
import java.util.UUID;

/* renamed from: if.p  reason: invalid package */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f67901a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    private static final long[] f67902b;

    static {
        long[] jArr = new long[128];
        f67902b = jArr;
        Arrays.fill(jArr, -1);
        jArr[48] = 0;
        jArr[49] = 1;
        jArr[50] = 2;
        jArr[51] = 3;
        jArr[52] = 4;
        jArr[53] = 5;
        jArr[54] = 6;
        jArr[55] = 7;
        jArr[56] = 8;
        jArr[57] = 9;
        jArr[97] = 10;
        jArr[98] = 11;
        jArr[99] = 12;
        jArr[100] = 13;
        jArr[101] = 14;
        jArr[102] = 15;
        jArr[65] = 10;
        jArr[66] = 11;
        jArr[67] = 12;
        jArr[68] = 13;
        jArr[69] = 14;
        jArr[70] = 15;
    }

    private static void a(char[] cArr, long j10) {
        char[] cArr2 = f67901a;
        cArr[0] = cArr2[(int) ((-1152921504606846976L & j10) >>> 60)];
        cArr[1] = cArr2[(int) ((1080863910568919040L & j10) >>> 56)];
        cArr[2] = cArr2[(int) ((67553994410557440L & j10) >>> 52)];
        cArr[3] = cArr2[(int) ((4222124650659840L & j10) >>> 48)];
        cArr[4] = cArr2[(int) ((263882790666240L & j10) >>> 44)];
        cArr[5] = cArr2[(int) ((16492674416640L & j10) >>> 40)];
        cArr[6] = cArr2[(int) ((1030792151040L & j10) >>> 36)];
        cArr[7] = cArr2[(int) ((64424509440L & j10) >>> 32)];
        cArr[8] = cArr2[(int) ((4026531840L & j10) >>> 28)];
        cArr[9] = cArr2[(int) ((251658240 & j10) >>> 24)];
        cArr[10] = cArr2[(int) ((15728640 & j10) >>> 20)];
        cArr[11] = cArr2[(int) ((983040 & j10) >>> 16)];
        cArr[12] = cArr2[(int) ((61440 & j10) >>> 12)];
        cArr[13] = cArr2[(int) ((3840 & j10) >>> 8)];
        cArr[14] = cArr2[(int) ((240 & j10) >>> 4)];
        cArr[15] = cArr2[(int) (j10 & 15)];
    }

    public static String b(long j10, long j11) {
        char[] cArr = new char[32];
        a(cArr, j10);
        char[] cArr2 = f67901a;
        cArr[16] = cArr2[(int) ((-1152921504606846976L & j11) >>> 60)];
        cArr[17] = cArr2[(int) ((1080863910568919040L & j11) >>> 56)];
        cArr[18] = cArr2[(int) ((67553994410557440L & j11) >>> 52)];
        cArr[19] = cArr2[(int) ((4222124650659840L & j11) >>> 48)];
        cArr[20] = cArr2[(int) ((263882790666240L & j11) >>> 44)];
        cArr[21] = cArr2[(int) ((16492674416640L & j11) >>> 40)];
        cArr[22] = cArr2[(int) ((1030792151040L & j11) >>> 36)];
        cArr[23] = cArr2[(int) ((64424509440L & j11) >>> 32)];
        cArr[24] = cArr2[(int) ((4026531840L & j11) >>> 28)];
        cArr[25] = cArr2[(int) ((251658240 & j11) >>> 24)];
        cArr[26] = cArr2[(int) ((15728640 & j11) >>> 20)];
        cArr[27] = cArr2[(int) ((983040 & j11) >>> 16)];
        cArr[28] = cArr2[(int) ((61440 & j11) >>> 12)];
        cArr[29] = cArr2[(int) ((3840 & j11) >>> 8)];
        cArr[30] = cArr2[(int) ((240 & j11) >>> 4)];
        cArr[31] = cArr2[(int) (j11 & 15)];
        return new String(cArr);
    }

    public static String c(UUID uuid) {
        return b(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static String d(long j10) {
        char[] cArr = new char[16];
        a(cArr, j10);
        return new String(cArr);
    }
}
