package We;

import ff.C5868v;
import java.util.Date;
import java.util.List;

/* renamed from: We.y0  reason: case insensitive filesystem */
public final class C5663y0 extends C5655u0 {

    /* renamed from: e  reason: collision with root package name */
    private Date f65940e;

    /* renamed from: f  reason: collision with root package name */
    private T0 f65941f;

    /* renamed from: g  reason: collision with root package name */
    private E0 f65942g;

    /* renamed from: We.y0$a */
    public static final class a {
    }

    C5663y0(C5868v vVar, Date date) {
        super(vVar);
        this.f65940e = date;
    }

    public List f() {
        T0 t02 = this.f65941f;
        if (t02 == null) {
            return null;
        }
        return t02.a();
    }

    public void g(List list) {
        this.f65941f = new T0(list);
    }

    public void h(E0 e02) {
        this.f65942g = e02;
    }

    public C5663y0(Throwable th2) {
        this();
        this.f65939d = th2;
    }

    public C5663y0() {
        this(new C5868v(), C5627g.a());
    }
}
