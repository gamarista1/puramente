package Dd;

import Pd.f;
import Pd.g;
import U7.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.media.session.c;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.C1587a;
import com.facebook.react.A;
import com.facebook.react.B;
import com.facebook.react.C3433v;
import com.facebook.react.C3448z;
import com.facebook.react.J;
import com.facebook.react.O;
import com.facebook.react.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import mf.C6565s;

public final class k extends C3433v {

    /* renamed from: f  reason: collision with root package name */
    private final r f50629f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f50630g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C3433v f50631h;

    /* renamed from: i  reason: collision with root package name */
    private final List f50632i;

    /* renamed from: j  reason: collision with root package name */
    private final List f50633j;

    /* renamed from: k  reason: collision with root package name */
    private final C1587a f50634k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f50635l;

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f50636m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f50637n;

    public static final class a implements B {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f50638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50639b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50640c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Intent f50641d;

        a(k kVar, int i10, int i11, Intent intent) {
            this.f50638a = kVar;
            this.f50639b = i10;
            this.f50640c = i11;
            this.f50641d = intent;
        }

        public void a(ReactContext reactContext) {
            C6496s.h(reactContext, "context");
            this.f50638a.f50631h.getReactInstanceManager().s0(this);
            this.f50638a.f50631h.onActivityResult(this.f50639b, this.f50640c, this.f50641d);
        }
    }

    public static final class b extends C3448z {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k f50642j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Bundle bundle, k kVar, Activity activity, O o10, String str) {
            super(activity, o10, str, bundle);
            this.f50642j = kVar;
        }

        /* access modifiers changed from: protected */
        public Z b() {
            Z createRootView = this.f50642j.createRootView();
            if (createRootView != null) {
                return createRootView;
            }
            Z b10 = super.b();
            C6496s.g(b10, "createRootView(...)");
            return b10;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(r rVar, boolean z10, C3433v vVar) {
        super(rVar, (String) null);
        C6496s.h(rVar, "activity");
        C6496s.h(vVar, "delegate");
        this.f50629f = rVar;
        this.f50630g = z10;
        this.f50631h = vVar;
        ArrayList arrayList = new ArrayList();
        for (f b10 : c.f50609b.a()) {
            List b11 = b10.b(this.f50629f);
            C6496s.g(b11, "createReactActivityLifecycleListeners(...)");
            C6565s.D(arrayList, b11);
        }
        this.f50632i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (f d10 : c.f50609b.a()) {
            List d11 = d10.d(this.f50629f);
            C6496s.g(d11, "createReactActivityHandlers(...)");
            C6565s.D(arrayList2, d11);
        }
        this.f50633j = arrayList2;
        this.f50634k = new C1587a();
        this.f50635l = C6531o.b(new g(this));
        this.f50636m = C6531o.b(new h(this));
    }

    /* access modifiers changed from: private */
    public static final A j(k kVar) {
        return kVar.f50631h.getReactHost();
    }

    /* access modifiers changed from: private */
    public static final O k(k kVar) {
        return (O) kVar.o("getReactNativeHost");
    }

    private final A m() {
        return (A) this.f50636m.getValue();
    }

    private final O n() {
        return (O) this.f50635l.getValue();
    }

    private final Object o(String str) {
        Method method = (Method) this.f50634k.get(str);
        if (method == null) {
            method = C3433v.class.getDeclaredMethod(str, (Class[]) null);
            method.setAccessible(true);
            this.f50634k.put(str, method);
        }
        C6496s.e(method);
        return method.invoke(this.f50631h, (Object[]) null);
    }

    private final Object p(String str, Class[] clsArr, Object[] objArr) {
        Method method = (Method) this.f50634k.get(str);
        if (method == null) {
            method = C3433v.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            method.setAccessible(true);
            this.f50634k.put(str, method);
        }
        C6496s.e(method);
        return method.invoke(this.f50631h, Arrays.copyOf(objArr, objArr.length));
    }

    /* access modifiers changed from: private */
    public static final ViewGroup q(k kVar, g gVar) {
        return gVar.b(kVar.f50629f);
    }

    /* access modifiers changed from: private */
    public static final g.a r(k kVar, g gVar) {
        gVar.c(kVar.f50629f, kVar.getReactNativeHost());
        return null;
    }

    /* access modifiers changed from: private */
    public static final C3433v s(k kVar, g gVar) {
        return gVar.a(kVar.f50629f, kVar);
    }

    /* access modifiers changed from: protected */
    public Bundle composeLaunchOptions() {
        return (Bundle) o("composeLaunchOptions");
    }

    /* access modifiers changed from: protected */
    public Z createRootView() {
        return (Z) o("createRootView");
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return (Context) o("getContext");
    }

    /* access modifiers changed from: protected */
    public Bundle getLaunchOptions() {
        return (Bundle) o("getLaunchOptions");
    }

    public String getMainComponentName() {
        return this.f50631h.getMainComponentName();
    }

    /* access modifiers changed from: protected */
    public Activity getPlainActivity() {
        return (Activity) o("getPlainActivity");
    }

    /* access modifiers changed from: protected */
    public C3448z getReactDelegate() {
        return (C3448z) o("getReactDelegate");
    }

    public A getReactHost() {
        return m();
    }

    public J getReactInstanceManager() {
        J reactInstanceManager = this.f50631h.getReactInstanceManager();
        C6496s.g(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    /* access modifiers changed from: protected */
    public O getReactNativeHost() {
        return n();
    }

    /* access modifiers changed from: protected */
    public boolean isFabricEnabled() {
        return ((Boolean) o("isFabricEnabled")).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void loadApp(String str) {
        ViewParent viewParent;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) Rg.k.r(Rg.k.y(C6565s.b0(this.f50633j), new i(this)));
        if (viewGroup2 != null) {
            Field declaredField = C3433v.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.f50631h);
            C6496s.f(obj, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
            C3448z zVar = (C3448z) obj;
            zVar.j(str);
            Z g10 = zVar.g();
            if (g10 != null) {
                viewParent = g10.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewParent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(g10);
            }
            viewGroup2.addView(g10, -1);
            this.f50629f.setContentView((View) viewGroup2);
            Iterator it = this.f50632i.iterator();
            if (it.hasNext()) {
                c.a(it.next());
                throw null;
            }
            return;
        }
        c.a(Rg.k.r(Rg.k.y(C6565s.b0(this.f50633j), new j(this))));
        p("loadApp", new Class[]{String.class}, new String[]{str});
        Iterator it2 = this.f50632i.iterator();
        if (it2.hasNext()) {
            c.a(it2.next());
            throw null;
        }
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (xe.b.f62256a.a() || this.f50631h.getReactInstanceManager().D() != null) {
            this.f50631h.onActivityResult(i10, i11, intent);
            return;
        }
        this.f50631h.getReactInstanceManager().s(new a(this, i10, i11, intent));
    }

    public boolean onBackPressed() {
        boolean z10;
        Iterable iterable = this.f50632i;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            Iterator it2 = arrayList.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                    if (z10 || booleanValue) {
                        z10 = true;
                    }
                }
            }
            boolean onBackPressed = this.f50631h.onBackPressed();
            if (z10 || onBackPressed) {
                return true;
            }
            return false;
        }
        c.a(it.next());
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f50631h.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: type inference failed for: r9v12, types: [com.facebook.react.z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.util.List r0 = r8.f50633j
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            Rg.h r0 = mf.C6565s.b0(r0)
            Dd.f r1 = new Dd.f
            r1.<init>(r8)
            Rg.h r0 = Rg.k.y(r0, r1)
            java.lang.Object r0 = Rg.k.r(r0)
            com.facebook.react.v r0 = (com.facebook.react.C3433v) r0
            r1 = 1
            if (r0 == 0) goto L_0x0056
            boolean r2 = kotlin.jvm.internal.C6496s.c(r0, r8)
            if (r2 != 0) goto L_0x0056
            java.lang.Class<com.facebook.react.r> r2 = com.facebook.react.r.class
            java.lang.String r3 = "a"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)
            r2.setAccessible(r1)
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r4 = "accessFlags"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)
            r3.setAccessible(r1)
            int r1 = r2.getModifiers()
            r1 = r1 & -17
            r3.setInt(r2, r1)
            com.facebook.react.r r1 = r8.f50629f
            r2.set(r1, r0)
            r8.f50631h = r0
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            android.os.Bundle[] r9 = new android.os.Bundle[]{r9}
            java.lang.String r1 = "onCreate"
            r8.p(r1, r0, r9)
            goto L_0x00a4
        L_0x0056:
            android.os.Bundle r3 = r8.composeLaunchOptions()
            xe.b r9 = xe.b.f62256a
            boolean r9 = r9.a()
            if (r9 == 0) goto L_0x0074
            com.facebook.react.z r9 = new com.facebook.react.z
            android.app.Activity r0 = r8.getPlainActivity()
            com.facebook.react.A r2 = r8.getReactHost()
            java.lang.String r4 = r8.getMainComponentName()
            r9.<init>((android.app.Activity) r0, (com.facebook.react.A) r2, (java.lang.String) r4, (android.os.Bundle) r3)
            goto L_0x0087
        L_0x0074:
            android.app.Activity r5 = r8.getPlainActivity()
            com.facebook.react.O r6 = r8.getReactNativeHost()
            java.lang.String r7 = r8.getMainComponentName()
            Dd.k$b r9 = new Dd.k$b
            r2 = r9
            r4 = r8
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0087:
            java.lang.Class<com.facebook.react.v> r0 = com.facebook.react.C3433v.class
            java.lang.String r2 = "e"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            r0.setAccessible(r1)
            com.facebook.react.v r1 = r8.f50631h
            r0.set(r1, r9)
            java.lang.String r9 = r8.getMainComponentName()
            if (r9 == 0) goto L_0x00a4
            java.lang.String r9 = r8.getMainComponentName()
            r8.loadApp(r9)
        L_0x00a4:
            java.util.List r9 = r8.f50632i
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x00b3
            return
        L_0x00b3:
            java.lang.Object r9 = r9.next()
            android.support.v4.media.session.c.a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.k.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        if (this.f50637n) {
            this.f50637n = false;
            return;
        }
        Iterator it = this.f50632i.iterator();
        if (!it.hasNext()) {
            o("onDestroy");
        } else {
            c.a(it.next());
            throw null;
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        Iterable iterable = this.f50633j;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            Iterator it2 = arrayList.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                    if (z10 || booleanValue) {
                        z10 = true;
                    }
                }
            }
            if (z10 || this.f50631h.onKeyDown(i10, keyEvent)) {
                return true;
            }
            return false;
        }
        c.a(it.next());
        throw null;
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        boolean z10;
        Iterable iterable = this.f50633j;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            Iterator it2 = arrayList.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                    if (z10 || booleanValue) {
                        z10 = true;
                    }
                }
            }
            if (z10 || this.f50631h.onKeyLongPress(i10, keyEvent)) {
                return true;
            }
            return false;
        }
        c.a(it.next());
        throw null;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        Iterable iterable = this.f50633j;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            Iterator it2 = arrayList.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                    if (z10 || booleanValue) {
                        z10 = true;
                    }
                }
            }
            if (z10 || this.f50631h.onKeyUp(i10, keyEvent)) {
                return true;
            }
            return false;
        }
        c.a(it.next());
        throw null;
    }

    public boolean onNewIntent(Intent intent) {
        boolean z10;
        Iterable iterable = this.f50632i;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            Iterator it2 = arrayList.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                    if (z10 || booleanValue) {
                        z10 = true;
                    }
                }
            }
            boolean onNewIntent = this.f50631h.onNewIntent(intent);
            if (z10 || onNewIntent) {
                return true;
            }
            return false;
        }
        c.a(it.next());
        throw null;
    }

    public void onPause() {
        if (this.f50637n) {
            this.f50637n = false;
            return;
        }
        Iterator it = this.f50632i.iterator();
        if (!it.hasNext()) {
            o("onPause");
        } else {
            c.a(it.next());
            throw null;
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f50631h.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void onResume() {
        if (!this.f50637n) {
            o("onResume");
            Iterator it = this.f50632i.iterator();
            if (it.hasNext()) {
                c.a(it.next());
                throw null;
            }
        }
    }

    public void onUserLeaveHint() {
        Iterator it = this.f50632i.iterator();
        if (!it.hasNext()) {
            o("onUserLeaveHint");
        } else {
            c.a(it.next());
            throw null;
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f50631h.onWindowFocusChanged(z10);
    }

    public void requestPermissions(String[] strArr, int i10, h hVar) {
        this.f50631h.requestPermissions(strArr, i10, hVar);
    }
}
