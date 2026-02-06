package nb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: nb.h  reason: case insensitive filesystem */
public class C5113h {

    /* renamed from: a  reason: collision with root package name */
    private final String f61089a;

    private C5113h(String str) {
        this.f61089a = (String) o.j(str);
    }

    public static C5113h f(char c10) {
        return new C5113h(String.valueOf(c10));
    }

    public static C5113h g(String str) {
        return new C5113h(str);
    }

    public Appendable a(Appendable appendable, Iterator it) {
        o.j(appendable);
        if (it.hasNext()) {
            appendable.append(h(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f61089a);
                appendable.append(h(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it) {
        return c(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    public CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
