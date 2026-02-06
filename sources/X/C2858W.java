package x;

import android.os.Build;
import android.view.View;
import c1.d;

/* renamed from: x.W  reason: case insensitive filesystem */
public interface C2858W {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27893a = a.f27894a;

    /* renamed from: x.W$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f27894a = new a();

        private a() {
        }

        public final C2858W a() {
            if (!C2847K.d(0, 1, (Object) null)) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            } else if (Build.VERSION.SDK_INT == 28) {
                return C2859X.f27895b;
            } else {
                return C2860Y.f27898b;
            }
        }
    }

    C2857V a(View view, boolean z10, long j10, float f10, float f11, boolean z11, d dVar, float f12);

    boolean b();
}
