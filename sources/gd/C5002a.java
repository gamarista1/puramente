package gd;

import gh.C5977a;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6675h;
import rh.F;

/* renamed from: gd.a  reason: case insensitive filesystem */
public final class C5002a implements C6675h {

    /* renamed from: a  reason: collision with root package name */
    private final C5977a f60624a;

    /* renamed from: b  reason: collision with root package name */
    private final C5006e f60625b;

    public C5002a(C5977a aVar, C5006e eVar) {
        C6496s.h(aVar, "loader");
        C6496s.h(eVar, "serializer");
        this.f60624a = aVar;
        this.f60625b = eVar;
    }

    /* renamed from: a */
    public Object convert(F f10) {
        C6496s.h(f10, "value");
        return this.f60625b.a(this.f60624a, f10);
    }
}
