package Kc;

import Cb.b;
import Db.C4253b;
import Lc.e;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ub.C5230g;
import zb.C5300b;

public abstract class i {
    public static boolean a(Object obj, Object obj2) {
        return C4535q.b(obj, obj2);
    }

    public static String b(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            C5300b bVar2 = (C5300b) Tasks.await(bVar.a(false), 30000, TimeUnit.MILLISECONDS);
            if (bVar2.a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + bVar2.a());
            }
            return bVar2.b();
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (InterruptedException e11) {
            e = e11;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e12) {
            e = e12;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    public static String c(C4253b bVar) {
        String str;
        if (bVar != null) {
            try {
                str = ((C) Tasks.await(bVar.b(false), 30000, TimeUnit.MILLISECONDS)).f();
            } catch (ExecutionException e10) {
                e = e10;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (InterruptedException e11) {
                e = e11;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (TimeoutException e12) {
                e = e12;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    public static Uri d(C5230g gVar, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = e.f51970k;
        if (str.toLowerCase().startsWith("gs://")) {
            String b10 = d.b(d.a(str.substring(5)));
            return Uri.parse("gs://" + b10);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || (!a(scheme.toLowerCase(), "http") && !a(scheme.toLowerCase(), Constants.SCHEME))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String c10 = d.c(parse.getEncodedPath());
        if (indexOf == 0 && c10.startsWith("/")) {
            int indexOf2 = c10.indexOf("/b/", 0);
            int i10 = indexOf2 + 3;
            int indexOf3 = c10.indexOf("/", i10);
            int indexOf4 = c10.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            str2 = c10.substring(i10, indexOf3);
            if (indexOf4 != -1) {
                str3 = c10.substring(indexOf4 + 3);
            } else {
                str3 = "";
            }
            c10 = str3;
        } else if (indexOf > 1) {
            str2 = parse.getAuthority().substring(0, indexOf - 1);
        } else {
            Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
        }
        C4536s.g(str2, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(str2).encodedPath(c10).build();
    }

    public static long e(String str) {
        if (str == null) {
            return 0;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_ISO8601, Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e10) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e10);
            return 0;
        }
    }
}
