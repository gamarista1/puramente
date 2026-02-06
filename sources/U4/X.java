package u4;

import H4.j;
import android.support.v4.media.session.c;
import androidx.collection.C1588b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import x1.d;

public class X {

    /* renamed from: a  reason: collision with root package name */
    private boolean f48439a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Set f48440b = new C1588b();

    /* renamed from: c  reason: collision with root package name */
    private final Map f48441c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Comparator f48442d = new a();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            float floatValue = ((Float) dVar.f28214b).floatValue();
            float floatValue2 = ((Float) dVar2.f28214b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    public void a(String str, float f10) {
        if (this.f48439a) {
            j jVar = (j) this.f48441c.get(str);
            if (jVar == null) {
                jVar = new j();
                this.f48441c.put(str, jVar);
            }
            jVar.a(f10);
            if (str.equals("__container")) {
                Iterator it = this.f48440b.iterator();
                if (it.hasNext()) {
                    c.a(it.next());
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10) {
        this.f48439a = z10;
    }
}
