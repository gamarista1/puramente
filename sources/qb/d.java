package Qb;

import Lb.C4375i;
import Lb.l;
import Qb.e;
import com.google.firebase.database.a;

public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f52255a;

    /* renamed from: b  reason: collision with root package name */
    private final C4375i f52256b;

    /* renamed from: c  reason: collision with root package name */
    private final a f52257c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52258d;

    public d(e.a aVar, C4375i iVar, a aVar2, String str) {
        this.f52255a = aVar;
        this.f52256b = iVar;
        this.f52257c = aVar2;
        this.f52258d = str;
    }

    public void a() {
        this.f52256b.d(this);
    }

    public e.a b() {
        return this.f52255a;
    }

    public l c() {
        l m10 = this.f52257c.g().m();
        if (this.f52255a == e.a.VALUE) {
            return m10;
        }
        return m10.H();
    }

    public String d() {
        return this.f52258d;
    }

    public a e() {
        return this.f52257c;
    }

    public String toString() {
        if (this.f52255a == e.a.VALUE) {
            return c() + ": " + this.f52255a + ": " + this.f52257c.i(true);
        }
        return c() + ": " + this.f52255a + ": { " + this.f52257c.e() + ": " + this.f52257c.i(true) + " }";
    }
}
