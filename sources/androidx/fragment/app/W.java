package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1680b0;
import androidx.core.view.L;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u1.d;

public abstract class W {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f16860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f16861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f16862c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f16863d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f16864e;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f16860a = i10;
            this.f16861b = arrayList;
            this.f16862c = arrayList2;
            this.f16863d = arrayList3;
            this.f16864e = arrayList4;
        }

        public void run() {
            for (int i10 = 0; i10 < this.f16860a; i10++) {
                C1680b0.H0((View) this.f16861b.get(i10), (String) this.f16862c.get(i10));
                C1680b0.H0((View) this.f16863d.get(i10), (String) this.f16864e.get(i10));
            }
        }
    }

    protected static void f(List list, View view) {
        int size = list.size();
        if (!i(list, view, size)) {
            if (C1680b0.J(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (!i(list, childAt, size) && C1680b0.J(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean i(List list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean l(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        if (!J.L0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            arrayList2.add(C1680b0.J(view));
            C1680b0.H0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public void t(Object obj, float f10) {
    }

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(C1769q qVar, Object obj, d dVar, Runnable runnable) {
        x(qVar, obj, dVar, (Runnable) null, runnable);
    }

    public void x(C1769q qVar, Object obj, d dVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    /* access modifiers changed from: package-private */
    public void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList.get(i10);
            String J10 = C1680b0.J(view2);
            arrayList4.add(J10);
            if (J10 != null) {
                C1680b0.H0(view2, (String) null);
                String str = (String) map.get(J10);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        C1680b0.H0((View) arrayList2.get(i11), J10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        L.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
