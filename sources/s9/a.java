package S9;

import android.net.Uri;
import ia.C3612j;
import ia.J;
import ia.l;
import ia.n;
import ja.C3645a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class a implements C3612j {

    /* renamed from: a  reason: collision with root package name */
    private final C3612j f33959a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f33960b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f33961c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f33962d;

    public a(C3612j jVar, byte[] bArr, byte[] bArr2) {
        this.f33959a = jVar;
        this.f33960b = bArr;
        this.f33961c = bArr2;
    }

    public void close() {
        if (this.f33962d != null) {
            this.f33962d = null;
            this.f33959a.close();
        }
    }

    public final Map d() {
        return this.f33959a.d();
    }

    public final Uri getUri() {
        return this.f33959a.getUri();
    }

    public final long m(n nVar) {
        try {
            Cipher o10 = o();
            try {
                o10.init(2, new SecretKeySpec(this.f33960b, "AES"), new IvParameterSpec(this.f33961c));
                l lVar = new l(this.f33959a, nVar);
                this.f33962d = new CipherInputStream(lVar, o10);
                lVar.b();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void n(J j10) {
        C3645a.e(j10);
        this.f33959a.n(j10);
    }

    /* access modifiers changed from: protected */
    public Cipher o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public final int read(byte[] bArr, int i10, int i11) {
        C3645a.e(this.f33962d);
        int read = this.f33962d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
