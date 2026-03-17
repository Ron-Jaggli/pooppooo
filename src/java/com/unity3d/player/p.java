package com.unity3d.player;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class P implements InvocationHandler {
    private Runnable a;
    private UnityPlayer b;
    private long c;
    final /* synthetic */ long d;

    P(UnityPlayer unityPlayer, long j) {
        this.d = j;
        long j2 = ReflectionHelper.b;
        this.a = new T(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    private static Object a(Object obj, Method method, Object[] objArr, S s) {
        if (objArr == null) {
            try {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    D.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                    ReflectionHelper.nativeProxyLogJNIInvokeException(s.a);
                    s.a = 0L;
                    return null;
                }
            } finally {
                long j = s.a;
                if (j != 0) {
                    ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
                }
            }
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
    }

    protected void finalize() throws Throwable {
        this.b.invokeOnMainThread(this.a);
        super.finalize();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            D.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            Object objNativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(objNativeProxyInvoke instanceof S)) {
                return objNativeProxyInvoke;
            }
            S s = (S) objNativeProxyInvoke;
            if (s.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, s);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(s.a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }
}
