package com.ReactNativeBlobUtil;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import s4.C3984a;

public abstract class g {

    public enum a {
        Audio,
        Image,
        Video,
        Download
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cb A[SYNTHETIC, Splitter:B:52:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d5 A[SYNTHETIC, Splitter:B:57:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1 A[SYNTHETIC, Splitter:B:63:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00eb A[SYNTHETIC, Splitter:B:68:0x00eb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.net.Uri r4, java.lang.String r5, com.facebook.react.bridge.Promise r6) {
        /*
            com.facebook.react.bridge.ReactApplicationContext r0 = com.ReactNativeBlobUtil.e.f36648b
            android.content.Context r0 = r0.getApplicationContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0076
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x003c }
            if (r2 == 0) goto L_0x003e
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x003c }
            if (r3 != 0) goto L_0x003e
            boolean r2 = r2.mkdirs()     // Catch:{ IOException -> 0x003c }
            if (r2 != 0) goto L_0x003e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c }
            r1.<init>()     // Catch:{ IOException -> 0x003c }
            java.lang.String r2 = "ReactNativeBlobUtil.copyToInternal: Cannot create parent folders<'"
            r1.append(r2)     // Catch:{ IOException -> 0x003c }
            r1.append(r5)     // Catch:{ IOException -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x003c }
            r6.reject((java.lang.String) r1)     // Catch:{ IOException -> 0x003c }
            return
        L_0x003c:
            r1 = move-exception
            goto L_0x005e
        L_0x003e:
            boolean r1 = r1.createNewFile()     // Catch:{ IOException -> 0x003c }
            if (r1 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c }
            r1.<init>()     // Catch:{ IOException -> 0x003c }
            java.lang.String r2 = "ReactNativeBlobUtil.copyToInternal: Destination file at '"
            r1.append(r2)     // Catch:{ IOException -> 0x003c }
            r1.append(r5)     // Catch:{ IOException -> 0x003c }
            java.lang.String r2 = "' already exists"
            r1.append(r2)     // Catch:{ IOException -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x003c }
            r6.reject((java.lang.String) r1)     // Catch:{ IOException -> 0x003c }
            return
        L_0x005e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ReactNativeBlobUtil.copyToInternal: Could not create file: "
            r2.append(r3)
            java.lang.String r1 = r1.getLocalizedMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r6.reject((java.lang.String) r1)
        L_0x0076:
            r1 = 0
            java.io.InputStream r4 = r0.openInputStream(r4)     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a9, all -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x00a9, all -> 0x00a6 }
            r5 = 10240(0x2800, float:1.4349E-41)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0092, all -> 0x008f }
        L_0x0084:
            int r1 = r4.read(r5)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r1 <= 0) goto L_0x0095
            r2 = 0
            r0.write(r5, r2, r1)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            goto L_0x0084
        L_0x008f:
            r5 = move-exception
        L_0x0090:
            r1 = r4
            goto L_0x00df
        L_0x0092:
            r5 = move-exception
        L_0x0093:
            r1 = r4
            goto L_0x00b1
        L_0x0095:
            r4.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r4 = move-exception
            r4.printStackTrace()
        L_0x009d:
            r0.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00d8
        L_0x00a1:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x00d8
        L_0x00a6:
            r5 = move-exception
            r0 = r1
            goto L_0x0090
        L_0x00a9:
            r5 = move-exception
            r0 = r1
            goto L_0x0093
        L_0x00ac:
            r5 = move-exception
            r0 = r1
            goto L_0x00df
        L_0x00af:
            r5 = move-exception
            r0 = r1
        L_0x00b1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r4.<init>()     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "ReactNativeBlobUtil.copyToInternal:  Could not write data: "
            r4.append(r2)     // Catch:{ all -> 0x00de }
            java.lang.String r5 = r5.getLocalizedMessage()     // Catch:{ all -> 0x00de }
            r4.append(r5)     // Catch:{ all -> 0x00de }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00de }
            r6.reject((java.lang.String) r4)     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00d3
            r1.close()     // Catch:{ IOException -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00d3:
            if (r0 == 0) goto L_0x00d8
            r0.close()     // Catch:{ IOException -> 0x00a1 }
        L_0x00d8:
            java.lang.String r4 = ""
            r6.resolve(r4)
            return
        L_0x00de:
            r5 = move-exception
        L_0x00df:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00e9:
            if (r0 == 0) goto L_0x00f3
            r0.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00f3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.g.a(android.net.Uri, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    public static Uri b(C3984a aVar, a aVar2, ReactApplicationContext reactApplicationContext) {
        ContentResolver contentResolver = e.f36648b.getApplicationContext().getContentResolver();
        ContentValues contentValues = new ContentValues();
        String e10 = e(aVar2, reactApplicationContext);
        String str = aVar.f48016c;
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("mime_type", str);
            contentValues.put("_display_name", aVar.f48014a);
            contentValues.put("relative_path", e10 + '/' + aVar.f48015b);
            try {
                return contentResolver.insert(d(aVar2), contentValues);
            } catch (Exception unused) {
                return null;
            }
        } else {
            File file = new File(e10 + aVar.a());
            if (file.exists()) {
                return Uri.fromFile(file);
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                return null;
            }
            try {
                file.createNewFile();
                return Uri.fromFile(file);
            } catch (IOException unused2) {
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[Catch:{ IOException -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[Catch:{ IOException -> 0x003c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.net.Uri r5, java.lang.String r6, com.facebook.react.bridge.Promise r7) {
        /*
            com.facebook.react.bridge.ReactApplicationContext r0 = com.ReactNativeBlobUtil.e.f36648b
            android.content.Context r0 = r0.getApplicationContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r5 = r0.openInputStream(r5)     // Catch:{ IOException -> 0x003c }
            int r0 = r5.available()     // Catch:{ IOException -> 0x003c }
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x003c }
            int r2 = r5.read(r1)     // Catch:{ IOException -> 0x003c }
            r5.close()     // Catch:{ IOException -> 0x003c }
            if (r2 >= r0) goto L_0x003e
            java.lang.String r5 = "EUNSPECIFIED"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c }
            r6.<init>()     // Catch:{ IOException -> 0x003c }
            java.lang.String r1 = "Read only "
            r6.append(r1)     // Catch:{ IOException -> 0x003c }
            r6.append(r2)     // Catch:{ IOException -> 0x003c }
            java.lang.String r1 = " bytes of "
            r6.append(r1)     // Catch:{ IOException -> 0x003c }
            r6.append(r0)     // Catch:{ IOException -> 0x003c }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x003c }
            r7.reject((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ IOException -> 0x003c }
            return
        L_0x003c:
            r5 = move-exception
            goto L_0x0090
        L_0x003e:
            java.lang.String r5 = r6.toLowerCase()     // Catch:{ IOException -> 0x003c }
            int r6 = r5.hashCode()     // Catch:{ IOException -> 0x003c }
            r2 = -1396204209(0xffffffffacc79d4f, float:-5.673385E-12)
            r3 = 0
            r4 = 1
            if (r6 == r2) goto L_0x005d
            r2 = 93106001(0x58caf51, float:1.3229938E-35)
            if (r6 == r2) goto L_0x0053
            goto L_0x0067
        L_0x0053:
            java.lang.String r6 = "ascii"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException -> 0x003c }
            if (r5 == 0) goto L_0x0067
            r5 = r4
            goto L_0x0068
        L_0x005d:
            java.lang.String r6 = "base64"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException -> 0x003c }
            if (r5 == 0) goto L_0x0067
            r5 = r3
            goto L_0x0068
        L_0x0067:
            r5 = -1
        L_0x0068:
            if (r5 == 0) goto L_0x0087
            if (r5 == r4) goto L_0x0075
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x003c }
            r5.<init>(r1)     // Catch:{ IOException -> 0x003c }
            r7.resolve(r5)     // Catch:{ IOException -> 0x003c }
            goto L_0x0093
        L_0x0075:
            com.facebook.react.bridge.WritableArray r5 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ IOException -> 0x003c }
        L_0x0079:
            if (r3 >= r0) goto L_0x0083
            byte r6 = r1[r3]     // Catch:{ IOException -> 0x003c }
            r5.pushInt(r6)     // Catch:{ IOException -> 0x003c }
            int r3 = r3 + 1
            goto L_0x0079
        L_0x0083:
            r7.resolve(r5)     // Catch:{ IOException -> 0x003c }
            goto L_0x0093
        L_0x0087:
            r5 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ IOException -> 0x003c }
            r7.resolve(r5)     // Catch:{ IOException -> 0x003c }
            goto L_0x0093
        L_0x0090:
            r5.printStackTrace()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.g.c(android.net.Uri, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    private static Uri d(a aVar) {
        if (aVar == a.Audio) {
            if (Build.VERSION.SDK_INT >= 29) {
                return MediaStore.Audio.Media.getContentUri("external_primary");
            }
            return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (aVar == a.Video) {
            if (Build.VERSION.SDK_INT >= 29) {
                return MediaStore.Video.Media.getContentUri("external_primary");
            }
            return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (aVar == a.Image) {
            if (Build.VERSION.SDK_INT >= 29) {
                return MediaStore.Images.Media.getContentUri("external_primary");
            }
            return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (aVar != a.Download || Build.VERSION.SDK_INT < 29) {
            return null;
        } else {
            return MediaStore.Downloads.getContentUri("external_primary");
        }
    }

    private static String e(a aVar, ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (aVar == a.Audio) {
                return Environment.DIRECTORY_MUSIC;
            }
            if (aVar == a.Video) {
                return Environment.DIRECTORY_MOVIES;
            }
            if (aVar == a.Image) {
                return Environment.DIRECTORY_PICTURES;
            }
            if (aVar == a.Download) {
                return Environment.DIRECTORY_DOWNLOADS;
            }
            return Environment.DIRECTORY_DOWNLOADS;
        } else if (aVar == a.Audio) {
            return d.j(reactApplicationContext).get("LegacyMusicDir").toString();
        } else {
            if (aVar == a.Video) {
                return d.j(reactApplicationContext).get("LegacyMovieDir").toString();
            }
            if (aVar == a.Image) {
                return d.j(reactApplicationContext).get("LegacyPictureDir").toString();
            }
            if (aVar == a.Download) {
                return d.j(reactApplicationContext).get("LegacyDownloadDir").toString();
            }
            return d.j(reactApplicationContext).get("LegacyDownloadDir").toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047 A[Catch:{ Exception -> 0x004a, all -> 0x0047 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb A[SYNTHETIC, Splitter:B:47:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1 A[Catch:{ IOException -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(android.net.Uri r7, java.lang.String r8, boolean r9, com.facebook.react.bridge.Promise r10, com.facebook.react.bridge.ReactApplicationContext r11) {
        /*
            java.lang.String r0 = "Failed to get output stream."
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r1 < r2) goto L_0x00cd
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ IOException -> 0x00c5 }
            android.content.ContentResolver r1 = r11.getContentResolver()     // Catch:{ IOException -> 0x00c5 }
            r2 = 0
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r4 = "w"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r7, r4)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r8 = com.ReactNativeBlobUtil.m.f(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            boolean r5 = r4.exists()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r5 != 0) goto L_0x004c
            java.lang.String r7 = "ENOENT"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r9.<init>()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r11 = "No such file ('"
            r9.append(r11)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r9.append(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r8 = "')"
            r9.append(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r10.reject((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            return r3
        L_0x0047:
            r7 = move-exception
            goto L_0x00bf
        L_0x004a:
            r7 = move-exception
            goto L_0x00a7
        L_0x004c:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r8.<init>(r4)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.io.FileDescriptor r6 = r11.getFileDescriptor()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r9 != 0) goto L_0x0095
            r9 = 10240(0x2800, float:1.4349E-41)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
        L_0x0060:
            int r4 = r8.read(r9)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r4 <= 0) goto L_0x006a
            r5.write(r9, r3, r4)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            goto L_0x0060
        L_0x006a:
            r8.close()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r5.close()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r11.close()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.io.OutputStream r7 = r1.openOutputStream(r7)     // Catch:{ IOException -> 0x0092, all -> 0x0047 }
            if (r7 != 0) goto L_0x008d
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x008b }
            r8.<init>(r0)     // Catch:{ IOException -> 0x008b }
            r10.reject((java.lang.Throwable) r8)     // Catch:{ IOException -> 0x008b }
            if (r7 == 0) goto L_0x0086
            r7.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x0086:
            return r3
        L_0x0087:
            r8 = move-exception
            r2 = r7
            r7 = r8
            goto L_0x00bf
        L_0x008b:
            r8 = move-exception
            goto L_0x00b3
        L_0x008d:
            r7.close()     // Catch:{ IOException -> 0x00c5 }
            r7 = 1
            return r7
        L_0x0092:
            r8 = move-exception
            r7 = r2
            goto L_0x00b3
        L_0x0095:
            long r4 = r4.length()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            int r7 = (int) r4     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r8.read(r7)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r8 = "Write to media file with transform was specified but the shared file transformer is not set"
            r7.<init>(r8)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            throw r7     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
        L_0x00a7:
            r7.printStackTrace()     // Catch:{ IOException -> 0x0092, all -> 0x0047 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0092, all -> 0x0047 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0092, all -> 0x0047 }
            r10.reject((java.lang.Throwable) r7)     // Catch:{ IOException -> 0x0092, all -> 0x0047 }
            return r3
        L_0x00b3:
            r1.delete(r2, r2, r2)     // Catch:{ all -> 0x0087 }
            r10.reject((java.lang.Throwable) r8)     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x00be
            r7.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00be:
            return r3
        L_0x00bf:
            if (r2 == 0) goto L_0x00c4
            r2.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c4:
            throw r7     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            java.lang.String r7 = "ReactNativeBlobUtil.createMediaFile"
            java.lang.String r8 = "Cannot write to file, file might not exist"
            r10.reject((java.lang.String) r7, (java.lang.String) r8)
            return r3
        L_0x00cd:
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = com.ReactNativeBlobUtil.m.f(r7)
            java.lang.String r9 = "uri"
            boolean r7 = com.ReactNativeBlobUtil.d.E(r7, r9, r8, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ReactNativeBlobUtil.g.f(android.net.Uri, java.lang.String, boolean, com.facebook.react.bridge.Promise, com.facebook.react.bridge.ReactApplicationContext):boolean");
    }
}
