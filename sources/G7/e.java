package g7;

import W5.b;
import android.os.Build;
import f7.D;
import f7.i;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C6496s;
import x1.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f43674a = new e();

    private e() {
    }

    public static final d a(D d10, boolean z10, boolean z11, f fVar) {
        C6496s.h(d10, "poolFactory");
        C6496s.h(fVar, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i b10 = d10.b();
            C6496s.g(b10, "getBitmapPool(...)");
            return new c(b10, b(d10, z11), fVar);
        }
        i b11 = d10.b();
        C6496s.g(b11, "getBitmapPool(...)");
        return new C3539a(b11, b(d10, z11), fVar);
    }

    public static final x1.e b(D d10, boolean z10) {
        C6496s.h(d10, "poolFactory");
        if (z10) {
            b bVar = b.f34852a;
            C6496s.g(bVar, "INSTANCE");
            return bVar;
        }
        int e10 = d10.e();
        f fVar = new f(e10);
        for (int i10 = 0; i10 < e10; i10++) {
            ByteBuffer allocate = ByteBuffer.allocate(b.e());
            C6496s.g(allocate, "allocate(...)");
            fVar.a(allocate);
        }
        return fVar;
    }
}
