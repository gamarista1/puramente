package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.r;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.E;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import x3.C2915g;

/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
public class C1767o extends C1769q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private Handler f17000a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f17001b = new a();

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnCancelListener f17002c = new b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public DialogInterface.OnDismissListener f17003d = new c();

    /* renamed from: e  reason: collision with root package name */
    private int f17004e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f17005f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17006g = true;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f17007h = true;

    /* renamed from: i  reason: collision with root package name */
    private int f17008i = -1;

    /* renamed from: j  reason: collision with root package name */
    private boolean f17009j;

    /* renamed from: k  reason: collision with root package name */
    private E f17010k = new d();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Dialog f17011l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17012m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17013n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f17014o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17015p = false;

    /* renamed from: androidx.fragment.app.o$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C1767o.this.f17003d.onDismiss(C1767o.this.f17011l);
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (C1767o.this.f17011l != null) {
                C1767o oVar = C1767o.this;
                oVar.onCancel(oVar.f17011l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (C1767o.this.f17011l != null) {
                C1767o oVar = C1767o.this;
                oVar.onDismiss(oVar.f17011l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    class d implements E {
        d() {
        }

        /* renamed from: b */
        public void a(C1798v vVar) {
            if (vVar != null && C1767o.this.f17007h) {
                View requireView = C1767o.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C1767o.this.f17011l != null) {
                    if (J.L0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C1767o.this.f17011l);
                    }
                    C1767o.this.f17011l.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$e */
    class e extends C1775x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1775x f17020a;

        e(C1775x xVar) {
            this.f17020a = xVar;
        }

        public View c(int i10) {
            if (this.f17020a.d()) {
                return this.f17020a.c(i10);
            }
            return C1767o.this.L(i10);
        }

        public boolean d() {
            if (this.f17020a.d() || C1767o.this.M()) {
                return true;
            }
            return false;
        }
    }

    private void G(boolean z10, boolean z11, boolean z12) {
        if (!this.f17013n) {
            this.f17013n = true;
            this.f17014o = false;
            Dialog dialog = this.f17011l;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f17011l.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.f17000a.getLooper()) {
                        onDismiss(this.f17011l);
                    } else {
                        this.f17000a.post(this.f17001b);
                    }
                }
            }
            this.f17012m = true;
            if (this.f17008i >= 0) {
                if (z12) {
                    getParentFragmentManager().i1(this.f17008i, 1);
                } else {
                    getParentFragmentManager().g1(this.f17008i, 1, z10);
                }
                this.f17008i = -1;
                return;
            }
            T p10 = getParentFragmentManager().p();
            p10.w(true);
            p10.o(this);
            if (z12) {
                p10.j();
            } else if (z10) {
                p10.i();
            } else {
                p10.h();
            }
        }
    }

    private void N(Bundle bundle) {
        if (this.f17007h && !this.f17015p) {
            try {
                this.f17009j = true;
                Dialog K10 = K(bundle);
                this.f17011l = K10;
                if (this.f17007h) {
                    S(K10, this.f17004e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f17011l.setOwnerActivity((Activity) context);
                    }
                    this.f17011l.setCancelable(this.f17006g);
                    this.f17011l.setOnCancelListener(this.f17002c);
                    this.f17011l.setOnDismissListener(this.f17003d);
                    this.f17015p = true;
                } else {
                    this.f17011l = null;
                }
            } finally {
                this.f17009j = false;
            }
        }
    }

    public void F() {
        G(false, false, false);
    }

    public Dialog H() {
        return this.f17011l;
    }

    public int I() {
        return this.f17005f;
    }

    public boolean J() {
        return this.f17006g;
    }

    public Dialog K(Bundle bundle) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new r(requireContext(), I());
    }

    /* access modifiers changed from: package-private */
    public View L(int i10) {
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean M() {
        return this.f17015p;
    }

    public final Dialog O() {
        Dialog H10 = H();
        if (H10 != null) {
            return H10;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void P(boolean z10) {
        this.f17006g = z10;
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void Q(boolean z10) {
        this.f17007h = z10;
    }

    public void R(int i10, int i11) {
        if (J.L0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.f17004e = i10;
        if (i10 == 2 || i10 == 3) {
            this.f17005f = 16973913;
        }
        if (i11 != 0) {
            this.f17005f = i11;
        }
    }

    public void S(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void T(J j10, String str) {
        this.f17013n = false;
        this.f17014o = true;
        T p10 = j10.p();
        p10.w(true);
        p10.e(this, str);
        p10.h();
    }

    /* access modifiers changed from: package-private */
    public C1775x createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.f17010k);
        if (!this.f17014o) {
            this.f17013n = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        this.f17000a = new Handler();
        if (this.mContainerId == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17007h = z10;
        if (bundle != null) {
            this.f17004e = bundle.getInt("android:style", 0);
            this.f17005f = bundle.getInt("android:theme", 0);
            this.f17006g = bundle.getBoolean("android:cancelable", true);
            this.f17007h = bundle.getBoolean("android:showsDialog", this.f17007h);
            this.f17008i = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            this.f17012m = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f17011l.dismiss();
            if (!this.f17013n) {
                onDismiss(this.f17011l);
            }
            this.f17011l = null;
            this.f17015p = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f17014o && !this.f17013n) {
            this.f17013n = true;
        }
        getViewLifecycleOwnerLiveData().m(this.f17010k);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f17012m) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            G(true, true, false);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f17007h || this.f17009j) {
            if (J.L0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f17007h) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return onGetLayoutInflater;
        }
        N(bundle);
        if (J.L0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            return onGetLayoutInflater.cloneInContext(dialog.getContext());
        }
        return onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f17004e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f17005f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f17006g;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f17007h;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f17008i;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            this.f17012m = false;
            dialog.show();
            View decorView = this.f17011l.getWindow().getDecorView();
            f0.b(decorView, this);
            g0.b(decorView, this);
            C2915g.b(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f17011l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f17011l != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f17011l.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f17011l != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f17011l.onRestoreInstanceState(bundle2);
        }
    }
}
