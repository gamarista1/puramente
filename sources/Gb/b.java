package Gb;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Map f50813d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map f50814e;

    /* renamed from: a  reason: collision with root package name */
    private final int f50815a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50816b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50817c;

    static {
        HashMap hashMap = new HashMap();
        f50813d = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        hashMap.put(-2, "The server indicated that this operation failed");
        hashMap.put(-3, "This client does not have permission to perform this operation");
        hashMap.put(-4, "The operation had to be aborted due to a network disconnect");
        hashMap.put(-6, "The supplied auth token has expired");
        hashMap.put(-7, "The supplied auth token was invalid");
        hashMap.put(-8, "The transaction had too many retries");
        hashMap.put(-9, "The transaction was overridden by a subsequent set");
        hashMap.put(-10, "The service is unavailable");
        hashMap.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        hashMap.put(-24, "The operation could not be performed due to a network error");
        hashMap.put(-25, "The write was canceled by the user.");
        hashMap.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        f50814e = hashMap2;
        hashMap2.put("datastale", -1);
        hashMap2.put("failure", -2);
        hashMap2.put("permission_denied", -3);
        hashMap2.put("disconnected", -4);
        hashMap2.put("expired_token", -6);
        hashMap2.put("invalid_token", -7);
        hashMap2.put("maxretries", -8);
        hashMap2.put("overriddenbyset", -9);
        hashMap2.put("unavailable", -10);
        hashMap2.put("network_error", -24);
        hashMap2.put("write_canceled", -25);
    }

    private b(int i10, String str) {
        this(i10, str, (String) null);
    }

    public static b a(int i10) {
        Map map = f50813d;
        if (map.containsKey(Integer.valueOf(i10))) {
            return new b(i10, (String) map.get(Integer.valueOf(i10)), (String) null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i10);
    }

    public static b b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return new b(-11, ((String) f50813d.get(-11)) + stringWriter.toString());
    }

    public static b c(String str) {
        return d(str, (String) null);
    }

    public static b d(String str, String str2) {
        return e(str, str2, (String) null);
    }

    public static b e(String str, String str2, String str3) {
        Integer num = (Integer) f50814e.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f50813d.get(num);
        }
        return new b(num.intValue(), str2, str3);
    }

    public int f() {
        return this.f50815a;
    }

    public String g() {
        return this.f50816b;
    }

    public c h() {
        return new c("Firebase Database error: " + this.f50816b);
    }

    public String toString() {
        return "DatabaseError: " + this.f50816b;
    }

    private b(int i10, String str, String str2) {
        this.f50815a = i10;
        this.f50816b = str;
        this.f50817c = str2 == null ? "" : str2;
    }
}
