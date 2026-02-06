package Db;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.C4797l;
import com.google.firebase.auth.D;
import com.google.firebase.auth.F;
import com.google.firebase.auth.V;
import com.google.firebase.auth.Z;

public abstract class j0 {
    public static zzags a(C4789h hVar, String str) {
        C4536s.l(hVar);
        if (F.class.isAssignableFrom(hVar.getClass())) {
            return F.r0((F) hVar, str);
        }
        if (C4797l.class.isAssignableFrom(hVar.getClass())) {
            return C4797l.r0((C4797l) hVar, str);
        }
        if (Z.class.isAssignableFrom(hVar.getClass())) {
            return Z.r0((Z) hVar, str);
        }
        if (D.class.isAssignableFrom(hVar.getClass())) {
            return D.r0((D) hVar, str);
        }
        if (V.class.isAssignableFrom(hVar.getClass())) {
            return V.r0((V) hVar, str);
        }
        if (C0.class.isAssignableFrom(hVar.getClass())) {
            return C0.u0((C0) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
