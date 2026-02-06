package com.facebook.react.devsupport;

import C7.i;
import C7.j;
import I7.e;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.C3370p;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.C3335b;
import com.facebook.react.devsupport.C3344k;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.revenuecat.purchases.common.Constants;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import n7.C3863a;

public abstract class E implements I7.e {

    /* renamed from: A  reason: collision with root package name */
    private int f40666A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final I7.b f40667B;

    /* renamed from: C  reason: collision with root package name */
    private List f40668C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final Map f40669D;

    /* renamed from: E  reason: collision with root package name */
    private final j f40670E;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f40671a;

    /* renamed from: b  reason: collision with root package name */
    private final C7.f f40672b;

    /* renamed from: c  reason: collision with root package name */
    private final BroadcastReceiver f40673c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C3344k f40674d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashMap f40675e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    protected final e0 f40676f;

    /* renamed from: g  reason: collision with root package name */
    private final String f40677g;

    /* renamed from: h  reason: collision with root package name */
    private final File f40678h;

    /* renamed from: i  reason: collision with root package name */
    private final File f40679i;

    /* renamed from: j  reason: collision with root package name */
    private final DefaultJSExceptionHandler f40680j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final I7.c f40681k;

    /* renamed from: l  reason: collision with root package name */
    private final I7.h f40682l;

    /* renamed from: m  reason: collision with root package name */
    private i f40683m;

    /* renamed from: n  reason: collision with root package name */
    private AlertDialog f40684n;

    /* renamed from: o  reason: collision with root package name */
    private C3337d f40685o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f40686p = false;

    /* renamed from: q  reason: collision with root package name */
    private int f40687q = 0;

    /* renamed from: r  reason: collision with root package name */
    private ReactContext f40688r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final V7.a f40689s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f40690t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f40691u = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f40692v = false;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f40693w;

    /* renamed from: x  reason: collision with root package name */
    private String f40694x;

    /* renamed from: y  reason: collision with root package name */
    private I7.j[] f40695y;

    /* renamed from: z  reason: collision with root package name */
    private I7.f f40696z;

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (E.m0(context).equals(intent.getAction())) {
                if (intent.getBooleanExtra("jsproxy", false)) {
                    E.this.f40689s.k(true);
                    E.this.f40674d.y();
                } else {
                    E.this.f40689s.k(false);
                }
                E.this.z();
            }
        }
    }

    class b implements I7.d {
        b() {
        }

        public void a() {
            if (!E.this.f40689s.h() && E.this.f40689s.e()) {
                Toast.makeText(E.this.f40671a, E.this.f40671a.getString(C3370p.f41156h), 1).show();
                E.this.f40689s.d(false);
            }
            E.this.z();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f40699a;

        c(EditText editText) {
            this.f40699a = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            E.this.f40689s.i().d(this.f40699a.getText().toString());
            E.this.z();
        }
    }

    class d implements I7.d {
        d() {
        }

        public void a() {
            E.this.f40689s.b(!E.this.f40689s.a());
            E.this.f40676f.h();
        }
    }

    class e extends ArrayAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f40702a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, int i10, String[] strArr, Set set) {
            super(context, i10, strArr);
            this.f40702a = set;
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            view2.setEnabled(isEnabled(i10));
            return view2;
        }

        public boolean isEnabled(int i10) {
            return !this.f40702a.contains(getItem(i10));
        }
    }

    class f implements JSCHeapCapture.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a8.h f40704a;

        f(a8.h hVar) {
            this.f40704a = hVar;
        }

        public void a(JSCHeapCapture.b bVar) {
            this.f40704a.b(bVar.toString());
        }

        public void b(File file) {
            this.f40704a.a(file.toString());
        }
    }

    class g implements I7.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3335b.c f40706a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ I7.a f40707b;

        g(C3335b.c cVar, I7.a aVar) {
            this.f40706a = cVar;
            this.f40707b = aVar;
        }

        public void a(String str, Integer num, Integer num2) {
            E.this.f40681k.c(str, num, num2);
            if (E.this.f40667B != null) {
                E.this.f40667B.a(str, num, num2);
            }
        }

        public void onFailure(Exception exc) {
            E.this.p0();
            if (E.this.f40667B != null) {
                E.this.f40667B.onFailure(exc);
            }
            U5.a.n("ReactNative", "Unable to download JS bundle", exc);
            E.this.K0(exc);
            this.f40707b.a(exc);
        }

        public void onSuccess() {
            E.this.p0();
            if (E.this.f40667B != null) {
                E.this.f40667B.onSuccess();
            }
            ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, this.f40706a.c());
            this.f40707b.onSuccess();
        }
    }

    class h implements C3344k.h {
        h() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(a8.h hVar) {
            E.this.o0(hVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k() {
            E.this.D();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l() {
            E.this.z();
        }

        public void a(a8.h hVar) {
            UiThreadUtil.runOnUiThread(new F(this, hVar));
        }

        public void b() {
            E.this.f40693w = true;
        }

        public void c() {
            UiThreadUtil.runOnUiThread(new H(this));
        }

        public void d() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                E.this.f40674d.o();
            }
            UiThreadUtil.runOnUiThread(new G(this));
        }

        public void e() {
            E.this.f40693w = false;
        }

        public Map f() {
            return E.this.f40669D;
        }
    }

    public E(Context context, e0 e0Var, String str, boolean z10, I7.i iVar, I7.b bVar, int i10, Map map, j jVar, I7.c cVar, I7.h hVar) {
        this.f40676f = e0Var;
        this.f40671a = context;
        this.f40677g = str;
        C3343j jVar2 = new C3343j(context, new C3347n(this));
        this.f40689s = jVar2;
        this.f40674d = new C3344k(jVar2, context, jVar2.i());
        this.f40667B = bVar;
        this.f40672b = new C7.f(new C3348o(this), i10);
        this.f40669D = map;
        this.f40673c = new a();
        String n02 = n0();
        this.f40678h = new File(context.getFilesDir(), n02 + "ReactNativeDevBundle.js");
        this.f40679i = context.getDir(n02.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        this.f40680j = new DefaultJSExceptionHandler();
        r(z10);
        this.f40681k = cVar == null ? new C3341h(e0Var) : cVar;
        this.f40670E = jVar;
        this.f40682l = hVar == null ? new c0(new C3349p(this)) : hVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0() {
        if (!this.f40689s.c()) {
            Activity a10 = this.f40676f.a();
            if (a10 == null) {
                U5.a.m("ReactNative", "Unable to get reference to react activity");
            } else {
                C3337d.h(a10);
            }
        }
        V7.a aVar = this.f40689s;
        aVar.j(!aVar.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B0() {
        Intent intent = new Intent(this.f40671a, C3345l.class);
        intent.setFlags(268435456);
        this.f40671a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C0(I7.d[] dVarArr, DialogInterface dialogInterface, int i10) {
        dVarArr[i10].a();
        this.f40684n = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D0(DialogInterface dialogInterface) {
        this.f40684n = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E0(String str, I7.j[] jVarArr, int i10, I7.f fVar) {
        P0(str, jVarArr, i10, fVar);
        if (this.f40683m == null) {
            i e10 = e(NativeRedBoxSpec.NAME);
            if (e10 != null) {
                this.f40683m = e10;
            } else {
                this.f40683m = new j0(this);
            }
            this.f40683m.e(NativeRedBoxSpec.NAME);
        }
        if (!this.f40683m.c()) {
            this.f40683m.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F0() {
        V7.a aVar = this.f40689s;
        aVar.b(!aVar.a());
        this.f40676f.h();
    }

    private void G0(Exception exc) {
        String str;
        if (exc.getMessage() == null) {
            str = "Exception in native call from JS";
        } else {
            str = exc.getMessage();
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (exc instanceof JavascriptException) {
            U5.a.n("ReactNative", "Exception in native call from JS", exc);
            N0(exc.getMessage().toString(), new I7.j[0], -1, I7.f.JS);
            return;
        }
        O0(sb2.toString(), exc);
    }

    /* access modifiers changed from: private */
    public void H0() {
        UiThreadUtil.assertOnUiThread();
        if (this.f40692v) {
            C3337d dVar = this.f40685o;
            if (dVar != null) {
                dVar.i(this.f40689s.c());
            }
            if (!this.f40691u) {
                this.f40672b.e((SensorManager) this.f40671a.getSystemService("sensor"));
                this.f40691u = true;
            }
            if (!this.f40690t) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(m0(this.f40671a));
                g0(this.f40671a, this.f40673c, intentFilter, true);
                this.f40690t = true;
            }
            if (this.f40686p) {
                this.f40681k.b("Reloading...");
            }
            this.f40674d.B(getClass().getSimpleName(), new h());
            return;
        }
        C3337d dVar2 = this.f40685o;
        if (dVar2 != null) {
            dVar2.i(false);
        }
        if (this.f40691u) {
            this.f40672b.f();
            this.f40691u = false;
        }
        if (this.f40690t) {
            this.f40671a.unregisterReceiver(this.f40673c);
            this.f40690t = false;
        }
        p();
        q0();
        this.f40681k.a();
        this.f40674d.j();
    }

    /* access modifiers changed from: private */
    public void K0(Exception exc) {
        UiThreadUtil.runOnUiThread(new C3353u(this, exc));
    }

    private void L0(ReactContext reactContext) {
        int defaultPort;
        if (this.f40688r != reactContext) {
            this.f40688r = reactContext;
            C3337d dVar = this.f40685o;
            if (dVar != null) {
                dVar.i(false);
            }
            if (reactContext != null) {
                this.f40685o = new C3337d(reactContext);
            }
            if (this.f40688r != null) {
                try {
                    URL url = new URL(u());
                    String substring = url.getPath().substring(1);
                    String host = url.getHost();
                    if (url.getPort() != -1) {
                        defaultPort = url.getPort();
                    } else {
                        defaultPort = url.getDefaultPort();
                    }
                    ((HMRClient) this.f40688r.getJSModule(HMRClient.class)).setup("android", substring, host, defaultPort, this.f40689s.e());
                } catch (MalformedURLException e10) {
                    O0(e10.getMessage(), e10);
                }
            }
            J0();
        }
    }

    private void M0(String str) {
        int i10;
        if (this.f40671a != null) {
            try {
                URL url = new URL(str);
                if (url.getPort() != -1) {
                    i10 = url.getPort();
                } else {
                    i10 = url.getDefaultPort();
                }
                I7.c cVar = this.f40681k;
                Context context = this.f40671a;
                int i11 = C3370p.f41160l;
                cVar.b(context.getString(i11, new Object[]{url.getHost() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i10}));
                this.f40686p = true;
            } catch (MalformedURLException e10) {
                U5.a.m("ReactNative", "Bundle url format is invalid. \n\n" + e10.toString());
            }
        }
    }

    private void N0(String str, I7.j[] jVarArr, int i10, I7.f fVar) {
        UiThreadUtil.runOnUiThread(new C3346m(this, str, jVarArr, i10, fVar));
    }

    private void P0(String str, I7.j[] jVarArr, int i10, I7.f fVar) {
        this.f40694x = str;
        this.f40695y = jVarArr;
        this.f40666A = i10;
        this.f40696z = fVar;
    }

    private void g0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z10) {
        int i10;
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        if (z10) {
            i10 = 2;
        } else {
            i10 = 4;
        }
        Intent unused = context.registerReceiver(broadcastReceiver, intentFilter, i10);
    }

    private String k0() {
        try {
            return l0().b().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static String m0(Context context) {
        return context.getPackageName() + ".RELOAD_APP_ACTION";
    }

    /* access modifiers changed from: private */
    public void o0(a8.h hVar) {
        JSCHeapCapture jSCHeapCapture;
        ReactContext reactContext = this.f40688r;
        if (reactContext != null && (jSCHeapCapture = (JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)) != null) {
            jSCHeapCapture.captureHeap(this.f40671a.getCacheDir().getPath(), new f(hVar));
        }
    }

    private void q0() {
        AlertDialog alertDialog = this.f40684n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f40684n = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r0(I7.g gVar) {
        this.f40674d.x(gVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Context s0() {
        Activity a10 = this.f40676f.a();
        if (a10 == null || a10.isFinishing()) {
            return null;
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t0(Exception exc) {
        if (exc instanceof C7.c) {
            O0(((C7.c) exc).getMessage(), exc);
        } else {
            O0(this.f40671a.getString(C3370p.f41165q), exc);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u0(boolean z10) {
        this.f40689s.j(z10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v0(boolean z10) {
        this.f40689s.d(z10);
        z();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w0(boolean z10) {
        this.f40689s.k(z10);
        z();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y0() {
        Activity a10 = this.f40676f.a();
        if (a10 == null || a10.isFinishing()) {
            U5.a.m("ReactNative", "Unable to launch change bundle location because react activity is not available");
            return;
        }
        EditText editText = new EditText(a10);
        editText.setHint("localhost:8081");
        new AlertDialog.Builder(a10).setTitle(this.f40671a.getString(C3370p.f41150b)).setView(editText).setPositiveButton(17039370, new c(editText)).create().show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z0() {
        boolean e10 = this.f40689s.e();
        this.f40689s.d(!e10);
        ReactContext reactContext = this.f40688r;
        if (reactContext != null) {
            Class cls = HMRClient.class;
            if (!e10) {
                ((HMRClient) reactContext.getJSModule(cls)).enable();
            } else {
                ((HMRClient) reactContext.getJSModule(cls)).disable();
            }
        }
        if (!e10 && !this.f40689s.h()) {
            Context context = this.f40671a;
            Toast.makeText(context, context.getString(C3370p.f41157i), 1).show();
            this.f40689s.l(true);
            z();
        }
    }

    public void A(I7.g gVar) {
        new C3350q(this, gVar).run();
    }

    public V7.a B() {
        return this.f40689s;
    }

    public boolean C() {
        if (this.f40692v && this.f40678h.exists()) {
            try {
                String packageName = this.f40671a.getPackageName();
                if (this.f40678h.lastModified() > this.f40671a.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", new Object[]{packageName}));
                    if (!file.exists()) {
                        return true;
                    }
                    if (this.f40678h.lastModified() > file.lastModified()) {
                        return true;
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                U5.a.m("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    public void D() {
        String str;
        String str2;
        int i10;
        if (this.f40684n == null && this.f40692v && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            linkedHashMap.put(this.f40671a.getString(C3370p.f41164p), new b());
            if (this.f40689s.m()) {
                this.f40689s.k(false);
                z();
            }
            if (this.f40689s.f() && !this.f40689s.m()) {
                boolean z10 = this.f40693w;
                Context context = this.f40671a;
                if (z10) {
                    i10 = C3370p.f41151c;
                } else {
                    i10 = C3370p.f41152d;
                }
                String string = context.getString(i10);
                if (!z10) {
                    hashSet.add(string);
                }
                linkedHashMap.put(string, new C3355w(this));
            }
            linkedHashMap.put(this.f40671a.getString(C3370p.f41150b), new C3356x(this));
            linkedHashMap.put(this.f40671a.getString(C3370p.f41159k), new d());
            if (this.f40689s.e()) {
                str = this.f40671a.getString(C3370p.f41158j);
            } else {
                str = this.f40671a.getString(C3370p.f41155g);
            }
            linkedHashMap.put(str, new C3357y(this));
            if (this.f40689s.c()) {
                str2 = this.f40671a.getString(C3370p.f41163o);
            } else {
                str2 = this.f40671a.getString(C3370p.f41162n);
            }
            linkedHashMap.put(str2, new C3358z(this));
            linkedHashMap.put(this.f40671a.getString(C3370p.f41166r), new A(this));
            if (this.f40675e.size() > 0) {
                linkedHashMap.putAll(this.f40675e);
            }
            I7.d[] dVarArr = (I7.d[]) linkedHashMap.values().toArray(new I7.d[0]);
            Activity a10 = this.f40676f.a();
            if (a10 == null || a10.isFinishing()) {
                U5.a.m("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(a10);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(a10);
            textView.setText(a10.getString(C3370p.f41153e, new Object[]{n0()}));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String k02 = k0();
            if (k02 != null) {
                TextView textView2 = new TextView(a10);
                textView2.setText(a10.getString(C3370p.f41154f, new Object[]{k02}));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            AlertDialog create = new AlertDialog.Builder(a10).setCustomTitle(linearLayout).setAdapter(new e(a10, 17367043, (String[]) linkedHashMap.keySet().toArray(new String[0]), hashSet), new B(this, dVarArr)).setOnCancelListener(new C(this)).create();
            this.f40684n = create;
            create.show();
            ReactContext reactContext = this.f40688r;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", (Object) null);
            }
        }
    }

    public void E(ReactContext reactContext) {
        if (reactContext == this.f40688r) {
            L0((ReactContext) null);
        }
        System.gc();
    }

    /* renamed from: F */
    public void x0() {
        this.f40674d.z(this.f40688r, this.f40671a.getString(C3370p.f41161m));
    }

    public void I0(String str, I7.a aVar) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        M0(str);
        C3335b.c cVar = new C3335b.c();
        this.f40674d.p(new g(cVar, aVar), this.f40678h, str, cVar);
    }

    public void J0() {
        if (UiThreadUtil.isOnUiThread()) {
            H0();
        } else {
            UiThreadUtil.runOnUiThread(new C3352t(this));
        }
    }

    public void O0(String str, Throwable th2) {
        U5.a.n("ReactNative", "Exception in native call", th2);
        N0(str, l0.a(th2), -1, I7.f.NATIVE);
    }

    public Activity a() {
        return this.f40676f.a();
    }

    public void b(String str, e.a aVar) {
        this.f40682l.b(str, aVar);
    }

    public View c(String str) {
        return this.f40676f.c(str);
    }

    public void d(boolean z10) {
        if (this.f40692v) {
            UiThreadUtil.runOnUiThread(new r(this, z10));
        }
    }

    public i e(String str) {
        j jVar = this.f40670E;
        if (jVar == null) {
            return null;
        }
        return jVar.e(str);
    }

    public void f(View view) {
        this.f40676f.f(view);
    }

    public void g() {
        this.f40682l.g();
    }

    public void h() {
        if (this.f40692v) {
            UiThreadUtil.runOnUiThread(new C3351s(this));
        }
    }

    public I7.c h0() {
        return this.f40681k;
    }

    public void handleException(Exception exc) {
        if (this.f40692v) {
            G0(exc);
        } else {
            this.f40680j.handleException(exc);
        }
    }

    public ReactContext i() {
        return this.f40688r;
    }

    public C3344k i0() {
        return this.f40674d;
    }

    public void j(boolean z10) {
        if (this.f40692v) {
            UiThreadUtil.runOnUiThread(new D(this, z10));
        }
    }

    public String j0() {
        return this.f40677g;
    }

    public void k(boolean z10) {
        if (this.f40692v && this.f40689s.m() != z10) {
            UiThreadUtil.runOnUiThread(new C3354v(this, z10));
        }
    }

    public String l() {
        return this.f40678h.getAbsolutePath();
    }

    public e0 l0() {
        return this.f40676f;
    }

    public String m() {
        return this.f40694x;
    }

    public void n() {
        this.f40674d.i();
    }

    /* access modifiers changed from: protected */
    public abstract String n0();

    public boolean o() {
        return this.f40692v;
    }

    public void p() {
        i iVar = this.f40683m;
        if (iVar != null) {
            iVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void p0() {
        this.f40681k.a();
        this.f40686p = false;
    }

    public Pair q(Pair pair) {
        List list = this.f40668C;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        }
        return pair;
    }

    public void r(boolean z10) {
        this.f40692v = z10;
        J0();
    }

    public I7.f s() {
        return this.f40696z;
    }

    public void t(String str, I7.d dVar) {
        this.f40675e.put(str, dVar);
    }

    public String u() {
        String str = this.f40677g;
        if (str == null) {
            return "";
        }
        return this.f40674d.w((String) C3863a.c(str));
    }

    public I7.i v() {
        return null;
    }

    public void w() {
        if (this.f40692v) {
            this.f40674d.A();
        }
    }

    public I7.j[] x() {
        return this.f40695y;
    }

    public void y(ReactContext reactContext) {
        L0(reactContext);
    }
}
