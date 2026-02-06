package cl.json;

import W3.c;
import W3.d;
import W3.e;
import W3.f;
import W3.g;
import W3.h;
import W3.i;
import W3.j;
import W3.k;
import W3.l;
import W3.m;
import W3.o;
import W3.q;
import W3.r;
import W3.s;
import W3.t;
import W3.u;
import W3.v;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RNShareModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int SHARE_REQUEST_CODE = 16845;
    private final ReactApplicationContext reactContext;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cl.json.RNShareModule$b[] r0 = cl.json.RNShareModule.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19362a = r0
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.generic     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x001d }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.facebook     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.facebookstories     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.pagesmanager     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x003e }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.twitter     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0049 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.whatsapp     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0054 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.whatsappbusiness     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0060 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.instagram     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x006c }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.instagramstories     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0078 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.googleplus     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0084 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.email     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x0090 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.pinterest     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x009c }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.sms     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.snapchat     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.messenger     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.linkedin     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x00cc }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.telegram     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f19362a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                cl.json.RNShareModule$b r1 = cl.json.RNShareModule.b.viber     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.json.RNShareModule.a.<clinit>():void");
        }
    }

    private enum b {
        facebook,
        facebookstories,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        whatsappbusiness,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin,
        telegram,
        viber;

        public static m b(String str, ReactApplicationContext reactApplicationContext) {
            switch (a.f19362a[valueOf(str).ordinal()]) {
                case 1:
                    return new e(reactApplicationContext);
                case 2:
                    return new c(reactApplicationContext);
                case 3:
                    return new d(reactApplicationContext);
                case 4:
                    return new W3.b(reactApplicationContext);
                case 5:
                    return new s(reactApplicationContext);
                case 6:
                    return new v(reactApplicationContext);
                case 7:
                    return new u(reactApplicationContext);
                case 8:
                    return new g(reactApplicationContext);
                case 9:
                    return new h(reactApplicationContext);
                case 10:
                    return new f(reactApplicationContext);
                case 11:
                    return new W3.a(reactApplicationContext);
                case 12:
                    return new k(reactApplicationContext);
                case 13:
                    return new l(reactApplicationContext);
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    return new o(reactApplicationContext);
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    return new j(reactApplicationContext);
                case 16:
                    return new i(reactApplicationContext);
                case 17:
                    return new r(reactApplicationContext);
                case 18:
                    return new t(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public RNShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        for (b bVar : b.values()) {
            hashMap.put(bVar.toString().toUpperCase(Locale.ROOT), bVar.toString());
        }
        return hashMap;
    }

    public String getName() {
        return "RNShare";
    }

    @ReactMethod
    public void isBase64File(String str, Callback callback, Callback callback2) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals("data")) {
                callback2.invoke(Boolean.FALSE);
            } else {
                callback2.invoke(Boolean.TRUE);
            }
        } catch (Exception e10) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e10.getMessage());
            e10.printStackTrace(printStream);
            callback.invoke(e10.getMessage());
        }
    }

    @ReactMethod
    public void isPackageInstalled(String str, Callback callback, Callback callback2) {
        try {
            callback2.invoke(Boolean.valueOf(m.k(str, this.reactContext)));
        } catch (Exception e10) {
            PrintStream printStream = System.out;
            printStream.println("Error: " + e10.getMessage());
            callback.invoke(e10.getMessage());
        }
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 16845) {
            return;
        }
        if (i11 == 0) {
            q.d(true, Boolean.FALSE, "CANCELED");
        } else if (i11 == -1) {
            q.d(true, Boolean.TRUE);
        }
    }

    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        q.c(callback2, callback);
        try {
            new e(this.reactContext).l(readableMap);
        } catch (ActivityNotFoundException e10) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e10.getMessage());
            e10.printStackTrace(printStream);
            q.d(false, "not_available");
        } catch (Exception e11) {
            PrintStream printStream2 = System.out;
            printStream2.println("ERROR " + e11.getMessage());
            e11.printStackTrace(printStream2);
            q.d(false, e11.getMessage());
        }
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Callback callback, Callback callback2) {
        System.out.println("SHARE SINGLE METHOD");
        q.c(callback2, callback);
        if (m.j("social", readableMap)) {
            try {
                m b10 = b.b(readableMap.getString("social"), this.reactContext);
                if (b10 != null) {
                    b10.l(readableMap);
                    return;
                }
                throw new ActivityNotFoundException("Invalid share activity");
            } catch (ActivityNotFoundException e10) {
                PrintStream printStream = System.out;
                printStream.println("ERROR " + e10.getMessage());
                e10.printStackTrace(printStream);
                q.d(false, e10.getMessage());
            } catch (Exception e11) {
                PrintStream printStream2 = System.out;
                printStream2.println("ERROR " + e11.getMessage());
                e11.printStackTrace(printStream2);
                q.d(false, e11.getMessage());
            }
        } else {
            q.d(false, "key 'social' missing in options");
        }
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        onActivityResult(i10, i11, intent);
    }
}
