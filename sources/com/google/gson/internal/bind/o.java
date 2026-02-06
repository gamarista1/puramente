package com.google.gson.internal.bind;

import Pc.H;
import Sc.a;
import Sc.b;
import Sc.c;
import com.google.gson.e;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class o {

    /* renamed from: A  reason: collision with root package name */
    public static final com.google.gson.t f58275A = new h();

    /* renamed from: B  reason: collision with root package name */
    public static final com.google.gson.t f58276B = new i();

    /* renamed from: C  reason: collision with root package name */
    public static final com.google.gson.u f58277C;

    /* renamed from: D  reason: collision with root package name */
    public static final com.google.gson.t f58278D;

    /* renamed from: E  reason: collision with root package name */
    public static final com.google.gson.u f58279E;

    /* renamed from: F  reason: collision with root package name */
    public static final com.google.gson.t f58280F;

    /* renamed from: G  reason: collision with root package name */
    public static final com.google.gson.u f58281G;

    /* renamed from: H  reason: collision with root package name */
    public static final com.google.gson.t f58282H;

    /* renamed from: I  reason: collision with root package name */
    public static final com.google.gson.u f58283I;

    /* renamed from: J  reason: collision with root package name */
    public static final com.google.gson.t f58284J;

    /* renamed from: K  reason: collision with root package name */
    public static final com.google.gson.u f58285K;

    /* renamed from: L  reason: collision with root package name */
    public static final com.google.gson.t f58286L;

    /* renamed from: M  reason: collision with root package name */
    public static final com.google.gson.u f58287M;

    /* renamed from: N  reason: collision with root package name */
    public static final com.google.gson.t f58288N;

    /* renamed from: O  reason: collision with root package name */
    public static final com.google.gson.u f58289O;

    /* renamed from: P  reason: collision with root package name */
    public static final com.google.gson.t f58290P;

    /* renamed from: Q  reason: collision with root package name */
    public static final com.google.gson.u f58291Q;

    /* renamed from: R  reason: collision with root package name */
    public static final com.google.gson.t f58292R;

    /* renamed from: S  reason: collision with root package name */
    public static final com.google.gson.u f58293S;

    /* renamed from: T  reason: collision with root package name */
    public static final com.google.gson.t f58294T;

    /* renamed from: U  reason: collision with root package name */
    public static final com.google.gson.u f58295U;

    /* renamed from: V  reason: collision with root package name */
    public static final com.google.gson.t f58296V;

    /* renamed from: W  reason: collision with root package name */
    public static final com.google.gson.u f58297W;

    /* renamed from: X  reason: collision with root package name */
    public static final com.google.gson.u f58298X = d.f58210d;

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.gson.t f58299a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.gson.u f58300b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.gson.t f58301c;

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.gson.u f58302d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.gson.t f58303e;

    /* renamed from: f  reason: collision with root package name */
    public static final com.google.gson.t f58304f = new A();

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.gson.u f58305g;

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.gson.t f58306h;

    /* renamed from: i  reason: collision with root package name */
    public static final com.google.gson.u f58307i;

    /* renamed from: j  reason: collision with root package name */
    public static final com.google.gson.t f58308j;

    /* renamed from: k  reason: collision with root package name */
    public static final com.google.gson.u f58309k;

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.gson.t f58310l;

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.gson.u f58311m;

    /* renamed from: n  reason: collision with root package name */
    public static final com.google.gson.t f58312n;

    /* renamed from: o  reason: collision with root package name */
    public static final com.google.gson.u f58313o;

    /* renamed from: p  reason: collision with root package name */
    public static final com.google.gson.t f58314p;

    /* renamed from: q  reason: collision with root package name */
    public static final com.google.gson.u f58315q;

    /* renamed from: r  reason: collision with root package name */
    public static final com.google.gson.t f58316r;

    /* renamed from: s  reason: collision with root package name */
    public static final com.google.gson.u f58317s;

    /* renamed from: t  reason: collision with root package name */
    public static final com.google.gson.t f58318t = new C4858b();

    /* renamed from: u  reason: collision with root package name */
    public static final com.google.gson.t f58319u = new C4859c();

    /* renamed from: v  reason: collision with root package name */
    public static final com.google.gson.t f58320v = new C4860d();

    /* renamed from: w  reason: collision with root package name */
    public static final com.google.gson.t f58321w;

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.gson.u f58322x;

    /* renamed from: y  reason: collision with root package name */
    public static final com.google.gson.t f58323y;

    /* renamed from: z  reason: collision with root package name */
    public static final com.google.gson.t f58324z = new g();

    class A extends com.google.gson.t {
        A() {
        }

        /* renamed from: a */
        public Boolean read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return Boolean.valueOf(aVar.B0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Boolean bool) {
            String str;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            cVar.P0(str);
        }
    }

    class B extends com.google.gson.t {
        B() {
        }

        /* renamed from: a */
        public Number read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                int g02 = aVar.g0();
                if (g02 <= 255 && g02 >= -128) {
                    return Byte.valueOf((byte) g02);
                }
                throw new com.google.gson.n("Lossy conversion from " + g02 + " to byte; at path " + aVar.F());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.T();
            } else {
                cVar.E0((long) number.byteValue());
            }
        }
    }

    class C extends com.google.gson.t {
        C() {
        }

        /* renamed from: a */
        public Number read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                int g02 = aVar.g0();
                if (g02 <= 65535 && g02 >= -32768) {
                    return Short.valueOf((short) g02);
                }
                throw new com.google.gson.n("Lossy conversion from " + g02 + " to short; at path " + aVar.F());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.T();
            } else {
                cVar.E0((long) number.shortValue());
            }
        }
    }

    class D extends com.google.gson.t {
        D() {
        }

        /* renamed from: a */
        public Number read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.g0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.T();
            } else {
                cVar.E0((long) number.intValue());
            }
        }
    }

    class E extends com.google.gson.t {
        E() {
        }

        /* renamed from: a */
        public AtomicInteger read(a aVar) {
            try {
                return new AtomicInteger(aVar.g0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, AtomicInteger atomicInteger) {
            cVar.E0((long) atomicInteger.get());
        }
    }

    class F extends com.google.gson.t {
        F() {
        }

        /* renamed from: a */
        public AtomicBoolean read(a aVar) {
            return new AtomicBoolean(aVar.V());
        }

        /* renamed from: b */
        public void write(c cVar, AtomicBoolean atomicBoolean) {
            cVar.R0(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$a  reason: case insensitive filesystem */
    class C4857a extends com.google.gson.t {
        C4857a() {
        }

        /* renamed from: a */
        public AtomicIntegerArray read(a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.M()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.g0()));
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.n((Throwable) e10);
                }
            }
            aVar.t();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: b */
        public void write(c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.n();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.E0((long) atomicIntegerArray.get(i10));
            }
            cVar.t();
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$b  reason: case insensitive filesystem */
    class C4858b extends com.google.gson.t {
        C4858b() {
        }

        /* renamed from: a */
        public Number read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return Long.valueOf(aVar.h0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.T();
            } else {
                cVar.E0(number.longValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$c  reason: case insensitive filesystem */
    class C4859c extends com.google.gson.t {
        C4859c() {
        }

        /* renamed from: a */
        public Number read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return Float.valueOf((float) aVar.f0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.T();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.L0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$d  reason: case insensitive filesystem */
    class C4860d extends com.google.gson.t {
        C4860d() {
        }

        /* renamed from: a */
        public Number read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return Double.valueOf(aVar.f0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.T();
            } else {
                cVar.B0(number.doubleValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$e  reason: case insensitive filesystem */
    class C4861e extends com.google.gson.t {
        C4861e() {
        }

        /* renamed from: a */
        public Character read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            String B02 = aVar.B0();
            if (B02.length() == 1) {
                return Character.valueOf(B02.charAt(0));
            }
            throw new com.google.gson.n("Expecting character, got: " + B02 + "; at " + aVar.F());
        }

        /* renamed from: b */
        public void write(c cVar, Character ch2) {
            String str;
            if (ch2 == null) {
                str = null;
            } else {
                str = String.valueOf(ch2);
            }
            cVar.P0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$f  reason: case insensitive filesystem */
    class C4862f extends com.google.gson.t {
        C4862f() {
        }

        /* renamed from: a */
        public String read(a aVar) {
            b I02 = aVar.I0();
            if (I02 == b.NULL) {
                aVar.t0();
                return null;
            } else if (I02 == b.BOOLEAN) {
                return Boolean.toString(aVar.V());
            } else {
                return aVar.B0();
            }
        }

        /* renamed from: b */
        public void write(c cVar, String str) {
            cVar.P0(str);
        }
    }

    class g extends com.google.gson.t {
        g() {
        }

        /* renamed from: a */
        public BigDecimal read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            String B02 = aVar.B0();
            try {
                return Pc.B.b(B02);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n("Failed parsing '" + B02 + "' as BigDecimal; at path " + aVar.F(), e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, BigDecimal bigDecimal) {
            cVar.L0(bigDecimal);
        }
    }

    class h extends com.google.gson.t {
        h() {
        }

        /* renamed from: a */
        public BigInteger read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            String B02 = aVar.B0();
            try {
                return Pc.B.c(B02);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.n("Failed parsing '" + B02 + "' as BigInteger; at path " + aVar.F(), e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, BigInteger bigInteger) {
            cVar.L0(bigInteger);
        }
    }

    class i extends com.google.gson.t {
        i() {
        }

        /* renamed from: a */
        public Pc.z read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return new Pc.z(aVar.B0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Pc.z zVar) {
            cVar.L0(zVar);
        }
    }

    class j extends com.google.gson.t {
        j() {
        }

        /* renamed from: a */
        public StringBuilder read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return new StringBuilder(aVar.B0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, StringBuilder sb2) {
            String str;
            if (sb2 == null) {
                str = null;
            } else {
                str = sb2.toString();
            }
            cVar.P0(str);
        }
    }

    class k extends com.google.gson.t {
        k() {
        }

        /* renamed from: a */
        public Class read(a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + H.a("java-lang-class-unsupported"));
        }

        /* renamed from: b */
        public void write(c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + H.a("java-lang-class-unsupported"));
        }
    }

    class l extends com.google.gson.t {
        l() {
        }

        /* renamed from: a */
        public StringBuffer read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return new StringBuffer(aVar.B0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, StringBuffer stringBuffer) {
            String str;
            if (stringBuffer == null) {
                str = null;
            } else {
                str = stringBuffer.toString();
            }
            cVar.P0(str);
        }
    }

    class m extends com.google.gson.t {
        m() {
        }

        /* renamed from: a */
        public URL read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            String B02 = aVar.B0();
            if (B02.equals("null")) {
                return null;
            }
            return new URL(B02);
        }

        /* renamed from: b */
        public void write(c cVar, URL url) {
            String str;
            if (url == null) {
                str = null;
            } else {
                str = url.toExternalForm();
            }
            cVar.P0(str);
        }
    }

    class n extends com.google.gson.t {
        n() {
        }

        /* renamed from: a */
        public URI read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                String B02 = aVar.B0();
                if (B02.equals("null")) {
                    return null;
                }
                return new URI(B02);
            } catch (URISyntaxException e10) {
                throw new com.google.gson.i((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, URI uri) {
            String str;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toASCIIString();
            }
            cVar.P0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.o$o  reason: collision with other inner class name */
    class C0865o extends com.google.gson.t {
        C0865o() {
        }

        /* renamed from: a */
        public InetAddress read(a aVar) {
            if (aVar.I0() != b.NULL) {
                return InetAddress.getByName(aVar.B0());
            }
            aVar.t0();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, InetAddress inetAddress) {
            String str;
            if (inetAddress == null) {
                str = null;
            } else {
                str = inetAddress.getHostAddress();
            }
            cVar.P0(str);
        }
    }

    class p extends com.google.gson.t {
        p() {
        }

        /* renamed from: a */
        public UUID read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            String B02 = aVar.B0();
            try {
                return UUID.fromString(B02);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.n("Failed parsing '" + B02 + "' as UUID; at path " + aVar.F(), e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, UUID uuid) {
            String str;
            if (uuid == null) {
                str = null;
            } else {
                str = uuid.toString();
            }
            cVar.P0(str);
        }
    }

    class q extends com.google.gson.t {
        q() {
        }

        /* renamed from: a */
        public Currency read(a aVar) {
            String B02 = aVar.B0();
            try {
                return Currency.getInstance(B02);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.n("Failed parsing '" + B02 + "' as Currency; at path " + aVar.F(), e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, Currency currency) {
            cVar.P0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.t {
        r() {
        }

        /* renamed from: a */
        public Calendar read(a aVar) {
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            aVar.f();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.I0() != b.END_OBJECT) {
                String j02 = aVar.j0();
                int g02 = aVar.g0();
                j02.hashCode();
                char c10 = 65535;
                switch (j02.hashCode()) {
                    case -1181204563:
                        if (j02.equals("dayOfMonth")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1074026988:
                        if (j02.equals("minute")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -906279820:
                        if (j02.equals("second")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 3704893:
                        if (j02.equals("year")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 104080000:
                        if (j02.equals("month")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 985252545:
                        if (j02.equals("hourOfDay")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        i12 = g02;
                        break;
                    case 1:
                        i14 = g02;
                        break;
                    case 2:
                        i15 = g02;
                        break;
                    case 3:
                        i10 = g02;
                        break;
                    case 4:
                        i11 = g02;
                        break;
                    case 5:
                        i13 = g02;
                        break;
                }
            }
            aVar.v();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        /* renamed from: b */
        public void write(c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.T();
                return;
            }
            cVar.o();
            cVar.M("year");
            cVar.E0((long) calendar.get(1));
            cVar.M("month");
            cVar.E0((long) calendar.get(2));
            cVar.M("dayOfMonth");
            cVar.E0((long) calendar.get(5));
            cVar.M("hourOfDay");
            cVar.E0((long) calendar.get(11));
            cVar.M("minute");
            cVar.E0((long) calendar.get(12));
            cVar.M("second");
            cVar.E0((long) calendar.get(13));
            cVar.v();
        }
    }

    class s extends com.google.gson.t {
        s() {
        }

        /* renamed from: a */
        public Locale read(a aVar) {
            String str;
            String str2;
            String str3 = null;
            if (aVar.I0() == b.NULL) {
                aVar.t0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.B0(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        /* renamed from: b */
        public void write(c cVar, Locale locale) {
            String str;
            if (locale == null) {
                str = null;
            } else {
                str = locale.toString();
            }
            cVar.P0(str);
        }
    }

    class t implements com.google.gson.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f58325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.gson.t f58326b;

        t(Class cls, com.google.gson.t tVar) {
            this.f58325a = cls;
            this.f58326b = tVar;
        }

        public com.google.gson.t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == this.f58325a) {
                return this.f58326b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f58325a.getName() + ",adapter=" + this.f58326b + "]";
        }
    }

    class u extends com.google.gson.t {
        u() {
        }

        /* renamed from: a */
        public BitSet read(a aVar) {
            BitSet bitSet = new BitSet();
            aVar.b();
            b I02 = aVar.I0();
            int i10 = 0;
            while (I02 != b.END_ARRAY) {
                int i11 = y.f58337a[I02.ordinal()];
                boolean z10 = true;
                if (i11 == 1 || i11 == 2) {
                    int g02 = aVar.g0();
                    if (g02 == 0) {
                        z10 = false;
                    } else if (g02 != 1) {
                        throw new com.google.gson.n("Invalid bitset value " + g02 + ", expected 0 or 1; at path " + aVar.F());
                    }
                } else if (i11 == 3) {
                    z10 = aVar.V();
                } else {
                    throw new com.google.gson.n("Invalid bitset value type: " + I02 + "; at path " + aVar.m());
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                I02 = aVar.I0();
            }
            aVar.t();
            return bitSet;
        }

        /* renamed from: b */
        public void write(c cVar, BitSet bitSet) {
            cVar.n();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.E0(bitSet.get(i10) ? 1 : 0);
            }
            cVar.t();
        }
    }

    class v implements com.google.gson.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f58327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f58328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.google.gson.t f58329c;

        v(Class cls, Class cls2, com.google.gson.t tVar) {
            this.f58327a = cls;
            this.f58328b = cls2;
            this.f58329c = tVar;
        }

        public com.google.gson.t create(e eVar, com.google.gson.reflect.a aVar) {
            Class rawType = aVar.getRawType();
            if (rawType == this.f58327a || rawType == this.f58328b) {
                return this.f58329c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f58328b.getName() + "+" + this.f58327a.getName() + ",adapter=" + this.f58329c + "]";
        }
    }

    class w implements com.google.gson.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f58330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f58331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.google.gson.t f58332c;

        w(Class cls, Class cls2, com.google.gson.t tVar) {
            this.f58330a = cls;
            this.f58331b = cls2;
            this.f58332c = tVar;
        }

        public com.google.gson.t create(e eVar, com.google.gson.reflect.a aVar) {
            Class rawType = aVar.getRawType();
            if (rawType == this.f58330a || rawType == this.f58331b) {
                return this.f58332c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f58330a.getName() + "+" + this.f58331b.getName() + ",adapter=" + this.f58332c + "]";
        }
    }

    class x implements com.google.gson.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f58333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.gson.t f58334b;

        class a extends com.google.gson.t {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f58335a;

            a(Class cls) {
                this.f58335a = cls;
            }

            public Object read(Sc.a aVar) {
                Object read = x.this.f58334b.read(aVar);
                if (read == null || this.f58335a.isInstance(read)) {
                    return read;
                }
                throw new com.google.gson.n("Expected a " + this.f58335a.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.F());
            }

            public void write(c cVar, Object obj) {
                x.this.f58334b.write(cVar, obj);
            }
        }

        x(Class cls, com.google.gson.t tVar) {
            this.f58333a = cls;
            this.f58334b = tVar;
        }

        public com.google.gson.t create(e eVar, com.google.gson.reflect.a aVar) {
            Class rawType = aVar.getRawType();
            if (!this.f58333a.isAssignableFrom(rawType)) {
                return null;
            }
            return new a(rawType);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f58333a.getName() + ",adapter=" + this.f58334b + "]";
        }
    }

    static /* synthetic */ class y {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58337a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                Sc.b[] r0 = Sc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58337a = r0
                Sc.b r1 = Sc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58337a     // Catch:{ NoSuchFieldError -> 0x001d }
                Sc.b r1 = Sc.b.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58337a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Sc.b r1 = Sc.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.o.y.<clinit>():void");
        }
    }

    class z extends com.google.gson.t {
        z() {
        }

        /* renamed from: a */
        public Boolean read(a aVar) {
            b I02 = aVar.I0();
            if (I02 == b.NULL) {
                aVar.t0();
                return null;
            } else if (I02 == b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.B0()));
            } else {
                return Boolean.valueOf(aVar.V());
            }
        }

        /* renamed from: b */
        public void write(c cVar, Boolean bool) {
            cVar.I0(bool);
        }
    }

    static {
        com.google.gson.t nullSafe = new k().nullSafe();
        f58299a = nullSafe;
        f58300b = a(Class.class, nullSafe);
        com.google.gson.t nullSafe2 = new u().nullSafe();
        f58301c = nullSafe2;
        f58302d = a(BitSet.class, nullSafe2);
        z zVar = new z();
        f58303e = zVar;
        f58305g = b(Boolean.TYPE, Boolean.class, zVar);
        B b10 = new B();
        f58306h = b10;
        f58307i = b(Byte.TYPE, Byte.class, b10);
        C c10 = new C();
        f58308j = c10;
        f58309k = b(Short.TYPE, Short.class, c10);
        D d10 = new D();
        f58310l = d10;
        f58311m = b(Integer.TYPE, Integer.class, d10);
        com.google.gson.t nullSafe3 = new E().nullSafe();
        f58312n = nullSafe3;
        f58313o = a(AtomicInteger.class, nullSafe3);
        com.google.gson.t nullSafe4 = new F().nullSafe();
        f58314p = nullSafe4;
        f58315q = a(AtomicBoolean.class, nullSafe4);
        com.google.gson.t nullSafe5 = new C4857a().nullSafe();
        f58316r = nullSafe5;
        f58317s = a(AtomicIntegerArray.class, nullSafe5);
        C4861e eVar = new C4861e();
        f58321w = eVar;
        f58322x = b(Character.TYPE, Character.class, eVar);
        C4862f fVar = new C4862f();
        f58323y = fVar;
        f58277C = a(String.class, fVar);
        j jVar = new j();
        f58278D = jVar;
        f58279E = a(StringBuilder.class, jVar);
        l lVar = new l();
        f58280F = lVar;
        f58281G = a(StringBuffer.class, lVar);
        m mVar = new m();
        f58282H = mVar;
        f58283I = a(URL.class, mVar);
        n nVar = new n();
        f58284J = nVar;
        f58285K = a(URI.class, nVar);
        C0865o oVar = new C0865o();
        f58286L = oVar;
        f58287M = d(InetAddress.class, oVar);
        p pVar = new p();
        f58288N = pVar;
        f58289O = a(UUID.class, pVar);
        com.google.gson.t nullSafe6 = new q().nullSafe();
        f58290P = nullSafe6;
        f58291Q = a(Currency.class, nullSafe6);
        r rVar = new r();
        f58292R = rVar;
        f58293S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f58294T = sVar;
        f58295U = a(Locale.class, sVar);
        f fVar2 = f.f58218a;
        f58296V = fVar2;
        f58297W = d(com.google.gson.h.class, fVar2);
    }

    public static com.google.gson.u a(Class cls, com.google.gson.t tVar) {
        return new t(cls, tVar);
    }

    public static com.google.gson.u b(Class cls, Class cls2, com.google.gson.t tVar) {
        return new v(cls, cls2, tVar);
    }

    public static com.google.gson.u c(Class cls, Class cls2, com.google.gson.t tVar) {
        return new w(cls, cls2, tVar);
    }

    public static com.google.gson.u d(Class cls, com.google.gson.t tVar) {
        return new x(cls, tVar);
    }
}
