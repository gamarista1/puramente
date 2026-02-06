package lh;

import gh.C5978b;
import ih.C6000a;
import ih.d;
import ih.f;
import ih.i;
import java.util.List;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

public final class k implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final k f71993a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71994b = i.c("kotlinx.serialization.json.JsonElement", d.b.f68473a, new f[0], a.f71995a);

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71995a = new a();

        /* renamed from: lh.k$a$a  reason: collision with other inner class name */
        static final class C1036a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1036a f71996a = new C1036a();

            C1036a() {
                super(0);
            }

            /* renamed from: a */
            public final f invoke() {
                return y.f72019a.getDescriptor();
            }
        }

        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f71997a = new b();

            b() {
                super(0);
            }

            /* renamed from: a */
            public final f invoke() {
                return u.f72010a.getDescriptor();
            }
        }

        static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f71998a = new c();

            c() {
                super(0);
            }

            /* renamed from: a */
            public final f invoke() {
                return q.f72005a.getDescriptor();
            }
        }

        static final class d extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f71999a = new d();

            d() {
                super(0);
            }

            /* renamed from: a */
            public final f invoke() {
                return w.f72014a.getDescriptor();
            }
        }

        static final class e extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f72000a = new e();

            e() {
                super(0);
            }

            /* renamed from: a */
            public final f invoke() {
                return C6540d.f71956a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C6000a) obj);
            return C6514M.f71813a;
        }

        public final void invoke(C6000a aVar) {
            C6496s.h(aVar, "$this$buildSerialDescriptor");
            C6000a aVar2 = aVar;
            C6000a.b(aVar2, "JsonPrimitive", l.f(C1036a.f71996a), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "JsonNull", l.f(b.f71997a), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "JsonLiteral", l.f(c.f71998a), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "JsonObject", l.f(d.f71999a), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "JsonArray", l.f(e.f72000a), (List) null, false, 12, (Object) null);
        }
    }

    private k() {
    }

    /* renamed from: a */
    public i deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return l.d(eVar).g();
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, i iVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(iVar, "value");
        l.h(fVar);
        if (iVar instanceof x) {
            fVar.m(y.f72019a, iVar);
        } else if (iVar instanceof v) {
            fVar.m(w.f72014a, iVar);
        } else if (iVar instanceof C6539c) {
            fVar.m(C6540d.f71956a, iVar);
        }
    }

    public f getDescriptor() {
        return f71994b;
    }
}
