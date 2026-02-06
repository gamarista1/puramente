package androidx.activity;

import Z1.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.k;
import androidx.core.app.s;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.view.B;
import androidx.core.view.C1720w;
import androidx.core.view.C1726z;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.M;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import f.C1955a;
import f.C1956b;
import g.C1999b;
import g.C2000c;
import g.C2002e;
import g.C2003f;
import g.C2004g;
import h.C2012a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6531o;
import x1.C2896a;
import x3.C2912d;
import x3.C2913e;
import x3.C2914f;
import x3.C2915g;
import yf.C6787a;

/* renamed from: androidx.activity.j  reason: case insensitive filesystem */
public abstract class C1554j extends androidx.core.app.h implements C1798v, e0, C1788k, C2914f, K, C2003f, androidx.core.content.f, androidx.core.content.g, s, t, C1720w, F {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c((DefaultConstructorMarker) null);
    private d0 _viewModelStore;
    private final C2002e activityResultRegistry;
    private int contentLayoutId;
    private final C1955a contextAwareHelper = new C1955a();
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final C1726z menuHostHelper = new C1726z(new C1548d(this));
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<C2896a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<C2896a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<C2896a> onNewIntentListeners;
    private final CopyOnWriteArrayList<C2896a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<C2896a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    /* access modifiers changed from: private */
    public final e reportFullyDrawnExecutor;
    private final C2913e savedStateRegistryController;

    /* renamed from: androidx.activity.j$a */
    public static final class a implements C1795s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1554j f10798a;

        a(C1554j jVar) {
            this.f10798a = jVar;
        }

        public void f(C1798v vVar, C1790m.a aVar) {
            C6496s.h(vVar, "source");
            C6496s.h(aVar, "event");
            this.f10798a.q();
            this.f10798a.getLifecycle().d(this);
        }
    }

    /* renamed from: androidx.activity.j$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10799a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            C6496s.h(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            C6496s.g(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* renamed from: androidx.activity.j$c */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: androidx.activity.j$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private Object f10800a;

        /* renamed from: b  reason: collision with root package name */
        private d0 f10801b;

        public final Object a() {
            return this.f10800a;
        }

        public final d0 b() {
            return this.f10801b;
        }

        public final void c(Object obj) {
            this.f10800a = obj;
        }

        public final void d(d0 d0Var) {
            this.f10801b = d0Var;
        }
    }

    /* renamed from: androidx.activity.j$e */
    private interface e extends Executor {
        void h0(View view);

        void t();
    }

    /* renamed from: androidx.activity.j$f */
    private final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f10802a = (SystemClock.uptimeMillis() + ((long) 10000));

        /* renamed from: b  reason: collision with root package name */
        private Runnable f10803b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10804c;

        public f() {
        }

        /* access modifiers changed from: private */
        public static final void b(f fVar) {
            C6496s.h(fVar, "this$0");
            Runnable runnable = fVar.f10803b;
            if (runnable != null) {
                C6496s.e(runnable);
                runnable.run();
                fVar.f10803b = null;
            }
        }

        public void execute(Runnable runnable) {
            C6496s.h(runnable, "runnable");
            this.f10803b = runnable;
            View decorView = C1554j.this.getWindow().getDecorView();
            C6496s.g(decorView, "window.decorView");
            if (!this.f10804c) {
                decorView.postOnAnimation(new C1555k(this));
            } else if (C6496s.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void h0(View view) {
            C6496s.h(view, "view");
            if (!this.f10804c) {
                this.f10804c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void onDraw() {
            Runnable runnable = this.f10803b;
            if (runnable != null) {
                runnable.run();
                this.f10803b = null;
                if (C1554j.this.getFullyDrawnReporter().c()) {
                    this.f10804c = false;
                    C1554j.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f10802a) {
                this.f10804c = false;
                C1554j.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            C1554j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void t() {
            C1554j.this.getWindow().getDecorView().removeCallbacks(this);
            C1554j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: androidx.activity.j$g */
    public static final class g extends C2002e {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C1554j f10806i;

        g(C1554j jVar) {
            this.f10806i = jVar;
        }

        /* access modifiers changed from: private */
        public static final void s(g gVar, int i10, C2012a.C0351a aVar) {
            C6496s.h(gVar, "this$0");
            gVar.f(i10, aVar.a());
        }

        /* access modifiers changed from: private */
        public static final void t(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            C6496s.h(gVar, "this$0");
            C6496s.h(sendIntentException, "$e");
            gVar.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        public void i(int i10, C2012a aVar, Object obj, androidx.core.app.c cVar) {
            Bundle bundle;
            Bundle bundle2;
            C6496s.h(aVar, "contract");
            C1554j jVar = this.f10806i;
            C2012a.C0351a synchronousResult = aVar.getSynchronousResult(jVar, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new C1556l(this, i10, synchronousResult));
                return;
            }
            Intent createIntent = aVar.createIntent(jVar, obj);
            if (createIntent.getExtras() != null) {
                Bundle extras = createIntent.getExtras();
                C6496s.e(extras);
                if (extras.getClassLoader() == null) {
                    createIntent.setExtrasClassLoader(jVar.getClassLoader());
                }
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                if (cVar != null) {
                    bundle2 = cVar.b();
                } else {
                    bundle2 = null;
                }
                bundle = bundle2;
            }
            if (C6496s.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.h(jVar, stringArrayExtra, i10);
            } else if (C6496s.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", createIntent.getAction())) {
                C2004g gVar = (C2004g) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C6496s.e(gVar);
                    androidx.core.app.b.m(jVar, gVar.d(), i10, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new C1557m(this, i10, e10));
                }
            } else {
                androidx.core.app.b.l(jVar, createIntent, i10, bundle);
            }
        }
    }

    /* renamed from: androidx.activity.j$h */
    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1554j f10807a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C1554j jVar) {
            super(0);
            this.f10807a = jVar;
        }

        /* renamed from: a */
        public final W invoke() {
            Bundle bundle;
            Application application = this.f10807a.getApplication();
            C1554j jVar = this.f10807a;
            if (jVar.getIntent() != null) {
                bundle = this.f10807a.getIntent().getExtras();
            } else {
                bundle = null;
            }
            return new W(application, jVar, bundle);
        }
    }

    /* renamed from: androidx.activity.j$i */
    static final class i extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1554j f10808a;

        /* renamed from: androidx.activity.j$i$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1554j f10809a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1554j jVar) {
                super(0);
                this.f10809a = jVar;
            }

            public final void invoke() {
                this.f10809a.reportFullyDrawn();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C1554j jVar) {
            super(0);
            this.f10808a = jVar;
        }

        /* renamed from: a */
        public final E invoke() {
            return new E(this.f10808a.reportFullyDrawnExecutor, new a(this.f10808a));
        }
    }

    /* renamed from: androidx.activity.j$j  reason: collision with other inner class name */
    static final class C0208j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1554j f10810a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0208j(C1554j jVar) {
            super(0);
            this.f10810a = jVar;
        }

        /* access modifiers changed from: private */
        public static final void e(C1554j jVar) {
            C6496s.h(jVar, "this$0");
            try {
                C1554j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!C6496s.c(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!C6496s.c(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* access modifiers changed from: private */
        public static final void h(C1554j jVar, H h10) {
            C6496s.h(jVar, "this$0");
            C6496s.h(h10, "$dispatcher");
            jVar.n(h10);
        }

        /* renamed from: c */
        public final H invoke() {
            H h10 = new H(new C1558n(this.f10810a));
            C1554j jVar = this.f10810a;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!C6496s.c(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new C1559o(jVar, h10));
                } else {
                    jVar.n(h10);
                }
            }
            return h10;
        }
    }

    public C1554j() {
        C2913e a10 = C2913e.f28425d.a(this);
        this.savedStateRegistryController = a10;
        this.reportFullyDrawnExecutor = p();
        this.fullyDrawnReporter$delegate = C6531o.b(new i(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().a(new C1549e(this));
            getLifecycle().a(new C1550f(this));
            getLifecycle().a(new a(this));
            a10.c();
            T.c(this);
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new C1551g(this));
            addOnContextAvailableListener(new C1552h(this));
            this.defaultViewModelProviderFactory$delegate = C6531o.b(new h(this));
            this.onBackPressedDispatcher$delegate = C6531o.b(new C0208j(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* access modifiers changed from: private */
    public static final void j(C1554j jVar, C1798v vVar, C1790m.a aVar) {
        Window window;
        View peekDecorView;
        C6496s.h(jVar, "this$0");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_STOP && (window = jVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    /* access modifiers changed from: private */
    public static final void k(C1554j jVar, C1798v vVar, C1790m.a aVar) {
        C6496s.h(jVar, "this$0");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_DESTROY) {
            jVar.contextAwareHelper.b();
            if (!jVar.isChangingConfigurations()) {
                jVar.getViewModelStore().a();
            }
            jVar.reportFullyDrawnExecutor.t();
        }
    }

    /* access modifiers changed from: private */
    public static final Bundle l(C1554j jVar) {
        C6496s.h(jVar, "this$0");
        Bundle bundle = new Bundle();
        jVar.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public static final void m(C1554j jVar, Context context) {
        C6496s.h(jVar, "this$0");
        C6496s.h(context, "it");
        Bundle b10 = jVar.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b10 != null) {
            jVar.activityResultRegistry.j(b10);
        }
    }

    /* access modifiers changed from: private */
    public final void n(H h10) {
        getLifecycle().a(new C1553i(h10, this));
    }

    /* access modifiers changed from: private */
    public static final void o(H h10, C1554j jVar, C1798v vVar, C1790m.a aVar) {
        C6496s.h(h10, "$dispatcher");
        C6496s.h(jVar, "this$0");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_CREATE) {
            h10.o(b.f10799a.a(jVar));
        }
    }

    private final e p() {
        return new f();
    }

    /* access modifiers changed from: private */
    public final void q() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new d0();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void r(C1554j jVar) {
        C6496s.h(jVar, "this$0");
        jVar.invalidateMenu();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        eVar.h0(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(B b10) {
        C6496s.h(b10, "provider");
        this.menuHostHelper.c(b10);
    }

    public final void addOnConfigurationChangedListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(C1956b bVar) {
        C6496s.h(bVar, "listener");
        this.contextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        C6496s.h(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final C2002e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public Z1.a getDefaultViewModelCreationExtras() {
        Bundle bundle = null;
        Z1.b bVar = new Z1.b((Z1.a) null, 1, (DefaultConstructorMarker) null);
        if (getApplication() != null) {
            a.b bVar2 = c0.a.f17204h;
            Application application = getApplication();
            C6496s.g(application, "application");
            bVar.c(bVar2, application);
        }
        bVar.c(T.f17166a, this);
        bVar.c(T.f17167b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            bVar.c(T.f17168c, bundle);
        }
        return bVar;
    }

    public c0.c getDefaultViewModelProviderFactory() {
        return (c0.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public E getFullyDrawnReporter() {
        return (E) this.fullyDrawnReporter$delegate.getValue();
    }

    @C6521e
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public C1790m getLifecycle() {
        return super.getLifecycle();
    }

    public final H getOnBackPressedDispatcher() {
        return (H) this.onBackPressedDispatcher$delegate.getValue();
    }

    public final C2912d getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    public d0 getViewModelStore() {
        if (getApplication() != null) {
            q();
            d0 d0Var = this._viewModelStore;
            C6496s.e(d0Var);
            return d0Var;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        f0.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        C6496s.g(decorView2, "window.decorView");
        g0.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        C6496s.g(decorView3, "window.decorView");
        C2915g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        C6496s.g(decorView4, "window.decorView");
        O.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        C6496s.g(decorView5, "window.decorView");
        N.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @C6521e
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.activityResultRegistry.e(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @C6521e
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C6496s.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<C2896a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        M.f17152b.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        C6496s.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        C6496s.h(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.j(menuItem);
        }
        return false;
    }

    @C6521e
    public void onMultiWindowModeChanged(boolean z10) {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator<C2896a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C6496s.h(intent, "intent");
        super.onNewIntent(intent);
        Iterator<C2896a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        C6496s.h(menu, "menu");
        this.menuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    @C6521e
    public void onPictureInPictureModeChanged(boolean z10) {
        if (!this.dispatchingOnPictureInPictureModeChanged) {
            Iterator<C2896a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new v(z10));
            }
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        C6496s.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.k(menu);
        return true;
    }

    @C6521e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        C6496s.h(strArr, "permissions");
        C6496s.h(iArr, "grantResults");
        if (!this.activityResultRegistry.e(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @C6521e
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        d0 d0Var = this._viewModelStore;
        if (d0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            d0Var = dVar.b();
        }
        if (d0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(onRetainCustomNonConfigurationInstance);
        dVar2.d(d0Var);
        return dVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C6496s.h(bundle, "outState");
        if (getLifecycle() instanceof C1800x) {
            C1790m lifecycle = getLifecycle();
            C6496s.f(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1800x) lifecycle).n(C1790m.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<C2896a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> C2000c registerForActivityResult(C2012a aVar, C2002e eVar, C1999b bVar) {
        C6496s.h(aVar, "contract");
        C6496s.h(eVar, "registry");
        C6496s.h(bVar, "callback");
        return eVar.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(B b10) {
        C6496s.h(b10, "provider");
        this.menuHostHelper.l(b10);
    }

    public final void removeOnConfigurationChangedListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(C1956b bVar) {
        C6496s.h(bVar, "listener");
        this.contextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(C2896a aVar) {
        C6496s.h(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        C6496s.h(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    public void reportFullyDrawn() {
        try {
            if (D3.a.h()) {
                D3.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            D3.a.f();
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }

    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        eVar.h0(decorView);
        super.setContentView(i10);
    }

    @C6521e
    public void startActivityForResult(Intent intent, int i10) {
        C6496s.h(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @C6521e
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        C6496s.h(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public void addMenuProvider(B b10, C1798v vVar) {
        C6496s.h(b10, "provider");
        C6496s.h(vVar, "owner");
        this.menuHostHelper.d(b10, vVar);
    }

    @C6521e
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        C6496s.h(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @C6521e
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        C6496s.h(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(B b10, C1798v vVar, C1790m.b bVar) {
        C6496s.h(b10, "provider");
        C6496s.h(vVar, "owner");
        C6496s.h(bVar, "state");
        this.menuHostHelper.e(b10, vVar, bVar);
    }

    public final <I, O> C2000c registerForActivityResult(C2012a aVar, C1999b bVar) {
        C6496s.h(aVar, "contract");
        C6496s.h(bVar, "callback");
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        C6496s.h(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<C2896a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10, configuration));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        C6496s.h(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<C2896a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new v(z10, configuration));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        eVar.h0(decorView);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        eVar.h0(decorView);
        super.setContentView(view, layoutParams);
    }
}
