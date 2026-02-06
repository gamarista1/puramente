package W3;

import V3.c;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.models.carousel.AppearanceType;

public class g extends n {
    public g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String q(String str) {
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    /* access modifiers changed from: protected */
    public String b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "com.instagram.android";
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }

    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (!m.j("url", readableMap)) {
            Log.e("RNShare", "No url provided");
            return;
        }
        String string = readableMap.getString("url");
        if (string.startsWith("instagram://")) {
            s(string);
        } else if (!m.j("type", readableMap)) {
            Log.e("RNShare", "No type provided");
        } else {
            String string2 = readableMap.getString("type");
            String q10 = q(string2);
            r(string, this.f8689c, Boolean.valueOf(string2.startsWith(AppearanceType.IMAGE)), q10);
        }
    }

    /* access modifiers changed from: protected */
    public void r(String str, String str2, Boolean bool, String str3) {
        boolean z10;
        c cVar;
        if (!m.j("useInternalStorage", this.f8691e) || !this.f8691e.getBoolean("useInternalStorage")) {
            z10 = false;
        } else {
            z10 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        if (bool.booleanValue()) {
            cVar = new c(str, "image/" + str3, AppearanceType.IMAGE, valueOf, this.f8687a);
        } else {
            cVar = new c(str, "video/" + str3, "video", valueOf, this.f8687a);
        }
        Uri d10 = cVar.d();
        Intent intent = new Intent("android.intent.action.SEND");
        if (bool.booleanValue()) {
            intent.setType("image/*");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.STREAM", d10);
        intent.setPackage("com.instagram.android");
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(d10, str3);
        intent2.addFlags(1);
        intent2.setPackage("com.instagram.android");
        Intent createChooser = Intent.createChooser(intent, str2);
        createChooser.addFlags(268435456);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.f8687a.getCurrentActivity().grantUriPermission("com.instagram.android", d10, 1);
        this.f8687a.startActivity(createChooser);
        q.d(true, Boolean.TRUE, f().getPackage());
    }

    /* access modifiers changed from: protected */
    public void s(String str) {
        Uri parse = Uri.parse(str);
        f().setAction("android.intent.action.VIEW");
        f().setData(parse);
        super.m();
    }
}
