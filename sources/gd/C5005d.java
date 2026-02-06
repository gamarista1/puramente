package gd;

import gh.C5987k;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6675h;
import rh.D;
import rh.y;

/* renamed from: gd.d  reason: case insensitive filesystem */
public final class C5005d implements C6675h {

    /* renamed from: a  reason: collision with root package name */
    private final y f60628a;

    /* renamed from: b  reason: collision with root package name */
    private final C5987k f60629b;

    /* renamed from: c  reason: collision with root package name */
    private final C5006e f60630c;

    public C5005d(y yVar, C5987k kVar, C5006e eVar) {
        C6496s.h(yVar, "contentType");
        C6496s.h(kVar, "saver");
        C6496s.h(eVar, "serializer");
        this.f60628a = yVar;
        this.f60629b = kVar;
        this.f60630c = eVar;
    }

    /* renamed from: a */
    public D convert(Object obj) {
        return this.f60630c.d(this.f60628a, this.f60629b, obj);
    }
}
