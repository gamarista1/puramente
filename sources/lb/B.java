package Lb;

import java.util.concurrent.ExecutorService;

public interface B {

    public interface a {
        void a(String str);

        void b(String str);
    }

    public interface b {
        void a(String str);
    }

    void a(boolean z10, a aVar);

    void b(ExecutorService executorService, b bVar);
}
