package p2;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import l2.C2170b;
import p2.t;

/* renamed from: p2.m  reason: case insensitive filesystem */
public interface C2409m {

    /* renamed from: p2.m$a */
    public static class a extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f25287a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f25287a = i10;
        }
    }

    static void g(C2409m mVar, C2409m mVar2) {
        if (mVar != mVar2) {
            if (mVar2 != null) {
                mVar2.i((t.a) null);
            }
            if (mVar != null) {
                mVar.h((t.a) null);
            }
        }
    }

    a a();

    UUID b();

    boolean c();

    C2170b d();

    Map e();

    boolean f(String str);

    int getState();

    void h(t.a aVar);

    void i(t.a aVar);
}
