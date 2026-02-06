package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

public final class p {

    /* renamed from: q  reason: collision with root package name */
    private static final b f22904q = new b((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f22905r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f22906s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: t  reason: collision with root package name */
    private static final String f22907t = "http[s]?://";

    /* renamed from: u  reason: collision with root package name */
    private static final String f22908u = ".*";

    /* renamed from: v  reason: collision with root package name */
    private static final String f22909v = ("\\E" + ".*" + "\\Q");

    /* renamed from: w  reason: collision with root package name */
    private static final String f22910w = "([^/]*?|)";

    /* renamed from: a  reason: collision with root package name */
    private final String f22911a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22912b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22913c;

    /* renamed from: d  reason: collision with root package name */
    private final List f22914d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f22915e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f22916f = C6531o.b(new l(this));

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f22917g = C6531o.b(new j(this));

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f22918h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f22919i;

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f22920j;

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f22921k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f22922l;

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f22923m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public String f22924n;

    /* renamed from: o  reason: collision with root package name */
    private final Lazy f22925o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22926p;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0365a f22927d = new C0365a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private String f22928a;

        /* renamed from: b  reason: collision with root package name */
        private String f22929b;

        /* renamed from: c  reason: collision with root package name */
        private String f22930c;

        /* renamed from: j3.p$a$a  reason: collision with other inner class name */
        public static final class C0365a {
            public /* synthetic */ C0365a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0365a() {
            }
        }

        public final p a() {
            return new p(this.f22928a, this.f22929b, this.f22930c);
        }

        public final a b(String str) {
            C6496s.h(str, "uriPattern");
            this.f22928a = str;
            return this;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private String f22931a;

        /* renamed from: b  reason: collision with root package name */
        private String f22932b;

        public c(String str) {
            List list;
            C6496s.h(str, "mimeType");
            List g10 = new Sg.m("/").g(str, 0);
            if (!g10.isEmpty()) {
                ListIterator listIterator = g10.listIterator(g10.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = C6565s.V0(g10, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = C6565s.n();
            this.f22931a = (String) list.get(0);
            this.f22932b = (String) list.get(1);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10;
            C6496s.h(cVar, "other");
            if (C6496s.c(this.f22931a, cVar.f22931a)) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (C6496s.c(this.f22932b, cVar.f22932b)) {
                return i10 + 1;
            }
            return i10;
        }

        public final String b() {
            return this.f22932b;
        }

        public final String c() {
            return this.f22931a;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f22933a;

        /* renamed from: b  reason: collision with root package name */
        private final List f22934b = new ArrayList();

        public final void a(String str) {
            C6496s.h(str, "name");
            this.f22934b.add(str);
        }

        public final List b() {
            return this.f22934b;
        }

        public final String c() {
            return this.f22933a;
        }

        public final void d(String str) {
            this.f22933a = str;
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22935a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(p pVar) {
            super(0);
            this.f22935a = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = (java.util.List) r0.c();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List invoke() {
            /*
                r1 = this;
                j3.p r0 = r1.f22935a
                kotlin.Pair r0 = r0.l()
                if (r0 == 0) goto L_0x0010
                java.lang.Object r0 = r0.c()
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0015
            L_0x0010:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0015:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.p.e.invoke():java.util.List");
        }
    }

    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22936a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar) {
            super(0);
            this.f22936a = pVar;
        }

        /* renamed from: a */
        public final Pair invoke() {
            return this.f22936a.H();
        }
    }

    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22937a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p pVar) {
            super(0);
            this.f22937a = pVar;
        }

        /* renamed from: a */
        public final Pattern invoke() {
            String b10 = this.f22937a.n();
            if (b10 != null) {
                return Pattern.compile(b10, 2);
            }
            return null;
        }
    }

    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22938a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(p pVar) {
            super(0);
            this.f22938a = pVar;
        }

        public final String invoke() {
            Pair a10 = this.f22938a.l();
            if (a10 != null) {
                return (String) a10.d();
            }
            return null;
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f22939a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f22939a = bundle;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C6496s.h(str, "argName");
            return Boolean.valueOf(!this.f22939a.containsKey(str));
        }
    }

    static final class j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22940a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(p pVar) {
            super(0);
            this.f22940a = pVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            boolean z10;
            if (this.f22940a.y() == null || Uri.parse(this.f22940a.y()).getQuery() == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class k extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22941a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(p pVar) {
            super(0);
            this.f22941a = pVar;
        }

        /* renamed from: a */
        public final Pattern invoke() {
            String c10 = this.f22941a.f22924n;
            if (c10 != null) {
                return Pattern.compile(c10);
            }
            return null;
        }
    }

    static final class l extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22942a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(p pVar) {
            super(0);
            this.f22942a = pVar;
        }

        /* renamed from: a */
        public final Pattern invoke() {
            String d10 = this.f22942a.f22915e;
            if (d10 != null) {
                return Pattern.compile(d10, 2);
            }
            return null;
        }
    }

    static final class m extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f22943a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(p pVar) {
            super(0);
            this.f22943a = pVar;
        }

        public final Map invoke() {
            return this.f22943a.L();
        }
    }

    public p(String str, String str2, String str3) {
        this.f22911a = str;
        this.f22912b = str2;
        this.f22913c = str3;
        C6534r rVar = C6534r.NONE;
        this.f22918h = C6531o.a(rVar, new m(this));
        this.f22920j = C6531o.a(rVar, new f(this));
        this.f22921k = C6531o.a(rVar, new e(this));
        this.f22922l = C6531o.a(rVar, new h(this));
        this.f22923m = C6531o.b(new g(this));
        this.f22925o = C6531o.b(new k(this));
        K();
        J();
    }

    private final boolean A() {
        return ((Boolean) this.f22917g.getValue()).booleanValue();
    }

    private final boolean B(String str) {
        String str2 = this.f22912b;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return C6496s.c(str2, str);
    }

    private final boolean C(String str) {
        if (this.f22913c == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Pattern v10 = v();
        C6496s.e(v10);
        return v10.matcher(str).matches();
    }

    private final boolean D(Uri uri) {
        if (w() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Pattern w10 = w();
        C6496s.e(w10);
        return w10.matcher(uri.toString()).matches();
    }

    private final void F(Bundle bundle, String str, String str2, C2137h hVar) {
        if (hVar != null) {
            hVar.a().parseAndPut(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    private final boolean G(Bundle bundle, String str, String str2, C2137h hVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (hVar == null) {
            return false;
        }
        C2126C a10 = hVar.a();
        a10.parseAndPut(bundle, str, str2, a10.get(bundle, str));
        return false;
    }

    /* access modifiers changed from: private */
    public final Pair H() {
        String str = this.f22911a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f22911a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        C6496s.e(fragment);
        g(fragment, arrayList, sb2);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "fragRegex.toString()");
        return C6502A.a(arrayList, sb3);
    }

    private final boolean I(List list, d dVar, Bundle bundle, Map map) {
        Matcher matcher;
        Object obj;
        Bundle a10 = u1.c.a(new Pair[0]);
        Iterator it = dVar.b().iterator();
        while (true) {
            C2126C c10 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C2137h hVar = (C2137h) map.get(str);
            if (hVar != null) {
                c10 = hVar.a();
            }
            if ((c10 instanceof C2132c) && !hVar.b()) {
                c10.put(a10, str, ((C2132c) c10).a());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String c11 = dVar.c();
            if (c11 != null) {
                matcher = Pattern.compile(c11, 32).matcher(str2);
            } else {
                matcher = null;
            }
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Iterable b10 = dVar.b();
            ArrayList arrayList = new ArrayList(C6565s.y(b10, 10));
            int i10 = 0;
            for (Object next : b10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                String str3 = (String) next;
                String group = matcher.group(i11);
                if (group == null) {
                    group = "";
                } else {
                    C6496s.g(group, "argMatcher.group(index + 1) ?: \"\"");
                }
                C2137h hVar2 = (C2137h) map.get(str3);
                try {
                    if (!a10.containsKey(str3)) {
                        F(a10, str3, group, hVar2);
                        obj = C6514M.f71813a;
                    } else {
                        obj = Boolean.valueOf(G(a10, str3, group, hVar2));
                    }
                } catch (IllegalArgumentException unused) {
                    obj = C6514M.f71813a;
                }
                arrayList.add(obj);
                i10 = i11;
            }
        }
        bundle.putAll(a10);
        return true;
    }

    private final void J() {
        if (this.f22913c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f22913c).matches()) {
                c cVar = new c(this.f22913c);
                this.f22924n = Sg.p.D("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + this.f22913c + " does not match to required \"type/subtype\" format").toString());
        }
    }

    private final void K() {
        if (this.f22911a != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f22905r.matcher(this.f22911a).find()) {
                sb2.append(f22907t);
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f22911a);
            matcher.find();
            boolean z10 = false;
            String substring = this.f22911a.substring(0, matcher.start());
            C6496s.g(substring, "substring(...)");
            g(substring, this.f22914d, sb2);
            String str = f22908u;
            if (!Sg.p.O(sb2, str, false, 2, (Object) null) && !Sg.p.O(sb2, f22910w, false, 2, (Object) null)) {
                z10 = true;
            }
            this.f22926p = z10;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb3 = sb2.toString();
            C6496s.g(sb3, "uriRegex.toString()");
            this.f22915e = Sg.p.D(sb3, str, f22909v, false, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final Map L() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.f22911a);
        for (String next : parse.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParameters = parse.getQueryParameters(next);
            if (queryParameters.size() <= 1) {
                C6496s.g(queryParameters, "queryParams");
                String str = (String) C6565s.q0(queryParameters);
                if (str == null) {
                    this.f22919i = true;
                    str = next;
                }
                Matcher matcher = f22906s.matcher(str);
                d dVar = new d();
                int i10 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    C6496s.f(group, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(group);
                    C6496s.g(str, "queryParam");
                    String substring = str.substring(i10, matcher.start());
                    C6496s.g(substring, "substring(...)");
                    sb2.append(Pattern.quote(substring));
                    sb2.append("(.+?)?");
                    i10 = matcher.end();
                }
                if (i10 < str.length()) {
                    C6496s.g(str, "queryParam");
                    String substring2 = str.substring(i10);
                    C6496s.g(substring2, "substring(...)");
                    sb2.append(Pattern.quote(substring2));
                }
                String sb3 = sb2.toString();
                C6496s.g(sb3, "argRegex.toString()");
                dVar.d(Sg.p.D(sb3, f22908u, f22909v, false, 4, (Object) null));
                C6496s.g(next, "paramName");
                linkedHashMap.put(next, dVar);
            } else {
                throw new IllegalArgumentException(("Query parameter " + next + " must only be present once in " + this.f22911a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    private final void g(String str, List list, StringBuilder sb2) {
        Matcher matcher = f22906s.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            C6496s.f(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i10) {
                String substring = str.substring(i10, matcher.start());
                C6496s.g(substring, "substring(...)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append(f22910w);
            i10 = matcher.end();
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            C6496s.g(substring2, "substring(...)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    private final List k() {
        return (List) this.f22921k.getValue();
    }

    /* access modifiers changed from: private */
    public final Pair l() {
        return (Pair) this.f22920j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.f22923m.getValue();
    }

    /* access modifiers changed from: private */
    public final String n() {
        return (String) this.f22922l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map map) {
        Iterable iterable = this.f22914d;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i11));
            C2137h hVar = (C2137h) map.get(str);
            try {
                C6496s.g(decode, "value");
                F(bundle, str, decode, hVar);
                arrayList.add(C6514M.f71813a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : x().entrySet()) {
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (this.f22919i && (query = uri.getQuery()) != null && !C6496s.c(query, uri.toString())) {
                queryParameters = C6565s.e(query);
            }
            C6496s.g(queryParameters, "inputParams");
            if (!I(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map map) {
        Matcher matcher;
        Pattern m10 = m();
        if (m10 != null) {
            matcher = m10.matcher(String.valueOf(str));
        } else {
            matcher = null;
        }
        if (matcher != null && matcher.matches()) {
            Iterable k10 = k();
            ArrayList arrayList = new ArrayList(C6565s.y(k10, 10));
            int i10 = 0;
            for (Object next : k10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                String str2 = (String) next;
                String decode = Uri.decode(matcher.group(i11));
                C2137h hVar = (C2137h) map.get(str2);
                try {
                    C6496s.g(decode, "value");
                    F(bundle, str2, decode, hVar);
                    arrayList.add(C6514M.f71813a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.f22925o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f22916f.getValue();
    }

    private final Map x() {
        return (Map) this.f22918h.getValue();
    }

    public final boolean E(r rVar) {
        C6496s.h(rVar, "deepLinkRequest");
        if (!D(rVar.c()) || !B(rVar.a()) || !C(rVar.b())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!C6496s.c(this.f22911a, pVar.f22911a) || !C6496s.c(this.f22912b, pVar.f22912b) || !C6496s.c(this.f22913c, pVar.f22913c)) {
            return false;
        }
        return true;
    }

    public final int h(Uri uri) {
        if (uri == null || this.f22911a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f22911a).getPathSegments();
        C6496s.g(pathSegments, "requestedPathSegments");
        C6496s.g(pathSegments2, "uriPathSegments");
        return C6565s.t0(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f22911a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        String str2 = this.f22912b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22913c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String i() {
        return this.f22912b;
    }

    public final List j() {
        Collection collection = this.f22914d;
        ArrayList arrayList = new ArrayList();
        for (d b10 : x().values()) {
            C6565s.D(arrayList, b10.b());
        }
        return C6565s.K0(C6565s.K0(collection, arrayList), k());
    }

    public final Bundle o(Uri uri, Map map) {
        Matcher matcher;
        C6496s.h(uri, "deepLink");
        C6496s.h(map, "arguments");
        Pattern w10 = w();
        if (w10 != null) {
            matcher = w10.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, map)) {
            return null;
        }
        if (A() && !r(uri, bundle, map)) {
            return null;
        }
        s(uri.getFragment(), bundle, map);
        if (!j.a(map, new i(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle p(Uri uri, Map map) {
        Matcher matcher;
        C6496s.h(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w10 = w();
        if (w10 != null) {
            matcher = w10.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, map);
        if (A()) {
            r(uri, bundle, map);
        }
        return bundle;
    }

    public final String t() {
        return this.f22913c;
    }

    public final int u(String str) {
        C6496s.h(str, "mimeType");
        if (this.f22913c != null) {
            Pattern v10 = v();
            C6496s.e(v10);
            if (v10.matcher(str).matches()) {
                return new c(this.f22913c).compareTo(new c(str));
            }
        }
        return -1;
    }

    public final String y() {
        return this.f22911a;
    }

    public final boolean z() {
        return this.f22926p;
    }
}
