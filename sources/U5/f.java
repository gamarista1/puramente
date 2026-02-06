package u5;

import F5.h;
import Sg.m;
import Sg.p;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.C4021N;
import t7.C4049a;

public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f48594e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final Map f48595f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Set f48596a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f48597b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f48598c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f48599d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String c(String str, String str2) {
            if (C6496s.c("r2", str)) {
                return new m("[^\\d.]").e(str2, "");
            }
            return str2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
            if (r7.equals("r4") == false) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
            r8 = new Sg.m("[^a-z]+").e(r8, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
            if (r7.equals("r5") == false) goto L_0x0079;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.util.Map r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L_0x0053;
                    case 3586: goto L_0x003c;
                    case 3587: goto L_0x0033;
                    case 3588: goto L_0x000c;
                    default: goto L_0x000a;
                }
            L_0x000a:
                goto L_0x0079
            L_0x000c:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0015
                goto L_0x0079
            L_0x0015:
                java.lang.String r0 = "-"
                boolean r1 = Sg.p.O(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L_0x0079
                Sg.m r1 = new Sg.m
                r1.<init>((java.lang.String) r0)
                java.util.List r8 = r1.g(r8, r3)
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L_0x0079
            L_0x0033:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0045
                goto L_0x0079
            L_0x003c:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0045
                goto L_0x0079
            L_0x0045:
                Sg.m r0 = new Sg.m
                java.lang.String r1 = "[^a-z]+"
                r0.<init>((java.lang.String) r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.e(r8, r1)
                goto L_0x0079
            L_0x0053:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x005c
                goto L_0x0079
            L_0x005c:
                java.lang.String r0 = "m"
                boolean r4 = Sg.p.J(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L_0x0078
                java.lang.String r4 = "b"
                boolean r4 = Sg.p.J(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L_0x0078
                java.lang.String r4 = "ge"
                boolean r8 = Sg.p.J(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L_0x0075
                goto L_0x0078
            L_0x0075:
                java.lang.String r8 = "f"
                goto L_0x0079
            L_0x0078:
                r8 = r0
            L_0x0079:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.f.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            C6496s.h(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = f.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new f(activity, (DefaultConstructorMarker) null);
                b10.put(valueOf, obj);
            }
            f.c((f) obj);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        Class<f> cls = f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48595f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        Class<f> cls = f.class;
        if (!C4049a.d(cls)) {
            try {
                fVar.h();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void d(View view) {
        if (!C4049a.d(this)) {
            try {
                g(new e(view, this));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void e(View view, f fVar) {
        Class<f> cls = f.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(view, "$view");
                C6496s.h(fVar, "this$0");
                if (view instanceof EditText) {
                    fVar.f(view);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void f(View view) {
        if (!C4049a.d(this)) {
            try {
                C6496s.f(view, "null cannot be cast to non-null type android.widget.EditText");
                String lowerCase = p.g1(((EditText) view).getText().toString()).toString().toLowerCase();
                C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                if (lowerCase.length() != 0) {
                    if (this.f48596a.contains(lowerCase)) {
                        return;
                    }
                    if (lowerCase.length() <= 100) {
                        this.f48596a.add(lowerCase);
                        HashMap hashMap = new HashMap();
                        List b10 = C4088c.b(view);
                        List list = null;
                        for (d dVar : d.f48587d.c()) {
                            a aVar = f48594e;
                            String a10 = aVar.c(dVar.c(), lowerCase);
                            if (dVar.d().length() <= 0 || C4088c.f(a10, dVar.d())) {
                                if (C4088c.e(b10, dVar.b())) {
                                    aVar.d(hashMap, dVar.c(), a10);
                                } else {
                                    if (list == null) {
                                        list = C4088c.a(view);
                                    }
                                    if (C4088c.e(list, dVar.b())) {
                                        aVar.d(hashMap, dVar.c(), a10);
                                    }
                                }
                            }
                        }
                        C4021N.f48172b.f(hashMap);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void g(Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f48597b.post(runnable);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void h() {
        View d10;
        if (!C4049a.d(this)) {
            try {
                if (!this.f48599d.getAndSet(true) && (d10 = h.d((Activity) this.f48598c.get())) != null) {
                    ViewTreeObserver viewTreeObserver = d10.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!C4049a.d(this)) {
            if (view != null) {
                try {
                    d(view);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                    return;
                }
            }
            if (view2 != null) {
                d(view2);
            }
        }
    }

    private f(Activity activity) {
        this.f48596a = new LinkedHashSet();
        this.f48597b = new Handler(Looper.getMainLooper());
        this.f48598c = new WeakReference(activity);
        this.f48599d = new AtomicBoolean(false);
    }
}
