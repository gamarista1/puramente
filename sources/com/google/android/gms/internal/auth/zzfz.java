package com.google.android.gms.internal.auth;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class zzfz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzfx zzfx, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzfx, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i10, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, zzb2);
            }
        } else {
            sb2.append(10);
            zzc(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzgx.zza(new zzec(((String) obj).getBytes(zzfa.zzb))));
                sb2.append('\"');
            } else if (obj instanceof zzef) {
                sb2.append(": \"");
                sb2.append(zzgx.zza((zzef) obj));
                sb2.append('\"');
            } else if (obj instanceof zzev) {
                sb2.append(" {");
                zzd((zzev) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                zzb(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
                zzb(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzfx zzfx, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        zzfx zzfx2 = zzfx;
        StringBuilder sb3 = sb2;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfx.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(b.au)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 4), zzev.zzg(method2, zzfx2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 3), zzev.zzg(method, zzfx2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey(b.au.concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzg = zzev.zzg(method4, zzfx2, new Object[0]);
                    if (method5 == null) {
                        if (zzg instanceof Boolean) {
                            if (!((Boolean) zzg).booleanValue()) {
                            }
                        } else if (zzg instanceof Integer) {
                            if (((Integer) zzg).intValue() == 0) {
                            }
                        } else if (zzg instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzg).floatValue()) == 0) {
                            }
                        } else if (!(zzg instanceof Double)) {
                            if (zzg instanceof String) {
                                z10 = zzg.equals("");
                            } else if (zzg instanceof zzef) {
                                z10 = zzg.equals(zzef.zzb);
                            } else if (zzg instanceof zzfx) {
                                if (zzg == ((zzfx) zzg).zze()) {
                                }
                            } else if ((zzg instanceof Enum) && ((Enum) zzg).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzg).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzev.zzg(method5, zzfx2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb3, i12, substring, zzg);
                }
            }
            i11 = 3;
        }
        if (!(zzfx2 instanceof zzeu)) {
            zzha zzha = ((zzev) zzfx2).zzc;
            if (zzha != null) {
                zzha.zzg(sb3, i12);
                return;
            }
            return;
        }
        zzeu zzeu = (zzeu) zzfx2;
        throw null;
    }
}
