package v1;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import v1.i;
import v1.k;

/* renamed from: v1.a  reason: case insensitive filesystem */
class C2746a {

    /* renamed from: a  reason: collision with root package name */
    private final k.c f26910a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f26911b;

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    class C0448a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.c f26912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f26913b;

        C0448a(k.c cVar, Typeface typeface) {
            this.f26912a = cVar;
            this.f26913b = typeface;
        }

        public void run() {
            this.f26912a.b(this.f26913b);
        }
    }

    /* renamed from: v1.a$b */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.c f26915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f26916b;

        b(k.c cVar, int i10) {
            this.f26915a = cVar;
            this.f26916b = i10;
        }

        public void run() {
            this.f26915a.a(this.f26916b);
        }
    }

    C2746a(k.c cVar, Executor executor) {
        this.f26910a = cVar;
        this.f26911b = executor;
    }

    private void a(int i10) {
        this.f26911b.execute(new b(this.f26910a, i10));
    }

    private void c(Typeface typeface) {
        this.f26911b.execute(new C0448a(this.f26910a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f26944a);
        } else {
            a(eVar.f26945b);
        }
    }
}
