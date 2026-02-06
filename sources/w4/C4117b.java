package w4;

import H4.l;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w4.b  reason: case insensitive filesystem */
public class C4117b {

    /* renamed from: a  reason: collision with root package name */
    private final List f49010a = new ArrayList();

    /* access modifiers changed from: package-private */
    public void a(u uVar) {
        this.f49010a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f49010a.size() - 1; size >= 0; size--) {
            l.b(path, (u) this.f49010a.get(size));
        }
    }
}
