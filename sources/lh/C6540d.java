package lh;

import gh.C5978b;
import hh.C5998a;
import ih.f;
import ih.j;
import java.util.List;
import jh.e;
import kotlin.jvm.internal.C6496s;

/* renamed from: lh.d  reason: case insensitive filesystem */
public final class C6540d implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6540d f71956a = new C6540d();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71957b = a.f71958b;

    /* renamed from: lh.d$a */
    private static final class a implements f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f71958b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f71959c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ f f71960a = C5998a.h(k.f71993a).getDescriptor();

        private a() {
        }

        public boolean b() {
            return this.f71960a.b();
        }

        public int c(String str) {
            C6496s.h(str, "name");
            return this.f71960a.c(str);
        }

        public int d() {
            return this.f71960a.d();
        }

        public String e(int i10) {
            return this.f71960a.e(i10);
        }

        public List f(int i10) {
            return this.f71960a.f(i10);
        }

        public f g(int i10) {
            return this.f71960a.g(i10);
        }

        public List getAnnotations() {
            return this.f71960a.getAnnotations();
        }

        public j h() {
            return this.f71960a.h();
        }

        public String i() {
            return f71959c;
        }

        public boolean isInline() {
            return this.f71960a.isInline();
        }

        public boolean j(int i10) {
            return this.f71960a.j(i10);
        }
    }

    private C6540d() {
    }

    /* renamed from: a */
    public C6539c deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        l.g(eVar);
        return new C6539c((List) C5998a.h(k.f71993a).deserialize(eVar));
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, C6539c cVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(cVar, "value");
        l.h(fVar);
        C5998a.h(k.f71993a).serialize(fVar, cVar);
    }

    public f getDescriptor() {
        return f71957b;
    }
}
