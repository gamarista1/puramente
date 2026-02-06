package androidx.compose.ui.focus;

import k0.i;
import kotlin.jvm.internal.C6491m;
import kotlin.jvm.internal.C6496s;
import lf.C6525i;
import p0.j;
import yf.C6798l;

public abstract class m {

    static final class a implements j, C6491m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C6798l f13343a;

        a(C6798l lVar) {
            this.f13343a = lVar;
        }

        public final /* synthetic */ void a(k kVar) {
            this.f13343a.invoke(kVar);
        }

        public final C6525i d() {
            return this.f13343a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof j) || !(obj instanceof C6491m)) {
                return false;
            }
            return C6496s.c(d(), ((C6491m) obj).d());
        }

        public final int hashCode() {
            return d().hashCode();
        }
    }

    public static final i a(i iVar, C6798l lVar) {
        return iVar.h(new FocusPropertiesElement(new a(lVar)));
    }
}
