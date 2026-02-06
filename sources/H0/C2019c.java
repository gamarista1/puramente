package h0;

import Y.T0;
import h0.C2023g;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

/* renamed from: h0.c  reason: case insensitive filesystem */
final class C2019c implements C2028l, T0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C2026j f21106a;

    /* renamed from: b  reason: collision with root package name */
    private C2023g f21107b;

    /* renamed from: c  reason: collision with root package name */
    private String f21108c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Object f21109d;

    /* renamed from: e  reason: collision with root package name */
    private Object[] f21110e;

    /* renamed from: f  reason: collision with root package name */
    private C2023g.a f21111f;

    /* renamed from: g  reason: collision with root package name */
    private final C6787a f21112g = new a(this);

    /* renamed from: h0.c$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2019c f21113a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2019c cVar) {
            super(0);
            this.f21113a = cVar;
        }

        public final Object invoke() {
            C2026j e10 = this.f21113a.f21106a;
            C2019c cVar = this.f21113a;
            Object f10 = cVar.f21109d;
            if (f10 != null) {
                return e10.a(cVar, f10);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public C2019c(C2026j jVar, C2023g gVar, String str, Object obj, Object[] objArr) {
        this.f21106a = jVar;
        this.f21107b = gVar;
        this.f21108c = str;
        this.f21109d = obj;
        this.f21110e = objArr;
    }

    private final void h() {
        C2023g gVar = this.f21107b;
        if (this.f21111f != null) {
            throw new IllegalArgumentException(("entry(" + this.f21111f + ") is not null").toString());
        } else if (gVar != null) {
            C2018b.f(gVar, this.f21112g.invoke());
            this.f21111f = gVar.b(this.f21108c, this.f21112g);
        }
    }

    public boolean a(Object obj) {
        C2023g gVar = this.f21107b;
        if (gVar == null || gVar.a(obj)) {
            return true;
        }
        return false;
    }

    public void b() {
        h();
    }

    public void c() {
        C2023g.a aVar = this.f21111f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void d() {
        C2023g.a aVar = this.f21111f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final Object g(Object[] objArr) {
        if (Arrays.equals(objArr, this.f21110e)) {
            return this.f21109d;
        }
        return null;
    }

    public final void i(C2026j jVar, C2023g gVar, String str, Object obj, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f21107b != gVar) {
            this.f21107b = gVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!C6496s.c(this.f21108c, str)) {
            this.f21108c = str;
        } else {
            z11 = z10;
        }
        this.f21106a = jVar;
        this.f21109d = obj;
        this.f21110e = objArr;
        C2023g.a aVar = this.f21111f;
        if (aVar != null && z11) {
            if (aVar != null) {
                aVar.a();
            }
            this.f21111f = null;
            h();
        }
    }
}
