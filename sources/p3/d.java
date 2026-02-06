package P3;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f5057a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f5058b;

    public d(String str, Long l10) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f5057a = str;
        this.f5058b = l10;
    }

    public final String a() {
        return this.f5057a;
    }

    public final Long b() {
        return this.f5058b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (C6496s.c(this.f5057a, dVar.f5057a) && C6496s.c(this.f5058b, dVar.f5058b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f5057a.hashCode() * 31;
        Long l10 = this.f5058b;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "Preference(key=" + this.f5057a + ", value=" + this.f5058b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10) {
        this(str, Long.valueOf(z10 ? 1 : 0));
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
    }
}
