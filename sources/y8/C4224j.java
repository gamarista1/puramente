package y8;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C3452c;
import com.facebook.soloader.C3455f;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import java.io.IOException;

/* renamed from: y8.j  reason: case insensitive filesystem */
public class C4224j implements C4222h {

    /* renamed from: a  reason: collision with root package name */
    private int f49883a;

    public C4224j(int i10) {
        this.f49883a = i10;
    }

    private boolean b(E[] eArr, String str) {
        int length = eArr.length;
        int i10 = 0;
        while (i10 < length) {
            C3452c cVar = eArr[i10];
            if (!(cVar instanceof C3452c)) {
                i10++;
            } else {
                C3452c cVar2 = cVar;
                try {
                    p.b("SoLoader", "Preparing BackupSoSource for the first time " + cVar2.c());
                    cVar2.e(0);
                    for (C3455f fVar : eArr) {
                        if ((fVar instanceof C3455f) && !(fVar instanceof C3452c)) {
                            fVar.h();
                        }
                    }
                    return true;
                } catch (Exception e10) {
                    p.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + cVar2.c() + " for library " + str + ": ", e10);
                }
            }
        }
        return false;
    }

    private void c(Error error, String str) {
        p.b("SoLoader", "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    private boolean d(E[] eArr, String str, int i10) {
        try {
            for (C3452c cVar : eArr) {
                if (cVar instanceof C3452c) {
                    if (cVar.x(str, i10)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (IOException e10) {
            p.b("SoLoader", "Failed to run recovery for backup so source due to: " + e10);
            return false;
        }
    }

    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        C c10 = (C) unsatisfiedLinkError;
        String a10 = c10.a();
        String message = c10.getMessage();
        if (a10 == null) {
            p.b("SoLoader", "No so name provided in ULE, cannot recover");
            return false;
        } else if (c10 instanceof B) {
            if ((this.f49883a & 1) == 0) {
                return false;
            }
            c(c10, a10);
            return d(eArr, a10, 0);
        } else if (message == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        } else {
            c(c10, a10);
            return b(eArr, a10);
        }
    }
}
