package Db;

import Ba.C4246a;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import com.google.firebase.auth.C;
import java.util.HashMap;
import java.util.Map;

public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    private static final C4246a f50455a = new C4246a("GetTokenResultFactory", new String[0]);

    public static C a(String str) {
        Map map;
        try {
            map = H.b(str);
        } catch (zzxy e10) {
            f50455a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        return new C(str, map);
    }
}
