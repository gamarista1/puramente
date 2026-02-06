package w5;

import F5.h;
import Sg.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C3459v;
import com.facebook.I;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3884A;
import o7.C3906w;
import o7.G;
import o7.W;
import t7.C4049a;
import w5.C4130b;
import w5.C4136h;
import x5.C4165a;
import x5.C4166b;
import x5.C4167c;
import x5.C4170f;

/* renamed from: w5.g  reason: case insensitive filesystem */
public final class C4135g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f49170f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f49171g = C4135g.class.getCanonicalName();

    /* renamed from: h  reason: collision with root package name */
    private static C4135g f49172h;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f49173a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f49174b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f49175c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet f49176d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f49177e;

    /* renamed from: w5.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized C4135g a() {
            C4135g b10;
            try {
                if (C4135g.b() == null) {
                    C4135g.d(new C4135g((DefaultConstructorMarker) null));
                }
                b10 = C4135g.b();
                C6496s.f(b10, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return b10;
        }

        public final Bundle b(C4165a aVar, View view, View view2) {
            List<C4166b> c10;
            List list;
            C6496s.h(view, "rootView");
            C6496s.h(view2, "hostView");
            Bundle bundle = new Bundle();
            if (!(aVar == null || (c10 = aVar.c()) == null)) {
                for (C4166b bVar : c10) {
                    if (bVar.d() == null || bVar.d().length() <= 0) {
                        if (bVar.b().size() > 0) {
                            if (C6496s.c(bVar.c(), "relative")) {
                                c.a aVar2 = c.f49180f;
                                List b10 = bVar.b();
                                String simpleName = view2.getClass().getSimpleName();
                                C6496s.g(simpleName, "hostView.javaClass.simpleName");
                                list = aVar2.a(aVar, view2, b10, 0, -1, simpleName);
                            } else {
                                c.a aVar3 = c.f49180f;
                                List b11 = bVar.b();
                                String simpleName2 = view.getClass().getSimpleName();
                                C6496s.g(simpleName2, "rootView.javaClass.simpleName");
                                list = aVar3.a(aVar, view, b11, 0, -1, simpleName2);
                            }
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                b bVar2 = (b) it.next();
                                if (bVar2.a() != null) {
                                    String k10 = C4170f.k(bVar2.a());
                                    if (k10.length() > 0) {
                                        bundle.putString(bVar.a(), k10);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        bundle.putString(bVar.a(), bVar.d());
                    }
                }
            }
            return bundle;
        }

        private a() {
        }
    }

    /* renamed from: w5.g$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f49178a;

        /* renamed from: b  reason: collision with root package name */
        private final String f49179b;

        public b(View view, String str) {
            C6496s.h(view, "view");
            C6496s.h(str, "viewMapKey");
            this.f49178a = new WeakReference(view);
            this.f49179b = str;
        }

        public final View a() {
            WeakReference weakReference = this.f49178a;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public final String b() {
            return this.f49179b;
        }
    }

    /* renamed from: w5.g$c */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f  reason: collision with root package name */
        public static final a f49180f = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f49181a;

        /* renamed from: b  reason: collision with root package name */
        private List f49182b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f49183c;

        /* renamed from: d  reason: collision with root package name */
        private final HashSet f49184d;

        /* renamed from: e  reason: collision with root package name */
        private final String f49185e;

        /* renamed from: w5.g$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        C6496s.g(childAt, "child");
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
                if (kotlin.jvm.internal.C6496s.c(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L_0x0067;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private final boolean c(android.view.View r10, x5.C4167c r11, int r12) {
                /*
                    r9 = this;
                    int r0 = r11.e()
                    r1 = -1
                    r2 = 0
                    if (r0 == r1) goto L_0x000f
                    int r0 = r11.e()
                    if (r12 == r0) goto L_0x000f
                    return r2
                L_0x000f:
                    java.lang.Class r12 = r10.getClass()
                    java.lang.String r12 = r12.getCanonicalName()
                    java.lang.String r0 = r11.a()
                    boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r0)
                    r0 = 1
                    if (r12 != 0) goto L_0x0068
                    java.lang.String r12 = r11.a()
                    Sg.m r1 = new Sg.m
                    java.lang.String r3 = ".*android\\..*"
                    r1.<init>((java.lang.String) r3)
                    boolean r12 = r1.d(r12)
                    if (r12 == 0) goto L_0x0067
                    java.lang.String r3 = r11.a()
                    java.lang.String r12 = "."
                    java.lang.String[] r4 = new java.lang.String[]{r12}
                    r7 = 6
                    r8 = 0
                    r5 = 0
                    r6 = 0
                    java.util.List r12 = Sg.p.F0(r3, r4, r5, r6, r7, r8)
                    r1 = r12
                    java.util.Collection r1 = (java.util.Collection) r1
                    boolean r1 = r1.isEmpty()
                    if (r1 != 0) goto L_0x0067
                    int r1 = r12.size()
                    int r1 = r1 - r0
                    java.lang.Object r12 = r12.get(r1)
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.Class r1 = r10.getClass()
                    java.lang.String r1 = r1.getSimpleName()
                    boolean r12 = kotlin.jvm.internal.C6496s.c(r1, r12)
                    if (r12 != 0) goto L_0x0068
                L_0x0067:
                    return r2
                L_0x0068:
                    int r12 = r11.f()
                    x5.c$b r1 = x5.C4167c.b.f49460b
                    int r1 = r1.b()
                    r12 = r12 & r1
                    if (r12 <= 0) goto L_0x0080
                    int r12 = r11.d()
                    int r1 = r10.getId()
                    if (r12 == r1) goto L_0x0080
                    return r2
                L_0x0080:
                    int r12 = r11.f()
                    x5.c$b r1 = x5.C4167c.b.f49461c
                    int r1 = r1.b()
                    r12 = r12 & r1
                    java.lang.String r1 = ""
                    if (r12 <= 0) goto L_0x00ac
                    java.lang.String r12 = r11.h()
                    java.lang.String r3 = x5.C4170f.k(r10)
                    java.lang.String r4 = o7.W.J0(r3)
                    java.lang.String r4 = o7.W.k(r4, r1)
                    boolean r3 = kotlin.jvm.internal.C6496s.c(r12, r3)
                    if (r3 != 0) goto L_0x00ac
                    boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r4)
                    if (r12 != 0) goto L_0x00ac
                    return r2
                L_0x00ac:
                    int r12 = r11.f()
                    x5.c$b r3 = x5.C4167c.b.f49463e
                    int r3 = r3.b()
                    r12 = r12 & r3
                    if (r12 <= 0) goto L_0x00e2
                    java.lang.String r12 = r11.b()
                    java.lang.CharSequence r3 = r10.getContentDescription()
                    if (r3 != 0) goto L_0x00c5
                    r3 = r1
                    goto L_0x00cd
                L_0x00c5:
                    java.lang.CharSequence r3 = r10.getContentDescription()
                    java.lang.String r3 = r3.toString()
                L_0x00cd:
                    java.lang.String r4 = o7.W.J0(r3)
                    java.lang.String r4 = o7.W.k(r4, r1)
                    boolean r3 = kotlin.jvm.internal.C6496s.c(r12, r3)
                    if (r3 != 0) goto L_0x00e2
                    boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r4)
                    if (r12 != 0) goto L_0x00e2
                    return r2
                L_0x00e2:
                    int r12 = r11.f()
                    x5.c$b r3 = x5.C4167c.b.f49464f
                    int r3 = r3.b()
                    r12 = r12 & r3
                    if (r12 <= 0) goto L_0x010c
                    java.lang.String r12 = r11.c()
                    java.lang.String r3 = x5.C4170f.i(r10)
                    java.lang.String r4 = o7.W.J0(r3)
                    java.lang.String r4 = o7.W.k(r4, r1)
                    boolean r3 = kotlin.jvm.internal.C6496s.c(r12, r3)
                    if (r3 != 0) goto L_0x010c
                    boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r4)
                    if (r12 != 0) goto L_0x010c
                    return r2
                L_0x010c:
                    int r12 = r11.f()
                    x5.c$b r3 = x5.C4167c.b.f49462d
                    int r3 = r3.b()
                    r12 = r12 & r3
                    if (r12 <= 0) goto L_0x0142
                    java.lang.String r11 = r11.g()
                    java.lang.Object r12 = r10.getTag()
                    if (r12 != 0) goto L_0x0125
                    r10 = r1
                    goto L_0x012d
                L_0x0125:
                    java.lang.Object r10 = r10.getTag()
                    java.lang.String r10 = r10.toString()
                L_0x012d:
                    java.lang.String r12 = o7.W.J0(r10)
                    java.lang.String r12 = o7.W.k(r12, r1)
                    boolean r10 = kotlin.jvm.internal.C6496s.c(r11, r10)
                    if (r10 != 0) goto L_0x0142
                    boolean r10 = kotlin.jvm.internal.C6496s.c(r11, r12)
                    if (r10 != 0) goto L_0x0142
                    return r2
                L_0x0142:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: w5.C4135g.c.a.c(android.view.View, x5.c, int):boolean");
            }

            public final List a(C4165a aVar, View view, List list, int i10, int i11, String str) {
                C6496s.h(list, "path");
                C6496s.h(str, "mapKey");
                String str2 = str + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i10 >= list.size()) {
                    arrayList.add(new b(view, str2));
                } else {
                    C4167c cVar = (C4167c) list.get(i10);
                    if (C6496s.c(cVar.a(), "..")) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            List b10 = b((ViewGroup) parent);
                            int size = b10.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                arrayList.addAll(a(aVar, (View) b10.get(i12), list, i10 + 1, i12, str2));
                            }
                        }
                        return arrayList;
                    } else if (C6496s.c(cVar.a(), ".")) {
                        arrayList.add(new b(view, str2));
                        return arrayList;
                    } else if (!c(view, cVar, i11)) {
                        return arrayList;
                    } else {
                        if (i10 == list.size() - 1) {
                            arrayList.add(new b(view, str2));
                        }
                    }
                }
                if (view instanceof ViewGroup) {
                    List b11 = b((ViewGroup) view);
                    int size2 = b11.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        arrayList.addAll(a(aVar, (View) b11.get(i13), list, i10 + 1, i13, str2));
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        public c(View view, Handler handler, HashSet hashSet, String str) {
            C6496s.h(handler, "handler");
            C6496s.h(hashSet, "listenerSet");
            C6496s.h(str, "activityName");
            this.f49181a = new WeakReference(view);
            this.f49183c = handler;
            this.f49184d = hashSet;
            this.f49185e = str;
            handler.postDelayed(this, 200);
        }

        private final void a(b bVar, View view, C4165a aVar) {
            if (aVar != null) {
                try {
                    View a10 = bVar.a();
                    if (a10 != null) {
                        View a11 = C4170f.a(a10);
                        if (a11 == null || !C4170f.f49471a.p(a10, a11)) {
                            String name = a10.getClass().getName();
                            C6496s.g(name, "view.javaClass.name");
                            if (!p.J(name, "com.facebook.react", false, 2, (Object) null)) {
                                if (!(a10 instanceof AdapterView)) {
                                    b(bVar, view, aVar);
                                } else if (a10 instanceof ListView) {
                                    c(bVar, view, aVar);
                                }
                            }
                        } else {
                            d(bVar, view, aVar);
                        }
                    }
                } catch (Exception e10) {
                    W.k0(C4135g.c(), e10);
                }
            }
        }

        private final void b(b bVar, View view, C4165a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 != null) {
                String b10 = bVar.b();
                View.OnClickListener g10 = C4170f.g(a10);
                if (g10 instanceof C4130b.a) {
                    C6496s.f(g10, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    if (((C4130b.a) g10).a()) {
                        z10 = true;
                        if (!this.f49184d.contains(b10) && !z10) {
                            a10.setOnClickListener(C4130b.b(aVar, view, a10));
                            this.f49184d.add(b10);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!this.f49184d.contains(b10)) {
                }
            }
        }

        private final void c(b bVar, View view, C4165a aVar) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView != null) {
                String b10 = bVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof C4130b.C0746b) {
                    C6496s.f(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    if (((C4130b.C0746b) onItemClickListener).a()) {
                        z10 = true;
                        if (!this.f49184d.contains(b10) && !z10) {
                            adapterView.setOnItemClickListener(C4130b.c(aVar, view, adapterView));
                            this.f49184d.add(b10);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!this.f49184d.contains(b10)) {
                }
            }
        }

        private final void d(b bVar, View view, C4165a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 != null) {
                String b10 = bVar.b();
                View.OnTouchListener h10 = C4170f.h(a10);
                if (h10 instanceof C4136h.a) {
                    C6496s.f(h10, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    if (((C4136h.a) h10).a()) {
                        z10 = true;
                        if (!this.f49184d.contains(b10) && !z10) {
                            a10.setOnTouchListener(C4136h.a(aVar, view, a10));
                            this.f49184d.add(b10);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!this.f49184d.contains(b10)) {
                }
            }
        }

        private final void e(C4165a aVar, View view) {
            if (aVar != null && view != null) {
                String a10 = aVar.a();
                if (a10 == null || a10.length() == 0 || C6496s.c(aVar.a(), this.f49185e)) {
                    List d10 = aVar.d();
                    if (d10.size() <= 25) {
                        for (b a11 : f49180f.a(aVar, view, d10, 0, -1, this.f49185e)) {
                            a(a11, view, aVar);
                        }
                    }
                }
            }
        }

        private final void f() {
            List list = this.f49182b;
            if (list != null && this.f49181a.get() != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e((C4165a) list.get(i10), (View) this.f49181a.get());
                }
            }
        }

        public void onGlobalLayout() {
            f();
        }

        public void onScrollChanged() {
            f();
        }

        public void run() {
            View view;
            if (!C4049a.d(this)) {
                try {
                    C3906w f10 = C3884A.f(I.m());
                    if (f10 == null) {
                        return;
                    }
                    if (f10.d()) {
                        List b10 = C4165a.f49429j.b(f10.i());
                        this.f49182b = b10;
                        if (b10 != null && (view = (View) this.f49181a.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            f();
                        }
                    }
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    public /* synthetic */ C4135g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ C4135g b() {
        Class<C4135g> cls = C4135g.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f49172h;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        Class<C4135g> cls = C4135g.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f49171g;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void d(C4135g gVar) {
        Class<C4135g> cls = C4135g.class;
        if (!C4049a.d(cls)) {
            try {
                f49172h = gVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void g() {
        if (!C4049a.d(this)) {
            try {
                for (Activity activity : this.f49174b) {
                    if (activity != null) {
                        View d10 = h.d(activity);
                        String simpleName = activity.getClass().getSimpleName();
                        Handler handler = this.f49173a;
                        HashSet hashSet = this.f49176d;
                        C6496s.g(simpleName, "activityName");
                        this.f49175c.add(new c(d10, handler, hashSet, simpleName));
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void i() {
        if (!C4049a.d(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    g();
                } else {
                    this.f49173a.post(new C4134f(this));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j(C4135g gVar) {
        Class<C4135g> cls = C4135g.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(gVar, "this$0");
                gVar.g();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final void e(Activity activity) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(activity, "activity");
                if (!G.b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f49174b.add(activity);
                        this.f49176d.clear();
                        HashSet hashSet = (HashSet) this.f49177e.get(Integer.valueOf(activity.hashCode()));
                        if (hashSet != null) {
                            this.f49176d = hashSet;
                        }
                        i();
                        return;
                    }
                    throw new C3459v("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void f(Activity activity) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(activity, "activity");
                this.f49177e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void h(Activity activity) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(activity, "activity");
                if (!G.b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f49174b.remove(activity);
                        this.f49175c.clear();
                        HashMap hashMap = this.f49177e;
                        Integer valueOf = Integer.valueOf(activity.hashCode());
                        Object clone = this.f49176d.clone();
                        C6496s.f(clone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                        hashMap.put(valueOf, (HashSet) clone);
                        this.f49176d.clear();
                        return;
                    }
                    throw new C3459v("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private C4135g() {
        this.f49173a = new Handler(Looper.getMainLooper());
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C6496s.g(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f49174b = newSetFromMap;
        this.f49175c = new LinkedHashSet();
        this.f49176d = new HashSet();
        this.f49177e = new HashMap();
    }
}
