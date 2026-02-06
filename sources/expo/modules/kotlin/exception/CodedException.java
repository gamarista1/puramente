package expo.modules.kotlin.exception;

import Sg.m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\b\u0017\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\fB\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\nB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "()V", "a", "Ljava/lang/String;", "providedCode", "getCode", "()Ljava/lang/String;", "b", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CodedException extends Exception {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60419b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f60420c = 8;

    /* renamed from: a  reason: collision with root package name */
    private String f60421a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class cls) {
            C6496s.h(cls, "clazz");
            String e10 = new m("(.)([A-Z])").e(new m("(Exception)$").e(cls.getSimpleName(), ""), "$1_$2");
            Locale locale = Locale.ROOT;
            C6496s.g(locale, "ROOT");
            String upperCase = e10.toUpperCase(locale);
            C6496s.g(upperCase, "toUpperCase(...)");
            return "ERR_" + upperCase;
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CodedException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    public final String getCode() {
        String str = this.f60421a;
        if (str == null) {
            return f60419b.a(getClass());
        }
        return str;
    }

    public CodedException(String str, Throwable th2) {
        super(str, th2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CodedException(String str, String str2, Throwable th2) {
        this(str2, th2);
        C6496s.h(str, "code");
        this.f60421a = str;
    }

    public CodedException() {
        this((String) null, (Throwable) null);
    }
}
