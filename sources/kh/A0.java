package kh;

import gh.C5978b;
import gh.C5986j;
import ih.C6000a;
import ih.f;
import ih.i;
import java.util.List;
import jh.c;
import jh.d;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.z;
import yf.C6798l;

public final class A0 implements C5978b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5978b f71580a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5978b f71581b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5978b f71582c;

    /* renamed from: d  reason: collision with root package name */
    private final f f71583d = i.b("kotlin.Triple", new f[0], new a(this));

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A0 f71584a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A0 a02) {
            super(1);
            this.f71584a = a02;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C6000a) obj);
            return C6514M.f71813a;
        }

        public final void invoke(C6000a aVar) {
            C6496s.h(aVar, "$this$buildClassSerialDescriptor");
            C6000a aVar2 = aVar;
            C6000a.b(aVar2, "first", this.f71584a.f71580a.getDescriptor(), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "second", this.f71584a.f71581b.getDescriptor(), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "third", this.f71584a.f71582c.getDescriptor(), (List) null, false, 12, (Object) null);
        }
    }

    public A0(C5978b bVar, C5978b bVar2, C5978b bVar3) {
        C6496s.h(bVar, "aSerializer");
        C6496s.h(bVar2, "bSerializer");
        C6496s.h(bVar3, "cSerializer");
        this.f71580a = bVar;
        this.f71581b = bVar2;
        this.f71582c = bVar3;
    }

    private final z d(c cVar) {
        Object c10 = c.a.c(cVar, getDescriptor(), 0, this.f71580a, (Object) null, 8, (Object) null);
        Object c11 = c.a.c(cVar, getDescriptor(), 1, this.f71581b, (Object) null, 8, (Object) null);
        Object c12 = c.a.c(cVar, getDescriptor(), 2, this.f71582c, (Object) null, 8, (Object) null);
        cVar.c(getDescriptor());
        return new z(c10, c11, c12);
    }

    private final z e(c cVar) {
        Object a10 = B0.f71586a;
        Object a11 = B0.f71586a;
        Object a12 = B0.f71586a;
        while (true) {
            int o10 = cVar.o(getDescriptor());
            if (o10 == -1) {
                cVar.c(getDescriptor());
                if (a10 == B0.f71586a) {
                    throw new C5986j("Element 'first' is missing");
                } else if (a11 == B0.f71586a) {
                    throw new C5986j("Element 'second' is missing");
                } else if (a12 != B0.f71586a) {
                    return new z(a10, a11, a12);
                } else {
                    throw new C5986j("Element 'third' is missing");
                }
            } else if (o10 == 0) {
                a10 = c.a.c(cVar, getDescriptor(), 0, this.f71580a, (Object) null, 8, (Object) null);
            } else if (o10 == 1) {
                a11 = c.a.c(cVar, getDescriptor(), 1, this.f71581b, (Object) null, 8, (Object) null);
            } else if (o10 == 2) {
                a12 = c.a.c(cVar, getDescriptor(), 2, this.f71582c, (Object) null, 8, (Object) null);
            } else {
                throw new C5986j("Unexpected index " + o10);
            }
        }
    }

    /* renamed from: f */
    public z deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        c b10 = eVar.b(getDescriptor());
        if (b10.p()) {
            return d(b10);
        }
        return e(b10);
    }

    /* renamed from: g */
    public void serialize(jh.f fVar, z zVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(zVar, "value");
        d b10 = fVar.b(getDescriptor());
        b10.B(getDescriptor(), 0, this.f71580a, zVar.d());
        b10.B(getDescriptor(), 1, this.f71581b, zVar.e());
        b10.B(getDescriptor(), 2, this.f71582c, zVar.f());
        b10.c(getDescriptor());
    }

    public f getDescriptor() {
        return this.f71583d;
    }
}
