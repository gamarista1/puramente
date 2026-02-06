package Lb;

import Ob.l;
import Qb.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class I implements j {

    /* renamed from: b  reason: collision with root package name */
    private static I f51712b = new I();

    /* renamed from: a  reason: collision with root package name */
    final HashMap f51713a = new HashMap();

    private I() {
    }

    public static I b() {
        return f51712b;
    }

    private void d(C4375i iVar) {
        synchronized (this.f51713a) {
            try {
                List list = (List) this.f51713a.get(iVar);
                boolean z10 = true;
                int i10 = 0;
                int i11 = 0;
                if (list != null) {
                    while (true) {
                        if (i11 >= list.size()) {
                            i11 = 0;
                            break;
                        } else if (list.get(i11) == iVar) {
                            list.remove(i11);
                            i11 = 1;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (list.isEmpty()) {
                        this.f51713a.remove(iVar);
                    }
                }
                if (i11 == 0) {
                    if (iVar.g()) {
                        z10 = false;
                    }
                }
                l.f(z10);
                if (!iVar.e().f()) {
                    C4375i a10 = iVar.a(i.a(iVar.e().e()));
                    List list2 = (List) this.f51713a.get(a10);
                    if (list2 != null) {
                        while (true) {
                            if (i10 >= list2.size()) {
                                break;
                            } else if (list2.get(i10) == iVar) {
                                list2.remove(i10);
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (list2.isEmpty()) {
                            this.f51713a.remove(a10);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(C4375i iVar) {
        d(iVar);
    }

    public void c(C4375i iVar) {
        synchronized (this.f51713a) {
            try {
                List list = (List) this.f51713a.get(iVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f51713a.put(iVar, list);
                }
                list.add(iVar);
                if (!iVar.e().f()) {
                    C4375i a10 = iVar.a(i.a(iVar.e().e()));
                    List list2 = (List) this.f51713a.get(a10);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        this.f51713a.put(a10, list2);
                    }
                    list2.add(iVar);
                }
                iVar.j(true);
                iVar.k(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(C4375i iVar) {
        synchronized (this.f51713a) {
            try {
                List list = (List) this.f51713a.get(iVar);
                if (list != null && !list.isEmpty()) {
                    if (iVar.e().f()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            C4375i iVar2 = (C4375i) list.get(size);
                            if (!hashSet.contains(iVar2.e())) {
                                hashSet.add(iVar2.e());
                                iVar2.l();
                            }
                        }
                    } else {
                        ((C4375i) list.get(0)).l();
                    }
                }
            } finally {
            }
        }
    }
}
