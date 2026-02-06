package gh;

import Ff.d;
import hh.C5998a;
import ih.C6000a;
import ih.b;
import ih.d;
import ih.f;
import ih.i;
import ih.j;
import java.util.List;
import kh.C6441b;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.U;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

/* renamed from: gh.e  reason: case insensitive filesystem */
public final class C5981e extends C6441b {

    /* renamed from: a  reason: collision with root package name */
    private final d f67833a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f67834b = C6565s.n();

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f67835c = C6531o.a(C6534r.PUBLICATION, new a(this));

    /* renamed from: gh.e$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5981e f67836a;

        /* renamed from: gh.e$a$a  reason: collision with other inner class name */
        static final class C1004a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5981e f67837a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1004a(C5981e eVar) {
                super(1);
                this.f67837a = eVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C6000a) obj);
                return C6514M.f71813a;
            }

            public final void invoke(C6000a aVar) {
                C6000a aVar2 = aVar;
                C6496s.h(aVar2, "$this$buildSerialDescriptor");
                C6000a.b(aVar, "type", C5998a.E(U.f71764a).getDescriptor(), (List) null, false, 12, (Object) null);
                C6000a.b(aVar, "value", i.d("kotlinx.serialization.Polymorphic<" + this.f67837a.e().w() + '>', j.a.f68504a, new f[0], (C6798l) null, 8, (Object) null), (List) null, false, 12, (Object) null);
                aVar2.h(this.f67837a.f67834b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5981e eVar) {
            super(0);
            this.f67836a = eVar;
        }

        /* renamed from: a */
        public final f invoke() {
            return b.c(i.c("kotlinx.serialization.Polymorphic", d.a.f68472a, new f[0], new C1004a(this.f67836a)), this.f67836a.e());
        }
    }

    public C5981e(Ff.d dVar) {
        C6496s.h(dVar, "baseClass");
        this.f67833a = dVar;
    }

    public Ff.d e() {
        return this.f67833a;
    }

    public f getDescriptor() {
        return (f) this.f67835c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
