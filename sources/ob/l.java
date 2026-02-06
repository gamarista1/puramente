package Ob;

import Gb.c;
import Lb.q;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f52127a = "0123456789abcdef".toCharArray();

    class a implements b.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f52128a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f52128a = taskCompletionSource;
        }

        public void a(Gb.b bVar, b bVar2) {
            if (bVar != null) {
                this.f52128a.setException(bVar.h());
            } else {
                this.f52128a.setResult(null);
            }
        }
    }

    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        if (i10 == i11) {
            return 0;
        }
        return 1;
    }

    public static int b(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    public static String c(double d10) {
        StringBuilder sb2 = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d10);
        for (int i10 = 7; i10 >= 0; i10--) {
            int i11 = (int) ((doubleToLongBits >>> (i10 * 8)) & 255);
            char[] cArr = f52127a;
            sb2.append(cArr[(i11 >> 4) & 15]);
            sb2.append(cArr[i11 & 15]);
        }
        return sb2.toString();
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private static String e(String str) {
        int indexOf = str.indexOf("//");
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 == -1) {
                return "";
            }
            int indexOf3 = substring.indexOf("?");
            if (indexOf3 != -1) {
                return substring.substring(indexOf2 + 1, indexOf3);
            }
            return substring.substring(indexOf2 + 1);
        }
        throw new c("Firebase Database URL is missing URL scheme");
    }

    public static void f(boolean z10) {
        g(z10, "");
    }

    public static void g(boolean z10, String str) {
        if (!z10) {
            Log.w("FirebaseDatabase", "Assertion failed: " + str);
        }
    }

    public static h h(String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                String host = parse.getHost();
                if (host != null) {
                    String queryParameter = parse.getQueryParameter("ns");
                    boolean z10 = false;
                    if (queryParameter == null) {
                        queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
                    }
                    q qVar = new q();
                    qVar.f51879a = host.toLowerCase(Locale.US);
                    int port = parse.getPort();
                    if (port != -1) {
                        if (scheme.equals(Constants.SCHEME) || scheme.equals("wss")) {
                            z10 = true;
                        }
                        qVar.f51880b = z10;
                        qVar.f51879a += com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + port;
                    } else {
                        qVar.f51880b = true;
                    }
                    qVar.f51882d = qVar.f51879a;
                    qVar.f51881c = queryParameter;
                    String replace = e(str).replace("+", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    m.i(replace);
                    h hVar = new h();
                    hVar.f52117b = new Lb.l(replace);
                    hVar.f52116a = qVar;
                    return hVar;
                }
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
        } catch (Exception e10) {
            throw new c("Invalid Firebase Database url specified: " + str, e10);
        }
    }

    public static String i(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes(Constants.ENCODING));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e10);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        }
    }

    public static String j(String str) {
        String str2;
        if (str.indexOf(92) != -1) {
            str2 = str.replace("\\", "\\\\");
        } else {
            str2 = str;
        }
        if (str.indexOf(34) != -1) {
            str2 = str2.replace("\"", "\\\"");
        }
        return '\"' + str2 + '\"';
    }

    public static Integer k(String str) {
        boolean z10;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i10 = 0;
        if (str.charAt(0) == '-') {
            z10 = true;
            if (str.length() == 1) {
                return null;
            }
            i10 = 1;
        } else {
            z10 = false;
        }
        long j10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j10 = (j10 * 10) + ((long) (charAt - '0'));
            i10++;
        }
        if (z10) {
            long j11 = -j10;
            if (j11 < -2147483648L) {
                return null;
            }
            return Integer.valueOf((int) j11);
        } else if (j10 > 2147483647L) {
            return null;
        } else {
            return Integer.valueOf((int) j10);
        }
    }

    public static g l(b.e eVar) {
        if (eVar != null) {
            return new g((Object) null, eVar);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        return new g(taskCompletionSource.getTask(), new a(taskCompletionSource));
    }
}
