package com.fasterxml.jackson.core.io;

import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;

public final class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String[] sSmallIntStrs2 = {CreateTicketViewModelKt.EmailId, "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    TRIPLET_TO_CHARS[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
    }

    private static int _full3(int i10, char[] cArr, int i11) {
        int i12 = TRIPLET_TO_CHARS[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & 127);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & 127);
        return i14;
    }

    private static int _leading3(int i10, char[] cArr, int i11) {
        int i12 = TRIPLET_TO_CHARS[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    private static int _outputFullBillion(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = TRIPLET_TO_CHARS;
        int i15 = iArr[i14];
        cArr[i11] = (char) (i15 >> 16);
        cArr[i11 + 1] = (char) ((i15 >> 8) & 127);
        cArr[i11 + 2] = (char) (i15 & 127);
        int i16 = iArr[i12 - (i14 * 1000)];
        cArr[i11 + 3] = (char) (i16 >> 16);
        cArr[i11 + 4] = (char) ((i16 >> 8) & 127);
        cArr[i11 + 5] = (char) (i16 & 127);
        int i17 = iArr[i13];
        cArr[i11 + 6] = (char) (i17 >> 16);
        int i18 = i11 + 8;
        cArr[i11 + 7] = (char) ((i17 >> 8) & 127);
        int i19 = i11 + 9;
        cArr[i18] = (char) (i17 & 127);
        return i19;
    }

    private static int _outputSmallestI(char[] cArr, int i10) {
        String str = SMALLEST_INT;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int _outputSmallestL(char[] cArr, int i10) {
        String str = SMALLEST_LONG;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int _outputUptoBillion(int i10, char[] cArr, int i11) {
        if (i10 >= MILLION) {
            int i12 = i10 / 1000;
            int i13 = i10 - (i12 * 1000);
            int i14 = i12 / 1000;
            int _leading3 = _leading3(i14, cArr, i11);
            int[] iArr = TRIPLET_TO_CHARS;
            int i15 = iArr[i12 - (i14 * 1000)];
            cArr[_leading3] = (char) (i15 >> 16);
            cArr[_leading3 + 1] = (char) ((i15 >> 8) & 127);
            cArr[_leading3 + 2] = (char) (i15 & 127);
            int i16 = iArr[i13];
            cArr[_leading3 + 3] = (char) (i16 >> 16);
            int i17 = _leading3 + 5;
            cArr[_leading3 + 4] = (char) ((i16 >> 8) & 127);
            int i18 = _leading3 + 6;
            cArr[i17] = (char) (i16 & 127);
            return i18;
        } else if (i10 < 1000) {
            return _leading3(i10, cArr, i11);
        } else {
            int i19 = i10 / 1000;
            return _outputUptoMillion(cArr, i11, i19, i10 - (i19 * 1000));
        }
    }

    private static int _outputUptoMillion(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & 127);
            i10++;
        }
        cArr[i10] = (char) (i13 & 127);
        int i14 = iArr[i12];
        cArr[i10 + 1] = (char) (i14 >> 16);
        int i15 = i10 + 3;
        cArr[i10 + 2] = (char) ((i14 >> 8) & 127);
        int i16 = i10 + 4;
        cArr[i15] = (char) (i14 & 127);
        return i16;
    }

    public static int outputInt(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i11);
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 >= MILLION) {
            int i13 = BILLION;
            if (i10 >= i13) {
                int i14 = i10 - i13;
                if (i14 >= i13) {
                    i14 -= i13;
                    i12 = i11 + 1;
                    cArr[i11] = '2';
                } else {
                    i12 = i11 + 1;
                    cArr[i11] = '1';
                }
                return _outputFullBillion(i14, cArr, i12);
            }
            int i15 = i10 / 1000;
            int i16 = i15 / 1000;
            return _full3(i10 - (i15 * 1000), cArr, _full3(i15 - (i16 * 1000), cArr, _leading3(i16, cArr, i11)));
        } else if (i10 >= 1000) {
            int i17 = i10 / 1000;
            return _full3(i10 - (i17 * 1000), cArr, _leading3(i17, cArr, i11));
        } else if (i10 >= 10) {
            return _leading3(i10, cArr, i11);
        } else {
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
    }

    public static int outputLong(long j10, char[] cArr, int i10) {
        int i11;
        if (j10 < 0) {
            if (j10 > MIN_INT_AS_LONG) {
                return outputInt((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i10);
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= MAX_INT_AS_LONG) {
            return outputInt((int) j10, cArr, i10);
        }
        long j11 = BILLION_L;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            i11 = _outputUptoBillion((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int _leading3 = _leading3((int) j14, cArr, i10);
            i11 = _outputFullBillion((int) (j12 - (j11 * j14)), cArr, _leading3);
        }
        return _outputFullBillion((int) j13, cArr, i11);
    }

    public static String toString(int i10) {
        String[] strArr = sSmallIntStrs;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    private static int _outputSmallestI(byte[] bArr, int i10) {
        int length = SMALLEST_INT.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) SMALLEST_INT.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    private static int _outputSmallestL(byte[] bArr, int i10) {
        int length = SMALLEST_LONG.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) SMALLEST_LONG.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    private static int _full3(int i10, byte[] bArr, int i11) {
        int i12 = TRIPLET_TO_CHARS[i10];
        bArr[i11] = (byte) (i12 >> 16);
        int i13 = i11 + 2;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        int i14 = i11 + 3;
        bArr[i13] = (byte) i12;
        return i14;
    }

    private static int _leading3(int i10, byte[] bArr, int i11) {
        int i12 = TRIPLET_TO_CHARS[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i11] = (byte) (i12 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i12 >> 8);
            i11++;
        }
        int i13 = i11 + 1;
        bArr[i11] = (byte) i12;
        return i13;
    }

    public static String toString(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            return Long.toString(j10);
        }
        return toString((int) j10);
    }

    public static String toString(double d10) {
        return Double.toString(d10);
    }

    private static int _outputUptoMillion(byte[] bArr, int i10, int i11, int i12) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                bArr[i10] = (byte) (i13 >> 16);
                i10++;
            }
            bArr[i10] = (byte) (i13 >> 8);
            i10++;
        }
        bArr[i10] = (byte) i13;
        int i14 = iArr[i12];
        bArr[i10 + 1] = (byte) (i14 >> 16);
        int i15 = i10 + 3;
        bArr[i10 + 2] = (byte) (i14 >> 8);
        int i16 = i10 + 4;
        bArr[i15] = (byte) i14;
        return i16;
    }

    public static String toString(float f10) {
        return Float.toString(f10);
    }

    public static int outputLong(long j10, byte[] bArr, int i10) {
        int i11;
        if (j10 < 0) {
            if (j10 > MIN_INT_AS_LONG) {
                return outputInt((int) j10, bArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return _outputSmallestL(bArr, i10);
            }
            bArr[i10] = 45;
            j10 = -j10;
            i10++;
        } else if (j10 <= MAX_INT_AS_LONG) {
            return outputInt((int) j10, bArr, i10);
        }
        long j11 = BILLION_L;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            i11 = _outputUptoBillion((int) j12, bArr, i10);
        } else {
            long j14 = j12 / j11;
            int _leading3 = _leading3((int) j14, bArr, i10);
            i11 = _outputFullBillion((int) (j12 - (j11 * j14)), bArr, _leading3);
        }
        return _outputFullBillion((int) j13, bArr, i11);
    }

    private static int _outputFullBillion(int i10, byte[] bArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int[] iArr = TRIPLET_TO_CHARS;
        int i16 = iArr[i14];
        bArr[i11] = (byte) (i16 >> 16);
        bArr[i11 + 1] = (byte) (i16 >> 8);
        bArr[i11 + 2] = (byte) i16;
        int i17 = iArr[i15];
        bArr[i11 + 3] = (byte) (i17 >> 16);
        bArr[i11 + 4] = (byte) (i17 >> 8);
        bArr[i11 + 5] = (byte) i17;
        int i18 = iArr[i13];
        bArr[i11 + 6] = (byte) (i18 >> 16);
        int i19 = i11 + 8;
        bArr[i11 + 7] = (byte) (i18 >> 8);
        int i20 = i11 + 9;
        bArr[i19] = (byte) i18;
        return i20;
    }

    private static int _outputUptoBillion(int i10, byte[] bArr, int i11) {
        if (i10 >= MILLION) {
            int i12 = i10 / 1000;
            int i13 = i10 - (i12 * 1000);
            int i14 = i12 / 1000;
            int _leading3 = _leading3(i14, bArr, i11);
            int[] iArr = TRIPLET_TO_CHARS;
            int i15 = iArr[i12 - (i14 * 1000)];
            bArr[_leading3] = (byte) (i15 >> 16);
            bArr[_leading3 + 1] = (byte) (i15 >> 8);
            bArr[_leading3 + 2] = (byte) i15;
            int i16 = iArr[i13];
            bArr[_leading3 + 3] = (byte) (i16 >> 16);
            int i17 = _leading3 + 5;
            bArr[_leading3 + 4] = (byte) (i16 >> 8);
            int i18 = _leading3 + 6;
            bArr[i17] = (byte) i16;
            return i18;
        } else if (i10 < 1000) {
            return _leading3(i10, bArr, i11);
        } else {
            int i19 = i10 / 1000;
            return _outputUptoMillion(bArr, i11, i19, i10 - (i19 * 1000));
        }
    }

    public static int outputInt(int i10, byte[] bArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return _outputSmallestI(bArr, i11);
            }
            bArr[i11] = 45;
            i10 = -i10;
            i11++;
        }
        if (i10 >= MILLION) {
            int i13 = BILLION;
            if (i10 >= i13) {
                int i14 = i10 - i13;
                if (i14 >= i13) {
                    i14 -= i13;
                    i12 = i11 + 1;
                    bArr[i11] = 50;
                } else {
                    i12 = i11 + 1;
                    bArr[i11] = 49;
                }
                return _outputFullBillion(i14, bArr, i12);
            }
            int i15 = i10 / 1000;
            int i16 = i15 / 1000;
            return _full3(i10 - (i15 * 1000), bArr, _full3(i15 - (i16 * 1000), bArr, _leading3(i16, bArr, i11)));
        } else if (i10 >= 1000) {
            int i17 = i10 / 1000;
            return _full3(i10 - (i17 * 1000), bArr, _leading3(i17, bArr, i11));
        } else if (i10 >= 10) {
            return _leading3(i10, bArr, i11);
        } else {
            int i18 = i11 + 1;
            bArr[i11] = (byte) (i10 + 48);
            return i18;
        }
    }
}
