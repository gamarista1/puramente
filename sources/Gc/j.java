package gc;

public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f60622a;

        private a(int i10) {
            this.f60622a = i10;
        }

        public int b() {
            return this.f60622a;
        }
    }

    a b(String str);
}
