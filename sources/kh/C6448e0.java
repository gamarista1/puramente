package kh;

import gh.C5978b;
import gh.C5986j;
import ih.C6000a;
import ih.f;
import ih.i;
import ih.k;
import java.lang.annotation.Annotation;
import java.util.List;
import jh.c;
import jh.e;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import mf.C6559l;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

/* renamed from: kh.e0  reason: case insensitive filesystem */
public final class C6448e0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f71649a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f71650b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f71651c;

    /* renamed from: kh.e0$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6448e0 f71653b;

        /* renamed from: kh.e0$a$a  reason: collision with other inner class name */
        static final class C1025a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6448e0 f71654a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1025a(C6448e0 e0Var) {
                super(1);
                this.f71654a = e0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C6000a) obj);
                return C6514M.f71813a;
            }

            public final void invoke(C6000a aVar) {
                C6496s.h(aVar, "$this$buildSerialDescriptor");
                aVar.h(this.f71654a.f71650b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C6448e0 e0Var) {
            super(0);
            this.f71652a = str;
            this.f71653b = e0Var;
        }

        /* renamed from: a */
        public final f invoke() {
            return i.c(this.f71652a, k.d.f68509a, new f[0], new C1025a(this.f71653b));
        }
    }

    public C6448e0(String str, Object obj) {
        C6496s.h(str, "serialName");
        C6496s.h(obj, "objectInstance");
        this.f71649a = obj;
        this.f71650b = C6565s.n();
        this.f71651c = C6531o.a(C6534r.PUBLICATION, new a(str, this));
    }

    public Object deserialize(e eVar) {
        int o10;
        C6496s.h(eVar, "decoder");
        f descriptor = getDescriptor();
        c b10 = eVar.b(descriptor);
        if (!b10.p() && (o10 = b10.o(getDescriptor())) != -1) {
            throw new C5986j("Unexpected index " + o10);
        }
        C6514M m10 = C6514M.f71813a;
        b10.c(descriptor);
        return this.f71649a;
    }

    public f getDescriptor() {
        return (f) this.f71651c.getValue();
    }

    public void serialize(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        C6496s.h(obj, "value");
        fVar.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6448e0(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        C6496s.h(str, "serialName");
        C6496s.h(obj, "objectInstance");
        C6496s.h(annotationArr, "classAnnotations");
        this.f71650b = C6559l.e(annotationArr);
    }
}
