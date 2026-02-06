package za;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public abstract class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: za.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static float A(Parcel parcel, int i10) {
        N(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float B(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        if (J10 == 0) {
            return null;
        }
        M(parcel, i10, J10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int C(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder D(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + J10);
        return readStrongBinder;
    }

    public static int E(Parcel parcel, int i10) {
        N(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer F(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        if (J10 == 0) {
            return null;
        }
        M(parcel, i10, J10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long G(Parcel parcel, int i10) {
        N(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long H(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        if (J10 == 0) {
            return null;
        }
        M(parcel, i10, J10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short I(Parcel parcel, int i10) {
        N(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int J(Parcel parcel, int i10) {
        if ((i10 & -65536) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static void K(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i10));
    }

    public static int L(Parcel parcel) {
        int C10 = C(parcel);
        int J10 = J(parcel, C10);
        int v10 = v(C10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 20293) {
            int i10 = J10 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(C10))), parcel);
    }

    private static void M(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            throw new a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
        }
    }

    private static void N(Parcel parcel, int i10, int i11) {
        int J10 = J(parcel, i10);
        if (J10 != i11) {
            String hexString = Integer.toHexString(J10);
            throw new a("Expected size " + i11 + " got " + J10 + " (0x" + hexString + ")", parcel);
        }
    }

    public static BigDecimal a(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + J10);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + J10);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + J10);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + J10);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + J10);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + J10);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + J10);
        return createByteArray;
    }

    public static byte[][] h(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + J10);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + J10);
        return createDoubleArray;
    }

    public static float[] j(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + J10);
        return createFloatArray;
    }

    public static int[] k(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + J10);
        return createIntArray;
    }

    public static long[] l(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + J10);
        return createLongArray;
    }

    public static Parcel m(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, J10);
        parcel.setDataPosition(dataPosition + J10);
        return obtain;
    }

    public static Parcel[] n(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + J10);
        return parcelArr;
    }

    public static Parcelable o(Parcel parcel, int i10, Parcelable.Creator creator) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + J10);
        return parcelable;
    }

    public static String p(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + J10);
        return readString;
    }

    public static String[] q(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + J10);
        return createStringArray;
    }

    public static ArrayList r(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + J10);
        return createStringArrayList;
    }

    public static Object[] s(Parcel parcel, int i10, Parcelable.Creator creator) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + J10);
        return createTypedArray;
    }

    public static ArrayList t(Parcel parcel, int i10, Parcelable.Creator creator) {
        int J10 = J(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (J10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + J10);
        return createTypedArrayList;
    }

    public static void u(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a("Overread allowed size end=" + i10, parcel);
        }
    }

    public static int v(int i10) {
        return (char) i10;
    }

    public static boolean w(Parcel parcel, int i10) {
        N(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean x(Parcel parcel, int i10) {
        boolean z10;
        int J10 = J(parcel, i10);
        if (J10 == 0) {
            return null;
        }
        M(parcel, i10, J10, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static double y(Parcel parcel, int i10) {
        N(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double z(Parcel parcel, int i10) {
        int J10 = J(parcel, i10);
        if (J10 == 0) {
            return null;
        }
        M(parcel, i10, J10, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
