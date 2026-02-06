package f9;

import Z8.e;
import a9.C3142b;
import android.content.Context;
import g9.C3545c;
import g9.C3546d;
import h9.C3585b;
import i9.C3597a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class s implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43528a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f43529b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f43530c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f43531d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f43532e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider f43533f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider f43534g;

    /* renamed from: h  reason: collision with root package name */
    private final Provider f43535h;

    /* renamed from: i  reason: collision with root package name */
    private final Provider f43536i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f43528a = provider;
        this.f43529b = provider2;
        this.f43530c = provider3;
        this.f43531d = provider4;
        this.f43532e = provider5;
        this.f43533f = provider6;
        this.f43534g = provider7;
        this.f43535h = provider8;
        this.f43536i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, e eVar, C3546d dVar, x xVar, Executor executor, C3585b bVar, C3597a aVar, C3597a aVar2, C3545c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public r get() {
        return c((Context) this.f43528a.get(), (e) this.f43529b.get(), (C3546d) this.f43530c.get(), (x) this.f43531d.get(), (Executor) this.f43532e.get(), (C3585b) this.f43533f.get(), (C3597a) this.f43534g.get(), (C3597a) this.f43535h.get(), (C3545c) this.f43536i.get());
    }
}
