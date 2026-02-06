package S3;

import P3.i;
import P3.j;
import P3.o;
import P3.u;
import P3.x;
import P3.z;
import androidx.work.s;
import com.amazon.a.a.o.b.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

public abstract class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f5907a;

    static {
        String i10 = s.i("DiagnosticsWrkr");
        C6496s.g(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f5907a = i10;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return 10 + uVar.f5091a + "\t " + uVar.f5093c + "\t " + num + "\t " + uVar.f5092b.name() + "\t " + str + "\t " + str2 + 9;
    }

    /* access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List list) {
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            i a10 = jVar.a(x.a(uVar));
            if (a10 != null) {
                num = Integer.valueOf(a10.f5064c);
            } else {
                num = null;
            }
            sb2.append(c(uVar, C6565s.x0(oVar.a(uVar.f5091a), f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null), num, C6565s.x0(zVar.a(uVar.f5091a), f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null)));
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
