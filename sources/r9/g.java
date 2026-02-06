package R9;

import java.util.Collections;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f33788a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33789b;

    /* renamed from: c  reason: collision with root package name */
    public final List f33790c;

    /* renamed from: d  reason: collision with root package name */
    public final List f33791d;

    /* renamed from: e  reason: collision with root package name */
    public final e f33792e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, (e) null);
    }

    public int a(int i10) {
        int size = this.f33790c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f33790c.get(i11)).f33744b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List list, List list2, e eVar) {
        this.f33788a = str;
        this.f33789b = j10;
        this.f33790c = Collections.unmodifiableList(list);
        this.f33791d = Collections.unmodifiableList(list2);
        this.f33792e = eVar;
    }
}
