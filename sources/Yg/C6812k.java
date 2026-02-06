package yg;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.Y;
import ng.f;
import yf.C6798l;

/* renamed from: yg.k  reason: case insensitive filesystem */
public interface C6812k extends C6815n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73946a = a.f73947a;

    /* renamed from: yg.k$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f73947a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C6798l f73948b = C6811j.f73945a;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean a(f fVar) {
            C6496s.h(fVar, "it");
            return true;
        }

        public final C6798l c() {
            return f73948b;
        }
    }

    /* renamed from: yg.k$b */
    public static final class b extends C6813l {

        /* renamed from: b  reason: collision with root package name */
        public static final b f73949b = new b();

        private b() {
        }

        public Set a() {
            return Y.e();
        }

        public Set d() {
            return Y.e();
        }

        public Set g() {
            return Y.e();
        }
    }

    Set a();

    Collection b(f fVar, Wf.b bVar);

    Collection c(f fVar, Wf.b bVar);

    Set d();

    Set g();
}
