package Aa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4540w;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* renamed from: Aa.a  reason: case insensitive filesystem */
public final class C4241a extends zaa implements IInterface {
    C4241a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void a(C4540w wVar) {
        Parcel zaa = zaa();
        zac.zac(zaa, wVar);
        zad(1, zaa);
    }
}
