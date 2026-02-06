package n6;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final List f46922a = new ArrayList(2);

    private synchronized void d(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    public void a(String str, Object obj) {
        int size = this.f46922a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f46922a.get(i10);
                if (dVar != null) {
                    dVar.a(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    public synchronized void b(d dVar) {
        this.f46922a.add(dVar);
    }

    public synchronized void c() {
        this.f46922a.clear();
    }

    public synchronized void f(String str, Throwable th2) {
        int size = this.f46922a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f46922a.get(i10);
                if (dVar != null) {
                    dVar.f(str, th2);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFailure", e10);
            }
        }
    }

    public synchronized void h(String str) {
        int size = this.f46922a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f46922a.get(i10);
                if (dVar != null) {
                    dVar.h(str);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onRelease", e10);
            }
        }
    }

    public synchronized void n(String str, Object obj, Animatable animatable) {
        int size = this.f46922a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f46922a.get(i10);
                if (dVar != null) {
                    dVar.n(str, obj, animatable);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    public synchronized void r(String str, Object obj) {
        int size = this.f46922a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f46922a.get(i10);
                if (dVar != null) {
                    dVar.r(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onSubmit", e10);
            }
        }
    }

    public void s(String str, Throwable th2) {
        int size = this.f46922a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f46922a.get(i10);
                if (dVar != null) {
                    dVar.s(str, th2);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }
}
