package mg;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

/* renamed from: mg.a  reason: case insensitive filesystem */
public abstract class C6573a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f72084a;

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        f72084a = b.f37475af.equals(str);
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (i12 == 1 || i12 == 3 || i12 == 6 || i12 == 8 || i12 == 10 || i12 == 12 || i12 == 14) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i12 == 1 || i12 == 3 || i12 == 6 || i12 == 8 || i12 == 10 || i12 == 12 || i12 == 14) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i12 == 1 || i12 == 3 || i12 == 6 || i12 == 8 || i12 == 10 || i12 == 12 || i12 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i12 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i12 == 3) {
            objArr[1] = "encode8to7";
        } else if (i12 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i12 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i12 == 10) {
            objArr[1] = "dropMarker";
        } else if (i12 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i12 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i12) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case StdKeyDeserializer.TYPE_URL:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i12 == 1 || i12 == 3 || i12 == 6 || i12 == 8 || i12 == 10 || i12 == 12 || i12 == 14) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    private static void b(byte[] bArr, int i10) {
        if (bArr == null) {
            a(4);
        }
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) ((bArr[i11] + i10) & 127);
        }
    }

    private static byte[] c(String[] strArr) {
        if (strArr == null) {
            a(11);
        }
        int i10 = 0;
        for (String length : strArr) {
            i10 += length.length();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (String str : strArr) {
            int length2 = str.length();
            int i12 = 0;
            while (i12 < length2) {
                bArr[i11] = (byte) str.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }

    private static byte[] d(byte[] bArr) {
        if (bArr == null) {
            a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        byte b10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i10 + 1;
            int i13 = b10 + 1;
            bArr2[i11] = (byte) (((bArr[i10] & 255) >>> b10) + ((bArr[i12] & ((1 << i13) - 1)) << (7 - b10)));
            if (b10 == 6) {
                i10 += 2;
                b10 = 0;
            } else {
                i10 = i12;
                b10 = i13;
            }
        }
        return bArr2;
    }

    public static byte[] e(String[] strArr) {
        if (strArr == null) {
            a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] a10 = C6582j.a(f(strArr));
                if (a10 == null) {
                    a(8);
                }
                return a10;
            } else if (charAt == 65535) {
                strArr = f(strArr);
            }
        }
        byte[] c10 = c(strArr);
        b(c10, 127);
        return d(c10);
    }

    private static String[] f(String[] strArr) {
        if (strArr == null) {
            a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
