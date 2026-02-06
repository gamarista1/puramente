package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C1680b0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends m {

    /* renamed from: s  reason: collision with root package name */
    private static TimeInterpolator f18227s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f18228h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f18229i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f18230j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f18231k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    ArrayList f18232l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    ArrayList f18233m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    ArrayList f18234n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    ArrayList f18235o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    ArrayList f18236p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    ArrayList f18237q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    ArrayList f18238r = new ArrayList();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f18239a;

        a(ArrayList arrayList) {
            this.f18239a = arrayList;
        }

        public void run() {
            Iterator it = this.f18239a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f18273a, jVar.f18274b, jVar.f18275c, jVar.f18276d, jVar.f18277e);
            }
            this.f18239a.clear();
            c.this.f18233m.remove(this.f18239a);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f18241a;

        b(ArrayList arrayList) {
            this.f18241a = arrayList;
        }

        public void run() {
            Iterator it = this.f18241a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f18241a.clear();
            c.this.f18234n.remove(this.f18241a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    class C0314c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f18243a;

        C0314c(ArrayList arrayList) {
            this.f18243a = arrayList;
        }

        public void run() {
            Iterator it = this.f18243a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.F) it.next());
            }
            this.f18243a.clear();
            c.this.f18232l.remove(this.f18243a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f18247c;

        d(RecyclerView.F f10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18245a = f10;
            this.f18246b = viewPropertyAnimator;
            this.f18247c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18246b.setListener((Animator.AnimatorListener) null);
            this.f18247c.setAlpha(1.0f);
            c.this.G(this.f18245a);
            c.this.f18237q.remove(this.f18245a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.f18245a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f18250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18251c;

        e(RecyclerView.F f10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f18249a = f10;
            this.f18250b = view;
            this.f18251c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18250b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f18251c.setListener((Animator.AnimatorListener) null);
            c.this.A(this.f18249a);
            c.this.f18235o.remove(this.f18249a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.f18249a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f18254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f18255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18256d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18257e;

        f(RecyclerView.F f10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f18253a = f10;
            this.f18254b = i10;
            this.f18255c = view;
            this.f18256d = i11;
            this.f18257e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f18254b != 0) {
                this.f18255c.setTranslationX(0.0f);
            }
            if (this.f18256d != 0) {
                this.f18255c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f18257e.setListener((Animator.AnimatorListener) null);
            c.this.E(this.f18253a);
            c.this.f18236p.remove(this.f18253a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.f18253a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f18259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f18261c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18259a = iVar;
            this.f18260b = viewPropertyAnimator;
            this.f18261c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18260b.setListener((Animator.AnimatorListener) null);
            this.f18261c.setAlpha(1.0f);
            this.f18261c.setTranslationX(0.0f);
            this.f18261c.setTranslationY(0.0f);
            c.this.C(this.f18259a.f18267a, true);
            c.this.f18238r.remove(this.f18259a.f18267a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f18259a.f18267a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f18263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18264b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f18265c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18263a = iVar;
            this.f18264b = viewPropertyAnimator;
            this.f18265c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18264b.setListener((Animator.AnimatorListener) null);
            this.f18265c.setAlpha(1.0f);
            this.f18265c.setTranslationX(0.0f);
            this.f18265c.setTranslationY(0.0f);
            c.this.C(this.f18263a.f18268b, false);
            c.this.f18238r.remove(this.f18263a.f18268b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f18263a.f18268b, false);
        }
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.F f18273a;

        /* renamed from: b  reason: collision with root package name */
        public int f18274b;

        /* renamed from: c  reason: collision with root package name */
        public int f18275c;

        /* renamed from: d  reason: collision with root package name */
        public int f18276d;

        /* renamed from: e  reason: collision with root package name */
        public int f18277e;

        j(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
            this.f18273a = f10;
            this.f18274b = i10;
            this.f18275c = i11;
            this.f18276d = i12;
            this.f18277e = i13;
        }
    }

    private void T(RecyclerView.F f10) {
        View view = f10.f18066a;
        ViewPropertyAnimator animate = view.animate();
        this.f18237q.add(f10);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(f10, animate, view)).start();
    }

    private void W(List list, RecyclerView.F f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, f10) && iVar.f18267a == null && iVar.f18268b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.F f10 = iVar.f18267a;
        if (f10 != null) {
            Y(iVar, f10);
        }
        RecyclerView.F f11 = iVar.f18268b;
        if (f11 != null) {
            Y(iVar, f11);
        }
    }

    private boolean Y(i iVar, RecyclerView.F f10) {
        boolean z10 = false;
        if (iVar.f18268b == f10) {
            iVar.f18268b = null;
        } else if (iVar.f18267a != f10) {
            return false;
        } else {
            iVar.f18267a = null;
            z10 = true;
        }
        f10.f18066a.setAlpha(1.0f);
        f10.f18066a.setTranslationX(0.0f);
        f10.f18066a.setTranslationY(0.0f);
        C(f10, z10);
        return true;
    }

    private void Z(RecyclerView.F f10) {
        if (f18227s == null) {
            f18227s = new ValueAnimator().getInterpolator();
        }
        f10.f18066a.animate().setInterpolator(f18227s);
        j(f10);
    }

    /* access modifiers changed from: package-private */
    public void Q(RecyclerView.F f10) {
        View view = f10.f18066a;
        ViewPropertyAnimator animate = view.animate();
        this.f18235o.add(f10);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(f10, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void R(i iVar) {
        View view;
        RecyclerView.F f10 = iVar.f18267a;
        View view2 = null;
        if (f10 == null) {
            view = null;
        } else {
            view = f10.f18066a;
        }
        RecyclerView.F f11 = iVar.f18268b;
        if (f11 != null) {
            view2 = f11.f18066a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f18238r.add(iVar.f18267a);
            duration.translationX((float) (iVar.f18271e - iVar.f18269c));
            duration.translationY((float) (iVar.f18272f - iVar.f18270d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f18238r.add(iVar.f18268b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.f18066a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f18236p.add(f10);
        animate.setDuration(n()).setListener(new f(f10, i14, view, i15, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.F) list.get(size)).f18066a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.F f10, List list) {
        if (!list.isEmpty() || super.g(f10, list)) {
            return true;
        }
        return false;
    }

    public void j(RecyclerView.F f10) {
        View view = f10.f18066a;
        view.animate().cancel();
        int size = this.f18230j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) this.f18230j.get(size)).f18273a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f10);
                this.f18230j.remove(size);
            }
        }
        W(this.f18231k, f10);
        if (this.f18228h.remove(f10)) {
            view.setAlpha(1.0f);
            G(f10);
        }
        if (this.f18229i.remove(f10)) {
            view.setAlpha(1.0f);
            A(f10);
        }
        for (int size2 = this.f18234n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f18234n.get(size2);
            W(arrayList, f10);
            if (arrayList.isEmpty()) {
                this.f18234n.remove(size2);
            }
        }
        for (int size3 = this.f18233m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f18233m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f18273a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f18233m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f18232l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f18232l.get(size5);
            if (arrayList3.remove(f10)) {
                view.setAlpha(1.0f);
                A(f10);
                if (arrayList3.isEmpty()) {
                    this.f18232l.remove(size5);
                }
            }
        }
        this.f18237q.remove(f10);
        this.f18235o.remove(f10);
        this.f18238r.remove(f10);
        this.f18236p.remove(f10);
        V();
    }

    public void k() {
        int size = this.f18230j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f18230j.get(size);
            View view = jVar.f18273a.f18066a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f18273a);
            this.f18230j.remove(size);
        }
        for (int size2 = this.f18228h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.F) this.f18228h.get(size2));
            this.f18228h.remove(size2);
        }
        int size3 = this.f18229i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = (RecyclerView.F) this.f18229i.get(size3);
            f10.f18066a.setAlpha(1.0f);
            A(f10);
            this.f18229i.remove(size3);
        }
        for (int size4 = this.f18231k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f18231k.get(size4));
        }
        this.f18231k.clear();
        if (p()) {
            for (int size5 = this.f18233m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f18233m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f18273a.f18066a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f18273a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f18233m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f18232l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f18232l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f11 = (RecyclerView.F) arrayList2.get(size8);
                    f11.f18066a.setAlpha(1.0f);
                    A(f11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f18232l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f18234n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f18234n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f18234n.remove(arrayList3);
                    }
                }
            }
            U(this.f18237q);
            U(this.f18236p);
            U(this.f18235o);
            U(this.f18238r);
            i();
        }
    }

    public boolean p() {
        if (!this.f18229i.isEmpty() || !this.f18231k.isEmpty() || !this.f18230j.isEmpty() || !this.f18228h.isEmpty() || !this.f18236p.isEmpty() || !this.f18237q.isEmpty() || !this.f18235o.isEmpty() || !this.f18238r.isEmpty() || !this.f18233m.isEmpty() || !this.f18232l.isEmpty() || !this.f18234n.isEmpty()) {
            return true;
        }
        return false;
    }

    public void u() {
        long j10;
        long j11;
        boolean isEmpty = this.f18228h.isEmpty();
        boolean isEmpty2 = this.f18230j.isEmpty();
        boolean isEmpty3 = this.f18231k.isEmpty();
        boolean isEmpty4 = this.f18229i.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator it = this.f18228h.iterator();
            while (it.hasNext()) {
                T((RecyclerView.F) it.next());
            }
            this.f18228h.clear();
            if (!isEmpty2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f18230j);
                this.f18233m.add(arrayList);
                this.f18230j.clear();
                a aVar = new a(arrayList);
                if (!isEmpty) {
                    C1680b0.h0(((j) arrayList.get(0)).f18273a.f18066a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f18231k);
                this.f18234n.add(arrayList2);
                this.f18231k.clear();
                b bVar = new b(arrayList2);
                if (!isEmpty) {
                    C1680b0.h0(((i) arrayList2.get(0)).f18267a.f18066a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f18229i);
                this.f18232l.add(arrayList3);
                this.f18229i.clear();
                C0314c cVar = new C0314c(arrayList3);
                if (!isEmpty || !isEmpty2 || !isEmpty3) {
                    long j12 = 0;
                    if (!isEmpty) {
                        j10 = o();
                    } else {
                        j10 = 0;
                    }
                    if (!isEmpty2) {
                        j11 = n();
                    } else {
                        j11 = 0;
                    }
                    if (!isEmpty3) {
                        j12 = m();
                    }
                    C1680b0.h0(((RecyclerView.F) arrayList3.get(0)).f18066a, cVar, j10 + Math.max(j11, j12));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.F f10) {
        Z(f10);
        f10.f18066a.setAlpha(0.0f);
        this.f18229i.add(f10);
        return true;
    }

    public boolean x(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
        if (f10 == f11) {
            return y(f10, i10, i11, i12, i13);
        }
        float translationX = f10.f18066a.getTranslationX();
        float translationY = f10.f18066a.getTranslationY();
        float alpha = f10.f18066a.getAlpha();
        Z(f10);
        int i14 = (int) (((float) (i12 - i10)) - translationX);
        int i15 = (int) (((float) (i13 - i11)) - translationY);
        f10.f18066a.setTranslationX(translationX);
        f10.f18066a.setTranslationY(translationY);
        f10.f18066a.setAlpha(alpha);
        if (f11 != null) {
            Z(f11);
            f11.f18066a.setTranslationX((float) (-i14));
            f11.f18066a.setTranslationY((float) (-i15));
            f11.f18066a.setAlpha(0.0f);
        }
        this.f18231k.add(new i(f10, f11, i10, i11, i12, i13));
        return true;
    }

    public boolean y(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.f18066a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f10.f18066a.getTranslationY());
        Z(f10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(f10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f18230j.add(new j(f10, translationX, translationY, i12, i13));
        return true;
    }

    public boolean z(RecyclerView.F f10) {
        Z(f10);
        this.f18228h.add(f10);
        return true;
    }

    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.F f18267a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.F f18268b;

        /* renamed from: c  reason: collision with root package name */
        public int f18269c;

        /* renamed from: d  reason: collision with root package name */
        public int f18270d;

        /* renamed from: e  reason: collision with root package name */
        public int f18271e;

        /* renamed from: f  reason: collision with root package name */
        public int f18272f;

        private i(RecyclerView.F f10, RecyclerView.F f11) {
            this.f18267a = f10;
            this.f18268b = f11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f18267a + ", newHolder=" + this.f18268b + ", fromX=" + this.f18269c + ", fromY=" + this.f18270d + ", toX=" + this.f18271e + ", toY=" + this.f18272f + '}';
        }

        i(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
            this(f10, f11);
            this.f18269c = i10;
            this.f18270d = i11;
            this.f18271e = i12;
            this.f18272f = i13;
        }
    }
}
