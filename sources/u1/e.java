package u1;

import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class e {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, i iVar) {
            configuration.setLocales((LocaleList) iVar.i());
        }
    }

    public static i a(Configuration configuration) {
        return i.j(a.a(configuration));
    }

    public static void b(Configuration configuration, i iVar) {
        a.b(configuration, iVar);
    }
}
