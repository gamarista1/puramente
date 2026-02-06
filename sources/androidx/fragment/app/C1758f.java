package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C1546b;
import androidx.collection.C1587a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1690g0;
import androidx.core.view.L;
import androidx.fragment.app.C1774w;
import androidx.fragment.app.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6502A;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

/* renamed from: androidx.fragment.app.f  reason: case insensitive filesystem */
public final class C1758f extends b0 {

    /* renamed from: androidx.fragment.app.f$a */
    private static final class a extends b0.b {

        /* renamed from: d  reason: collision with root package name */
        private final b f16938d;

        /* renamed from: androidx.fragment.app.f$a$a  reason: collision with other inner class name */
        public static final class C0296a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0.d f16939a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f16940b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f16941c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f16942d;

            C0296a(b0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f16939a = dVar;
                this.f16940b = viewGroup;
                this.f16941c = view;
                this.f16942d = aVar;
            }

            /* access modifiers changed from: private */
            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                C6496s.h(viewGroup, "$container");
                C6496s.h(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().e(aVar);
            }

            public void onAnimationEnd(Animation animation) {
                C6496s.h(animation, "animation");
                ViewGroup viewGroup = this.f16940b;
                viewGroup.post(new C1757e(viewGroup, this.f16941c, this.f16942d));
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f16939a + " has ended.");
                }
            }

            public void onAnimationRepeat(Animation animation) {
                C6496s.h(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                C6496s.h(animation, "animation");
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f16939a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            C6496s.h(bVar, "animationInfo");
            this.f16938d = bVar;
        }

        public void c(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            b0.d a10 = this.f16938d.a();
            View view = a10.h().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f16938d.a().e(this);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a10 + " has been cancelled.");
            }
        }

        public void d(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            if (this.f16938d.b()) {
                this.f16938d.a().e(this);
                return;
            }
            Context context = viewGroup.getContext();
            b0.d a10 = this.f16938d.a();
            View view = a10.h().mView;
            b bVar = this.f16938d;
            C6496s.g(context, "context");
            C1774w.a c10 = bVar.c(context);
            if (c10 != null) {
                Animation animation = c10.f17067a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (a10.g() != b0.d.b.REMOVED) {
                    view.startAnimation(animation);
                    this.f16938d.a().e(this);
                } else {
                    viewGroup.startViewTransition(view);
                    C1774w.b bVar2 = new C1774w.b(animation, viewGroup, view);
                    bVar2.setAnimationListener(new C0296a(a10, viewGroup, view, this));
                    view.startAnimation(bVar2);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + a10 + " has started.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final b h() {
            return this.f16938d;
        }
    }

    /* renamed from: androidx.fragment.app.f$b */
    private static final class b extends C0297f {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f16943b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16944c;

        /* renamed from: d  reason: collision with root package name */
        private C1774w.a f16945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b0.d dVar, boolean z10) {
            super(dVar);
            C6496s.h(dVar, "operation");
            this.f16943b = z10;
        }

        public final C1774w.a c(Context context) {
            boolean z10;
            C6496s.h(context, "context");
            if (this.f16944c) {
                return this.f16945d;
            }
            C1769q h10 = a().h();
            if (a().g() == b0.d.b.VISIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            C1774w.a b10 = C1774w.b(context, h10, z10, this.f16943b);
            this.f16945d = b10;
            this.f16944c = true;
            return b10;
        }
    }

    /* renamed from: androidx.fragment.app.f$c */
    private static final class c extends b0.b {

        /* renamed from: d  reason: collision with root package name */
        private final b f16946d;

        /* renamed from: e  reason: collision with root package name */
        private AnimatorSet f16947e;

        /* renamed from: androidx.fragment.app.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewGroup f16948a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f16949b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f16950c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b0.d f16951d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f16952e;

            a(ViewGroup viewGroup, View view, boolean z10, b0.d dVar, c cVar) {
                this.f16948a = viewGroup;
                this.f16949b = view;
                this.f16950c = z10;
                this.f16951d = dVar;
                this.f16952e = cVar;
            }

            public void onAnimationEnd(Animator animator) {
                C6496s.h(animator, "anim");
                this.f16948a.endViewTransition(this.f16949b);
                if (this.f16950c) {
                    b0.d.b g10 = this.f16951d.g();
                    View view = this.f16949b;
                    C6496s.g(view, "viewToAnimate");
                    g10.b(view, this.f16948a);
                }
                this.f16952e.h().a().e(this.f16952e);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f16951d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            C6496s.h(bVar, "animatorInfo");
            this.f16946d = bVar;
        }

        public boolean b() {
            return true;
        }

        public void c(ViewGroup viewGroup) {
            String str;
            C6496s.h(viewGroup, "container");
            AnimatorSet animatorSet = this.f16947e;
            if (animatorSet == null) {
                this.f16946d.a().e(this);
                return;
            }
            b0.d a10 = this.f16946d.a();
            if (!a10.m()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f16954a.a(animatorSet);
            }
            if (J.L0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(a10);
                sb2.append(" has been canceled");
                if (a10.m()) {
                    str = " with seeking.";
                } else {
                    str = ".";
                }
                sb2.append(str);
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        public void d(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            b0.d a10 = this.f16946d.a();
            AnimatorSet animatorSet = this.f16947e;
            if (animatorSet == null) {
                this.f16946d.a().e(this);
                return;
            }
            animatorSet.start();
            if (J.L0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a10 + " has started.");
            }
        }

        public void e(C1546b bVar, ViewGroup viewGroup) {
            C6496s.h(bVar, "backEvent");
            C6496s.h(viewGroup, "container");
            b0.d a10 = this.f16946d.a();
            AnimatorSet animatorSet = this.f16947e;
            if (animatorSet == null) {
                this.f16946d.a().e(this);
            } else if (Build.VERSION.SDK_INT >= 34 && a10.h().mTransitioning) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a10);
                }
                long a11 = d.f16953a.a(animatorSet);
                long a12 = (long) (bVar.a() * ((float) a11));
                if (a12 == 0) {
                    a12 = 1;
                }
                if (a12 == a11) {
                    a12 = a11 - 1;
                }
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Setting currentPlayTime to " + a12 + " for Animator " + animatorSet + " on operation " + a10);
                }
                e.f16954a.b(animatorSet, a12);
            }
        }

        public void f(ViewGroup viewGroup) {
            AnimatorSet animatorSet;
            boolean z10;
            C6496s.h(viewGroup, "container");
            if (!this.f16946d.b()) {
                Context context = viewGroup.getContext();
                b bVar = this.f16946d;
                C6496s.g(context, "context");
                C1774w.a c10 = bVar.c(context);
                if (c10 != null) {
                    animatorSet = c10.f17068b;
                } else {
                    animatorSet = null;
                }
                this.f16947e = animatorSet;
                b0.d a10 = this.f16946d.a();
                C1769q h10 = a10.h();
                if (a10.g() == b0.d.b.GONE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = z10;
                View view = h10.mView;
                viewGroup.startViewTransition(view);
                AnimatorSet animatorSet2 = this.f16947e;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new a(viewGroup, view, z11, a10, this));
                }
                AnimatorSet animatorSet3 = this.f16947e;
                if (animatorSet3 != null) {
                    animatorSet3.setTarget(view);
                }
            }
        }

        public final b h() {
            return this.f16946d;
        }
    }

    /* renamed from: androidx.fragment.app.f$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16953a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            C6496s.h(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: androidx.fragment.app.f$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16954a = new e();

        private e() {
        }

        public final void a(AnimatorSet animatorSet) {
            C6496s.h(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            C6496s.h(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    /* renamed from: androidx.fragment.app.f$f  reason: collision with other inner class name */
    public static class C0297f {

        /* renamed from: a  reason: collision with root package name */
        private final b0.d f16955a;

        public C0297f(b0.d dVar) {
            C6496s.h(dVar, "operation");
            this.f16955a = dVar;
        }

        public final b0.d a() {
            return this.f16955a;
        }

        public final boolean b() {
            b0.d.b bVar;
            b0.d.b bVar2;
            View view = this.f16955a.h().mView;
            if (view != null) {
                bVar = b0.d.b.f16922a.a(view);
            } else {
                bVar = null;
            }
            b0.d.b g10 = this.f16955a.g();
            if (bVar == g10 || (bVar != (bVar2 = b0.d.b.VISIBLE) && g10 != bVar2)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.f$g */
    private static final class g extends b0.b {

        /* renamed from: d  reason: collision with root package name */
        private final List f16956d;

        /* renamed from: e  reason: collision with root package name */
        private final b0.d f16957e;

        /* renamed from: f  reason: collision with root package name */
        private final b0.d f16958f;

        /* renamed from: g  reason: collision with root package name */
        private final W f16959g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f16960h;

        /* renamed from: i  reason: collision with root package name */
        private final ArrayList f16961i;

        /* renamed from: j  reason: collision with root package name */
        private final ArrayList f16962j;

        /* renamed from: k  reason: collision with root package name */
        private final C1587a f16963k;

        /* renamed from: l  reason: collision with root package name */
        private final ArrayList f16964l;

        /* renamed from: m  reason: collision with root package name */
        private final ArrayList f16965m;

        /* renamed from: n  reason: collision with root package name */
        private final C1587a f16966n;

        /* renamed from: o  reason: collision with root package name */
        private final C1587a f16967o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f16968p;

        /* renamed from: q  reason: collision with root package name */
        private final u1.d f16969q = new u1.d();

        /* renamed from: r  reason: collision with root package name */
        private Object f16970r;

        /* renamed from: androidx.fragment.app.f$g$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f16971a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f16972b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f16973c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, ViewGroup viewGroup, Object obj) {
                super(0);
                this.f16971a = gVar;
                this.f16972b = viewGroup;
                this.f16973c = obj;
            }

            public final void invoke() {
                this.f16971a.v().e(this.f16972b, this.f16973c);
            }
        }

        /* renamed from: androidx.fragment.app.f$g$b */
        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f16974a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f16975b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f16976c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ N f16977d;

            /* renamed from: androidx.fragment.app.f$g$b$a */
            static final class a extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f16978a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Object f16979b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ViewGroup f16980c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f16978a = gVar;
                    this.f16979b = obj;
                    this.f16980c = viewGroup;
                }

                /* access modifiers changed from: private */
                public static final void c(g gVar, ViewGroup viewGroup) {
                    C6496s.h(gVar, "this$0");
                    C6496s.h(viewGroup, "$container");
                    for (h a10 : gVar.w()) {
                        b0.d a11 = a10.a();
                        View view = a11.h().getView();
                        if (view != null) {
                            a11.g().b(view, viewGroup);
                        }
                    }
                }

                /* access modifiers changed from: private */
                public static final void e(g gVar) {
                    C6496s.h(gVar, "this$0");
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    for (h a10 : gVar.w()) {
                        a10.a().e(gVar);
                    }
                }

                public final void invoke() {
                    Iterable<h> w10 = this.f16978a.w();
                    if (!(w10 instanceof Collection) || !((Collection) w10).isEmpty()) {
                        for (h a10 : w10) {
                            if (!a10.a().m()) {
                                if (J.L0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                u1.d dVar = new u1.d();
                                this.f16978a.v().w(((h) this.f16978a.w().get(0)).a().h(), this.f16979b, dVar, new C1766n(this.f16978a));
                                dVar.a();
                                return;
                            }
                        }
                    }
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    W v10 = this.f16978a.v();
                    Object s10 = this.f16978a.s();
                    C6496s.e(s10);
                    v10.d(s10, new C1765m(this.f16978a, this.f16980c));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar, ViewGroup viewGroup, Object obj, N n10) {
                super(0);
                this.f16974a = gVar;
                this.f16975b = viewGroup;
                this.f16976c = obj;
                this.f16977d = n10;
            }

            public final void invoke() {
                g gVar = this.f16974a;
                gVar.C(gVar.v().j(this.f16975b, this.f16976c));
                boolean z10 = this.f16974a.s() != null;
                Object obj = this.f16976c;
                ViewGroup viewGroup = this.f16975b;
                if (z10) {
                    this.f16977d.f71759a = new a(this.f16974a, obj, viewGroup);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + this.f16974a.t() + " to " + this.f16974a.u());
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
            }
        }

        public g(List list, b0.d dVar, b0.d dVar2, W w10, Object obj, ArrayList arrayList, ArrayList arrayList2, C1587a aVar, ArrayList arrayList3, ArrayList arrayList4, C1587a aVar2, C1587a aVar3, boolean z10) {
            C6496s.h(list, "transitionInfos");
            C6496s.h(w10, "transitionImpl");
            C6496s.h(arrayList, "sharedElementFirstOutViews");
            C6496s.h(arrayList2, "sharedElementLastInViews");
            C6496s.h(aVar, "sharedElementNameMapping");
            C6496s.h(arrayList3, "enteringNames");
            C6496s.h(arrayList4, "exitingNames");
            C6496s.h(aVar2, "firstOutViews");
            C6496s.h(aVar3, "lastInViews");
            this.f16956d = list;
            this.f16957e = dVar;
            this.f16958f = dVar2;
            this.f16959g = w10;
            this.f16960h = obj;
            this.f16961i = arrayList;
            this.f16962j = arrayList2;
            this.f16963k = aVar;
            this.f16964l = arrayList3;
            this.f16965m = arrayList4;
            this.f16966n = aVar2;
            this.f16967o = aVar3;
            this.f16968p = z10;
        }

        /* access modifiers changed from: private */
        public static final void A(b0.d dVar, g gVar) {
            C6496s.h(dVar, "$operation");
            C6496s.h(gVar, "this$0");
            if (J.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.e(gVar);
        }

        private final void B(ArrayList arrayList, ViewGroup viewGroup, C6787a aVar) {
            U.d(arrayList, 4);
            ArrayList q10 = this.f16959g.q(this.f16962j);
            if (J.L0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = this.f16961i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C6496s.g(next, "sharedElementFirstOutViews");
                    View view = (View) next;
                    Log.v("FragmentManager", "View: " + view + " Name: " + C1680b0.J(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = this.f16962j.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    C6496s.g(next2, "sharedElementLastInViews");
                    View view2 = (View) next2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + C1680b0.J(view2));
                }
            }
            aVar.invoke();
            this.f16959g.y(viewGroup, this.f16961i, this.f16962j, q10, this.f16963k);
            U.d(arrayList, 0);
            this.f16959g.A(this.f16960h, this.f16961i, this.f16962j);
        }

        private final void n(ArrayList arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!C1690g0.c(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            C6496s.g(childAt, "child");
                            n(arrayList, childAt);
                        }
                    }
                } else if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }

        private final Pair o(ViewGroup viewGroup, b0.d dVar, b0.d dVar2) {
            ViewGroup viewGroup2 = viewGroup;
            b0.d dVar3 = dVar;
            b0.d dVar4 = dVar2;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            boolean z10 = false;
            View view2 = null;
            for (h g10 : this.f16956d) {
                if (!(!g10.g() || dVar4 == null || dVar3 == null || this.f16963k.isEmpty() || this.f16960h == null)) {
                    U.a(dVar.h(), dVar2.h(), this.f16968p, this.f16966n, true);
                    L.a(viewGroup2, new C1762j(dVar3, dVar4, this));
                    this.f16961i.addAll(this.f16966n.values());
                    if (!this.f16965m.isEmpty()) {
                        Object obj = this.f16965m.get(0);
                        C6496s.g(obj, "exitingNames[0]");
                        view2 = (View) this.f16966n.get((String) obj);
                        this.f16959g.v(this.f16960h, view2);
                    }
                    this.f16962j.addAll(this.f16967o.values());
                    if (!this.f16964l.isEmpty()) {
                        Object obj2 = this.f16964l.get(0);
                        C6496s.g(obj2, "enteringNames[0]");
                        View view3 = (View) this.f16967o.get((String) obj2);
                        if (view3 != null) {
                            L.a(viewGroup2, new C1763k(this.f16959g, view3, rect));
                            z10 = true;
                        }
                    }
                    this.f16959g.z(this.f16960h, view, this.f16961i);
                    W w10 = this.f16959g;
                    Object obj3 = this.f16960h;
                    w10.s(obj3, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null, obj3, this.f16962j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f16956d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it.hasNext()) {
                h hVar = (h) it.next();
                b0.d a10 = hVar.a();
                Iterator it2 = it;
                Object h10 = this.f16959g.h(hVar.f());
                if (h10 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Object obj6 = obj5;
                    View view4 = a10.h().mView;
                    Object obj7 = obj4;
                    C6496s.g(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f16960h != null && (a10 == dVar4 || a10 == dVar3)) {
                        if (a10 == dVar4) {
                            arrayList2.removeAll(C6565s.j1(this.f16961i));
                        } else {
                            arrayList2.removeAll(C6565s.j1(this.f16962j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f16959g.a(h10, view);
                    } else {
                        this.f16959g.b(h10, arrayList2);
                        this.f16959g.s(h10, h10, arrayList2, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null);
                        if (a10.g() == b0.d.b.GONE) {
                            a10.q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a10.h().mView);
                            this.f16959g.r(h10, a10.h().mView, arrayList3);
                            L.a(viewGroup2, new C1764l(arrayList2));
                        }
                    }
                    if (a10.g() == b0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z10) {
                            this.f16959g.u(h10, rect);
                        }
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h10);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                C6496s.g(next, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next));
                            }
                        }
                    } else {
                        this.f16959g.v(h10, view2);
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h10);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                C6496s.g(next2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        obj4 = this.f16959g.p(obj7, h10, (Object) null);
                        dVar3 = dVar;
                        it = it2;
                        obj5 = obj6;
                    } else {
                        obj4 = obj7;
                        obj5 = this.f16959g.p(obj6, h10, (Object) null);
                    }
                }
                dVar3 = dVar;
                it = it2;
            }
            Object o10 = this.f16959g.o(obj4, obj5, this.f16960h);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o10);
            }
            return new Pair(arrayList, o10);
        }

        /* access modifiers changed from: private */
        public static final void p(b0.d dVar, b0.d dVar2, g gVar) {
            C6496s.h(gVar, "this$0");
            U.a(dVar.h(), dVar2.h(), gVar.f16968p, gVar.f16967o, false);
        }

        /* access modifiers changed from: private */
        public static final void q(W w10, View view, Rect rect) {
            C6496s.h(w10, "$impl");
            C6496s.h(rect, "$lastInEpicenterRect");
            w10.k(view, rect);
        }

        /* access modifiers changed from: private */
        public static final void r(ArrayList arrayList) {
            C6496s.h(arrayList, "$transitioningViews");
            U.d(arrayList, 4);
        }

        /* access modifiers changed from: private */
        public static final void y(b0.d dVar, g gVar) {
            C6496s.h(dVar, "$operation");
            C6496s.h(gVar, "this$0");
            if (J.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.e(gVar);
        }

        /* access modifiers changed from: private */
        public static final void z(N n10) {
            C6496s.h(n10, "$seekCancelLambda");
            C6787a aVar = (C6787a) n10.f71759a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void C(Object obj) {
            this.f16970r = obj;
        }

        public boolean b() {
            if (this.f16959g.m()) {
                Iterable iterable = this.f16956d;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        h hVar = (h) it.next();
                        if (Build.VERSION.SDK_INT >= 34) {
                            if (hVar.f() != null) {
                                if (!this.f16959g.n(hVar.f())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Object obj = this.f16960h;
                if (obj == null || this.f16959g.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        public void c(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            this.f16969q.a();
        }

        public void d(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f16956d) {
                    b0.d a10 = hVar.a();
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + a10);
                    }
                    hVar.a().e(this);
                }
                return;
            }
            Object obj = this.f16970r;
            if (obj != null) {
                W w10 = this.f16959g;
                C6496s.e(obj);
                w10.c(obj);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f16957e + " to " + this.f16958f);
                    return;
                }
                return;
            }
            Pair o10 = o(viewGroup, this.f16958f, this.f16957e);
            ArrayList arrayList = (ArrayList) o10.a();
            Object b10 = o10.b();
            Iterable<h> iterable = this.f16956d;
            ArrayList<b0.d> arrayList2 = new ArrayList<>(C6565s.y(iterable, 10));
            for (h a11 : iterable) {
                arrayList2.add(a11.a());
            }
            for (b0.d dVar : arrayList2) {
                this.f16959g.w(dVar.h(), b10, this.f16969q, new C1761i(dVar, this));
            }
            B(arrayList, viewGroup, new a(this, viewGroup, b10));
            if (J.L0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f16957e + " to " + this.f16958f);
            }
        }

        public void e(C1546b bVar, ViewGroup viewGroup) {
            C6496s.h(bVar, "backEvent");
            C6496s.h(viewGroup, "container");
            Object obj = this.f16970r;
            if (obj != null) {
                this.f16959g.t(obj, bVar.a());
            }
        }

        public void f(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h a10 : this.f16956d) {
                    b0.d a11 = a10.a();
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + a11);
                    }
                }
                return;
            }
            if (x() && this.f16960h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f16960h + " between " + this.f16957e + " and " + this.f16958f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                N n10 = new N();
                Pair o10 = o(viewGroup, this.f16958f, this.f16957e);
                ArrayList arrayList = (ArrayList) o10.a();
                Object b10 = o10.b();
                Iterable<h> iterable = this.f16956d;
                ArrayList<b0.d> arrayList2 = new ArrayList<>(C6565s.y(iterable, 10));
                for (h a12 : iterable) {
                    arrayList2.add(a12.a());
                }
                for (b0.d dVar : arrayList2) {
                    C1759g gVar = new C1759g(n10);
                    this.f16959g.x(dVar.h(), b10, this.f16969q, gVar, new C1760h(dVar, this));
                }
                B(arrayList, viewGroup, new b(this, viewGroup, b10, n10));
            }
        }

        public final Object s() {
            return this.f16970r;
        }

        public final b0.d t() {
            return this.f16957e;
        }

        public final b0.d u() {
            return this.f16958f;
        }

        public final W v() {
            return this.f16959g;
        }

        public final List w() {
            return this.f16956d;
        }

        public final boolean x() {
            Iterable<h> iterable = this.f16956d;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (h a10 : iterable) {
                if (!a10.a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.f$h */
    private static final class h extends C0297f {

        /* renamed from: b  reason: collision with root package name */
        private final Object f16981b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16982c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f16983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(b0.d dVar, boolean z10, boolean z11) {
            super(dVar);
            Object obj;
            boolean z12;
            Object obj2;
            C6496s.h(dVar, "operation");
            b0.d.b g10 = dVar.g();
            b0.d.b bVar = b0.d.b.VISIBLE;
            if (g10 == bVar) {
                C1769q h10 = dVar.h();
                if (z10) {
                    obj = h10.getReenterTransition();
                } else {
                    obj = h10.getEnterTransition();
                }
            } else {
                C1769q h11 = dVar.h();
                if (z10) {
                    obj = h11.getReturnTransition();
                } else {
                    obj = h11.getExitTransition();
                }
            }
            this.f16981b = obj;
            if (dVar.g() != bVar) {
                z12 = true;
            } else if (z10) {
                z12 = dVar.h().getAllowReturnTransitionOverlap();
            } else {
                z12 = dVar.h().getAllowEnterTransitionOverlap();
            }
            this.f16982c = z12;
            if (!z11) {
                obj2 = null;
            } else if (z10) {
                obj2 = dVar.h().getSharedElementReturnTransition();
            } else {
                obj2 = dVar.h().getSharedElementEnterTransition();
            }
            this.f16983d = obj2;
        }

        private final W d(Object obj) {
            if (obj == null) {
                return null;
            }
            W w10 = U.f16842b;
            if (w10 != null && w10.g(obj)) {
                return w10;
            }
            W w11 = U.f16843c;
            if (w11 != null && w11.g(obj)) {
                return w11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final W c() {
            W d10 = d(this.f16981b);
            W d11 = d(this.f16983d);
            if (d10 != null && d11 != null && d10 != d11) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f16981b + " which uses a different Transition  type than its shared element transition " + this.f16983d).toString());
            } else if (d10 == null) {
                return d11;
            } else {
                return d10;
            }
        }

        public final Object e() {
            return this.f16983d;
        }

        public final Object f() {
            return this.f16981b;
        }

        public final boolean g() {
            if (this.f16983d != null) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            return this.f16982c;
        }
    }

    /* renamed from: androidx.fragment.app.f$i */
    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f16984a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Collection collection) {
            super(1);
            this.f16984a = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(Map.Entry entry) {
            C6496s.h(entry, "entry");
            return Boolean.valueOf(C6565s.e0(this.f16984a, C1680b0.J((View) entry.getValue())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1758f(ViewGroup viewGroup) {
        super(viewGroup);
        C6496s.h(viewGroup, "container");
    }

    private final void F(List list) {
        ArrayList<b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6565s.D(arrayList2, ((b) it.next()).a().f());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            b0.d a10 = bVar.a();
            C6496s.g(context, "context");
            C1774w.a c10 = bVar.c(context);
            if (c10 != null) {
                if (c10.f17068b == null) {
                    arrayList.add(bVar);
                } else {
                    C1769q h10 = a10.h();
                    if (a10.f().isEmpty()) {
                        if (a10.g() == b0.d.b.GONE) {
                            a10.q(false);
                        }
                        a10.b(new c(bVar));
                        z10 = true;
                    } else if (J.L0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + h10 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            b0.d a11 = bVar2.a();
            C1769q h11 = a11.h();
            if (!isEmpty) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Transitions.");
                }
            } else if (!z10) {
                a11.b(new a(bVar2));
            } else if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Animators.");
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void G(C1758f fVar, b0.d dVar) {
        C6496s.h(fVar, "this$0");
        C6496s.h(dVar, "$operation");
        fVar.c(dVar);
    }

    private final void H(List list, boolean z10, b0.d dVar, b0.d dVar2) {
        Object obj;
        W w10;
        Iterator it;
        Pair pair;
        b0.d dVar3 = dVar;
        b0.d dVar4 = dVar2;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!((h) next).b()) {
                arrayList.add(next);
            }
        }
        ArrayList<h> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (((h) next2).c() != null) {
                arrayList2.add(next2);
            }
        }
        W w11 = null;
        for (h hVar : arrayList2) {
            W c10 = hVar.c();
            if (w11 == null || c10 == w11) {
                w11 = c10;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        if (w11 != null) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            C1587a aVar = new C1587a();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            C1587a aVar2 = new C1587a();
            C1587a aVar3 = new C1587a();
            Iterator it2 = arrayList2.iterator();
            ArrayList<String> arrayList7 = arrayList5;
            ArrayList<String> arrayList8 = arrayList6;
            loop3:
            while (true) {
                obj = null;
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.g() || dVar3 == null || dVar4 == null) {
                        w10 = w11;
                        it = it2;
                    } else {
                        obj = w11.B(w11.h(hVar2.e()));
                        arrayList8 = dVar2.h().getSharedElementSourceNames();
                        C6496s.g(arrayList8, "lastIn.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementSourceNames = dVar.h().getSharedElementSourceNames();
                        C6496s.g(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementTargetNames = dVar.h().getSharedElementTargetNames();
                        C6496s.g(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                        int size = sharedElementTargetNames.size();
                        it = it2;
                        int i10 = 0;
                        while (i10 < size) {
                            int i11 = size;
                            int indexOf = arrayList8.indexOf(sharedElementTargetNames.get(i10));
                            ArrayList<String> arrayList9 = sharedElementTargetNames;
                            if (indexOf != -1) {
                                arrayList8.set(indexOf, sharedElementSourceNames.get(i10));
                            }
                            i10++;
                            size = i11;
                            sharedElementTargetNames = arrayList9;
                        }
                        arrayList7 = dVar2.h().getSharedElementTargetNames();
                        C6496s.g(arrayList7, "lastIn.fragment.sharedElementTargetNames");
                        if (!z10) {
                            dVar.h().getExitTransitionCallback();
                            dVar2.h().getEnterTransitionCallback();
                            pair = C6502A.a((Object) null, (Object) null);
                        } else {
                            dVar.h().getEnterTransitionCallback();
                            dVar2.h().getExitTransitionCallback();
                            pair = C6502A.a((Object) null, (Object) null);
                        }
                        android.support.v4.media.session.c.a(pair.a());
                        android.support.v4.media.session.c.a(pair.b());
                        int size2 = arrayList8.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            String str = arrayList8.get(i12);
                            int i13 = size2;
                            C6496s.g(str, "exitingNames[i]");
                            String str2 = arrayList7.get(i12);
                            C6496s.g(str2, "enteringNames[i]");
                            aVar.put(str, str2);
                            i12++;
                            size2 = i13;
                            w11 = w11;
                        }
                        w10 = w11;
                        if (J.L0(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            for (Iterator<String> it3 = arrayList7.iterator(); it3.hasNext(); it3 = it3) {
                                Log.v("FragmentManager", "Name: " + it3.next());
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator<String> it4 = arrayList8.iterator(); it4.hasNext(); it4 = it4) {
                                Log.v("FragmentManager", "Name: " + it4.next());
                            }
                        }
                        View view = dVar.h().mView;
                        C6496s.g(view, "firstOut.fragment.mView");
                        I(aVar2, view);
                        aVar2.r(arrayList8);
                        aVar.r(aVar2.keySet());
                        View view2 = dVar2.h().mView;
                        C6496s.g(view2, "lastIn.fragment.mView");
                        I(aVar3, view2);
                        aVar3.r(arrayList7);
                        aVar3.r(aVar.values());
                        U.c(aVar, aVar3);
                        Set keySet = aVar.keySet();
                        C6496s.g(keySet, "sharedElementNameMapping.keys");
                        J(aVar2, keySet);
                        Collection values = aVar.values();
                        C6496s.g(values, "sharedElementNameMapping.values");
                        J(aVar3, values);
                        if (aVar.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar3 + " and " + dVar4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList3.clear();
                            arrayList4.clear();
                            it2 = it;
                            w11 = w10;
                        }
                    }
                    it2 = it;
                    w11 = w10;
                }
                break loop3;
            }
            W w12 = w11;
            if (obj != null) {
                g gVar = r1;
                g gVar2 = new g(arrayList2, dVar, dVar2, w12, obj, arrayList3, arrayList4, aVar, arrayList7, arrayList8, aVar2, aVar3, z10);
            } else if (!arrayList2.isEmpty()) {
                for (h f10 : arrayList2) {
                    if (f10.f() != null) {
                    }
                }
                return;
            } else {
                return;
            }
            g gVar3 = gVar2;
            g gVar22 = new g(arrayList2, dVar, dVar2, w12, obj, arrayList3, arrayList4, aVar, arrayList7, arrayList8, aVar2, aVar3, z10);
            for (h a10 : arrayList2) {
                a10.a().b(gVar3);
            }
        }
    }

    private final void I(Map map, View view) {
        String J10 = C1680b0.J(view);
        if (J10 != null) {
            map.put(J10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    C6496s.g(childAt, "child");
                    I(map, childAt);
                }
            }
        }
    }

    private final void J(C1587a aVar, Collection collection) {
        Set entrySet = aVar.entrySet();
        C6496s.g(entrySet, "entries");
        C6565s.P(entrySet, new i(collection));
    }

    private final void K(List list) {
        C1769q h10 = ((b0.d) C6565s.z0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0.d dVar = (b0.d) it.next();
            dVar.h().mAnimationInfo.f17043c = h10.mAnimationInfo.f17043c;
            dVar.h().mAnimationInfo.f17044d = h10.mAnimationInfo.f17044d;
            dVar.h().mAnimationInfo.f17045e = h10.mAnimationInfo.f17045e;
            dVar.h().mAnimationInfo.f17046f = h10.mAnimationInfo.f17046f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.b0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.fragment.app.b0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.fragment.app.b0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.fragment.app.b0$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.b0$d r4 = (androidx.fragment.app.b0.d) r4
            androidx.fragment.app.b0$d$b$a r5 = androidx.fragment.app.b0.d.b.f16922a
            androidx.fragment.app.q r6 = r4.h()
            android.view.View r6 = r6.mView
            kotlin.jvm.internal.C6496s.g(r6, r3)
            androidx.fragment.app.b0$d$b r5 = r5.a(r6)
            androidx.fragment.app.b0$d$b r6 = androidx.fragment.app.b0.d.b.VISIBLE
            if (r5 != r6) goto L_0x000c
            androidx.fragment.app.b0$d$b r4 = r4.g()
            if (r4 == r6) goto L_0x000c
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            androidx.fragment.app.b0$d r1 = (androidx.fragment.app.b0.d) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x0041:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.b0$d r5 = (androidx.fragment.app.b0.d) r5
            androidx.fragment.app.b0$d$b$a r6 = androidx.fragment.app.b0.d.b.f16922a
            androidx.fragment.app.q r7 = r5.h()
            android.view.View r7 = r7.mView
            kotlin.jvm.internal.C6496s.g(r7, r3)
            androidx.fragment.app.b0$d$b r6 = r6.a(r7)
            androidx.fragment.app.b0$d$b r7 = androidx.fragment.app.b0.d.b.VISIBLE
            if (r6 == r7) goto L_0x0041
            androidx.fragment.app.b0$d$b r5 = r5.g()
            if (r5 != r7) goto L_0x0041
            r2 = r4
        L_0x0068:
            androidx.fragment.app.b0$d r2 = (androidx.fragment.app.b0.d) r2
            r0 = 2
            boolean r0 = androidx.fragment.app.J.L0(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Executing operations from "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r0)
        L_0x008f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.K(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x00a0:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r9.next()
            androidx.fragment.app.b0$d r4 = (androidx.fragment.app.b0.d) r4
            androidx.fragment.app.f$b r5 = new androidx.fragment.app.f$b
            r5.<init>(r4, r10)
            r0.add(r5)
            androidx.fragment.app.f$h r5 = new androidx.fragment.app.f$h
            r6 = 0
            r7 = 1
            if (r10 == 0) goto L_0x00be
            if (r4 != r1) goto L_0x00c1
        L_0x00bc:
            r6 = r7
            goto L_0x00c1
        L_0x00be:
            if (r4 != r2) goto L_0x00c1
            goto L_0x00bc
        L_0x00c1:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            androidx.fragment.app.d r5 = new androidx.fragment.app.d
            r5.<init>(r8, r4)
            r4.a(r5)
            goto L_0x00a0
        L_0x00d0:
            r8.H(r3, r10, r1, r2)
            r8.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1758f.d(java.util.List, boolean):void");
    }
}
