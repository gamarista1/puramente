package V0;

import V0.h;
import Y.A1;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.g;
import yf.C6798l;

public final class i implements h.b {

    /* renamed from: a  reason: collision with root package name */
    private final v f8183a;

    /* renamed from: b  reason: collision with root package name */
    private final w f8184b;

    /* renamed from: c  reason: collision with root package name */
    private final E f8185c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final l f8186d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final u f8187e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C6798l f8188f;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f8189a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f8189a = iVar;
        }

        /* renamed from: a */
        public final Object invoke(D d10) {
            return this.f8189a.h(D.b(d10, (h) null, (p) null, 0, 0, (Object) null, 30, (Object) null)).getValue();
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f8190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ D f8191b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, D d10) {
            super(1);
            this.f8190a = iVar;
            this.f8191b = d10;
        }

        /* renamed from: a */
        public final F invoke(C6798l lVar) {
            F a10 = this.f8190a.f8186d.a(this.f8191b, this.f8190a.g(), lVar, this.f8190a.f8188f);
            if (a10 != null || (a10 = this.f8190a.f8187e.a(this.f8191b, this.f8190a.g(), lVar, this.f8190a.f8188f)) != null) {
                return a10;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public i(v vVar, w wVar, E e10, l lVar, u uVar) {
        this.f8183a = vVar;
        this.f8184b = wVar;
        this.f8185c = e10;
        this.f8186d = lVar;
        this.f8187e = uVar;
        this.f8188f = new a(this);
    }

    /* access modifiers changed from: private */
    public final A1 h(D d10) {
        return this.f8185c.c(d10, new b(this, d10));
    }

    public A1 b(h hVar, p pVar, int i10, int i11) {
        return h(new D(this.f8184b.c(hVar), this.f8184b.b(pVar), this.f8184b.a(i10), this.f8184b.d(i11), this.f8183a.getCacheKey(), (DefaultConstructorMarker) null));
    }

    public final v g() {
        return this.f8183a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(v vVar, w wVar, E e10, l lVar, u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, (i10 & 2) != 0 ? w.f8236a.a() : wVar, (i10 & 4) != 0 ? j.b() : e10, (i10 & 8) != 0 ? new l(j.a(), (g) null, 2, (DefaultConstructorMarker) null) : lVar, (i10 & 16) != 0 ? new u() : uVar);
    }
}
