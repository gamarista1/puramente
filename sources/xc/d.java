package xc;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import uc.C5233a;
import vc.h;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f62232a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C5233a.e().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static boolean c(String str) {
        if (str == null || !f62232a.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    public static void d(h hVar) {
        if (!hVar.g()) {
            hVar.p();
        }
        hVar.b();
    }
}
