package j4;

import a4.C3114g;
import android.graphics.drawable.Drawable;
import h4.C3568c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: j4.r  reason: case insensitive filesystem */
public final class C3631r extends C3623j {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f44775a;

    /* renamed from: b  reason: collision with root package name */
    private final C3622i f44776b;

    /* renamed from: c  reason: collision with root package name */
    private final C3114g f44777c;

    /* renamed from: d  reason: collision with root package name */
    private final C3568c.b f44778d;

    /* renamed from: e  reason: collision with root package name */
    private final String f44779e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f44780f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f44781g;

    public C3631r(Drawable drawable, C3622i iVar, C3114g gVar, C3568c.b bVar, String str, boolean z10, boolean z11) {
        super((DefaultConstructorMarker) null);
        this.f44775a = drawable;
        this.f44776b = iVar;
        this.f44777c = gVar;
        this.f44778d = bVar;
        this.f44779e = str;
        this.f44780f = z10;
        this.f44781g = z11;
    }

    public Drawable a() {
        return this.f44775a;
    }

    public C3622i b() {
        return this.f44776b;
    }

    public final C3114g c() {
        return this.f44777c;
    }

    public final boolean d() {
        return this.f44781g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3631r) {
            C3631r rVar = (C3631r) obj;
            if (!C6496s.c(a(), rVar.a()) || !C6496s.c(b(), rVar.b()) || this.f44777c != rVar.f44777c || !C6496s.c(this.f44778d, rVar.f44778d) || !C6496s.c(this.f44779e, rVar.f44779e) || this.f44780f != rVar.f44780f || this.f44781g != rVar.f44781g) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f44777c.hashCode()) * 31;
        C3568c.b bVar = this.f44778d;
        int i11 = 0;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str = this.f44779e;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((i12 + i11) * 31) + Boolean.hashCode(this.f44780f)) * 31) + Boolean.hashCode(this.f44781g);
    }
}
