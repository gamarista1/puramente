package u7;

import Sg.m;
import com.amazon.device.simplesignin.a.a.a;
import com.facebook.I;
import com.facebook.S;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import mf.C6565s;
import o7.W;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.k;

/* renamed from: u7.e  reason: case insensitive filesystem */
public final class C4098e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4098e f48621a = new C4098e();

    private C4098e() {
    }

    public static final void d() {
        if (I.p()) {
            h();
        }
    }

    public static final File[] e() {
        File f10 = k.f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new C4097d());
        C6496s.g(listFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* access modifiers changed from: private */
    public static final boolean f(File file, String str) {
        C6496s.g(str, "name");
        U u10 = U.f71764a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        C6496s.g(format, "format(format, *args)");
        return new m(format).d(str);
    }

    public static final void g(String str) {
        try {
            new C4094a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (!W.b0()) {
            File[] e10 = e();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (File aVar : e10) {
                C4094a aVar2 = new C4094a(aVar);
                if (aVar2.d()) {
                    arrayList.add(aVar2);
                }
            }
            C6565s.C(arrayList, new C4095b());
            JSONArray jSONArray = new JSONArray();
            while (i10 < arrayList.size() && i10 < 1000) {
                jSONArray.put(arrayList.get(i10));
                i10++;
            }
            k.s("error_reports", jSONArray, new C4096c(arrayList));
        }
    }

    /* access modifiers changed from: private */
    public static final int i(C4094a aVar, C4094a aVar2) {
        C6496s.g(aVar2, "o2");
        return aVar.b(aVar2);
    }

    /* access modifiers changed from: private */
    public static final void j(ArrayList arrayList, S s10) {
        JSONObject d10;
        C6496s.h(arrayList, "$validReports");
        C6496s.h(s10, "response");
        try {
            if (s10.b() == null && (d10 = s10.d()) != null && d10.getBoolean(a.f38020s)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C4094a) it.next()).a();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
