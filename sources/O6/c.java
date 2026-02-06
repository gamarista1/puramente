package O6;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f33386c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final c f33387d = new c("UNKNOWN", (String) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f33388a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33389b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        c a(byte[] bArr, int i10);

        int b();
    }

    public c(String str, String str2) {
        C6496s.h(str, "name");
        this.f33388a = str;
        this.f33389b = str2;
    }

    public final String a() {
        return this.f33388a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (C6496s.c(this.f33388a, cVar.f33388a) && C6496s.c(this.f33389b, cVar.f33389b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f33388a.hashCode() * 31;
        String str = this.f33389b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f33388a;
    }
}
