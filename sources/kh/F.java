package kh;

import gh.C5978b;
import ih.f;
import jh.e;
import kh.D;
import kotlin.jvm.internal.C6496s;

public abstract class F {

    public static final class a implements D {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5978b f71595a;

        a(C5978b bVar) {
            this.f71595a = bVar;
        }

        public C5978b[] childSerializers() {
            return new C5978b[]{this.f71595a};
        }

        public Object deserialize(e eVar) {
            C6496s.h(eVar, "decoder");
            throw new IllegalStateException("unsupported");
        }

        public f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        public void serialize(jh.f fVar, Object obj) {
            C6496s.h(fVar, "encoder");
            throw new IllegalStateException("unsupported");
        }

        public C5978b[] typeParametersSerializers() {
            return D.a.a(this);
        }
    }

    public static final f a(String str, C5978b bVar) {
        C6496s.h(str, "name");
        C6496s.h(bVar, "primitiveSerializer");
        return new E(str, new a(bVar));
    }
}
