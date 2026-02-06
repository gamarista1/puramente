package Jb;

import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List f51214a;

    /* renamed from: b  reason: collision with root package name */
    private final List f51215b;

    public a(List list, List list2) {
        if (list.size() == list2.size() - 1) {
            this.f51214a = list;
            this.f51215b = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public List a() {
        return Collections.unmodifiableList(this.f51215b);
    }

    public List b() {
        return Collections.unmodifiableList(this.f51214a);
    }
}
