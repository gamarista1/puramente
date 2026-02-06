package com.ReactNativeBlobUtil;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.revenuecat.purchases.common.verification.SigningManager;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class d {

    /* renamed from: a  reason: collision with root package name */
    private ReactApplicationContext f36642a;

    /* renamed from: b  reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f36643b;

    class a extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36644a;

        a(Callback callback) {
            this.f36644a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            WritableArray createArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.f36644a.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.f36644a.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    createArray.pushMap(d.A(file.getPath() + "/" + str));
                }
            } else {
                createArray.pushMap(d.A(file.getAbsolutePath()));
            }
            this.f36644a.invoke(null, createArray);
            return 0;
        }
    }

    class b implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36645a;

        b(Callback callback) {
            this.f36645a = callback;
        }

        public void onScanCompleted(String str, Uri uri) {
            this.f36645a.invoke(null, Boolean.TRUE);
        }
    }

    class c extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36647a;

        c(Callback callback) {
            this.f36647a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < readableArrayArr[0].size(); i10++) {
                    String string = readableArrayArr[0].getString(i10);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f36647a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append(", ");
                    }
                    this.f36647a.invoke(sb2.toString());
                }
            } catch (Exception e10) {
                this.f36647a.invoke(e10.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    d(ReactApplicationContext reactApplicationContext) {
        this.f36642a = reactApplicationContext;
        this.f36643b = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static WritableMap A(String str) {
        String str2;
        try {
            String f10 = m.f(str);
            WritableMap createMap = Arguments.createMap();
            if (q(f10)) {
                String replace = f10.replace("bundle-assets://", "");
                AssetFileDescriptor openFd = e.f36648b.getAssets().openFd(replace);
                createMap.putString("filename", replace);
                createMap.putString("path", f10);
                createMap.putString("type", "asset");
                createMap.putString("size", String.valueOf(openFd.getLength()));
                createMap.putInt("lastModified", 0);
            } else {
                File file = new File(f10);
                if (!file.exists()) {
                    return null;
                }
                createMap.putString("filename", file.getName());
                createMap.putString("path", file.getPath());
                if (file.isDirectory()) {
                    str2 = "directory";
                } else {
                    str2 = "file";
                }
                createMap.putString("type", str2);
                createMap.putString("size", String.valueOf(file.length()));
                createMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return createMap;
        } catch (Exception unused) {
            return null;
        }
    }

    static void B(String str, Callback callback) {
        try {
            d(new File(m.f(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    static void C(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            fileOutputStream = new FileOutputStream(file, z10);
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            promise.resolve(Integer.valueOf(readableArray.size()));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[Catch:{ all -> 0x00ed, FileNotFoundException -> 0x0102, Exception -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf A[Catch:{ all -> 0x00ed, FileNotFoundException -> 0x0102, Exception -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void D(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10, com.facebook.react.bridge.Promise r11) {
        /*
            java.lang.String r0 = "File '"
            java.lang.String r1 = "EUNSPECIFIED"
            java.lang.String r2 = "ENOENT"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r3.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.io.File r4 = r3.getParentFile()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            boolean r5 = r3.exists()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0064
            if (r4 == 0) goto L_0x0046
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0046
            boolean r5 = r4.mkdirs()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0046
            boolean r4 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r4 != 0) goto L_0x0046
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r8 = "Failed to create parent directory of '"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r7.append(r6)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r8 = "'"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r11.reject((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            return
        L_0x0043:
            r6 = move-exception
            goto L_0x00fa
        L_0x0046:
            boolean r4 = r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r7.append(r0)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r7.append(r6)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r8 = "' does not exist and could not be created"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r11.reject((java.lang.String) r2, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            return
        L_0x0064:
            java.lang.String r4 = "uri"
            boolean r4 = r7.equalsIgnoreCase(r4)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r4 == 0) goto L_0x00d3
            java.lang.String r7 = com.ReactNativeBlobUtil.m.f(r8)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.io.File r8 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            boolean r9 = r8.exists()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r9 != 0) goto L_0x009d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r9 = "No such file '"
            r8.append(r9)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.append(r6)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r9 = "' ('"
            r8.append(r9)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r7 = "')"
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r7 = r8.toString()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r11.reject((java.lang.String) r2, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            return
        L_0x009d:
            r7 = 10240(0x2800, float:1.4349E-41)
            byte[] r7 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r9 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00c6 }
            r4.<init>(r8)     // Catch:{ all -> 0x00c6 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c3 }
            r8.<init>(r3, r10)     // Catch:{ all -> 0x00c3 }
            r9 = 0
            r10 = r9
        L_0x00ae:
            int r3 = r4.read(r7)     // Catch:{ all -> 0x00b9 }
            if (r3 <= 0) goto L_0x00bc
            r8.write(r7, r9, r3)     // Catch:{ all -> 0x00b9 }
            int r10 = r10 + r3
            goto L_0x00ae
        L_0x00b9:
            r7 = move-exception
        L_0x00ba:
            r9 = r4
            goto L_0x00c8
        L_0x00bc:
            r4.close()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.close()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            goto L_0x00e5
        L_0x00c3:
            r7 = move-exception
            r8 = r9
            goto L_0x00ba
        L_0x00c6:
            r7 = move-exception
            r8 = r9
        L_0x00c8:
            if (r9 == 0) goto L_0x00cd
            r9.close()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
        L_0x00cd:
            if (r8 == 0) goto L_0x00d2
            r8.close()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
        L_0x00d2:
            throw r7     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
        L_0x00d3:
            byte[] r7 = com.ReactNativeBlobUtil.m.g(r8, r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            if (r9 != 0) goto L_0x00f2
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.<init>(r3, r10)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r8.write(r7)     // Catch:{ all -> 0x00ed }
            int r10 = r7.length     // Catch:{ all -> 0x00ed }
            r8.close()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
        L_0x00e5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            r11.resolve(r7)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            goto L_0x0119
        L_0x00ed:
            r7 = move-exception
            r8.close()     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            throw r7     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
        L_0x00f2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            java.lang.String r8 = "Write file with transform was specified but the shared file transformer is not set"
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
            throw r7     // Catch:{ FileNotFoundException -> 0x0102, Exception -> 0x0043 }
        L_0x00fa:
            java.lang.String r6 = r6.getLocalizedMessage()
            r11.reject((java.lang.String) r1, (java.lang.String) r6)
            goto L_0x0119
        L_0x0102:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = "' does not exist and could not be created, or it is a directory"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r11.reject((java.lang.String) r2, (java.lang.String) r6)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.d.D(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.facebook.react.bridge.Promise):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072 A[Catch:{ all -> 0x008d, FileNotFoundException | Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0077 A[Catch:{ all -> 0x008d, FileNotFoundException | Exception -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean E(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r0 = 0
            java.lang.String r3 = com.ReactNativeBlobUtil.m.f(r3)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            r1.<init>(r3)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            java.io.File r3 = r1.getParentFile()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x0029
            boolean r2 = r3.exists()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r2 != 0) goto L_0x0029
            boolean r2 = r3.mkdirs()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r2 != 0) goto L_0x0029
            boolean r3 = r3.exists()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r3 != 0) goto L_0x0029
            return r0
        L_0x0029:
            boolean r3 = r1.createNewFile()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r3 != 0) goto L_0x0030
            return r0
        L_0x0030:
            java.lang.String r3 = "uri"
            boolean r3 = r4.equalsIgnoreCase(r3)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r3 == 0) goto L_0x007b
            java.lang.String r3 = com.ReactNativeBlobUtil.m.f(r5)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            boolean r3 = r4.exists()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            if (r3 != 0) goto L_0x0048
            return r0
        L_0x0048:
            r3 = 10240(0x2800, float:1.4349E-41)
            byte[] r3 = new byte[r3]     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            r5 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x006e }
            r2.<init>(r4)     // Catch:{ all -> 0x006e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x006b }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x006b }
        L_0x0057:
            int r5 = r2.read(r3)     // Catch:{ all -> 0x0061 }
            if (r5 <= 0) goto L_0x0064
            r4.write(r3, r0, r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0057
        L_0x0061:
            r3 = move-exception
        L_0x0062:
            r5 = r2
            goto L_0x0070
        L_0x0064:
            r2.close()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            r4.close()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            goto L_0x008b
        L_0x006b:
            r3 = move-exception
            r4 = r5
            goto L_0x0062
        L_0x006e:
            r3 = move-exception
            r4 = r5
        L_0x0070:
            if (r5 == 0) goto L_0x0075
            r5.close()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r4.close()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
        L_0x007a:
            throw r3     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
        L_0x007b:
            byte[] r3 = com.ReactNativeBlobUtil.m.g(r5, r4)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            r4.<init>(r1, r6)     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            r4.write(r3)     // Catch:{ all -> 0x008d }
            int r3 = r3.length     // Catch:{ all -> 0x008d }
            r4.close()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
        L_0x008b:
            r3 = 1
            return r3
        L_0x008d:
            r3 = move-exception
            r4.close()     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
            throw r3     // Catch:{ FileNotFoundException | Exception -> 0x0092 }
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.d.E(java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3 A[SYNTHETIC, Splitter:B:49:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db A[Catch:{ Exception -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[SYNTHETIC, Splitter:B:61:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010d A[Catch:{ Exception -> 0x0109 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r6, java.lang.String r7, com.facebook.react.bridge.Callback r8) {
        /*
            java.lang.String r7 = com.ReactNativeBlobUtil.m.f(r7)
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.io.InputStream r3 = p(r6)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r3 != 0) goto L_0x0040
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r7.<init>()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r4 = "Source file at path`"
            r7.append(r4)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r7.append(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r6 = "` does not exist or can not be opened"
            r7.append(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r8.invoke(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r6 = move-exception
            r6.getLocalizedMessage()
        L_0x0035:
            return
        L_0x0036:
            r6 = move-exception
            r7 = r2
            r2 = r3
            goto L_0x0103
        L_0x003b:
            r6 = move-exception
            r7 = r2
            r2 = r3
            goto L_0x00be
        L_0x0040:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            boolean r6 = r6.exists()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            if (r6 != 0) goto L_0x007c
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            boolean r6 = r6.createNewFile()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            if (r6 != 0) goto L_0x007c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r6.<init>()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r4 = "Destination file at '"
            r6.append(r4)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r6.append(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r7 = "' already exists"
            r6.append(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r8.invoke(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r3.close()     // Catch:{ Exception -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r6 = move-exception
            r6.getLocalizedMessage()
        L_0x007b:
            return
        L_0x007c:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0036 }
            r7 = 10240(0x2800, float:1.4349E-41)
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0096, all -> 0x008f }
        L_0x0085:
            int r2 = r3.read(r7)     // Catch:{ Exception -> 0x0096, all -> 0x008f }
            if (r2 <= 0) goto L_0x009c
            r6.write(r7, r1, r2)     // Catch:{ Exception -> 0x0096, all -> 0x008f }
            goto L_0x0085
        L_0x008f:
            r7 = move-exception
            r2 = r3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0103
        L_0x0096:
            r7 = move-exception
            r2 = r3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x00be
        L_0x009c:
            r3.close()     // Catch:{ Exception -> 0x00a4 }
            r6.close()     // Catch:{ Exception -> 0x00a4 }
            r6 = r0
            goto L_0x00f2
        L_0x00a4:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r6 = r6.getLocalizedMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x00f2
        L_0x00b9:
            r6 = move-exception
            r7 = r2
            goto L_0x0103
        L_0x00bc:
            r6 = move-exception
            r7 = r2
        L_0x00be:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r3.<init>()     // Catch:{ all -> 0x0102 }
            r3.append(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch:{ all -> 0x0102 }
            r3.append(r6)     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x00d9
            r2.close()     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d9
        L_0x00d7:
            r7 = move-exception
            goto L_0x00df
        L_0x00d9:
            if (r7 == 0) goto L_0x00f2
            r7.close()     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00f2
        L_0x00df:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = r7.getLocalizedMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        L_0x00f2:
            if (r6 == r0) goto L_0x00fc
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r8.invoke(r6)
            goto L_0x0101
        L_0x00fc:
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r8.invoke(r6)
        L_0x0101:
            return
        L_0x0102:
            r6 = move-exception
        L_0x0103:
            if (r2 == 0) goto L_0x010b
            r2.close()     // Catch:{ Exception -> 0x0109 }
            goto L_0x010b
        L_0x0109:
            r7 = move-exception
            goto L_0x0111
        L_0x010b:
            if (r7 == 0) goto L_0x0114
            r7.close()     // Catch:{ Exception -> 0x0109 }
            goto L_0x0114
        L_0x0111:
            r7.getLocalizedMessage()
        L_0x0114:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.d.a(java.lang.String, java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    static void b(String str, String str2, String str3, Promise promise) {
        try {
            String f10 = m.f(str);
            File file = new File(f10);
            boolean createNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace("ReactNativeBlobUtil-file://", ""));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int read = fileInputStream.read(bArr); read > 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else if (!createNewFile) {
                promise.reject("EEXIST", "File `" + f10 + "` already exists");
                return;
            } else {
                new FileOutputStream(file).write(m.g(str2, str3));
            }
            promise.resolve(f10);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void c(String str, ReadableArray readableArray, Promise promise) {
        try {
            String f10 = m.f(str);
            File file = new File(f10);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + f10 + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            fileOutputStream.write(bArr);
            promise.resolve(f10);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    private static void d(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File d10 : listFiles) {
                    d(d10);
                }
            } else {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
        }
        if (!file.delete()) {
            throw new IOException("Failed to delete '" + file + "'");
        }
    }

    static void e(Callback callback, ReactApplicationContext reactApplicationContext) {
        StatFs statFs = new StatFs(reactApplicationContext.getFilesDir().getPath());
        WritableMap createMap = Arguments.createMap();
        createMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
        createMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
        File externalFilesDir = reactApplicationContext.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            StatFs statFs2 = new StatFs(externalFilesDir.getPath());
            createMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            createMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        } else {
            createMap.putString("external_free", CreateTicketViewModelKt.EmailId);
            createMap.putString("external_total", CreateTicketViewModelKt.EmailId);
        }
        callback.invoke(null, createMap);
    }

    static void f(String str, Callback callback) {
        if (q(str)) {
            try {
                e.f36648b.getAssets().openFd(str.replace("bundle-assets://", ""));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
            }
        } else {
            String f10 = m.f(str);
            if (f10 != null) {
                callback.invoke(Boolean.valueOf(new File(f10).exists()), Boolean.valueOf(new File(f10).isDirectory()));
                return;
            }
            Boolean bool2 = Boolean.FALSE;
            callback.invoke(bool2, bool2);
        }
    }

    static String g(ReactApplicationContext reactApplicationContext) {
        File cacheDir = reactApplicationContext.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getAbsolutePath();
        }
        return "";
    }

    static String h(ReactApplicationContext reactApplicationContext, String str) {
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return "";
    }

    static String i(ReactApplicationContext reactApplicationContext) {
        File filesDir = reactApplicationContext.getFilesDir();
        if (filesDir != null) {
            return filesDir.getAbsolutePath();
        }
        return "";
    }

    static Map j(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("LegacyDCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        hashMap.put("LegacyPictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put("LegacyMusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put("LegacyDownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put("LegacyMovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        hashMap.put("LegacyRingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("LegacySDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            hashMap.put("LegacySDCardDir", "");
        }
        return hashMap;
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            try {
                promise.resolve(reactApplicationContext.getExternalFilesDir((String) null).getParentFile().getAbsolutePath());
            } catch (Exception e10) {
                promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", e10.getLocalizedMessage());
            }
        } else {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", "External storage not mounted");
        }
    }

    public static void l(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            try {
                promise.resolve(reactApplicationContext.getExternalFilesDir((String) null).getAbsolutePath());
            } catch (Exception e10) {
                promise.reject("ReactNativeBlobUtil.getSDCardDir", e10.getLocalizedMessage());
            }
        } else {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", "External storage not mounted");
        }
    }

    static Map m(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("DocumentDir", i(reactApplicationContext));
        hashMap.put("CacheDir", g(reactApplicationContext));
        hashMap.put("DCIMDir", h(reactApplicationContext, Environment.DIRECTORY_DCIM));
        hashMap.put("PictureDir", h(reactApplicationContext, Environment.DIRECTORY_PICTURES));
        hashMap.put("MusicDir", h(reactApplicationContext, Environment.DIRECTORY_MUSIC));
        hashMap.put("DownloadDir", h(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS));
        hashMap.put("MovieDir", h(reactApplicationContext, Environment.DIRECTORY_MOVIES));
        hashMap.put("RingtoneDir", h(reactApplicationContext, Environment.DIRECTORY_RINGTONES));
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("SDCardDir", h(reactApplicationContext, (String) null));
            File externalFilesDir = reactApplicationContext.getExternalFilesDir((String) null);
            if (externalFilesDir == null || externalFilesDir.getParentFile() == null) {
                hashMap.put("SDCardApplicationDir", "");
            } else {
                hashMap.put("SDCardApplicationDir", externalFilesDir.getParentFile().getAbsolutePath());
            }
        } else {
            hashMap.put("SDCardDir", "");
            hashMap.put("SDCardApplicationDir", "");
        }
        hashMap.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        hashMap.put("LibraryDir", "");
        hashMap.put("ApplicationSupportDir", "");
        return hashMap;
    }

    static String n(String str) {
        return e.f36648b.getFilesDir() + "/ReactNativeBlobUtilTmp_" + str;
    }

    static void o(String str, String str2, Promise promise) {
        int i10;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", "SHA-1");
            hashMap.put("sha224", "SHA-224");
            hashMap.put(SigningManager.POST_PARAMS_ALGORITHM, "SHA-256");
            hashMap.put("sha384", "SHA-384");
            hashMap.put("sha512", "SHA-512");
            if (!hashMap.containsKey(str2)) {
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
            } else if (str.startsWith("content://") || !new File(m.f(str)).isDirectory()) {
                MessageDigest instance = MessageDigest.getInstance((String) hashMap.get(str2));
                InputStream p10 = p(str);
                if (p10 == null) {
                    promise.reject("ENOENT", "No such file '" + str + "'");
                    return;
                }
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = p10.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                }
                StringBuilder sb2 = new StringBuilder();
                for (byte valueOf : instance.digest()) {
                    sb2.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
                }
                promise.resolve(sb2.toString());
            } else {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    private static InputStream p(String str) {
        if (str.startsWith("bundle-assets://")) {
            return e.f36648b.getAssets().open(str.replace("bundle-assets://", ""));
        }
        if (str.startsWith("content://")) {
            return e.f36648b.getContentResolver().openInputStream(Uri.parse(str));
        }
        return new FileInputStream(new File(m.f(str)));
    }

    static boolean q(String str) {
        if (str == null || !str.startsWith("bundle-assets://")) {
            return false;
        }
        return true;
    }

    static void r(String str, Promise promise) {
        try {
            String f10 = m.f(str);
            File file = new File(f10);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + f10 + "'");
            } else if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + f10 + "'");
            } else {
                String[] list = new File(f10).list();
                WritableArray createArray = Arguments.createArray();
                for (String pushString : list) {
                    createArray.pushString(pushString);
                }
                promise.resolve(createArray);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void s(String str, Callback callback) {
        new a(callback).execute(new String[]{m.f(str)});
    }

    static void t(String str, Promise promise) {
        String str2;
        String f10 = m.f(str);
        File file = new File(f10);
        if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            if (file.isDirectory()) {
                str2 = "Folder";
            } else {
                str2 = "File";
            }
            sb2.append(str2);
            sb2.append(" '");
            sb2.append(f10);
            sb2.append("' already exists");
            promise.reject("EEXIST", sb2.toString());
            return;
        }
        try {
            if (!file.mkdirs()) {
                promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + f10 + "'");
                return;
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void u(String str, String str2, Callback callback) {
        String f10 = m.f(str);
        String f11 = m.f(str2);
        File file = new File(f10);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + f10 + "` does not exist");
            return;
        }
        try {
            File file2 = new File(f11);
            File parentFile = file2.getParentFile();
            if (parentFile == null || parentFile.exists()) {
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file.renameTo(file2)) {
                    callback.invoke("mv failed for unknown reasons");
                } else {
                    callback.invoke(new Object[0]);
                }
            } else {
                callback.invoke("mv failed because the destination directory doesn't exist");
            }
        } catch (Exception e10) {
            callback.invoke(e10.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071 A[Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e A[Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8 A[Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void v(java.lang.String r6, java.lang.String r7, boolean r8, com.facebook.react.bridge.Promise r9) {
        /*
            java.lang.String r0 = "bundle-assets://"
            java.lang.String r1 = com.ReactNativeBlobUtil.m.f(r6)
            if (r1 == 0) goto L_0x0009
            r6 = r1
        L_0x0009:
            java.lang.String r2 = "EUNSPECIFIED"
            r3 = 0
            if (r1 == 0) goto L_0x0038
            boolean r4 = r1.startsWith(r0)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            if (r4 == 0) goto L_0x0038
            java.lang.String r1 = ""
            java.lang.String r0 = r6.replace(r0, r1)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            com.facebook.react.bridge.ReactApplicationContext r1 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r1 = r0.available()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r5 = r0.read(r4, r3, r1)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r0.close()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            goto L_0x006f
        L_0x0032:
            r6 = move-exception
            goto L_0x0108
        L_0x0035:
            r7 = move-exception
            goto L_0x0110
        L_0x0038:
            if (r1 != 0) goto L_0x0056
            com.facebook.react.bridge.ReactApplicationContext r0 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            android.net.Uri r1 = android.net.Uri.parse(r6)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r1 = r0.available()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r5 = r0.read(r4)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r0.close()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            goto L_0x006f
        L_0x0056:
            java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r0.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            long r4 = r0.length()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r1 = (int) r4     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r0 = r5.read(r4)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r5 = r0
        L_0x006f:
            if (r5 >= r1) goto L_0x008e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.lang.String r8 = "Read only "
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r7.append(r5)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.lang.String r8 = " bytes of "
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r7.append(r1)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r9.reject((java.lang.String) r2, (java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            return
        L_0x008e:
            if (r8 != 0) goto L_0x0100
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r8 = r7.hashCode()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r0 = -1396204209(0xffffffffacc79d4f, float:-5.673385E-12)
            r1 = 2
            r5 = 1
            if (r8 == r0) goto L_0x00c0
            r0 = 3600241(0x36ef71, float:5.045012E-39)
            if (r8 == r0) goto L_0x00b6
            r0 = 93106001(0x58caf51, float:1.3229938E-35)
            if (r8 == r0) goto L_0x00ac
            goto L_0x00ca
        L_0x00ac:
            java.lang.String r8 = "ascii"
            boolean r7 = r7.equals(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            if (r7 == 0) goto L_0x00ca
            r7 = r5
            goto L_0x00cb
        L_0x00b6:
            java.lang.String r8 = "utf8"
            boolean r7 = r7.equals(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            if (r7 == 0) goto L_0x00ca
            r7 = r1
            goto L_0x00cb
        L_0x00c0:
            java.lang.String r8 = "base64"
            boolean r7 = r7.equals(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            if (r7 == 0) goto L_0x00ca
            r7 = r3
            goto L_0x00cb
        L_0x00ca:
            r7 = -1
        L_0x00cb:
            if (r7 == 0) goto L_0x00f8
            if (r7 == r5) goto L_0x00e5
            if (r7 == r1) goto L_0x00db
            java.lang.String r7 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r7.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r9.resolve(r7)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            goto L_0x0157
        L_0x00db:
            java.lang.String r7 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r7.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r9.resolve(r7)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            goto L_0x0157
        L_0x00e5:
            com.facebook.react.bridge.WritableArray r7 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r8 = r4.length     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
        L_0x00ea:
            if (r3 >= r8) goto L_0x00f4
            byte r0 = r4[r3]     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r7.pushInt(r0)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            int r3 = r3 + 1
            goto L_0x00ea
        L_0x00f4:
            r9.resolve(r7)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            goto L_0x0157
        L_0x00f8:
            java.lang.String r7 = android.util.Base64.encodeToString(r4, r1)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            r9.resolve(r7)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            goto L_0x0157
        L_0x0100:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            java.lang.String r8 = "Read file with transform was specified but the shared file transformer is not set"
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
            throw r7     // Catch:{ FileNotFoundException -> 0x0035, Exception -> 0x0032 }
        L_0x0108:
            java.lang.String r6 = r6.getLocalizedMessage()
            r9.reject((java.lang.String) r2, (java.lang.String) r6)
            goto L_0x0157
        L_0x0110:
            java.lang.String r7 = r7.getLocalizedMessage()
            java.lang.String r8 = "EISDIR"
            boolean r0 = r7.contains(r8)
            if (r0 == 0) goto L_0x0139
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expecting a file but '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "' is a directory; "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            r9.reject((java.lang.String) r8, (java.lang.String) r6)
            goto L_0x0157
        L_0x0139:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "No such file '"
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = "'; "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "ENOENT"
            r9.reject((java.lang.String) r7, (java.lang.String) r6)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.d.v(java.lang.String, java.lang.String, boolean, com.facebook.react.bridge.Promise):void");
    }

    static void w(ReadableArray readableArray, Callback callback) {
        new c(callback).execute(new ReadableArray[]{readableArray});
    }

    static void y(String str, String str2, long j10, long j11, String str3, Promise promise) {
        try {
            String f10 = m.f(str2);
            if (str.startsWith("content://") || !new File(m.f(str)).isDirectory()) {
                InputStream p10 = p(str);
                if (p10 == null) {
                    promise.reject("ENOENT", "No such file '" + str + "'");
                    return;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(f10));
                long skip = p10.skip(j10);
                if (skip != j10) {
                    promise.reject("EUNSPECIFIED", "Skipped " + skip + " instead of the specified " + j10 + " bytes");
                    return;
                }
                byte[] bArr = new byte[10240];
                int i10 = (int) (j11 - j10);
                while (true) {
                    if (i10 <= 0) {
                        break;
                    }
                    int read = p10.read(bArr, 0, 10240);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, Math.min(i10, read));
                    i10 -= read;
                }
                p10.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                promise.resolve(f10);
                return;
            }
            promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    static void z(String str, Callback callback) {
        try {
            String f10 = m.f(str);
            WritableMap A10 = A(f10);
            if (A10 == null) {
                callback.invoke("failed to stat path `" + f10 + "` because it does not exist or it is not a folder", null);
                return;
            }
            callback.invoke(null, A10);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void x(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f36642a, strArr, strArr2, new b(callback));
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), null);
        }
    }
}
