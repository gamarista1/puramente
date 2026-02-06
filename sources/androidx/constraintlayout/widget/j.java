package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class j {

    /* renamed from: a  reason: collision with root package name */
    int f15673a = -1;

    /* renamed from: b  reason: collision with root package name */
    int f15674b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f15675c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f15676d = new SparseArray();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f15677a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f15678b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        int f15679c = -1;

        /* renamed from: d  reason: collision with root package name */
        boolean f15680d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f15680d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15497i8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15508j8) {
                    this.f15677a = obtainStyledAttributes.getResourceId(index, this.f15677a);
                } else if (index == h.f15519k8) {
                    this.f15679c = obtainStyledAttributes.getResourceId(index, this.f15679c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f15679c);
                    context.getResources().getResourceName(this.f15679c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f15680d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f15678b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f15678b.size(); i10++) {
                if (((b) this.f15678b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f15681a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f15682b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f15683c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f15684d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f15685e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f15686f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f15686f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15279N8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15289O8) {
                    this.f15685e = obtainStyledAttributes.getResourceId(index, this.f15685e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f15685e);
                    context.getResources().getResourceName(this.f15685e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f15686f = true;
                    }
                } else if (index == h.f15299P8) {
                    this.f15684d = obtainStyledAttributes.getDimension(index, this.f15684d);
                } else if (index == h.f15309Q8) {
                    this.f15682b = obtainStyledAttributes.getDimension(index, this.f15682b);
                } else if (index == h.f15319R8) {
                    this.f15683c = obtainStyledAttributes.getDimension(index, this.f15683c);
                } else if (index == h.f15329S8) {
                    this.f15681a = obtainStyledAttributes.getDimension(index, this.f15681a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f15681a) && f10 < this.f15681a) {
                return false;
            }
            if (!Float.isNaN(this.f15682b) && f11 < this.f15682b) {
                return false;
            }
            if (!Float.isNaN(this.f15683c) && f10 > this.f15683c) {
                return false;
            }
            if (Float.isNaN(this.f15684d) || f11 <= this.f15684d) {
                return true;
            }
            return false;
        }
    }

    public j(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.Context r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintLayoutStates"
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = androidx.constraintlayout.widget.h.f15530l8
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r2, r3)
            int r3 = r2.getIndexCount()
            r4 = 0
            r5 = r4
        L_0x0014:
            if (r5 >= r3) goto L_0x0029
            int r6 = r2.getIndex(r5)
            int r7 = androidx.constraintlayout.widget.h.f15540m8
            if (r6 != r7) goto L_0x0026
            int r7 = r10.f15673a
            int r6 = r2.getResourceId(r6, r7)
            r10.f15673a = r6
        L_0x0026:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x0029:
            r2.recycle()
            int r2 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            r3 = 0
        L_0x0031:
            r5 = 1
            if (r2 == r5) goto L_0x00a7
            java.lang.String r6 = "StateSet"
            r7 = 3
            r8 = 2
            if (r2 == r8) goto L_0x004d
            if (r2 == r7) goto L_0x003e
            goto L_0x009b
        L_0x003e:
            java.lang.String r2 = r12.getName()     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            boolean r2 = r6.equals(r2)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            if (r2 == 0) goto L_0x009b
            return
        L_0x0049:
            r11 = move-exception
            goto L_0x00a0
        L_0x004b:
            r11 = move-exception
            goto L_0x00a4
        L_0x004d:
            java.lang.String r2 = r12.getName()     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            int r9 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            switch(r9) {
                case 80204913: goto L_0x0074;
                case 1301459538: goto L_0x006a;
                case 1382829617: goto L_0x0063;
                case 1901439077: goto L_0x0059;
                default: goto L_0x0058;
            }     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
        L_0x0058:
            goto L_0x007e
        L_0x0059:
            java.lang.String r5 = "Variant"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            if (r2 == 0) goto L_0x007e
            r5 = r7
            goto L_0x007f
        L_0x0063:
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x006a:
            java.lang.String r5 = "LayoutDescription"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            if (r2 == 0) goto L_0x007e
            r5 = r4
            goto L_0x007f
        L_0x0074:
            java.lang.String r5 = "State"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            if (r2 == 0) goto L_0x007e
            r5 = r8
            goto L_0x007f
        L_0x007e:
            r5 = -1
        L_0x007f:
            if (r5 == r8) goto L_0x008f
            if (r5 == r7) goto L_0x0084
            goto L_0x009b
        L_0x0084:
            androidx.constraintlayout.widget.j$b r2 = new androidx.constraintlayout.widget.j$b     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            if (r3 == 0) goto L_0x009b
            r3.a(r2)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            goto L_0x009b
        L_0x008f:
            androidx.constraintlayout.widget.j$a r3 = new androidx.constraintlayout.widget.j$a     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            r3.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            android.util.SparseArray r2 = r10.f15676d     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            int r5 = r3.f15677a     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            r2.put(r5, r3)     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
        L_0x009b:
            int r2 = r12.next()     // Catch:{ XmlPullParserException -> 0x004b, IOException -> 0x0049 }
            goto L_0x0031
        L_0x00a0:
            android.util.Log.e(r1, r0, r11)
            goto L_0x00a7
        L_0x00a4:
            android.util.Log.e(r1, r0, r11)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.j.b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = (a) this.f15676d.get(i11);
        if (aVar == null) {
            return i11;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            Iterator it = aVar.f15678b.iterator();
            b bVar = null;
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                if (bVar2.a(f10, f11)) {
                    if (i10 == bVar2.f15685e) {
                        return i10;
                    }
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                return bVar.f15685e;
            }
            return aVar.f15679c;
        } else if (aVar.f15679c == i10) {
            return i10;
        } else {
            Iterator it2 = aVar.f15678b.iterator();
            while (it2.hasNext()) {
                if (i10 == ((b) it2.next()).f15685e) {
                    return i10;
                }
            }
            return aVar.f15679c;
        }
    }

    public int c(int i10, int i11, int i12) {
        return d(-1, i10, (float) i11, (float) i12);
    }

    public int d(int i10, int i11, float f10, float f11) {
        a aVar;
        int b10;
        if (i10 == i11) {
            if (i11 == -1) {
                aVar = (a) this.f15676d.valueAt(0);
            } else {
                aVar = (a) this.f15676d.get(this.f15674b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f15675c != -1 && ((b) aVar.f15678b.get(i10)).a(f10, f11)) || i10 == (b10 = aVar.b(f10, f11))) {
                return i10;
            }
            if (b10 == -1) {
                return aVar.f15679c;
            }
            return ((b) aVar.f15678b.get(b10)).f15685e;
        }
        a aVar2 = (a) this.f15676d.get(i11);
        if (aVar2 == null) {
            return -1;
        }
        int b11 = aVar2.b(f10, f11);
        if (b11 == -1) {
            return aVar2.f15679c;
        }
        return ((b) aVar2.f15678b.get(b11)).f15685e;
    }
}
