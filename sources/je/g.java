package Je;

import Fe.C3016e;
import Fe.C3023l;
import Fe.y;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference f32256a;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f32257a;

        a(JSONObject jSONObject) {
            this.f32257a = jSONObject;
        }

        public void run() {
            g.f(g.e(this.f32257a, ""));
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f32258a;

        c(JSONObject jSONObject) {
            this.f32258a = jSONObject;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            g.f(g.e(this.f32258a, "r"));
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f32259a;

        d(JSONObject jSONObject) {
            this.f32259a = jSONObject;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            g.f(g.e(this.f32259a, "g"));
        }
    }

    private static void c() {
        if (f32256a.get() != null) {
            new AlertDialog.Builder((Context) f32256a.get(), 16974374).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new e()).setCancelable(false).setIcon(17301651).show();
        }
    }

    private static String d() {
        if (C3016e.X() == null || C3016e.X().Z() == null) {
            return "";
        }
        JSONObject Z10 = C3016e.X().Z();
        return Z10.optString("~" + y.ReferringLink.b());
    }

    /* access modifiers changed from: private */
    public static String e(JSONObject jSONObject, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "";
        try {
            str7 = jSONObject.getString("~" + y.ReferringLink.b()).split("\\?")[0];
        } catch (Exception unused) {
            C3023l.l("Failed to get referring link");
        }
        String str8 = str7 + "?validate=true";
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str8);
                if (jSONObject.getString("ct").equals("t1")) {
                    str2 = "&t1=" + str;
                } else {
                    str2 = "&t1=" + jSONObject.getString("t1");
                }
                sb2.append(str2);
                str8 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str8);
                if (jSONObject.getString("ct").equals("t2")) {
                    str3 = "&t2=" + str;
                } else {
                    str3 = "&t2=" + jSONObject.getString("t2");
                }
                sb3.append(str3);
                str8 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str8);
                if (jSONObject.getString("ct").equals("t3")) {
                    str4 = "&t3=" + str;
                } else {
                    str4 = "&t3=" + jSONObject.getString("t3");
                }
                sb4.append(str4);
                str8 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str8);
                if (jSONObject.getString("ct").equals("t4")) {
                    str5 = "&t4=" + str;
                } else {
                    str5 = "&t4=" + jSONObject.getString("t4");
                }
                sb5.append(str5);
                str8 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str8);
                if (jSONObject.getString("ct").equals("t5")) {
                    str6 = "&t5=" + str;
                } else {
                    str6 = "&t5=" + jSONObject.getString("t5");
                }
                sb6.append(str6);
                str8 = sb6.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return str8 + "&os=android";
    }

    /* access modifiers changed from: private */
    public static void f(String str) {
        if (f32256a.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            ((Activity) f32256a.get()).getPackageManager().queryIntentActivities(intent, 0);
            try {
                ((Activity) f32256a.get()).startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage((String) null);
                ((Activity) f32256a.get()).startActivity(intent);
            }
        }
    }

    public static void g(WeakReference weakReference) {
        f32256a = weakReference;
        if (!TextUtils.isEmpty(d()) && weakReference != null) {
            JSONObject Z10 = C3016e.X().Z();
            if (Z10.optInt("_branch_validate") == 60514) {
                if (Z10.optBoolean(y.Clicked_Branch_Link.b())) {
                    h(Z10);
                } else {
                    c();
                }
            } else if (Z10.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new a(Z10), 500);
            }
        }
    }

    private static void h(JSONObject jSONObject) {
        if (f32256a.get() != null) {
            new AlertDialog.Builder((Context) f32256a.get(), 16974374).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new d(jSONObject)).setNegativeButton("No", new c(jSONObject)).setNeutralButton(17039360, new b()).setCancelable(false).setIcon(17301651).show();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }
}
