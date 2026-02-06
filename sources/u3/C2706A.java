package u3;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import y3.k;
import yf.C6787a;

/* renamed from: u3.A  reason: case insensitive filesystem */
public abstract class C2706A {

    /* renamed from: a  reason: collision with root package name */
    private final u f26582a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f26583b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f26584c = C6531o.b(new a(this));

    /* renamed from: u3.A$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2706A f26585a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2706A a10) {
            super(0);
            this.f26585a = a10;
        }

        /* renamed from: a */
        public final k invoke() {
            return this.f26585a.d();
        }
    }

    public C2706A(u uVar) {
        C6496s.h(uVar, "database");
        this.f26582a = uVar;
    }

    /* access modifiers changed from: private */
    public final k d() {
        return this.f26582a.f(e());
    }

    private final k f() {
        return (k) this.f26584c.getValue();
    }

    private final k g(boolean z10) {
        if (z10) {
            return f();
        }
        return d();
    }

    public k b() {
        c();
        return g(this.f26583b.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f26582a.c();
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    public void h(k kVar) {
        C6496s.h(kVar, "statement");
        if (kVar == f()) {
            this.f26583b.set(false);
        }
    }
}
