package y6;

import X5.a;
import kotlin.jvm.internal.C6496s;
import v6.C4106a;
import w6.C4142b;
import y6.C4188a;
import yf.C6787a;

/* renamed from: y6.d  reason: case insensitive filesystem */
public final class C4191d implements C4188a {

    /* renamed from: a  reason: collision with root package name */
    private final int f49554a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f49555b = C4191d.class;

    public C4191d(int i10) {
        this.f49554a = i10;
    }

    public void a(int i10, int i11, C6787a aVar) {
        C4188a.C0754a.d(this, i10, i11, aVar);
    }

    public a b(int i10, int i11, int i12) {
        return C4188a.C0754a.b(this, i10, i11, i12);
    }

    public void c() {
        C4188a.C0754a.a(this);
    }

    public void d(C4189b bVar, C4142b bVar2, C4106a aVar, int i10, C6787a aVar2) {
        C6496s.h(bVar, "bitmapFramePreparer");
        C6496s.h(bVar2, "bitmapFrameCache");
        C6496s.h(aVar, "animationBackend");
        int i11 = this.f49554a;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int a10 = (i10 + i12) % aVar.a();
                if (U5.a.w(2)) {
                    U5.a.z(this.f49555b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a10), Integer.valueOf(i10));
                }
                if (bVar.a(bVar2, aVar, a10)) {
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public void onStop() {
        C4188a.C0754a.c(this);
    }
}
