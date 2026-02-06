package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class V extends W {

    class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f16844a;

        a(Rect rect) {
            this.f16844a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f16844a;
        }
    }

    class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f16846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f16847b;

        b(View view, ArrayList arrayList) {
            this.f16846a = view;
            this.f16847b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f16846a.setVisibility(8);
            int size = this.f16847b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f16847b.get(i10)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f16849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f16850b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f16851c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f16852d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f16853e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f16854f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f16849a = obj;
            this.f16850b = arrayList;
            this.f16851c = obj2;
            this.f16852d = arrayList2;
            this.f16853e = obj3;
            this.f16854f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f16849a;
            if (obj != null) {
                V.this.D(obj, this.f16850b, (ArrayList) null);
            }
            Object obj2 = this.f16851c;
            if (obj2 != null) {
                V.this.D(obj2, this.f16852d, (ArrayList) null);
            }
            Object obj3 = this.f16853e;
            if (obj3 != null) {
                V.this.D(obj3, this.f16854f, (ArrayList) null);
            }
        }
    }

    class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f16856a;

        d(Runnable runnable) {
            this.f16856a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f16856a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f16858a;

        e(Rect rect) {
            this.f16858a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f16858a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f16858a;
        }
    }

    V() {
    }

    private static boolean C(Transition transition) {
        if (!W.l(transition.getTargetIds()) || !W.l(transition.getTargetNames()) || !W.l(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            D(transitionSet, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int i10;
        Transition transition = (Transition) obj;
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                D(transitionSet.getTransitionAt(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i10 = 0;
            } else {
                i10 = arrayList2.size();
            }
            while (i11 < i10) {
                transition.addTarget((View) arrayList2.get(i11));
                i11++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget((View) arrayList.get(size));
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i10 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i10 < transitionCount) {
                    b(transitionSet.getTransitionAt(i10), arrayList);
                    i10++;
                }
            } else if (!C(transition) && W.l(transition.getTargets())) {
                int size = arrayList.size();
                while (i10 < size) {
                    transition.addTarget((View) arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean g(Object obj) {
        return obj instanceof Transition;
    }

    public Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public boolean m() {
        if (!J.L0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(Object obj) {
        if (!J.L0(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public Object o(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object p(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public void r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    public void w(C1769q qVar, Object obj, u1.d dVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    public void z(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            W.f(targets, (View) arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }
}
