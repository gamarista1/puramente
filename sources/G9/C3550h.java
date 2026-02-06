package g9;

import a9.C3142b;
import a9.C3144d;
import android.content.Context;
import javax.inject.Provider;

/* renamed from: g9.h  reason: case insensitive filesystem */
public final class C3550h implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43732a;

    public C3550h(Provider provider) {
        this.f43732a = provider;
    }

    public static C3550h a(Provider provider) {
        return new C3550h(provider);
    }

    public static String c(Context context) {
        return (String) C3144d.c(C3548f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return c((Context) this.f43732a.get());
    }
}
