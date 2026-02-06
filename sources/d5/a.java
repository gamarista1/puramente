package D5;

import com.amazon.a.a.o.b;
import java.util.Currency;
import kotlin.jvm.internal.C6496s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f30397a;

    /* renamed from: b  reason: collision with root package name */
    private final double f30398b;

    /* renamed from: c  reason: collision with root package name */
    private final Currency f30399c;

    public a(String str, double d10, Currency currency) {
        C6496s.h(str, "eventName");
        C6496s.h(currency, b.f37469a);
        this.f30397a = str;
        this.f30398b = d10;
        this.f30399c = currency;
    }

    public final double a() {
        return this.f30398b;
    }

    public final Currency b() {
        return this.f30399c;
    }

    public final String c() {
        return this.f30397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (C6496s.c(this.f30397a, aVar.f30397a) && Double.compare(this.f30398b, aVar.f30398b) == 0 && C6496s.c(this.f30399c, aVar.f30399c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f30397a.hashCode() * 31) + Double.hashCode(this.f30398b)) * 31) + this.f30399c.hashCode();
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.f30397a + ", amount=" + this.f30398b + ", currency=" + this.f30399c + ')';
    }
}
