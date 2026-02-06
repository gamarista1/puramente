package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.C6672e;

/* renamed from: retrofit2.c  reason: case insensitive filesystem */
class C6670c {

    /* renamed from: retrofit2.c$a */
    static final class a extends C6670c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public List a(Executor executor) {
            return Arrays.asList(new C6672e.a[]{new C6674g(), new C6676i(executor)});
        }

        /* access modifiers changed from: package-private */
        public List b() {
            return Collections.singletonList(new w());
        }
    }

    C6670c() {
    }

    /* access modifiers changed from: package-private */
    public List a(Executor executor) {
        return Collections.singletonList(new C6676i(executor));
    }

    /* access modifiers changed from: package-private */
    public List b() {
        return Collections.emptyList();
    }
}
