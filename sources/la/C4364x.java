package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import java.util.List;
import za.c;

/* renamed from: La.x  reason: case insensitive filesystem */
public class C4364x extends C4322C {
    public static final Parcelable.Creator<C4364x> CREATOR = new Y();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f51673a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f51674b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51675c;

    /* renamed from: d  reason: collision with root package name */
    private final List f51676d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f51677e;

    /* renamed from: f  reason: collision with root package name */
    private final C4324E f51678f;

    /* renamed from: g  reason: collision with root package name */
    private final C4350i0 f51679g;

    /* renamed from: h  reason: collision with root package name */
    private final C4339d f51680h;

    /* renamed from: i  reason: collision with root package name */
    private final Long f51681i;

    C4364x(byte[] bArr, Double d10, String str, List list, Integer num, C4324E e10, String str2, C4339d dVar, Long l10) {
        this.f51673a = (byte[]) C4536s.l(bArr);
        this.f51674b = d10;
        this.f51675c = (String) C4536s.l(str);
        this.f51676d = list;
        this.f51677e = num;
        this.f51678f = e10;
        this.f51681i = l10;
        if (str2 != null) {
            try {
                this.f51679g = C4350i0.a(str2);
            } catch (C4348h0 e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f51679g = null;
        }
        this.f51680h = dVar;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C4364x)) {
            return false;
        }
        C4364x xVar = (C4364x) obj;
        if (!Arrays.equals(this.f51673a, xVar.f51673a) || !C4535q.b(this.f51674b, xVar.f51674b) || !C4535q.b(this.f51675c, xVar.f51675c) || ((((list = this.f51676d) != null || xVar.f51676d != null) && (list == null || (list2 = xVar.f51676d) == null || !list.containsAll(list2) || !xVar.f51676d.containsAll(this.f51676d))) || !C4535q.b(this.f51677e, xVar.f51677e) || !C4535q.b(this.f51678f, xVar.f51678f) || !C4535q.b(this.f51679g, xVar.f51679g) || !C4535q.b(this.f51680h, xVar.f51680h) || !C4535q.b(this.f51681i, xVar.f51681i))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(Arrays.hashCode(this.f51673a)), this.f51674b, this.f51675c, this.f51676d, this.f51677e, this.f51678f, this.f51679g, this.f51680h, this.f51681i);
    }

    public List o0() {
        return this.f51676d;
    }

    public C4339d p0() {
        return this.f51680h;
    }

    public byte[] q0() {
        return this.f51673a;
    }

    public Integer r0() {
        return this.f51677e;
    }

    public String s0() {
        return this.f51675c;
    }

    public Double t0() {
        return this.f51674b;
    }

    public C4324E u0() {
        return this.f51678f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        String str;
        int a10 = c.a(parcel);
        c.k(parcel, 2, q0(), false);
        c.o(parcel, 3, t0(), false);
        c.D(parcel, 4, s0(), false);
        c.H(parcel, 5, o0(), false);
        c.v(parcel, 6, r0(), false);
        c.B(parcel, 7, u0(), i10, false);
        C4350i0 i0Var = this.f51679g;
        if (i0Var == null) {
            str = null;
        } else {
            str = i0Var.toString();
        }
        c.D(parcel, 8, str, false);
        c.B(parcel, 9, p0(), i10, false);
        c.y(parcel, 10, this.f51681i, false);
        c.b(parcel, a10);
    }
}
