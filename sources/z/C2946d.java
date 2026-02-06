package z;

import w.C2797i;
import w.C2798j;

/* renamed from: z.d  reason: case insensitive filesystem */
public interface C2946d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28897a = a.f28898a;

    /* renamed from: z.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f28898a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C2797i f28899b = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);

        /* renamed from: c  reason: collision with root package name */
        private static final C2946d f28900c = new C0484a();

        /* renamed from: z.d$a$a  reason: collision with other inner class name */
        public static final class C0484a implements C2946d {
            C0484a() {
            }
        }

        private a() {
        }

        public final float a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            if (Math.abs(f10) < Math.abs(f14)) {
                return f10;
            }
            return f14;
        }

        public final C2946d b() {
            return f28900c;
        }

        public final C2797i c() {
            return f28899b;
        }
    }

    float a(float f10, float f11, float f12) {
        return f28897a.a(f10, f11, f12);
    }

    C2797i b() {
        return f28897a.c();
    }
}
