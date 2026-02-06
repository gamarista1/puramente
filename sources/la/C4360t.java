package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import za.C5298a;
import za.c;

/* renamed from: La.t  reason: case insensitive filesystem */
public class C4360t extends C5298a {
    public static final Parcelable.Creator<C4360t> CREATOR = new V();

    /* renamed from: a  reason: collision with root package name */
    private final String f51648a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51649b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51650c;

    /* renamed from: d  reason: collision with root package name */
    private final C4347h f51651d;

    /* renamed from: e  reason: collision with root package name */
    private final C4345g f51652e;

    /* renamed from: f  reason: collision with root package name */
    private final C4349i f51653f;

    /* renamed from: g  reason: collision with root package name */
    private final C4341e f51654g;

    /* renamed from: h  reason: collision with root package name */
    private final String f51655h;

    C4360t(String str, String str2, byte[] bArr, C4347h hVar, C4345g gVar, C4349i iVar, C4341e eVar, String str3) {
        boolean z10 = true;
        if (!((hVar != null && gVar == null && iVar == null) || ((hVar == null && gVar != null && iVar == null) || (hVar == null && gVar == null && iVar != null)))) {
            z10 = false;
        }
        C4536s.a(z10);
        this.f51648a = str;
        this.f51649b = str2;
        this.f51650c = bArr;
        this.f51651d = hVar;
        this.f51652e = gVar;
        this.f51653f = iVar;
        this.f51654g = eVar;
        this.f51655h = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4360t)) {
            return false;
        }
        C4360t tVar = (C4360t) obj;
        if (!C4535q.b(this.f51648a, tVar.f51648a) || !C4535q.b(this.f51649b, tVar.f51649b) || !Arrays.equals(this.f51650c, tVar.f51650c) || !C4535q.b(this.f51651d, tVar.f51651d) || !C4535q.b(this.f51652e, tVar.f51652e) || !C4535q.b(this.f51653f, tVar.f51653f) || !C4535q.b(this.f51654g, tVar.f51654g) || !C4535q.b(this.f51655h, tVar.f51655h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f51648a, this.f51649b, this.f51650c, this.f51652e, this.f51651d, this.f51653f, this.f51654g, this.f51655h);
    }

    public String o0() {
        return this.f51655h;
    }

    public C4341e p0() {
        return this.f51654g;
    }

    public String q0() {
        return this.f51648a;
    }

    public byte[] r0() {
        return this.f51650c;
    }

    public String s0() {
        return this.f51649b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, q0(), false);
        c.D(parcel, 2, s0(), false);
        c.k(parcel, 3, r0(), false);
        c.B(parcel, 4, this.f51651d, i10, false);
        c.B(parcel, 5, this.f51652e, i10, false);
        c.B(parcel, 6, this.f51653f, i10, false);
        c.B(parcel, 7, p0(), i10, false);
        c.D(parcel, 8, o0(), false);
        c.b(parcel, a10);
    }
}
