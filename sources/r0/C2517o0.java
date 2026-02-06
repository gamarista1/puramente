package r0;

import android.graphics.Shader;

/* renamed from: r0.o0  reason: case insensitive filesystem */
public abstract class C2517o0 {

    /* renamed from: r0.o0$a */
    public static final class a extends c2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Shader f25549e;

        a(Shader shader) {
            this.f25549e = shader;
        }

        public Shader b(long j10) {
            return this.f25549e;
        }
    }

    public static final c2 a(Shader shader) {
        return new a(shader);
    }
}
