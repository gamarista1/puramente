package jh;

import gh.C5987k;
import kotlin.jvm.internal.C6496s;
import nh.C6624e;

public interface f {
    void D(int i10);

    void F(String str);

    C6624e a();

    d b(ih.f fVar);

    d e(ih.f fVar, int i10);

    void f(double d10);

    void h(byte b10);

    f j(ih.f fVar);

    void m(C5987k kVar, Object obj);

    void n(long j10);

    void r();

    void s(short s10);

    void u(boolean z10);

    void w(ih.f fVar, int i10);

    void x(float f10);

    void y(char c10);

    void z();

    public static final class a {
        public static d a(f fVar, ih.f fVar2, int i10) {
            C6496s.h(fVar2, "descriptor");
            return fVar.b(fVar2);
        }

        public static void c(f fVar, C5987k kVar, Object obj) {
            C6496s.h(kVar, "serializer");
            if (kVar.getDescriptor().b()) {
                fVar.m(kVar, obj);
            } else if (obj == null) {
                fVar.r();
            } else {
                fVar.z();
                fVar.m(kVar, obj);
            }
        }

        public static void d(f fVar, C5987k kVar, Object obj) {
            C6496s.h(kVar, "serializer");
            kVar.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
