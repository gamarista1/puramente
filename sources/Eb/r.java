package Eb;

import java.util.Arrays;
import java.util.List;

public class r extends s {

    /* renamed from: a  reason: collision with root package name */
    private final List f50740a;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f50740a = list;
    }
}
