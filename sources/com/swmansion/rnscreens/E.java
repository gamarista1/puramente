package com.swmansion.rnscreens;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.D0;
import androidx.fragment.app.C1769q;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.Q;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.J;
import com.swmansion.rnscreens.r;
import ib.C5020g;
import ib.C5024k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;
import xd.C5280a;
import xd.g;
import xd.h;
import yf.C6798l;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002ko\u0018\u00002\u00020\u00012\u00020\u0002:\u0002vwB\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0007J)\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J+\u00101\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J-\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0003032\b\b\u0002\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u000303H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0007J\u0017\u0010<\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010\u0015J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010\u0011J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\u0007R$\u0010I\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010PR\u0016\u0010S\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0018\u0010V\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b\u0018\u00010_8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020s8BX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010t¨\u0006x"}, d2 = {"Lcom/swmansion/rnscreens/E;", "Lcom/swmansion/rnscreens/y;", "Lcom/swmansion/rnscreens/F;", "Lcom/swmansion/rnscreens/r;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/r;)V", "()V", "Llf/M;", "b0", "", "j0", "()Ljava/lang/Integer;", "screen", "R", "", "i0", "()Z", "Landroid/view/Menu;", "menu", "k0", "(Landroid/view/Menu;)V", "Landroid/view/View;", "X", "()Landroid/view/View;", "c0", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "f0", "(Landroidx/appcompat/widget/Toolbar;)V", "hidden", "g0", "(Z)V", "translucent", "h0", "l", "N", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "Lcom/swmansion/rnscreens/l;", "keyboardState", "T", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/l;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "V", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "onStop", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "S", "W", "Lcom/swmansion/rnscreens/n;", "i", "Lcom/swmansion/rnscreens/n;", "Y", "()Lcom/swmansion/rnscreens/n;", "d0", "(Lcom/swmansion/rnscreens/n;)V", "nativeDismissalObserver", "Lcom/google/android/material/appbar/AppBarLayout;", "j", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "k", "Landroidx/appcompat/widget/Toolbar;", "Z", "isToolbarShadowHidden", "m", "isToolbarTranslucent", "n", "Landroid/view/View;", "lastFocusedChild", "Lcom/swmansion/rnscreens/c;", "o", "Lcom/swmansion/rnscreens/c;", "a0", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "searchView", "Lkotlin/Function1;", "p", "Lyf/l;", "getOnSearchViewCreate", "()Lyf/l;", "e0", "(Lyf/l;)V", "onSearchViewCreate", "Lcom/swmansion/rnscreens/E$b;", "q", "Lcom/swmansion/rnscreens/E$b;", "coordinatorLayout", "com/swmansion/rnscreens/E$c", "r", "Lcom/swmansion/rnscreens/E$c;", "bottomSheetStateCallback", "com/swmansion/rnscreens/E$d", "s", "Lcom/swmansion/rnscreens/E$d;", "keyboardSheetCallback", "Lcom/swmansion/rnscreens/B;", "()Lcom/swmansion/rnscreens/B;", "screenStack", "b", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class E extends C4940y implements F {

    /* renamed from: i  reason: collision with root package name */
    private C4930n f59663i;

    /* renamed from: j  reason: collision with root package name */
    private AppBarLayout f59664j;

    /* renamed from: k  reason: collision with root package name */
    private Toolbar f59665k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f59666l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f59667m;

    /* renamed from: n  reason: collision with root package name */
    private View f59668n;

    /* renamed from: o  reason: collision with root package name */
    private C4919c f59669o;

    /* renamed from: p  reason: collision with root package name */
    private C6798l f59670p;

    /* renamed from: q  reason: collision with root package name */
    private b f59671q;

    /* renamed from: r  reason: collision with root package name */
    private final c f59672r = new c(this);

    /* renamed from: s  reason: collision with root package name */
    private final d f59673s = new d(this);

    private static final class a extends Animation {

        /* renamed from: a  reason: collision with root package name */
        private final C4940y f59674a;

        public a(C4940y yVar) {
            C6496s.h(yVar, "mFragment");
            this.f59674a = yVar;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f10, Transformation transformation) {
            C6496s.h(transformation, "t");
            super.applyTransformation(f10, transformation);
            C4940y yVar = this.f59674a;
            yVar.K(f10, !yVar.isResumed());
        }
    }

    private static final class b extends CoordinatorLayout implements Q {
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public final E f59675y;

        /* renamed from: z  reason: collision with root package name */
        private final Animation.AnimationListener f59676z = new a(this);

        public static final class a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f59677a;

            a(b bVar) {
                this.f59677a = bVar;
            }

            public void onAnimationEnd(Animation animation) {
                C6496s.h(animation, "animation");
                this.f59677a.f59675y.N();
            }

            public void onAnimationRepeat(Animation animation) {
                C6496s.h(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                C6496s.h(animation, "animation");
                this.f59677a.f59675y.O();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context, E e10) {
            super(context);
            C6496s.h(context, "context");
            C6496s.h(e10, "fragment");
            this.f59675y = e10;
        }

        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        public H getPointerEvents() {
            return H.BOX_NONE;
        }

        public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
            WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            C6496s.g(onApplyWindowInsets, "onApplyWindowInsets(...)");
            return onApplyWindowInsets;
        }

        public void startAnimation(Animation animation) {
            C6496s.h(animation, "animation");
            a aVar = new a(this.f59675y);
            aVar.setDuration(animation.getDuration());
            if (!(animation instanceof AnimationSet) || this.f59675y.isRemoving()) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(animation);
                animationSet.addAnimation(aVar);
                animationSet.setAnimationListener(this.f59676z);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = (AnimationSet) animation;
            animationSet2.addAnimation(aVar);
            animationSet2.setAnimationListener(this.f59676z);
            super.startAnimation(animationSet2);
        }
    }

    public static final class c extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        private int f59678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f59679b;

        c(E e10) {
            this.f59679b = e10;
            this.f59678a = g.f62255a.c(e10.g().getSheetInitialDetentIndex(), e10.g().getSheetDetents().size());
        }

        public void b(View view, float f10) {
            C6496s.h(view, "bottomSheet");
        }

        public void c(View view, int i10) {
            C4930n Y10;
            C6496s.h(view, "bottomSheet");
            g gVar = g.f62255a;
            if (gVar.b(i10)) {
                this.f59678a = i10;
                this.f59679b.g().n(gVar.a(this.f59678a, this.f59679b.g().getSheetDetents().size()), true);
            } else if (i10 == 1) {
                this.f59679b.g().n(gVar.a(this.f59678a, this.f59679b.g().getSheetDetents().size()), false);
            }
            if (i10 == 5 && (Y10 = this.f59679b.Y()) != null) {
                Y10.r(this.f59679b);
            }
        }
    }

    public static final class d extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f59680a;

        d(E e10) {
            this.f59680a = e10;
        }

        public void b(View view, float f10) {
            C6496s.h(view, "bottomSheet");
        }

        public void c(View view, int i10) {
            C6496s.h(view, "bottomSheet");
            if (i10 == 4 && D0.y(view.getRootWindowInsets()).q(D0.n.c())) {
                view.requestFocus();
                ((InputMethodManager) this.f59680a.requireContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(r rVar) {
        super(rVar);
        C6496s.h(rVar, "screenView");
    }

    private final void R(r rVar) {
        ColorDrawable colorDrawable;
        C5020g gVar;
        ColorStateList E10;
        float h10 = G.h(rVar.getSheetCornerRadius());
        C5024k.b bVar = new C5024k.b();
        int i10 = 0;
        bVar.y(0, h10);
        bVar.D(0, h10);
        C5024k m10 = bVar.m();
        C6496s.g(m10, "build(...)");
        C5020g gVar2 = new C5020g(m10);
        Drawable background = rVar.getBackground();
        Integer num = null;
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        } else {
            colorDrawable = null;
        }
        if (colorDrawable != null) {
            num = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = rVar.getBackground();
            if (background2 instanceof C5020g) {
                gVar = (C5020g) background2;
            } else {
                gVar = null;
            }
            if (!(gVar == null || (E10 = gVar.E()) == null)) {
                num = Integer.valueOf(E10.getDefaultColor());
            }
        }
        if (num != null) {
            i10 = num.intValue();
        }
        gVar2.setTint(i10);
        rVar.setBackground(gVar2);
    }

    public static /* synthetic */ BottomSheetBehavior U(E e10, BottomSheetBehavior bottomSheetBehavior, C4928l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C4927k.f59804a;
        }
        return e10.T(bottomSheetBehavior, lVar);
    }

    private final View X() {
        ViewGroup g10 = g();
        while (g10 != null) {
            if (g10.isFocused()) {
                return g10;
            }
            if (g10 instanceof ViewGroup) {
                g10 = g10.getFocusedChild();
            } else {
                g10 = null;
            }
        }
        return null;
    }

    private final B Z() {
        C4935t container = g().getContainer();
        if (container instanceof B) {
            return (B) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void b0() {
        ViewParent viewParent;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof B) {
            ((B) viewParent).I();
        }
    }

    private final boolean i0() {
        int i10;
        H headerConfig = g().getHeaderConfig();
        if (headerConfig != null) {
            i10 = headerConfig.getConfigSubviewsCount();
        } else {
            i10 = 0;
        }
        if (headerConfig != null && i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (headerConfig.g(i11).getType() == J.a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Integer j0() {
        Object obj;
        WindowManager windowManager;
        WindowMetrics a10;
        Rect a11;
        Resources resources;
        DisplayMetrics displayMetrics;
        if (g().getContainer() != null) {
            return Integer.valueOf(Z().getHeight());
        }
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Context context2 = getContext();
            if (context2 != null) {
                obj = context2.getSystemService("window");
            } else {
                obj = null;
            }
            if (obj instanceof WindowManager) {
                windowManager = (WindowManager) obj;
            } else {
                windowManager = null;
            }
            if (!(windowManager == null || (a10 = windowManager.getCurrentWindowMetrics()) == null || (a11 = a10.getBounds()) == null)) {
                return Integer.valueOf(a11.height());
            }
        }
        return null;
    }

    private final void k0(Menu menu) {
        menu.clear();
        if (i0()) {
            Context context = getContext();
            if (this.f59669o == null && context != null) {
                C4919c cVar = new C4919c(context, this);
                this.f59669o = cVar;
                C6798l lVar = this.f59670p;
                if (lVar != null) {
                    lVar.invoke(cVar);
                }
            }
            MenuItem add = menu.add("");
            add.setShowAsAction(2);
            add.setActionView(this.f59669o);
        }
    }

    public void N() {
        super.N();
        b0();
    }

    public boolean S() {
        C4935t container = g().getContainer();
        if (!(container instanceof B)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        } else if (!C6496s.c(((B) container).getRootScreen(), g())) {
            return true;
        } else {
            C1769q parentFragment = getParentFragment();
            if (parentFragment instanceof E) {
                return ((E) parentFragment).S();
            }
            return false;
        }
    }

    public final BottomSheetBehavior T(BottomSheetBehavior bottomSheetBehavior, C4928l lVar) {
        int i02;
        Integer num;
        C6496s.h(bottomSheetBehavior, "behavior");
        C6496s.h(lVar, "keyboardState");
        Integer j02 = j0();
        if (j02 != null) {
            bottomSheetBehavior.A0(true);
            bottomSheetBehavior.v0(true);
            bottomSheetBehavior.W(this.f59672r);
            C4938w footer = g().getFooter();
            if (footer != null) {
                footer.z(bottomSheetBehavior);
            }
            if (lVar instanceof C4927k) {
                int size = g().getSheetDetents().size();
                if (size == 1) {
                    if (h.a(g())) {
                        C4936u uVar = g().getContentWrapper().get();
                        if (uVar != null) {
                            num = Integer.valueOf(uVar.getHeight());
                        } else {
                            num = null;
                        }
                    } else {
                        num = Integer.valueOf((int) (((Number) C6565s.o0(g().getSheetDetents())).doubleValue() * ((double) j02.intValue())));
                    }
                    C5280a.b(bottomSheetBehavior, num, false, 2, (Object) null);
                } else if (size == 2) {
                    return C5280a.e(bottomSheetBehavior, Integer.valueOf(g.f62255a.c(g().getSheetInitialDetentIndex(), g().getSheetDetents().size())), Integer.valueOf((int) (g().getSheetDetents().get(0).doubleValue() * ((double) j02.intValue()))), Integer.valueOf((int) (g().getSheetDetents().get(1).doubleValue() * ((double) j02.intValue()))));
                } else {
                    if (size == 3) {
                        return C5280a.c(bottomSheetBehavior, Integer.valueOf(g.f62255a.c(g().getSheetInitialDetentIndex(), g().getSheetDetents().size())), Integer.valueOf((int) (g().getSheetDetents().get(0).doubleValue() * ((double) j02.intValue()))), Float.valueOf((float) (g().getSheetDetents().get(1).doubleValue() / g().getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - g().getSheetDetents().get(2).doubleValue()) * ((double) j02.intValue()))));
                    }
                    throw new IllegalStateException("[RNScreens] Invalid detent count " + g().getSheetDetents().size() + ". Expected at most 3.");
                }
            } else if (lVar instanceof C4929m) {
                C4929m mVar = (C4929m) lVar;
                if (bottomSheetBehavior.i0() - mVar.a() > 1) {
                    i02 = bottomSheetBehavior.i0() - mVar.a();
                } else {
                    i02 = bottomSheetBehavior.i0();
                }
                int i10 = i02;
                int size2 = g().getSheetDetents().size();
                if (size2 == 1) {
                    C5280a.b(bottomSheetBehavior, Integer.valueOf(i10), false, 2, (Object) null);
                    bottomSheetBehavior.W(this.f59673s);
                } else if (size2 == 2) {
                    C5280a.f(bottomSheetBehavior, 3, (Integer) null, Integer.valueOf(i10), 2, (Object) null);
                    bottomSheetBehavior.W(this.f59673s);
                } else if (size2 == 3) {
                    C5280a.d(bottomSheetBehavior, 3, (Integer) null, (Float) null, (Integer) null, 14, (Object) null);
                    bottomSheetBehavior.B0(i10);
                    bottomSheetBehavior.W(this.f59673s);
                } else {
                    throw new IllegalStateException("[RNScreens] Invalid detent count " + g().getSheetDetents().size() + ". Expected at most 3.");
                }
            } else if (lVar instanceof C4926j) {
                bottomSheetBehavior.q0(this.f59673s);
                int size3 = g().getSheetDetents().size();
                if (size3 == 1) {
                    return C5280a.a(bottomSheetBehavior, Integer.valueOf((int) (((Number) C6565s.o0(g().getSheetDetents())).doubleValue() * ((double) j02.intValue()))), false);
                }
                if (size3 == 2) {
                    return C5280a.f(bottomSheetBehavior, (Integer) null, Integer.valueOf((int) (g().getSheetDetents().get(0).doubleValue() * ((double) j02.intValue()))), Integer.valueOf((int) (g().getSheetDetents().get(1).doubleValue() * ((double) j02.intValue()))), 1, (Object) null);
                } else if (size3 == 3) {
                    return C5280a.d(bottomSheetBehavior, (Integer) null, Integer.valueOf((int) (g().getSheetDetents().get(0).doubleValue() * ((double) j02.intValue()))), Float.valueOf((float) (g().getSheetDetents().get(1).doubleValue() / g().getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - g().getSheetDetents().get(2).doubleValue()) * ((double) j02.intValue()))), 1, (Object) null);
                } else {
                    throw new IllegalStateException("[RNScreens] Invalid detent count " + g().getSheetDetents().size() + ". Expected at most 3.");
                }
            } else {
                throw new C6535s();
            }
            return bottomSheetBehavior;
        }
        throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
    }

    public final BottomSheetBehavior V() {
        return U(this, new BottomSheetBehavior(), (C4928l) null, 2, (Object) null);
    }

    public void W() {
        Z().D(this);
    }

    public final C4930n Y() {
        return this.f59663i;
    }

    public final C4919c a0() {
        return this.f59669o;
    }

    public void c0() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.f59664j;
        if (!(appBarLayout == null || (toolbar = this.f59665k) == null || toolbar.getParent() != appBarLayout)) {
            appBarLayout.removeView(toolbar);
        }
        this.f59665k = null;
    }

    public final void d0(C4930n nVar) {
        this.f59663i = nVar;
    }

    public final void e0(C6798l lVar) {
        this.f59670p = lVar;
    }

    public void f0(Toolbar toolbar) {
        C6496s.h(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.f59664j;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.f59665k = toolbar;
    }

    public void g0(boolean z10) {
        float f10;
        if (this.f59666l != z10) {
            AppBarLayout appBarLayout = this.f59664j;
            if (appBarLayout != null) {
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = G.h(4.0f);
                }
                appBarLayout.setElevation(f10);
            }
            AppBarLayout appBarLayout2 = this.f59664j;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator((StateListAnimator) null);
            }
            this.f59666l = z10;
        }
    }

    public void h0(boolean z10) {
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior;
        if (this.f59667m != z10) {
            ViewGroup.LayoutParams layoutParams = g().getLayoutParams();
            C6496s.f(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
            if (z10) {
                scrollingViewBehavior = null;
            } else {
                scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
            }
            fVar.n(scrollingViewBehavior);
            this.f59667m = z10;
        }
    }

    public void l() {
        super.l();
        H headerConfig = g().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.j();
        }
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        if (g().getStackPresentation() != r.e.FORM_SHEET) {
            return null;
        }
        if (z10) {
            return AnimationUtils.loadAnimation(getContext(), C4931o.f59826u);
        }
        return AnimationUtils.loadAnimation(getContext(), C4931o.f59829x);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C6496s.h(menu, "menu");
        C6496s.h(menuInflater, "inflater");
        k0(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout.c cVar;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        C6496s.h(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C6496s.g(requireContext, "requireContext(...)");
        this.f59671q = new b(requireContext, this);
        r g10 = g();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        if (h.b(g())) {
            cVar = V();
        } else if (this.f59667m) {
            cVar = null;
        } else {
            cVar = new AppBarLayout.ScrollingViewBehavior();
        }
        fVar.n(cVar);
        g10.setLayoutParams(fVar);
        if (h.b(g())) {
            g().setClipToOutline(true);
            R(g());
            g().setElevation(g().getSheetElevation());
        }
        b bVar = this.f59671q;
        if (bVar == null) {
            C6496s.v("coordinatorLayout");
            bVar = null;
        }
        bVar.addView(zd.b.b(g()));
        if (!h.b(g())) {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.e(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.f59664j = appBarLayout;
            b bVar2 = this.f59671q;
            if (bVar2 == null) {
                C6496s.v("coordinatorLayout");
                bVar2 = null;
            }
            bVar2.addView(this.f59664j);
            if (this.f59666l && (appBarLayout3 = this.f59664j) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.f59665k;
            if (!(toolbar == null || (appBarLayout2 = this.f59664j) == null)) {
                appBarLayout2.addView(zd.b.b(toolbar));
            }
            setHasOptionsMenu(true);
        }
        b bVar3 = this.f59671q;
        if (bVar3 != null) {
            return bVar3;
        }
        C6496s.v("coordinatorLayout");
        return null;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        H headerConfig;
        C6496s.h(menu, "menu");
        if (!g().l() || ((headerConfig = g().getHeaderConfig()) != null && !headerConfig.h())) {
            k0(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    public void onStop() {
        if (Ad.a.f50262a.a(getContext())) {
            this.f59668n = X();
        }
        super.onStop();
    }

    public E() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
