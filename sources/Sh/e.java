package Sh;

import Qh.a;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

class e extends a implements a {

    /* renamed from: n  reason: collision with root package name */
    Class f65122n;

    e(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i10, str, cls, clsArr, strArr, clsArr2);
        this.f65122n = cls2;
    }

    /* access modifiers changed from: protected */
    public String a(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.e(i()));
        if (hVar.f65141b) {
            stringBuffer.append(hVar.g(n()));
        }
        if (hVar.f65141b) {
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        stringBuffer.append(hVar.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        hVar.a(stringBuffer, m());
        hVar.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.f65122n == null) {
            this.f65122n = d(6);
        }
        return this.f65122n;
    }
}
