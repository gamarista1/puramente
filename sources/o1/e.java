package o1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m1.C2188d;
import org.xmlpull.v1.XmlPullParser;

public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f24730a;

        public c(d[] dVarArr) {
            this.f24730a = dVarArr;
        }

        public d[] a() {
            return this.f24730a;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f24731a;

        /* renamed from: b  reason: collision with root package name */
        private final int f24732b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f24733c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24734d;

        /* renamed from: e  reason: collision with root package name */
        private final int f24735e;

        /* renamed from: f  reason: collision with root package name */
        private final int f24736f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f24731a = str;
            this.f24732b = i10;
            this.f24733c = z10;
            this.f24734d = str2;
            this.f24735e = i11;
            this.f24736f = i12;
        }

        public String a() {
            return this.f24731a;
        }

        public int b() {
            return this.f24736f;
        }

        public int c() {
            return this.f24735e;
        }

        public String d() {
            return this.f24734d;
        }

        public int e() {
            return this.f24732b;
        }

        public boolean f() {
            return this.f24733c;
        }
    }

    /* renamed from: o1.e$e  reason: collision with other inner class name */
    public static final class C0419e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final v1.e f24737a;

        /* renamed from: b  reason: collision with root package name */
        private final v1.e f24738b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24739c;

        /* renamed from: d  reason: collision with root package name */
        private final int f24740d;

        /* renamed from: e  reason: collision with root package name */
        private final String f24741e;

        public C0419e(v1.e eVar, v1.e eVar2, int i10, int i11, String str) {
            this.f24737a = eVar;
            this.f24738b = eVar2;
            this.f24740d = i10;
            this.f24739c = i11;
            this.f24741e = str;
        }

        public v1.e a() {
            return this.f24738b;
        }

        public int b() {
            return this.f24740d;
        }

        public v1.e c() {
            return this.f24737a;
        }

        public String d() {
            return this.f24741e;
        }

        public int e() {
            return this.f24739c;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static o1.e.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            o1.e$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.e.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):o1.e$b");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        Resources resources2 = resources;
        TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2188d.f23669h);
        String string = obtainAttributes.getString(C2188d.f23670i);
        String string2 = obtainAttributes.getString(C2188d.f23675n);
        String string3 = obtainAttributes.getString(C2188d.f23676o);
        String string4 = obtainAttributes.getString(C2188d.f23672k);
        int resourceId = obtainAttributes.getResourceId(C2188d.f23671j, 0);
        int integer = obtainAttributes.getInteger(C2188d.f23673l, 1);
        int integer2 = obtainAttributes.getInteger(C2188d.f23674m, 500);
        String string5 = obtainAttributes.getString(C2188d.f23677p);
        obtainAttributes.recycle();
        v1.e eVar = null;
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        List c10 = c(resources2, resourceId);
        if (string4 != null) {
            eVar = new v1.e(string, string2, string4, c10);
        }
        return new C0419e(new v1.e(string, string2, string3, c10), eVar, integer, integer2, string5);
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2188d.f23678q);
        if (obtainAttributes.hasValue(C2188d.f23687z)) {
            i10 = C2188d.f23687z;
        } else {
            i10 = C2188d.f23680s;
        }
        int i15 = obtainAttributes.getInt(i10, 400);
        if (obtainAttributes.hasValue(C2188d.f23685x)) {
            i11 = C2188d.f23685x;
        } else {
            i11 = C2188d.f23681t;
        }
        if (1 == obtainAttributes.getInt(i11, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obtainAttributes.hasValue(C2188d.f23645A)) {
            i12 = C2188d.f23645A;
        } else {
            i12 = C2188d.f23682u;
        }
        if (obtainAttributes.hasValue(C2188d.f23686y)) {
            i13 = C2188d.f23686y;
        } else {
            i13 = C2188d.f23683v;
        }
        String string = obtainAttributes.getString(i13);
        int i16 = obtainAttributes.getInt(i12, 0);
        if (obtainAttributes.hasValue(C2188d.f23684w)) {
            i14 = C2188d.f23684w;
        } else {
            i14 = C2188d.f23679r;
        }
        int resourceId = obtainAttributes.getResourceId(i14, 0);
        String string2 = obtainAttributes.getString(i14);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i15, z10, string, i16, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
