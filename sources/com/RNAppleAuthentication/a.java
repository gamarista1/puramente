package com.RNAppleAuthentication;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36587a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36588b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36589c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36590d;

    /* renamed from: e  reason: collision with root package name */
    private final String f36591e;

    /* renamed from: f  reason: collision with root package name */
    private final String f36592f;

    /* renamed from: g  reason: collision with root package name */
    private final String f36593g;

    /* renamed from: com.RNAppleAuthentication.a$a  reason: collision with other inner class name */
    public static final class C0596a {

        /* renamed from: a  reason: collision with root package name */
        private String f36594a;

        /* renamed from: b  reason: collision with root package name */
        private String f36595b;

        /* renamed from: c  reason: collision with root package name */
        private String f36596c;

        /* renamed from: d  reason: collision with root package name */
        private String f36597d;

        /* renamed from: e  reason: collision with root package name */
        private String f36598e;

        /* renamed from: f  reason: collision with root package name */
        private String f36599f;

        /* renamed from: g  reason: collision with root package name */
        private String f36600g;

        public final a a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8 = this.f36594a;
            if (str8 == null) {
                C6496s.v("clientId");
                str = null;
            } else {
                str = str8;
            }
            String str9 = this.f36595b;
            if (str9 == null) {
                C6496s.v("redirectUri");
                str2 = null;
            } else {
                str2 = str9;
            }
            String str10 = this.f36596c;
            if (str10 == null) {
                C6496s.v("scope");
                str3 = null;
            } else {
                str3 = str10;
            }
            String str11 = this.f36597d;
            if (str11 == null) {
                C6496s.v("responseType");
                str4 = null;
            } else {
                str4 = str11;
            }
            String str12 = this.f36598e;
            if (str12 == null) {
                C6496s.v("state");
                str5 = null;
            } else {
                str5 = str12;
            }
            String str13 = this.f36599f;
            if (str13 == null) {
                C6496s.v("rawNonce");
                str6 = null;
            } else {
                str6 = str13;
            }
            String str14 = this.f36600g;
            if (str14 == null) {
                C6496s.v("nonce");
                str7 = null;
            } else {
                str7 = str14;
            }
            return new a(str, str2, str3, str4, str5, str6, str7, (DefaultConstructorMarker) null);
        }

        public final C0596a b(String str) {
            C6496s.h(str, "clientId");
            this.f36594a = str;
            return this;
        }

        public final C0596a c(String str) {
            C6496s.h(str, "nonce");
            this.f36600g = str;
            return this;
        }

        public final C0596a d(String str) {
            C6496s.h(str, "rawNonce");
            this.f36599f = str;
            return this;
        }

        public final C0596a e(String str) {
            C6496s.h(str, "redirectUri");
            this.f36595b = str;
            return this;
        }

        public final C0596a f(b bVar) {
            C6496s.h(bVar, "type");
            this.f36597d = bVar.b();
            return this;
        }

        public final C0596a g(c cVar) {
            C6496s.h(cVar, "scope");
            this.f36596c = cVar.b();
            return this;
        }

        public final C0596a h(String str) {
            C6496s.h(str, "state");
            this.f36598e = str;
            return this;
        }
    }

    public enum b {
        ;

        /* renamed from: com.RNAppleAuthentication.a$b$a  reason: collision with other inner class name */
        static final class C0597a extends b {
            C0597a(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public String b() {
                return "code id_token";
            }
        }

        /* renamed from: com.RNAppleAuthentication.a$b$b  reason: collision with other inner class name */
        static final class C0598b extends b {
            C0598b(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public String b() {
                return "code";
            }
        }

        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public String b() {
                return "id_token";
            }
        }

        static {
            b[] a10;
            f36605e = C6714a.a(a10);
        }

        public abstract String b();
    }

    public enum c {
        ;

        /* renamed from: com.RNAppleAuthentication.a$c$a  reason: collision with other inner class name */
        static final class C0599a extends c {
            C0599a(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public String b() {
                return "name email";
            }
        }

        static final class b extends c {
            b(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public String b() {
                return "email";
            }
        }

        /* renamed from: com.RNAppleAuthentication.a$c$c  reason: collision with other inner class name */
        static final class C0600c extends c {
            C0600c(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public String b() {
                return "name";
            }
        }

        static {
            c[] a10;
            f36610e = C6714a.a(a10);
        }

        public abstract String b();
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    public final String a() {
        return this.f36587a;
    }

    public final String b() {
        return this.f36593g;
    }

    public final String c() {
        return this.f36592f;
    }

    public final String d() {
        return this.f36588b;
    }

    public final String e() {
        return this.f36590d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C6496s.c(this.f36587a, aVar.f36587a) && C6496s.c(this.f36588b, aVar.f36588b) && C6496s.c(this.f36589c, aVar.f36589c) && C6496s.c(this.f36590d, aVar.f36590d) && C6496s.c(this.f36591e, aVar.f36591e) && C6496s.c(this.f36592f, aVar.f36592f) && C6496s.c(this.f36593g, aVar.f36593g);
    }

    public final String f() {
        return this.f36589c;
    }

    public final String g() {
        return this.f36591e;
    }

    public int hashCode() {
        return (((((((((((this.f36587a.hashCode() * 31) + this.f36588b.hashCode()) * 31) + this.f36589c.hashCode()) * 31) + this.f36590d.hashCode()) * 31) + this.f36591e.hashCode()) * 31) + this.f36592f.hashCode()) * 31) + this.f36593g.hashCode();
    }

    public String toString() {
        String str = this.f36587a;
        String str2 = this.f36588b;
        String str3 = this.f36589c;
        String str4 = this.f36590d;
        String str5 = this.f36591e;
        String str6 = this.f36592f;
        String str7 = this.f36593g;
        return "SignInWithAppleConfiguration(clientId=" + str + ", redirectUri=" + str2 + ", scope=" + str3 + ", responseType=" + str4 + ", state=" + str5 + ", rawNonce=" + str6 + ", nonce=" + str7 + ")";
    }

    private a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f36587a = str;
        this.f36588b = str2;
        this.f36589c = str3;
        this.f36590d = str4;
        this.f36591e = str5;
        this.f36592f = str6;
        this.f36593g = str7;
    }
}
