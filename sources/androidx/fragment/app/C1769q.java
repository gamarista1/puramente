package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.x;
import androidx.core.view.C1716u;
import androidx.lifecycle.B;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.D;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.revenuecat.purchases.common.Constants;
import g.C1999b;
import g.C2000c;
import g.C2002e;
import g.C2003f;
import h.C2012a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q.C2414a;
import x3.C2912d;
import x3.C2913e;
import x3.C2914f;
import x3.C2915g;

/* renamed from: androidx.fragment.app.q  reason: case insensitive filesystem */
public abstract class C1769q implements ComponentCallbacks, View.OnCreateContextMenuListener, C1798v, e0, C1788k, C2914f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    J mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    c0.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    J mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    A mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1800x mLifecycleRegistry;
    C1790m.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    C1769q mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    C2913e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    C1769q mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    X mViewLifecycleOwner;
    D mViewLifecycleOwnerLiveData;
    String mWho;

    /* renamed from: androidx.fragment.app.q$a */
    class a extends C2000c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicReference f17023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2012a f17024b;

        a(AtomicReference atomicReference, C2012a aVar) {
            this.f17023a = atomicReference;
            this.f17024b = aVar;
        }

        public C2012a a() {
            return this.f17024b;
        }

        public void c(Object obj, androidx.core.app.c cVar) {
            C2000c cVar2 = (C2000c) this.f17023a.get();
            if (cVar2 != null) {
                cVar2.c(obj, cVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        public void d() {
            C2000c cVar = (C2000c) this.f17023a.getAndSet((Object) null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    class b implements Runnable {
        b() {
        }

        public void run() {
            C1769q.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    class c extends m {
        c() {
            super((b) null);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            Bundle bundle;
            C1769q.this.mSavedStateRegistryController.c();
            T.c(C1769q.this);
            Bundle bundle2 = C1769q.this.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            C1769q.this.mSavedStateRegistryController.d(bundle);
        }
    }

    /* renamed from: androidx.fragment.app.q$d */
    class d implements Runnable {
        d() {
        }

        public void run() {
            C1769q.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.q$e */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f17029a;

        e(b0 b0Var) {
            this.f17029a = b0Var;
        }

        public void run() {
            if (this.f17029a.y()) {
                this.f17029a.n();
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$f */
    class f extends C1775x {
        f() {
        }

        public View c(int i10) {
            View view = C1769q.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + C1769q.this + " does not have a view");
        }

        public boolean d() {
            if (C1769q.this.mView != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.q$g */
    class g implements C1795s {
        g() {
        }

        public void f(C1798v vVar, C1790m.a aVar) {
            View view;
            if (aVar == C1790m.a.ON_STOP && (view = C1769q.this.mView) != null) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$h */
    class h implements C2414a {
        h() {
        }

        /* renamed from: a */
        public C2002e apply(Void voidR) {
            C1769q qVar = C1769q.this;
            A a10 = qVar.mHost;
            if (a10 instanceof C2003f) {
                return ((C2003f) a10).getActivityResultRegistry();
            }
            return qVar.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.q$i */
    class i implements C2414a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2002e f17034a;

        i(C2002e eVar) {
            this.f17034a = eVar;
        }

        /* renamed from: a */
        public C2002e apply(Void voidR) {
            return this.f17034a;
        }
    }

    /* renamed from: androidx.fragment.app.q$j */
    class j extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2414a f17036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f17037b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2012a f17038c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1999b f17039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C2414a aVar, AtomicReference atomicReference, C2012a aVar2, C1999b bVar) {
            super((b) null);
            this.f17036a = aVar;
            this.f17037b = atomicReference;
            this.f17038c = aVar2;
            this.f17039d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f17037b.set(((C2002e) this.f17036a.apply((Object) null)).l(C1769q.this.generateActivityResultKey(), C1769q.this, this.f17038c, this.f17039d));
        }
    }

    /* renamed from: androidx.fragment.app.q$k */
    static class k {

        /* renamed from: a  reason: collision with root package name */
        View f17041a;

        /* renamed from: b  reason: collision with root package name */
        boolean f17042b;

        /* renamed from: c  reason: collision with root package name */
        int f17043c;

        /* renamed from: d  reason: collision with root package name */
        int f17044d;

        /* renamed from: e  reason: collision with root package name */
        int f17045e;

        /* renamed from: f  reason: collision with root package name */
        int f17046f;

        /* renamed from: g  reason: collision with root package name */
        int f17047g;

        /* renamed from: h  reason: collision with root package name */
        ArrayList f17048h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList f17049i;

        /* renamed from: j  reason: collision with root package name */
        Object f17050j = null;

        /* renamed from: k  reason: collision with root package name */
        Object f17051k;

        /* renamed from: l  reason: collision with root package name */
        Object f17052l;

        /* renamed from: m  reason: collision with root package name */
        Object f17053m;

        /* renamed from: n  reason: collision with root package name */
        Object f17054n;

        /* renamed from: o  reason: collision with root package name */
        Object f17055o;

        /* renamed from: p  reason: collision with root package name */
        Boolean f17056p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f17057q;

        /* renamed from: r  reason: collision with root package name */
        float f17058r;

        /* renamed from: s  reason: collision with root package name */
        View f17059s;

        /* renamed from: t  reason: collision with root package name */
        boolean f17060t;

        k() {
            Object obj = C1769q.USE_DEFAULT_TRANSITION;
            this.f17051k = obj;
            this.f17052l = null;
            this.f17053m = obj;
            this.f17054n = null;
            this.f17055o = obj;
            this.f17058r = 1.0f;
            this.f17059s = null;
        }
    }

    /* renamed from: androidx.fragment.app.q$l */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.q$m */
    private static abstract class m {
        private m() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    /* renamed from: androidx.fragment.app.q$n */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final Bundle f17061a;

        /* renamed from: androidx.fragment.app.q$n$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            /* renamed from: c */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f17061a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f17061a);
        }
    }

    public C1769q() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new K();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = C1790m.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new D();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        w();
    }

    private void A(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void B() {
        Bundle bundle;
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            restoreViewState(bundle);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public static C1769q instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private k t() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int u() {
        C1790m.b bVar = this.mMaxState;
        if (bVar == C1790m.b.INITIALIZED || this.mParentFragment == null) {
            return bVar.ordinal();
        }
        return Math.min(bVar.ordinal(), this.mParentFragment.u());
    }

    private C1769q v(boolean z10) {
        String str;
        if (z10) {
            T1.c.j(this);
        }
        C1769q qVar = this.mTarget;
        if (qVar != null) {
            return qVar;
        }
        J j10 = this.mFragmentManager;
        if (j10 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return j10.h0(str);
    }

    private void w() {
        this.mLifecycleRegistry = new C1800x(this);
        this.mSavedStateRegistryController = C2913e.a(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            A(this.mSavedStateAttachListener);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private C2000c z(C2012a aVar, C2414a aVar2, C1999b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            A(new j(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        J j10;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f17060t = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (j10 = this.mFragmentManager) != null) {
            b0 u10 = b0.u(viewGroup, j10);
            u10.z();
            if (z10) {
                this.mHost.h().post(new e(u10));
            } else {
                u10.n();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1775x createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        C1769q v10 = v(false);
        if (v10 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(v10);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        J j10 = this.mChildFragmentManager;
        j10.Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public C1769q findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.m0(str);
    }

    /* access modifiers changed from: package-private */
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final C1773v getActivity() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return (C1773v) a10.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f17057q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f17056p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17041a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final J getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.f();
    }

    public Z1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && J.L0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        Z1.b bVar = new Z1.b();
        if (application != null) {
            bVar.c(c0.a.f17204h, application);
        }
        bVar.c(T.f17166a, this);
        bVar.c(T.f17167b, this);
        if (getArguments() != null) {
            bVar.c(T.f17168c, getArguments());
        }
        return bVar;
    }

    public c0.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && J.L0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new W(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17043c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17050j;
    }

    /* access modifiers changed from: package-private */
    public x getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17044d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17052l;
    }

    /* access modifiers changed from: package-private */
    public x getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    /* access modifiers changed from: package-private */
    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17059s;
    }

    @Deprecated
    public final J getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public C1790m getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17047g;
    }

    public final C1769q getParentFragment() {
        return this.mParentFragment;
    }

    public final J getParentFragmentManager() {
        J j10 = this.mFragmentManager;
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f17042b;
    }

    /* access modifiers changed from: package-private */
    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17045e;
    }

    /* access modifiers changed from: package-private */
    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17046f;
    }

    /* access modifiers changed from: package-private */
    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f17058r;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17053m;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        T1.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17051k;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    public final C2912d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17054n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17055o;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (arrayList = kVar.f17048h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (arrayList = kVar.f17049i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final C1769q getTargetFragment() {
        return v(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        T1.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C1798v getViewLifecycleOwner() {
        X x10 = this.mViewLifecycleOwner;
        if (x10 != null) {
            return x10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public B getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public d0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (u() != C1790m.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.G0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        w();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new K();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        J j10;
        if (this.mHidden || ((j10 = this.mFragmentManager) != null && j10.O0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        J j10;
        if (!this.mMenuVisible || ((j10 = this.mFragmentManager) != null && !j10.P0(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f17060t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        J j10 = this.mFragmentManager;
        if (j10 == null) {
            return false;
        }
        return j10.S0();
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.d1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (J.L0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity e10 = a10 == null ? null : a10.e();
        if (e10 != null) {
            this.mCalled = false;
            onAttach(e10);
        }
    }

    @Deprecated
    public void onAttachFragment(C1769q qVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (!this.mChildFragmentManager.R0(1)) {
            this.mChildFragmentManager.D();
        }
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity e10 = a10 == null ? null : a10.e();
        if (e10 != null) {
            this.mCalled = false;
            onInflate(e10, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.d1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            B();
            this.mChildFragmentManager.z();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.J(this);
            this.mChildFragmentManager.A();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.C(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.d1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(C1790m.a.ON_CREATE);
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.E(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.d1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new X(this, getViewModelStore(), new C1768p(this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            if (J.L0(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            f0.b(this.mView, this.mViewLifecycleOwner);
            g0.b(this.mView, this.mViewLifecycleOwner);
            C2915g.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.n(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.F();
        this.mLifecycleRegistry.i(C1790m.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().b(C1790m.b.CREATED)) {
            this.mViewLifecycleOwner.a(C1790m.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.K0()) {
            this.mChildFragmentManager.F();
            this.mChildFragmentManager = new K();
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.L(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.M(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.O();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(C1790m.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(C1790m.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.Q(menu);
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean Q02 = this.mFragmentManager.Q0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != Q02) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(Q02);
            onPrimaryNavigationFragmentChanged(Q02);
            this.mChildFragmentManager.R();
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.d1();
        this.mChildFragmentManager.c0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C1800x xVar = this.mLifecycleRegistry;
            C1790m.a aVar = C1790m.a.ON_RESUME;
            xVar.i(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(aVar);
            }
            this.mChildFragmentManager.S();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.d1();
        this.mChildFragmentManager.c0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C1800x xVar = this.mLifecycleRegistry;
            C1790m.a aVar = C1790m.a.ON_START;
            xVar.i(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(aVar);
            }
            this.mChildFragmentManager.T();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.V();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(C1790m.a.ON_STOP);
        }
        this.mLifecycleRegistry.i(C1790m.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.W();
    }

    public void postponeEnterTransition() {
        t().f17060t = true;
    }

    public final <I, O> C2000c registerForActivityResult(C2012a aVar, C1999b bVar) {
        return z(aVar, new h(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().Z0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final C1773v requireActivity() {
        C1773v activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final J requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final C1769q requireParentFragment() {
        C1769q parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.s1(bundle);
            this.mChildFragmentManager.D();
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(C1790m.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        t().f17057q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        t().f17056p = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: package-private */
    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            t().f17043c = i10;
            t().f17044d = i11;
            t().f17045e = i12;
            t().f17046f = i13;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(x xVar) {
        t().getClass();
    }

    public void setEnterTransition(Object obj) {
        t().f17050j = obj;
    }

    public void setExitSharedElementCallback(x xVar) {
        t().getClass();
    }

    public void setExitTransition(Object obj) {
        t().f17052l = obj;
    }

    /* access modifiers changed from: package-private */
    public void setFocusedView(View view) {
        t().f17059s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (nVar == null || (bundle = nVar.f17061a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i10) {
        if (this.mAnimationInfo != null || i10 != 0) {
            t();
            this.mAnimationInfo.f17047g = i10;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo != null) {
            t().f17042b = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPostOnViewCreatedAlpha(float f10) {
        t().f17058r = f10;
    }

    public void setReenterTransition(Object obj) {
        t().f17053m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        T1.c.k(this);
        this.mRetainInstance = z10;
        J j10 = this.mFragmentManager;
        if (j10 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            j10.l(this);
        } else {
            j10.q1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        t().f17051k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        t().f17054n = obj;
    }

    /* access modifiers changed from: package-private */
    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        t();
        k kVar = this.mAnimationInfo;
        kVar.f17048h = arrayList;
        kVar.f17049i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        t().f17055o = obj;
    }

    @Deprecated
    public void setTargetFragment(C1769q qVar, int i10) {
        J j10;
        if (qVar != null) {
            T1.c.l(this, qVar, i10);
        }
        J j11 = this.mFragmentManager;
        if (qVar != null) {
            j10 = qVar.mFragmentManager;
        } else {
            j10 = null;
        }
        if (j11 == null || j10 == null || j11 == j10) {
            C1769q qVar2 = qVar;
            while (qVar2 != null) {
                if (!qVar2.equals(this)) {
                    qVar2 = qVar2.v(false);
                } else {
                    throw new IllegalArgumentException("Setting " + qVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (qVar == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || qVar.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = qVar;
            } else {
                this.mTargetWho = qVar.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i10;
            return;
        }
        throw new IllegalArgumentException("Fragment " + qVar + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        boolean z11;
        T1.c.m(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            J j10 = this.mFragmentManager;
            j10.f1(j10.x(this));
        }
        this.mUserVisibleHint = z10;
        if (this.mState >= 5 || z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        A a10 = this.mHost;
        if (a10 != null) {
            return a10.m(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.mHost != null) {
            if (J.L0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(this);
                sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i14 = i10;
                sb2.append(i10);
                sb2.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb2.append(intentSender);
                sb2.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb2.append(intent);
                sb2.append(" options: ");
                sb2.append(bundle);
                Log.v("FragmentManager", sb2.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i15 = i10;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().b1(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && t().f17060t) {
            if (this.mHost == null) {
                t().f17060t = false;
            } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
                this.mHost.h().postAtFrontOfQueue(new d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @Deprecated
    public static C1769q instantiate(Context context, String str, Bundle bundle) {
        try {
            C1769q qVar = (C1769q) C1777z.d(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
            if (bundle != null) {
                bundle.setClassLoader(qVar.getClass().getClassLoader());
                qVar.setArguments(bundle);
            }
            return qVar;
        } catch (InstantiationException e10) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        t().f17060t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        J j11 = this.mFragmentManager;
        if (j11 != null) {
            this.mPostponedHandler = j11.y0().h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> C2000c registerForActivityResult(C2012a aVar, C2002e eVar, C1999b bVar) {
        return z(aVar, new i(eVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            a10.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().a1(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            LayoutInflater k10 = a10.k();
            C1716u.a(k10, this.mChildFragmentManager.z0());
            return k10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public C1769q(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
