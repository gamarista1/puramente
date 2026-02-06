package jg;

import Ef.i;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kg.C6434a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.L;

/* renamed from: jg.a  reason: case insensitive filesystem */
public final class C6429a extends C6434a {

    /* renamed from: g  reason: collision with root package name */
    public static final C1022a f71504g = new C1022a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final C6429a f71505h = new C6429a(1, 0, 7);

    /* renamed from: i  reason: collision with root package name */
    public static final C6429a f71506i = new C6429a(new int[0]);

    /* renamed from: jg.a$a  reason: collision with other inner class name */
    public static final class C1022a {
        public /* synthetic */ C1022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6429a a(InputStream inputStream) {
            C6496s.h(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            i iVar = new i(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C6565s.y(iVar, 10));
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                ((L) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] d12 = C6565s.d1(arrayList);
            return new C6429a(Arrays.copyOf(d12, d12.length));
        }

        private C1022a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6429a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C6496s.h(iArr, "numbers");
    }

    public boolean h() {
        return f(f71505h);
    }
}
