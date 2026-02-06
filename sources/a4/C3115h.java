package a4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C6496s;

/* renamed from: a4.h  reason: case insensitive filesystem */
public final class C3115h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f36053a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f36054b;

    public C3115h(Drawable drawable, boolean z10) {
        this.f36053a = drawable;
        this.f36054b = z10;
    }

    public final Drawable a() {
        return this.f36053a;
    }

    public final boolean b() {
        return this.f36054b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3115h) {
            C3115h hVar = (C3115h) obj;
            if (!C6496s.c(this.f36053a, hVar.f36053a) || this.f36054b != hVar.f36054b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f36053a.hashCode() * 31) + Boolean.hashCode(this.f36054b);
    }
}
