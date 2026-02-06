package W3;

import V3.c;
import V3.d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import cl.json.RNShareModule;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    protected final ReactApplicationContext f8687a;

    /* renamed from: b  reason: collision with root package name */
    protected Intent f8688b;

    /* renamed from: c  reason: collision with root package name */
    protected String f8689c = "Share";

    /* renamed from: d  reason: collision with root package name */
    protected c f8690d;

    /* renamed from: e  reason: collision with root package name */
    protected ReadableMap f8691e;

    public m(ReactApplicationContext reactApplicationContext) {
        this.f8687a = reactApplicationContext;
        n(new Intent("android.intent.action.SEND"));
        f().setType("text/plain");
    }

    private ComponentName[] c(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(f().getAction());
        intent.setType(f().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.f8687a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            for (ResolveInfo next : queryIntentActivities) {
                if (next.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = next.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean j(String str, ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) {
            return false;
        }
        return true;
    }

    public static boolean k(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    protected static String o(String str) {
        try {
            return URLEncoder.encode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    /* access modifiers changed from: protected */
    public String a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public c d(ReadableMap readableMap) {
        String str;
        if (j("filename", readableMap)) {
            str = readableMap.getString("filename");
        } else {
            str = null;
        }
        String str2 = str;
        Boolean bool = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (j("type", readableMap)) {
            return new c(readableMap.getString("url"), readableMap.getString("type"), str2, bool2, this.f8687a);
        }
        return new c(readableMap.getString("url"), str2, bool2, this.f8687a);
    }

    /* access modifiers changed from: protected */
    public d e(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (j("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
        }
        Boolean bool = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (j("type", readableMap)) {
            return new d(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool2, this.f8687a);
        }
        return new d(readableMap.getArray("urls"), arrayList, bool2, this.f8687a);
    }

    /* access modifiers changed from: protected */
    public Intent f() {
        return this.f8688b;
    }

    /* access modifiers changed from: protected */
    public Intent[] g(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.f8687a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i10);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i10] = new Intent(intent2);
        }
        return intentArr;
    }

    /* access modifiers changed from: protected */
    public abstract String h();

    /* access modifiers changed from: protected */
    public abstract String i();

    public void l(ReadableMap readableMap) {
        String str;
        this.f8691e = readableMap;
        if (j("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            f().addFlags(268468224);
        }
        if (j("subject", readableMap)) {
            f().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (j("email", readableMap)) {
            f().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString("email")});
        }
        if (j(b.f37461S, readableMap)) {
            this.f8689c = readableMap.getString(b.f37461S);
        }
        String str2 = "";
        if (j(MetricTracker.Object.MESSAGE, readableMap)) {
            str = readableMap.getString(MetricTracker.Object.MESSAGE);
        } else {
            str = str2;
        }
        if (j("social", readableMap)) {
            str2 = readableMap.getString("social");
        }
        if (str2.equals("sms")) {
            String string = readableMap.getString("recipient");
            if (!string.isEmpty()) {
                f().putExtra("address", string);
            }
        }
        if (str2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            String string2 = readableMap.getString("whatsAppNumber");
            f().putExtra("jid", string2 + "@s.whatsapp.net");
        }
        if (str2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            String string3 = readableMap.getString("whatsAppNumber");
            f().putExtra("jid", string3 + "@s.whatsapp.net");
        }
        if (j("urls", readableMap)) {
            d e10 = e(readableMap);
            if (e10.f()) {
                ArrayList d10 = e10.d();
                f().setAction("android.intent.action.SEND_MULTIPLE");
                f().setType(e10.c());
                f().putParcelableArrayListExtra("android.intent.extra.STREAM", d10);
                f().addFlags(1);
                if (!TextUtils.isEmpty(str)) {
                    f().putExtra("android.intent.extra.TEXT", str);
                }
            } else if (!TextUtils.isEmpty(str)) {
                Intent f10 = f();
                f10.putExtra("android.intent.extra.TEXT", str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + readableMap.getArray("urls").getString(0));
            } else {
                f().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
            }
        } else if (j("url", readableMap)) {
            c d11 = d(readableMap);
            this.f8690d = d11;
            if (d11.f()) {
                Uri d12 = this.f8690d.d();
                f().setType(this.f8690d.c());
                f().putExtra("android.intent.extra.STREAM", d12);
                f().addFlags(1);
                if (!TextUtils.isEmpty(str)) {
                    f().putExtra("android.intent.extra.TEXT", str);
                }
            } else if (!TextUtils.isEmpty(str)) {
                Intent f11 = f();
                f11.putExtra("android.intent.extra.TEXT", str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + readableMap.getString("url"));
            } else {
                f().putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
            }
        } else if (!TextUtils.isEmpty(str)) {
            f().putExtra("android.intent.extra.TEXT", str);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        Intent intent;
        IntentSender intentSender;
        Activity currentActivity = this.f8687a.getCurrentActivity();
        if (currentActivity == null) {
            q.d(false, "Something went wrong");
            return;
        }
        if (q.b()) {
            intentSender = q.a(this.f8687a);
            intent = Intent.createChooser(f(), this.f8689c, intentSender);
        } else {
            intent = Intent.createChooser(f(), this.f8689c);
            intentSender = null;
        }
        intent.addFlags(1073741824);
        if (j("showAppsToView", this.f8691e) && j("url", this.f8691e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setType(this.f8690d.c());
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", g(intent2, this.f8690d.d()));
        }
        if (j("excludedActivityTypes", this.f8691e)) {
            intent.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", c(this.f8691e.getArray("excludedActivityTypes")));
            currentActivity.startActivityForResult(intent, RNShareModule.SHARE_REQUEST_CODE);
        } else {
            currentActivity.startActivityForResult(intent, RNShareModule.SHARE_REQUEST_CODE);
        }
        if (intentSender == null) {
            q.d(true, Boolean.TRUE, "OK");
        }
    }

    /* access modifiers changed from: protected */
    public void n(Intent intent) {
        this.f8688b = intent;
    }
}
