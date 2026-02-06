package ie;

import kotlin.jvm.internal.C6496s;

/* renamed from: ie.e  reason: case insensitive filesystem */
public final class C5035e {

    /* renamed from: a  reason: collision with root package name */
    private final String f60816a;

    /* renamed from: b  reason: collision with root package name */
    private C5038h f60817b;

    public C5035e(String str) {
        C6496s.h(str, "name");
        this.f60816a = str;
    }

    public final C5038h a() {
        C5038h hVar = this.f60817b;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String b() {
        return this.f60816a;
    }

    public final void c(C5038h hVar) {
        this.f60817b = hVar;
    }
}
