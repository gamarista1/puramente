package o7;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C3286a;
import com.facebook.C3457t;
import com.facebook.C3459v;
import com.facebook.C3460w;
import com.facebook.C3461x;
import com.facebook.C3462y;
import com.facebook.I;
import com.facebook.S;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import mf.C6559l;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C4049a;
import y7.G;

public class b0 extends Dialog {

    /* renamed from: m  reason: collision with root package name */
    public static final b f47194m = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final int f47195n = P5.f.f33484a;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static volatile int f47196o;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f47197a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f47198b;

    /* renamed from: c  reason: collision with root package name */
    private d f47199c;

    /* renamed from: d  reason: collision with root package name */
    private WebView f47200d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ProgressDialog f47201e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ImageView f47202f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f47203g;

    /* renamed from: h  reason: collision with root package name */
    private e f47204h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47205i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f47206j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f47207k;

    /* renamed from: l  reason: collision with root package name */
    private WindowManager.LayoutParams f47208l;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            X.o();
            return b0.f47196o;
        }

        /* access modifiers changed from: protected */
        public final void b(Context context) {
            Bundle bundle;
            if (context != null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo != null) {
                        bundle = applicationInfo.metaData;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && b0.f47196o == 0) {
                        e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }

        public final b0 c(Context context, String str, Bundle bundle, int i10, d dVar) {
            C6496s.h(context, "context");
            b0.s(context);
            return new b0(context, str, bundle, i10, G.FACEBOOK, dVar, (DefaultConstructorMarker) null);
        }

        public final b0 d(Context context, String str, Bundle bundle, int i10, G g10, d dVar) {
            C6496s.h(context, "context");
            C6496s.h(g10, "targetApp");
            b0.s(context);
            return new b0(context, str, bundle, i10, g10, dVar, (DefaultConstructorMarker) null);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                i10 = b0.f47195n;
            }
            b0.f47196o = i10;
        }

        private b() {
        }
    }

    private final class c extends WebViewClient {
        public c() {
        }

        public void onPageFinished(WebView webView, String str) {
            ProgressDialog h10;
            C6496s.h(webView, "view");
            C6496s.h(str, "url");
            super.onPageFinished(webView, str);
            if (!b0.this.f47206j && (h10 = b0.this.f47201e) != null) {
                h10.dismiss();
            }
            FrameLayout d10 = b0.this.f47203g;
            if (d10 != null) {
                d10.setBackgroundColor(0);
            }
            WebView r10 = b0.this.r();
            if (r10 != null) {
                r10.setVisibility(0);
            }
            ImageView e10 = b0.this.f47202f;
            if (e10 != null) {
                e10.setVisibility(0);
            }
            b0.this.f47207k = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog h10;
            C6496s.h(webView, "view");
            C6496s.h(str, "url");
            W.l0("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!b0.this.f47206j && (h10 = b0.this.f47201e) != null) {
                h10.show();
            }
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            C6496s.h(webView, "view");
            C6496s.h(str, com.amazon.a.a.o.b.f37480c);
            C6496s.h(str2, "failingUrl");
            super.onReceivedError(webView, i10, str, str2);
            b0.this.y(new C3457t(str, i10, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C6496s.h(webView, "view");
            C6496s.h(sslErrorHandler, "handler");
            C6496s.h(sslError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            b0.this.y(new C3457t((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.C6496s.h(r6, r0)
                java.lang.String r6 = "url"
                kotlin.jvm.internal.C6496s.h(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                o7.W.l0(r0, r6)
                android.net.Uri r6 = android.net.Uri.parse(r7)
                java.lang.String r0 = r6.getPath()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x003a
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                java.lang.String r6 = r6.getPath()
                boolean r6 = java.util.regex.Pattern.matches(r0, r6)
                if (r6 == 0) goto L_0x003a
                r6 = r1
                goto L_0x003b
            L_0x003a:
                r6 = r2
            L_0x003b:
                o7.b0 r0 = o7.b0.this
                java.lang.String r0 = r0.f47198b
                r3 = 2
                r4 = 0
                boolean r0 = Sg.p.J(r7, r0, r2, r3, r4)
                if (r0 == 0) goto L_0x00ce
                o7.b0 r6 = o7.b0.this
                android.os.Bundle r6 = r6.w(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x005d
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x005d:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r6.getString(r0)
                if (r0 != 0) goto L_0x006b
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r6.getString(r0)
            L_0x006b:
                if (r0 != 0) goto L_0x0073
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r6.getString(r0)
            L_0x0073:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                r3 = -1
                if (r2 == 0) goto L_0x0087
                boolean r4 = o7.W.e0(r2)
                if (r4 != 0) goto L_0x0087
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0087 }
                goto L_0x0088
            L_0x0087:
                r2 = r3
            L_0x0088:
                boolean r4 = o7.W.e0(r7)
                if (r4 == 0) goto L_0x009c
                boolean r4 = o7.W.e0(r0)
                if (r4 == 0) goto L_0x009c
                if (r2 != r3) goto L_0x009c
                o7.b0 r7 = o7.b0.this
                r7.z(r6)
                goto L_0x00cd
            L_0x009c:
                if (r7 == 0) goto L_0x00b4
                java.lang.String r6 = "access_denied"
                boolean r6 = kotlin.jvm.internal.C6496s.c(r7, r6)
                if (r6 != 0) goto L_0x00ae
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = kotlin.jvm.internal.C6496s.c(r7, r6)
                if (r6 == 0) goto L_0x00b4
            L_0x00ae:
                o7.b0 r6 = o7.b0.this
                r6.cancel()
                goto L_0x00cd
            L_0x00b4:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x00be
                o7.b0 r6 = o7.b0.this
                r6.cancel()
                goto L_0x00cd
            L_0x00be:
                com.facebook.y r6 = new com.facebook.y
                r6.<init>(r2, r7, r0)
                o7.b0 r7 = o7.b0.this
                com.facebook.K r2 = new com.facebook.K
                r2.<init>(r6, r0)
                r7.y(r2)
            L_0x00cd:
                return r1
            L_0x00ce:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = Sg.p.J(r7, r0, r2, r3, r4)
                if (r0 == 0) goto L_0x00dc
                o7.b0 r6 = o7.b0.this
                r6.cancel()
                return r1
            L_0x00dc:
                if (r6 != 0) goto L_0x00fe
                java.lang.String r6 = "touch"
                boolean r6 = Sg.p.O(r7, r6, r2, r3, r4)
                if (r6 == 0) goto L_0x00e7
                goto L_0x00fe
            L_0x00e7:
                o7.b0 r6 = o7.b0.this     // Catch:{ ActivityNotFoundException -> 0x00fc }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00fc }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00fc }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00fc }
                r0.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00fc }
                r6.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00fc }
                goto L_0x00fd
            L_0x00fc:
                r1 = r2
            L_0x00fd:
                return r1
            L_0x00fe:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.b0.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    public interface d {
        void a(Bundle bundle, C3459v vVar);
    }

    private final class e extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private final String f47217a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f47218b;

        /* renamed from: c  reason: collision with root package name */
        private Exception[] f47219c = new Exception[0];

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b0 f47220d;

        public e(b0 b0Var, String str, Bundle bundle) {
            C6496s.h(str, "action");
            C6496s.h(bundle, "parameters");
            this.f47220d = b0Var;
            this.f47217a = str;
            this.f47218b = bundle;
        }

        /* access modifiers changed from: private */
        public static final void c(String[] strArr, int i10, e eVar, CountDownLatch countDownLatch, S s10) {
            C6496s.h(strArr, "$results");
            C6496s.h(eVar, "this$0");
            C6496s.h(countDownLatch, "$latch");
            C6496s.h(s10, "response");
            try {
                C3462y b10 = s10.b();
                String str = "Error staging photo.";
                if (b10 != null) {
                    String d10 = b10.d();
                    if (d10 != null) {
                        str = d10;
                    }
                    throw new C3460w(s10, str);
                }
                JSONObject c10 = s10.c();
                if (c10 != null) {
                    String optString = c10.optString("uri");
                    if (optString != null) {
                        strArr[i10] = optString;
                        countDownLatch.countDown();
                        return;
                    }
                    throw new C3459v(str);
                }
                throw new C3459v(str);
            } catch (Exception e10) {
                eVar.f47219c[i10] = e10;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|(2:33|31)|42|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r12 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
            if (r12.hasNext() != false) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
            ((com.facebook.P) r12.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0085 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] b(java.lang.Void... r12) {
            /*
                r11 = this;
                boolean r0 = t7.C4049a.d(r11)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.C6496s.h(r12, r0)     // Catch:{ all -> 0x0050 }
                android.os.Bundle r12 = r11.f47218b     // Catch:{ all -> 0x0050 }
                java.lang.String r0 = "media"
                java.lang.String[] r12 = r12.getStringArray(r0)     // Catch:{ all -> 0x0050 }
                if (r12 != 0) goto L_0x0018
                return r1
            L_0x0018:
                int r0 = r12.length     // Catch:{ all -> 0x0050 }
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0050 }
                int r2 = r12.length     // Catch:{ all -> 0x0050 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x0050 }
                r11.f47219c = r2     // Catch:{ all -> 0x0050 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0050 }
                int r3 = r12.length     // Catch:{ all -> 0x0050 }
                r2.<init>(r3)     // Catch:{ all -> 0x0050 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0050 }
                r3.<init>()     // Catch:{ all -> 0x0050 }
                com.facebook.a$c r4 = com.facebook.C3286a.f39402l     // Catch:{ all -> 0x0050 }
                com.facebook.a r4 = r4.e()     // Catch:{ all -> 0x0050 }
                r5 = 1
                int r6 = r12.length     // Catch:{ Exception -> 0x0085 }
                r7 = 0
            L_0x0034:
                if (r7 >= r6) goto L_0x0081
                boolean r8 = r11.isCancelled()     // Catch:{ Exception -> 0x0085 }
                if (r8 == 0) goto L_0x0053
                java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x0085 }
            L_0x0040:
                boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0085 }
                if (r0 == 0) goto L_0x0052
                java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x0085 }
                com.facebook.P r0 = (com.facebook.P) r0     // Catch:{ Exception -> 0x0085 }
                r0.cancel(r5)     // Catch:{ Exception -> 0x0085 }
                goto L_0x0040
            L_0x0050:
                r12 = move-exception
                goto L_0x009a
            L_0x0052:
                return r1
            L_0x0053:
                r8 = r12[r7]     // Catch:{ Exception -> 0x0085 }
                android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0085 }
                boolean r9 = o7.W.g0(r8)     // Catch:{ Exception -> 0x0085 }
                if (r9 == 0) goto L_0x0069
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0085 }
                r0[r7] = r8     // Catch:{ Exception -> 0x0085 }
                r2.countDown()     // Catch:{ Exception -> 0x0085 }
                goto L_0x007e
            L_0x0069:
                o7.c0 r9 = new o7.c0     // Catch:{ Exception -> 0x0085 }
                r9.<init>(r0, r7, r11, r2)     // Catch:{ Exception -> 0x0085 }
                java.lang.String r10 = "uri"
                kotlin.jvm.internal.C6496s.g(r8, r10)     // Catch:{ Exception -> 0x0085 }
                com.facebook.M r8 = u8.m.u(r4, r8, r9)     // Catch:{ Exception -> 0x0085 }
                com.facebook.P r8 = r8.l()     // Catch:{ Exception -> 0x0085 }
                r3.add(r8)     // Catch:{ Exception -> 0x0085 }
            L_0x007e:
                int r7 = r7 + 1
                goto L_0x0034
            L_0x0081:
                r2.await()     // Catch:{ Exception -> 0x0085 }
                return r0
            L_0x0085:
                java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0050 }
            L_0x0089:
                boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0050 }
                if (r0 == 0) goto L_0x0099
                java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0050 }
                com.facebook.P r0 = (com.facebook.P) r0     // Catch:{ all -> 0x0050 }
                r0.cancel(r5)     // Catch:{ all -> 0x0050 }
                goto L_0x0089
            L_0x0099:
                return r1
            L_0x009a:
                t7.C4049a.b(r12, r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.b0.e.b(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        public void d(String[] strArr) {
            if (!C4049a.d(this)) {
                try {
                    ProgressDialog h10 = this.f47220d.f47201e;
                    if (h10 != null) {
                        h10.dismiss();
                    }
                    for (Exception exc : this.f47219c) {
                        if (exc != null) {
                            this.f47220d.y(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f47220d.y(new C3459v("Failed to stage photos for web dialog"));
                        return;
                    }
                    List e10 = C6559l.e(strArr);
                    if (e10.contains((Object) null)) {
                        this.f47220d.y(new C3459v("Failed to stage photos for web dialog"));
                        return;
                    }
                    W.s0(this.f47218b, "media", new JSONArray(e10));
                    this.f47220d.f47197a = W.g(P.b(), I.w() + "/dialog/" + this.f47217a, this.f47218b).toString();
                    ImageView e11 = this.f47220d.f47202f;
                    if (e11 != null) {
                        this.f47220d.C((e11.getDrawable().getIntrinsicWidth() / 2) + 1);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (C4049a.d(this)) {
                return null;
            }
            try {
                return b((Void[]) objArr);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }

        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!C4049a.d(this)) {
                try {
                    d((String[]) obj);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47221a;

        static {
            int[] iArr = new int[G.values().length];
            try {
                iArr[G.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f47221a = iArr;
        }
    }

    public static final class g extends WebView {
        g(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    public /* synthetic */ b0(Context context, String str, Bundle bundle, int i10, G g10, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i10, g10, dVar);
    }

    /* access modifiers changed from: private */
    public final void C(int i10) {
        WebSettings webSettings;
        WebSettings webSettings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.f47200d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.f47200d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.f47200d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c());
        }
        WebView webView3 = this.f47200d;
        WebSettings webSettings3 = null;
        if (webView3 != null) {
            webSettings = webView3.getSettings();
        } else {
            webSettings = null;
        }
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f47200d;
        if (webView4 != null) {
            String str = this.f47197a;
            if (str != null) {
                webView4.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        WebView webView5 = this.f47200d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.f47200d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.f47200d;
        if (webView7 != null) {
            webSettings2 = webView7.getSettings();
        } else {
            webSettings2 = null;
        }
        if (webSettings2 != null) {
            webSettings2.setSavePassword(false);
        }
        WebView webView8 = this.f47200d;
        if (webView8 != null) {
            webSettings3 = webView8.getSettings();
        }
        if (webSettings3 != null) {
            webSettings3.setSaveFormData(false);
        }
        WebView webView9 = this.f47200d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.f47200d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.f47200d;
        if (webView11 != null) {
            webView11.setOnTouchListener(new Y());
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f47200d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f47203g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f47202f = imageView;
        imageView.setOnClickListener(new a0(this));
        Drawable drawable = getContext().getResources().getDrawable(P5.b.f33466b);
        ImageView imageView2 = this.f47202f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f47202f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public static final void p(b0 b0Var, View view) {
        C6496s.h(b0Var, "this$0");
        b0Var.cancel();
    }

    private final int q(int i10, float f10, int i11, int i12) {
        double d10;
        int i13 = (int) (((float) i10) / f10);
        if (i13 <= i11) {
            d10 = 1.0d;
        } else if (i13 >= i12) {
            d10 = 0.5d;
        } else {
            d10 = ((((double) (i12 - i13)) / ((double) (i12 - i11))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i10) * d10);
    }

    protected static final void s(Context context) {
        f47194m.b(context);
    }

    /* access modifiers changed from: private */
    public static final void v(b0 b0Var, DialogInterface dialogInterface) {
        C6496s.h(b0Var, "this$0");
        b0Var.cancel();
    }

    /* access modifiers changed from: protected */
    public final void A(String str) {
        C6496s.h(str, "expectedRedirectUrl");
        this.f47198b = str;
    }

    public final void B(d dVar) {
        this.f47199c = dVar;
    }

    public void cancel() {
        if (this.f47199c != null && !this.f47205i) {
            y(new C3461x());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f47200d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f47206j && (progressDialog = this.f47201e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        IBinder iBinder2;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f47206j = false;
        Context context = getContext();
        C6496s.g(context, "context");
        if (W.p0(context) && (layoutParams = this.f47208l) != null) {
            IBinder iBinder3 = null;
            if (layoutParams != null) {
                iBinder = layoutParams.token;
            } else {
                iBinder = null;
            }
            if (iBinder == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = attributes.token;
                    }
                    layoutParams.token = iBinder2;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.f47208l;
                if (layoutParams2 != null) {
                    iBinder3 = layoutParams2.token;
                }
                sb2.append(iBinder3);
                W.l0("FacebookSDK.WebDialog", sb2.toString());
            }
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f47201e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f47201e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(P5.e.f33480d));
        }
        ProgressDialog progressDialog3 = this.f47201e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f47201e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new Z(this));
        }
        requestWindowFeature(1);
        this.f47203g = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.f47197a != null) {
            ImageView imageView = this.f47202f;
            if (imageView != null) {
                C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        FrameLayout frameLayout = this.f47203g;
        if (frameLayout != null) {
            frameLayout.addView(this.f47202f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f47203g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void onDetachedFromWindow() {
        this.f47206j = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        C6496s.h(keyEvent, "event");
        if (i10 == 4) {
            WebView webView = this.f47200d;
            if (webView == null || webView == null || !webView.canGoBack()) {
                cancel();
            } else {
                WebView webView2 = this.f47200d;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        AsyncTask.Status status;
        super.onStart();
        e eVar = this.f47204h;
        if (eVar != null) {
            if (eVar != null) {
                status = eVar.getStatus();
            } else {
                status = null;
            }
            if (status == AsyncTask.Status.PENDING) {
                e eVar2 = this.f47204h;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f47201e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        x();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        e eVar = this.f47204h;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.f47201e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C6496s.h(layoutParams, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        if (layoutParams.token == null) {
            this.f47208l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final WebView r() {
        return this.f47200d;
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return this.f47205i;
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        return this.f47207k;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        Bundle q02 = W.q0(parse.getQuery());
        q02.putAll(W.q0(parse.getFragment()));
        return q02;
    }

    public final void x() {
        int i10;
        Object systemService = getContext().getSystemService("window");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        if (i11 < i12) {
            i10 = i11;
        } else {
            i10 = i12;
        }
        if (i11 < i12) {
            i11 = i12;
        }
        int min = Math.min(q(i10, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(q(i11, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    /* access modifiers changed from: protected */
    public final void y(Throwable th2) {
        C3459v vVar;
        if (this.f47199c != null && !this.f47205i) {
            this.f47205i = true;
            if (th2 instanceof C3459v) {
                vVar = (C3459v) th2;
            } else {
                vVar = new C3459v(th2);
            }
            d dVar = this.f47199c;
            if (dVar != null) {
                dVar.a((Bundle) null, vVar);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void z(Bundle bundle) {
        d dVar = this.f47199c;
        if (dVar != null && !this.f47205i) {
            this.f47205i = true;
            if (dVar != null) {
                dVar.a(bundle, (C3459v) null);
            }
            dismiss();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected b0(Context context, String str) {
        this(context, str, f47194m.a());
        C6496s.h(context, "context");
        C6496s.h(str, "url");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b0(Context context, String str, int i10) {
        super(context, i10 == 0 ? f47194m.a() : i10);
        this.f47198b = "fbconnect://success";
        this.f47197a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b0(Context context, String str, Bundle bundle, int i10, G g10, d dVar) {
        super(context, i10 == 0 ? f47194m.a() : i10);
        Uri uri;
        String str2 = "fbconnect://success";
        this.f47198b = str2;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = W.Y(context) ? "fbconnect://chrome_os_success" : str2;
        this.f47198b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", I.m());
        U u10 = U.f71764a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{I.B()}, 1));
        C6496s.g(format, "format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f47199c = dVar;
        if (!C6496s.c(str, "share") || !bundle.containsKey("media")) {
            if (f.f47221a[g10.ordinal()] == 1) {
                uri = W.g(P.k(), "oauth/authorize", bundle);
            } else {
                String b10 = P.b();
                uri = W.g(b10, I.w() + "/dialog/" + str, bundle);
            }
            this.f47197a = uri.toString();
            return;
        }
        this.f47204h = new e(this, str, bundle);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f47209a;

        /* renamed from: b  reason: collision with root package name */
        private String f47210b;

        /* renamed from: c  reason: collision with root package name */
        private String f47211c;

        /* renamed from: d  reason: collision with root package name */
        private int f47212d;

        /* renamed from: e  reason: collision with root package name */
        private d f47213e;

        /* renamed from: f  reason: collision with root package name */
        private Bundle f47214f;

        /* renamed from: g  reason: collision with root package name */
        private C3286a f47215g;

        public a(Context context, String str, Bundle bundle) {
            C6496s.h(context, "context");
            C6496s.h(str, "action");
            C3286a.c cVar = C3286a.f39402l;
            this.f47215g = cVar.e();
            if (!cVar.g()) {
                String K10 = W.K(context);
                if (K10 != null) {
                    this.f47210b = K10;
                } else {
                    throw new C3459v("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            b(context, str, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.f47209a = context;
            this.f47211c = str;
            if (bundle != null) {
                this.f47214f = bundle;
            } else {
                this.f47214f = new Bundle();
            }
        }

        public b0 a() {
            String str;
            C3286a aVar = this.f47215g;
            if (aVar != null) {
                Bundle bundle = this.f47214f;
                String str2 = null;
                if (bundle != null) {
                    if (aVar != null) {
                        str = aVar.c();
                    } else {
                        str = null;
                    }
                    bundle.putString("app_id", str);
                }
                Bundle bundle2 = this.f47214f;
                if (bundle2 != null) {
                    C3286a aVar2 = this.f47215g;
                    if (aVar2 != null) {
                        str2 = aVar2.n();
                    }
                    bundle2.putString("access_token", str2);
                }
            } else {
                Bundle bundle3 = this.f47214f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f47210b);
                }
            }
            b bVar = b0.f47194m;
            Context context = this.f47209a;
            if (context != null) {
                return bVar.c(context, this.f47211c, this.f47214f, this.f47212d, this.f47213e);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String c() {
            return this.f47210b;
        }

        public final Context d() {
            return this.f47209a;
        }

        public final d e() {
            return this.f47213e;
        }

        public final Bundle f() {
            return this.f47214f;
        }

        public final int g() {
            return this.f47212d;
        }

        public final a h(d dVar) {
            this.f47213e = dVar;
            return this;
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            C6496s.h(context, "context");
            C6496s.h(str2, "action");
            this.f47210b = X.n(str == null ? W.K(context) : str, "applicationId");
            b(context, str2, bundle);
        }
    }
}
