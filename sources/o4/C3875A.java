package o4;

import android.content.Context;
import b4.C3145a;
import wf.k;

/* renamed from: o4.A  reason: case insensitive filesystem */
public final class C3875A {

    /* renamed from: a  reason: collision with root package name */
    public static final C3875A f46979a = new C3875A();

    /* renamed from: b  reason: collision with root package name */
    private static C3145a f46980b;

    private C3875A() {
    }

    public final synchronized C3145a a(Context context) {
        C3145a aVar;
        aVar = f46980b;
        if (aVar == null) {
            aVar = new C3145a.C0592a().c(k.z(l.m(context), "image_cache")).a();
            f46980b = aVar;
        }
        return aVar;
    }
}
