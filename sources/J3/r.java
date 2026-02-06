package j3;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.C6496s;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f22954a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22955b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22956c;

    public r(Uri uri, String str, String str2) {
        this.f22954a = uri;
        this.f22955b = str;
        this.f22956c = str2;
    }

    public String a() {
        return this.f22955b;
    }

    public String b() {
        return this.f22956c;
    }

    public Uri c() {
        return this.f22954a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        C6496s.h(intent, "intent");
    }
}
