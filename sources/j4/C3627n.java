package j4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import k4.C3666h;
import k4.C3667i;
import kotlin.jvm.internal.C6496s;
import rh.u;

/* renamed from: j4.n  reason: case insensitive filesystem */
public final class C3627n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44751a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f44752b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorSpace f44753c;

    /* renamed from: d  reason: collision with root package name */
    private final C3667i f44754d;

    /* renamed from: e  reason: collision with root package name */
    private final C3666h f44755e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f44756f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f44757g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f44758h;

    /* renamed from: i  reason: collision with root package name */
    private final String f44759i;

    /* renamed from: j  reason: collision with root package name */
    private final u f44760j;

    /* renamed from: k  reason: collision with root package name */
    private final C3632s f44761k;

    /* renamed from: l  reason: collision with root package name */
    private final C3628o f44762l;

    /* renamed from: m  reason: collision with root package name */
    private final C3615b f44763m;

    /* renamed from: n  reason: collision with root package name */
    private final C3615b f44764n;

    /* renamed from: o  reason: collision with root package name */
    private final C3615b f44765o;

    public C3627n(Context context, Bitmap.Config config, ColorSpace colorSpace, C3667i iVar, C3666h hVar, boolean z10, boolean z11, boolean z12, String str, u uVar, C3632s sVar, C3628o oVar, C3615b bVar, C3615b bVar2, C3615b bVar3) {
        this.f44751a = context;
        this.f44752b = config;
        this.f44753c = colorSpace;
        this.f44754d = iVar;
        this.f44755e = hVar;
        this.f44756f = z10;
        this.f44757g = z11;
        this.f44758h = z12;
        this.f44759i = str;
        this.f44760j = uVar;
        this.f44761k = sVar;
        this.f44762l = oVar;
        this.f44763m = bVar;
        this.f44764n = bVar2;
        this.f44765o = bVar3;
    }

    public static /* synthetic */ C3627n b(C3627n nVar, Context context, Bitmap.Config config, ColorSpace colorSpace, C3667i iVar, C3666h hVar, boolean z10, boolean z11, boolean z12, String str, u uVar, C3632s sVar, C3628o oVar, C3615b bVar, C3615b bVar2, C3615b bVar3, int i10, Object obj) {
        C3627n nVar2 = nVar;
        int i11 = i10;
        return nVar.a((i11 & 1) != 0 ? nVar2.f44751a : context, (i11 & 2) != 0 ? nVar2.f44752b : config, (i11 & 4) != 0 ? nVar2.f44753c : colorSpace, (i11 & 8) != 0 ? nVar2.f44754d : iVar, (i11 & 16) != 0 ? nVar2.f44755e : hVar, (i11 & 32) != 0 ? nVar2.f44756f : z10, (i11 & 64) != 0 ? nVar2.f44757g : z11, (i11 & 128) != 0 ? nVar2.f44758h : z12, (i11 & 256) != 0 ? nVar2.f44759i : str, (i11 & 512) != 0 ? nVar2.f44760j : uVar, (i11 & 1024) != 0 ? nVar2.f44761k : sVar, (i11 & 2048) != 0 ? nVar2.f44762l : oVar, (i11 & 4096) != 0 ? nVar2.f44763m : bVar, (i11 & 8192) != 0 ? nVar2.f44764n : bVar2, (i11 & 16384) != 0 ? nVar2.f44765o : bVar3);
    }

    public final C3627n a(Context context, Bitmap.Config config, ColorSpace colorSpace, C3667i iVar, C3666h hVar, boolean z10, boolean z11, boolean z12, String str, u uVar, C3632s sVar, C3628o oVar, C3615b bVar, C3615b bVar2, C3615b bVar3) {
        return new C3627n(context, config, colorSpace, iVar, hVar, z10, z11, z12, str, uVar, sVar, oVar, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f44756f;
    }

    public final boolean d() {
        return this.f44757g;
    }

    public final ColorSpace e() {
        return this.f44753c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3627n) {
            C3627n nVar = (C3627n) obj;
            if (C6496s.c(this.f44751a, nVar.f44751a) && this.f44752b == nVar.f44752b && ((Build.VERSION.SDK_INT < 26 || C6496s.c(this.f44753c, nVar.f44753c)) && C6496s.c(this.f44754d, nVar.f44754d) && this.f44755e == nVar.f44755e && this.f44756f == nVar.f44756f && this.f44757g == nVar.f44757g && this.f44758h == nVar.f44758h && C6496s.c(this.f44759i, nVar.f44759i) && C6496s.c(this.f44760j, nVar.f44760j) && C6496s.c(this.f44761k, nVar.f44761k) && C6496s.c(this.f44762l, nVar.f44762l) && this.f44763m == nVar.f44763m && this.f44764n == nVar.f44764n && this.f44765o == nVar.f44765o)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f44752b;
    }

    public final Context g() {
        return this.f44751a;
    }

    public final String h() {
        return this.f44759i;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f44751a.hashCode() * 31) + this.f44752b.hashCode()) * 31;
        ColorSpace colorSpace = this.f44753c;
        int i11 = 0;
        if (colorSpace != null) {
            i10 = colorSpace.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((((((((hashCode + i10) * 31) + this.f44754d.hashCode()) * 31) + this.f44755e.hashCode()) * 31) + Boolean.hashCode(this.f44756f)) * 31) + Boolean.hashCode(this.f44757g)) * 31) + Boolean.hashCode(this.f44758h)) * 31;
        String str = this.f44759i;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i11) * 31) + this.f44760j.hashCode()) * 31) + this.f44761k.hashCode()) * 31) + this.f44762l.hashCode()) * 31) + this.f44763m.hashCode()) * 31) + this.f44764n.hashCode()) * 31) + this.f44765o.hashCode();
    }

    public final C3615b i() {
        return this.f44764n;
    }

    public final u j() {
        return this.f44760j;
    }

    public final C3615b k() {
        return this.f44765o;
    }

    public final C3628o l() {
        return this.f44762l;
    }

    public final boolean m() {
        return this.f44758h;
    }

    public final C3666h n() {
        return this.f44755e;
    }

    public final C3667i o() {
        return this.f44754d;
    }

    public final C3632s p() {
        return this.f44761k;
    }
}
