package j4;

import Ug.G;
import android.graphics.Bitmap;
import androidx.lifecycle.C1790m;
import k4.C3663e;
import k4.C3666h;
import k4.C3668j;
import kotlin.jvm.internal.C6496s;
import n4.C3856c;

/* renamed from: j4.d  reason: case insensitive filesystem */
public final class C3617d {

    /* renamed from: a  reason: collision with root package name */
    private final C1790m f44649a;

    /* renamed from: b  reason: collision with root package name */
    private final C3668j f44650b;

    /* renamed from: c  reason: collision with root package name */
    private final C3666h f44651c;

    /* renamed from: d  reason: collision with root package name */
    private final G f44652d;

    /* renamed from: e  reason: collision with root package name */
    private final G f44653e;

    /* renamed from: f  reason: collision with root package name */
    private final G f44654f;

    /* renamed from: g  reason: collision with root package name */
    private final G f44655g;

    /* renamed from: h  reason: collision with root package name */
    private final C3856c.a f44656h;

    /* renamed from: i  reason: collision with root package name */
    private final C3663e f44657i;

    /* renamed from: j  reason: collision with root package name */
    private final Bitmap.Config f44658j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f44659k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f44660l;

    /* renamed from: m  reason: collision with root package name */
    private final C3615b f44661m;

    /* renamed from: n  reason: collision with root package name */
    private final C3615b f44662n;

    /* renamed from: o  reason: collision with root package name */
    private final C3615b f44663o;

    public C3617d(C1790m mVar, C3668j jVar, C3666h hVar, G g10, G g11, G g12, G g13, C3856c.a aVar, C3663e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, C3615b bVar, C3615b bVar2, C3615b bVar3) {
        this.f44649a = mVar;
        this.f44650b = jVar;
        this.f44651c = hVar;
        this.f44652d = g10;
        this.f44653e = g11;
        this.f44654f = g12;
        this.f44655g = g13;
        this.f44656h = aVar;
        this.f44657i = eVar;
        this.f44658j = config;
        this.f44659k = bool;
        this.f44660l = bool2;
        this.f44661m = bVar;
        this.f44662n = bVar2;
        this.f44663o = bVar3;
    }

    public final Boolean a() {
        return this.f44659k;
    }

    public final Boolean b() {
        return this.f44660l;
    }

    public final Bitmap.Config c() {
        return this.f44658j;
    }

    public final G d() {
        return this.f44654f;
    }

    public final C3615b e() {
        return this.f44662n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3617d) {
            C3617d dVar = (C3617d) obj;
            if (!C6496s.c(this.f44649a, dVar.f44649a) || !C6496s.c(this.f44650b, dVar.f44650b) || this.f44651c != dVar.f44651c || !C6496s.c(this.f44652d, dVar.f44652d) || !C6496s.c(this.f44653e, dVar.f44653e) || !C6496s.c(this.f44654f, dVar.f44654f) || !C6496s.c(this.f44655g, dVar.f44655g) || !C6496s.c(this.f44656h, dVar.f44656h) || this.f44657i != dVar.f44657i || this.f44658j != dVar.f44658j || !C6496s.c(this.f44659k, dVar.f44659k) || !C6496s.c(this.f44660l, dVar.f44660l) || this.f44661m != dVar.f44661m || this.f44662n != dVar.f44662n || this.f44663o != dVar.f44663o) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final G f() {
        return this.f44653e;
    }

    public final G g() {
        return this.f44652d;
    }

    public final C1790m h() {
        return this.f44649a;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C1790m mVar = this.f44649a;
        int i24 = 0;
        if (mVar != null) {
            i10 = mVar.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = i10 * 31;
        C3668j jVar = this.f44650b;
        if (jVar != null) {
            i11 = jVar.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        C3666h hVar = this.f44651c;
        if (hVar != null) {
            i12 = hVar.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        G g10 = this.f44652d;
        if (g10 != null) {
            i13 = g10.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        G g11 = this.f44653e;
        if (g11 != null) {
            i14 = g11.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        G g12 = this.f44654f;
        if (g12 != null) {
            i15 = g12.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (i29 + i15) * 31;
        G g13 = this.f44655g;
        if (g13 != null) {
            i16 = g13.hashCode();
        } else {
            i16 = 0;
        }
        int i31 = (i30 + i16) * 31;
        C3856c.a aVar = this.f44656h;
        if (aVar != null) {
            i17 = aVar.hashCode();
        } else {
            i17 = 0;
        }
        int i32 = (i31 + i17) * 31;
        C3663e eVar = this.f44657i;
        if (eVar != null) {
            i18 = eVar.hashCode();
        } else {
            i18 = 0;
        }
        int i33 = (i32 + i18) * 31;
        Bitmap.Config config = this.f44658j;
        if (config != null) {
            i19 = config.hashCode();
        } else {
            i19 = 0;
        }
        int i34 = (i33 + i19) * 31;
        Boolean bool = this.f44659k;
        if (bool != null) {
            i20 = bool.hashCode();
        } else {
            i20 = 0;
        }
        int i35 = (i34 + i20) * 31;
        Boolean bool2 = this.f44660l;
        if (bool2 != null) {
            i21 = bool2.hashCode();
        } else {
            i21 = 0;
        }
        int i36 = (i35 + i21) * 31;
        C3615b bVar = this.f44661m;
        if (bVar != null) {
            i22 = bVar.hashCode();
        } else {
            i22 = 0;
        }
        int i37 = (i36 + i22) * 31;
        C3615b bVar2 = this.f44662n;
        if (bVar2 != null) {
            i23 = bVar2.hashCode();
        } else {
            i23 = 0;
        }
        int i38 = (i37 + i23) * 31;
        C3615b bVar3 = this.f44663o;
        if (bVar3 != null) {
            i24 = bVar3.hashCode();
        }
        return i38 + i24;
    }

    public final C3615b i() {
        return this.f44661m;
    }

    public final C3615b j() {
        return this.f44663o;
    }

    public final C3663e k() {
        return this.f44657i;
    }

    public final C3666h l() {
        return this.f44651c;
    }

    public final C3668j m() {
        return this.f44650b;
    }

    public final G n() {
        return this.f44655g;
    }

    public final C3856c.a o() {
        return this.f44656h;
    }
}
