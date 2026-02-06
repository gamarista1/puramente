package com.ReactNativeBlobUtil;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.UUID;

public class l {

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f36771d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final DeviceEventManagerModule.RCTDeviceEventEmitter f36772a;

    /* renamed from: b  reason: collision with root package name */
    private String f36773b = "base64";

    /* renamed from: c  reason: collision with root package name */
    private OutputStream f36774c = null;

    l(ReactApplicationContext reactApplicationContext) {
        this.f36772a = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static void a(String str, Callback callback) {
        try {
            HashMap hashMap = f36771d;
            OutputStream outputStream = ((l) hashMap.get(str)).f36774c;
            hashMap.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    private void b(String str, String str2, WritableArray writableArray) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putArray("detail", writableArray);
        createMap.putString("streamId", str);
        this.f36772a.emit("ReactNativeBlobUtilFilesystem", createMap);
    }

    private void c(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("detail", str3);
        createMap.putString("streamId", str);
        this.f36772a.emit("ReactNativeBlobUtilFilesystem", createMap);
    }

    private void d(String str, String str2, String str3, String str4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("code", str3);
        createMap.putString("detail", str4);
        createMap.putString("streamId", str);
        this.f36772a.emit("ReactNativeBlobUtilFilesystem", createMap);
    }

    static void f(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = ((l) f36771d.get(str)).f36774c;
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    static void g(String str, String str2, Callback callback) {
        l lVar = (l) f36771d.get(str);
        try {
            lVar.f36774c.write(m.g(str2, lVar.f36773b));
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[SYNTHETIC, Splitter:B:25:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.lang.String r17, java.lang.String r18, int r19, int r20, java.lang.String r21, com.facebook.react.bridge.ReactApplicationContext r22) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r0 = r20
            r3 = r21
            java.lang.String r4 = "bundle-assets://"
            java.lang.String r5 = "base64"
            java.lang.String r6 = "error"
            java.lang.String r7 = com.ReactNativeBlobUtil.m.f(r17)
            if (r7 == 0) goto L_0x0016
            r8 = r7
            goto L_0x0018
        L_0x0016:
            r8 = r17
        L_0x0018:
            boolean r9 = r2.equalsIgnoreCase(r5)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r9 == 0) goto L_0x0021
            r9 = 4095(0xfff, float:5.738E-42)
            goto L_0x0023
        L_0x0021:
            r9 = 4096(0x1000, float:5.74E-42)
        L_0x0023:
            if (r19 <= 0) goto L_0x0027
            r9 = r19
        L_0x0027:
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x0043
            boolean r11 = r8.startsWith(r4)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r11 == 0) goto L_0x0043
            com.facebook.react.bridge.ReactApplicationContext r7 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.lang.String r4 = r8.replace(r4, r10)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.io.InputStream r4 = r7.open(r4)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x005e
        L_0x0040:
            r0 = move-exception
            goto L_0x011c
        L_0x0043:
            if (r7 != 0) goto L_0x0054
            com.facebook.react.bridge.ReactApplicationContext r4 = com.ReactNativeBlobUtil.e.f36648b     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            android.net.Uri r7 = android.net.Uri.parse(r8)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x005e
        L_0x0054:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r4.<init>(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
        L_0x005e:
            java.lang.String r7 = "utf8"
            boolean r7 = r2.equalsIgnoreCase(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r11 = -1
            java.lang.String r12 = "data"
            r13 = 0
            if (r7 == 0) goto L_0x009e
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r5.<init>(r4, r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r7.<init>(r5, r9)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            char[] r14 = new char[r9]     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
        L_0x007c:
            int r15 = r7.read(r14, r13, r9)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r15 == r11) goto L_0x0097
            java.lang.String r11 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r11.<init>(r14, r13, r15)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r1.c(r3, r12, r11)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r0 <= 0) goto L_0x0092
            r11 = r14
            long r13 = (long) r0     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            android.os.SystemClock.sleep(r13)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x0093
        L_0x0092:
            r11 = r14
        L_0x0093:
            r14 = r11
            r11 = -1
            r13 = 0
            goto L_0x007c
        L_0x0097:
            r7.close()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x00f7
        L_0x009e:
            java.lang.String r7 = "ascii"
            boolean r7 = r2.equalsIgnoreCase(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r7 == 0) goto L_0x00c8
            byte[] r5 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
        L_0x00a8:
            int r7 = r4.read(r5)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r9 = -1
            if (r7 == r9) goto L_0x00f7
            com.facebook.react.bridge.WritableArray r9 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r11 = 0
        L_0x00b4:
            if (r11 >= r7) goto L_0x00be
            byte r13 = r5[r11]     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r9.pushInt(r13)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            int r11 = r11 + 1
            goto L_0x00b4
        L_0x00be:
            r1.b(r3, r12, r9)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r0 <= 0) goto L_0x00a8
            long r13 = (long) r0     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            android.os.SystemClock.sleep(r13)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x00a8
        L_0x00c8:
            boolean r5 = r2.equalsIgnoreCase(r5)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            if (r5 == 0) goto L_0x00fd
            byte[] r5 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
        L_0x00d0:
            int r7 = r4.read(r5)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r11 = -1
            if (r7 == r11) goto L_0x00f7
            r13 = 2
            if (r7 >= r9) goto L_0x00e8
            byte[] r14 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r15 = 0
            java.lang.System.arraycopy(r5, r15, r14, r15, r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.lang.String r7 = android.util.Base64.encodeToString(r14, r13)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r1.c(r3, r12, r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x00f0
        L_0x00e8:
            r15 = 0
            java.lang.String r7 = android.util.Base64.encodeToString(r5, r13)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r1.c(r3, r12, r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
        L_0x00f0:
            if (r0 <= 0) goto L_0x00d0
            long r13 = (long) r0     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            android.os.SystemClock.sleep(r13)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x00d0
        L_0x00f7:
            java.lang.String r0 = "end"
            r1.c(r3, r0, r10)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x0118
        L_0x00fd:
            java.lang.String r0 = "EINVAL"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.lang.String r7 = "Unrecognized encoding `"
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r5.append(r2)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.lang.String r7 = "`, should be one of `base64`, `utf8`, `ascii`"
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            r1.d(r3, r6, r0, r5)     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
        L_0x0118:
            r4.close()     // Catch:{ FileNotFoundException -> 0x013b, Exception -> 0x0040 }
            goto L_0x0156
        L_0x011c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to convert data to "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " encoded string. This might be because this encoding cannot be used for this data."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "EUNSPECIFIED"
            r1.d(r3, r6, r4, r2)
            r0.printStackTrace()
            goto L_0x0156
        L_0x013b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "No such file '"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = "'"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ENOENT"
            r1.d(r3, r6, r2, r0)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.l.e(java.lang.String, java.lang.String, int, int, java.lang.String, com.facebook.react.bridge.ReactApplicationContext):void");
    }

    /* access modifiers changed from: package-private */
    public void h(String str, String str2, boolean z10, Callback callback) {
        OutputStream outputStream;
        String f10 = m.f(str);
        if (f10 != null) {
            str = f10;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (f10 == null || file.exists()) {
                if (file.isDirectory()) {
                    callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                    return;
                }
            } else if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                return;
            } else if (!file.createNewFile()) {
                callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                return;
            }
            if (f10 != null && str.startsWith("bundle-assets://")) {
                outputStream = e.f36648b.getAssets().openFd(str.replace("bundle-assets://", "")).createOutputStream();
            } else if (f10 == null) {
                outputStream = e.f36648b.getContentResolver().openOutputStream(Uri.parse(str));
            } else {
                outputStream = new FileOutputStream(str, z10);
            }
            this.f36773b = str2;
            String uuid = UUID.randomUUID().toString();
            f36771d.put(uuid, this);
            this.f36774c = outputStream;
            callback.invoke(null, null, uuid);
        } catch (Exception e10) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e10.getLocalizedMessage());
        }
    }
}
