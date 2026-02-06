package k4;

import android.content.Context;
import android.util.DisplayMetrics;
import k4.C3661c;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

/* renamed from: k4.d  reason: case insensitive filesystem */
public final class C3662d implements C3668j {

    /* renamed from: b  reason: collision with root package name */
    private final Context f45105b;

    public C3662d(Context context) {
        this.f45105b = context;
    }

    public Object b(C6658d dVar) {
        DisplayMetrics displayMetrics = this.f45105b.getResources().getDisplayMetrics();
        C3661c.a a10 = C3659a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C3667i(a10, a10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3662d) || !C6496s.c(this.f45105b, ((C3662d) obj).f45105b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f45105b.hashCode();
    }
}
