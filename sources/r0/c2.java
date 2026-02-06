package r0;

import android.graphics.Shader;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2427m;
import r0.C2544x0;

public abstract class c2 extends C2514n0 {

    /* renamed from: c  reason: collision with root package name */
    private Shader f25488c;

    /* renamed from: d  reason: collision with root package name */
    private long f25489d = C2427m.f25341b.a();

    public c2() {
        super((DefaultConstructorMarker) null);
    }

    public final void a(long j10, Q1 q12, float f10) {
        Shader shader = this.f25488c;
        if (shader == null || !C2427m.h(this.f25489d, j10)) {
            if (C2427m.m(j10)) {
                shader = null;
                this.f25488c = null;
                this.f25489d = C2427m.f25341b.a();
            } else {
                shader = b(j10);
                this.f25488c = shader;
                this.f25489d = j10;
            }
        }
        long d10 = q12.d();
        C2544x0.a aVar = C2544x0.f25560b;
        if (!C2544x0.q(d10, aVar.a())) {
            q12.m(aVar.a());
        }
        if (!C6496s.c(q12.s(), shader)) {
            q12.r(shader);
        }
        if (q12.a() != f10) {
            q12.c(f10);
        }
    }

    public abstract Shader b(long j10);
}
