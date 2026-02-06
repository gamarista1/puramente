package Sh;

import Ph.a;
import Qh.b;
import java.util.Stack;

class c implements Ph.a {

    /* renamed from: a  reason: collision with root package name */
    Object f65113a;

    /* renamed from: b  reason: collision with root package name */
    Object f65114b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f65115c;

    /* renamed from: d  reason: collision with root package name */
    a.C0949a f65116d;

    /* renamed from: e  reason: collision with root package name */
    private Stack f65117e = null;

    static class a implements a.C0949a {

        /* renamed from: a  reason: collision with root package name */
        String f65118a;

        /* renamed from: b  reason: collision with root package name */
        Ph.c f65119b;

        /* renamed from: c  reason: collision with root package name */
        b f65120c;

        /* renamed from: d  reason: collision with root package name */
        private int f65121d;

        public a(int i10, String str, Ph.c cVar, b bVar) {
            this.f65118a = str;
            this.f65119b = cVar;
            this.f65120c = bVar;
            this.f65121d = i10;
        }

        public String a() {
            return this.f65118a;
        }

        public Ph.c b() {
            return this.f65119b;
        }

        /* access modifiers changed from: package-private */
        public String c(h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((f) b()).k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        public final String toString() {
            return c(h.f65138k);
        }
    }

    public c(a.C0949a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f65116d = aVar;
        this.f65113a = obj;
        this.f65114b = obj2;
        this.f65115c = objArr;
    }

    public Object a() {
        return this.f65114b;
    }

    public final String toString() {
        return this.f65116d.toString();
    }
}
