package O0;

import kotlin.jvm.internal.C6496s;
import lf.C6525i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f4523a;

    /* renamed from: b  reason: collision with root package name */
    private final C6525i f4524b;

    public a(String str, C6525i iVar) {
        this.f4523a = str;
        this.f4524b = iVar;
    }

    public final C6525i a() {
        return this.f4524b;
    }

    public final String b() {
        return this.f4523a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (C6496s.c(this.f4523a, aVar.f4523a) && C6496s.c(this.f4524b, aVar.f4524b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f4523a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        C6525i iVar = this.f4524b;
        if (iVar != null) {
            i11 = iVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f4523a + ", action=" + this.f4524b + ')';
    }
}
