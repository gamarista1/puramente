package If;

import Dg.C5352m;
import Dg.C5357s;
import If.C5451n;
import Of.C5495m;
import Of.C5501t;
import Of.N;
import Of.Z;
import Uf.C5553f;
import Xf.H;
import gg.C5968r;
import ig.n;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kg.C6436c;
import kg.e;
import kg.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C6536a;
import mg.C6576d;
import mg.C6581i;
import pg.C6647i;

/* renamed from: If.p  reason: case insensitive filesystem */
public abstract class C5455p {

    /* renamed from: If.p$a */
    public static final class a extends C5455p {

        /* renamed from: a  reason: collision with root package name */
        private final Field f63720a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super((DefaultConstructorMarker) null);
            C6496s.h(field, "field");
            this.f63720a = field;
        }

        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f63720a.getName();
            C6496s.g(name, "getName(...)");
            sb2.append(H.b(name));
            sb2.append("()");
            Class<?> type = this.f63720a.getType();
            C6496s.g(type, "getType(...)");
            sb2.append(C5553f.f(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f63720a;
        }
    }

    /* renamed from: If.p$b */
    public static final class b extends C5455p {

        /* renamed from: a  reason: collision with root package name */
        private final Method f63721a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f63722b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(method, "getterMethod");
            this.f63721a = method;
            this.f63722b = method2;
        }

        public String a() {
            return h1.d(this.f63721a);
        }

        public final Method b() {
            return this.f63721a;
        }

        public final Method c() {
            return this.f63722b;
        }
    }

    /* renamed from: If.p$c */
    public static final class c extends C5455p {

        /* renamed from: a  reason: collision with root package name */
        private final Z f63723a;

        /* renamed from: b  reason: collision with root package name */
        private final n f63724b;

        /* renamed from: c  reason: collision with root package name */
        private final C6536a.d f63725c;

        /* renamed from: d  reason: collision with root package name */
        private final C6436c f63726d;

        /* renamed from: e  reason: collision with root package name */
        private final g f63727e;

        /* renamed from: f  reason: collision with root package name */
        private final String f63728f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Z z10, n nVar, C6536a.d dVar, C6436c cVar, g gVar) {
            super((DefaultConstructorMarker) null);
            String str;
            C6496s.h(z10, "descriptor");
            C6496s.h(nVar, "proto");
            C6496s.h(dVar, "signature");
            C6496s.h(cVar, "nameResolver");
            C6496s.h(gVar, "typeTable");
            this.f63723a = z10;
            this.f63724b = nVar;
            this.f63725c = dVar;
            this.f63726d = cVar;
            this.f63727e = gVar;
            if (dVar.G()) {
                str = cVar.getString(dVar.B().x()) + cVar.getString(dVar.B().w());
            } else {
                C6576d.a d10 = C6581i.d(C6581i.f72110a, nVar, cVar, gVar, false, 8, (Object) null);
                if (d10 != null) {
                    String b10 = d10.b();
                    str = H.b(b10) + c() + "()" + d10.c();
                } else {
                    throw new Y0("No field signature for property: " + z10);
                }
            }
            this.f63728f = str;
        }

        private final String c() {
            String str;
            C5495m b10 = this.f63723a.b();
            C6496s.g(b10, "getContainingDeclaration(...)");
            if (C6496s.c(this.f63723a.getVisibility(), C5501t.f64508d) && (b10 instanceof C5352m)) {
                ig.c e12 = ((C5352m) b10).e1();
                C6647i.f fVar = C6536a.f71863i;
                C6496s.g(fVar, "classModuleName");
                Integer num = (Integer) e.a(e12, fVar);
                if (num == null || (str = this.f63726d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + ng.g.b(str);
            } else if (!C6496s.c(this.f63723a.getVisibility(), C5501t.f64505a) || !(b10 instanceof N)) {
                return "";
            } else {
                Z z10 = this.f63723a;
                C6496s.f(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                C5357s L10 = ((Dg.N) z10).L();
                if (!(L10 instanceof C5968r)) {
                    return "";
                }
                C5968r rVar = (C5968r) L10;
                if (rVar.f() == null) {
                    return "";
                }
                return '$' + rVar.h().b();
            }
        }

        public String a() {
            return this.f63728f;
        }

        public final Z b() {
            return this.f63723a;
        }

        public final C6436c d() {
            return this.f63726d;
        }

        public final n e() {
            return this.f63724b;
        }

        public final C6536a.d f() {
            return this.f63725c;
        }

        public final g g() {
            return this.f63727e;
        }
    }

    /* renamed from: If.p$d */
    public static final class d extends C5455p {

        /* renamed from: a  reason: collision with root package name */
        private final C5451n.e f63729a;

        /* renamed from: b  reason: collision with root package name */
        private final C5451n.e f63730b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5451n.e eVar, C5451n.e eVar2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(eVar, "getterSignature");
            this.f63729a = eVar;
            this.f63730b = eVar2;
        }

        public String a() {
            return this.f63729a.a();
        }

        public final C5451n.e b() {
            return this.f63729a;
        }

        public final C5451n.e c() {
            return this.f63730b;
        }
    }

    public /* synthetic */ C5455p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private C5455p() {
    }
}
