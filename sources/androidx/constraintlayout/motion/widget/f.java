package androidx.constraintlayout.motion.widget;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class f {

    /* renamed from: b  reason: collision with root package name */
    static HashMap f14556b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap f14557a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f14556b = hashMap;
        try {
            hashMap.put("KeyAttribute", d.class.getConstructor((Class[]) null));
            f14556b.put("KeyPosition", g.class.getConstructor((Class[]) null));
            f14556b.put("KeyCycle", e.class.getConstructor((Class[]) null));
            f14556b.put("KeyTimeCycle", i.class.getConstructor((Class[]) null));
            f14556b.put("KeyTrigger", j.class.getConstructor((Class[]) null));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public f() {
    }

    public void a(l lVar) {
        ArrayList arrayList = (ArrayList) this.f14557a.get(-1);
        if (arrayList != null) {
            lVar.b(arrayList);
        }
    }

    public void b(l lVar) {
        ArrayList arrayList = (ArrayList) this.f14557a.get(Integer.valueOf(lVar.f14657c));
        if (arrayList != null) {
            lVar.b(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f14557a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f(((ConstraintLayout.b) lVar.f14656b.getLayoutParams()).f14893c0)) {
                    lVar.a(cVar);
                }
            }
        }
    }

    public void c(c cVar) {
        if (!this.f14557a.containsKey(Integer.valueOf(cVar.f14513b))) {
            this.f14557a.put(Integer.valueOf(cVar.f14513b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f14557a.get(Integer.valueOf(cVar.f14513b));
        if (arrayList != null) {
            arrayList.add(cVar);
        }
    }

    public ArrayList d(int i10) {
        return (ArrayList) this.f14557a.get(Integer.valueOf(i10));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "KeyFrames"
            r8.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r8.f14557a = r2
            int r2 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r3 = 0
        L_0x0013:
            r4 = 1
            if (r2 == r4) goto L_0x00f8
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0031
            if (r2 == r5) goto L_0x001e
            goto L_0x00eb
        L_0x001e:
            java.lang.String r2 = "KeyFrameSet"
            java.lang.String r4 = r10.getName()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r2 == 0) goto L_0x00eb
            return
        L_0x002b:
            r9 = move-exception
            goto L_0x00f1
        L_0x002e:
            r9 = move-exception
            goto L_0x00f5
        L_0x0031:
            java.lang.String r2 = r10.getName()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            java.util.HashMap r7 = f14556b     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            boolean r7 = r7.containsKey(r2)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r7 == 0) goto L_0x00c8
            int r3 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r7 = 4
            switch(r3) {
                case -300573030: goto L_0x006e;
                case -298435811: goto L_0x0064;
                case 540053991: goto L_0x005a;
                case 1153397896: goto L_0x0050;
                case 1308496505: goto L_0x0046;
                default: goto L_0x0045;
            }     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
        L_0x0045:
            goto L_0x0078
        L_0x0046:
            java.lang.String r3 = "KeyTrigger"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r3 == 0) goto L_0x0078
            r3 = r7
            goto L_0x0079
        L_0x0050:
            java.lang.String r3 = "KeyPosition"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r3 == 0) goto L_0x0078
            r3 = r4
            goto L_0x0079
        L_0x005a:
            java.lang.String r3 = "KeyCycle"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r3 == 0) goto L_0x0078
            r3 = r6
            goto L_0x0079
        L_0x0064:
            java.lang.String r3 = "KeyAttribute"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r3 == 0) goto L_0x0078
            r3 = 0
            goto L_0x0079
        L_0x006e:
            java.lang.String r3 = "KeyTimeCycle"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r3 == 0) goto L_0x0078
            r3 = r5
            goto L_0x0079
        L_0x0078:
            r3 = -1
        L_0x0079:
            if (r3 == 0) goto L_0x00b7
            if (r3 == r4) goto L_0x00b1
            if (r3 == r6) goto L_0x00ab
            if (r3 == r5) goto L_0x00a5
            if (r3 != r7) goto L_0x0089
            androidx.constraintlayout.motion.widget.j r2 = new androidx.constraintlayout.motion.widget.j     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            goto L_0x00bc
        L_0x0089:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r10.<init>()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            java.lang.String r3 = "Key "
            r10.append(r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r10.append(r2)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            java.lang.String r2 = " not found"
            r10.append(r2)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            java.lang.String r10 = r10.toString()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            throw r9     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
        L_0x00a5:
            androidx.constraintlayout.motion.widget.i r2 = new androidx.constraintlayout.motion.widget.i     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            goto L_0x00bc
        L_0x00ab:
            androidx.constraintlayout.motion.widget.e r2 = new androidx.constraintlayout.motion.widget.e     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            goto L_0x00bc
        L_0x00b1:
            androidx.constraintlayout.motion.widget.g r2 = new androidx.constraintlayout.motion.widget.g     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            goto L_0x00bc
        L_0x00b7:
            androidx.constraintlayout.motion.widget.d r2 = new androidx.constraintlayout.motion.widget.d     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
        L_0x00bc:
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r10)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r2.e(r9, r3)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r8.c(r2)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            r3 = r2
            goto L_0x00eb
        L_0x00c8:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r4 == 0) goto L_0x00da
            if (r3 == 0) goto L_0x00eb
            java.util.HashMap r2 = r3.f14516e     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r2 == 0) goto L_0x00eb
            androidx.constraintlayout.widget.a.i(r9, r10, r2)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            goto L_0x00eb
        L_0x00da:
            java.lang.String r4 = "CustomMethod"
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r2 == 0) goto L_0x00eb
            if (r3 == 0) goto L_0x00eb
            java.util.HashMap r2 = r3.f14516e     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            if (r2 == 0) goto L_0x00eb
            androidx.constraintlayout.widget.a.i(r9, r10, r2)     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
        L_0x00eb:
            int r2 = r10.next()     // Catch:{ XmlPullParserException -> 0x002e, IOException -> 0x002b }
            goto L_0x0013
        L_0x00f1:
            android.util.Log.e(r1, r0, r9)
            goto L_0x00f8
        L_0x00f5:
            android.util.Log.e(r1, r0, r9)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.f.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
