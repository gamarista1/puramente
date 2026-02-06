package k4;

import android.view.View;
import kotlin.jvm.internal.C6496s;

/* renamed from: k4.g  reason: case insensitive filesystem */
public final class C3665g implements C3670l {

    /* renamed from: b  reason: collision with root package name */
    private final View f45112b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45113c;

    public C3665g(View view, boolean z10) {
        this.f45112b = view;
        this.f45113c = z10;
    }

    public View a() {
        return this.f45112b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3665g) {
            C3665g gVar = (C3665g) obj;
            if (!C6496s.c(a(), gVar.a()) || n() != gVar.n()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + Boolean.hashCode(n());
    }

    public boolean n() {
        return this.f45113c;
    }
}
