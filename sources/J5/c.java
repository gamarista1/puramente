package J5;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;
import x5.C4170f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f32176a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final List f32177b = C6565s.q(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private c() {
    }

    public static final List a(View view) {
        Class<c> cls = c.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class isInstance : f32177b) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View a10 : C4170f.b(view)) {
                arrayList.addAll(a(a10));
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v3, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject b(android.view.View r5, android.view.View r6) {
        /*
            java.lang.Class<J5.c> r0 = J5.c.class
            boolean r1 = t7.C4049a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C6496s.h(r5, r1)     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = "clickedView"
            kotlin.jvm.internal.C6496s.h(r6, r1)     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            if (r5 != r6) goto L_0x0024
            java.lang.String r3 = "is_interacted"
            r4 = 1
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x004d }
            goto L_0x0024
        L_0x0022:
            r5 = move-exception
            goto L_0x004e
        L_0x0024:
            e(r5, r1)     // Catch:{ JSONException -> 0x004d }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004d }
            r3.<init>()     // Catch:{ JSONException -> 0x004d }
            java.util.List r5 = x5.C4170f.b(r5)     // Catch:{ JSONException -> 0x004d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x004d }
        L_0x0034:
            boolean r4 = r5.hasNext()     // Catch:{ JSONException -> 0x004d }
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r5.next()     // Catch:{ JSONException -> 0x004d }
            android.view.View r4 = (android.view.View) r4     // Catch:{ JSONException -> 0x004d }
            org.json.JSONObject r4 = b(r4, r6)     // Catch:{ JSONException -> 0x004d }
            r3.put(r4)     // Catch:{ JSONException -> 0x004d }
            goto L_0x0034
        L_0x0048:
            java.lang.String r5 = "childviews"
            r1.put(r5, r3)     // Catch:{ JSONException -> 0x004d }
        L_0x004d:
            return r1
        L_0x004e:
            t7.C4049a.b(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.c.b(android.view.View, android.view.View):org.json.JSONObject");
    }

    private final List c(View view) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C4170f.b(view)) {
                String k10 = C4170f.k(view2);
                if (k10.length() > 0) {
                    arrayList.add(k10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final String d(View view) {
        Class<c> cls = c.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(view, "hostView");
            String k10 = C4170f.k(view);
            if (k10.length() > 0) {
                return k10;
            }
            String join = TextUtils.join(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, f32176a.c(view));
            C6496s.g(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(view, "view");
                C6496s.h(jSONObject, "json");
                try {
                    String k10 = C4170f.k(view);
                    String i10 = C4170f.i(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", C4170f.c(view));
                    if (k10.length() > 0) {
                        jSONObject.put(AttributeType.TEXT, k10);
                    }
                    if (i10.length() > 0) {
                        jSONObject.put("hint", i10);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
