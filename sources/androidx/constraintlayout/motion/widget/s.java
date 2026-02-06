package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final MotionLayout f14822a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f14823b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private HashSet f14824c;

    /* renamed from: d  reason: collision with root package name */
    private String f14825d = "ViewTransitionController";

    /* renamed from: e  reason: collision with root package name */
    ArrayList f14826e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList f14827f = new ArrayList();

    class a implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f14828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f14830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14831d;

        a(r rVar, int i10, boolean z10, int i11) {
            this.f14828a = rVar;
            this.f14829b = i10;
            this.f14830c = z10;
            this.f14831d = i11;
        }
    }

    public s(MotionLayout motionLayout) {
        this.f14822a = motionLayout;
    }

    private void e(r rVar, boolean z10) {
        ConstraintLayout.getSharedValues().a(rVar.h(), new a(rVar, rVar.h(), z10, rVar.g()));
    }

    private void i(r rVar, View... viewArr) {
        int currentState = this.f14822a.getCurrentState();
        if (rVar.f14787e == 2) {
            rVar.c(this, this.f14822a, currentState, (d) null, viewArr);
        } else if (currentState == -1) {
            String str = this.f14825d;
            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.f14822a.toString());
        } else {
            d o02 = this.f14822a.o0(currentState);
            if (o02 != null) {
                rVar.c(this, this.f14822a, currentState, o02, viewArr);
            }
        }
    }

    public void a(r rVar) {
        this.f14823b.add(rVar);
        this.f14824c = null;
        if (rVar.i() == 4) {
            e(rVar, true);
        } else if (rVar.i() == 5) {
            e(rVar, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(r.b bVar) {
        if (this.f14826e == null) {
            this.f14826e = new ArrayList();
        }
        this.f14826e.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        ArrayList arrayList = this.f14826e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((r.b) it.next()).a();
            }
            this.f14826e.removeAll(this.f14827f);
            this.f14827f.clear();
            if (this.f14826e.isEmpty()) {
                this.f14826e = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f14822a.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void f(r.b bVar) {
        this.f14827f.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void g(MotionEvent motionEvent) {
        int currentState = this.f14822a.getCurrentState();
        if (currentState != -1) {
            if (this.f14824c == null) {
                this.f14824c = new HashSet();
                Iterator it = this.f14823b.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    int childCount = this.f14822a.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f14822a.getChildAt(i10);
                        if (rVar.k(childAt)) {
                            childAt.getId();
                            this.f14824c.add(childAt);
                        }
                    }
                }
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList arrayList = this.f14826e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it2 = this.f14826e.iterator();
                while (it2.hasNext()) {
                    ((r.b) it2.next()).d(action, x10, y10);
                }
            }
            if (action == 0 || action == 1) {
                d o02 = this.f14822a.o0(currentState);
                Iterator it3 = this.f14823b.iterator();
                while (it3.hasNext()) {
                    r rVar2 = (r) it3.next();
                    if (rVar2.m(action)) {
                        Iterator it4 = this.f14824c.iterator();
                        while (it4.hasNext()) {
                            View view = (View) it4.next();
                            if (rVar2.k(view)) {
                                view.getHitRect(rect);
                                if (rect.contains((int) x10, (int) y10)) {
                                    View[] viewArr = {view};
                                    rVar2.c(this, this.f14822a, currentState, o02, viewArr);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(int i10, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14823b.iterator();
        r rVar = null;
        while (it.hasNext()) {
            r rVar2 = (r) it.next();
            if (rVar2.e() == i10) {
                for (View view : viewArr) {
                    if (rVar2.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i(rVar2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                rVar = rVar2;
            }
        }
        if (rVar == null) {
            Log.e(this.f14825d, " Could not find ViewTransition");
        }
    }
}
