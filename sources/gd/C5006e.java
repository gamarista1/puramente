package gd;

import gh.C5977a;
import gh.C5978b;
import gh.C5984h;
import gh.C5987k;
import gh.C5988l;
import gh.C5991o;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.D;
import rh.F;
import rh.y;

/* renamed from: gd.e  reason: case insensitive filesystem */
public abstract class C5006e {

    /* renamed from: gd.e$a */
    public static final class a extends C5006e {

        /* renamed from: a  reason: collision with root package name */
        private final C5991o f60631a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5991o oVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(oVar, "format");
            this.f60631a = oVar;
        }

        public Object a(C5977a aVar, F f10) {
            C6496s.h(aVar, "loader");
            C6496s.h(f10, "body");
            String E10 = f10.E();
            C6496s.g(E10, "body.string()");
            return b().b(aVar, E10);
        }

        public D d(y yVar, C5987k kVar, Object obj) {
            C6496s.h(yVar, "contentType");
            C6496s.h(kVar, "saver");
            D create = D.create(yVar, b().c(kVar, obj));
            C6496s.g(create, "create(contentType, string)");
            return create;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C5991o b() {
            return this.f60631a;
        }
    }

    public /* synthetic */ C5006e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a(C5977a aVar, F f10);

    /* access modifiers changed from: protected */
    public abstract C5984h b();

    public final C5978b c(Type type) {
        C6496s.h(type, "type");
        return C5988l.b(b().a(), type);
    }

    public abstract D d(y yVar, C5987k kVar, Object obj);

    private C5006e() {
    }
}
