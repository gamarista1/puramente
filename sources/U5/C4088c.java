package u5;

import Sg.m;
import Sg.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;
import x5.C4170f;

/* renamed from: u5.c  reason: case insensitive filesystem */
public final class C4088c {

    /* renamed from: a  reason: collision with root package name */
    public static final C4088c f48586a = new C4088c();

    private C4088c() {
    }

    public static final List a(View view) {
        Class<C4088c> cls = C4088c.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup j10 = C4170f.j(view);
            if (j10 != null) {
                for (View view2 : C4170f.b(j10)) {
                    if (view != view2) {
                        arrayList.addAll(f48586a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:4|5|(1:7)|10|(1:12)|13|14|(2:16|(1:18))|19|20|(4:23|(2:27|35)|31|21)|32|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[Catch:{ all -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List b(android.view.View r6) {
        /*
            java.lang.Class<u5.c> r0 = u5.C4088c.class
            boolean r1 = t7.C4049a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C6496s.h(r6, r1)     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r1.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = x5.C4170f.i(r6)     // Catch:{ all -> 0x0029 }
            r1.add(r3)     // Catch:{ all -> 0x0029 }
            java.lang.Object r3 = r6.getTag()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x002c
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0029 }
            r1.add(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x002c
        L_0x0029:
            r6 = move-exception
            goto L_0x00a2
        L_0x002c:
            java.lang.CharSequence r3 = r6.getContentDescription()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0029 }
            r1.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x0039:
            int r3 = r6.getId()     // Catch:{ NotFoundException -> 0x0071 }
            r4 = -1
            if (r3 == r4) goto L_0x0071
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ NotFoundException -> 0x0071 }
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r6 = r3.getResourceName(r6)     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r3 = "resourceName"
            kotlin.jvm.internal.C6496s.g(r6, r3)     // Catch:{ NotFoundException -> 0x0071 }
            Sg.m r3 = new Sg.m     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String r4 = "/"
            r3.<init>((java.lang.String) r4)     // Catch:{ NotFoundException -> 0x0071 }
            r4 = 0
            java.util.List r6 = r3.g(r6, r4)     // Catch:{ NotFoundException -> 0x0071 }
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.Object[] r6 = r6.toArray(r3)     // Catch:{ NotFoundException -> 0x0071 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ NotFoundException -> 0x0071 }
            int r3 = r6.length     // Catch:{ NotFoundException -> 0x0071 }
            r4 = 2
            if (r3 != r4) goto L_0x0071
            r3 = 1
            r6 = r6[r3]     // Catch:{ NotFoundException -> 0x0071 }
            r1.add(r6)     // Catch:{ NotFoundException -> 0x0071 }
        L_0x0071:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0029 }
        L_0x007a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0029 }
            int r4 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r4 <= 0) goto L_0x007a
            int r4 = r3.length()     // Catch:{ all -> 0x0029 }
            r5 = 100
            if (r4 > r5) goto L_0x007a
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C6496s.g(r3, r4)     // Catch:{ all -> 0x0029 }
            r6.add(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x007a
        L_0x00a1:
            return r6
        L_0x00a2:
            t7.C4049a.b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.C4088c.b(android.view.View):java.util.List");
    }

    private final List c(View view) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            for (View c10 : C4170f.b(view)) {
                arrayList.addAll(c(c10));
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final boolean d(String str, List list) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (p.O(str, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public static final boolean e(List list, List list2) {
        Class<C4088c> cls = C4088c.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C6496s.h(list, "indicators");
            C6496s.h(list2, "keys");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (f48586a.d((String) it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean f(String str, String str2) {
        Class<C4088c> cls = C4088c.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C6496s.h(str, AttributeType.TEXT);
            C6496s.h(str2, "rule");
            return new m(str2).d(str);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }
}
