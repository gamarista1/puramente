package Jb;

import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Map;

public interface h {

    public interface a {
        void a(List list, Object obj, boolean z10, Long l10);

        void b(boolean z10);

        void c(Map map);

        void d(List list, List list2, Long l10);

        void onConnect();

        void onDisconnect();
    }

    void a(List list, Object obj, p pVar);

    void b(List list, Map map, p pVar);

    void c(List list, Map map, p pVar);

    void e(List list, Map map, g gVar, Long l10, p pVar);

    void g(List list, Map map);

    Task h(List list, Map map);

    void i(List list, p pVar);

    void initialize();

    void j(List list, Object obj, String str, p pVar);

    void k(String str);

    void l(List list, Object obj, p pVar);

    void n(String str);

    void p(String str);

    void r(String str);
}
