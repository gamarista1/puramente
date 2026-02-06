package La;

import La.C4356o;
import La.C4366z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: La.w  reason: case insensitive filesystem */
public class C4363w extends C5298a {
    public static final Parcelable.Creator<C4363w> CREATOR = new X();

    /* renamed from: a  reason: collision with root package name */
    private final C4366z f51671a;

    /* renamed from: b  reason: collision with root package name */
    private final C4356o f51672b;

    public C4363w(String str, int i10) {
        C4536s.l(str);
        try {
            this.f51671a = C4366z.a(str);
            C4536s.l(Integer.valueOf(i10));
            try {
                this.f51672b = C4356o.a(i10);
            } catch (C4356o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (C4366z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4363w)) {
            return false;
        }
        C4363w wVar = (C4363w) obj;
        if (!this.f51671a.equals(wVar.f51671a) || !this.f51672b.equals(wVar.f51672b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51671a, this.f51672b);
    }

    public int o0() {
        return this.f51672b.b();
    }

    public String p0() {
        return this.f51671a.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, p0(), false);
        c.v(parcel, 3, Integer.valueOf(o0()), false);
        c.b(parcel, a10);
    }
}
