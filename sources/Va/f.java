package va;

import Ba.C4246a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C4509v;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p001authapi.zbau;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class f implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final C4246a f61726c = new C4246a("RevokeAccessOperation", new String[0]);

    /* renamed from: a  reason: collision with root package name */
    private final String f61727a;

    /* renamed from: b  reason: collision with root package name */
    private final C4509v f61728b = new C4509v((com.google.android.gms.common.api.f) null);

    public f(String str) {
        this.f61727a = C4536s.f(str);
    }

    public static h a(String str) {
        if (str == null) {
            return i.a(new Status(4), (com.google.android.gms.common.api.f) null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f61728b;
    }

    public final void run() {
        Status status = Status.f53909h;
        try {
            String str = this.f61727a;
            URL url = new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str);
            int i10 = zbau.zbb;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f53907f;
            } else {
                f61726c.c("Unable to revoke access!", new Object[0]);
            }
            C4246a aVar = f61726c;
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f61726c.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f61726c.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f61728b.setResult(status);
    }
}
