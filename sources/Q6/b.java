package Q6;

import R5.g;
import U6.d;
import V6.n;
import X6.C3093p;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33662a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f33663b;

    /* renamed from: c  reason: collision with root package name */
    private static a f33664c;

    private b() {
    }

    public static final a a(d dVar, C3093p pVar, n nVar, boolean z10, boolean z11, int i10, int i11, ExecutorService executorService) {
        if (!f33663b) {
            Class<AnimatedFactoryV2Impl> cls = AnimatedFactoryV2Impl.class;
            Class<d> cls2 = d.class;
            Class<C3093p> cls3 = C3093p.class;
            Class<n> cls4 = n.class;
            try {
                Class cls5 = Boolean.TYPE;
                Class cls6 = Integer.TYPE;
                AnimatedFactoryV2Impl newInstance = cls.getConstructor(new Class[]{cls2, cls3, cls4, cls5, cls5, cls6, cls6, g.class}).newInstance(new Object[]{dVar, pVar, nVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10), Integer.valueOf(i11), executorService});
                C6496s.f(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f33664c = newInstance;
            } catch (Throwable unused) {
            }
            if (f33664c != null) {
                f33663b = true;
            }
        }
        return f33664c;
    }
}
