package retrofit2;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Objects;

public class r extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final int f72905a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72906b;

    /* renamed from: c  reason: collision with root package name */
    private final transient F f72907c;

    public r(F f10) {
        super(a(f10));
        this.f72905a = f10.b();
        this.f72906b = f10.f();
        this.f72907c = f10;
    }

    private static String a(F f10) {
        Objects.requireNonNull(f10, "response == null");
        return "HTTP " + f10.b() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + f10.f();
    }
}
