package s4;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.ReactNativeBlobUtil.m;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: s4.c  reason: case insensitive filesystem */
public abstract class C3986c {
    private static String a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex < 0) {
            return null;
        }
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            if (r8 == 0) goto L_0x0029
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0027 }
            if (r9 == 0) goto L_0x0029
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r7 = r8.getString(r9)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0029
        L_0x0024:
            r9 = move-exception
            r7 = r8
            goto L_0x003c
        L_0x0027:
            r9 = move-exception
            goto L_0x0033
        L_0x0029:
            if (r8 == 0) goto L_0x002e
            r8.close()
        L_0x002e:
            return r7
        L_0x002f:
            r9 = move-exception
            goto L_0x003c
        L_0x0031:
            r9 = move-exception
            r8 = r7
        L_0x0033:
            r9.printStackTrace()     // Catch:{ all -> 0x0024 }
            if (r8 == 0) goto L_0x003b
            r8.close()
        L_0x003b:
            return r7
        L_0x003c:
            if (r7 == 0) goto L_0x0041
            r7.close()
        L_0x0041:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3986c.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String c(Context context, Uri uri) {
        String a10;
        Long l10;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (e(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                if ("primary".equalsIgnoreCase(split[0])) {
                    File externalFilesDir = context.getExternalFilesDir((String) null);
                    if (externalFilesDir == null) {
                        return "";
                    }
                    return externalFilesDir + "/" + split[1];
                }
            } else if (d(uri)) {
                try {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId != null && documentId.startsWith("raw:/")) {
                        return Uri.parse(documentId).getPath();
                    }
                    if (documentId == null || !documentId.startsWith("msf:")) {
                        l10 = Long.valueOf(documentId);
                    } else {
                        l10 = Long.valueOf(documentId.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)[1]);
                    }
                    return b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), l10.longValue()), (String) null, (String[]) null);
                } catch (Exception unused) {
                    return null;
                }
            } else if (g(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                String str = split2[0];
                if (AppearanceType.IMAGE.equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return b(context, uri2, "_id=?", new String[]{split2[1]});
            } else if (!"content".equalsIgnoreCase(uri.getScheme())) {
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (!(openInputStream == null || (a10 = a(context.getContentResolver(), uri)) == null)) {
                        File file = new File(context.getCacheDir(), a10);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (openInputStream.read(bArr) > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                        openInputStream.close();
                        return file.getAbsolutePath();
                    }
                } catch (Exception e10) {
                    m.a(e10.toString());
                    return null;
                }
            } else if (f(uri)) {
                return uri.getLastPathSegment();
            } else {
                return b(context, uri, (String) null, (String[]) null);
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (f(uri)) {
                return uri.getLastPathSegment();
            }
            return b(context, uri, (String) null, (String[]) null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
