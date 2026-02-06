package y8;

import android.content.Context;

/* renamed from: y8.f  reason: case insensitive filesystem */
public class C4220f implements C4223i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49877a;

    /* renamed from: b  reason: collision with root package name */
    private final C4215a f49878b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49879c;

    public C4220f(Context context, int i10) {
        this.f49877a = context;
        this.f49879c = i10;
        C4215a aVar = new C4215a(5);
        this.f49878b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    public C4222h get() {
        return new C4219e(new C4221g(this.f49877a, this.f49878b), new C4216b(this.f49877a, this.f49878b), new C4226l(), new C4217c(this.f49877a), new C4224j(this.f49879c), new C4218d(), new C4225k(), new C4226l());
    }
}
