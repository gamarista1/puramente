package Sh;

import Ph.a;
import Ph.c;
import Sh.c;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Hashtable;
import java.util.StringTokenizer;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static final Class[] f65105e = new Class[0];

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f65106f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    static Hashtable f65107g;

    /* renamed from: h  reason: collision with root package name */
    private static Object[] f65108h = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    Class f65109a;

    /* renamed from: b  reason: collision with root package name */
    ClassLoader f65110b;

    /* renamed from: c  reason: collision with root package name */
    String f65111c;

    /* renamed from: d  reason: collision with root package name */
    int f65112d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f65107g = hashtable;
        hashtable.put("void", Void.TYPE);
        f65107g.put(AttributeType.BOOLEAN, Boolean.TYPE);
        f65107g.put("byte", Byte.TYPE);
        f65107g.put("char", Character.TYPE);
        f65107g.put("short", Short.TYPE);
        f65107g.put("int", Integer.TYPE);
        f65107g.put(Constants.LONG, Long.TYPE);
        f65107g.put(AttributeType.FLOAT, Float.TYPE);
        f65107g.put("double", Double.TYPE);
    }

    public b(String str, Class cls) {
        this.f65111c = str;
        this.f65109a = cls;
        this.f65110b = cls.getClassLoader();
    }

    static Class a(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f65107g.get(str);
        if (cls != null) {
            return cls;
        }
        if (classLoader != null) {
            return Class.forName(str, false, classLoader);
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    public static a b(a.C0949a aVar, Object obj, Object obj2) {
        return new c(aVar, obj, obj2, f65108h);
    }

    public static a c(a.C0949a aVar, Object obj, Object obj2, Object obj3) {
        return new c(aVar, obj, obj2, new Object[]{obj3});
    }

    public Qh.a d(String str, String str2, Class cls, String str3, String str4, String str5, String str6) {
        String str7 = str;
        int parseInt = Integer.parseInt(str, 16);
        String str8 = str3;
        StringTokenizer stringTokenizer = new StringTokenizer(str3, com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i10 = 0; i10 < countTokens; i10++) {
            clsArr[i10] = a(stringTokenizer.nextToken(), this.f65110b);
        }
        String str9 = str4;
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i11 = 0; i11 < countTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i12 = 0; i12 < countTokens3; i12++) {
            clsArr2[i12] = a(stringTokenizer3.nextToken(), this.f65110b);
        }
        return new e(parseInt, str2, cls, clsArr, strArr, clsArr2, a(str6, this.f65110b));
    }

    public Qh.a e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str3;
        return d(str, str2, a(str3, this.f65110b), str4, str5, str6, str7);
    }

    public a.C0949a f(String str, c cVar, int i10) {
        int i11 = this.f65112d;
        this.f65112d = i11 + 1;
        return new c.a(i11, str, cVar, g(i10, -1));
    }

    public Qh.b g(int i10, int i11) {
        return new g(this.f65109a, this.f65111c, i10);
    }
}
