package com.ReactNativeBlobUtil;

import Gh.C5405f;
import android.net.Uri;
import android.util.Base64;
import com.ReactNativeBlobUtil.k;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import rh.D;
import rh.y;

class a extends D {

    /* renamed from: a  reason: collision with root package name */
    private long f36611a = 0;

    /* renamed from: b  reason: collision with root package name */
    private ReadableArray f36612b;

    /* renamed from: c  reason: collision with root package name */
    private String f36613c;

    /* renamed from: d  reason: collision with root package name */
    private String f36614d;

    /* renamed from: e  reason: collision with root package name */
    private k.g f36615e;

    /* renamed from: f  reason: collision with root package name */
    private y f36616f;

    /* renamed from: g  reason: collision with root package name */
    private File f36617g;

    /* renamed from: h  reason: collision with root package name */
    int f36618h = 0;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f36619i = Boolean.FALSE;

    /* renamed from: com.ReactNativeBlobUtil.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0601a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36620a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ReactNativeBlobUtil.k$g[] r0 = com.ReactNativeBlobUtil.k.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36620a = r0
                com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.SingleFile     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36620a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.AsIs     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36620a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ReactNativeBlobUtil.k$g r1 = com.ReactNativeBlobUtil.k.g.Others     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.a.C0601a.<clinit>():void");
        }
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        public String f36621a;

        /* renamed from: b  reason: collision with root package name */
        String f36622b;

        /* renamed from: c  reason: collision with root package name */
        String f36623c;

        /* renamed from: d  reason: collision with root package name */
        public String f36624d;

        b(ReadableMap readableMap) {
            String str;
            if (readableMap.hasKey("name")) {
                this.f36621a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f36622b = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.f36623c = readableMap.getString("type");
            } else {
                if (this.f36622b == null) {
                    str = "text/plain";
                } else {
                    str = "application/octet-stream";
                }
                this.f36623c = str;
            }
            if (readableMap.hasKey("data")) {
                this.f36624d = readableMap.getString("data");
            }
        }
    }

    a(String str) {
        this.f36613c = str;
    }

    private ArrayList c() {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        ReactApplicationContext reactApplicationContext = e.f36648b;
        long j11 = 0;
        for (int i11 = 0; i11 < this.f36612b.size(); i11++) {
            b bVar = new b(this.f36612b.getMap(i11));
            arrayList.add(bVar);
            String str = bVar.f36624d;
            if (str == null) {
                m.a("ReactNativeBlobUtil multipart request builder has found a field without `data` property, the field `" + bVar.f36621a + "` will be removed implicitly.");
            } else {
                if (bVar.f36622b == null) {
                    i10 = str.getBytes().length;
                } else if (str.startsWith("ReactNativeBlobUtil-file://")) {
                    String f10 = m.f(str.substring(27));
                    if (m.d(f10)) {
                        try {
                            i10 = reactApplicationContext.getAssets().open(f10.replace("bundle-assets://", "")).available();
                        } catch (IOException e10) {
                            m.a(e10.getLocalizedMessage());
                        }
                    } else {
                        j10 = new File(m.f(f10)).length();
                        j11 += j10;
                    }
                } else if (str.startsWith("ReactNativeBlobUtil-content://")) {
                    String substring = str.substring(30);
                    InputStream inputStream = null;
                    try {
                        inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                        j11 += (long) inputStream.available();
                    } catch (Exception e11) {
                        m.a("Failed to estimate form data length from content URI:" + substring + ", " + e11.getLocalizedMessage());
                        if (inputStream == null) {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th2;
                    }
                    inputStream.close();
                } else {
                    i10 = Base64.decode(str, 0).length;
                }
                j10 = (long) i10;
                j11 += j10;
            }
        }
        this.f36611a = j11;
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0148, code lost:
        if (r10 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x014a, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x016f, code lost:
        if (r10 == null) goto L_0x01bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File d() {
        /*
            r17 = this;
            r1 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "ReactNativeBlobUtil-"
            r0.append(r2)
            java.lang.String r2 = r1.f36613c
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.facebook.react.bridge.ReactApplicationContext r0 = com.ReactNativeBlobUtil.e.f36648b
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r3 = "rnfb-form-tmp"
            java.lang.String r4 = ""
            java.io.File r3 = java.io.File.createTempFile(r3, r4, r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r3)
            java.util.ArrayList r0 = r17.c()
            com.facebook.react.bridge.ReactApplicationContext r6 = com.ReactNativeBlobUtil.e.f36648b
            java.util.Iterator r7 = r0.iterator()
        L_0x0032:
            boolean r0 = r7.hasNext()
            java.lang.String r8 = "--"
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r7.next()
            com.ReactNativeBlobUtil.a$b r0 = (com.ReactNativeBlobUtil.a.b) r0
            java.lang.String r9 = r0.f36624d
            java.lang.String r10 = r0.f36621a
            if (r10 == 0) goto L_0x0032
            if (r9 != 0) goto L_0x0049
            goto L_0x0032
        L_0x0049:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r2)
            java.lang.String r8 = "\r\n"
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = r0.f36622b
            java.lang.String r13 = "\r\n\r\n"
            java.lang.String r14 = "Content-Type: "
            java.lang.String r15 = "\"\r\n"
            r16 = r7
            java.lang.String r7 = "Content-Disposition: form-data; name=\""
            if (r12 == 0) goto L_0x0181
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r7)
            r12.append(r10)
            java.lang.String r7 = "\"; filename=\""
            r12.append(r7)
            java.lang.String r7 = r0.f36622b
            r12.append(r7)
            r12.append(r15)
            java.lang.String r7 = r12.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r14)
            java.lang.String r0 = r0.f36623c
            r10.append(r0)
            r10.append(r13)
            java.lang.String r0 = r10.toString()
            byte[] r0 = r0.getBytes()
            r5.write(r0)
            java.lang.String r0 = "ReactNativeBlobUtil-file://"
            boolean r0 = r9.startsWith(r0)
            java.lang.String r7 = ", "
            if (r0 == 0) goto L_0x012a
            r0 = 27
            java.lang.String r0 = r9.substring(r0)
            java.lang.String r9 = com.ReactNativeBlobUtil.m.f(r0)
            boolean r0 = com.ReactNativeBlobUtil.m.d(r9)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "bundle-assets://"
            java.lang.String r0 = r9.replace(r0, r4)     // Catch:{ IOException -> 0x00d5 }
            android.content.res.AssetManager r10 = r6.getAssets()     // Catch:{ IOException -> 0x00d5 }
            java.io.InputStream r0 = r10.open(r0)     // Catch:{ IOException -> 0x00d5 }
            r1.h(r0, r5)     // Catch:{ IOException -> 0x00d5 }
            goto L_0x01bd
        L_0x00d5:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Failed to create form data asset :"
            r10.append(r11)
            r10.append(r9)
            r10.append(r7)
            java.lang.String r0 = r0.getLocalizedMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.ReactNativeBlobUtil.m.a(r0)
            goto L_0x01bd
        L_0x00f6:
            java.io.File r0 = new java.io.File
            java.lang.String r7 = com.ReactNativeBlobUtil.m.f(r9)
            r0.<init>(r7)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x010f
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r0)
            r1.h(r7, r5)
            goto L_0x01bd
        L_0x010f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "Failed to create form data from path :"
            r0.append(r7)
            r0.append(r9)
            java.lang.String r7 = ", file not exists."
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.ReactNativeBlobUtil.m.a(r0)
            goto L_0x01bd
        L_0x012a:
            java.lang.String r0 = "ReactNativeBlobUtil-content://"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x0178
            r0 = 30
            java.lang.String r9 = r9.substring(r0)
            r10 = 0
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch:{ Exception -> 0x0150 }
            android.net.Uri r11 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0150 }
            java.io.InputStream r10 = r0.openInputStream(r11)     // Catch:{ Exception -> 0x0150 }
            r1.h(r10, r5)     // Catch:{ Exception -> 0x0150 }
            if (r10 == 0) goto L_0x01bd
        L_0x014a:
            r10.close()
            goto L_0x01bd
        L_0x014e:
            r0 = move-exception
            goto L_0x0172
        L_0x0150:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x014e }
            r11.<init>()     // Catch:{ all -> 0x014e }
            java.lang.String r12 = "Failed to create form data from content URI:"
            r11.append(r12)     // Catch:{ all -> 0x014e }
            r11.append(r9)     // Catch:{ all -> 0x014e }
            r11.append(r7)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x014e }
            r11.append(r0)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x014e }
            com.ReactNativeBlobUtil.m.a(r0)     // Catch:{ all -> 0x014e }
            if (r10 == 0) goto L_0x01bd
            goto L_0x014a
        L_0x0172:
            if (r10 == 0) goto L_0x0177
            r10.close()
        L_0x0177:
            throw r0
        L_0x0178:
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r9, r0)
            r5.write(r0)
            goto L_0x01bd
        L_0x0181:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r7)
            r9.append(r10)
            r9.append(r15)
            java.lang.String r7 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r14)
            java.lang.String r7 = r0.f36623c
            r9.append(r7)
            r9.append(r13)
            java.lang.String r7 = r9.toString()
            byte[] r7 = r7.getBytes()
            r5.write(r7)
            java.lang.String r0 = r0.f36624d
            byte[] r0 = r0.getBytes()
            r5.write(r0)
        L_0x01bd:
            byte[] r0 = r8.getBytes()
            r5.write(r0)
            r7 = r16
            goto L_0x0032
        L_0x01c8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r2)
            java.lang.String r2 = "--\r\n"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            r5.write(r0)
            r5.flush()
            r5.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.a.d():java.io.File");
    }

    private void e(long j10) {
        j m10 = k.m(this.f36613c);
        if (m10 != null) {
            long j11 = this.f36611a;
            if (j11 != 0 && m10.a(((float) j10) / ((float) j11))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", this.f36613c);
                createMap.putString("written", String.valueOf(j10));
                createMap.putString("total", String.valueOf(this.f36611a));
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) e.f36648b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress-upload", createMap);
            }
        }
    }

    private InputStream g() {
        if (this.f36614d.startsWith("ReactNativeBlobUtil-file://")) {
            String f10 = m.f(this.f36614d.substring(27));
            if (m.d(f10)) {
                try {
                    return e.f36648b.getAssets().open(f10.replace("bundle-assets://", ""));
                } catch (Exception e10) {
                    throw new Exception("error when getting request stream from asset : " + e10.getLocalizedMessage());
                }
            } else {
                File file = new File(m.f(f10));
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    return new FileInputStream(file);
                } catch (Exception e11) {
                    throw new Exception("error when getting request stream: " + e11.getLocalizedMessage());
                }
            }
        } else if (this.f36614d.startsWith("ReactNativeBlobUtil-content://")) {
            String substring = this.f36614d.substring(30);
            try {
                return e.f36648b.getContentResolver().openInputStream(Uri.parse(substring));
            } catch (Exception e12) {
                throw new Exception("error when getting request stream for content URI: " + substring, e12);
            }
        } else {
            try {
                return new ByteArrayInputStream(Base64.decode(this.f36614d, 0));
            } catch (Exception e13) {
                throw new Exception("error when getting request stream: " + e13.getLocalizedMessage());
            }
        }
    }

    private void h(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    private void i(InputStream inputStream, C5405f fVar) {
        byte[] bArr = new byte[10240];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read > 0) {
                fVar.c1(bArr, 0, read);
                j10 += (long) read;
                e(j10);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public a a(boolean z10) {
        this.f36619i = Boolean.valueOf(z10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        try {
            File file = this.f36617g;
            if (file == null || !file.exists()) {
                return true;
            }
            this.f36617g.delete();
            return true;
        } catch (Exception e10) {
            m.a(e10.getLocalizedMessage());
            return false;
        }
    }

    public long contentLength() {
        if (this.f36619i.booleanValue()) {
            return -1;
        }
        return this.f36611a;
    }

    public y contentType() {
        return this.f36616f;
    }

    /* access modifiers changed from: package-private */
    public InputStream f() {
        try {
            if (this.f36612b != null) {
                return new FileInputStream(this.f36617g);
            }
            int i10 = C0601a.f36620a[this.f36615e.ordinal()];
            if (i10 == 1) {
                return g();
            }
            if (i10 == 2) {
                return new ByteArrayInputStream(this.f36614d.getBytes());
            }
            if (i10 != 3) {
                return null;
            }
            m.a("ReactNativeBlobUtil could not create input stream for request type others");
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            m.a("ReactNativeBlobUtil failed to create input stream for request:" + e10.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public a j(ReadableArray readableArray) {
        this.f36612b = readableArray;
        try {
            File d10 = d();
            this.f36617g = d10;
            this.f36611a = d10.length();
        } catch (Exception e10) {
            e10.printStackTrace();
            m.a("ReactNativeBlobUtil failed to create request multipart body :" + e10.getLocalizedMessage());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public a k(String str) {
        this.f36614d = str;
        if (str == null) {
            this.f36614d = "";
            this.f36615e = k.g.AsIs;
        }
        try {
            int i10 = C0601a.f36620a[this.f36615e.ordinal()];
            if (i10 == 1) {
                this.f36611a = (long) g().available();
            } else if (i10 == 2) {
                this.f36611a = (long) this.f36614d.getBytes().length;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            m.a("ReactNativeBlobUtil failed to create single content request body :" + e10.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public a l(y yVar) {
        this.f36616f = yVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public a m(k.g gVar) {
        this.f36615e = gVar;
        return this;
    }

    public void writeTo(C5405f fVar) {
        try {
            i(f(), fVar);
        } catch (Exception e10) {
            m.a(e10.getLocalizedMessage());
            e10.printStackTrace();
        }
    }
}
