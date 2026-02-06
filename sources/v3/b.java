package V3;

import android.app.Application;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.d;
import com.facebook.react.bridge.ReactContext;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f8245a = new ArrayList();

    public static Uri a(ReactContext reactContext, File file) {
        b(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && f8245a.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith("content://")) {
            return Uri.fromFile(file);
        }
        Uri uri = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f8245a;
            if (i10 >= arrayList.size()) {
                break;
            }
            try {
                uri = d.getUriForFile(reactContext, (String) arrayList.get(i10), file);
                if (uri != null) {
                    break;
                }
                i10++;
            } catch (Exception e10) {
                PrintStream printStream = System.out;
                printStream.println("RNSharePathUtil::compatUriFromFile ERROR " + e10.getMessage());
            }
        }
        return uri;
    }

    public static void b(ReactContext reactContext) {
        ArrayList arrayList = f8245a;
        if (arrayList.size() == 0) {
            Application application = (Application) reactContext.getApplicationContext();
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r8 = 0
            c2.b r9 = new c2.b     // Catch:{ all -> 0x0033 }
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0033 }
            android.database.Cursor r10 = r9.G()     // Catch:{ all -> 0x0033 }
            if (r10 == 0) goto L_0x002d
            boolean r11 = r10.moveToFirst()     // Catch:{ all -> 0x002a }
            if (r11 == 0) goto L_0x002d
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002a }
            java.lang.String r11 = r10.getString(r11)     // Catch:{ all -> 0x002a }
            r10.close()
            return r11
        L_0x002a:
            r11 = move-exception
            r8 = r10
            goto L_0x0034
        L_0x002d:
            if (r10 == 0) goto L_0x0032
            r10.close()
        L_0x0032:
            return r8
        L_0x0033:
            r11 = move-exception
        L_0x0034:
            if (r8 == 0) goto L_0x0039
            r8.close()
        L_0x0039:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.b.c(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String d(Context context, Uri uri, Boolean bool) {
        File file;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (f(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                String str = split[0];
                if ("primary".equalsIgnoreCase(str) || "0".equalsIgnoreCase(str)) {
                    if (bool.booleanValue()) {
                        file = context.getCacheDir();
                    } else {
                        file = context.getExternalCacheDir();
                    }
                    return "" + file + "/" + split[1];
                } else if ("raw".equalsIgnoreCase(str)) {
                    return "" + split[1];
                } else if (!TextUtils.isEmpty(str)) {
                    return "" + "/storage/" + str + "/" + split[1];
                }
            } else if (e(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (documentId.startsWith("raw:")) {
                    return "" + documentId.replaceFirst("raw:", "");
                }
                Uri withAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue());
                return "" + c(context, withAppendedId, (String) null, (String[]) null);
            } else if (h(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                String str2 = split2[0];
                if (AppearanceType.IMAGE.equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                } else if ("raw".equalsIgnoreCase(str2)) {
                    return "" + split2[1];
                }
                return "" + c(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (g(uri)) {
                return uri.getLastPathSegment();
            }
            return "" + c(context, uri, (String) null, (String[]) null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
