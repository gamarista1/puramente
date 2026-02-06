package E3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C1587a;
import androidx.core.view.C1680b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: E3.n  reason: case insensitive filesystem */
public abstract class C1164n {

    /* renamed from: a  reason: collision with root package name */
    private static C1162l f1891a = new C1152b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal f1892b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList f1893c = new ArrayList();

    public static void a(ViewGroup viewGroup, C1162l lVar) {
        if (!f1893c.contains(viewGroup) && C1680b0.S(viewGroup)) {
            f1893c.add(viewGroup);
            if (lVar == null) {
                lVar = f1891a;
            }
            C1162l o10 = lVar.clone();
            d(viewGroup, o10);
            C1161k.b(viewGroup, (C1161k) null);
            c(viewGroup, o10);
        }
    }

    static C1587a b() {
        C1587a aVar;
        WeakReference weakReference = (WeakReference) f1892b.get();
        if (weakReference != null && (aVar = (C1587a) weakReference.get()) != null) {
            return aVar;
        }
        C1587a aVar2 = new C1587a();
        f1892b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, C1162l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, C1162l lVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1162l) it.next()).Q(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.l(viewGroup, true);
        }
        C1161k.a(viewGroup);
    }

    /* renamed from: E3.n$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        C1162l f1894a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f1895b;

        /* renamed from: E3.n$a$a  reason: collision with other inner class name */
        class C0032a extends C1163m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1587a f1896a;

            C0032a(C1587a aVar) {
                this.f1896a = aVar;
            }

            public void d(C1162l lVar) {
                ((ArrayList) this.f1896a.get(a.this.f1895b)).remove(lVar);
                lVar.S(this);
            }
        }

        a(C1162l lVar, ViewGroup viewGroup) {
            this.f1894a = lVar;
            this.f1895b = viewGroup;
        }

        private void a() {
            this.f1895b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1895b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!C1164n.f1893c.remove(this.f1895b)) {
                return true;
            }
            C1587a b10 = C1164n.b();
            ArrayList arrayList = (ArrayList) b10.get(this.f1895b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b10.put(this.f1895b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1894a);
            this.f1894a.a(new C0032a(b10));
            this.f1894a.l(this.f1895b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C1162l) it.next()).U(this.f1895b);
                }
            }
            this.f1894a.R(this.f1895b);
            return true;
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            C1164n.f1893c.remove(this.f1895b);
            ArrayList arrayList = (ArrayList) C1164n.b().get(this.f1895b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1162l) it.next()).U(this.f1895b);
                }
            }
            this.f1894a.m(true);
        }

        public void onViewAttachedToWindow(View view) {
        }
    }
}
