package ya;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import za.C5298a;
import za.c;

/* renamed from: ya.c  reason: case insensitive filesystem */
public class C5286c extends C5298a {
    public static final Parcelable.Creator<C5286c> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final String f62273a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62274b;

    /* renamed from: c  reason: collision with root package name */
    private final long f62275c;

    public C5286c(String str, int i10, long j10) {
        this.f62273a = str;
        this.f62274b = i10;
        this.f62275c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5286c) {
            C5286c cVar = (C5286c) obj;
            if (((getName() == null || !getName().equals(cVar.getName())) && (getName() != null || cVar.getName() != null)) || o0() != cVar.o0()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getName() {
        return this.f62273a;
    }

    public final int hashCode() {
        return C4535q.c(getName(), Long.valueOf(o0()));
    }

    public long o0() {
        long j10 = this.f62275c;
        if (j10 == -1) {
            return (long) this.f62274b;
        }
        return j10;
    }

    public final String toString() {
        C4535q.a d10 = C4535q.d(this);
        d10.a("name", getName());
        d10.a(DiagnosticsEntry.VERSION_KEY, Long.valueOf(o0()));
        return d10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, getName(), false);
        c.t(parcel, 2, this.f62274b);
        c.w(parcel, 3, o0());
        c.b(parcel, a10);
    }

    public C5286c(String str, long j10) {
        this.f62273a = str;
        this.f62275c = j10;
        this.f62274b = -1;
    }
}
