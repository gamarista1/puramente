package pa;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import java.util.Collections;
import java.util.List;
import va.i;

/* renamed from: pa.e  reason: case insensitive filesystem */
final class C5128e extends a.C0818a {
    C5128e() {
    }

    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C4522e eVar, Object obj, f.b bVar, f.c cVar) {
        return new i(context, looper, eVar, (GoogleSignInOptions) obj, bVar, cVar);
    }

    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.r0();
    }
}
