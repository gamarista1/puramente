package y8;

import android.content.Context;
import com.facebook.soloader.C;
import com.facebook.soloader.C3452c;
import com.facebook.soloader.C3455f;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* renamed from: y8.c  reason: case insensitive filesystem */
public class C4217c implements C4222h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49874a;

    public C4217c(Context context) {
        this.f49874a = context;
    }

    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f49874a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = eArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            C3452c cVar = eArr[i10];
            if (!(cVar instanceof C3452c)) {
                i10++;
            } else {
                C3452c cVar2 = cVar;
                try {
                    for (G.c cVar3 : cVar2.o()) {
                        if (!new File(file, cVar3.f42489a).exists()) {
                            arrayList.add(cVar3.f42489a);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        p.b("SoLoader", "No libraries missing from " + file);
                        return false;
                    }
                    p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                    cVar2.e(0);
                } catch (Exception e10) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e10);
                    return false;
                }
            }
        }
        for (C3455f fVar : eArr) {
            if ((fVar instanceof C3455f) && !(fVar instanceof C3452c)) {
                fVar.h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
