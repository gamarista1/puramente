package z;

import Y.C1519w;
import Y.C1521x;
import Y.I0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.C6498u;
import w.C2797i;
import w.C2798j;
import w.C2812x;
import yf.C6798l;

/* renamed from: z.e  reason: case insensitive filesystem */
public abstract class C2947e {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f28901a = C1521x.e(a.f28903a);

    /* renamed from: b  reason: collision with root package name */
    private static final C2946d f28902b = new b();

    /* renamed from: z.e$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28903a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final C2946d invoke(C1519w wVar) {
            if (!((Context) wVar.d(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return C2946d.f28897a.b();
            }
            return C2947e.b();
        }
    }

    /* renamed from: z.e$b */
    public static final class b implements C2946d {

        /* renamed from: b  reason: collision with root package name */
        private final float f28904b = 0.3f;

        /* renamed from: c  reason: collision with root package name */
        private final float f28905c;

        /* renamed from: d  reason: collision with root package name */
        private final C2797i f28906d = C2798j.j(125, 0, new C2812x(0.25f, 0.1f, 0.25f, 1.0f), 2, (Object) null);

        b() {
        }

        public float a(float f10, float f11, float f12) {
            boolean z10;
            float abs = Math.abs((f11 + f10) - f10);
            if (abs <= f12) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = (this.f28904b * f12) - (this.f28905c * abs);
            float f14 = f12 - f13;
            if (z10 && f14 < abs) {
                f13 = f12 - abs;
            }
            return f10 - f13;
        }

        public C2797i b() {
            return this.f28906d;
        }
    }

    public static final I0 a() {
        return f28901a;
    }

    public static final C2946d b() {
        return f28902b;
    }
}
