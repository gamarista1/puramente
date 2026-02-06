package ya;

import Ha.C4294a;
import Ha.C4295b;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C4517b0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.E0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class s extends E0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f62293a;

    protected s(byte[] bArr) {
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.a(z10);
        this.f62293a = Arrays.hashCode(bArr);
    }

    protected static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        C4294a zzd;
        if (obj != null && (obj instanceof C4517b0)) {
            try {
                C4517b0 b0Var = (C4517b0) obj;
                if (b0Var.zzc() != this.f62293a || (zzd = b0Var.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(r1(), (byte[]) C4295b.b(zzd));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f62293a;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] r1();

    public final int zzc() {
        return this.f62293a;
    }

    public final C4294a zzd() {
        return C4295b.c(r1());
    }
}
