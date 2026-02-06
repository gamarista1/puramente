package r0;

import android.graphics.Shader;
import android.os.Build;
import r0.k2;

/* renamed from: r0.a0  reason: case insensitive filesystem */
public abstract class C2475a0 {
    public static final Shader.TileMode a(int i10) {
        k2.a aVar = k2.f25537a;
        if (k2.f(i10, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (k2.f(i10, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (k2.f(i10, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (!k2.f(i10, aVar.b())) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return m2.f25546a.b();
        }
        return Shader.TileMode.CLAMP;
    }
}
