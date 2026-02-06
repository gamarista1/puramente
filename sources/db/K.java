package Db;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzafq;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import com.google.firebase.auth.J;
import com.google.firebase.auth.U;
import com.google.firebase.auth.Y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class K {
    public static J a(zzafq zzafq) {
        if (zzafq == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafq.zze())) {
            return new U(zzafq.zzd(), zzafq.zzc(), zzafq.zza(), C4536s.f(zzafq.zze()));
        }
        if (zzafq.zzb() != null) {
            return new Y(zzafq.zzd(), zzafq.zzc(), zzafq.zza(), (zzagq) C4536s.m(zzafq.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J a10 = a((zzafq) it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
