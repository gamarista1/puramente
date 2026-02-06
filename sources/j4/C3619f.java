package j4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: j4.f  reason: case insensitive filesystem */
public final class C3619f extends C3623j {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f44664a;

    /* renamed from: b  reason: collision with root package name */
    private final C3622i f44665b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f44666c;

    public C3619f(Drawable drawable, C3622i iVar, Throwable th2) {
        super((DefaultConstructorMarker) null);
        this.f44664a = drawable;
        this.f44665b = iVar;
        this.f44666c = th2;
    }

    public Drawable a() {
        return this.f44664a;
    }

    public C3622i b() {
        return this.f44665b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3619f) {
            C3619f fVar = (C3619f) obj;
            if (!C6496s.c(a(), fVar.a()) || !C6496s.c(b(), fVar.b()) || !C6496s.c(this.f44666c, fVar.f44666c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Drawable a10 = a();
        if (a10 != null) {
            i10 = a10.hashCode();
        } else {
            i10 = 0;
        }
        return (((i10 * 31) + b().hashCode()) * 31) + this.f44666c.hashCode();
    }
}
