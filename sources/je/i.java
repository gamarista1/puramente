package Je;

import Fe.C3016e;
import Je.y;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;
import org.json.JSONObject;

public class i implements y.a {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static i f32265h;

    /* renamed from: a  reason: collision with root package name */
    private final d f32266a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32267b = "BranchSDK_Doctor";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f32268c;

    /* renamed from: d  reason: collision with root package name */
    Context f32269d;

    /* renamed from: e  reason: collision with root package name */
    boolean f32270e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f32271f = false;

    /* renamed from: g  reason: collision with root package name */
    m f32272g;

    class a implements De.a {
        a() {
        }

        public void a(String str, String str2) {
            i.f32265h.f32268c.append(str);
        }
    }

    private i(Context context) {
        this.f32266a = new d(context);
        this.f32269d = context;
        this.f32268c = new StringBuilder();
    }

    private void d(JSONObject jSONObject) {
        C3016e.X().f31062i.k(new y(this.f32269d, this));
        j("\n\n------------------- Initiating Branch integration verification ---------------------------");
        c cVar = new c();
        boolean d10 = cVar.d(this.f32269d);
        this.f32272g.c(1, cVar.c(), d10, cVar.b(this.f32269d, d10), cVar.a());
        h(d10, "1. Verifying Branch instance creation", "Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method.", "https://help.branch.io/developers-hub/docs/android-basic-integration#section-load-branch");
        e eVar = new e();
        boolean d11 = eVar.d(this.f32269d);
        this.f32272g.c(2, eVar.c(), d11, eVar.b(this.f32269d, d11), eVar.a());
        h(d11, "2. Checking Branch keys", "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.", "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        x xVar = new x(this.f32266a, jSONObject);
        boolean d12 = xVar.d(this.f32269d);
        this.f32272g.c(3, xVar.c(), d12, xVar.b(this.f32269d, d12), xVar.a());
        h(d12, "3. Verifying application package name", xVar.f32320e, "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-branch-dashboard");
        z zVar = new z(this.f32266a, jSONObject);
        boolean d13 = zVar.d(this.f32269d);
        this.f32272g.c(4, zVar.c(), d13, zVar.b(this.f32269d, d13), zVar.a());
        h(d13, "4. Checking Android Manifest for URI based deep link config", zVar.f32274b, "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        b bVar = new b(this.f32266a, jSONObject);
        boolean d14 = bVar.d(this.f32269d);
        this.f32272g.c(5, bVar.c(), d14, bVar.b(this.f32269d, d14), bVar.a());
        h(d14, "5. Checking AndroidManifest for AppLink config.", "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file", "https://help.branch.io/using-branch/docs/android-app-links#section-add-intent-filter-to-manifest");
        f fVar = new f(this.f32266a, jSONObject);
        boolean d15 = fVar.d(this.f32269d);
        this.f32272g.c(6, fVar.c(), d15, fVar.b(this.f32269d, d15), fVar.a());
        h(d15, "6. Verifying any supported custom link domains.", String.format("Could not find intent filter to support custom link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", new Object[]{jSONObject.optString("short_url_domain")}), "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        h hVar = new h(this.f32266a, jSONObject);
        boolean d16 = hVar.d(this.f32269d);
        this.f32272g.c(7, hVar.c(), d16, hVar.b(this.f32269d, d16), hVar.a());
        h(d16, "7. Verifying default link domains integrations.", String.format("Could not find intent filter to support Branch default link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", new Object[]{jSONObject.optString("default_short_url_domain")}), "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        a aVar = new a(this.f32266a, jSONObject);
        boolean d17 = aVar.d(this.f32269d);
        this.f32272g.c(8, aVar.c(), d17, aVar.b(this.f32269d, d17), aVar.a());
        h(d17, "8. Verifying alternate link domains integrations.", String.format("Could not find intent filter to support alternate link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", new Object[]{jSONObject.optString("alternate_short_url_domain")}), "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        e();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = f32265h.f32272g.getWindow();
        Objects.requireNonNull(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = 1500;
        f32265h.f32272g.show();
        f32265h.f32272g.getWindow().setAttributes(layoutParams);
    }

    private void e() {
        if (!this.f32271f) {
            Log.d("BranchSDK_Doctor", "--------------------------------------------\nSuccessfully completed Branch integration validation. Everything looks good!");
            Log.d("BranchSDK_Doctor", "\n         Great! Comment out the 'validateSDKIntegration' line in your app. Next check your deep link routing.\n         Append '?bnc_validate=true' to any of your app's Branch links and click it on your mobile device (not the Simulator!) to start the test.\n         For instance, to validate a link like:\n         https://<yourapp>.app.link/NdJ6nFzRbK\n         click on:\n         https://<yourapp>.app.link/NdJ6nFzRbK?bnc_validate=true");
            return;
        }
        Log.d("BranchSDK_Doctor", "--------------------------------------------\nCompleted Branch integration validation. Almost there! Please correct the issues identified for your Branch SDK implementation.");
    }

    public static String f() {
        return f32265h.f32268c.toString();
    }

    private void g(String str, String str2) {
        Log.d("BranchSDK_Doctor", "** ERROR ** : " + str + "\nPlease follow the link for more info " + str2);
    }

    private void h(boolean z10, String str, String str2, String str3) {
        j(str);
        if (z10) {
            i();
            return;
        }
        g(str2, str3);
        this.f32271f = true;
    }

    private void i() {
        Log.d("BranchSDK_Doctor", "Passed");
    }

    private void j(String str) {
        Log.d("BranchSDK_Doctor", str + " ... ");
    }

    public static void k(Context context) {
        if (f32265h == null) {
            f32265h = new i(context);
        }
        C3016e.A(new a());
        f32265h.l(context);
        f32265h.f32272g = new m(context);
    }

    private void l(Context context) {
        C3016e.X().f31062i.k(new y(context, this));
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null && !this.f32270e) {
            this.f32270e = true;
            d(jSONObject);
        } else if (jSONObject == null) {
            g("Unable to read Dashboard config. Please confirm that your Branch key is properly added to the manifest. Please fix your Dashboard settings.", "https://branch.app.link/link-settings-page");
        }
    }
}
