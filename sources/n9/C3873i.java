package n9;

import ja.C3645a;
import k9.C3717q0;

/* renamed from: n9.i  reason: case insensitive filesystem */
public final class C3873i {

    /* renamed from: a  reason: collision with root package name */
    public final String f46960a;

    /* renamed from: b  reason: collision with root package name */
    public final C3717q0 f46961b;

    /* renamed from: c  reason: collision with root package name */
    public final C3717q0 f46962c;

    /* renamed from: d  reason: collision with root package name */
    public final int f46963d;

    /* renamed from: e  reason: collision with root package name */
    public final int f46964e;

    public C3873i(String str, C3717q0 q0Var, C3717q0 q0Var2, int i10, int i11) {
        boolean z10;
        if (i10 == 0 || i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f46960a = C3645a.d(str);
        this.f46961b = (C3717q0) C3645a.e(q0Var);
        this.f46962c = (C3717q0) C3645a.e(q0Var2);
        this.f46963d = i10;
        this.f46964e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3873i.class != obj.getClass()) {
            return false;
        }
        C3873i iVar = (C3873i) obj;
        if (this.f46963d != iVar.f46963d || this.f46964e != iVar.f46964e || !this.f46960a.equals(iVar.f46960a) || !this.f46961b.equals(iVar.f46961b) || !this.f46962c.equals(iVar.f46962c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f46963d) * 31) + this.f46964e) * 31) + this.f46960a.hashCode()) * 31) + this.f46961b.hashCode()) * 31) + this.f46962c.hashCode();
    }
}
