package La;

import La.C4337c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import java.util.List;
import za.c;

/* renamed from: La.u  reason: case insensitive filesystem */
public class C4361u extends C4322C {
    public static final Parcelable.Creator<C4361u> CREATOR = new U();

    /* renamed from: a  reason: collision with root package name */
    private final C4365y f51656a;

    /* renamed from: b  reason: collision with root package name */
    private final C4320A f51657b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51658c;

    /* renamed from: d  reason: collision with root package name */
    private final List f51659d;

    /* renamed from: e  reason: collision with root package name */
    private final Double f51660e;

    /* renamed from: f  reason: collision with root package name */
    private final List f51661f;

    /* renamed from: g  reason: collision with root package name */
    private final C4352k f51662g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f51663h;

    /* renamed from: i  reason: collision with root package name */
    private final C4324E f51664i;

    /* renamed from: j  reason: collision with root package name */
    private final C4337c f51665j;

    /* renamed from: k  reason: collision with root package name */
    private final C4339d f51666k;

    C4361u(C4365y yVar, C4320A a10, byte[] bArr, List list, Double d10, List list2, C4352k kVar, Integer num, C4324E e10, String str, C4339d dVar) {
        this.f51656a = (C4365y) C4536s.l(yVar);
        this.f51657b = (C4320A) C4536s.l(a10);
        this.f51658c = (byte[]) C4536s.l(bArr);
        this.f51659d = (List) C4536s.l(list);
        this.f51660e = d10;
        this.f51661f = list2;
        this.f51662g = kVar;
        this.f51663h = num;
        this.f51664i = e10;
        if (str != null) {
            try {
                this.f51665j = C4337c.a(str);
            } catch (C4337c.a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f51665j = null;
        }
        this.f51666k = dVar;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C4361u)) {
            return false;
        }
        C4361u uVar = (C4361u) obj;
        if (!C4535q.b(this.f51656a, uVar.f51656a) || !C4535q.b(this.f51657b, uVar.f51657b) || !Arrays.equals(this.f51658c, uVar.f51658c) || !C4535q.b(this.f51660e, uVar.f51660e) || !this.f51659d.containsAll(uVar.f51659d) || !uVar.f51659d.containsAll(this.f51659d) || ((((list = this.f51661f) != null || uVar.f51661f != null) && (list == null || (list2 = uVar.f51661f) == null || !list.containsAll(list2) || !uVar.f51661f.containsAll(this.f51661f))) || !C4535q.b(this.f51662g, uVar.f51662g) || !C4535q.b(this.f51663h, uVar.f51663h) || !C4535q.b(this.f51664i, uVar.f51664i) || !C4535q.b(this.f51665j, uVar.f51665j) || !C4535q.b(this.f51666k, uVar.f51666k))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51656a, this.f51657b, Integer.valueOf(Arrays.hashCode(this.f51658c)), this.f51659d, this.f51660e, this.f51661f, this.f51662g, this.f51663h, this.f51664i, this.f51665j, this.f51666k);
    }

    public String o0() {
        C4337c cVar = this.f51665j;
        if (cVar == null) {
            return null;
        }
        return cVar.toString();
    }

    public C4339d p0() {
        return this.f51666k;
    }

    public C4352k q0() {
        return this.f51662g;
    }

    public byte[] r0() {
        return this.f51658c;
    }

    public List s0() {
        return this.f51661f;
    }

    public List t0() {
        return this.f51659d;
    }

    public Integer u0() {
        return this.f51663h;
    }

    public C4365y v0() {
        return this.f51656a;
    }

    public Double w0() {
        return this.f51660e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 2, v0(), i10, false);
        c.B(parcel, 3, y0(), i10, false);
        c.k(parcel, 4, r0(), false);
        c.H(parcel, 5, t0(), false);
        c.o(parcel, 6, w0(), false);
        c.H(parcel, 7, s0(), false);
        c.B(parcel, 8, q0(), i10, false);
        c.v(parcel, 9, u0(), false);
        c.B(parcel, 10, x0(), i10, false);
        c.D(parcel, 11, o0(), false);
        c.B(parcel, 12, p0(), i10, false);
        c.b(parcel, a10);
    }

    public C4324E x0() {
        return this.f51664i;
    }

    public C4320A y0() {
        return this.f51657b;
    }
}
