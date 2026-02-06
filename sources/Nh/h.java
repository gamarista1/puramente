package nh;

import Ff.d;
import gh.C5978b;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public interface h {

    public static final class a {

        /* renamed from: nh.h$a$a  reason: collision with other inner class name */
        static final class C1044a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5978b f72433a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1044a(C5978b bVar) {
                super(1);
                this.f72433a = bVar;
            }

            /* renamed from: a */
            public final C5978b invoke(List list) {
                C6496s.h(list, "it");
                return this.f72433a;
            }
        }

        public static void a(h hVar, d dVar, C5978b bVar) {
            C6496s.h(dVar, "kClass");
            C6496s.h(bVar, "serializer");
            hVar.b(dVar, new C1044a(bVar));
        }
    }

    void a(d dVar, C5978b bVar);

    void b(d dVar, C6798l lVar);

    void c(d dVar, d dVar2, C5978b bVar);

    void d(d dVar, C6798l lVar);

    void e(d dVar, C6798l lVar);
}
