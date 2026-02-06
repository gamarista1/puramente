package io.invertase.firebase.storage;

import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.storage.C4853i;
import com.google.firebase.storage.D;
import com.google.firebase.storage.m;
import com.google.firebase.storage.n;
import com.google.firebase.storage.o;
import io.branch.rnbranch.RNBranchModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

abstract class a {
    static n a(ReadableMap readableMap, Uri uri, n nVar) {
        n.b bVar = new n.b();
        String str = null;
        if (readableMap != null) {
            if (readableMap.hasKey("customMetadata") || nVar != null) {
                HashMap hashMap = new HashMap();
                ReadableMap map = readableMap.getMap("customMetadata");
                HashMap hashMap2 = new HashMap();
                if (nVar != null) {
                    for (String str2 : nVar.z()) {
                        hashMap.put(str2, nVar.y(str2));
                        hashMap2.put(str2, nVar.y(str2));
                    }
                }
                if (map != null) {
                    hashMap.putAll(map.toHashMap());
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    bVar.i((String) entry.getKey(), (String) entry.getValue());
                    if (map == null || !map.hasKey((String) entry.getKey())) {
                        bVar.i((String) entry.getKey(), (String) null);
                    }
                }
            }
            if (readableMap.hasKey("cacheControl")) {
                bVar.d(readableMap.getString("cacheControl"));
            }
            if (readableMap.hasKey("contentEncoding")) {
                bVar.f(readableMap.getString("contentEncoding"));
            }
            if (readableMap.hasKey("contentLanguage")) {
                bVar.g(readableMap.getString("contentLanguage"));
            }
            if (readableMap.hasKey("contentDisposition")) {
                bVar.e(readableMap.getString("contentDisposition"));
            }
        }
        if (readableMap != null && readableMap.hasKey("contentType")) {
            bVar.h(readableMap.getString("contentType"));
        } else if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null && scheme.equals("content")) {
                str = io.invertase.firebase.app.a.a().getContentResolver().getType(uri);
            }
            if (str == null) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.ROOT));
            }
            if (str != null) {
                bVar.h(str);
            }
        }
        return bVar.a();
    }

    static String[] b(Exception exc) {
        String str;
        String str2;
        String str3 = "unknown";
        if (exc != null) {
            str = exc.getMessage();
            if (exc instanceof m) {
                m mVar = (m) exc;
                Throwable cause = mVar.getCause();
                int f10 = mVar.f();
                if (f10 == -13040) {
                    str2 = "cancelled";
                    str = "User cancelled the operation.";
                } else if (f10 == -13031) {
                    str2 = "non-matching-checksum";
                    str = "File on the client does not match the checksum of the file received by the server.";
                } else if (f10 == -13030) {
                    str2 = "retry-limit-exceeded";
                    str = "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
                } else if (f10 == -13021) {
                    str2 = "unauthorized";
                    str = "User is not authorized to perform the desired action.";
                } else if (f10 != -13020) {
                    switch (f10) {
                        case -13013:
                            str2 = "quota-exceeded";
                            str = "Quota on your Firebase Storage bucket has been exceeded.";
                            break;
                        case -13012:
                            str2 = "project-not-found";
                            str = "No project is configured for Firebase Storage.";
                            break;
                        case -13011:
                            str2 = "bucket-not-found";
                            str = "No bucket is configured for Firebase Storage.";
                            break;
                        case -13010:
                            str = "No object exists at the desired reference.";
                            str2 = "object-not-found";
                            break;
                        default:
                            str2 = str3;
                            break;
                    }
                } else {
                    str2 = "unauthenticated";
                    str = "User is unauthenticated. Authenticate and try again.";
                }
                if (str2.equals(str3) && cause != null) {
                    if (cause.getMessage().contains("No such file or directory")) {
                        str3 = "file-not-found";
                        str = "The local file specified does not exist on the device.";
                    } else if (cause.getMessage().contains("Not Found.  Could not get object")) {
                        str = "No object exists at the desired reference.";
                        str3 = "object-not-found";
                    } else {
                        str = cause.getMessage();
                    }
                }
                str3 = str2;
            }
        } else {
            str = "An unknown error has occurred.";
        }
        return new String[]{str3, str};
    }

    static WritableMap c(C4853i iVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("nextPageToken", iVar.c());
        WritableArray createArray = Arguments.createArray();
        WritableArray createArray2 = Arguments.createArray();
        for (o r10 : iVar.b()) {
            createArray.pushString(r10.r());
        }
        for (o r11 : iVar.d()) {
            createArray2.pushString(r11.r());
        }
        createMap.putArray("items", createArray);
        createMap.putArray("prefixes", createArray2);
        return createMap;
    }

    static WritableMap d(n nVar) {
        if (nVar == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("bucket", nVar.r());
        createMap.putString("generation", nVar.A());
        createMap.putString("metageneration", nVar.C());
        createMap.putString("fullPath", nVar.E());
        createMap.putString("name", nVar.D());
        createMap.putDouble("size", (double) nVar.F());
        createMap.putString("timeCreated", Ue.m.j(nVar.x() / 1000));
        createMap.putString("updated", Ue.m.j(nVar.G() / 1000));
        createMap.putString("md5Hash", nVar.B());
        if (nVar.s() != null && nVar.s().length() > 0) {
            createMap.putString("cacheControl", nVar.s());
        }
        if (nVar.v() != null && nVar.v().length() > 0) {
            createMap.putString("contentLanguage", nVar.v());
        }
        if (nVar.t() != null && nVar.t().length() > 0) {
            createMap.putString("contentDisposition", nVar.t());
        }
        if (nVar.u() != null && nVar.u().length() > 0) {
            createMap.putString("contentEncoding", nVar.u());
        }
        if (nVar.w() != null && nVar.w().length() > 0) {
            createMap.putString("contentType", nVar.w());
        }
        if (nVar.z().size() > 0) {
            WritableMap createMap2 = Arguments.createMap();
            for (String str : nVar.z()) {
                createMap2.putString(str, nVar.y(str));
            }
            createMap.putMap("customMetadata", createMap2);
        }
        return createMap;
    }

    static String e(D d10) {
        if (d10 == null) {
            return "unknown";
        }
        if (d10.K()) {
            return "running";
        }
        if (d10.L()) {
            return "paused";
        }
        if (d10.isSuccessful() || d10.isComplete()) {
            return com.amazon.device.simplesignin.a.a.a.f38020s;
        }
        if (d10.isCanceled()) {
            return "cancelled";
        }
        if (d10.getException() != null) {
            return RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR;
        }
        return "unknown";
    }

    static boolean f() {
        boolean z10;
        boolean z11;
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            z11 = true;
        } else if ("mounted_ro".equals(externalStorageState)) {
            z10 = false;
            z11 = true;
            if (!z11 && z10) {
                return true;
            }
        } else {
            z11 = false;
        }
        z10 = z11;
        return !z11 ? false : false;
    }

    static void g(Promise promise, Exception exc) {
        String[] b10 = b(exc);
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, b10[0], b10[1]);
    }
}
