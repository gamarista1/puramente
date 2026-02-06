package Sg;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

public final class m implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f65087b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f65088a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements Serializable {

        /* renamed from: c  reason: collision with root package name */
        public static final a f65089c = new a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private final String f65090a;

        /* renamed from: b  reason: collision with root package name */
        private final int f65091b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String str, int i10) {
            C6496s.h(str, "pattern");
            this.f65090a = str;
            this.f65091b = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f65090a, this.f65091b);
            C6496s.g(compile, "compile(...)");
            return new m(compile);
        }
    }

    public m(Pattern pattern) {
        C6496s.h(pattern, "nativePattern");
        this.f65088a = pattern;
    }

    public static /* synthetic */ k b(m mVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return mVar.a(charSequence, i10);
    }

    private final Object writeReplace() {
        String pattern = this.f65088a.pattern();
        C6496s.g(pattern, "pattern(...)");
        return new b(pattern, this.f65088a.flags());
    }

    public final k a(CharSequence charSequence, int i10) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        Matcher matcher = this.f65088a.matcher(charSequence);
        C6496s.g(matcher, "matcher(...)");
        return n.e(matcher, i10, charSequence);
    }

    public final k c(CharSequence charSequence) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        Matcher matcher = this.f65088a.matcher(charSequence);
        C6496s.g(matcher, "matcher(...)");
        return n.f(matcher, charSequence);
    }

    public final boolean d(CharSequence charSequence) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        return this.f65088a.matcher(charSequence).matches();
    }

    public final String e(CharSequence charSequence, String str) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        C6496s.h(str, "replacement");
        String replaceAll = this.f65088a.matcher(charSequence).replaceAll(str);
        C6496s.g(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String f(CharSequence charSequence, C6798l lVar) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        C6496s.h(lVar, "transform");
        int i10 = 0;
        k b10 = b(this, charSequence, 0, 2, (Object) null);
        if (b10 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i10, b10.c().a().intValue());
            sb2.append((CharSequence) lVar.invoke(b10));
            i10 = b10.c().g().intValue() + 1;
            b10 = b10.next();
            if (i10 >= length) {
                break;
            }
        } while (b10 != null);
        if (i10 < length) {
            sb2.append(charSequence, i10, length);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final List g(CharSequence charSequence, int i10) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        z.A0(i10);
        Matcher matcher = this.f65088a.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return C6565s.e(charSequence.toString());
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = Ef.m.h(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int i13 = 0;
        do {
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            if ((i12 >= 0 && arrayList.size() == i12) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f65088a.toString();
        C6496s.g(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.C6496s.g(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Sg.m.<init>(java.lang.String):void");
    }
}
