package u4;

import H4.f;
import android.os.Build;
import java.util.HashSet;

class N {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet f48381a = new HashSet();

    N() {
    }

    public boolean a(M m10, boolean z10) {
        if (!z10) {
            return this.f48381a.remove(m10);
        }
        if (Build.VERSION.SDK_INT >= m10.f48380a) {
            return this.f48381a.add(m10);
        }
        f.c(String.format("%s is not supported pre SDK %d", new Object[]{m10.name(), Integer.valueOf(m10.f48380a)}));
        return false;
    }

    public boolean b(M m10) {
        return this.f48381a.contains(m10);
    }
}
