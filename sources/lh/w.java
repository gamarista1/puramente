package lh;

import gh.C5978b;
import hh.C5998a;
import ih.f;
import ih.j;
import java.util.List;
import java.util.Map;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;

public final class w implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final w f72014a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static final f f72015b = a.f72016b;

    private static final class a implements f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f72016b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f72017c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ f f72018a = C5998a.k(C5998a.E(U.f71764a), k.f71993a).getDescriptor();

        private a() {
        }

        public boolean b() {
            return this.f72018a.b();
        }

        public int c(String str) {
            C6496s.h(str, "name");
            return this.f72018a.c(str);
        }

        public int d() {
            return this.f72018a.d();
        }

        public String e(int i10) {
            return this.f72018a.e(i10);
        }

        public List f(int i10) {
            return this.f72018a.f(i10);
        }

        public f g(int i10) {
            return this.f72018a.g(i10);
        }

        public List getAnnotations() {
            return this.f72018a.getAnnotations();
        }

        public j h() {
            return this.f72018a.h();
        }

        public String i() {
            return f72017c;
        }

        public boolean isInline() {
            return this.f72018a.isInline();
        }

        public boolean j(int i10) {
            return this.f72018a.j(i10);
        }
    }

    private w() {
    }

    /* renamed from: a */
    public v deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        l.g(eVar);
        return new v((Map) C5998a.k(C5998a.E(U.f71764a), k.f71993a).deserialize(eVar));
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, v vVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(vVar, "value");
        l.h(fVar);
        C5998a.k(C5998a.E(U.f71764a), k.f71993a).serialize(fVar, vVar);
    }

    public f getDescriptor() {
        return f72015b;
    }
}
