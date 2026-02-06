package T2;

import i2.C2076a;
import i2.p;
import z2.O;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6138a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6139b;

    /* renamed from: c  reason: collision with root package name */
    public final O.a f6140c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6141d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f6142e;

    public t(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11;
        boolean z12 = false;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.a((bArr2 == null ? true : z12) ^ z11);
        this.f6138a = z10;
        this.f6139b = str;
        this.f6141d = i10;
        this.f6142e = bArr2;
        this.f6140c = new O.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                p.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
