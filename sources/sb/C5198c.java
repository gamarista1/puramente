package sb;

import java.security.GeneralSecurityException;
import rb.C5190b;
import tb.C5208a;

/* renamed from: sb.c  reason: case insensitive filesystem */
public final class C5198c {

    /* renamed from: b  reason: collision with root package name */
    public static final C5190b.C0906b f61612b = C5190b.C0906b.ALGORITHM_NOT_FIPS;

    /* renamed from: a  reason: collision with root package name */
    private final C5208a f61613a;

    public C5198c(byte[] bArr) {
        if (!f61612b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        } else if (bArr.length == 32) {
            this.f61613a = C5208a.a(bArr);
        } else {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{32}));
        }
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", new Object[]{64}));
        } else if (!C5196a.s(bArr2, bArr, this.f61613a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
