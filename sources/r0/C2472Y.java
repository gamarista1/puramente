package r0;

import android.graphics.Path;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import r0.S1;

/* renamed from: r0.Y  reason: case insensitive filesystem */
public abstract class C2472Y {

    /* renamed from: r0.Y$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25481a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                r0.S1$b[] r0 = r0.S1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r0.S1$b r1 = r0.S1.b.CounterClockwise     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r0.S1$b r1 = r0.S1.b.Clockwise     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f25481a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.C2472Y.a.<clinit>():void");
        }
    }

    public static final S1 a() {
        return new C2469V((Path) null, 1, (DefaultConstructorMarker) null);
    }

    public static final S1 c(Path path) {
        return new C2469V(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: private */
    public static final Path.Direction e(S1.b bVar) {
        int i10 = a.f25481a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new C6535s();
    }
}
