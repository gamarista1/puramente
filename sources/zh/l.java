package zh;

import Gh.C5406g;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74202a = a.f74204a;

    /* renamed from: b  reason: collision with root package name */
    public static final l f74203b = new a.C1082a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f74204a = new a();

        /* renamed from: zh.l$a$a  reason: collision with other inner class name */
        private static final class C1082a implements l {
            public boolean a(int i10, C5406g gVar, int i11, boolean z10) {
                C6496s.h(gVar, "source");
                gVar.skip((long) i11);
                return true;
            }

            public boolean b(int i10, List list) {
                C6496s.h(list, "requestHeaders");
                return true;
            }

            public boolean c(int i10, List list, boolean z10) {
                C6496s.h(list, "responseHeaders");
                return true;
            }

            public void d(int i10, C6844b bVar) {
                C6496s.h(bVar, "errorCode");
            }
        }

        private a() {
        }
    }

    boolean a(int i10, C5406g gVar, int i11, boolean z10);

    boolean b(int i10, List list);

    boolean c(int i10, List list, boolean z10);

    void d(int i10, C6844b bVar);
}
