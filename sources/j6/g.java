package j6;

import R5.i;
import T5.n;
import X6.C3096t;
import X6.x;
import android.content.Context;
import java.util.Set;
import m6.C3777a;

public class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44829a;

    /* renamed from: b  reason: collision with root package name */
    private final C3096t f44830b;

    /* renamed from: c  reason: collision with root package name */
    private final h f44831c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f44832d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f44833e;

    public g(Context context, b bVar) {
        this(context, x.l(), bVar);
    }

    /* renamed from: a */
    public f get() {
        return new f(this.f44829a, this.f44831c, this.f44830b, this.f44832d, this.f44833e).K((G6.g) null);
    }

    public g(Context context, x xVar, b bVar) {
        this(context, xVar, (Set) null, (Set) null, bVar);
    }

    public g(Context context, x xVar, Set set, Set set2, b bVar) {
        this.f44829a = context;
        C3096t j10 = xVar.j();
        this.f44830b = j10;
        if (bVar == null || bVar.d() == null) {
            this.f44831c = new h();
        } else {
            this.f44831c = bVar.d();
        }
        this.f44831c.a(context.getResources(), C3777a.b(), xVar.b(context), i.g(), j10.q(), bVar != null ? bVar.a() : null, bVar != null ? bVar.b() : null);
        this.f44832d = set;
        this.f44833e = set2;
        if (bVar != null) {
            bVar.c();
        }
    }
}
