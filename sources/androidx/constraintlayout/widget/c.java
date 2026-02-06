package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f14973a;

    /* renamed from: b  reason: collision with root package name */
    d f14974b;

    /* renamed from: c  reason: collision with root package name */
    int f14975c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f14976d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f14977e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f14978f = new SparseArray();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f14979a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f14980b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        int f14981c = -1;

        /* renamed from: d  reason: collision with root package name */
        d f14982d;

        a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15497i8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15508j8) {
                    this.f14979a = obtainStyledAttributes.getResourceId(index, this.f14979a);
                } else if (index == h.f15519k8) {
                    this.f14981c = obtainStyledAttributes.getResourceId(index, this.f14981c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f14981c);
                    context.getResources().getResourceName(this.f14981c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f14982d = dVar;
                        dVar.o(context, this.f14981c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f14980b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f14980b.size(); i10++) {
                if (((b) this.f14980b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f14983a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f14984b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f14985c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f14986d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f14987e = -1;

        /* renamed from: f  reason: collision with root package name */
        d f14988f;

        b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15279N8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15289O8) {
                    this.f14987e = obtainStyledAttributes.getResourceId(index, this.f14987e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f14987e);
                    context.getResources().getResourceName(this.f14987e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f14988f = dVar;
                        dVar.o(context, this.f14987e);
                    }
                } else if (index == h.f15299P8) {
                    this.f14986d = obtainStyledAttributes.getDimension(index, this.f14986d);
                } else if (index == h.f15309Q8) {
                    this.f14984b = obtainStyledAttributes.getDimension(index, this.f14984b);
                } else if (index == h.f15319R8) {
                    this.f14985c = obtainStyledAttributes.getDimension(index, this.f14985c);
                } else if (index == h.f15329S8) {
                    this.f14983a = obtainStyledAttributes.getDimension(index, this.f14983a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f14983a) && f10 < this.f14983a) {
                return false;
            }
            if (!Float.isNaN(this.f14984b) && f11 < this.f14984b) {
                return false;
            }
            if (!Float.isNaN(this.f14985c) && f10 > this.f14985c) {
                return false;
            }
            if (Float.isNaN(this.f14986d) || f11 <= this.f14986d) {
                return true;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f14973a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "ConstraintLayoutStates"
            android.content.res.Resources r2 = r11.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r12)
            int r3 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r4 = 0
        L_0x0011:
            r5 = 1
            if (r3 == r5) goto L_0x00ab
            r6 = 2
            if (r3 == r6) goto L_0x0019
            goto L_0x0081
        L_0x0019:
            java.lang.String r3 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            int r7 = r3.hashCode()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r8 = 4
            r9 = 3
            switch(r7) {
                case -1349929691: goto L_0x0053;
                case 80204913: goto L_0x0049;
                case 1382829617: goto L_0x0040;
                case 1657696882: goto L_0x0036;
                case 1901439077: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
        L_0x0026:
            goto L_0x005d
        L_0x0027:
            java.lang.String r5 = "Variant"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = r9
            goto L_0x005e
        L_0x0031:
            r11 = move-exception
            goto L_0x0086
        L_0x0033:
            r11 = move-exception
            goto L_0x0099
        L_0x0036:
            java.lang.String r5 = "layoutDescription"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = 0
            goto L_0x005e
        L_0x0040:
            java.lang.String r7 = "StateSet"
            boolean r3 = r3.equals(r7)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "State"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = r6
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "ConstraintSet"
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x005d
            r5 = r8
            goto L_0x005e
        L_0x005d:
            r5 = -1
        L_0x005e:
            if (r5 == r6) goto L_0x0074
            if (r5 == r9) goto L_0x0069
            if (r5 == r8) goto L_0x0065
            goto L_0x0081
        L_0x0065:
            r10.b(r11, r2)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            goto L_0x0081
        L_0x0069:
            androidx.constraintlayout.widget.c$b r3 = new androidx.constraintlayout.widget.c$b     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r3.<init>(r11, r2)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            if (r4 == 0) goto L_0x0081
            r4.a(r3)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            goto L_0x0081
        L_0x0074:
            androidx.constraintlayout.widget.c$a r3 = new androidx.constraintlayout.widget.c$a     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r3.<init>(r11, r2)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            android.util.SparseArray r4 = r10.f14977e     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            int r5 = r3.f14979a     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r4.put(r5, r3)     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            r4 = r3
        L_0x0081:
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0033, IOException -> 0x0031 }
            goto L_0x0011
        L_0x0086:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
            goto L_0x00ab
        L_0x0099:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i10;
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i11++;
            } else {
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.D(context, xmlPullParser);
                this.f14978f.put(i10, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i10, float f10, float f11) {
        d dVar;
        a aVar;
        int b10;
        d dVar2;
        int i11 = this.f14975c;
        if (i11 == i10) {
            if (i10 == -1) {
                aVar = (a) this.f14977e.valueAt(0);
            } else {
                aVar = (a) this.f14977e.get(i11);
            }
            int i12 = this.f14976d;
            if ((i12 == -1 || !((b) aVar.f14980b.get(i12)).a(f10, f11)) && this.f14976d != (b10 = aVar.b(f10, f11))) {
                if (b10 == -1) {
                    dVar2 = this.f14974b;
                } else {
                    dVar2 = ((b) aVar.f14980b.get(b10)).f14988f;
                }
                if (b10 != -1) {
                    int i13 = ((b) aVar.f14980b.get(b10)).f14987e;
                }
                if (dVar2 != null) {
                    this.f14976d = b10;
                    dVar2.i(this.f14973a);
                    return;
                }
                return;
            }
            return;
        }
        this.f14975c = i10;
        a aVar2 = (a) this.f14977e.get(i10);
        int b11 = aVar2.b(f10, f11);
        if (b11 == -1) {
            dVar = aVar2.f14982d;
        } else {
            dVar = ((b) aVar2.f14980b.get(b11)).f14988f;
        }
        if (b11 != -1) {
            int i14 = ((b) aVar2.f14980b.get(b11)).f14987e;
        }
        if (dVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.f14976d = b11;
        dVar.i(this.f14973a);
    }
}
