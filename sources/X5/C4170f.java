package x5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.amazon.a.a.o.b;
import com.facebook.react.uimanager.i0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

/* renamed from: x5.f  reason: case insensitive filesystem */
public final class C4170f {

    /* renamed from: a  reason: collision with root package name */
    public static final C4170f f49471a = new C4170f();

    /* renamed from: b  reason: collision with root package name */
    private static final String f49472b = C4170f.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference f49473c = new WeakReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private static Method f49474d;

    private C4170f() {
    }

    public static final View a(View view) {
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f49471a.q(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
        return null;
    }

    public static final List b(View view) {
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004a A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(android.view.View r5) {
        /*
            java.lang.Class<x5.f> r0 = x5.C4170f.class
            boolean r1 = t7.C4049a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C6496s.h(r5, r1)     // Catch:{ all -> 0x0044 }
            boolean r1 = r5 instanceof android.widget.ImageView     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0015
            r1 = 2
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            boolean r3 = r5.isClickable()     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x001e
            r1 = r1 | 32
        L_0x001e:
            boolean r3 = o(r5)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0026
            r1 = r1 | 512(0x200, float:7.175E-43)
        L_0x0026:
            boolean r3 = r5 instanceof android.widget.TextView     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x004d
            r3 = r1 | 1025(0x401, float:1.436E-42)
            boolean r4 = r5 instanceof android.widget.Button     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0042
            r3 = r1 | 1029(0x405, float:1.442E-42)
            boolean r4 = r5 instanceof android.widget.Switch     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0039
            r1 = r1 | 9221(0x2405, float:1.2921E-41)
            goto L_0x0046
        L_0x0039:
            boolean r4 = r5 instanceof android.widget.CheckBox     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0042
            r3 = 33797(0x8405, float:4.736E-41)
            r1 = r1 | r3
            goto L_0x0046
        L_0x0042:
            r1 = r3
            goto L_0x0046
        L_0x0044:
            r5 = move-exception
            goto L_0x007f
        L_0x0046:
            boolean r5 = r5 instanceof android.widget.EditText     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x007e
            r1 = r1 | 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x004d:
            boolean r3 = r5 instanceof android.widget.Spinner     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x007c
            boolean r3 = r5 instanceof android.widget.DatePicker     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0056
            goto L_0x007c
        L_0x0056:
            boolean r3 = r5 instanceof android.widget.RatingBar     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x005e
            r5 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r5
            goto L_0x007e
        L_0x005e:
            boolean r3 = r5 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0065
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L_0x007e
        L_0x0065:
            boolean r3 = r5 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x007e
            x5.f r3 = f49471a     // Catch:{ all -> 0x0044 }
            java.lang.ref.WeakReference r4 = f49473c     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0044 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x0044 }
            boolean r5 = r3.p(r5, r4)     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x007e
            r1 = r1 | 64
            goto L_0x007e
        L_0x007c:
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L_0x007e:
            return r1
        L_0x007f:
            t7.C4049a.b(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.C4170f.c(android.view.View):int");
    }

    public static final JSONObject d(View view) {
        JSONObject jSONObject;
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(view, "view");
            if (C6496s.c(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f49473c = new WeakReference(view);
            }
            jSONObject = new JSONObject();
            s(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List b10 = b(view);
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                jSONArray.put(d((View) b10.get(i10)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e10) {
            Log.e(f49472b, "Failed to create JSONObject for view.", e10);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
        return jSONObject;
    }

    private final JSONObject e(View view) {
        JSONObject jSONObject;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put(VerticalAlignment.TOP, view.getTop());
            jSONObject.put(BlockAlignment.LEFT, view.getLeft());
            jSONObject.put(Snapshot.WIDTH, view.getWidth());
            jSONObject.put(Snapshot.HEIGHT, view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e10) {
            Log.e(f49472b, "Failed to create JSONObject for dimension.", e10);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
        return jSONObject;
    }

    private final Class f(String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            C6496s.f(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        Field declaredField;
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            C6496s.f(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
            return (View.OnTouchListener) obj2;
        } catch (NoSuchFieldException e10) {
            W.k0(f49472b, e10);
        } catch (ClassNotFoundException e11) {
            W.k0(f49472b, e11);
        } catch (IllegalAccessException e12) {
            W.k0(f49472b, e12);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
        return null;
    }

    public static final String i(View view) {
        CharSequence charSequence;
        String obj;
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null || (obj = charSequence.toString()) == null) {
                return "";
            }
            return obj;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final String k(View view) {
        Object obj;
        String obj2;
        Object selectedItem;
        String str;
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                obj = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    obj = str;
                }
            } else {
                if (view instanceof Spinner) {
                    if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                        obj = selectedItem.toString();
                    }
                } else if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    U u10 = U.f71764a;
                    obj = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    C6496s.g(obj, "format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    C6496s.g(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    C6496s.g(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    U u11 = U.f71764a;
                    obj = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                    C6496s.g(obj, "format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = ((RadioGroup) view).getChildAt(i10);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            obj = ((RadioButton) childAt).getText();
                            break;
                        }
                        i10++;
                    }
                } else if (view instanceof RatingBar) {
                    obj = String.valueOf(((RatingBar) view).getRating());
                }
                obj = null;
            }
            if (obj == null || (obj2 = obj.toString()) == null) {
                return "";
            }
            return obj2;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f49474d;
            if (!(method == null || view == null)) {
                if (method != null) {
                    Object invoke = method.invoke((Object) null, new Object[]{fArr, view});
                    C6496s.f(invoke, "null cannot be cast to non-null type android.view.View");
                    View view2 = (View) invoke;
                    if (view2.getId() > 0) {
                        ViewParent parent = view2.getParent();
                        C6496s.f(parent, "null cannot be cast to non-null type android.view.View");
                        return (View) parent;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } catch (IllegalAccessException e10) {
            W.k0(f49472b, e10);
        } catch (InvocationTargetException e11) {
            W.k0(f49472b, e11);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
        return null;
    }

    private final float[] m(View view) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final void n() {
        if (!C4049a.d(this)) {
            try {
                if (f49474d == null) {
                    Class<i0> cls = i0.class;
                    int i10 = i0.f41686e;
                    Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                    f49474d = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            } catch (ClassNotFoundException e10) {
                W.k0(f49472b, e10);
            } catch (NoSuchMethodException e11) {
                W.k0(f49472b, e11);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private static final boolean o(View view) {
        Class<C4170f> cls = C4170f.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            C4170f fVar = f49471a;
            Class f10 = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (f10 != null && f10.isInstance(parent)) {
                return true;
            }
            Class f11 = fVar.f("androidx.core.view.NestedScrollingChild");
            if (f11 == null || !f11.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final boolean q(View view) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            return C6496s.c(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(android.view.View r5, android.view.View.OnClickListener r6) {
        /*
            java.lang.Class<x5.f> r0 = x5.C4170f.class
            boolean r1 = t7.C4049a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C6496s.h(r5, r1)     // Catch:{ all -> 0x0028 }
            r1 = 0
            java.lang.String r2 = "android.view.View"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x002a }
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x002a }
            java.lang.String r3 = "android.view.View$ListenerInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x002b }
            java.lang.String r4 = "mOnClickListener"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x002b }
            goto L_0x002c
        L_0x0028:
            r5 = move-exception
            goto L_0x004d
        L_0x002a:
            r2 = r1
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r2 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            r4 = 1
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x004c }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x004c }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x003f }
            java.lang.Object r1 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x003f }
        L_0x003f:
            if (r1 != 0) goto L_0x0045
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004c }
            return
        L_0x0045:
            r3.set(r1, r6)     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x0049:
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            return
        L_0x004d:
            t7.C4049a.b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.C4170f.r(android.view.View, android.view.View$OnClickListener):void");
    }

    public static final void s(View view, JSONObject jSONObject) {
        Class<C4170f> cls = C4170f.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(view, "view");
                C6496s.h(jSONObject, "json");
                String k10 = k(view);
                String i10 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (!C4168d.g(view)) {
                    jSONObject.put(AttributeType.TEXT, W.k(W.J0(k10), ""));
                } else {
                    jSONObject.put(AttributeType.TEXT, "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", W.k(W.J0(i10), ""));
                if (tag != null) {
                    jSONObject.put("tag", W.k(W.J0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put(b.f37480c, W.k(W.J0(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", f49471a.e(view));
            } catch (JSONException e10) {
                W.k0(f49472b, e10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final boolean p(View view, View view2) {
        View l10;
        if (C4049a.d(this)) {
            return false;
        }
        try {
            C6496s.h(view, "view");
            if (!C6496s.c(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (l10 = l(m(view), view2)) == null || l10.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}
