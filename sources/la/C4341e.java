package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.e  reason: case insensitive filesystem */
public class C4341e extends C5298a {
    public static final Parcelable.Creator<C4341e> CREATOR = new m0();

    /* renamed from: a  reason: collision with root package name */
    private final C4326G f51586a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f51587b;

    /* renamed from: c  reason: collision with root package name */
    private final C4343f f51588c;

    /* renamed from: d  reason: collision with root package name */
    private final r0 f51589d;

    C4341e(C4326G g10, p0 p0Var, C4343f fVar, r0 r0Var) {
        this.f51586a = g10;
        this.f51587b = p0Var;
        this.f51588c = fVar;
        this.f51589d = r0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4341e)) {
            return false;
        }
        C4341e eVar = (C4341e) obj;
        if (!C4535q.b(this.f51586a, eVar.f51586a) || !C4535q.b(this.f51587b, eVar.f51587b) || !C4535q.b(this.f51588c, eVar.f51588c) || !C4535q.b(this.f51589d, eVar.f51589d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51586a, this.f51587b, this.f51588c, this.f51589d);
    }

    public C4343f o0() {
        return this.f51588c;
    }

    public C4326G p0() {
        return this.f51586a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, p0(), i10, false);
        c.B(parcel, 2, this.f51587b, i10, false);
        c.B(parcel, 3, o0(), i10, false);
        c.B(parcel, 4, this.f51589d, i10, false);
        c.b(parcel, a10);
    }
}
