package com.gameanalytics.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GooglePlayServicesClient {

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
     */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean limitAdTrackingEnabled;

        GooglePlayServicesInfo(String gpdAdid, Boolean limitAdTrackingEnabled) {
            this.gpsAdid = gpdAdid;
            this.limitAdTrackingEnabled = limitAdTrackingEnabled;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        GooglePlayServicesConnection googlePlayServicesConnection = new GooglePlayServicesConnection();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (context.bindService(intent, googlePlayServicesConnection, 1)) {
                try {
                    GooglePlayServicesInterface googlePlayServicesInterface = new GooglePlayServicesInterface(googlePlayServicesConnection.getBinder());
                    return new GooglePlayServicesInfo(googlePlayServicesInterface.getGpsAdid(), googlePlayServicesInterface.getTrackingEnabled(true));
                } catch (Exception e) {
                    throw e;
                }
            }
            throw new IOException("Google Play connection failed");
        } finally {
            context.unbindService(googlePlayServicesConnection);
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
     */
    private static final class GooglePlayServicesConnection implements ServiceConnection {
        private final LinkedBlockingQueue<IBinder> queue;
        boolean retrieved;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
        }

        private GooglePlayServicesConnection() {
            this.retrieved = false;
            this.queue = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            try {
                this.queue.put(service);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder getBinder() throws InterruptedException {
            if (this.retrieved) {
                throw new IllegalStateException();
            }
            this.retrieved = true;
            return this.queue.take();
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
     */
    private static final class GooglePlayServicesInterface implements IInterface {
        private IBinder binder;

        public GooglePlayServicesInterface(IBinder pBinder) {
            this.binder = pBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public String getGpsAdid() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public Boolean getTrackingEnabled(boolean z) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                parcelObtain.writeInt(z ? 1 : 0);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (boolValueOf != null) {
                    return boolValueOf;
                }
                return null;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
