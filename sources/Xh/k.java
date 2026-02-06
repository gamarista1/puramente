package xh;

import Sg.p;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.ProtocolException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.B;

public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f73898d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final B f73899a;

    /* renamed from: b  reason: collision with root package name */
    public final int f73900b;

    /* renamed from: c  reason: collision with root package name */
    public final String f73901c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String str) {
            int i10;
            B b10;
            String str2;
            C6496s.h(str, "statusLine");
            if (p.J(str, "HTTP/1.", false, 2, (Object) null)) {
                i10 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    b10 = B.HTTP_1_0;
                } else if (charAt == 1) {
                    b10 = B.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (p.J(str, "ICY ", false, 2, (Object) null)) {
                b10 = B.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        C6496s.g(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(b10, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        private a() {
        }
    }

    public k(B b10, int i10, String str) {
        C6496s.h(b10, "protocol");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        this.f73899a = b10;
        this.f73900b = i10;
        this.f73901c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f73899a == B.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f73900b);
        sb2.append(' ');
        sb2.append(this.f73901c);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
