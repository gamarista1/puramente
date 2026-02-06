package a7;

import T5.k;
import c7.m;
import c7.n;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.List;

public class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f36143a;

    private static class a implements b {
        public List a() {
            return Collections.EMPTY_LIST;
        }

        public int b() {
            return 0;
        }

        private a() {
        }
    }

    public interface b {
        List a();

        int b();
    }

    public h() {
        this(new a());
    }

    public int a(int i10) {
        List a10 = this.f36143a.a();
        if (a10 == null || a10.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < a10.size(); i11++) {
            if (((Integer) a10.get(i11)).intValue() > i10) {
                return ((Integer) a10.get(i11)).intValue();
            }
        }
        return a.e.API_PRIORITY_OTHER;
    }

    public n b(int i10) {
        boolean z10;
        if (i10 >= this.f36143a.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return m.d(i10, z10, false);
    }

    public boolean c() {
        return true;
    }

    public h(b bVar) {
        this.f36143a = (b) k.g(bVar);
    }
}
