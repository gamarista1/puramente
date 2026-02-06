package W3;

import V3.c;
import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

public class h extends n {
    public h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        n(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    private void q(ReadableMap readableMap) {
        String str;
        String str2;
        String str3;
        if (m.j("backgroundImage", readableMap) || m.j("backgroundVideo", readableMap) || m.j("stickerImage", readableMap)) {
            Activity currentActivity = this.f8687a.getCurrentActivity();
            boolean z10 = false;
            if (currentActivity == null) {
                q.d(false, "Something went wrong");
                return;
            }
            this.f8688b.putExtra("bottom_background_color", "#906df4");
            this.f8688b.putExtra("top_background_color", "#837DF4");
            if (m.j("attributionURL", readableMap)) {
                this.f8688b.putExtra("content_url", readableMap.getString("attributionURL"));
            }
            if (m.j("backgroundTopColor", readableMap)) {
                this.f8688b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
            }
            if (m.j("backgroundBottomColor", readableMap)) {
                this.f8688b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
            }
            Boolean bool = Boolean.FALSE;
            if (m.j("useInternalStorage", readableMap)) {
                bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
            }
            if (m.j("backgroundImage", readableMap) || m.j("backgroundVideo", readableMap)) {
                z10 = true;
            }
            if (z10) {
                if (m.j("backgroundImage", readableMap)) {
                    str3 = readableMap.getString("backgroundImage");
                } else if (m.j("backgroundVideo", readableMap)) {
                    str2 = readableMap.getString("backgroundVideo");
                    str = "video/*";
                    c cVar = new c(str2, str, AppStateModule.APP_STATE_BACKGROUND, bool, this.f8687a);
                    this.f8688b.setDataAndType(cVar.d(), cVar.c());
                    this.f8688b.setFlags(1);
                } else {
                    str3 = "";
                }
                str = ClipboardModule.MIMETYPE_JPEG;
                str2 = str3;
                c cVar2 = new c(str2, str, AppStateModule.APP_STATE_BACKGROUND, bool, this.f8687a);
                this.f8688b.setDataAndType(cVar2.d(), cVar2.c());
                this.f8688b.setFlags(1);
            }
            if (m.j("stickerImage", readableMap)) {
                c cVar3 = new c(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", bool, this.f8687a);
                if (!z10) {
                    this.f8688b.setType("image/*");
                }
                this.f8688b.putExtra("interactive_asset_uri", cVar3.d());
                currentActivity.grantUriPermission("com.instagram.android", cVar3.d(), 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid background or sticker assets provided.");
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
        q(readableMap);
        p(readableMap);
    }
}
