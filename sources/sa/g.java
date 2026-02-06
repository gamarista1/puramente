package Sa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class g extends zaa implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(j jVar, f fVar) {
        Parcel zaa = zaa();
        zac.zac(zaa, jVar);
        zac.zad(zaa, fVar);
        zac(12, zaa);
    }
}
