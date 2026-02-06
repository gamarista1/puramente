package androidx.fragment.app;

import T1.c;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1680b0;
import androidx.fragment.app.b0;
import androidx.lifecycle.e0;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.metrics.MetricTracker;

class Q {

    /* renamed from: a  reason: collision with root package name */
    private final C f16801a;

    /* renamed from: b  reason: collision with root package name */
    private final S f16802b;

    /* renamed from: c  reason: collision with root package name */
    private final C1769q f16803c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16804d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f16805e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f16806a;

        a(View view) {
            this.f16806a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f16806a.removeOnAttachStateChangeListener(this);
            C1680b0.l0(this.f16806a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16808a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.m$b[] r0 = androidx.lifecycle.C1790m.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16808a = r0
                androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16808a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16808a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16808a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.m$b r1 = androidx.lifecycle.C1790m.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Q.b.<clinit>():void");
        }
    }

    Q(C c10, S s10, C1769q qVar) {
        this.f16801a = c10;
        this.f16802b = s10;
        this.f16803c = qVar;
    }

    private boolean l(View view) {
        if (view == this.f16803c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f16803c.mView) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Bundle bundle;
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f16803c);
        }
        Bundle bundle2 = this.f16803c.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        this.f16803c.performActivityCreated(bundle);
        this.f16801a.a(this.f16803c, bundle, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        C1769q o02 = J.o0(this.f16803c.mContainer);
        C1769q parentFragment = this.f16803c.getParentFragment();
        if (o02 != null && !o02.equals(parentFragment)) {
            C1769q qVar = this.f16803c;
            c.o(qVar, o02, qVar.mContainerId);
        }
        int j10 = this.f16802b.j(this.f16803c);
        C1769q qVar2 = this.f16803c;
        qVar2.mContainer.addView(qVar2.mView, j10);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f16803c);
        }
        C1769q qVar = this.f16803c;
        C1769q qVar2 = qVar.mTarget;
        Q q10 = null;
        if (qVar2 != null) {
            Q n10 = this.f16802b.n(qVar2.mWho);
            if (n10 != null) {
                C1769q qVar3 = this.f16803c;
                qVar3.mTargetWho = qVar3.mTarget.mWho;
                qVar3.mTarget = null;
                q10 = n10;
            } else {
                throw new IllegalStateException("Fragment " + this.f16803c + " declared target fragment " + this.f16803c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = qVar.mTargetWho;
            if (str != null && (q10 = this.f16802b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f16803c + " declared target fragment " + this.f16803c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (q10 != null) {
            q10.m();
        }
        C1769q qVar4 = this.f16803c;
        qVar4.mHost = qVar4.mFragmentManager.y0();
        C1769q qVar5 = this.f16803c;
        qVar5.mParentFragment = qVar5.mFragmentManager.B0();
        this.f16801a.g(this.f16803c, false);
        this.f16803c.performAttach();
        this.f16801a.b(this.f16803c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        b0.d.a aVar;
        C1769q qVar = this.f16803c;
        if (qVar.mFragmentManager == null) {
            return qVar.mState;
        }
        int i10 = this.f16805e;
        int i11 = b.f16808a[qVar.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = Math.min(i10, 5);
            } else if (i11 == 3) {
                i10 = Math.min(i10, 1);
            } else if (i11 != 4) {
                i10 = Math.min(i10, -1);
            } else {
                i10 = Math.min(i10, 0);
            }
        }
        C1769q qVar2 = this.f16803c;
        if (qVar2.mFromLayout) {
            if (qVar2.mInLayout) {
                i10 = Math.max(this.f16805e, 2);
                View view = this.f16803c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f16805e < 4 ? Math.min(i10, qVar2.mState) : Math.min(i10, 1);
            }
        }
        C1769q qVar3 = this.f16803c;
        if (qVar3.mInDynamicContainer && qVar3.mContainer == null) {
            i10 = Math.min(i10, 4);
        }
        if (!this.f16803c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        C1769q qVar4 = this.f16803c;
        ViewGroup viewGroup = qVar4.mContainer;
        if (viewGroup != null) {
            aVar = b0.u(viewGroup, qVar4.getParentFragmentManager()).s(this);
        } else {
            aVar = null;
        }
        if (aVar == b0.d.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (aVar == b0.d.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            C1769q qVar5 = this.f16803c;
            if (qVar5.mRemoving) {
                if (qVar5.isInBackStack()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        C1769q qVar6 = this.f16803c;
        if (qVar6.mDeferStart && qVar6.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (this.f16803c.mTransitioning) {
            i10 = Math.max(i10, 3);
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f16803c);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        Bundle bundle;
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f16803c);
        }
        Bundle bundle2 = this.f16803c.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        C1769q qVar = this.f16803c;
        if (!qVar.mIsCreated) {
            this.f16801a.h(qVar, bundle, false);
            this.f16803c.performCreate(bundle);
            this.f16801a.c(this.f16803c, bundle, false);
            return;
        }
        qVar.mState = 1;
        qVar.restoreChildFragmentState();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Bundle bundle;
        String str;
        if (!this.f16803c.mFromLayout) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f16803c);
            }
            Bundle bundle2 = this.f16803c.mSavedFragmentState;
            ViewGroup viewGroup = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater performGetLayoutInflater = this.f16803c.performGetLayoutInflater(bundle);
            C1769q qVar = this.f16803c;
            ViewGroup viewGroup2 = qVar.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = qVar.mContainerId;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) qVar.mFragmentManager.u0().c(this.f16803c.mContainerId);
                        if (viewGroup == null) {
                            C1769q qVar2 = this.f16803c;
                            if (!qVar2.mRestored && !qVar2.mInDynamicContainer) {
                                try {
                                    str = qVar2.getResources().getResourceName(this.f16803c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f16803c.mContainerId) + " (" + str + ") for fragment " + this.f16803c);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            c.n(this.f16803c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f16803c + " for a container view with no id");
                    }
                }
            }
            C1769q qVar3 = this.f16803c;
            qVar3.mContainer = viewGroup;
            qVar3.performCreateView(performGetLayoutInflater, viewGroup, bundle);
            if (this.f16803c.mView != null) {
                if (J.L0(3)) {
                    Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f16803c);
                }
                this.f16803c.mView.setSaveFromParentEnabled(false);
                C1769q qVar4 = this.f16803c;
                qVar4.mView.setTag(S1.b.f5842a, qVar4);
                if (viewGroup != null) {
                    b();
                }
                C1769q qVar5 = this.f16803c;
                if (qVar5.mHidden) {
                    qVar5.mView.setVisibility(8);
                }
                if (this.f16803c.mView.isAttachedToWindow()) {
                    C1680b0.l0(this.f16803c.mView);
                } else {
                    View view = this.f16803c.mView;
                    view.addOnAttachStateChangeListener(new a(view));
                }
                this.f16803c.performViewCreated();
                C c10 = this.f16801a;
                C1769q qVar6 = this.f16803c;
                c10.m(qVar6, qVar6.mView, bundle, false);
                int visibility = this.f16803c.mView.getVisibility();
                this.f16803c.setPostOnViewCreatedAlpha(this.f16803c.mView.getAlpha());
                C1769q qVar7 = this.f16803c;
                if (qVar7.mContainer != null && visibility == 0) {
                    View findFocus = qVar7.mView.findFocus();
                    if (findFocus != null) {
                        this.f16803c.setFocusedView(findFocus);
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f16803c);
                        }
                    }
                    this.f16803c.mView.setAlpha(0.0f);
                }
            }
            this.f16803c.mState = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z10;
        C1769q f10;
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f16803c);
        }
        C1769q qVar = this.f16803c;
        boolean z11 = true;
        if (!qVar.mRemoving || qVar.isInBackStack()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            C1769q qVar2 = this.f16803c;
            if (!qVar2.mBeingSaved) {
                this.f16802b.B(qVar2.mWho, (Bundle) null);
            }
        }
        if (z10 || this.f16802b.p().n(this.f16803c)) {
            A a10 = this.f16803c.mHost;
            if (a10 instanceof e0) {
                z11 = this.f16802b.p().k();
            } else if (a10.f() instanceof Activity) {
                z11 = true ^ ((Activity) a10.f()).isChangingConfigurations();
            }
            if ((z10 && !this.f16803c.mBeingSaved) || z11) {
                this.f16802b.p().c(this.f16803c, false);
            }
            this.f16803c.performDestroy();
            this.f16801a.d(this.f16803c, false);
            for (Q q10 : this.f16802b.k()) {
                if (q10 != null) {
                    C1769q k10 = q10.k();
                    if (this.f16803c.mWho.equals(k10.mTargetWho)) {
                        k10.mTarget = this.f16803c;
                        k10.mTargetWho = null;
                    }
                }
            }
            C1769q qVar3 = this.f16803c;
            String str = qVar3.mTargetWho;
            if (str != null) {
                qVar3.mTarget = this.f16802b.f(str);
            }
            this.f16802b.s(this);
            return;
        }
        String str2 = this.f16803c.mTargetWho;
        if (!(str2 == null || (f10 = this.f16802b.f(str2)) == null || !f10.mRetainInstance)) {
            this.f16803c.mTarget = f10;
        }
        this.f16803c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f16803c);
        }
        C1769q qVar = this.f16803c;
        ViewGroup viewGroup = qVar.mContainer;
        if (!(viewGroup == null || (view = qVar.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f16803c.performDestroyView();
        this.f16801a.n(this.f16803c, false);
        C1769q qVar2 = this.f16803c;
        qVar2.mContainer = null;
        qVar2.mView = null;
        qVar2.mViewLifecycleOwner = null;
        qVar2.mViewLifecycleOwnerLiveData.n((Object) null);
        this.f16803c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f16803c);
        }
        this.f16803c.performDetach();
        this.f16801a.e(this.f16803c, false);
        C1769q qVar = this.f16803c;
        qVar.mState = -1;
        qVar.mHost = null;
        qVar.mParentFragment = null;
        qVar.mFragmentManager = null;
        if ((qVar.mRemoving && !qVar.isInBackStack()) || this.f16802b.p().n(this.f16803c)) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f16803c);
            }
            this.f16803c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Bundle bundle;
        C1769q qVar = this.f16803c;
        if (qVar.mFromLayout && qVar.mInLayout && !qVar.mPerformedCreateView) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f16803c);
            }
            Bundle bundle2 = this.f16803c.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            C1769q qVar2 = this.f16803c;
            qVar2.performCreateView(qVar2.performGetLayoutInflater(bundle), (ViewGroup) null, bundle);
            View view = this.f16803c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                C1769q qVar3 = this.f16803c;
                qVar3.mView.setTag(S1.b.f5842a, qVar3);
                C1769q qVar4 = this.f16803c;
                if (qVar4.mHidden) {
                    qVar4.mView.setVisibility(8);
                }
                this.f16803c.performViewCreated();
                C c10 = this.f16801a;
                C1769q qVar5 = this.f16803c;
                c10.m(qVar5, qVar5.mView, bundle, false);
                this.f16803c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1769q k() {
        return this.f16803c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f16804d) {
            try {
                this.f16804d = true;
                boolean z10 = false;
                while (true) {
                    int d10 = d();
                    C1769q qVar = this.f16803c;
                    int i10 = qVar.mState;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (qVar.mBeingSaved && this.f16802b.q(qVar.mWho) == null) {
                                        this.f16802b.B(this.f16803c.mWho, q());
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f16803c.mState = 1;
                                    break;
                                case 2:
                                    qVar.mInLayout = false;
                                    qVar.mState = 2;
                                    break;
                                case 3:
                                    if (J.L0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f16803c);
                                    }
                                    C1769q qVar2 = this.f16803c;
                                    if (qVar2.mBeingSaved) {
                                        this.f16802b.B(qVar2.mWho, q());
                                    } else if (qVar2.mView != null && qVar2.mSavedViewState == null) {
                                        r();
                                    }
                                    C1769q qVar3 = this.f16803c;
                                    if (!(qVar3.mView == null || (viewGroup2 = qVar3.mContainer) == null)) {
                                        b0.u(viewGroup2, qVar3.getParentFragmentManager()).l(this);
                                    }
                                    this.f16803c.mState = 3;
                                    break;
                                case 4:
                                    u();
                                    break;
                                case 5:
                                    qVar.mState = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(qVar.mView == null || (viewGroup3 = qVar.mContainer) == null)) {
                                        b0.u(viewGroup3, qVar.getParentFragmentManager()).j(b0.d.b.c(this.f16803c.mView.getVisibility()), this);
                                    }
                                    this.f16803c.mState = 4;
                                    break;
                                case 5:
                                    t();
                                    break;
                                case 6:
                                    qVar.mState = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                        z10 = true;
                    } else {
                        if (!z10 && i10 == -1 && qVar.mRemoving && !qVar.isInBackStack() && !this.f16803c.mBeingSaved) {
                            if (J.L0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f16803c);
                            }
                            this.f16802b.p().c(this.f16803c, true);
                            this.f16802b.s(this);
                            if (J.L0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f16803c);
                            }
                            this.f16803c.initState();
                        }
                        C1769q qVar4 = this.f16803c;
                        if (qVar4.mHiddenChanged) {
                            if (!(qVar4.mView == null || (viewGroup = qVar4.mContainer) == null)) {
                                b0 u10 = b0.u(viewGroup, qVar4.getParentFragmentManager());
                                if (this.f16803c.mHidden) {
                                    u10.k(this);
                                } else {
                                    u10.m(this);
                                }
                            }
                            C1769q qVar5 = this.f16803c;
                            J j10 = qVar5.mFragmentManager;
                            if (j10 != null) {
                                j10.J0(qVar5);
                            }
                            C1769q qVar6 = this.f16803c;
                            qVar6.mHiddenChanged = false;
                            qVar6.onHiddenChanged(qVar6.mHidden);
                            this.f16803c.mChildFragmentManager.K();
                        }
                        this.f16804d = false;
                        return;
                    }
                }
            } catch (Throwable th2) {
                this.f16804d = false;
                throw th2;
            }
        } else if (J.L0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f16803c);
        }
        this.f16803c.performPause();
        this.f16801a.f(this.f16803c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f16803c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.f16803c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                this.f16803c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                C1769q qVar = this.f16803c;
                qVar.mSavedViewState = qVar.mSavedFragmentState.getSparseParcelableArray("viewState");
                C1769q qVar2 = this.f16803c;
                qVar2.mSavedViewRegistryState = qVar2.mSavedFragmentState.getBundle("viewRegistryState");
                P p10 = (P) this.f16803c.mSavedFragmentState.getParcelable("state");
                if (p10 != null) {
                    C1769q qVar3 = this.f16803c;
                    qVar3.mTargetWho = p10.f16798m;
                    qVar3.mTargetRequestCode = p10.f16799n;
                    Boolean bool = qVar3.mSavedUserVisibleHint;
                    if (bool != null) {
                        qVar3.mUserVisibleHint = bool.booleanValue();
                        this.f16803c.mSavedUserVisibleHint = null;
                    } else {
                        qVar3.mUserVisibleHint = p10.f16800o;
                    }
                }
                C1769q qVar4 = this.f16803c;
                if (!qVar4.mUserVisibleHint) {
                    qVar4.mDeferStart = true;
                }
            } catch (BadParcelableException e10) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        String str;
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f16803c);
        }
        View focusedView = this.f16803c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (J.L0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = MetricTracker.Action.FAILED;
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f16803c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f16803c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f16803c.setFocusedView((View) null);
        this.f16803c.performResume();
        this.f16801a.i(this.f16803c, false);
        this.f16802b.B(this.f16803c.mWho, (Bundle) null);
        C1769q qVar = this.f16803c;
        qVar.mSavedFragmentState = null;
        qVar.mSavedViewState = null;
        qVar.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        C1769q qVar = this.f16803c;
        if (qVar.mState == -1 && (bundle = qVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new P(this.f16803c));
        if (this.f16803c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f16803c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f16801a.j(this.f16803c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f16803c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle u12 = this.f16803c.mChildFragmentManager.T0();
            if (!u12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", u12);
            }
            if (this.f16803c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f16803c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f16803c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f16803c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (this.f16803c.mView != null) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f16803c + " with view " + this.f16803c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f16803c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f16803c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f16803c.mViewLifecycleOwner.e(bundle);
            if (!bundle.isEmpty()) {
                this.f16803c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        this.f16805e = i10;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f16803c);
        }
        this.f16803c.performStart();
        this.f16801a.k(this.f16803c, false);
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f16803c);
        }
        this.f16803c.performStop();
        this.f16801a.l(this.f16803c, false);
    }

    Q(C c10, S s10, ClassLoader classLoader, C1777z zVar, Bundle bundle) {
        this.f16801a = c10;
        this.f16802b = s10;
        C1769q a10 = ((P) bundle.getParcelable("state")).a(zVar, classLoader);
        this.f16803c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (J.L0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    Q(C c10, S s10, C1769q qVar, Bundle bundle) {
        this.f16801a = c10;
        this.f16802b = s10;
        this.f16803c = qVar;
        qVar.mSavedViewState = null;
        qVar.mSavedViewRegistryState = null;
        qVar.mBackStackNesting = 0;
        qVar.mInLayout = false;
        qVar.mAdded = false;
        C1769q qVar2 = qVar.mTarget;
        qVar.mTargetWho = qVar2 != null ? qVar2.mWho : null;
        qVar.mTarget = null;
        qVar.mSavedFragmentState = bundle;
        qVar.mArguments = bundle.getBundle("arguments");
    }
}
