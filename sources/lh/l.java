package lh;

import ih.f;
import ih.j;
import java.util.List;
import jh.e;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6531o;
import yf.C6787a;

public abstract class l {

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final Lazy f72001a;

        a(C6787a aVar) {
            this.f72001a = C6531o.b(aVar);
        }

        private final f a() {
            return (f) this.f72001a.getValue();
        }

        public boolean b() {
            return f.a.c(this);
        }

        public int c(String str) {
            C6496s.h(str, "name");
            return a().c(str);
        }

        public int d() {
            return a().d();
        }

        public String e(int i10) {
            return a().e(i10);
        }

        public List f(int i10) {
            return a().f(i10);
        }

        public f g(int i10) {
            return a().g(i10);
        }

        public List getAnnotations() {
            return f.a.a(this);
        }

        public j h() {
            return a().h();
        }

        public String i() {
            return a().i();
        }

        public boolean isInline() {
            return f.a.b(this);
        }

        public boolean j(int i10) {
            return a().j(i10);
        }
    }

    public static final h d(e eVar) {
        h hVar;
        C6496s.h(eVar, "<this>");
        if (eVar instanceof h) {
            hVar = (h) eVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + O.b(eVar.getClass()));
    }

    public static final m e(jh.f fVar) {
        m mVar;
        C6496s.h(fVar, "<this>");
        if (fVar instanceof m) {
            mVar = (m) fVar;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + O.b(fVar.getClass()));
    }

    /* access modifiers changed from: private */
    public static final f f(C6787a aVar) {
        return new a(aVar);
    }

    /* access modifiers changed from: private */
    public static final void g(e eVar) {
        d(eVar);
    }

    /* access modifiers changed from: private */
    public static final void h(jh.f fVar) {
        e(fVar);
    }
}
