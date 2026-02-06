package i5;

import android.util.Log;
import com.bumptech.glide.request.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import o5.l;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Set f44222a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Set f44223b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f44224c;

    public boolean a(d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f44222a.remove(dVar);
        if (!this.f44223b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        for (d a10 : l.k(this.f44222a)) {
            a(a10);
        }
        this.f44223b.clear();
    }

    public boolean c() {
        return this.f44224c;
    }

    public void d() {
        this.f44224c = true;
        for (d dVar : l.k(this.f44222a)) {
            if (dVar.isRunning() || dVar.g()) {
                dVar.clear();
                this.f44223b.add(dVar);
            }
        }
    }

    public void e() {
        this.f44224c = true;
        for (d dVar : l.k(this.f44222a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                this.f44223b.add(dVar);
            }
        }
    }

    public void f() {
        for (d dVar : l.k(this.f44222a)) {
            if (!dVar.g() && !dVar.e()) {
                dVar.clear();
                if (!this.f44224c) {
                    dVar.i();
                } else {
                    this.f44223b.add(dVar);
                }
            }
        }
    }

    public void g() {
        this.f44224c = false;
        for (d dVar : l.k(this.f44222a)) {
            if (!dVar.g() && !dVar.isRunning()) {
                dVar.i();
            }
        }
        this.f44223b.clear();
    }

    public void h(d dVar) {
        this.f44222a.add(dVar);
        if (!this.f44224c) {
            dVar.i();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f44223b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f44222a.size() + ", isPaused=" + this.f44224c + "}";
    }
}
