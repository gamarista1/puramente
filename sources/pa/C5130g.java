package pa;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4535q;

/* renamed from: pa.g  reason: case insensitive filesystem */
public final class C5130g implements a.d {

    /* renamed from: d  reason: collision with root package name */
    public static final C5130g f61232d = new C5130g(new C5129f());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f61233a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f61234b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f61235c;

    public C5130g(C5129f fVar) {
        this.f61234b = fVar.f61230a.booleanValue();
        this.f61235c = fVar.f61231b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", this.f61234b);
        bundle.putString("log_session_id", this.f61235c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5130g)) {
            return false;
        }
        C5130g gVar = (C5130g) obj;
        String str = gVar.f61233a;
        if (!C4535q.b((Object) null, (Object) null) || this.f61234b != gVar.f61234b || !C4535q.b(this.f61235c, gVar.f61235c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(null, Boolean.valueOf(this.f61234b), this.f61235c);
    }
}
