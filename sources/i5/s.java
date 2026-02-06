package i5;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l5.j;
import o5.l;

public final class s implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Set f44239a = Collections.newSetFromMap(new WeakHashMap());

    public void e() {
        this.f44239a.clear();
    }

    public List j() {
        return l.k(this.f44239a);
    }

    public void k(j jVar) {
        this.f44239a.add(jVar);
    }

    public void l(j jVar) {
        this.f44239a.remove(jVar);
    }

    public void onDestroy() {
        for (j onDestroy : l.k(this.f44239a)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (j onStart : l.k(this.f44239a)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (j onStop : l.k(this.f44239a)) {
            onStop.onStop();
        }
    }
}
