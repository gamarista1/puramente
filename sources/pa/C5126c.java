package pa;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4535q;

/* renamed from: pa.c  reason: case insensitive filesystem */
public final class C5126c implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final C5126c f61228b = new C5126c(new Bundle(), (C5132i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f61229a;

    /* synthetic */ C5126c(Bundle bundle, C5132i iVar) {
        this.f61229a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f61229a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5126c)) {
            return false;
        }
        return C4535q.a(this.f61229a, ((C5126c) obj).f61229a);
    }

    public final int hashCode() {
        return C4535q.c(this.f61229a);
    }
}
