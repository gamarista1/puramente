package c1;

import android.content.Context;
import d1.C1923a;
import d1.C1924b;

/* renamed from: c1.a  reason: case insensitive filesystem */
public abstract class C1892a {
    public static final d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        C1923a b10 = C1924b.f19438a.b(f10);
        if (b10 == null) {
            b10 = new u(f10);
        }
        return new g(f11, f10, b10);
    }
}
