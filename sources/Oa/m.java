package oa;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f61181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f61182b;

    m(String str, Bundle bundle) {
        this.f61181a = str;
        this.f61182b = bundle;
    }

    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd(this.f61181a, this.f61182b);
        Object unused = o.k(zzd);
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new d(string);
    }
}
