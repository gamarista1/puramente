package ya;

import Ha.C4294a;
import Ha.C4295b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.E0;
import za.C5298a;
import za.c;

public final class B extends C5298a {
    public static final Parcelable.Creator<B> CREATOR = new C();

    /* renamed from: a  reason: collision with root package name */
    private final String f62258a;

    /* renamed from: b  reason: collision with root package name */
    private final s f62259b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62260c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62261d;

    B(String str, s sVar, boolean z10, boolean z11) {
        this.f62258a = str;
        this.f62259b = sVar;
        this.f62260c = z10;
        this.f62261d = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f62258a;
        int a10 = c.a(parcel);
        c.D(parcel, 1, str, false);
        s sVar = this.f62259b;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        }
        c.s(parcel, 2, sVar, false);
        c.g(parcel, 3, this.f62260c);
        c.g(parcel, 4, this.f62261d);
        c.b(parcel, a10);
    }

    B(String str, IBinder iBinder, boolean z10, boolean z11) {
        byte[] bArr;
        this.f62258a = str;
        t tVar = null;
        if (iBinder != null) {
            try {
                C4294a zzd = E0.a(iBinder).zzd();
                if (zzd == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C4295b.b(zzd);
                }
                if (bArr != null) {
                    tVar = new t(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f62259b = tVar;
        this.f62260c = z10;
        this.f62261d = z11;
    }
}
