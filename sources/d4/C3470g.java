package d4;

import a4.C3114g;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d4.g  reason: case insensitive filesystem */
public final class C3470g extends C3471h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f43106a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f43107b;

    /* renamed from: c  reason: collision with root package name */
    private final C3114g f43108c;

    public C3470g(Drawable drawable, boolean z10, C3114g gVar) {
        super((DefaultConstructorMarker) null);
        this.f43106a = drawable;
        this.f43107b = z10;
        this.f43108c = gVar;
    }

    public final C3114g a() {
        return this.f43108c;
    }

    public final Drawable b() {
        return this.f43106a;
    }

    public final boolean c() {
        return this.f43107b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3470g) {
            C3470g gVar = (C3470g) obj;
            if (C6496s.c(this.f43106a, gVar.f43106a) && this.f43107b == gVar.f43107b && this.f43108c == gVar.f43108c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f43106a.hashCode() * 31) + Boolean.hashCode(this.f43107b)) * 31) + this.f43108c.hashCode();
    }
}
