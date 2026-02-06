package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1572k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.r0;
import androidx.collection.Y;
import androidx.core.view.C1680b0;
import androidx.core.view.C1700l0;
import androidx.core.view.C1702m0;
import androidx.core.view.C1704n0;
import androidx.core.view.C1714t;
import androidx.core.view.C1716u;
import androidx.core.view.D0;
import androidx.core.view.I;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import com.revenuecat.purchases.common.UtilsKt;
import i.C2037a;
import i.C2039c;
import i.C2042f;
import i.C2043g;
import j.C2115a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o1.h;
import org.xmlpull.v1.XmlPullParser;

class i extends g implements e.a, LayoutInflater.Factory2 {

    /* renamed from: C0  reason: collision with root package name */
    private static final Y f10997C0 = new Y();

    /* renamed from: D0  reason: collision with root package name */
    private static final boolean f10998D0 = false;

    /* renamed from: E0  reason: collision with root package name */
    private static final int[] f10999E0 = {16842836};

    /* renamed from: F0  reason: collision with root package name */
    private static final boolean f11000F0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: A  reason: collision with root package name */
    private boolean f11001A;

    /* renamed from: A0  reason: collision with root package name */
    private OnBackInvokedDispatcher f11002A0;

    /* renamed from: B  reason: collision with root package name */
    ViewGroup f11003B;

    /* renamed from: B0  reason: collision with root package name */
    private OnBackInvokedCallback f11004B0;

    /* renamed from: C  reason: collision with root package name */
    private TextView f11005C;

    /* renamed from: D  reason: collision with root package name */
    private View f11006D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f11007E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f11008F;

    /* renamed from: G  reason: collision with root package name */
    boolean f11009G;

    /* renamed from: H  reason: collision with root package name */
    boolean f11010H;

    /* renamed from: I  reason: collision with root package name */
    boolean f11011I;

    /* renamed from: X  reason: collision with root package name */
    boolean f11012X;

    /* renamed from: Y  reason: collision with root package name */
    boolean f11013Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f11014Z;

    /* renamed from: f0  reason: collision with root package name */
    private s[] f11015f0;

    /* renamed from: g0  reason: collision with root package name */
    private s f11016g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f11017h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f11018i0;

    /* renamed from: j  reason: collision with root package name */
    final Object f11019j;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f11020j0;

    /* renamed from: k  reason: collision with root package name */
    final Context f11021k;

    /* renamed from: k0  reason: collision with root package name */
    boolean f11022k0;

    /* renamed from: l  reason: collision with root package name */
    Window f11023l;

    /* renamed from: l0  reason: collision with root package name */
    private Configuration f11024l0;

    /* renamed from: m  reason: collision with root package name */
    private n f11025m;

    /* renamed from: m0  reason: collision with root package name */
    private int f11026m0;

    /* renamed from: n  reason: collision with root package name */
    final e f11027n;

    /* renamed from: n0  reason: collision with root package name */
    private int f11028n0;

    /* renamed from: o  reason: collision with root package name */
    C1560a f11029o;

    /* renamed from: o0  reason: collision with root package name */
    private int f11030o0;

    /* renamed from: p  reason: collision with root package name */
    MenuInflater f11031p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f11032p0;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f11033q;

    /* renamed from: q0  reason: collision with root package name */
    private p f11034q0;

    /* renamed from: r  reason: collision with root package name */
    private H f11035r;

    /* renamed from: r0  reason: collision with root package name */
    private p f11036r0;

    /* renamed from: s  reason: collision with root package name */
    private h f11037s;

    /* renamed from: s0  reason: collision with root package name */
    boolean f11038s0;

    /* renamed from: t  reason: collision with root package name */
    private t f11039t;

    /* renamed from: t0  reason: collision with root package name */
    int f11040t0;

    /* renamed from: u  reason: collision with root package name */
    androidx.appcompat.view.b f11041u;

    /* renamed from: u0  reason: collision with root package name */
    private final Runnable f11042u0;

    /* renamed from: v  reason: collision with root package name */
    ActionBarContextView f11043v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f11044v0;

    /* renamed from: w  reason: collision with root package name */
    PopupWindow f11045w;

    /* renamed from: w0  reason: collision with root package name */
    private Rect f11046w0;

    /* renamed from: x  reason: collision with root package name */
    Runnable f11047x;

    /* renamed from: x0  reason: collision with root package name */
    private Rect f11048x0;

    /* renamed from: y  reason: collision with root package name */
    C1700l0 f11049y;

    /* renamed from: y0  reason: collision with root package name */
    private t f11050y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11051z;

    /* renamed from: z0  reason: collision with root package name */
    private v f11052z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            i iVar = i.this;
            if ((iVar.f11040t0 & 1) != 0) {
                iVar.l0(0);
            }
            i iVar2 = i.this;
            if ((iVar2.f11040t0 & 4096) != 0) {
                iVar2.l0(108);
            }
            i iVar3 = i.this;
            iVar3.f11038s0 = false;
            iVar3.f11040t0 = 0;
        }
    }

    class b implements I {
        b() {
        }

        public D0 i(View view, D0 d02) {
            int m10 = d02.m();
            int h12 = i.this.h1(d02, (Rect) null);
            if (m10 != h12) {
                d02 = d02.r(d02.k(), h12, d02.l(), d02.j());
            }
            return C1680b0.a0(view, d02);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            i.this.j0();
        }
    }

    class d implements Runnable {

        class a extends C1704n0 {
            a() {
            }

            public void b(View view) {
                i.this.f11043v.setAlpha(1.0f);
                i.this.f11049y.h((C1702m0) null);
                i.this.f11049y = null;
            }

            public void c(View view) {
                i.this.f11043v.setVisibility(0);
            }
        }

        d() {
        }

        public void run() {
            i iVar = i.this;
            iVar.f11045w.showAtLocation(iVar.f11043v, 55, 0, 0);
            i.this.m0();
            if (i.this.X0()) {
                i.this.f11043v.setAlpha(0.0f);
                i iVar2 = i.this;
                iVar2.f11049y = C1680b0.e(iVar2.f11043v).b(1.0f);
                i.this.f11049y.h(new a());
                return;
            }
            i.this.f11043v.setAlpha(1.0f);
            i.this.f11043v.setVisibility(0);
        }
    }

    class e extends C1704n0 {
        e() {
        }

        public void b(View view) {
            i.this.f11043v.setAlpha(1.0f);
            i.this.f11049y.h((C1702m0) null);
            i.this.f11049y = null;
        }

        public void c(View view) {
            i.this.f11043v.setVisibility(0);
            if (i.this.f11043v.getParent() instanceof View) {
                C1680b0.l0((View) i.this.f11043v.getParent());
            }
        }
    }

    private class f implements C1561b {
        f() {
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class h implements j.a {
        h() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            i.this.c0(eVar);
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y02 = i.this.y0();
            if (y02 == null) {
                return true;
            }
            y02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.i$i  reason: collision with other inner class name */
    class C0211i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f11061a;

        /* renamed from: androidx.appcompat.app.i$i$a */
        class a extends C1704n0 {
            a() {
            }

            public void b(View view) {
                i.this.f11043v.setVisibility(8);
                i iVar = i.this;
                PopupWindow popupWindow = iVar.f11045w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (iVar.f11043v.getParent() instanceof View) {
                    C1680b0.l0((View) i.this.f11043v.getParent());
                }
                i.this.f11043v.k();
                i.this.f11049y.h((C1702m0) null);
                i iVar2 = i.this;
                iVar2.f11049y = null;
                C1680b0.l0(iVar2.f11003B);
            }
        }

        public C0211i(b.a aVar) {
            this.f11061a = aVar;
        }

        public void a(androidx.appcompat.view.b bVar) {
            this.f11061a.a(bVar);
            i iVar = i.this;
            if (iVar.f11045w != null) {
                iVar.f11023l.getDecorView().removeCallbacks(i.this.f11047x);
            }
            i iVar2 = i.this;
            if (iVar2.f11043v != null) {
                iVar2.m0();
                i iVar3 = i.this;
                iVar3.f11049y = C1680b0.e(iVar3.f11043v).b(0.0f);
                i.this.f11049y.h(new a());
            }
            i iVar4 = i.this;
            e eVar = iVar4.f11027n;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(iVar4.f11041u);
            }
            i iVar5 = i.this;
            iVar5.f11041u = null;
            C1680b0.l0(iVar5.f11003B);
            i.this.f1();
        }

        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f11061a.b(bVar, menu);
        }

        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f11061a.c(bVar, menuItem);
        }

        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            C1680b0.l0(i.this.f11003B);
            return this.f11061a.d(bVar, menu);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        static u1.i b(Configuration configuration) {
            return u1.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(u1.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(Configuration configuration, u1.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 3);
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 12);
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, i iVar) {
            Objects.requireNonNull(iVar);
            q qVar = new q(iVar);
            m.a(obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, qVar);
            return qVar;
        }

        static void c(Object obj, Object obj2) {
            m.a(obj).unregisterOnBackInvokedCallback(l.a(obj2));
        }
    }

    class n extends androidx.appcompat.view.i {

        /* renamed from: b  reason: collision with root package name */
        private g f11064b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11065c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11066d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f11067e;

        n(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f11066d = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f11066d = false;
                return dispatchKeyEvent;
            } catch (Throwable th2) {
                this.f11066d = false;
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        public void c(Window.Callback callback) {
            try {
                this.f11065c = true;
                callback.onContentChanged();
                this.f11065c = false;
            } catch (Throwable th2) {
                this.f11065c = false;
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f11067e = true;
                callback.onPanelClosed(i10, menu);
                this.f11067e = false;
            } catch (Throwable th2) {
                this.f11067e = false;
                throw th2;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f11066d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            if (i.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || i.this.J0(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(g gVar) {
            this.f11064b = gVar;
        }

        /* access modifiers changed from: package-private */
        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(i.this.f11021k, callback);
            androidx.appcompat.view.b S10 = i.this.S(aVar);
            if (S10 != null) {
                return aVar.e(S10);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f11065c) {
                a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f11064b;
            if (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i10)) == null) {
                return super.onCreatePanelView(i10);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            i.this.M0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            if (this.f11067e) {
                a().onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            i.this.N0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar;
            if (menu instanceof androidx.appcompat.view.menu.e) {
                eVar = (androidx.appcompat.view.menu.e) menu;
            } else {
                eVar = null;
            }
            if (i10 == 0 && eVar == null) {
                return false;
            }
            boolean z10 = true;
            if (eVar != null) {
                eVar.b0(true);
            }
            g gVar = this.f11064b;
            if (gVar == null || !gVar.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.b0(false);
            }
            return z10;
        }

        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s w02 = i.this.w0(0, true);
            if (w02 == null || (eVar = w02.f11086j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (!i.this.E0() || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            return f(callback);
        }
    }

    private class o extends p {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f11069c;

        o(Context context) {
            super();
            this.f11069c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            if (j.a(this.f11069c)) {
                return 2;
            }
            return 1;
        }

        public void d() {
            i.this.f();
        }
    }

    abstract class p {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f11071a;

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f11071a;
            if (broadcastReceiver != null) {
                try {
                    i.this.f11021k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f11071a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f11071a == null) {
                    this.f11071a = new a();
                }
                i.this.f11021k.registerReceiver(this.f11071a, b10);
            }
        }
    }

    private class q extends p {

        /* renamed from: c  reason: collision with root package name */
        private final A f11074c;

        q(A a10) {
            super();
            this.f11074c = a10;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            if (this.f11074c.d()) {
                return 2;
            }
            return 1;
        }

        public void d() {
            i.this.f();
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            if (i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (i.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            i.this.e0(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C2115a.b(getContext(), i10));
        }
    }

    protected static final class s {

        /* renamed from: a  reason: collision with root package name */
        int f11077a;

        /* renamed from: b  reason: collision with root package name */
        int f11078b;

        /* renamed from: c  reason: collision with root package name */
        int f11079c;

        /* renamed from: d  reason: collision with root package name */
        int f11080d;

        /* renamed from: e  reason: collision with root package name */
        int f11081e;

        /* renamed from: f  reason: collision with root package name */
        int f11082f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f11083g;

        /* renamed from: h  reason: collision with root package name */
        View f11084h;

        /* renamed from: i  reason: collision with root package name */
        View f11085i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f11086j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f11087k;

        /* renamed from: l  reason: collision with root package name */
        Context f11088l;

        /* renamed from: m  reason: collision with root package name */
        boolean f11089m;

        /* renamed from: n  reason: collision with root package name */
        boolean f11090n;

        /* renamed from: o  reason: collision with root package name */
        boolean f11091o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f11092p;

        /* renamed from: q  reason: collision with root package name */
        boolean f11093q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f11094r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f11095s;

        s(int i10) {
            this.f11077a = i10;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f11086j == null) {
                return null;
            }
            if (this.f11087k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f11088l, C2043g.f21403j);
                this.f11087k = cVar;
                cVar.e(aVar);
                this.f11086j.b(this.f11087k);
            }
            return this.f11087k.c(this.f11083g);
        }

        public boolean b() {
            if (this.f11084h == null) {
                return false;
            }
            if (this.f11085i != null) {
                return true;
            }
            if (this.f11087k.b().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f11086j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.P(this.f11087k);
                }
                this.f11086j = eVar;
                if (eVar != null && (cVar = this.f11087k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C2037a.f21258a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(C2037a.f21248C, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(i.i.f21429b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f11088l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(i.j.f21675y0);
            this.f11078b = obtainStyledAttributes.getResourceId(i.j.f21438B0, 0);
            this.f11082f = obtainStyledAttributes.getResourceId(i.j.f21433A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class t implements j.a {
        t() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            boolean z11;
            androidx.appcompat.view.menu.e D10 = eVar.D();
            if (D10 != eVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            i iVar = i.this;
            if (z11) {
                eVar = D10;
            }
            s p02 = iVar.p0(eVar);
            if (p02 == null) {
                return;
            }
            if (z11) {
                i.this.b0(p02.f11077a, p02, D10);
                i.this.f0(p02, true);
                return;
            }
            i.this.f0(p02, z10);
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y02;
            if (eVar != eVar.D()) {
                return true;
            }
            i iVar = i.this;
            if (!iVar.f11009G || (y02 = iVar.y0()) == null || i.this.f11022k0) {
                return true;
            }
            y02.onMenuOpened(108, eVar);
            return true;
        }
    }

    i(Activity activity, e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    private boolean A0(s sVar) {
        View view = sVar.f11085i;
        if (view != null) {
            sVar.f11084h = view;
            return true;
        } else if (sVar.f11086j == null) {
            return false;
        } else {
            if (this.f11039t == null) {
                this.f11039t = new t();
            }
            View view2 = (View) sVar.a(this.f11039t);
            sVar.f11084h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean B0(s sVar) {
        sVar.d(r0());
        sVar.f11083g = new r(sVar.f11088l);
        sVar.f11079c = 81;
        return true;
    }

    private boolean C0(s sVar) {
        Resources.Theme theme;
        Context context = this.f11021k;
        int i10 = sVar.f11077a;
        if ((i10 == 0 || i10 == 108) && this.f11035r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C2037a.f21261d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C2037a.f21262e, typedValue, true);
            } else {
                theme2.resolveAttribute(C2037a.f21262e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        sVar.c(eVar);
        return true;
    }

    private void D0(int i10) {
        this.f11040t0 = (1 << i10) | this.f11040t0;
        if (!this.f11038s0) {
            C1680b0.g0(this.f11023l.getDecorView(), this.f11042u0);
            this.f11038s0 = true;
        }
    }

    private boolean I0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s w02 = w0(i10, true);
        if (!w02.f11091o) {
            return S0(w02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean L0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f11041u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.i$s r2 = r4.w0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.H r5 = r4.f11035r
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f11021k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.H r5 = r4.f11035r
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f11022k0
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.S0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.H r5 = r4.f11035r
            boolean r0 = r5.c()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.H r5 = r4.f11035r
            boolean r0 = r5.b()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f11091o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f11090n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f11089m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f11094r
            if (r5 == 0) goto L_0x005b
            r2.f11089m = r1
            boolean r5 = r4.S0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.P0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.f0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f11021k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.L0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P0(androidx.appcompat.app.i.s r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            boolean r0 = r12.f11091o
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r11.f11022k0
            if (r0 == 0) goto L_0x000a
            goto L_0x00f3
        L_0x000a:
            int r0 = r12.f11077a
            if (r0 != 0) goto L_0x0020
            android.content.Context r0 = r11.f11021k
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 != r1) goto L_0x0020
            return
        L_0x0020:
            android.view.Window$Callback r0 = r11.y0()
            r1 = 1
            if (r0 == 0) goto L_0x0035
            int r2 = r12.f11077a
            androidx.appcompat.view.menu.e r3 = r12.f11086j
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 != 0) goto L_0x0035
            r11.f0(r12, r1)
            return
        L_0x0035:
            android.content.Context r0 = r11.f11021k
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            boolean r13 = r11.S0(r12, r13)
            if (r13 != 0) goto L_0x0049
            return
        L_0x0049:
            android.view.ViewGroup r13 = r12.f11083g
            r2 = -2
            if (r13 == 0) goto L_0x0064
            boolean r3 = r12.f11093q
            if (r3 == 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            android.view.View r13 = r12.f11085i
            if (r13 == 0) goto L_0x00c6
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto L_0x00c6
            int r13 = r13.width
            r3 = -1
            if (r13 != r3) goto L_0x00c6
            r4 = r3
            goto L_0x00c7
        L_0x0064:
            if (r13 != 0) goto L_0x0071
            boolean r13 = r11.B0(r12)
            if (r13 == 0) goto L_0x0070
            android.view.ViewGroup r13 = r12.f11083g
            if (r13 != 0) goto L_0x0080
        L_0x0070:
            return
        L_0x0071:
            boolean r3 = r12.f11093q
            if (r3 == 0) goto L_0x0080
            int r13 = r13.getChildCount()
            if (r13 <= 0) goto L_0x0080
            android.view.ViewGroup r13 = r12.f11083g
            r13.removeAllViews()
        L_0x0080:
            boolean r13 = r11.A0(r12)
            if (r13 == 0) goto L_0x00f1
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x008d
            goto L_0x00f1
        L_0x008d:
            android.view.View r13 = r12.f11084h
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto L_0x009a
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r2, r2)
        L_0x009a:
            int r3 = r12.f11078b
            android.view.ViewGroup r4 = r12.f11083g
            r4.setBackgroundResource(r3)
            android.view.View r3 = r12.f11084h
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x00b2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r12.f11084h
            r3.removeView(r4)
        L_0x00b2:
            android.view.ViewGroup r3 = r12.f11083g
            android.view.View r4 = r12.f11084h
            r3.addView(r4, r13)
            android.view.View r13 = r12.f11084h
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto L_0x00c6
            android.view.View r13 = r12.f11084h
            r13.requestFocus()
        L_0x00c6:
            r4 = r2
        L_0x00c7:
            r13 = 0
            r12.f11090n = r13
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            int r6 = r12.f11080d
            int r7 = r12.f11081e
            r9 = 8519680(0x820000, float:1.1938615E-38)
            r10 = -3
            r5 = -2
            r8 = 1002(0x3ea, float:1.404E-42)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.f11079c
            r13.gravity = r2
            int r2 = r12.f11082f
            r13.windowAnimations = r2
            android.view.ViewGroup r2 = r12.f11083g
            r0.addView(r2, r13)
            r12.f11091o = r1
            int r12 = r12.f11077a
            if (r12 != 0) goto L_0x00f0
            r11.f1()
        L_0x00f0:
            return
        L_0x00f1:
            r12.f11093q = r1
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.P0(androidx.appcompat.app.i$s, android.view.KeyEvent):void");
    }

    private boolean R0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f11089m || S0(sVar, keyEvent)) && (eVar = sVar.f11086j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f11035r == null) {
            f0(sVar, true);
        }
        return z10;
    }

    private boolean S0(s sVar, KeyEvent keyEvent) {
        boolean z10;
        int i10;
        boolean z11;
        H h10;
        H h11;
        H h12;
        if (this.f11022k0) {
            return false;
        }
        if (sVar.f11089m) {
            return true;
        }
        s sVar2 = this.f11016g0;
        if (!(sVar2 == null || sVar2 == sVar)) {
            f0(sVar2, false);
        }
        Window.Callback y02 = y0();
        if (y02 != null) {
            sVar.f11085i = y02.onCreatePanelView(sVar.f11077a);
        }
        int i11 = sVar.f11077a;
        if (i11 == 0 || i11 == 108) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (h12 = this.f11035r) != null) {
            h12.f();
        }
        if (sVar.f11085i == null && (!z10 || !(Q0() instanceof y))) {
            androidx.appcompat.view.menu.e eVar = sVar.f11086j;
            if (eVar == null || sVar.f11094r) {
                if (eVar == null && (!C0(sVar) || sVar.f11086j == null)) {
                    return false;
                }
                if (z10 && this.f11035r != null) {
                    if (this.f11037s == null) {
                        this.f11037s = new h();
                    }
                    this.f11035r.d(sVar.f11086j, this.f11037s);
                }
                sVar.f11086j.e0();
                if (!y02.onCreatePanelMenu(sVar.f11077a, sVar.f11086j)) {
                    sVar.c((androidx.appcompat.view.menu.e) null);
                    if (z10 && (h11 = this.f11035r) != null) {
                        h11.d((Menu) null, this.f11037s);
                    }
                    return false;
                }
                sVar.f11094r = false;
            }
            sVar.f11086j.e0();
            Bundle bundle = sVar.f11095s;
            if (bundle != null) {
                sVar.f11086j.Q(bundle);
                sVar.f11095s = null;
            }
            if (!y02.onPreparePanel(0, sVar.f11085i, sVar.f11086j)) {
                if (z10 && (h10 = this.f11035r) != null) {
                    h10.d((Menu) null, this.f11037s);
                }
                sVar.f11086j.d0();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            sVar.f11092p = z11;
            sVar.f11086j.setQwertyMode(z11);
            sVar.f11086j.d0();
        }
        sVar.f11089m = true;
        sVar.f11090n = false;
        this.f11016g0 = sVar;
        return true;
    }

    private void T0(boolean z10) {
        H h10 = this.f11035r;
        if (h10 == null || !h10.a() || (ViewConfiguration.get(this.f11021k).hasPermanentMenuKey() && !this.f11035r.g())) {
            s w02 = w0(0, true);
            w02.f11093q = true;
            f0(w02, false);
            P0(w02, (KeyEvent) null);
            return;
        }
        Window.Callback y02 = y0();
        if (this.f11035r.e() && z10) {
            this.f11035r.b();
            if (!this.f11022k0) {
                y02.onPanelClosed(108, w0(0, true).f11086j);
            }
        } else if (y02 != null && !this.f11022k0) {
            if (this.f11038s0 && (this.f11040t0 & 1) != 0) {
                this.f11023l.getDecorView().removeCallbacks(this.f11042u0);
                this.f11042u0.run();
            }
            s w03 = w0(0, true);
            androidx.appcompat.view.menu.e eVar = w03.f11086j;
            if (eVar != null && !w03.f11094r && y02.onPreparePanel(0, w03.f11085i, eVar)) {
                y02.onMenuOpened(108, w03.f11086j);
                this.f11035r.c();
            }
        }
    }

    private int U0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean V(boolean z10) {
        return W(z10, true);
    }

    private boolean W(boolean z10, boolean z11) {
        u1.i iVar;
        if (this.f11022k0) {
            return false;
        }
        int a02 = a0();
        int F02 = F0(this.f11021k, a02);
        if (Build.VERSION.SDK_INT < 33) {
            iVar = Z(this.f11021k);
        } else {
            iVar = null;
        }
        if (!z11 && iVar != null) {
            iVar = v0(this.f11021k.getResources().getConfiguration());
        }
        boolean e12 = e1(F02, iVar, z10);
        if (a02 == 0) {
            u0(this.f11021k).e();
        } else {
            p pVar = this.f11034q0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (a02 == 3) {
            t0(this.f11021k).e();
        } else {
            p pVar2 = this.f11036r0;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return e12;
    }

    private void X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f11003B.findViewById(16908290);
        View decorView = this.f11023l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f11021k.obtainStyledAttributes(i.j.f21675y0);
        obtainStyledAttributes.getValue(i.j.f21483K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(i.j.f21488L0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(i.j.f21473I0)) {
            obtainStyledAttributes.getValue(i.j.f21473I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(i.j.f21478J0)) {
            obtainStyledAttributes.getValue(i.j.f21478J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(i.j.f21463G0)) {
            obtainStyledAttributes.getValue(i.j.f21463G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(i.j.f21468H0)) {
            obtainStyledAttributes.getValue(i.j.f21468H0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void Y(Window window) {
        if (this.f11023l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(callback);
                this.f11025m = nVar;
                window.setCallback(nVar);
                g0 u10 = g0.u(this.f11021k, (AttributeSet) null, f10999E0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.x();
                this.f11023l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f11002A0 == null) {
                    O((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f11023l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int a0() {
        int i10 = this.f11026m0;
        if (i10 != -100) {
            return i10;
        }
        return g.o();
    }

    private void b1() {
        if (this.f11001A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private d c1() {
        Context context = this.f11021k;
        while (context != null) {
            if (!(context instanceof d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (d) context;
            }
        }
        return null;
    }

    private void d0() {
        p pVar = this.f11034q0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f11036r0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private void d1(Configuration configuration) {
        Activity activity = (Activity) this.f11019j;
        if (activity instanceof C1798v) {
            if (((C1798v) activity).getLifecycle().b().b(C1790m.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f11020j0 && !this.f11022k0) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e1(int r10, u1.i r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r1 = r9.f11021k
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.g0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.f11021k
            int r1 = r9.s0(r1)
            android.content.res.Configuration r2 = r9.f11024l0
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r9.f11021k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            u1.i r2 = r9.v0(r2)
            r5 = 0
            if (r11 != 0) goto L_0x0030
            r6 = r5
            goto L_0x0034
        L_0x0030:
            u1.i r6 = r9.v0(r0)
        L_0x0034:
            r7 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r7
        L_0x003b:
            if (r6 == 0) goto L_0x0045
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0045
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L_0x0045:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L_0x008c
            if (r12 == 0) goto L_0x008c
            boolean r12 = r9.f11018i0
            if (r12 == 0) goto L_0x008c
            boolean r12 = f11000F0
            if (r12 != 0) goto L_0x0058
            boolean r12 = r9.f11020j0
            if (r12 == 0) goto L_0x008c
        L_0x0058:
            java.lang.Object r12 = r9.f11019j
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L_0x008c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x008c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L_0x0083
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x0083
            java.lang.Object r12 = r9.f11019j
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L_0x0083:
            java.lang.Object r12 = r9.f11019j
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.core.app.b.g(r12)
            r12 = r8
            goto L_0x008d
        L_0x008c:
            r12 = r7
        L_0x008d:
            if (r12 != 0) goto L_0x009a
            if (r3 == 0) goto L_0x009a
            r12 = r3 & r1
            if (r12 != r3) goto L_0x0096
            r7 = r8
        L_0x0096:
            r9.g1(r4, r6, r7, r5)
            goto L_0x009b
        L_0x009a:
            r8 = r12
        L_0x009b:
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r12 = r9.f11019j
            boolean r0 = r12 instanceof androidx.appcompat.app.d
            if (r0 == 0) goto L_0x00b7
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00ac
            androidx.appcompat.app.d r12 = (androidx.appcompat.app.d) r12
            r12.onNightModeChanged(r10)
        L_0x00ac:
            r10 = r3 & 4
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r9.f11019j
            androidx.appcompat.app.d r10 = (androidx.appcompat.app.d) r10
            r10.onLocalesChanged(r11)
        L_0x00b7:
            if (r6 == 0) goto L_0x00ca
            android.content.Context r10 = r9.f11021k
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            u1.i r10 = r9.v0(r10)
            r9.W0(r10)
        L_0x00ca:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.e1(int, u1.i, boolean):boolean");
    }

    private Configuration g0(Context context, int i10, u1.i iVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 == 2) {
            i11 = 32;
        } else if (z10) {
            i11 = 0;
        } else {
            i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        return configuration2;
    }

    private void g1(int i10, u1.i iVar, boolean z10, Configuration configuration) {
        Resources resources = this.f11021k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            x.a(resources);
        }
        int i11 = this.f11028n0;
        if (i11 != 0) {
            this.f11021k.setTheme(i11);
            this.f11021k.getTheme().applyStyle(this.f11028n0, true);
        }
        if (z10 && (this.f11019j instanceof Activity)) {
            d1(configuration2);
        }
    }

    private ViewGroup h0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f11021k.obtainStyledAttributes(i.j.f21675y0);
        if (obtainStyledAttributes.hasValue(i.j.f21448D0)) {
            if (obtainStyledAttributes.getBoolean(i.j.f21493M0, false)) {
                J(1);
            } else if (obtainStyledAttributes.getBoolean(i.j.f21448D0, false)) {
                J(108);
            }
            if (obtainStyledAttributes.getBoolean(i.j.f21453E0, false)) {
                J(109);
            }
            if (obtainStyledAttributes.getBoolean(i.j.f21458F0, false)) {
                J(10);
            }
            this.f11012X = obtainStyledAttributes.getBoolean(i.j.f21680z0, false);
            obtainStyledAttributes.recycle();
            o0();
            this.f11023l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f11021k);
            if (this.f11013Y) {
                viewGroup = this.f11011I ? (ViewGroup) from.inflate(C2043g.f21408o, (ViewGroup) null) : (ViewGroup) from.inflate(C2043g.f21407n, (ViewGroup) null);
            } else if (this.f11012X) {
                viewGroup = (ViewGroup) from.inflate(C2043g.f21399f, (ViewGroup) null);
                this.f11010H = false;
                this.f11009G = false;
            } else if (this.f11009G) {
                TypedValue typedValue = new TypedValue();
                this.f11021k.getTheme().resolveAttribute(C2037a.f21261d, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new androidx.appcompat.view.d(this.f11021k, typedValue.resourceId);
                } else {
                    context = this.f11021k;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C2043g.f21409p, (ViewGroup) null);
                H h10 = (H) viewGroup.findViewById(C2042f.f21384q);
                this.f11035r = h10;
                h10.setWindowCallback(y0());
                if (this.f11010H) {
                    this.f11035r.h(109);
                }
                if (this.f11007E) {
                    this.f11035r.h(2);
                }
                if (this.f11008F) {
                    this.f11035r.h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C1680b0.C0(viewGroup, new b());
                if (this.f11035r == null) {
                    this.f11005C = (TextView) viewGroup.findViewById(C2042f.f21364N);
                }
                r0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2042f.f21369b);
                ViewGroup viewGroup2 = (ViewGroup) this.f11023l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f11023l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f11009G + ", windowActionBarOverlay: " + this.f11010H + ", android:windowIsFloating: " + this.f11012X + ", windowActionModeOverlay: " + this.f11011I + ", windowNoTitle: " + this.f11013Y + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void i1(View view) {
        int i10;
        if ((C1680b0.K(view) & 8192) != 0) {
            i10 = androidx.core.content.c.getColor(this.f11021k, C2039c.f21286b);
        } else {
            i10 = androidx.core.content.c.getColor(this.f11021k, C2039c.f21285a);
        }
        view.setBackgroundColor(i10);
    }

    private void n0() {
        if (!this.f11001A) {
            this.f11003B = h0();
            CharSequence x02 = x0();
            if (!TextUtils.isEmpty(x02)) {
                H h10 = this.f11035r;
                if (h10 != null) {
                    h10.setWindowTitle(x02);
                } else if (Q0() != null) {
                    Q0().w(x02);
                } else {
                    TextView textView = this.f11005C;
                    if (textView != null) {
                        textView.setText(x02);
                    }
                }
            }
            X();
            O0(this.f11003B);
            this.f11001A = true;
            s w02 = w0(0, false);
            if (this.f11022k0) {
                return;
            }
            if (w02 == null || w02.f11086j == null) {
                D0(108);
            }
        }
    }

    private void o0() {
        if (this.f11023l == null) {
            Object obj = this.f11019j;
            if (obj instanceof Activity) {
                Y(((Activity) obj).getWindow());
            }
        }
        if (this.f11023l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int s0(Context context) {
        int i10;
        if (!this.f11032p0 && (this.f11019j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 269221888;
                } else {
                    i10 = 786432;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f11019j.getClass()), i10);
                if (activityInfo != null) {
                    this.f11030o0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f11030o0 = 0;
            }
        }
        this.f11032p0 = true;
        return this.f11030o0;
    }

    private p t0(Context context) {
        if (this.f11036r0 == null) {
            this.f11036r0 = new o(context);
        }
        return this.f11036r0;
    }

    private p u0(Context context) {
        if (this.f11034q0 == null) {
            this.f11034q0 = new q(A.a(context));
        }
        return this.f11034q0;
    }

    private void z0() {
        n0();
        if (this.f11009G && this.f11029o == null) {
            Object obj = this.f11019j;
            if (obj instanceof Activity) {
                this.f11029o = new B((Activity) this.f11019j, this.f11010H);
            } else if (obj instanceof Dialog) {
                this.f11029o = new B((Dialog) this.f11019j);
            }
            C1560a aVar = this.f11029o;
            if (aVar != null) {
                aVar.r(this.f11044v0);
            }
        }
    }

    public void A(Bundle bundle) {
        String str;
        this.f11018i0 = true;
        V(false);
        o0();
        Object obj = this.f11019j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.l.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C1560a Q02 = Q0();
                if (Q02 == null) {
                    this.f11044v0 = true;
                } else {
                    Q02.r(true);
                }
            }
            g.d(this);
        }
        this.f11024l0 = new Configuration(this.f11021k.getResources().getConfiguration());
        this.f11020j0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f11019j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.g.H(r3)
        L_0x0009:
            boolean r0 = r3.f11038s0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f11023l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f11042u0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f11022k0 = r0
            int r0 = r3.f11026m0
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f11019j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            androidx.collection.Y r0 = f10997C0
            java.lang.Object r1 = r3.f11019j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f11026m0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            androidx.collection.Y r0 = f10997C0
            java.lang.Object r1 = r3.f11019j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f11029o
            if (r0 == 0) goto L_0x005b
            r0.n()
        L_0x005b:
            r3.d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.B():void");
    }

    public void C(Bundle bundle) {
        n0();
    }

    public void D() {
        C1560a u10 = u();
        if (u10 != null) {
            u10.u(true);
        }
    }

    public void E(Bundle bundle) {
    }

    public boolean E0() {
        return this.f11051z;
    }

    public void F() {
        W(true, false);
    }

    /* access modifiers changed from: package-private */
    public int F0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        return t0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return u0(context).c();
            }
        }
        return i10;
    }

    public void G() {
        C1560a u10 = u();
        if (u10 != null) {
            u10.u(false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean G0() {
        boolean z10 = this.f11017h0;
        this.f11017h0 = false;
        s w02 = w0(0, false);
        if (w02 == null || !w02.f11091o) {
            androidx.appcompat.view.b bVar = this.f11041u;
            if (bVar != null) {
                bVar.c();
                return true;
            }
            C1560a u10 = u();
            if (u10 == null || !u10.h()) {
                return false;
            }
            return true;
        }
        if (!z10) {
            f0(w02, true);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean H0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.f11017h0 = z10;
        } else if (i10 == 82) {
            I0(0, keyEvent);
            return true;
        }
        return false;
    }

    public boolean J(int i10) {
        int U02 = U0(i10);
        if (this.f11013Y && U02 == 108) {
            return false;
        }
        if (this.f11009G && U02 == 1) {
            this.f11009G = false;
        }
        if (U02 == 1) {
            b1();
            this.f11013Y = true;
            return true;
        } else if (U02 == 2) {
            b1();
            this.f11007E = true;
            return true;
        } else if (U02 == 5) {
            b1();
            this.f11008F = true;
            return true;
        } else if (U02 == 10) {
            b1();
            this.f11011I = true;
            return true;
        } else if (U02 == 108) {
            b1();
            this.f11009G = true;
            return true;
        } else if (U02 != 109) {
            return this.f11023l.requestFeature(U02);
        } else {
            b1();
            this.f11010H = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean J0(int i10, KeyEvent keyEvent) {
        C1560a u10 = u();
        if (u10 != null && u10.o(i10, keyEvent)) {
            return true;
        }
        s sVar = this.f11016g0;
        if (sVar == null || !R0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f11016g0 == null) {
                s w02 = w0(0, true);
                S0(w02, keyEvent);
                boolean R02 = R0(w02, keyEvent.getKeyCode(), keyEvent, 1);
                w02.f11089m = false;
                if (R02) {
                    return true;
                }
            }
            return false;
        }
        s sVar2 = this.f11016g0;
        if (sVar2 != null) {
            sVar2.f11090n = true;
        }
        return true;
    }

    public void K(int i10) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f11003B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f11021k).inflate(i10, viewGroup);
        this.f11025m.c(this.f11023l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public boolean K0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                L0(0, keyEvent);
                return true;
            }
        } else if (G0()) {
            return true;
        }
        return false;
    }

    public void L(View view) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f11003B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f11025m.c(this.f11023l.getCallback());
    }

    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f11003B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f11025m.c(this.f11023l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void M0(int i10) {
        C1560a u10;
        if (i10 == 108 && (u10 = u()) != null) {
            u10.i(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void N0(int i10) {
        if (i10 == 108) {
            C1560a u10 = u();
            if (u10 != null) {
                u10.i(false);
            }
        } else if (i10 == 0) {
            s w02 = w0(i10, true);
            if (w02.f11091o) {
                f0(w02, false);
            }
        }
    }

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.O(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f11002A0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f11004B0) == null)) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f11004B0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f11019j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f11002A0 = m.a((Activity) this.f11019j);
                f1();
            }
        }
        this.f11002A0 = onBackInvokedDispatcher;
        f1();
    }

    /* access modifiers changed from: package-private */
    public void O0(ViewGroup viewGroup) {
    }

    public void P(Toolbar toolbar) {
        if (this.f11019j instanceof Activity) {
            C1560a u10 = u();
            if (!(u10 instanceof B)) {
                this.f11031p = null;
                if (u10 != null) {
                    u10.n();
                }
                this.f11029o = null;
                if (toolbar != null) {
                    y yVar = new y(toolbar, x0(), this.f11025m);
                    this.f11029o = yVar;
                    this.f11025m.e(yVar.f11124c);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f11025m.e((g) null);
                }
                w();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void Q(int i10) {
        this.f11028n0 = i10;
    }

    /* access modifiers changed from: package-private */
    public final C1560a Q0() {
        return this.f11029o;
    }

    public final void R(CharSequence charSequence) {
        this.f11033q = charSequence;
        H h10 = this.f11035r;
        if (h10 != null) {
            h10.setWindowTitle(charSequence);
        } else if (Q0() != null) {
            Q0().w(charSequence);
        } else {
            TextView textView = this.f11005C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public androidx.appcompat.view.b S(b.a aVar) {
        e eVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f11041u;
            if (bVar != null) {
                bVar.c();
            }
            C0211i iVar = new C0211i(aVar);
            C1560a u10 = u();
            if (u10 != null) {
                androidx.appcompat.view.b x10 = u10.x(iVar);
                this.f11041u = x10;
                if (!(x10 == null || (eVar = this.f11027n) == null)) {
                    eVar.onSupportActionModeStarted(x10);
                }
            }
            if (this.f11041u == null) {
                this.f11041u = a1(iVar);
            }
            f1();
            return this.f11041u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public void V0(Configuration configuration, u1.i iVar) {
        k.d(configuration, iVar);
    }

    /* access modifiers changed from: package-private */
    public void W0(u1.i iVar) {
        k.c(iVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean X0() {
        ViewGroup viewGroup;
        if (!this.f11001A || (viewGroup = this.f11003B) == null || !viewGroup.isLaidOut()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public u1.i Z(Context context) {
        u1.i t10;
        if (Build.VERSION.SDK_INT >= 33 || (t10 = g.t()) == null) {
            return null;
        }
        u1.i v02 = v0(context.getApplicationContext().getResources().getConfiguration());
        u1.i b10 = w.b(t10, v02);
        if (b10.f()) {
            return v02;
        }
        return b10;
    }

    /* access modifiers changed from: package-private */
    public boolean Z0() {
        if (this.f11002A0 == null) {
            return false;
        }
        s w02 = w0(0, false);
        if ((w02 == null || !w02.f11091o) && this.f11041u == null) {
            return false;
        }
        return true;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s p02;
        Window.Callback y02 = y0();
        if (y02 == null || this.f11022k0 || (p02 = p0(eVar.D())) == null) {
            return false;
        }
        return y02.onMenuItemSelected(p02.f11077a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.b a1(androidx.appcompat.view.b.a r8) {
        /*
            r7 = this;
            r7.m0()
            androidx.appcompat.view.b r0 = r7.f11041u
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.i.C0211i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.i$i r0 = new androidx.appcompat.app.i$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f11027n
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f11022k0
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f11041u = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f11043v
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f11012X
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f11021k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = i.C2037a.f21261d
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f11021k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f11021k
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f11021k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f11043v = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = i.C2037a.f21263f
            r5.<init>(r4, r1, r6)
            r7.f11045w = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.f11045w
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f11043v
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f11045w
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = i.C2037a.f21259b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f11043v
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f11045w
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.i$d r0 = new androidx.appcompat.app.i$d
            r0.<init>()
            r7.f11047x = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f11003B
            int r4 = i.C2042f.f21376i
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.r0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f11043v = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f11043v
            if (r0 == 0) goto L_0x015b
            r7.m0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f11043v
            r0.k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f11043v
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f11043v
            android.widget.PopupWindow r6 = r7.f11045w
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            r8.h(r0)
            r7.f11041u = r0
            boolean r8 = r7.X0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            androidx.core.view.l0 r8 = androidx.core.view.C1680b0.e(r8)
            androidx.core.view.l0 r8 = r8.b(r0)
            r7.f11049y = r8
            androidx.appcompat.app.i$e r0 = new androidx.appcompat.app.i$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f11043v
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.C1680b0.l0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f11045w
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f11023l
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f11047x
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f11041u = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f11041u
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.e r0 = r7.f11027n
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            r7.f1()
            androidx.appcompat.view.b r8 = r7.f11041u
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i.a1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        T0(true);
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.f11015f0;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f11086j;
            }
        }
        if ((sVar == null || sVar.f11091o) && !this.f11022k0) {
            this.f11025m.d(this.f11023l.getCallback(), i10, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(androidx.appcompat.view.menu.e eVar) {
        if (!this.f11014Z) {
            this.f11014Z = true;
            this.f11035r.l();
            Window.Callback y02 = y0();
            if (y02 != null && !this.f11022k0) {
                y02.onPanelClosed(108, eVar);
            }
            this.f11014Z = false;
        }
    }

    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ((ViewGroup) this.f11003B.findViewById(16908290)).addView(view, layoutParams);
        this.f11025m.c(this.f11023l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void e0(int i10) {
        f0(w0(i10, true), true);
    }

    public boolean f() {
        return V(true);
    }

    /* access modifiers changed from: package-private */
    public void f0(s sVar, boolean z10) {
        ViewGroup viewGroup;
        H h10;
        if (!z10 || sVar.f11077a != 0 || (h10 = this.f11035r) == null || !h10.e()) {
            WindowManager windowManager = (WindowManager) this.f11021k.getSystemService("window");
            if (!(windowManager == null || !sVar.f11091o || (viewGroup = sVar.f11083g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    b0(sVar.f11077a, sVar, (Menu) null);
                }
            }
            sVar.f11089m = false;
            sVar.f11090n = false;
            sVar.f11091o = false;
            sVar.f11084h = null;
            sVar.f11093q = true;
            if (this.f11016g0 == sVar) {
                this.f11016g0 = null;
            }
            if (sVar.f11077a == 0) {
                f1();
                return;
            }
            return;
        }
        c0(sVar.f11086j);
    }

    /* access modifiers changed from: package-private */
    public void f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Z02 = Z0();
            if (Z02 && this.f11004B0 == null) {
                this.f11004B0 = m.b(this.f11002A0, this);
            } else if (!Z02 && (onBackInvokedCallback = this.f11004B0) != null) {
                m.c(this.f11002A0, onBackInvokedCallback);
                this.f11004B0 = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int h1(D0 d02, Rect rect) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int i14 = 0;
        if (d02 != null) {
            i10 = d02.m();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.f11043v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f11043v.getLayoutParams();
            boolean z12 = true;
            if (this.f11043v.isShown()) {
                if (this.f11046w0 == null) {
                    this.f11046w0 = new Rect();
                    this.f11048x0 = new Rect();
                }
                Rect rect2 = this.f11046w0;
                Rect rect3 = this.f11048x0;
                if (d02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(d02.k(), d02.m(), d02.l(), d02.j());
                }
                r0.a(this.f11003B, rect2, rect3);
                int i15 = rect2.top;
                int i16 = rect2.left;
                int i17 = rect2.right;
                D0 H10 = C1680b0.H(this.f11003B);
                if (H10 == null) {
                    i11 = 0;
                } else {
                    i11 = H10.k();
                }
                if (H10 == null) {
                    i12 = 0;
                } else {
                    i12 = H10.l();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z11 = true;
                }
                if (i15 <= 0 || this.f11006D != null) {
                    View view = this.f11006D;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i11;
                        marginLayoutParams.rightMargin = i12;
                        this.f11006D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f11021k);
                    this.f11006D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i12;
                    this.f11003B.addView(this.f11006D, -1, layoutParams);
                }
                View view3 = this.f11006D;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    i1(this.f11006D);
                }
                if (!this.f11011I && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f11043v.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f11006D;
        if (view4 != null) {
            if (!z10) {
                i14 = 8;
            }
            view4.setVisibility(i14);
        }
        return i10;
    }

    public Context i(Context context) {
        Configuration configuration;
        this.f11018i0 = true;
        int F02 = F0(context, a0());
        if (g.x(context)) {
            g.U(context);
        }
        u1.i Z10 = Z(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(g0(context, F02, Z10, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(g0(context, F02, Z10, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f11000F0) {
            return super.i(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = q0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration g02 = g0(context, F02, Z10, configuration, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, i.i.f21430c);
        dVar.a(g02);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    public View i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f11050y0 == null) {
            TypedArray obtainStyledAttributes = this.f11021k.obtainStyledAttributes(i.j.f21675y0);
            String string = obtainStyledAttributes.getString(i.j.f21443C0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f11050y0 = new t();
            } else {
                try {
                    this.f11050y0 = (t) this.f11021k.getClassLoader().loadClass(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f11050y0 = new t();
                }
            }
        }
        boolean z11 = f10998D0;
        boolean z12 = false;
        if (z11) {
            if (this.f11052z0 == null) {
                this.f11052z0 = new v();
            }
            if (this.f11052z0.a(attributeSet)) {
                z10 = true;
                return this.f11050y0.r(view, str, context, attributeSet, z10, z11, true, q0.c());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z12 = Y0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z12 = true;
            }
        }
        z10 = z12;
        return this.f11050y0.r(view, str, context, attributeSet, z10, z11, true, q0.c());
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        androidx.appcompat.view.menu.e eVar;
        H h10 = this.f11035r;
        if (h10 != null) {
            h10.l();
        }
        if (this.f11045w != null) {
            this.f11023l.getDecorView().removeCallbacks(this.f11047x);
            if (this.f11045w.isShowing()) {
                try {
                    this.f11045w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f11045w = null;
        }
        m0();
        s w02 = w0(0, false);
        if (w02 != null && (eVar = w02.f11086j) != null) {
            eVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f11019j;
        if (((obj instanceof C1714t.a) || (obj instanceof s)) && (decorView = this.f11023l.getDecorView()) != null && C1714t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f11025m.b(this.f11023l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return H0(keyCode, keyEvent);
        }
        return K0(keyCode, keyEvent);
    }

    public View l(int i10) {
        n0();
        return this.f11023l.findViewById(i10);
    }

    /* access modifiers changed from: package-private */
    public void l0(int i10) {
        s w02;
        s w03 = w0(i10, true);
        if (w03.f11086j != null) {
            Bundle bundle = new Bundle();
            w03.f11086j.R(bundle);
            if (bundle.size() > 0) {
                w03.f11095s = bundle;
            }
            w03.f11086j.e0();
            w03.f11086j.clear();
        }
        w03.f11094r = true;
        w03.f11093q = true;
        if ((i10 == 108 || i10 == 0) && this.f11035r != null && (w02 = w0(0, false)) != null) {
            w02.f11089m = false;
            S0(w02, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        C1700l0 l0Var = this.f11049y;
        if (l0Var != null) {
            l0Var.c();
        }
    }

    public Context n() {
        return this.f11021k;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return i0(view, str, context, attributeSet);
    }

    public final C1561b p() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public s p0(Menu menu) {
        int i10;
        s[] sVarArr = this.f11015f0;
        if (sVarArr != null) {
            i10 = sVarArr.length;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            s sVar = sVarArr[i11];
            if (sVar != null && sVar.f11086j == menu) {
                return sVar;
            }
        }
        return null;
    }

    public int q() {
        return this.f11026m0;
    }

    /* access modifiers changed from: package-private */
    public final Context r0() {
        Context context;
        C1560a u10 = u();
        if (u10 != null) {
            context = u10.k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f11021k;
        }
        return context;
    }

    public MenuInflater s() {
        Context context;
        if (this.f11031p == null) {
            z0();
            C1560a aVar = this.f11029o;
            if (aVar != null) {
                context = aVar.k();
            } else {
                context = this.f11021k;
            }
            this.f11031p = new androidx.appcompat.view.g(context);
        }
        return this.f11031p;
    }

    public C1560a u() {
        z0();
        return this.f11029o;
    }

    public void v() {
        LayoutInflater from = LayoutInflater.from(this.f11021k);
        if (from.getFactory() == null) {
            C1716u.a(from, this);
        } else if (!(from.getFactory2() instanceof i)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    public u1.i v0(Configuration configuration) {
        return k.b(configuration);
    }

    public void w() {
        if (Q0() != null && !u().l()) {
            D0(0);
        }
    }

    /* access modifiers changed from: protected */
    public s w0(int i10, boolean z10) {
        s[] sVarArr = this.f11015f0;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[(i10 + 1)];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f11015f0 = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence x0() {
        Object obj = this.f11019j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f11033q;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback y0() {
        return this.f11023l.getCallback();
    }

    public void z(Configuration configuration) {
        C1560a u10;
        if (this.f11009G && this.f11001A && (u10 = u()) != null) {
            u10.m(configuration);
        }
        C1572k.b().g(this.f11021k);
        this.f11024l0 = new Configuration(this.f11021k.getResources().getConfiguration());
        W(false, false);
    }

    i(Dialog dialog, e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    private i(Context context, Window window, e eVar, Object obj) {
        d c12;
        this.f11049y = null;
        this.f11051z = true;
        this.f11026m0 = -100;
        this.f11042u0 = new a();
        this.f11021k = context;
        this.f11027n = eVar;
        this.f11019j = obj;
        if (this.f11026m0 == -100 && (obj instanceof Dialog) && (c12 = c1()) != null) {
            this.f11026m0 = c12.getDelegate().q();
        }
        if (this.f11026m0 == -100) {
            Y y10 = f10997C0;
            Integer num = (Integer) y10.get(obj.getClass().getName());
            if (num != null) {
                this.f11026m0 = num.intValue();
                y10.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            Y(window);
        }
        C1572k.h();
    }
}
