package i5;

import android.content.Context;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import androidx.lifecycle.C1790m;
import com.bumptech.glide.c;
import i5.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o5.l;

final class m {

    /* renamed from: a  reason: collision with root package name */
    final Map f44210a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final o.b f44211b;

    private final class b implements p {

        /* renamed from: a  reason: collision with root package name */
        private final J f44214a;

        b(J j10) {
            this.f44214a = j10;
        }

        private void b(J j10, Set set) {
            List x02 = j10.x0();
            int size = x02.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1769q qVar = (C1769q) x02.get(i10);
                b(qVar.getChildFragmentManager(), set);
                com.bumptech.glide.m a10 = m.this.a(qVar.getLifecycle());
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }

        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f44214a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f44211b = bVar;
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.m a(C1790m mVar) {
        l.b();
        return (com.bumptech.glide.m) this.f44210a.get(mVar);
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.m b(Context context, c cVar, C1790m mVar, J j10, boolean z10) {
        l.b();
        com.bumptech.glide.m a10 = a(mVar);
        if (a10 != null) {
            return a10;
        }
        k kVar = new k(mVar);
        com.bumptech.glide.m a11 = this.f44211b.a(cVar, kVar, new b(j10), context);
        this.f44210a.put(mVar, a11);
        kVar.b(new a(mVar));
        if (z10) {
            a11.onStart();
        }
        return a11;
    }

    class a implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1790m f44212a;

        a(C1790m mVar) {
            this.f44212a = mVar;
        }

        public void onDestroy() {
            m.this.f44210a.remove(this.f44212a);
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }
}
