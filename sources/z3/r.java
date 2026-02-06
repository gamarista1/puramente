package Z3;

import C.C1086d;
import H0.C1187h;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import r0.C2547y0;

final class r implements w, C1086d {

    /* renamed from: a  reason: collision with root package name */
    private final C1086d f10498a;

    /* renamed from: b  reason: collision with root package name */
    private final f f10499b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10500c;

    /* renamed from: d  reason: collision with root package name */
    private final c f10501d;

    /* renamed from: e  reason: collision with root package name */
    private final C1187h f10502e;

    /* renamed from: f  reason: collision with root package name */
    private final float f10503f;

    /* renamed from: g  reason: collision with root package name */
    private final C2547y0 f10504g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10505h;

    public r(C1086d dVar, f fVar, String str, c cVar, C1187h hVar, float f10, C2547y0 y0Var, boolean z10) {
        this.f10498a = dVar;
        this.f10499b = fVar;
        this.f10500c = str;
        this.f10501d = cVar;
        this.f10502e = hVar;
        this.f10503f = f10;
        this.f10504g = y0Var;
        this.f10505h = z10;
    }

    public float a() {
        return this.f10503f;
    }

    public C2547y0 b() {
        return this.f10504g;
    }

    public i e(i iVar, c cVar) {
        return this.f10498a.e(iVar, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (C6496s.c(this.f10498a, rVar.f10498a) && C6496s.c(this.f10499b, rVar.f10499b) && C6496s.c(this.f10500c, rVar.f10500c) && C6496s.c(this.f10501d, rVar.f10501d) && C6496s.c(this.f10502e, rVar.f10502e) && Float.compare(this.f10503f, rVar.f10503f) == 0 && C6496s.c(this.f10504g, rVar.f10504g) && this.f10505h == rVar.f10505h) {
            return true;
        }
        return false;
    }

    public String getContentDescription() {
        return this.f10500c;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f10498a.hashCode() * 31) + this.f10499b.hashCode()) * 31;
        String str = this.f10500c;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + this.f10501d.hashCode()) * 31) + this.f10502e.hashCode()) * 31) + Float.hashCode(this.f10503f)) * 31;
        C2547y0 y0Var = this.f10504g;
        if (y0Var != null) {
            i11 = y0Var.hashCode();
        }
        return ((hashCode2 + i11) * 31) + Boolean.hashCode(this.f10505h);
    }

    public boolean r() {
        return this.f10505h;
    }

    public C1187h s() {
        return this.f10502e;
    }

    public c t() {
        return this.f10501d;
    }

    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f10498a + ", painter=" + this.f10499b + ", contentDescription=" + this.f10500c + ", alignment=" + this.f10501d + ", contentScale=" + this.f10502e + ", alpha=" + this.f10503f + ", colorFilter=" + this.f10504g + ", clipToBounds=" + this.f10505h + ')';
    }

    public f u() {
        return this.f10499b;
    }
}
