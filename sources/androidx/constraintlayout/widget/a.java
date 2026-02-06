package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14947a;

    /* renamed from: b  reason: collision with root package name */
    String f14948b;

    /* renamed from: c  reason: collision with root package name */
    private C0276a f14949c;

    /* renamed from: d  reason: collision with root package name */
    private int f14950d;

    /* renamed from: e  reason: collision with root package name */
    private float f14951e;

    /* renamed from: f  reason: collision with root package name */
    private String f14952f;

    /* renamed from: g  reason: collision with root package name */
    boolean f14953g;

    /* renamed from: h  reason: collision with root package name */
    private int f14954h;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    public enum C0276a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, C0276a aVar, Object obj, boolean z10) {
        this.f14948b = str;
        this.f14949c = aVar;
        this.f14947a = z10;
        k(obj);
    }

    public static HashMap b(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new a(aVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(view, (Object[]) null)));
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
        return hashMap2;
    }

    public static void i(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        C0276a aVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f15324S3);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0276a aVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == h.f15334T3) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == h.f15438d4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == h.f15344U3) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                aVar2 = C0276a.BOOLEAN_TYPE;
            } else {
                if (index == h.f15364W3) {
                    aVar = C0276a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.f15354V3) {
                    aVar = C0276a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.f15405a4) {
                    aVar = C0276a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == h.f15374X3) {
                    aVar = C0276a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.f15384Y3) {
                    aVar = C0276a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == h.f15394Z3) {
                    aVar = C0276a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == h.f15427c4) {
                    aVar = C0276a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == h.f15416b4) {
                    aVar = C0276a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                aVar2 = aVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, aVar2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void j(View view, HashMap hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str2);
            if (!aVar.f14947a) {
                str = "set" + str2;
            } else {
                str = str2;
            }
            try {
                switch (aVar.f14949c.ordinal()) {
                    case 0:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f14950d)});
                        break;
                    case 1:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f14951e)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f14954h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f14954h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f14952f});
                        break;
                    case 5:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f14953g)});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f14951e)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f14950d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e12);
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f14948b;
        if (!this.f14947a) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (this.f14949c.ordinal()) {
                case 0:
                case 7:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f14950d)});
                    return;
                case 1:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f14951e)});
                    return;
                case 2:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f14954h)});
                    return;
                case 3:
                    Method method = cls.getMethod(str, new Class[]{Drawable.class});
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f14954h);
                    method.invoke(view, new Object[]{colorDrawable});
                    return;
                case 4:
                    cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{this.f14952f});
                    return;
                case 5:
                    cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(this.f14953g)});
                    return;
                case 6:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f14951e)});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e10) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
        } catch (IllegalAccessException e11) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e11);
        } catch (InvocationTargetException e12) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e12);
        }
    }

    public String c() {
        return this.f14948b;
    }

    public C0276a d() {
        return this.f14949c;
    }

    public float e() {
        switch (this.f14949c.ordinal()) {
            case 0:
                return (float) this.f14950d;
            case 1:
            case 6:
                return this.f14951e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.f14953g) {
                    return 1.0f;
                }
                return 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        float f10;
        switch (this.f14949c.ordinal()) {
            case 0:
                fArr[0] = (float) this.f14950d;
                return;
            case 1:
                fArr[0] = this.f14951e;
                return;
            case 2:
            case 3:
                int i10 = this.f14954h;
                float pow = (float) Math.pow((double) (((float) ((i10 >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i10 >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i10 & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i10 >> 24) & 255)) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (this.f14953g) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[0] = f10;
                return;
            case 6:
                fArr[0] = this.f14951e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int ordinal = this.f14949c.ordinal();
        if (ordinal == 4 || ordinal == 5 || ordinal == 7) {
            return false;
        }
        return true;
    }

    public int h() {
        int ordinal = this.f14949c.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            return 4;
        }
        return 1;
    }

    public void k(Object obj) {
        switch (this.f14949c.ordinal()) {
            case 0:
            case 7:
                this.f14950d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f14951e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f14954h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f14952f = (String) obj;
                return;
            case 5:
                this.f14953g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f14951e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f14947a = false;
        this.f14948b = aVar.f14948b;
        this.f14949c = aVar.f14949c;
        k(obj);
    }
}
