package ja;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ja.e  reason: case insensitive filesystem */
public abstract class C3649e {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f44998a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f44999b = {"", "A", "B", "C"};

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static List b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        char c10;
        String str = f44999b[i10];
        Integer valueOf = Integer.valueOf(i11);
        Integer valueOf2 = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        StringBuilder sb2 = new StringBuilder(M.C("hvc1.%s%d.%X.%c%d", str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i14])}));
        }
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f44998a;
        byte[] bArr3 = new byte[(bArr2.length + i11)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    private static int e(byte[] bArr, int i10) {
        int length = bArr.length - f44998a.length;
        while (i10 <= length) {
            if (f(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static boolean f(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f44998a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f44998a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static Pair g(byte[] bArr) {
        B b10 = new B(bArr);
        b10.P(9);
        int D10 = b10.D();
        b10.P(20);
        return Pair.create(Integer.valueOf(b10.H()), Integer.valueOf(D10));
    }

    public static boolean h(List list) {
        if (list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1) {
            return true;
        }
        return false;
    }

    public static byte[][] i(byte[] bArr) {
        int i10;
        if (!f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            arrayList.add(Integer.valueOf(i11));
            i11 = e(bArr, i11 + f44998a.length);
        } while (i11 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            int intValue = ((Integer) arrayList.get(i12)).intValue();
            if (i12 < arrayList.size() - 1) {
                i10 = ((Integer) arrayList.get(i12 + 1)).intValue();
            } else {
                i10 = bArr.length;
            }
            int i13 = i10 - intValue;
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr, intValue, bArr3, 0, i13);
            bArr2[i12] = bArr3;
        }
        return bArr2;
    }
}
