package Uh;

import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private List f65420a = new ArrayList();

    public void a(b bVar) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(b());
            this.f65420a = arrayList;
            arrayList.add(bVar);
        }
    }

    public List b() {
        return this.f65420a;
    }

    /* access modifiers changed from: protected */
    public long f() {
        long j10 = 0;
        for (int i10 = 0; i10 < b().size(); i10++) {
            j10 += ((b) this.f65420a.get(i10)).getSize();
        }
        return j10;
    }

    public final void n(WritableByteChannel writableByteChannel) {
        for (b box : b()) {
            box.getBox(writableByteChannel);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.f65420a.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(this.f65420a.get(i10));
        }
        sb2.append("]");
        return sb2.toString();
    }
}
