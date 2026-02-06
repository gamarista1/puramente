package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C1554j;
import androidx.activity.H;
import androidx.activity.K;
import androidx.core.app.b;
import androidx.core.app.s;
import androidx.core.app.t;
import androidx.core.app.x;
import androidx.core.content.f;
import androidx.core.content.g;
import androidx.core.view.B;
import androidx.core.view.C1720w;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import g.C2002e;
import g.C2003f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x1.C2896a;
import x3.C2912d;
import x3.C2914f;

/* renamed from: androidx.fragment.app.v  reason: case insensitive filesystem */
public abstract class C1773v extends C1554j implements b.f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1800x mFragmentLifecycleRegistry = new C1800x(this);
    final C1776y mFragments = C1776y.b(new a());
    boolean mResumed;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.v$a */
    class a extends A implements f, g, s, t, e0, K, C2003f, C2914f, N, C1720w {
        public a() {
            super(C1773v.this);
        }

        public void a(J j10, C1769q qVar) {
            C1773v.this.onAttachFragment(qVar);
        }

        public void addMenuProvider(B b10) {
            C1773v.this.addMenuProvider(b10);
        }

        public void addOnConfigurationChangedListener(C2896a aVar) {
            C1773v.this.addOnConfigurationChangedListener(aVar);
        }

        public void addOnMultiWindowModeChangedListener(C2896a aVar) {
            C1773v.this.addOnMultiWindowModeChangedListener(aVar);
        }

        public void addOnPictureInPictureModeChangedListener(C2896a aVar) {
            C1773v.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        public void addOnTrimMemoryListener(C2896a aVar) {
            C1773v.this.addOnTrimMemoryListener(aVar);
        }

        public View c(int i10) {
            return C1773v.this.findViewById(i10);
        }

        public boolean d() {
            Window window = C1773v.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public C2002e getActivityResultRegistry() {
            return C1773v.this.getActivityResultRegistry();
        }

        public C1790m getLifecycle() {
            return C1773v.this.mFragmentLifecycleRegistry;
        }

        public H getOnBackPressedDispatcher() {
            return C1773v.this.getOnBackPressedDispatcher();
        }

        public C2912d getSavedStateRegistry() {
            return C1773v.this.getSavedStateRegistry();
        }

        public d0 getViewModelStore() {
            return C1773v.this.getViewModelStore();
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C1773v.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater k() {
            return C1773v.this.getLayoutInflater().cloneInContext(C1773v.this);
        }

        public boolean m(String str) {
            return b.k(C1773v.this, str);
        }

        public void p() {
            q();
        }

        public void q() {
            C1773v.this.invalidateMenu();
        }

        /* renamed from: r */
        public C1773v j() {
            return C1773v.this;
        }

        public void removeMenuProvider(B b10) {
            C1773v.this.removeMenuProvider(b10);
        }

        public void removeOnConfigurationChangedListener(C2896a aVar) {
            C1773v.this.removeOnConfigurationChangedListener(aVar);
        }

        public void removeOnMultiWindowModeChangedListener(C2896a aVar) {
            C1773v.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        public void removeOnPictureInPictureModeChangedListener(C2896a aVar) {
            C1773v.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        public void removeOnTrimMemoryListener(C2896a aVar) {
            C1773v.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public C1773v() {
        w();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(Context context) {
        this.mFragments.a((C1769q) null);
    }

    private static boolean B(J j10, C1790m.b bVar) {
        boolean z10 = false;
        for (C1769q qVar : j10.x0()) {
            if (qVar != null) {
                if (qVar.getHost() != null) {
                    z10 |= B(qVar.getChildFragmentManager(), bVar);
                }
                X x10 = qVar.mViewLifecycleOwner;
                if (x10 != null && x10.getLifecycle().b().b(C1790m.b.STARTED)) {
                    qVar.mViewLifecycleOwner.f(bVar);
                    z10 = true;
                }
                if (qVar.mLifecycleRegistry.b().b(C1790m.b.STARTED)) {
                    qVar.mLifecycleRegistry.n(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private void w() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new r(this));
        addOnConfigurationChangedListener(new C1770s(this));
        addOnNewIntentListener(new C1771t(this));
        addOnContextAvailableListener(new C1772u(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle x() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(Configuration configuration) {
        this.mFragments.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(Intent intent) {
        this.mFragments.m();
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public J getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (B(getSupportFragmentManager(), C1790m.b.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(C1769q qVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_CREATE);
        this.mFragments.e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_RESUME);
        this.mFragments.h();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_START);
        this.mFragments.i();
    }

    public void onStateNotSaved() {
        this.mFragments.m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(C1790m.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(x xVar) {
        b.i(this, xVar);
    }

    public void setExitSharedElementCallback(x xVar) {
        b.j(this, xVar);
    }

    public void startActivityFromFragment(C1769q qVar, Intent intent, int i10) {
        startActivityFromFragment(qVar, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(C1769q qVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            b.m(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            qVar.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        b.c(this);
    }

    public void supportPostponeEnterTransition() {
        b.f(this);
    }

    public void supportStartPostponedEnterTransition() {
        b.n(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(C1769q qVar, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            b.l(this, intent, -1, bundle);
        } else {
            qVar.startActivityForResult(intent, i10, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
