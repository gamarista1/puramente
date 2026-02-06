package com.reactnativecommunity.webview;

import U7.g;
import U7.h;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class o implements ActivityEventListener {

    /* renamed from: g  reason: collision with root package name */
    protected static final d f59394g = new d();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ReactApplicationContext f59395a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public DownloadManager.Request f59396b;

    /* renamed from: c  reason: collision with root package name */
    private ValueCallback f59397c;

    /* renamed from: d  reason: collision with root package name */
    private ValueCallback f59398d;

    /* renamed from: e  reason: collision with root package name */
    private File f59399e;

    /* renamed from: f  reason: collision with root package name */
    private File f59400f;

    class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f59401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59402b;

        a(String str, String str2) {
            this.f59401a = str;
            this.f59402b = str2;
        }

        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            if (i10 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(o.this.f59395a, this.f59402b, 1).show();
            } else if (o.this.f59396b != null) {
                o.this.h(this.f59401a);
            }
            return true;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59404a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.reactnativecommunity.webview.o$c[] r0 = com.reactnativecommunity.webview.o.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59404a = r0
                com.reactnativecommunity.webview.o$c r1 = com.reactnativecommunity.webview.o.c.IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f59404a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.reactnativecommunity.webview.o$c r1 = com.reactnativecommunity.webview.o.c.VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.o.b.<clinit>():void");
        }
    }

    private enum c {
        DEFAULT("*/*"),
        IMAGE(AppearanceType.IMAGE),
        VIDEO("video");
        
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f59409a;

        private c(String str) {
            this.f59409a = str;
        }
    }

    protected static class d {

        /* renamed from: a  reason: collision with root package name */
        private double f59410a = 1.0d;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap f59411b = new HashMap();

        protected enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected d() {
        }

        public synchronized AtomicReference a(Double d10) {
            return (AtomicReference) this.f59411b.get(d10);
        }

        public synchronized x1.d b() {
            double d10;
            AtomicReference atomicReference;
            d10 = this.f59410a;
            this.f59410a = 1.0d + d10;
            atomicReference = new AtomicReference(a.UNDECIDED);
            this.f59411b.put(Double.valueOf(d10), atomicReference);
            return new x1.d(Double.valueOf(d10), atomicReference);
        }

        public synchronized void c(Double d10) {
            this.f59411b.remove(d10);
        }
    }

    public o(ReactApplicationContext reactApplicationContext) {
        this.f59395a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean c(String str) {
        boolean z10;
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        if (str.isEmpty() || str.toLowerCase().contains(c.IMAGE.f59409a)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private Boolean d(String[] strArr) {
        boolean z10;
        String[] i10 = i(strArr);
        if (g(i10, c.DEFAULT.f59409a).booleanValue() || g(i10, c.IMAGE.f59409a).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private Boolean e(String str) {
        boolean z10;
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        if (str.isEmpty() || str.toLowerCase().contains(c.VIDEO.f59409a)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private Boolean f(String[] strArr) {
        boolean z10;
        String[] i10 = i(strArr);
        if (g(i10, c.DEFAULT.f59409a).booleanValue() || g(i10, c.VIDEO.f59409a).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private Boolean g(String[] strArr, String str) {
        for (String contains : strArr) {
            if (contains.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] i(String[] strArr) {
        if (w(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.f59409a};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                String m10 = m(str.replace(".", ""));
                if (m10 != null) {
                    strArr2[i10] = m10;
                } else {
                    strArr2[i10] = str;
                }
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    private Intent k(String str) {
        String str2;
        if (str.isEmpty()) {
            str2 = c.DEFAULT.f59409a;
        } else {
            str2 = str;
        }
        if (str.matches("\\.\\w+")) {
            str2 = m(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent l(String[] strArr, boolean z10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.f59409a);
        intent.putExtra("android.intent.extra.MIME_TYPES", i(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        return intent;
    }

    private String m(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private g o() {
        Activity currentActivity = this.f59395a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof g) {
            return (g) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private h s(String str, String str2) {
        return new a(str, str2);
    }

    private Boolean w(String[] strArr) {
        String str;
        boolean z10 = true;
        if (!(strArr.length == 0 || (strArr.length == 1 && (str = strArr[0]) != null && str.length() == 0))) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public boolean A(String[] strArr, boolean z10, ValueCallback valueCallback, boolean z11) {
        Intent r10;
        this.f59398d = valueCallback;
        Activity currentActivity = this.f59395a.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent intent = null;
        if (!v()) {
            if (d(strArr).booleanValue() && (intent = p()) != null) {
                arrayList.add(intent);
            }
            if (f(strArr).booleanValue() && (r10 = r()) != null) {
                arrayList.add(r10);
            }
        }
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        if (!z11) {
            intent2.putExtra("android.intent.extra.INTENT", l(strArr, z10));
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intent = intent2;
        }
        if (intent == null) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Camera permission");
        } else if (intent.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intent, 1);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
        return true;
    }

    public void h(String str) {
        try {
            ((DownloadManager) this.f59395a.getSystemService("download")).enqueue(this.f59396b);
            Toast.makeText(this.f59395a, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e10) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "Unsupported URI, aborting download", e10);
        }
    }

    public File j(c cVar) {
        String str;
        String str2;
        int i10 = b.f59404a[cVar.ordinal()];
        if (i10 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i10 != 2) {
            str = "";
            str2 = str;
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, this.f59395a.getExternalFilesDir((String) null));
    }

    public Uri n(File file) {
        String packageName = this.f59395a.getPackageName();
        ReactApplicationContext reactApplicationContext = this.f59395a;
        return androidx.core.content.d.getUriForFile(reactApplicationContext, packageName + ".fileprovider", file);
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        boolean z10;
        if (this.f59398d != null || this.f59397c != null) {
            File file = this.f59399e;
            boolean z11 = false;
            if (file == null || file.length() <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            File file2 = this.f59400f;
            if (file2 != null && file2.length() > 0) {
                z11 = true;
            }
            if (i10 != 1) {
                if (i10 == 3) {
                    if (i11 != -1) {
                        this.f59397c.onReceiveValue((Object) null);
                    } else if (z10) {
                        this.f59397c.onReceiveValue(n(this.f59399e));
                    } else if (z11) {
                        this.f59397c.onReceiveValue(n(this.f59400f));
                    } else {
                        this.f59397c.onReceiveValue(intent.getData());
                    }
                }
            } else if (i11 != -1) {
                ValueCallback valueCallback = this.f59398d;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue((Object) null);
                }
            } else if (z10) {
                this.f59398d.onReceiveValue(new Uri[]{n(this.f59399e)});
            } else if (z11) {
                this.f59398d.onReceiveValue(new Uri[]{n(this.f59400f)});
            } else {
                this.f59398d.onReceiveValue(q(intent, i11));
            }
            File file3 = this.f59399e;
            if (file3 != null && !z10) {
                file3.delete();
            }
            File file4 = this.f59400f;
            if (file4 != null && !z11) {
                file4.delete();
            }
            this.f59398d = null;
            this.f59397c = null;
            this.f59399e = null;
            this.f59400f = null;
        }
    }

    public void onNewIntent(Intent intent) {
    }

    public Intent p() {
        Intent intent;
        Throwable e10;
        try {
            File j10 = j(c.IMAGE);
            this.f59399e = j10;
            Uri n10 = n(j10);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", n10);
            } catch (IOException | IllegalArgumentException e11) {
                e10 = e11;
            }
        } catch (IOException | IllegalArgumentException e12) {
            intent = null;
            e10 = e12;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        }
        return intent;
    }

    public Uri[] q(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i11 = 0; i11 < itemCount; i11++) {
                uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
            }
            return uriArr;
        } else if (intent.getData() == null || i10 != -1) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
    }

    public Intent r() {
        Intent intent;
        Throwable e10;
        try {
            File j10 = j(c.VIDEO);
            this.f59400f = j10;
            Uri n10 = n(j10);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", n10);
            } catch (IOException | IllegalArgumentException e11) {
                e10 = e11;
            }
        } catch (IOException | IllegalArgumentException e12) {
            intent = null;
            e10 = e12;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        }
        return intent;
    }

    public boolean t(String str, String str2) {
        boolean z10;
        Activity currentActivity = this.f59395a.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        if (androidx.core.content.c.checkSelfPermission(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            o().b(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, s(str, str2));
        }
        return z10;
    }

    public boolean u() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean v() {
        Activity currentActivity = this.f59395a.getCurrentActivity();
        try {
            if (!Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || androidx.core.content.c.checkSelfPermission(currentActivity, "android.permission.CAMERA") == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public void x(DownloadManager.Request request) {
        this.f59396b = request;
    }

    public void y(boolean z10, double d10) {
        d.a aVar;
        AtomicReference a10 = f59394g.a(Double.valueOf(d10));
        if (a10 != null) {
            synchronized (a10) {
                if (z10) {
                    try {
                        aVar = d.a.DO_NOT_OVERRIDE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    aVar = d.a.SHOULD_OVERRIDE;
                }
                a10.set(aVar);
                a10.notify();
            }
        }
    }

    public void z(String str, ValueCallback valueCallback) {
        Intent r10;
        Intent p10;
        this.f59397c = valueCallback;
        Activity currentActivity = this.f59395a.getCurrentActivity();
        Intent createChooser = Intent.createChooser(k(str), "");
        ArrayList arrayList = new ArrayList();
        if (c(str).booleanValue() && (p10 = p()) != null) {
            arrayList.add(p10);
        }
        if (e(str).booleanValue() && (r10 = r()) != null) {
            arrayList.add(r10);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(createChooser, 3);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
    }
}
