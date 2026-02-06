package X6;

import N5.d;
import N5.f;
import N5.g;
import N5.k;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X6.l  reason: case insensitive filesystem */
public class C3089l implements C3094q {

    /* renamed from: a  reason: collision with root package name */
    private C3090m f35161a;

    public C3089l(C3090m mVar) {
        this.f35161a = mVar;
    }

    private static g b(d dVar, f fVar) {
        return c(dVar, fVar, Executors.newSingleThreadExecutor());
    }

    private static g c(d dVar, f fVar, Executor executor) {
        return new g(fVar, dVar.h(), new g.c(dVar.k(), dVar.j(), dVar.f()), dVar.e(), dVar.d(), dVar.g(), executor, dVar.i());
    }

    public k a(d dVar) {
        return b(dVar, this.f35161a.a(dVar));
    }
}
