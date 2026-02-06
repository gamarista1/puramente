package z2;

import f2.C1961B;
import java.io.EOFException;

/* renamed from: z2.s  reason: case insensitive filesystem */
public abstract class C2974s {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw C1961B.a(str, (Throwable) null);
        }
    }

    public static boolean b(C2973q qVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return qVar.c(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(C2973q qVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = qVar.i(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    public static boolean d(C2973q qVar, byte[] bArr, int i10, int i11) {
        try {
            qVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(C2973q qVar, int i10) {
        try {
            qVar.j(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
