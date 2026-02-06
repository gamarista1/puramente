package x4;

import C4.i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x4.h  reason: case insensitive filesystem */
public class C4162h {

    /* renamed from: a  reason: collision with root package name */
    private final List f49386a;

    /* renamed from: b  reason: collision with root package name */
    private final List f49387b;

    /* renamed from: c  reason: collision with root package name */
    private final List f49388c;

    public C4162h(List list) {
        this.f49388c = list;
        this.f49386a = new ArrayList(list.size());
        this.f49387b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f49386a.add(((i) list.get(i10)).b().h());
            this.f49387b.add(((i) list.get(i10)).c().h());
        }
    }

    public List a() {
        return this.f49386a;
    }

    public List b() {
        return this.f49388c;
    }

    public List c() {
        return this.f49387b;
    }
}
