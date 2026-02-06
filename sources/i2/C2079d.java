package i2;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: i2.d  reason: case insensitive filesystem */
public abstract class C2079d {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f22090a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f22091b = {"", "A", "B", "C"};

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static List b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        char c10;
        String str = f22091b[i10];
        Integer valueOf = Integer.valueOf(i11);
        Integer valueOf2 = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        StringBuilder sb2 = new StringBuilder(L.F("hvc1.%s%d.%X.%c%d", str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i13)));
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
        byte[] bArr2 = f22090a;
        byte[] bArr3 = new byte[(bArr2.length + i11)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static Pair e(byte[] bArr) {
        C2073A a10 = new C2073A(bArr);
        a10.U(9);
        int H10 = a10.H();
        a10.U(20);
        return Pair.create(Integer.valueOf(a10.L()), Integer.valueOf(H10));
    }

    public static boolean f(List list) {
        if (list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1) {
            return true;
        }
        return false;
    }
}
