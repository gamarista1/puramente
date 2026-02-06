package y9;

import ja.C3645a;
import ja.s;
import q9.C3962B;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f50035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f50036b;

    /* renamed from: c  reason: collision with root package name */
    public final C3962B.a f50037c;

    /* renamed from: d  reason: collision with root package name */
    public final int f50038d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f50039e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11;
        boolean z12 = false;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3645a.a((bArr2 == null ? true : z12) ^ z11);
        this.f50035a = z10;
        this.f50036b = str;
        this.f50038d = i10;
        this.f50039e = bArr2;
        this.f50037c = new C3962B.a(a(str), bArr, i11, i12);
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
                s.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
