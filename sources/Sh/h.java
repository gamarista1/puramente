package Sh;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Modifier;

class h {

    /* renamed from: j  reason: collision with root package name */
    static h f65137j;

    /* renamed from: k  reason: collision with root package name */
    static h f65138k;

    /* renamed from: l  reason: collision with root package name */
    static h f65139l;

    /* renamed from: a  reason: collision with root package name */
    boolean f65140a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f65141b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f65142c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f65143d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f65144e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f65145f = true;

    /* renamed from: g  reason: collision with root package name */
    boolean f65146g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f65147h = true;

    /* renamed from: i  reason: collision with root package name */
    int f65148i;

    static {
        h hVar = new h();
        f65137j = hVar;
        hVar.f65140a = true;
        hVar.f65141b = false;
        hVar.f65142c = false;
        hVar.f65143d = false;
        hVar.f65144e = true;
        hVar.f65145f = false;
        hVar.f65146g = false;
        hVar.f65148i = 0;
        h hVar2 = new h();
        f65138k = hVar2;
        hVar2.f65140a = true;
        hVar2.f65141b = true;
        hVar2.f65142c = false;
        hVar2.f65143d = false;
        hVar2.f65144e = false;
        f65137j.f65148i = 1;
        h hVar3 = new h();
        f65139l = hVar3;
        hVar3.f65140a = false;
        hVar3.f65141b = true;
        hVar3.f65142c = false;
        hVar3.f65143d = true;
        hVar3.f65144e = false;
        hVar3.f65147h = false;
        hVar3.f65148i = 2;
    }

    h() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr != null) {
            if (this.f65141b) {
                stringBuffer.append("(");
                c(stringBuffer, clsArr);
                stringBuffer.append(")");
            } else if (clsArr.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (this.f65142c && clsArr != null && clsArr.length != 0) {
            stringBuffer.append(" throws ");
            c(stringBuffer, clsArr);
        }
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i10]));
        }
    }

    /* access modifiers changed from: package-private */
    public String d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* access modifiers changed from: package-private */
    public String e(int i10) {
        if (!this.f65143d) {
            return "";
        }
        String modifier = Modifier.toString(i10);
        if (modifier.length() == 0) {
            return "";
        }
        return modifier + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f65144e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f65140a);
    }

    /* access modifiers changed from: package-private */
    public String h(Class cls, String str, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            return h(componentType, componentType.getName(), z10) + "[]";
        } else if (z10) {
            return i(str).replace('$', '.');
        } else {
            return str.replace('$', '.');
        }
    }

    /* access modifiers changed from: package-private */
    public String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }
}
