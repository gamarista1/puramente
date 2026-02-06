package androidx.compose.ui.platform;

import O0.j;
import O0.n;
import androidx.collection.C1601o;
import androidx.collection.D;
import androidx.collection.r;
import java.util.List;

/* renamed from: androidx.compose.ui.platform.i1  reason: case insensitive filesystem */
public final class C1639i1 {

    /* renamed from: a  reason: collision with root package name */
    private final j f13754a;

    /* renamed from: b  reason: collision with root package name */
    private final D f13755b = r.b();

    public C1639i1(n nVar, C1601o oVar) {
        this.f13754a = nVar.w();
        List t10 = nVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar2 = (n) t10.get(i10);
            if (oVar.a(nVar2.o())) {
                this.f13755b.f(nVar2.o());
            }
        }
    }

    public final D a() {
        return this.f13755b;
    }

    public final j b() {
        return this.f13754a;
    }
}
