package N5;

import N5.f;

public class c implements j {

    class a implements i {
        a() {
        }

        /* renamed from: a */
        public int compare(f.a aVar, f.a aVar2) {
            long a10 = aVar.a();
            long a11 = aVar2.a();
            if (a10 < a11) {
                return -1;
            }
            if (a11 == a10) {
                return 0;
            }
            return 1;
        }
    }

    public i get() {
        return new a();
    }
}
