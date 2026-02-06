package u1;

import android.os.LocaleList;
import java.util.Locale;

final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f26549a;

    k(Object obj) {
        this.f26549a = (LocaleList) obj;
    }

    public String a() {
        return this.f26549a.toLanguageTags();
    }

    public Object b() {
        return this.f26549a;
    }

    public boolean equals(Object obj) {
        return this.f26549a.equals(((j) obj).b());
    }

    public Locale get(int i10) {
        return this.f26549a.get(i10);
    }

    public int hashCode() {
        return this.f26549a.hashCode();
    }

    public boolean isEmpty() {
        return this.f26549a.isEmpty();
    }

    public int size() {
        return this.f26549a.size();
    }

    public String toString() {
        return this.f26549a.toString();
    }
}
