package R0;

import android.os.Build;
import android.text.StaticLayout;

final class U implements h0 {
    public StaticLayout a(i0 i0Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(i0Var.r(), i0Var.q(), i0Var.e(), i0Var.o(), i0Var.u());
        obtain.setTextDirection(i0Var.s());
        obtain.setAlignment(i0Var.a());
        obtain.setMaxLines(i0Var.n());
        obtain.setEllipsize(i0Var.c());
        obtain.setEllipsizedWidth(i0Var.d());
        obtain.setLineSpacing(i0Var.l(), i0Var.m());
        obtain.setIncludePad(i0Var.g());
        obtain.setBreakStrategy(i0Var.b());
        obtain.setHyphenationFrequency(i0Var.f());
        obtain.setIndents(i0Var.i(), i0Var.p());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            W.a(obtain, i0Var.h());
        }
        if (i10 >= 28) {
            Y.a(obtain, i0Var.t());
        }
        if (i10 >= 33) {
            f0.b(obtain, i0Var.j(), i0Var.k());
        }
        return obtain.build();
    }

    public boolean b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return f0.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
