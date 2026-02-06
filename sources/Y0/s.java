package Y0;

import Y.A1;
import android.graphics.Typeface;
import kotlin.jvm.internal.C6496s;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final A1 f10254a;

    /* renamed from: b  reason: collision with root package name */
    private final s f10255b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f10256c;

    public s(A1 a12, s sVar) {
        this.f10254a = a12;
        this.f10255b = sVar;
        this.f10256c = a12.getValue();
    }

    public final Typeface a() {
        Object obj = this.f10256c;
        C6496s.f(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        s sVar;
        if (this.f10254a.getValue() != this.f10256c || ((sVar = this.f10255b) != null && sVar.b())) {
            return true;
        }
        return false;
    }
}
