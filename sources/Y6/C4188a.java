package y6;

import X5.a;
import kotlin.jvm.internal.C6496s;
import v6.C4106a;
import w6.C4142b;
import yf.C6787a;

/* renamed from: y6.a  reason: case insensitive filesystem */
public interface C4188a {
    void a(int i10, int i11, C6787a aVar);

    a b(int i10, int i11, int i12);

    void c();

    void d(C4189b bVar, C4142b bVar2, C4106a aVar, int i10, C6787a aVar2);

    void onStop();

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    public static final class C0754a {
        public static a b(C4188a aVar, int i10, int i11, int i12) {
            return null;
        }

        public static void e(C4188a aVar, C4189b bVar, C4142b bVar2, C4106a aVar2, int i10, C6787a aVar3) {
            C6496s.h(bVar, "bitmapFramePreparer");
            C6496s.h(bVar2, "bitmapFrameCache");
            C6496s.h(aVar2, "animationBackend");
        }

        public static /* synthetic */ void f(C4188a aVar, C4189b bVar, C4142b bVar2, C4106a aVar2, int i10, C6787a aVar3, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 16) != 0) {
                    aVar3 = null;
                }
                aVar.d(bVar, bVar2, aVar2, i10, aVar3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
        }

        public static void a(C4188a aVar) {
        }

        public static void c(C4188a aVar) {
        }

        public static void d(C4188a aVar, int i10, int i11, C6787a aVar2) {
        }
    }
}
