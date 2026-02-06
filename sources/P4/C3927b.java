package p4;

import Sg.p;
import android.webkit.JavascriptInterface;
import com.amazon.a.a.o.b.f;
import io.intercom.android.sdk.models.Participant;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p4.g;
import yf.C6798l;

/* renamed from: p4.b  reason: case insensitive filesystem */
public final class C3927b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f47550c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f47551d = "function parseForm(form){\n\n    var values = '';\n    for(var i=0 ; i< form.elements.length; i++){\n        values +=\n            form.elements[i].name +\n            '=' +\n            form.elements[i].value +\n            '|'\n    }\n    FormInterceptorInterface.processFormData(values);\n}\n\n\nfor(var i=0 ; i< document.forms.length ; i++){\n    parseForm(document.forms[i]);\n}";

    /* renamed from: a  reason: collision with root package name */
    private final String f47552a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f47553b;

    /* renamed from: p4.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return C3927b.f47551d;
        }

        private a() {
        }
    }

    public C3927b(String str, C6798l lVar) {
        C6496s.h(str, "expectedState");
        C6496s.h(lVar, "callback");
        this.f47552a = str;
        this.f47553b = lVar;
    }

    @JavascriptInterface
    public final void processFormData(String str) {
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str3;
        String str4;
        C6496s.h(str, "formData");
        Iterable F02 = p.F0(str, new String[]{f.f37531c}, false, 0, 6, (Object) null);
        Iterator it = F02.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p.J((String) obj, "id_token", false, 2, (Object) null)) {
                break;
            }
        }
        String str5 = (String) obj;
        Iterator it2 = F02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (p.J((String) obj2, "code", false, 2, (Object) null)) {
                break;
            }
        }
        String str6 = (String) obj2;
        Iterator it3 = F02.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (p.J((String) obj3, "state", false, 2, (Object) null)) {
                break;
            }
        }
        String str7 = (String) obj3;
        Iterator it4 = F02.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (p.J((String) obj4, Participant.USER_TYPE, false, 2, (Object) null)) {
                break;
            }
        }
        String str8 = (String) obj4;
        if (str7 == null || (str6 == null && str5 == null && str8 == null)) {
            this.f47553b.invoke(g.a.f47556a);
            return;
        }
        String S02 = p.S0(str7, f.f37530b, (String) null, 2, (Object) null);
        if (str6 != null) {
            str3 = p.S0(str6, f.f37530b, (String) null, 2, (Object) null);
        } else {
            str3 = null;
        }
        if (str5 != null) {
            str4 = p.S0(str5, f.f37530b, (String) null, 2, (Object) null);
        } else {
            str4 = null;
        }
        if (str8 != null) {
            str2 = p.S0(str8, f.f37530b, (String) null, 2, (Object) null);
        }
        if (C6496s.c(S02, this.f47552a)) {
            C6798l lVar = this.f47553b;
            if (str3 == null) {
                str3 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            lVar.invoke(new g.c(str3, str4, S02, str2));
            return;
        }
        this.f47553b.invoke(new g.b(new IllegalArgumentException("state does not match")));
    }
}
