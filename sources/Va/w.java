package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p001authapi.zba;
import com.google.android.gms.internal.p001authapi.zbc;

public final class w extends zba implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, vVar);
        zbc.zbc(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void b(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, vVar);
        zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void c(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, vVar);
        zbc.zbc(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
