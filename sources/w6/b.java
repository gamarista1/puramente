package W6;

import T5.k;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6531o;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34867c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f34868d = C6531o.b(new a());

    /* renamed from: a  reason: collision with root package name */
    public final int f34869a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34870b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = b.f34868d.getValue();
            C6496s.g(value, "getValue(...)");
            return (Pattern) value;
        }

        /* access modifiers changed from: private */
        public final String f(int i10) {
            if (i10 == Integer.MAX_VALUE) {
                return "";
            }
            return String.valueOf(i10);
        }

        public final b b(int i10) {
            boolean z10;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.b(Boolean.valueOf(z10));
            return new b(i10, a.e.API_PRIORITY_OTHER);
        }

        public final b c(String str) {
            boolean z10;
            boolean z11;
            if (str == null) {
                return null;
            }
            try {
                String[] split = d().split(str);
                boolean z12 = false;
                if (split.length == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k.b(Boolean.valueOf(z10));
                k.b(Boolean.valueOf(C6496s.c(split[0], "bytes")));
                String str2 = split[1];
                C6496s.g(str2, "get(...)");
                int parseInt = Integer.parseInt(str2);
                String str3 = split[2];
                C6496s.g(str3, "get(...)");
                int parseInt2 = Integer.parseInt(str3);
                String str4 = split[3];
                C6496s.g(str4, "get(...)");
                int parseInt3 = Integer.parseInt(str4);
                if (parseInt2 > parseInt) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k.b(Boolean.valueOf(z11));
                if (parseInt3 > parseInt2) {
                    z12 = true;
                }
                k.b(Boolean.valueOf(z12));
                if (parseInt2 < parseInt3 - 1) {
                    return new b(parseInt, parseInt2);
                }
                return new b(parseInt, a.e.API_PRIORITY_OTHER);
            } catch (IllegalArgumentException e10) {
                U u10 = U.f71764a;
                String format = String.format((Locale) null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                C6496s.g(format, "format(...)");
                throw new IllegalArgumentException(format, e10);
            }
        }

        public final b e(int i10) {
            boolean z10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.b(Boolean.valueOf(z10));
            return new b(0, i10);
        }

        private a() {
        }
    }

    public b(int i10, int i11) {
        this.f34869a = i10;
        this.f34870b = i11;
    }

    public static final b d(int i10) {
        return f34867c.b(i10);
    }

    /* access modifiers changed from: private */
    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i10) {
        return f34867c.e(i10);
    }

    public final boolean c(b bVar) {
        if (bVar != null && this.f34869a <= bVar.f34869a && bVar.f34870b <= this.f34870b) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(b.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        if (this.f34869a == bVar.f34869a && this.f34870b == bVar.f34870b) {
            return true;
        }
        return false;
    }

    public final String f() {
        U u10 = U.f71764a;
        a aVar = f34867c;
        String format = String.format((Locale) null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f34869a), aVar.f(this.f34870b)}, 2));
        C6496s.g(format, "format(...)");
        return format;
    }

    public int hashCode() {
        return (this.f34869a * 31) + this.f34870b;
    }

    public String toString() {
        U u10 = U.f71764a;
        a aVar = f34867c;
        String format = String.format((Locale) null, "%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f34869a), aVar.f(this.f34870b)}, 2));
        C6496s.g(format, "format(...)");
        return format;
    }
}
