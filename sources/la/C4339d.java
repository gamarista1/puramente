package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import za.C5298a;
import za.c;

/* renamed from: La.d  reason: case insensitive filesystem */
public class C4339d extends C5298a {
    public static final Parcelable.Creator<C4339d> CREATOR = new n0();

    /* renamed from: a  reason: collision with root package name */
    private final r f51576a;

    /* renamed from: b  reason: collision with root package name */
    private final C0 f51577b;

    /* renamed from: c  reason: collision with root package name */
    private final C4325F f51578c;

    /* renamed from: d  reason: collision with root package name */
    private final I0 f51579d;

    /* renamed from: e  reason: collision with root package name */
    private final C4330K f51580e;

    /* renamed from: f  reason: collision with root package name */
    private final C4332M f51581f;

    /* renamed from: g  reason: collision with root package name */
    private final E0 f51582g;

    /* renamed from: h  reason: collision with root package name */
    private final P f51583h;

    /* renamed from: i  reason: collision with root package name */
    private final C4359s f51584i;

    /* renamed from: j  reason: collision with root package name */
    private final S f51585j;

    C4339d(r rVar, C0 c02, C4325F f10, I0 i02, C4330K k10, C4332M m10, E0 e02, P p10, C4359s sVar, S s10) {
        this.f51576a = rVar;
        this.f51578c = f10;
        this.f51577b = c02;
        this.f51579d = i02;
        this.f51580e = k10;
        this.f51581f = m10;
        this.f51582g = e02;
        this.f51583h = p10;
        this.f51584i = sVar;
        this.f51585j = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4339d)) {
            return false;
        }
        C4339d dVar = (C4339d) obj;
        if (!C4535q.b(this.f51576a, dVar.f51576a) || !C4535q.b(this.f51577b, dVar.f51577b) || !C4535q.b(this.f51578c, dVar.f51578c) || !C4535q.b(this.f51579d, dVar.f51579d) || !C4535q.b(this.f51580e, dVar.f51580e) || !C4535q.b(this.f51581f, dVar.f51581f) || !C4535q.b(this.f51582g, dVar.f51582g) || !C4535q.b(this.f51583h, dVar.f51583h) || !C4535q.b(this.f51584i, dVar.f51584i) || !C4535q.b(this.f51585j, dVar.f51585j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51576a, this.f51577b, this.f51578c, this.f51579d, this.f51580e, this.f51581f, this.f51582g, this.f51583h, this.f51584i, this.f51585j);
    }

    public r o0() {
        return this.f51576a;
    }

    public C4325F p0() {
        return this.f51578c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 2, o0(), i10, false);
        c.B(parcel, 3, this.f51577b, i10, false);
        c.B(parcel, 4, p0(), i10, false);
        c.B(parcel, 5, this.f51579d, i10, false);
        c.B(parcel, 6, this.f51580e, i10, false);
        c.B(parcel, 7, this.f51581f, i10, false);
        c.B(parcel, 8, this.f51582g, i10, false);
        c.B(parcel, 9, this.f51583h, i10, false);
        c.B(parcel, 10, this.f51584i, i10, false);
        c.B(parcel, 11, this.f51585j, i10, false);
        c.b(parcel, a10);
    }
}
