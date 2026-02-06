package rh;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73443a = a.f73445a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f73444b = new a.C1064a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f73445a = new a();

        /* renamed from: rh.n$a$a  reason: collision with other inner class name */
        private static final class C1064a implements n {
            public List b(v vVar) {
                C6496s.h(vVar, "url");
                return C6565s.n();
            }

            public void d(v vVar, List list) {
                C6496s.h(vVar, "url");
                C6496s.h(list, "cookies");
            }
        }

        private a() {
        }
    }

    List b(v vVar);

    void d(v vVar, List list);
}
